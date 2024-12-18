package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.G5w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36447G5w implements InterfaceC37117GXc {
    public final /* synthetic */ C32785Ebp A00;

    public C36447G5w(C32785Ebp c32785Ebp) {
        this.A00 = c32785Ebp;
    }

    @Override // X.InterfaceC37117GXc
    public final void onSuccess() {
        C32785Ebp c32785Ebp = this.A00;
        IgdsButton igdsButton = ((EKL) c32785Ebp).A00;
        if (igdsButton != null) {
            igdsButton.setLoading(false);
            AbstractC31179DnN.A0x(c32785Ebp);
        } else {
            C14360o3.A0F("ctaButton");
            throw C00O.createAndThrow();
        }
    }
}
