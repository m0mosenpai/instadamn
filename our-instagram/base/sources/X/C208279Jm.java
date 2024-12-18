package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208279Jm extends JQS {
    public final C69613Av A00;
    public final C69613Av A01;
    public final A70 A02;
    public final C54822fg A03;

    @Override // X.AbstractC69603Au
    public final int A01() {
        return 31784974;
    }

    @Override // X.JQS
    public final void A0P(Context context, C55782hJ c55782hJ, InterfaceC11380iw interfaceC11380iw, boolean z) {
        C14360o3.A0B(context, 0);
        super.A0P(context, c55782hJ, interfaceC11380iw, z);
    }

    @Override // X.AbstractC69603Au
    public final void A05() {
        A0J("destination", this.A02.A00);
    }

    @Override // X.AbstractC69603Au
    public final void A0C(C69613Av c69613Av, String str, long j) {
        C69613Av c69613Av2 = this.A00;
        if (c69613Av == c69613Av2) {
            this.A08.remove(this.A01);
        } else if (c69613Av == this.A01) {
            this.A08.remove(c69613Av2);
        }
        super.A0C(c69613Av, str, j);
    }

    @Override // X.JQS
    public final boolean A0R() {
        C54822fg c54822fg = this.A03;
        float f = c54822fg.A01;
        if (this.A02.A01.getChildFragmentManager().A0O(R.id.feed_gallery_fragment_holder) == null && c54822fg.A04.A01(f) > 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208279Jm(UserSession userSession, A70 a70, C54822fg c54822fg) {
        super(userSession);
        AbstractC167017dG.A1R(a70, userSession);
        this.A03 = c54822fg;
        this.A02 = a70;
        C69613Av c69613Av = new C69613Av(this, "init_camera");
        this.A00 = c69613Av;
        C69613Av c69613Av2 = new C69613Av(this, "init_gallery");
        this.A01 = c69613Av2;
        java.util.Set set = this.A07;
        set.add(c69613Av);
        java.util.Set set2 = this.A06;
        set2.add(c69613Av);
        set.add(c69613Av2);
        set2.add(c69613Av2);
    }
}
