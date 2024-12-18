package X;

import java.util.Arrays;

/* renamed from: X.1WX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1WX {
    public final int A00;
    public final C1WW A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        C1WX c1wx;
        return obj == this || (obj != null && C14360o3.A0K(obj.getClass(), getClass()) && (obj instanceof C1WX) && (c1wx = (C1WX) obj) != null && c1wx.A02 == this.A02 && c1wx.A00 == this.A00 && c1wx.A01 == this.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A02), Integer.valueOf(this.A00), this.A01});
    }

    public C1WX(C1WW c1ww, int i, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = c1ww;
    }
}
