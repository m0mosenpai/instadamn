package X;

import java.util.Arrays;

/* renamed from: X.0vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18620vp extends AbstractC004201h {
    public C18620vp() {
        this.A01 = new Object[16];
    }

    public final void A00(Object obj) {
        int i = this.A00 + 1;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, Math.max(i, (length * 3) / 2));
            C14360o3.A07(objArr);
            this.A01 = objArr;
        }
        int i2 = this.A00;
        objArr[i2] = obj;
        this.A00 = i2 + 1;
    }
}
