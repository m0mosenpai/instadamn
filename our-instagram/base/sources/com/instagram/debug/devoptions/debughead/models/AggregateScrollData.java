package com.instagram.debug.devoptions.debughead.models;

import X.AbstractC166987dD;
import X.AbstractC167027dH;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class AggregateScrollData {
    public static final String UTILIZATION_FIELD = "utilization";
    public float mAvg1Drop;
    public float mAvg4Drop;
    public float mAvgUtil;
    public String mContainer;
    public double mFDPM;
    public double mLFDPM;
    public float mMax1Drop;
    public float mMax4Drop;
    public float mMaxUtil;
    public float mMin1Drop;
    public float mMin4Drop;
    public float mMinUtil;
    public final List mScrollData = AbstractC166987dD.A1E();
    public float mSum1Drop;
    public float mSum4Drop;
    public float mSumUtil;
    public float mTotalTimeSpent;

    private void calculateAverage() {
        if (!this.mScrollData.isEmpty()) {
            ScrollPerfData scrollPerfData = (ScrollPerfData) this.mScrollData.get(r1.size() - 1);
            this.mSumUtil += AbstractC166987dD.A09(scrollPerfData.getFieldValue(UTILIZATION_FIELD));
            float f = this.mSum1Drop;
            List list = ScrollPerfData.SCROLL_PERF_FIELDS;
            this.mSum1Drop = f + AbstractC166987dD.A0H(scrollPerfData.getFieldValue((String) list.get(2)));
            this.mSum4Drop += AbstractC166987dD.A09(scrollPerfData.getFieldValue((String) list.get(3)));
            this.mAvgUtil = this.mSumUtil / this.mScrollData.size();
            this.mAvg1Drop = this.mSum1Drop / this.mScrollData.size();
            this.mAvg4Drop = this.mSum4Drop / this.mScrollData.size();
        }
    }

    private void calculateMax() {
        if (!this.mScrollData.isEmpty()) {
            ScrollPerfData scrollPerfData = (ScrollPerfData) this.mScrollData.get(r1.size() - 1);
            scrollPerfData.getFieldValue(UTILIZATION_FIELD);
            float A09 = AbstractC166987dD.A09(scrollPerfData.getFieldValue(UTILIZATION_FIELD));
            if (A09 > this.mMaxUtil) {
                this.mMaxUtil = A09;
            }
            List list = ScrollPerfData.SCROLL_PERF_FIELDS;
            float intValue = AbstractC167027dH.A0N(scrollPerfData, list, 2).intValue();
            if (intValue > this.mMax1Drop) {
                this.mMax1Drop = intValue;
            }
            float floatValue = AbstractC167027dH.A0N(scrollPerfData, list, 3).floatValue();
            if (floatValue > this.mMax4Drop) {
                this.mMax4Drop = floatValue;
            }
        }
    }

    private void calculateMin() {
        if (!this.mScrollData.isEmpty()) {
            List list = this.mScrollData;
            ScrollPerfData scrollPerfData = (ScrollPerfData) list.get(list.size() - 1);
            scrollPerfData.getFieldValue(UTILIZATION_FIELD);
            float A09 = AbstractC166987dD.A09(scrollPerfData.getFieldValue(UTILIZATION_FIELD));
            if (this.mScrollData.size() == 1 || A09 < this.mMinUtil) {
                this.mMinUtil = A09;
            }
            List list2 = ScrollPerfData.SCROLL_PERF_FIELDS;
            int intValue = AbstractC167027dH.A0N(scrollPerfData, list2, 2).intValue();
            if (this.mScrollData.size() == 1 || intValue < this.mMin1Drop) {
                this.mMin1Drop = intValue;
            }
            float floatValue = AbstractC167027dH.A0N(scrollPerfData, list2, 3).floatValue();
            if (this.mScrollData.size() == 1 || floatValue < this.mMin4Drop) {
                this.mMin4Drop = floatValue;
            }
        }
    }

    private void calculatePerMin() {
        if (!this.mScrollData.isEmpty()) {
            this.mTotalTimeSpent = this.mTotalTimeSpent + ((float) AbstractC166987dD.A0N(((ScrollPerfData) this.mScrollData.get(r1.size() - 1)).getFieldValue((String) ScrollPerfData.SCROLL_PERF_FIELDS.get(5))));
            double d = this.mSum1Drop;
            TimeUnit timeUnit = TimeUnit.MINUTES;
            this.mFDPM = d / (r8 / ((float) timeUnit.toMillis(1L)));
            this.mLFDPM = this.mSum4Drop / (this.mTotalTimeSpent / ((float) timeUnit.toMillis(1L)));
        }
    }

    public void addItem(ScrollPerfData scrollPerfData) {
        List list = ScrollPerfData.SCROLL_PERF_FIELDS;
        if (!scrollPerfData.getFieldValue((String) list.get(1)).equals(this.mContainer) && !this.mScrollData.isEmpty()) {
            clear();
        }
        this.mScrollData.add(scrollPerfData);
        calculateAverage();
        calculateMin();
        calculateMax();
        calculatePerMin();
        if (this.mScrollData.size() == 1) {
            this.mContainer = scrollPerfData.getFieldValue((String) list.get(1)).toString();
        }
    }

    public void clear() {
        this.mScrollData.clear();
        AbstractC167027dH.A11(this);
    }

    public float getAvg1Drop() {
        return this.mAvg1Drop;
    }

    public float getAvg4Drop() {
        return this.mAvg4Drop;
    }

    public float getAvgUtil() {
        return this.mAvgUtil;
    }

    public String getContainer() {
        return this.mContainer;
    }

    public int getCount() {
        return this.mScrollData.size();
    }

    public double getFDPM() {
        return this.mFDPM;
    }

    public double getLFDPM() {
        return this.mLFDPM;
    }

    public float getMax1Drop() {
        return this.mMax1Drop;
    }

    public float getMax4Drop() {
        return this.mMax4Drop;
    }

    public float getMaxUtil() {
        return this.mMaxUtil;
    }

    public float getMin1Drop() {
        return this.mMin1Drop;
    }

    public float getMin4Drop() {
        return this.mMin4Drop;
    }

    public float getMinUtil() {
        return this.mMinUtil;
    }

    public double getSum4Drop() {
        return this.mSum4Drop;
    }

    public float getTotalTimeSpent() {
        return this.mTotalTimeSpent;
    }

    public AggregateScrollData() {
        AbstractC167027dH.A11(this);
        this.mFDPM = 0.0d;
        this.mLFDPM = 0.0d;
    }
}
