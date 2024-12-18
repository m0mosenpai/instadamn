package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152586tl extends AbstractC31433Drd {
    public final UserSession A00;
    public final InterfaceC1570073e A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152586tl(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, InterfaceC1570073e interfaceC1570073e, String str) {
        super(interfaceC11380iw, userSession, user, str);
        C14360o3.A0B(interfaceC1570073e, 3);
        this.A00 = userSession;
        this.A01 = interfaceC1570073e;
        this.A02 = str;
    }

    @Override // X.AbstractC31433Drd
    public final void A0C(C47O c47o, int i) {
        C14360o3.A0B(c47o, 1);
        super.A0C(c47o, i);
        this.A01.Dy8(c47o.A03, i);
    }

    @Override // X.AbstractC31433Drd
    public final void A0D(C47O c47o, int i) {
        C14360o3.A0B(c47o, 1);
        super.A0D(c47o, i);
        C1GJ.A03(FY5.A01(this.A00, c47o.getId(), c47o.A08, c47o.A04));
    }

    @Override // X.AbstractC31433Drd
    public final void A0E(C47O c47o, int i) {
        C14360o3.A0B(c47o, 1);
        super.A0E(c47o, i);
        this.A01.DHp(c47o.A03, i);
    }

    @Override // X.AbstractC31433Drd
    public final void A05() {
        this.A01.DdT();
    }

    @Override // X.AbstractC31433Drd
    public final void A07(EnumC33444EqG enumC33444EqG) {
        this.A01.D7P(enumC33444EqG);
    }

    @Override // X.AbstractC31433Drd
    public final void A03() {
        super.A03();
        this.A01.DmI();
    }

    @Override // X.AbstractC31433Drd
    public final void A06(View view, User user, int i) {
        super.A06(view, user, i);
        this.A01.Dy9(view, user, i);
    }

    @Override // X.AbstractC31433Drd
    public final void A09(User user, int i) {
        super.A09(user, i);
        C1GJ.A03(FY5.A00(this.A00, this.A02, user.getId()));
    }

    @Override // X.AbstractC31433Drd
    public final void A0A(User user, int i) {
        super.A0A(user, i);
        this.A01.DHp(user, i);
    }

    @Override // X.AbstractC31433Drd
    public final void A0G(boolean z, String str) {
        super.A0G(z, str);
        this.A01.DmJ(this.A02);
    }
}
