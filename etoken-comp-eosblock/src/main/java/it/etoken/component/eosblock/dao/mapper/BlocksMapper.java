package it.etoken.component.eosblock.dao.mapper;

import it.etoken.base.model.eosblock.entity.Blocks;
import it.etoken.base.model.eosblock.entity.BlocksExample;
import it.etoken.component.eosblock.dao.provider.BlocksSqlProvider;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface BlocksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @SelectProvider(type=BlocksSqlProvider.class, method="countByExample")
    long countByExample(BlocksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @DeleteProvider(type=BlocksSqlProvider.class, method="deleteByExample")
    int deleteByExample(BlocksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @Delete({
        "delete from blocks",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @Insert({
        "insert into blocks (id, block_number, ",
        "prev_block_id, irreversible, ",
        "timestamp, transaction_merkle_root, ",
        "action_merkle_root, producer, ",
        "version, new_producers, ",
        "num_transactions, confirmed)",
        "values (#{id,jdbcType=VARCHAR}, #{blockNumber,jdbcType=INTEGER}, ",
        "#{prevBlockId,jdbcType=VARCHAR}, #{irreversible,jdbcType=BIT}, ",
        "#{timestamp,jdbcType=TIMESTAMP}, #{transactionMerkleRoot,jdbcType=VARCHAR}, ",
        "#{actionMerkleRoot,jdbcType=VARCHAR}, #{producer,jdbcType=VARCHAR}, ",
        "#{version,jdbcType=INTEGER}, #{newProducers,jdbcType=CHAR}, ",
        "#{numTransactions,jdbcType=INTEGER}, #{confirmed,jdbcType=INTEGER})"
    })
    int insert(Blocks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @InsertProvider(type=BlocksSqlProvider.class, method="insertSelective")
    int insertSelective(Blocks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @SelectProvider(type=BlocksSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="block_number", property="blockNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="prev_block_id", property="prevBlockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="irreversible", property="irreversible", jdbcType=JdbcType.BIT),
        @Result(column="timestamp", property="timestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="transaction_merkle_root", property="transactionMerkleRoot", jdbcType=JdbcType.VARCHAR),
        @Result(column="action_merkle_root", property="actionMerkleRoot", jdbcType=JdbcType.VARCHAR),
        @Result(column="producer", property="producer", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="new_producers", property="newProducers", jdbcType=JdbcType.CHAR),
        @Result(column="num_transactions", property="numTransactions", jdbcType=JdbcType.INTEGER),
        @Result(column="confirmed", property="confirmed", jdbcType=JdbcType.INTEGER)
    })
    List<Blocks> selectByExample(BlocksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @Select({
        "select",
        "id, block_number, prev_block_id, irreversible, timestamp, transaction_merkle_root, ",
        "action_merkle_root, producer, version, new_producers, num_transactions, confirmed",
        "from blocks",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="block_number", property="blockNumber", jdbcType=JdbcType.INTEGER),
        @Result(column="prev_block_id", property="prevBlockId", jdbcType=JdbcType.VARCHAR),
        @Result(column="irreversible", property="irreversible", jdbcType=JdbcType.BIT),
        @Result(column="timestamp", property="timestamp", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="transaction_merkle_root", property="transactionMerkleRoot", jdbcType=JdbcType.VARCHAR),
        @Result(column="action_merkle_root", property="actionMerkleRoot", jdbcType=JdbcType.VARCHAR),
        @Result(column="producer", property="producer", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.INTEGER),
        @Result(column="new_producers", property="newProducers", jdbcType=JdbcType.CHAR),
        @Result(column="num_transactions", property="numTransactions", jdbcType=JdbcType.INTEGER),
        @Result(column="confirmed", property="confirmed", jdbcType=JdbcType.INTEGER)
    })
    Blocks selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @UpdateProvider(type=BlocksSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Blocks record, @Param("example") BlocksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @UpdateProvider(type=BlocksSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Blocks record, @Param("example") BlocksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @UpdateProvider(type=BlocksSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Blocks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blocks
     *
     * @mbg.generated Tue Jul 10 16:13:42 CST 2018
     */
    @Update({
        "update blocks",
        "set block_number = #{blockNumber,jdbcType=INTEGER},",
          "prev_block_id = #{prevBlockId,jdbcType=VARCHAR},",
          "irreversible = #{irreversible,jdbcType=BIT},",
          "timestamp = #{timestamp,jdbcType=TIMESTAMP},",
          "transaction_merkle_root = #{transactionMerkleRoot,jdbcType=VARCHAR},",
          "action_merkle_root = #{actionMerkleRoot,jdbcType=VARCHAR},",
          "producer = #{producer,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=INTEGER},",
          "new_producers = #{newProducers,jdbcType=CHAR},",
          "num_transactions = #{numTransactions,jdbcType=INTEGER},",
          "confirmed = #{confirmed,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Blocks record);
}