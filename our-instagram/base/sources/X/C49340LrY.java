package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.LrY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49340LrY implements C7D8 {
    public final UserSession A00;
    public final C49169Lom A01;
    public final L6K A02;
    public final C38321qM A03;
    public final DirectMessageIdentifier A04;

    @Override // X.C7D8
    public final void EbK(int i, int i2) {
    }

    @Override // X.C7D8
    public final DirectMessageIdentifier AxX() {
        return this.A04;
    }

    @Override // X.C7D8
    public final C38321qM BQZ() {
        return this.A03;
    }

    @Override // X.C7D8
    public final RoundedCornerMediaFrameLayout C6x() {
        return this.A01.A0K;
    }

    @Override // X.C7D8
    public final String CFK() {
        C38321qM c38321qM = this.A03;
        if (c38321qM == null) {
            return null;
        }
        return c38321qM.A0M;
    }

    @Override // X.C7D8
    public final void ESM(int i) {
        this.A02.A00(this.A04);
        this.A01.A0I.setVisibility(i);
    }

    @Override // X.C7D8
    public final void EcT(int i) {
        this.A02.A00(this.A04);
        this.A01.A0J.EcU(i, false);
    }

    @Override // X.C7D8
    public final void EhT(EnumC79303gb enumC79303gb) {
        C46502Ki1 A00 = this.A02.A00(this.A04);
        C14360o3.A0B(enumC79303gb, 0);
        A00.A00 = enumC79303gb;
        this.A01.A0H.A00(enumC79303gb);
    }

    @Override // X.C7D8
    public final void setVideoIconState(EnumC74373Vt enumC74373Vt) {
        C46502Ki1 A00 = this.A02.A00(this.A04);
        C14360o3.A0B(enumC74373Vt, 0);
        A00.A01 = enumC74373Vt;
        this.A01.A0J.setVideoIconState(enumC74373Vt);
    }

    public C49340LrY(UserSession userSession, C49169Lom c49169Lom, L6K l6k, C38321qM c38321qM, DirectMessageIdentifier directMessageIdentifier) {
        this.A04 = directMessageIdentifier;
        this.A03 = c38321qM;
        this.A01 = c49169Lom;
        this.A02 = l6k;
        this.A00 = userSession;
    }
}
