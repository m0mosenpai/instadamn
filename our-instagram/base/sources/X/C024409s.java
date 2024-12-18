package X;

import java.util.RandomAccess;

/* renamed from: X.09s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C024409s extends AbstractC06990Yq<Float> implements RandomAccess {
    public final /* synthetic */ float[] A00;

    public C024409s(float[] fArr) {
        this.A00 = fArr;
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.length;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Float)) {
            return false;
        }
        float floatValue = ((Number) obj).floatValue();
        for (float f : this.A00) {
            if (Float.floatToIntBits(f) == Float.floatToIntBits(floatValue)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Float.valueOf(this.A00[i]);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Number) obj).floatValue();
            float[] fArr = this.A00;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(floatValue)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.A00.length != 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Number) obj).floatValue();
        float[] fArr = this.A00;
        int length = fArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(floatValue)) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
