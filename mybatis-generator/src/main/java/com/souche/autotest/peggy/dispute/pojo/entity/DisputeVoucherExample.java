package com.souche.autotest.peggy.dispute.pojo.entity;

import java.util.ArrayList;
import java.util.List;

public class DisputeVoucherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DisputeVoucherExample() {
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

        public Criteria andVoucherIdIsNull() {
            addCriterion("dis_vou.c_voucher_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIsNotNull() {
            addCriterion("dis_vou.c_voucher_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdEqualTo(Long value) {
            addCriterion("dis_vou.c_voucher_id =", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotEqualTo(Long value) {
            addCriterion("dis_vou.c_voucher_id <>", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThan(Long value) {
            addCriterion("dis_vou.c_voucher_id >", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dis_vou.c_voucher_id >=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThan(Long value) {
            addCriterion("dis_vou.c_voucher_id <", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThanOrEqualTo(Long value) {
            addCriterion("dis_vou.c_voucher_id <=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIn(List<Long> values) {
            addCriterion("dis_vou.c_voucher_id in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotIn(List<Long> values) {
            addCriterion("dis_vou.c_voucher_id not in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdBetween(Long value1, Long value2) {
            addCriterion("dis_vou.c_voucher_id between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotBetween(Long value1, Long value2) {
            addCriterion("dis_vou.c_voucher_id not between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("dis_vou.c_order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("dis_vou.c_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("dis_vou.c_order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("dis_vou.c_order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("dis_vou.c_order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("dis_vou.c_order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("dis_vou.c_order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("dis_vou.c_order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("dis_vou.c_order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("dis_vou.c_order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("dis_vou.c_order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("dis_vou.c_order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("dis_vou.c_order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("dis_vou.c_order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeIsNull() {
            addCriterion("dis_vou.c_sponsor_side_code is null");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeIsNotNull() {
            addCriterion("dis_vou.c_sponsor_side_code is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeEqualTo(String value) {
            addCriterion("dis_vou.c_sponsor_side_code =", value, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeNotEqualTo(String value) {
            addCriterion("dis_vou.c_sponsor_side_code <>", value, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeGreaterThan(String value) {
            addCriterion("dis_vou.c_sponsor_side_code >", value, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dis_vou.c_sponsor_side_code >=", value, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeLessThan(String value) {
            addCriterion("dis_vou.c_sponsor_side_code <", value, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeLessThanOrEqualTo(String value) {
            addCriterion("dis_vou.c_sponsor_side_code <=", value, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeLike(String value) {
            addCriterion("dis_vou.c_sponsor_side_code like", value, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeNotLike(String value) {
            addCriterion("dis_vou.c_sponsor_side_code not like", value, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeIn(List<String> values) {
            addCriterion("dis_vou.c_sponsor_side_code in", values, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeNotIn(List<String> values) {
            addCriterion("dis_vou.c_sponsor_side_code not in", values, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeBetween(String value1, String value2) {
            addCriterion("dis_vou.c_sponsor_side_code between", value1, value2, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeNotBetween(String value1, String value2) {
            addCriterion("dis_vou.c_sponsor_side_code not between", value1, value2, "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeIsNull() {
            addCriterion("dis_vou.c_sponsor_client_code is null");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeIsNotNull() {
            addCriterion("dis_vou.c_sponsor_client_code is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeEqualTo(String value) {
            addCriterion("dis_vou.c_sponsor_client_code =", value, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeNotEqualTo(String value) {
            addCriterion("dis_vou.c_sponsor_client_code <>", value, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeGreaterThan(String value) {
            addCriterion("dis_vou.c_sponsor_client_code >", value, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dis_vou.c_sponsor_client_code >=", value, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeLessThan(String value) {
            addCriterion("dis_vou.c_sponsor_client_code <", value, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeLessThanOrEqualTo(String value) {
            addCriterion("dis_vou.c_sponsor_client_code <=", value, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeLike(String value) {
            addCriterion("dis_vou.c_sponsor_client_code like", value, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeNotLike(String value) {
            addCriterion("dis_vou.c_sponsor_client_code not like", value, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeIn(List<String> values) {
            addCriterion("dis_vou.c_sponsor_client_code in", values, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeNotIn(List<String> values) {
            addCriterion("dis_vou.c_sponsor_client_code not in", values, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeBetween(String value1, String value2) {
            addCriterion("dis_vou.c_sponsor_client_code between", value1, value2, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeNotBetween(String value1, String value2) {
            addCriterion("dis_vou.c_sponsor_client_code not between", value1, value2, "sponsorClientCode");
            return (Criteria) this;
        }

        public Criteria andOrderNoLikeInsensitive(String value) {
            addCriterion("upper(dis_vou.c_order_no) like", value.toUpperCase(), "orderNo");
            return (Criteria) this;
        }

        public Criteria andSponsorSideCodeLikeInsensitive(String value) {
            addCriterion("upper(dis_vou.c_sponsor_side_code) like", value.toUpperCase(), "sponsorSideCode");
            return (Criteria) this;
        }

        public Criteria andSponsorClientCodeLikeInsensitive(String value) {
            addCriterion("upper(dis_vou.c_sponsor_client_code) like", value.toUpperCase(), "sponsorClientCode");
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