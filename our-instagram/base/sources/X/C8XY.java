package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;

/* renamed from: X.8XY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8XY implements C82M {
    public AnonymousClass195 A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final C8XW A03;
    public final C188648Xd A04;

    public C8XY(AbstractC59962oe abstractC59962oe, UserSession userSession, C8XW c8xw) {
        C14360o3.A0B(c8xw, 1);
        C14360o3.A0B(abstractC59962oe, 2);
        C14360o3.A0B(userSession, 3);
        this.A03 = c8xw;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A04 = (C188648Xd) new C8CZ(userSession).Bnn().A00(C188648Xd.class, new C9E4(new C8XZ(userSession), 10));
    }

    @Override // X.C82M
    public final void A7T(Parcelable parcelable) {
        this.A00 = AbstractC188658Xe.A00(this.A01, C07S.RESUMED, new C206639Cu(this, null, 32));
    }

    @Override // X.C82M
    public final Parcelable ANh() {
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A00 = null;
        return null;
    }
}
