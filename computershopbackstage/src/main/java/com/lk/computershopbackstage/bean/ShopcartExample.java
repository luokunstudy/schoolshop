package com.lk.computershopbackstage.bean;

import java.util.ArrayList;
import java.util.List;

public class ShopcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopcartExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCartIdIsNull() {
            addCriterion("Cart_Id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("Cart_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Integer value) {
            addCriterion("Cart_Id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Integer value) {
            addCriterion("Cart_Id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Integer value) {
            addCriterion("Cart_Id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Cart_Id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Integer value) {
            addCriterion("Cart_Id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("Cart_Id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Integer> values) {
            addCriterion("Cart_Id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Integer> values) {
            addCriterion("Cart_Id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Integer value1, Integer value2) {
            addCriterion("Cart_Id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Cart_Id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("Account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("Account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("Account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("Account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("Account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("Account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("Account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("Account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("Account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("Account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("Account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("Account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("Account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("Account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("Goods_Id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("Goods_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("Goods_Id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("Goods_Id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("Goods_Id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_Id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("Goods_Id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_Id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("Goods_Id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("Goods_Id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("Account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("Account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("Account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("Account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("Account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("Account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("Account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("Account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("Account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("Account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}