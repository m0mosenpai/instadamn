package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BJx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25354BJx implements InterfaceC30931Dil {
    public final List A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C25347BJq A03;
    public final C37535Gfr A04;
    public final C37533Gfp A05;
    public final C37534Gfq A06;
    public final C37529Gfl A07;
    public final boolean A08;

    @Override // X.InterfaceC30931Dil
    public final void ED3(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C57112jm c57112jm, int i) {
        C14360o3.A0B(c57112jm, 0);
        AbstractC167027dH.A13(view, c120985dq, c37644Ghd);
        if (AbstractC37647Ghg.A01(c120985dq.A01)) {
            C59072n8 A00 = C59062n7.A00(c120985dq, c37644Ghd, c120985dq.getId());
            A00.A00(this.A07.A01);
            A00.A00(this.A06);
            boolean z = this.A08;
            if (z) {
                Iterator it = this.A03.A00.iterator();
                while (it.hasNext()) {
                    ((InterfaceC673231x) it.next()).ABm(A00);
                }
            }
            if (!c37644Ghd.A0W) {
                A00.A00(this.A05);
            }
            UserSession userSession = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36315133898853416L)) {
                C37535Gfr c37535Gfr = this.A04;
                ((AbstractC64292vo) c37535Gfr).A00.put(c120985dq, view);
                A00.A00(c37535Gfr);
            }
            if (C18U.A06(c06090Tz, userSession, 36312720128214248L)) {
                C29175Ctg c29175Ctg = new C29175Ctg(C18U.A06(C06090Tz.A06, userSession, 36326880634222768L));
                c29175Ctg.A01.put(c120985dq, view);
                A00.A00(c29175Ctg);
            }
            for (InterfaceC43071ya interfaceC43071ya : this.A00) {
                if (C18U.A06(c06090Tz, userSession, 36318200505309197L) && (interfaceC43071ya instanceof BNG)) {
                    BNG bng = (BNG) interfaceC43071ya;
                    if (bng.A08) {
                        bng.A06.put(c120985dq, view);
                    }
                }
                A00.A00(interfaceC43071ya);
            }
            if (!z) {
                Iterator it2 = this.A03.A00.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC673231x) it2.next()).ABm(A00);
                }
            }
            AbstractC25227BEk.A10(view, A00, c57112jm);
            if (C18U.A06(c06090Tz, userSession, 36327069612849432L)) {
                C27909CRu c27909CRu = new C27909CRu(userSession, this.A02);
                String id = AbstractC25226BEj.A0y(c120985dq).getId();
                if (id != null) {
                    C4E9 c4e9 = c27909CRu.A01;
                    c120985dq.A06();
                    c4e9.A00(null, new C29450CyQ(c120985dq, c27909CRu, i), new BFT(view, c27909CRu.A02, "reels_ads", c27909CRu.A00.getModuleName(), id));
                }
            }
        }
    }

    public C25354BJx(Context context, FragmentActivity fragmentActivity, IntentAwareAdsInfo intentAwareAdsInfo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu, C25347BJq c25347BJq, C37529Gfl c37529Gfl, String str, String str2) {
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A07 = c37529Gfl;
        this.A03 = c25347BJq;
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A01;
        C14360o3.A07(c1bx);
        this.A05 = new C37533Gfp(context, fragmentActivity, intentAwareAdsInfo, c1bx, userSession, new C30W(userSession, null), interfaceC60442pS, interfaceC43589JPu, str, str2);
        this.A06 = new C37534Gfq(userSession, interfaceC60442pS, str);
        this.A00 = AbstractC166987dD.A1E();
        this.A04 = new C37535Gfr(userSession, interfaceC60442pS);
        this.A08 = C18U.A06(C06090Tz.A05, userSession, 36318526924200193L);
    }
}
