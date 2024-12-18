package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.LrX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49339LrX implements C7D8 {
    public final C49154LoX A00;
    public final C38321qM A01;
    public final DirectMessageIdentifier A02;

    public C49339LrX(C49154LoX c49154LoX, C38321qM c38321qM, DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 2);
        this.A00 = c49154LoX;
        this.A02 = directMessageIdentifier;
        this.A01 = c38321qM;
    }

    @Override // X.C7D8
    public final void EbK(int i, int i2) {
    }

    @Override // X.C7D8
    public final void EcT(int i) {
    }

    @Override // X.C7D8
    public final void EhT(EnumC79303gb enumC79303gb) {
    }

    @Override // X.C7D8
    public final void setVideoIconState(EnumC74373Vt enumC74373Vt) {
    }

    @Override // X.C7D8
    public final DirectMessageIdentifier AxX() {
        return this.A02;
    }

    @Override // X.C7D8
    public final C38321qM BQZ() {
        return this.A01;
    }

    @Override // X.C7D8
    public final RoundedCornerMediaFrameLayout C6x() {
        return this.A00.A0A;
    }

    @Override // X.C7D8
    public final String CFK() {
        C38321qM c38321qM = this.A01;
        if (c38321qM != null) {
            return c38321qM.A0M;
        }
        return null;
    }

    @Override // X.C7D8
    public final void ESM(int i) {
        this.A00.A08.setVisibility(i);
    }
}
