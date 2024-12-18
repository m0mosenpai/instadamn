package X;

import android.graphics.Rect;

/* renamed from: X.2WE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2WE implements C2VB {
    public static final C78993g5 A07 = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Rect A04;
    public final Object A05;
    public final boolean A06;

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        C2WE c2we = (C2WE) obj;
        C14360o3.A0B(c2we, 0);
        if (this.A06 && c2we.A06 && (this.A03 != c2we.A03 || this.A01 != c2we.A01)) {
            return false;
        }
        return AbstractC78713fd.A04(this.A05, c2we.A05);
    }

    public C2WE(Rect rect, Object obj, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A04 = rect;
        this.A05 = obj;
        this.A06 = z;
    }
}
