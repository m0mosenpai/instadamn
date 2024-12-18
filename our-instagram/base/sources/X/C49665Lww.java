package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Lww, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49665Lww implements C88U {
    public final /* synthetic */ KF8 A00;
    public final /* synthetic */ C46501Ki0 A01;
    public final /* synthetic */ C6FG A02;
    public final /* synthetic */ C102884kP A03;

    public C49665Lww(KF8 kf8, C46501Ki0 c46501Ki0, C6FG c6fg, C102884kP c102884kP) {
        this.A00 = kf8;
        this.A03 = c102884kP;
        this.A01 = c46501Ki0;
        this.A02 = c6fg;
    }

    @Override // X.C88U
    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        C102884kP c102884kP = this.A03;
        InterfaceC103384lE A0B = c102884kP.A0B(45);
        InterfaceC103384lE A0B2 = c102884kP.A0B(43);
        if (A0B != null) {
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A01(this.A01.A02);
            C6FP.A03(this.A02, c102884kP, A0s.A00(), A0B);
            return;
        }
        if (A0B2 == null) {
            return;
        }
        C6FP.A03(this.A02, c102884kP, AbstractC25225BEi.A0s().A00(), A0B2);
    }

    @Override // X.C88U
    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        String charSequence2;
        C102884kP c102884kP = this.A03;
        InterfaceC103384lE A0B = c102884kP.A0B(38);
        C46501Ki0 c46501Ki0 = this.A01;
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        c46501Ki0.A02 = charSequence2;
        if (A0B != null) {
            C6FX A0I = AbstractC31179DnN.A0I(c102884kP);
            A0I.A02(c46501Ki0.A02);
            C6FG c6fg = this.A02;
            A0I.A03(c6fg, 2);
            C6FP.A03(c6fg, c102884kP, A0I.A00(), A0B);
        }
    }
}
