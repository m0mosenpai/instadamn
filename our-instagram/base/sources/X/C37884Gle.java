package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gle, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37884Gle extends AbstractC149616oE {
    public C69613Av A00;
    public C69613Av A01;
    public boolean A02;
    public boolean A03;
    public final C37885Glf A04;

    @Override // X.AbstractC149616oE
    public final void A0L() {
        this.A02 = true;
        super.A0L();
    }

    @Override // X.AbstractC69603Au
    public final void A05() {
        C37885Glf c37885Glf = this.A04;
        c37885Glf.A01.remove(Integer.valueOf(c37885Glf.A00));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37884Gle(Context context, UserSession userSession, C37885Glf c37885Glf) {
        super(context, userSession, 749803224);
        AbstractC167017dG.A1P(userSession, context);
        this.A04 = c37885Glf;
        super.A04 = false;
    }
}
