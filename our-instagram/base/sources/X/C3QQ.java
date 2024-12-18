package X;

import com.facebook.common.dextricks.DalvikConstants;

/* renamed from: X.3QQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QQ {
    public static final C3QQ A03;
    public int A00;
    public boolean A01;
    public boolean A02;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3QQ)) {
            return false;
        }
        C3QQ c3qq = (C3QQ) obj;
        return this.A00 == c3qq.A00 && this.A02 == c3qq.A02 && this.A01 == c3qq.A01;
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = 0;
        int i3 = 0;
        if (this.A02) {
            i3 = 4194304;
        }
        int i4 = i ^ i3;
        if (this.A01) {
            i2 = DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        }
        return i4 ^ i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3QQ, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A00 = Integer.MAX_VALUE;
        obj.A02 = true;
        obj.A01 = true;
        A03 = obj;
    }
}
