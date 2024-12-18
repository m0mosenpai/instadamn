package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EE7 extends AnonymousClass935 {
    public final /* synthetic */ G03 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE7(G03 g03) {
        super(g03.A05);
        this.A00 = g03;
    }

    @Override // X.AnonymousClass935
    public final void A01(UserSession userSession) {
        int A03 = C0f9.A03(-1786805002);
        this.A00.A04 = false;
        C0f9.A0A(443800740, A03);
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        int A03 = C0f9.A03(705296311);
        this.A00.A04 = true;
        C0f9.A0A(1783458755, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        ArrayList A1E;
        int A03 = C0f9.A03(-2053024355);
        int A032 = C0f9.A03(-606070571);
        G03 g03 = this.A00;
        synchronized (g03) {
            try {
                FJ2 fj2 = g03.A06;
                synchronized (fj2) {
                    C11T.A05(AbstractC43591JPw.A00(30));
                    System.currentTimeMillis();
                    FGU fgu = (FGU) fj2.A00.A02(fj2.A01, false);
                    System.currentTimeMillis();
                    A1E = AbstractC166987dD.A1E();
                    if (fgu != null) {
                        A1E.addAll(AbstractC31172DnG.A19(fgu.A00));
                    }
                }
                if (!A1E.isEmpty()) {
                    List list = g03.A07;
                    list.clear();
                    list.addAll(A1E);
                    g03.A03 = true;
                }
            } catch (Throwable th) {
                C0f9.A0A(697006072, A032);
                throw th;
            }
        }
        C0f9.A0A(-1784005164, A032);
        C0f9.A0A(56963504, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03 = C0f9.A03(-343501756);
        C32214EDn c32214EDn = (C32214EDn) obj;
        int A032 = C0f9.A03(1388428825);
        G03 g03 = this.A00;
        synchronized (g03) {
            try {
                g03.A02 = true;
                g03.A01 = c32214EDn.A03;
                List list = g03.A07;
                list.clear();
                list.addAll(AbstractC31677Dvi.A01(g03.A00, g03.A05, AbstractC166987dD.A1F(c32214EDn.A05)));
            } catch (Throwable th) {
                C0f9.A0A(1606472083, A032);
                throw th;
            }
        }
        C0f9.A0A(1175124335, A032);
        C0f9.A0A(183716626, A03);
    }
}
