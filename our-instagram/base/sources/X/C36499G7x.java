package X;

import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.G7x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36499G7x implements GZA {
    public final /* synthetic */ C18920wW A00;
    public final /* synthetic */ InterfaceC19630xq A01;
    public final /* synthetic */ String A02;

    @Override // X.GZA
    public final void onActionClicked() {
    }

    public C36499G7x(C18920wW c18920wW, InterfaceC19630xq interfaceC19630xq, String str) {
        this.A01 = interfaceC19630xq;
        this.A02 = str;
        this.A00 = c18920wW;
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.E77("education_banner_dismiss_key", true);
        ARD.apply();
        String str = this.A02;
        C18920wW c18920wW = this.A00;
        C14360o3.A0B(c18920wW, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "ig_bio_education");
        AbstractC31171DnF.A1B(A0f, "dismiss");
        A0f.AAP(CacheBehaviorLogger.SOURCE, "edit_bio");
        A0f.AAP("biography", str);
        A0f.Cht();
    }
}
