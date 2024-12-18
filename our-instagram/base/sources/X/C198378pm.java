package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;

/* renamed from: X.8pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198378pm implements C82M {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C8XW A02;
    public final C188648Xd A03;
    public final C01U A04;

    public C198378pm(AbstractC59962oe abstractC59962oe, UserSession userSession, C8XW c8xw) {
        C14360o3.A0B(c8xw, 1);
        C14360o3.A0B(abstractC59962oe, 2);
        C14360o3.A0B(userSession, 3);
        this.A02 = c8xw;
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A03 = (C188648Xd) new C8CZ(userSession).Bnn().A00(C188648Xd.class, new C9E4(new C8XZ(userSession), 9));
        this.A04 = new C01U();
    }

    @Override // X.C82M
    public final void A7T(Parcelable parcelable) {
        C01U c01u = this.A04;
        AbstractC59962oe abstractC59962oe = this.A00;
        C07S c07s = C07S.RESUMED;
        c01u.add(AbstractC188658Xe.A00(abstractC59962oe, c07s, new C206639Cu(this, null, 30)));
        c01u.add(AbstractC188658Xe.A00(abstractC59962oe, c07s, new C206639Cu(this, null, 31)));
    }

    @Override // X.C82M
    public final Parcelable ANh() {
        while (true) {
            C01U c01u = this.A04;
            if (!(!c01u.isEmpty())) {
                return null;
            }
            AnonymousClass195 anonymousClass195 = (AnonymousClass195) c01u.removeFirst();
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
        }
    }
}
