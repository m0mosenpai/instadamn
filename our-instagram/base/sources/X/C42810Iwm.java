package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.Iwm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42810Iwm implements AnonymousClass388 {
    public final Fragment A00;
    public final UserSession A01;
    public final C41645Ibb A02;
    public final AnonymousClass387 A03;
    public final SavedCollection A04;

    @Override // X.AnonymousClass375
    public final InterfaceC37202GaD CCt() {
        return new C42819Iwv(this, 1);
    }

    @Override // X.AnonymousClass388
    public final void Di3(C38321qM c38321qM, C75113Zb c75113Zb, InterfaceC37202GaD interfaceC37202GaD, int i) {
        this.A03.Di3(c38321qM, c75113Zb, new C42819Iwv(this, 1), i);
    }

    @Override // X.AnonymousClass388
    public final void Di5(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        SavedCollection savedCollection = this.A04;
        if (savedCollection != null) {
            this.A03.A03(c38321qM, c75113Zb, savedCollection.A0F, i);
        } else {
            this.A03.Di5(c38321qM, c75113Zb, i);
        }
    }

    public C42810Iwm(Fragment fragment, UserSession userSession, C41645Ibb c41645Ibb, AnonymousClass387 anonymousClass387, SavedCollection savedCollection) {
        this.A00 = fragment;
        this.A03 = anonymousClass387;
        this.A02 = c41645Ibb;
        this.A01 = userSession;
        this.A04 = savedCollection;
    }
}
