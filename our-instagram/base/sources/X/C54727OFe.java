package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.rtc.presentation.areffects.RtcEffectSlider;

/* renamed from: X.OFe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54727OFe {
    public float A00;
    public C88X A01;
    public RtcEffectSlider A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final C1810281e A07;
    public final InterfaceC58315Pt7 A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final ViewStub A0C;
    public final C19L A0D;

    public C54727OFe(ViewStub viewStub, C1810281e c1810281e, C19L c19l, int i) {
        AbstractC167007dF.A1D(viewStub, 1, c1810281e);
        this.A0C = viewStub;
        this.A07 = c1810281e;
        this.A0D = c19l;
        this.A06 = i;
        this.A08 = new JTC(0.0f, 1.0f);
        C008002u A0s = MSX.A0s(this.A03);
        this.A09 = A0s;
        C008002u A00 = C10E.A00(this.A01);
        this.A0B = A00;
        C008002u A0s2 = MSX.A0s(this.A04);
        this.A0A = A0s2;
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.rtc.presentation.areffects.RtcEffectSlider");
        RtcEffectSlider rtcEffectSlider = (RtcEffectSlider) inflate;
        this.A02 = rtcEffectSlider;
        rtcEffectSlider.setAlignedLeft(true);
        ViewGroup.LayoutParams layoutParams = rtcEffectSlider.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        C56292iI c56292iI = (C56292iI) layoutParams;
        c56292iI.A02 = 8388627;
        rtcEffectSlider.setLayoutParams(c56292iI);
        RtcEffectSlider rtcEffectSlider2 = this.A02;
        ViewGroup.MarginLayoutParams A08 = AbstractC31175DnJ.A08(rtcEffectSlider2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        A08.setMarginStart(this.A06);
        rtcEffectSlider2.setLayoutParams(A08);
        AbstractC18560vj.A03(c19l, new C16410rm(new MWF(this, null, 9), MSW.A1I(new PYw(this, null, 35), C0ST.A01(C10Q.A01(new C43173J6t(this, null, 0), C0ST.A01(MV5.A00(this, AbstractC184118Fa.A00(c1810281e), 23)), A0s, A00, A0s2)))));
    }
}
