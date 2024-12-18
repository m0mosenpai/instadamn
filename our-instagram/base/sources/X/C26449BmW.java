package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.BmW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26449BmW extends AbstractC51572Yf {
    public final int A00;
    public final long A01;
    public final EnumC72394Xcg A02;
    public final Integer A03;
    public final C2Z3 A04;
    public final Float A05;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        EnumC25700BXk enumC25700BXk;
        EnumC72394Xcg enumC72394Xcg;
        EnumC27390C6t enumC27390C6t;
        EnumC27390C6t enumC27390C6t2;
        C51722Yv c51722Yv;
        C51722Yv c51722Yv2;
        int ordinal;
        int ordinal2;
        InterfaceC30923Dia A00 = AbstractC28337CeP.A00(c76223bS);
        EnumC191908em A03 = AbstractC28379Cfi.A03(A00);
        int intValue = this.A03.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                enumC25700BXk = EnumC25700BXk.CIRCLE;
            } else {
                throw B4Z.A00();
            }
        } else {
            enumC25700BXk = EnumC25700BXk.RECTANGLE;
        }
        EnumC72394Xcg enumC72394Xcg2 = this.A02;
        if (enumC72394Xcg2 == null || ((ordinal2 = enumC72394Xcg2.ordinal()) != 144 && ordinal2 != 25 && ordinal2 != 3)) {
            enumC72394Xcg = EnumC72394Xcg.A12;
        } else {
            enumC72394Xcg = EnumC72394Xcg.A18;
        }
        int A01 = AbstractC28379Cfi.A01(enumC72394Xcg, A00);
        if (enumC72394Xcg2 == null || ((ordinal = enumC72394Xcg2.ordinal()) != 144 && ordinal != 25 && ordinal != 3)) {
            enumC27390C6t = EnumC27390C6t.A04;
            enumC27390C6t2 = EnumC27390C6t.A03;
        } else {
            enumC27390C6t = EnumC27390C6t.A06;
            enumC27390C6t2 = EnumC27390C6t.A05;
        }
        C09530e4 A1L = AbstractC166987dD.A1L(enumC27390C6t, enumC27390C6t2);
        Drawable A002 = AbstractC27723CKq.A00(c76223bS, new C29728D8y(A00, enumC25700BXk, this, c76223bS, A1L, A03, A01, 1), new Object[]{A00, A03, enumC25700BXk, Integer.valueOf(this.A00), Integer.valueOf(A01), AbstractC25225BEi.A0p(this.A01), A1L.A00, A1L.A01});
        C51722Yv c51722Yv3 = C51722Yv.A02;
        Float f = this.A05;
        if (f != null) {
            c51722Yv = AbstractC25230BEn.A0d(null, C05F.A00, f.floatValue(), 0);
        } else {
            c51722Yv = c51722Yv3;
        }
        C2Z3 c2z3 = this.A04;
        if (c2z3 != null) {
            c51722Yv2 = C9CU.A00(null, C05F.A01, 0, c2z3.A00);
        } else {
            c51722Yv2 = c51722Yv3;
        }
        return new C26611Bp8(A002, ImageView.ScaleType.CENTER_CROP, c51722Yv3.A00(c51722Yv3).A00(c51722Yv).A00(c51722Yv2).A00(c51722Yv3), 0, false);
    }

    public C26449BmW(EnumC72394Xcg enumC72394Xcg, C2Z3 c2z3, Float f, Integer num, int i, long j) {
        this.A00 = i;
        this.A02 = enumC72394Xcg;
        this.A03 = num;
        this.A01 = j;
        this.A04 = c2z3;
        this.A05 = f;
    }
}
