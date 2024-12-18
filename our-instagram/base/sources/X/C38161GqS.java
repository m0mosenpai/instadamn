package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GqS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38161GqS implements InterfaceC43406JFw {
    public final /* synthetic */ C38P A00;

    public C38161GqS(C38P c38p) {
        this.A00 = c38p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC43406JFw
    public final void EE0(View view, C5qT c5qT, C127915qK c127915qK, AbstractC127945qN abstractC127945qN, boolean z) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(c5qT, 3);
        C38126Gpt c38126Gpt = this.A00.A0K;
        if (c38126Gpt == null) {
            C14360o3.A0F("exploreHomeViewpointHelper");
            throw C00O.createAndThrow();
        }
        C59072n8 A00 = C59062n7.A00(abstractC127945qN, new C38162GqT(c5qT, c127915qK), abstractC127945qN.getKey());
        A00.A00(c38126Gpt.A05);
        boolean z2 = abstractC127945qN instanceof C37931GmT;
        if (z2) {
            A00.A00(c38126Gpt.A01);
            A00.A00(c38126Gpt.A06);
            if (C18U.A06(C06090Tz.A05, c38126Gpt.A00, 36315133899181101L)) {
                C38133Gq0 c38133Gq0 = c38126Gpt.A04;
                ((AbstractC64292vo) c38133Gq0).A00.put(abstractC127945qN, view);
                A00.A00(c38133Gq0);
            }
        }
        UserSession userSession = c38126Gpt.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315881225129649L)) {
            try {
                for (InterfaceC673231x interfaceC673231x : c38126Gpt.A08) {
                    if (z2) {
                        interfaceC673231x.ABm(A00);
                    } else if (C18U.A06(c06090Tz, userSession, 36315881225326260L)) {
                        interfaceC673231x.ABj(A00);
                    }
                }
            } catch (Exception unused) {
                C18950wb.A01.AEp("exception while casting viewpointDataBuilder", 817903268).report();
            }
        }
        C38132Gpz c38132Gpz = c38126Gpt.A03;
        if (c38132Gpz != null && z && (abstractC127945qN instanceof InterfaceC127965qP) && ((InterfaceC127965qP) abstractC127945qN).CQJ()) {
            A00.A00(c38132Gpz);
        }
        C38140Gq7 c38140Gq7 = c38126Gpt.A07;
        if (c38140Gq7 != null) {
            A00.A00(c38140Gq7);
        }
        c38126Gpt.A02.A05(view, A00.A01());
    }
}
