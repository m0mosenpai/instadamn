package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.BwU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27050BwU extends AbstractC61132qb {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public C27050BwU(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, int i) {
        this.A00 = i;
        this.A04 = userSession;
        if (i != 0) {
            this.A05 = str;
            this.A06 = str2;
        } else {
            this.A06 = str;
            this.A05 = str2;
        }
        this.A02 = context;
        this.A01 = interfaceC11380iw;
        this.A03 = abstractC018607g;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        int i = this.A00;
        UserSession userSession = (UserSession) this.A04;
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        if (i != 0) {
            C14360o3.A07(A00);
            String str = this.A05;
            String str2 = this.A06;
            return new C25838Bbt(A00, new CTI((Context) this.A02, (AbstractC018607g) this.A03, (InterfaceC11380iw) this.A01, userSession, C41683IdC.A00, str2), str);
        }
        C14360o3.A07(A00);
        String str3 = this.A06;
        String str4 = this.A05;
        return new C25833Bbo(A00, new CT7((Context) this.A02, (AbstractC018607g) this.A03, (InterfaceC11380iw) this.A01, userSession, C28142Cap.A00, str4), str3);
    }
}
