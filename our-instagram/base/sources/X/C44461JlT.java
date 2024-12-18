package X;

import android.app.Application;
import android.content.Context;
import com.instagram.archive.data.HighlightsSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JlT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44461JlT extends C193578hc {
    public final HighlightsSettingsRepository A00;
    public final UserSession A01;
    public final C156216zq A02;
    public final C156186zn A03;
    public final C19L A04;
    public final C05A A05;
    public final C0UO A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.6zr, java.lang.Object] */
    public C44461JlT(Application application, UserSession userSession) {
        super(application);
        AbstractC167007dF.A1D(userSession, 1, application);
        this.A01 = userSession;
        HighlightsSettingsRepository A00 = AbstractC156236zs.A00(new Object(), userSession);
        this.A00 = A00;
        this.A02 = AbstractC156206zp.A00(userSession);
        C156186zn c156186zn = new C156186zn(3, false);
        this.A03 = c156186zn;
        this.A04 = AbstractC43593JPy.A17(C12L.A00, -18, 3);
        C008002u A1H = AbstractC25225BEi.A1H(new C50726MaR((InterfaceC50393MMv) C48237LWm.A00, A00(this, C16930sl.A00, false), AbstractC166997dE.A0Y(userSession).A2P(), A00.A01().A02, false));
        this.A05 = A1H;
        this.A06 = A1H;
        AbstractC25232BEp.A1J(this, new MC5(this, null, 14), A00.A03);
        AbstractC25232BEp.A1J(this, new MC5(this, null, 15), c156186zn.A01);
        if (!A00.A01().A02) {
            C156186zn c156186zn2 = this.A03;
            Context A0O = AbstractC166987dD.A0O(A0D());
            UserSession userSession2 = this.A01;
            c156186zn2.A00(A0O, userSession2, C6r8.A00, null, null, null, null, userSession2.userId, true);
        }
    }

    public final void A0E() {
        UserSession userSession = this.A01;
        C1OU c1ou = C1OU.$redex_init_class;
        C41121vL A00 = AbstractC41111vK.A00(userSession);
        C14360o3.A07(A00);
        boolean z = this.A00.A01().A02;
        AbstractC166987dD.A1Z(new JQE(this, A00, null, 1, z), AbstractC141776au.A00(this));
    }

    public static final C5Hc A00(C44461JlT c44461JlT, List list, boolean z) {
        UserSession userSession = c44461JlT.A01;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36322233480325193L);
        HighlightsSettingsRepository highlightsSettingsRepository = c44461JlT.A00;
        boolean z2 = highlightsSettingsRepository.A01().A01;
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A0U = AbstractC001800i.A0U(list);
        C01T.A1D(A0U, Reel.A00(userSession, list));
        Reel reel = (Reel) AbstractC001800i.A0J(A0U);
        if ((z || A06) && (reel == null || !reel.A0l())) {
            A1E.add(new C152796u7(z, z2));
            A1E.add(C152646tr.A00);
        }
        if (A0U.isEmpty()) {
            A1E.add(new C152626tp(z2));
        } else {
            int i = 0;
            Iterator it = A0U.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                Reel reel2 = (Reel) next;
                InterfaceC152636tq c152676tu = new C152676tu(userSession, new C3G4(null, reel2, C3G2.A1Y), highlightsSettingsRepository.A01().A01);
                if (reel2.A0l()) {
                    if ((z || A06) && i == 0) {
                        A1E.add(c152676tu);
                        c152676tu = C152646tr.A00;
                    }
                    i = i2;
                }
                A1E.add(c152676tu);
                i = i2;
            }
        }
        if (AbstractC001800i.A0L(A1E) instanceof C152646tr) {
            AnonymousClass016.A15(A1E);
        }
        return AbstractC133095zb.A00(A1E);
    }

    public final void A0F(boolean z) {
        AbstractC166987dD.A1Z(new PZW(this, (InterfaceC23621Ds) null, 5, z), this.A04);
    }
}
