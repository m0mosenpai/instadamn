package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.CrZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29046CrZ implements C2YT {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Drawable A03;
    public final String A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16660sJ A06;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) AbstractC25228BEl.A0Q(c2yr, C26642Bpd.A08);
        Drawable drawable = this.A03;
        String str = this.A04;
        float f = this.A01;
        AbstractC47026Kqj.A00(drawable, slideInAndOutIconView, str, this.A06, this.A05, f, this.A00, this.A02);
        return AbstractC25234BEr.A0Q(slideInAndOutIconView, j);
    }

    public C29046CrZ(Drawable drawable, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, float f, float f2, int i) {
        AbstractC167017dG.A1S(interfaceC16660sJ, interfaceC16660sJ2);
        this.A03 = drawable;
        this.A04 = str;
        this.A01 = f;
        this.A06 = interfaceC16660sJ;
        this.A05 = interfaceC16660sJ2;
        this.A02 = i;
        this.A00 = f2;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
