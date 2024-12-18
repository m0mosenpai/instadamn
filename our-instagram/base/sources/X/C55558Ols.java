package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.Ols, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55558Ols implements C07W {
    public static final /* synthetic */ C0YR[] A0E = {new AnonymousClass019(C55558Ols.class, "parent", "getParent()Landroid/view/View;", 0), new AnonymousClass019(C55558Ols.class, "view", "getView()Landroid/view/View;", 0), new AnonymousClass019(C55558Ols.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "getIcon()Lcom/instagram/common/ui/base/IgSimpleImageView;", 0), new AnonymousClass019(C55558Ols.class, "content", "getContent()Lcom/instagram/common/ui/base/IgTextView;", 0), new AnonymousClass019(C55558Ols.class, "dismissButton", "getDismissButton()Landroid/view/View;", 0)};
    public final FragmentActivity A00;
    public final C55982hj A01;
    public final C32550EVa A02;
    public final C32550EVa A03;
    public final C32550EVa A04;
    public final C32550EVa A05;
    public final C32550EVa A06;
    public final O3Z A07;
    public final C114775Gk A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final C55942hf A0C;
    public final C55733Ooz A0D;

    public C55558Ols(FragmentActivity fragmentActivity, C114775Gk c114775Gk) {
        C14360o3.A0B(c114775Gk, 1);
        this.A08 = c114775Gk;
        this.A00 = fragmentActivity;
        C55942hf A04 = C55942hf.A04(80.0d, 7.0d);
        this.A0C = A04;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(A04);
        this.A01 = A0R;
        this.A0B = AbstractC09440dt.A01(new C57248PbW(this, 13));
        this.A0A = AbstractC09440dt.A01(new C57248PbW(this, 12));
        this.A05 = new C32550EVa(fragmentActivity, new C57248PbW(this, 11));
        this.A09 = AbstractC09440dt.A01(new C57248PbW(this, 9));
        this.A07 = new O3Z(this);
        this.A06 = new C32550EVa(fragmentActivity, new C57248PbW(this, 14));
        this.A04 = new C32550EVa(fragmentActivity, new C57248PbW(this, 10));
        this.A02 = new C32550EVa(fragmentActivity, new C57248PbW(this, 7));
        this.A03 = new C32550EVa(fragmentActivity, new C57248PbW(this, 8));
        this.A0D = new C55733Ooz(this, 2);
    }

    @OnLifecycleEvent(C07R.ON_CREATE)
    public final void onCreate() {
        this.A01.A0A(this.A0D);
        C114775Gk c114775Gk = this.A08;
        C2GT c2gt = c114775Gk.A06;
        FragmentActivity fragmentActivity = this.A00;
        AbstractC31174DnI.A1E(fragmentActivity, c2gt, C57745PjY.A00(this, 10), 54);
        AbstractC31174DnI.A1E(fragmentActivity, c114775Gk.A05, C57745PjY.A00(this, 11), 54);
    }

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public final void onDestroy() {
        this.A01.A0B(this.A0D);
    }
}
