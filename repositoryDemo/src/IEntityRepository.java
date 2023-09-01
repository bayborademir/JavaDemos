public interface IEntityRepository <T extends IEntity>{
    void add(T entitiy);
    void delete(T entity);
    void update(T entity);
}
