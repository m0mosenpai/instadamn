package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.47v, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47v {
    public float A00;
    public C9BW A01;
    public String A02;
    public List A03;
    public boolean A04;

    public C47v() {
        this(0.0f, 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C47v(float r7, int r8) {
        /*
            r6 = this;
            r4 = r7
            r3 = 0
            r2 = 0
            r1 = 0
            r0 = r8 & 1
            if (r0 == 0) goto La
            r4 = 1065353216(0x3f800000, float:1.0)
        La:
            r0 = r8 & 2
            if (r0 == 0) goto L13
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L13:
            r5 = 0
            r0 = r8 & 16
            if (r0 == 0) goto L1d
            X.9BW r1 = new X.9BW
            r1.<init>()
        L1d:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47v.<init>(float, int):void");
    }

    public final boolean equals(Object obj) {
        C47v c47v;
        if (this != obj) {
            if (obj instanceof C47v) {
                c47v = (C47v) obj;
            } else {
                c47v = null;
            }
            if (c47v == null || this.A00 != c47v.A00 || !C14360o3.A0K(this.A03, c47v.A03) || !C14360o3.A0K(this.A01, c47v.A01)) {
                return false;
            }
        }
        return true;
    }

    public final C5JH A00(C5JI c5ji) {
        for (C5JH c5jh : this.A03) {
            if (c5jh.A04 == c5ji) {
                return c5jh;
            }
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.A00), this.A03});
    }

    public C47v(C9BW c9bw, String str, List list, float f, boolean z) {
        C14360o3.A0B(list, 2);
        C14360o3.A0B(c9bw, 5);
        this.A00 = f;
        this.A03 = list;
        this.A04 = z;
        this.A02 = str;
        this.A01 = c9bw;
    }
}
