package org.apache.karaf.boot.jpa;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.apache.karaf.boot.jpa.PersistentUnit.ProviderProperty;

public interface Hibernate {

    @ProviderProperty("hibernate.query.substitutions")
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.SOURCE)
    @interface QuerySubstitutions {
        String value();
    }

    @ProviderProperty("hibernate.hbm2ddl.auto")
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.SOURCE)
    @interface Hbm2DdlAuto {
        Hbm2DdlAutoType value();
    }

    @ProviderProperty("hibernate.dialect")
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.SOURCE)
    @interface Dialect {
        DialectType value();
    }

    enum DialectType {
        Cache71,
        DataDirectOracle9,
        DB2390,
        DB2400,
        DB2,
        Derby,
        Firebird,
        FrontBase,
        H2,
        HSQL,
        Informix,
        Ingres10,
        Ingres9,
        Ingres,
        Interbase,
        JDataStore,
        Mckoi,
        MimerSQL,
        MySQL5,
        MySQL5InnoDB,
        MySQL,
        MySQLInnoDB,
        MySQLMyISAM,
        Oracle10g,
        Oracle8i,
        Oracle9,
        Oracle9i,
        Oracle,
        Pointbase,
        PostgresPlus,
        PostgreSQL,
        Progress,
        RDMSOS2200,
        SAPDB,
        SQLServer2008,
        SQLServer,
        Sybase11,
        SybaseAnywhere,
        SybaseASE15,
        Sybase,
        Teradata,
        TimesTen;

        public String toString() {
            return "org.hibernate.dialect." + super.toString() + "Dialect";
        }
    }

    enum Hbm2DdlAutoType {
        Validate,
        Update,
        Create,
        CreateDrop;

        public String toString() {
            return super.toString().toLowerCase();
        }
    }

}
