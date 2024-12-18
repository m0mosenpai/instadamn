package org.pytorch;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.MSW;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
public class IValue {
    public String[] TYPE_NAMES = {"Unknown", "Null", "Tensor", "Bool", "Long", "Double", "String", "Tuple", "BoolList", "LongList", "DoubleList", "TensorList", "GenericList", "DictStringKey", "DictLongKey"};
    public Object mData;
    public final int mTypeCode;

    public static IValue from(double d) {
        IValue iValue = new IValue(5);
        iValue.mData = Double.valueOf(d);
        return iValue;
    }

    public static IValue listFrom(IValue... iValueArr) {
        int length = iValueArr.length;
        if (length > 0) {
            int i = iValueArr[0].mTypeCode;
            for (int i2 = 1; i2 < length; i2++) {
                if (i != iValueArr[i2].mTypeCode) {
                    throw AbstractC166987dD.A12("List must contain items of the same type");
                }
            }
        }
        IValue iValue = new IValue(12);
        iValue.mData = iValueArr;
        return iValue;
    }

    public static IValue optionalNull() {
        return new IValue(1);
    }

    public static IValue tupleFrom(IValue... iValueArr) {
        IValue iValue = new IValue(7);
        iValue.mData = iValueArr;
        return iValue;
    }

    public static IValue dictLongKeyFrom(Map map) {
        IValue iValue = new IValue(14);
        iValue.mData = map;
        return iValue;
    }

    public static IValue dictStringKeyFrom(Map map) {
        IValue iValue = new IValue(13);
        iValue.mData = map;
        return iValue;
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
        throw new IllegalStateException(String.format(locale, "Expected IValue type %s, actual type %s", str, str2));
    }

    public boolean isBool() {
        return AbstractC167007dF.A1P(3, this.mTypeCode);
    }

    public boolean isBoolList() {
        return AbstractC167007dF.A1P(8, this.mTypeCode);
    }

    public boolean isDictLongKey() {
        return AbstractC167007dF.A1P(14, this.mTypeCode);
    }

    public boolean isDictStringKey() {
        return AbstractC167007dF.A1P(13, this.mTypeCode);
    }

    public boolean isDouble() {
        return AbstractC167007dF.A1P(5, this.mTypeCode);
    }

    public boolean isDoubleList() {
        return AbstractC167007dF.A1P(10, this.mTypeCode);
    }

    public boolean isList() {
        return AbstractC167007dF.A1P(12, this.mTypeCode);
    }

    public boolean isLong() {
        return AbstractC167007dF.A1P(4, this.mTypeCode);
    }

    public boolean isLongList() {
        return AbstractC167007dF.A1P(9, this.mTypeCode);
    }

    public boolean isNull() {
        if (1 == this.mTypeCode) {
            return true;
        }
        return false;
    }

    public boolean isString() {
        return AbstractC167007dF.A1P(6, this.mTypeCode);
    }

    public boolean isTensor() {
        return AbstractC167007dF.A1P(2, this.mTypeCode);
    }

    public boolean isTensorList() {
        return AbstractC167007dF.A1P(11, this.mTypeCode);
    }

    public boolean isTuple() {
        return AbstractC167007dF.A1P(7, this.mTypeCode);
    }

    public boolean toBool() {
        preconditionType(3, this.mTypeCode);
        return AbstractC166987dD.A1a(this.mData);
    }

    public boolean[] toBoolList() {
        preconditionType(8, this.mTypeCode);
        return (boolean[]) this.mData;
    }

    public Map toDictLongKey() {
        preconditionType(14, this.mTypeCode);
        return (Map) this.mData;
    }

    public Map toDictStringKey() {
        preconditionType(13, this.mTypeCode);
        return (Map) this.mData;
    }

    public double toDouble() {
        preconditionType(5, this.mTypeCode);
        return MSW.A00(this.mData);
    }

    public double[] toDoubleList() {
        preconditionType(10, this.mTypeCode);
        return (double[]) this.mData;
    }

    public IValue[] toList() {
        preconditionType(12, this.mTypeCode);
        return (IValue[]) this.mData;
    }

    public long toLong() {
        preconditionType(4, this.mTypeCode);
        return AbstractC166987dD.A0N(this.mData);
    }

    public long[] toLongList() {
        preconditionType(9, this.mTypeCode);
        return (long[]) this.mData;
    }

    public String toStr() {
        preconditionType(6, this.mTypeCode);
        return (String) this.mData;
    }

    public Tensor toTensor() {
        preconditionType(2, this.mTypeCode);
        return (Tensor) this.mData;
    }

    public Tensor[] toTensorList() {
        preconditionType(11, this.mTypeCode);
        return (Tensor[]) this.mData;
    }

    public IValue[] toTuple() {
        preconditionType(7, this.mTypeCode);
        return (IValue[]) this.mData;
    }

    public IValue(int i) {
        this.mTypeCode = i;
    }

    public static IValue from(long j) {
        IValue iValue = new IValue(4);
        iValue.mData = Long.valueOf(j);
        return iValue;
    }

    public static IValue listFrom(double... dArr) {
        IValue iValue = new IValue(10);
        iValue.mData = dArr;
        return iValue;
    }

    public static IValue from(boolean z) {
        IValue iValue = new IValue(3);
        iValue.mData = Boolean.valueOf(z);
        return iValue;
    }

    public static IValue listFrom(long... jArr) {
        IValue iValue = new IValue(9);
        iValue.mData = jArr;
        return iValue;
    }

    public static IValue from(String str) {
        IValue iValue = new IValue(6);
        iValue.mData = str;
        return iValue;
    }

    public static IValue listFrom(Tensor... tensorArr) {
        IValue iValue = new IValue(11);
        iValue.mData = tensorArr;
        return iValue;
    }

    public static IValue from(Tensor tensor) {
        IValue iValue = new IValue(2);
        iValue.mData = tensor;
        return iValue;
    }

    public static IValue listFrom(boolean... zArr) {
        IValue iValue = new IValue(8);
        iValue.mData = zArr;
        return iValue;
    }
}
