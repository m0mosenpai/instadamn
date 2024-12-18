package com.facebook.papaya.mldw;

import X.AbstractC166987dD;
import X.C09170dP;
import X.EnumC72389XcP;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class DataValue {
    public static final DataValue $redex_init_class = null;
    public EnumC72389XcP mDataType;
    public Float mFloatValue;
    public Long mIntValue;
    public boolean mIsNull;
    public String mStringValue;

    static {
        C09170dP.A0C("papaya-mldw");
    }

    private void checkType(EnumC72389XcP enumC72389XcP) {
        EnumC72389XcP enumC72389XcP2 = this.mDataType;
        if (enumC72389XcP2 == enumC72389XcP) {
        } else {
            throw AbstractC166987dD.A18(String.format(Locale.US, "Trying to access %s as %s!", enumC72389XcP2.toString(), enumC72389XcP.toString()));
        }
    }

    private int getDataTypeValue() {
        if (!this.mIsNull) {
            return this.mDataType.A00;
        }
        throw AbstractC166987dD.A18("The data value is null!");
    }

    public float getFloatValue() {
        if (!this.mIsNull) {
            checkType(EnumC72389XcP.A03);
            Float f = this.mFloatValue;
            f.getClass();
            return f.floatValue();
        }
        throw AbstractC166987dD.A18("The data value is null!");
    }

    public long getIntValue() {
        if (!this.mIsNull) {
            checkType(EnumC72389XcP.A04);
            Long l = this.mIntValue;
            l.getClass();
            return l.longValue();
        }
        throw AbstractC166987dD.A18("The data value is null!");
    }

    public String getStringValue() {
        if (!this.mIsNull) {
            checkType(EnumC72389XcP.A05);
            String str = this.mStringValue;
            str.getClass();
            return str;
        }
        throw AbstractC166987dD.A18("The data value is null!");
    }

    public DataValue(Float f) {
        this.mIsNull = true;
        this.mDataType = EnumC72389XcP.A04;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = false;
        this.mDataType = EnumC72389XcP.A03;
        this.mFloatValue = f;
    }

    public boolean getIsNull() {
        return this.mIsNull;
    }

    public DataValue(String str) {
        this.mIsNull = true;
        this.mDataType = EnumC72389XcP.A04;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = false;
        this.mDataType = EnumC72389XcP.A05;
        this.mStringValue = str;
    }

    public DataValue(Long l) {
        this.mIsNull = true;
        EnumC72389XcP enumC72389XcP = EnumC72389XcP.A04;
        this.mDataType = enumC72389XcP;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = false;
        this.mDataType = enumC72389XcP;
        this.mIntValue = l;
    }

    public DataValue() {
        this.mIsNull = true;
        this.mDataType = EnumC72389XcP.A04;
        this.mIntValue = null;
        this.mFloatValue = null;
        this.mStringValue = null;
        this.mIsNull = true;
    }
}
