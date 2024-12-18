package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.R;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* loaded from: classes9.dex */
public final class PCH implements InterfaceC57985PnV {
    public OHM A00;
    public final InterfaceC56392iX A01;
    public final InterfaceC56392iX A02;
    public final O51 A03;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A05 = C57513Pfn.A00(this, 34);
    public final InterfaceC09390do A0F = C57513Pfn.A00(this, 44);
    public final InterfaceC09390do A07 = C57513Pfn.A00(this, 36);
    public final InterfaceC09390do A0C = C57513Pfn.A00(this, 41);
    public final InterfaceC09390do A04 = C57513Pfn.A00(this, 33);
    public final InterfaceC09390do A0I = C57513Pfn.A00(this, 47);
    public final InterfaceC09390do A06 = C57513Pfn.A00(this, 35);

    @Override // X.InterfaceC57985PnV
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void ADV(C51906Mwo c51906Mwo) {
        InterfaceC09390do interfaceC09390do;
        InterfaceC09390do interfaceC09390do2;
        InterfaceC09390do interfaceC09390do3;
        InterfaceC09390do interfaceC09390do4;
        C14360o3.A0B(c51906Mwo, 0);
        int i = 0;
        if (c51906Mwo.A0Z && c51906Mwo.A0S) {
            ((C54768OIf) this.A06.getValue()).A00(true);
            boolean z = c51906Mwo.A0V;
            InterfaceC09390do interfaceC09390do5 = this.A07;
            ImageView A0C = MSW.A0C(interfaceC09390do5);
            if (z) {
                interfaceC09390do = this.A0A;
            } else {
                interfaceC09390do = this.A08;
            }
            A0C.setImageDrawable(AbstractC166987dD.A0a(interfaceC09390do));
            View A0d = AbstractC166987dD.A0d(interfaceC09390do5);
            if (z) {
                interfaceC09390do2 = this.A0B;
            } else {
                interfaceC09390do2 = this.A09;
            }
            A0d.setContentDescription(AbstractC25225BEi.A15(interfaceC09390do2));
            boolean z2 = c51906Mwo.A0Q;
            InterfaceC09390do interfaceC09390do6 = this.A04;
            AbstractC43593JPy.A1W(interfaceC09390do6, 0);
            SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) interfaceC09390do6.getValue();
            if (z2) {
                interfaceC09390do3 = this.A0E;
            } else {
                interfaceC09390do3 = this.A0D;
            }
            slideInAndOutIconView.setIcon(AbstractC166987dD.A0a(interfaceC09390do3));
            View A0d2 = AbstractC166987dD.A0d(interfaceC09390do6);
            if (z2) {
                interfaceC09390do4 = this.A0G;
            } else {
                interfaceC09390do4 = this.A0H;
            }
            A0d2.setContentDescription(AbstractC25225BEi.A15(interfaceC09390do4));
        } else {
            ((C54768OIf) this.A06.getValue()).A00(false);
        }
        if (c51906Mwo.A0c) {
            InterfaceC09390do interfaceC09390do7 = this.A0I;
            AbstractC43593JPy.A1W(interfaceC09390do7, 0);
            Integer num = c51906Mwo.A0A;
            if (num != null) {
                ((ProgressBar) interfaceC09390do7.getValue()).setProgress(num.intValue());
            }
        } else if (this.A02.CWW()) {
            AbstractC43593JPy.A1Q(this.A0I.getValue());
        }
        if (c51906Mwo.A0M) {
            i = 4;
        }
        AbstractC43593JPy.A1W(this.A07, i);
        AbstractC43593JPy.A1W(this.A0F, i);
        AbstractC43593JPy.A1W(this.A0C, i);
    }

    public PCH(View view, O51 o51) {
        this.A03 = o51;
        this.A01 = AbstractC31179DnN.A0M(view, R.id.player_controls_bottom_stub);
        this.A02 = AbstractC31179DnN.A0M(view, R.id.player_controls_volume_slider_stub);
        this.A0G = C57513Pfn.A00(view, 45);
        this.A0H = C57513Pfn.A00(view, 46);
        this.A09 = C57513Pfn.A00(view, 38);
        this.A0B = C57513Pfn.A00(view, 40);
        this.A0D = C57513Pfn.A00(view, 42);
        this.A0E = C57513Pfn.A00(view, 43);
        this.A08 = C57513Pfn.A00(view, 37);
        this.A0A = C57513Pfn.A00(view, 39);
    }
}
