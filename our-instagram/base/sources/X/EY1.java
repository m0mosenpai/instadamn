package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes6.dex */
public final class EY1 extends C4F4 {
    public final Drawable A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        EY1 ey1 = (EY1) obj;
        if (this.A02.equals(ey1.A02) && this.A01.equals(ey1.A01) && this.A00 == ey1.A00 && this.A03 == ey1.A03) {
            return true;
        }
        return false;
    }

    public EY1(Drawable drawable, String str, String str2, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = drawable;
        this.A03 = z;
    }
}
