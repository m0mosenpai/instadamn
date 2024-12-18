package com.facebook.react.bridge;

import X.AbstractC05810Sj;
import X.AbstractC166987dD;
import X.AbstractC25229BEm;
import X.AnonymousClass001;
import X.MSW;
import X.STV;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class ReadableNativeArray extends NativeArray implements ReadableArray {
    public static int jniPassCounter;
    public Object[] mLocalArray;
    public ReadableType[] mLocalTypeArray;

    private native Object[] importArray();

    private native Object[] importTypeArray();

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableType getType(int i) {
        ReadableType[] readableTypeArr = this.mLocalTypeArray;
        if (readableTypeArr == null) {
            synchronized (this) {
                if (this.mLocalTypeArray == null) {
                    jniPassCounter++;
                    Object[] importTypeArray = importTypeArray();
                    AbstractC05810Sj.A00(importTypeArray);
                    this.mLocalTypeArray = (ReadableType[]) Arrays.copyOf(importTypeArray, importTypeArray.length, ReadableType[].class);
                }
            }
            readableTypeArr = this.mLocalTypeArray;
        }
        return readableTypeArr[i];
    }

    private Object[] getLocalArray() {
        Object[] objArr = this.mLocalArray;
        if (objArr == null) {
            synchronized (this) {
                if (this.mLocalArray == null) {
                    jniPassCounter++;
                    Object[] importArray = importArray();
                    AbstractC05810Sj.A00(importArray);
                    this.mLocalArray = importArray;
                }
            }
            return this.mLocalArray;
        }
        return objArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableNativeArray)) {
            return false;
        }
        return Arrays.deepEquals(getLocalArray(), ((ReadableNativeArray) obj).getLocalArray());
    }

    static {
        STV.A00();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public /* bridge */ /* synthetic */ ReadableArray getArray(int i) {
        return (ReadableNativeArray) getLocalArray()[i];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int i) {
        return AbstractC166987dD.A1a(getLocalArray()[i]);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int i) {
        return MSW.A00(getLocalArray()[i]);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int i) {
        return AbstractC166987dD.A0H(getLocalArray()[i]);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public /* bridge */ /* synthetic */ ReadableMap getMap(int i) {
        return (ReadableNativeMap) getLocalArray()[i];
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public String getString(int i) {
        return (String) getLocalArray()[i];
    }

    public int hashCode() {
        return getLocalArray().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int i) {
        return AbstractC25229BEm.A1Z(getLocalArray()[i]);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        return getLocalArray().length;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0013. Please report as an issue. */
    @Override // com.facebook.react.bridge.ReadableArray
    public ArrayList toArrayList() {
        Object hashMap;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < size(); i++) {
            switch (getType(i).ordinal()) {
                case 0:
                    A1E.add(null);
                case 1:
                    hashMap = Boolean.valueOf(getBoolean(i));
                    A1E.add(hashMap);
                case 2:
                    hashMap = Double.valueOf(getDouble(i));
                    A1E.add(hashMap);
                case 3:
                    hashMap = getString(i);
                    A1E.add(hashMap);
                case 4:
                    hashMap = ((ReadableNativeMap) getLocalArray()[i]).toHashMap();
                    A1E.add(hashMap);
                case 5:
                    hashMap = ((ReadableNativeArray) getLocalArray()[i]).toArrayList();
                    A1E.add(hashMap);
                default:
                    throw AbstractC166987dD.A12(AnonymousClass001.A0c("Could not convert object at index: ", ".", i));
            }
        }
        return A1E;
    }
}
