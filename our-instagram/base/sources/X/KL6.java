package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KL6 extends C42H {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass840 A02;
    public final /* synthetic */ C47544KzC A03;
    public final /* synthetic */ InterfaceC189598ae A04;
    public final /* synthetic */ java.util.Set A05;

    public KL6(Context context, UserSession userSession, AnonymousClass840 anonymousClass840, C47544KzC c47544KzC, InterfaceC189598ae interfaceC189598ae, java.util.Set set) {
        this.A03 = c47544KzC;
        this.A05 = set;
        this.A02 = anonymousClass840;
        this.A01 = userSession;
        this.A00 = context;
        this.A04 = interfaceC189598ae;
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        C47544KzC c47544KzC = this.A03;
        java.util.Set set = this.A05;
        C9KJ c9kj = c47544KzC.A01;
        if (c9kj != null) {
            set.remove(c9kj);
            c9kj.A00();
        }
        AnonymousClass840 anonymousClass840 = this.A02;
        C47544KzC.A00(this.A00, this.A01, anonymousClass840, c47544KzC, this.A04, set, i);
    }
}
