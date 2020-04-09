package com.souche.autotest.peggy.dispute.pojo.entity;

import java.util.ArrayList;
import java.util.List;

public class LaunchPlatformDisputeCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LaunchPlatformDisputeCaseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("lau_plat_dis_case.c_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("lau_plat_dis_case.c_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("lau_plat_dis_case.c_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("lau_plat_dis_case.c_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("lau_plat_dis_case.c_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lau_plat_dis_case.c_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("lau_plat_dis_case.c_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("lau_plat_dis_case.c_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("lau_plat_dis_case.c_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("lau_plat_dis_case.c_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("lau_plat_dis_case.c_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("lau_plat_dis_case.c_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceIsNull() {
            addCriterion("lau_plat_dis_case.c_biz_auth_source is null");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceIsNotNull() {
            addCriterion("lau_plat_dis_case.c_biz_auth_source is not null");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceEqualTo(String value) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source =", value, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceNotEqualTo(String value) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source <>", value, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceGreaterThan(String value) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source >", value, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceGreaterThanOrEqualTo(String value) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source >=", value, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceLessThan(String value) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source <", value, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceLessThanOrEqualTo(String value) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source <=", value, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceLike(String value) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source like", value, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceNotLike(String value) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source not like", value, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceIn(List<String> values) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source in", values, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceNotIn(List<String> values) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source not in", values, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceBetween(String value1, String value2) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source between", value1, value2, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceNotBetween(String value1, String value2) {
            addCriterion("lau_plat_dis_case.c_biz_auth_source not between", value1, value2, "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIsNull() {
            addCriterion("lau_plat_dis_case.c_voucher_id is null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIsNotNull() {
            addCriterion("lau_plat_dis_case.c_voucher_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherIdEqualTo(Long value) {
            addCriterion("lau_plat_dis_case.c_voucher_id =", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotEqualTo(Long value) {
            addCriterion("lau_plat_dis_case.c_voucher_id <>", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThan(Long value) {
            addCriterion("lau_plat_dis_case.c_voucher_id >", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lau_plat_dis_case.c_voucher_id >=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThan(Long value) {
            addCriterion("lau_plat_dis_case.c_voucher_id <", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdLessThanOrEqualTo(Long value) {
            addCriterion("lau_plat_dis_case.c_voucher_id <=", value, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdIn(List<Long> values) {
            addCriterion("lau_plat_dis_case.c_voucher_id in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotIn(List<Long> values) {
            addCriterion("lau_plat_dis_case.c_voucher_id not in", values, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdBetween(Long value1, Long value2) {
            addCriterion("lau_plat_dis_case.c_voucher_id between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andVoucherIdNotBetween(Long value1, Long value2) {
            addCriterion("lau_plat_dis_case.c_voucher_id not between", value1, value2, "voucherId");
            return (Criteria) this;
        }

        public Criteria andExpectedIsNull() {
            addCriterion("lau_plat_dis_case.c_expected is null");
            return (Criteria) this;
        }

        public Criteria andExpectedIsNotNull() {
            addCriterion("lau_plat_dis_case.c_expected is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedEqualTo(String value) {
            addCriterion("lau_plat_dis_case.c_expected =", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotEqualTo(String value) {
            addCriterion("lau_plat_dis_case.c_expected <>", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedGreaterThan(String value) {
            addCriterion("lau_plat_dis_case.c_expected >", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedGreaterThanOrEqualTo(String value) {
            addCriterion("lau_plat_dis_case.c_expected >=", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedLessThan(String value) {
            addCriterion("lau_plat_dis_case.c_expected <", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedLessThanOrEqualTo(String value) {
            addCriterion("lau_plat_dis_case.c_expected <=", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedLike(String value) {
            addCriterion("lau_plat_dis_case.c_expected like", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotLike(String value) {
            addCriterion("lau_plat_dis_case.c_expected not like", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedIn(List<String> values) {
            addCriterion("lau_plat_dis_case.c_expected in", values, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotIn(List<String> values) {
            addCriterion("lau_plat_dis_case.c_expected not in", values, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedBetween(String value1, String value2) {
            addCriterion("lau_plat_dis_case.c_expected between", value1, value2, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotBetween(String value1, String value2) {
            addCriterion("lau_plat_dis_case.c_expected not between", value1, value2, "expected");
            return (Criteria) this;
        }

        public Criteria andBizAuthSourceLikeInsensitive(String value) {
            addCriterion("upper(lau_plat_dis_case.c_biz_auth_source) like", value.toUpperCase(), "bizAuthSource");
            return (Criteria) this;
        }

        public Criteria andExpectedLikeInsensitive(String value) {
            addCriterion("upper(lau_plat_dis_case.c_expected) like", value.toUpperCase(), "expected");
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