package org.pytorch.executorch;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.MSW;
import java.util.Locale;
import java.util.Optional;

/* loaded from: classes9.dex */
public class EValue {
    public String[] TYPE_NAMES = {"None", "Tensor", "String", "Double", "Int", "Bool", "ListBool", "ListDouble", "ListInt", "ListTensor", "ListScalar", "ListOptionalScalar"};
    public Object mData;
    public final int mTypeCode;

    public static EValue from(double d) {
        EValue eValue = new EValue(3);
        eValue.mData = Double.valueOf(d);
        return eValue;
    }

    public static EValue optionalNone() {
        return new EValue(0);
    }

    public static EValue listFrom(long... jArr) {
        EValue eValue = new EValue(8);
        eValue.mData = jArr;
        return eValue;
    }

    private void preconditionType(int i, int i2) {
        String str;
        String str2;
        if (i2 == i) {
            return;
        }
        Locale locale = Locale.US;
        String[] strArr = this.TYPE_NAMES;
        int length = strArr.length;
        if (i < length) {
            str = strArr[i];
        } else {
            str = "Unknown";
        }
        if (i2 >= 0 && i2 < length) {
            str2 = strArr[i2];
        } else {
            str2 = "Unknown";
        }
        throw AbstractC166987dD.A14(String.format(locale, "Expected EValue type %s, actual type %s", str, str2));
    }

    public boolean isBool() {
        return AbstractC167007dF.A1P(5, this.mTypeCode);
    }

    public boolean isBoolList() {
        return AbstractC167007dF.A1P(6, this.mTypeCode);
    }

    public boolean isDouble() {
        return AbstractC167007dF.A1P(3, this.mTypeCode);
    }

    public boolean isDoubleList() {
        return AbstractC167007dF.A1P(7, this.mTypeCode);
    }

    public boolean isInt() {
        return AbstractC167007dF.A1P(4, this.mTypeCode);
    }

    public boolean isIntList() {
        return AbstractC167007dF.A1P(8, this.mTypeCode);
    }

    public boolean isNone() {
        return AbstractC167007dF.A1N(this.mTypeCode);
    }

    public boolean isOptionalTensorList() {
        return AbstractC167007dF.A1P(11, this.mTypeCode);
    }

    public boolean isString() {
        return AbstractC167007dF.A1P(2, this.mTypeCode);
    }

    public boolean isTensor() {
        if (1 == this.mTypeCode) {
            return true;
        }
        return false;
    }

    public boolean isTensorList() {
        return AbstractC167007dF.A1P(9, this.mTypeCode);
    }

    public boolean toBool() {
        preconditionType(5, this.mTypeCode);
        return AbstractC166987dD.A1a(this.mData);
    }

    public boolean[] toBoolList() {
        preconditionType(6, this.mTypeCode);
        return (boolean[]) this.mData;
    }

    public double toDouble() {
        preconditionType(3, this.mTypeCode);
        return MSW.A00(this.mData);
    }

    public double[] toDoubleList() {
        preconditionType(7, this.mTypeCode);
        return (double[]) this.mData;
    }

    public long toInt() {
        preconditionType(4, this.mTypeCode);
        return AbstractC166987dD.A0N(this.mData);
    }

    public long[] toIntList() {
        preconditionType(8, this.mTypeCode);
        return (long[]) this.mData;
    }

    public String toStr() {
        preconditionType(2, this.mTypeCode);
        return (String) this.mData;
    }

    public Tensor toTensor() {
        preconditionType(1, this.mTypeCode);
        return (Tensor) this.mData;
    }

    public Tensor[] toTensorList() {
        preconditionType(9, this.mTypeCode);
        return (Tensor[]) this.mData;
    }

    public EValue(int i) {
        this.mTypeCode = i;
    }

    public static EValue from(long j) {
        EValue eValue = new EValue(4);
        eValue.mData = Long.valueOf(j);
        return eValue;
    }

    public static EValue listFrom(Optional... optionalArr) {
        EValue eValue = new EValue(11);
        eValue.mData = optionalArr;
        return eValue;
    }

    public static EValue from(boolean z) {
        EValue eValue = new EValue(5);
        eValue.mData = Boolean.valueOf(z);
        return eValue;
    }

    public static EValue listFrom(Tensor... tensorArr) {
        EValue eValue = new EValue(9);
        eValue.mData = tensorArr;
        return eValue;
    }

    public static EValue from(String str) {
        EValue eValue = new EValue(2);
        eValue.mData = str;
        return eValue;
    }

    public static EValue listFrom(double... dArr) {
        EValue eValue = new EValue(7);
        eValue.mData = dArr;
        return eValue;
    }

    public static EValue from(Tensor tensor) {
        EValue eValue = new EValue(1);
        eValue.mData = tensor;
        return eValue;
    }

    public static EValue listFrom(boolean... zArr) {
        EValue eValue = new EValue(6);
        eValue.mData = zArr;
        return eValue;
    }
}
