package builder;

public interface QueryBuilder {
    public abstract QueryBuilder select();

    public abstract QueryBuilder delete();

    public abstract QueryBuilder update();

    public abstract QueryBuilder fromSourceTable(String source);

    public abstract QueryBuilder equal(String column, String value);

    public abstract QueryBuilder and();

    public abstract QueryBuilder or();

    public abstract String build();

}
