package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class C2Y extends AbstractC65902yS {
    public final Context A00;
    public final InterfaceC09390do A01;
    public final FragmentActivity A02;
    public final C07X A03;
    public final C62862tP A04;
    public final UserSession A05;
    public final C39G A06;
    public final C4FY A07;
    public final InterfaceC60442pS A08;
    public final C149566o8 A09;
    public final HashMap A0A;
    public final HashMap A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2Y(Context context, FragmentActivity fragmentActivity, C07X c07x, C62862tP c62862tP, UserSession userSession, C39G c39g, C4FY c4fy, InterfaceC60442pS interfaceC60442pS) {
        super(context, c07x, userSession, null, new DRQ(userSession, 41), DOE.A00, 152);
        AbstractC167017dG.A1P(context, userSession);
        AbstractC167017dG.A1U(c4fy, c39g);
        C14360o3.A0B(fragmentActivity, 8);
        this.A00 = context;
        this.A05 = userSession;
        this.A03 = c07x;
        this.A08 = interfaceC60442pS;
        this.A04 = c62862tP;
        this.A07 = c4fy;
        this.A06 = c39g;
        this.A02 = fragmentActivity;
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGY(this, 20));
        this.A09 = new C149566o8(context, userSession);
        this.A0B = AbstractC166987dD.A1G();
        this.A0A = AbstractC166987dD.A1G();
    }

    @Override // X.AbstractC65902yS
    public final int A01() {
        return AbstractC167027dH.A01(this.A01);
    }

    @Override // X.AbstractC65902yS
    public final AbstractC50812Vc A02(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        String id;
        boolean A1a = AbstractC167017dG.A1a(interfaceC16820sZ, interfaceC16820sZ2);
        C26082BgB c26082BgB = (C26082BgB) interfaceC16820sZ.invoke();
        C120985dq c120985dq = (C120985dq) c26082BgB.A01;
        C37644Ghd c37644Ghd = (C37644Ghd) c26082BgB.A03;
        ClipsViewerConfig clipsViewerConfig = (ClipsViewerConfig) c26082BgB.A04;
        Object obj = c26082BgB.A02;
        Context context = this.A00;
        UserSession userSession = this.A05;
        InterfaceC60442pS interfaceC60442pS = this.A08;
        C62862tP c62862tP = this.A04;
        C149566o8 c149566o8 = this.A09;
        int i = this.A07.A00;
        HashMap hashMap = this.A0B;
        C41176IKp c41176IKp = (C41176IKp) c26082BgB.A00;
        C39G c39g = this.A06;
        FragmentActivity fragmentActivity = this.A02;
        HashMap hashMap2 = this.A0A;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            Object obj2 = hashMap2.get(id);
            Object obj3 = obj2;
            if (obj2 == null) {
                C2XI c2xi = new C2XI(AbstractC25227BEk.A0m());
                hashMap2.put(id, c2xi);
                obj3 = c2xi;
            }
            C2XI c2xi2 = (C2XI) obj3;
            C14360o3.A0B(c37644Ghd, A1a ? 1 : 0);
            AbstractC25234BEr.A1R(clipsViewerConfig, obj, context, userSession, interfaceC60442pS);
            AbstractC25229BEm.A1K(c149566o8, 8, hashMap);
            AbstractC25234BEr.A1Q(c41176IKp, c39g, fragmentActivity);
            C14360o3.A0B(c2xi2, 15);
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null) {
                C75113Zb c75113Zb = c37644Ghd.A0E;
                if (c75113Zb != null) {
                    SearchContext searchContext = new SearchContext(null, null, null, null, null, null, null, null);
                    C29404Cxb c29404Cxb = new C29404Cxb();
                    C37671Gi4 c37671Gi4 = new C37671Gi4(userSession);
                    MVO mvo = new MVO(userSession);
                    C37789Gk4 A00 = AbstractC37564GgK.A00(userSession, c29404Cxb, interfaceC60442pS.getModuleName());
                    IG5 ig5 = new IG5(c38321qM2.getId());
                    BLK blk = (BLK) new BK9(A00, clipsViewerConfig, userSession, mvo, c29404Cxb, null, new C37542Gfy(A00, userSession, interfaceC60442pS, mvo, searchContext, c29404Cxb, ig5, c37671Gi4), new C37522Gfe(new C37531Gfn(userSession), clipsViewerConfig, userSession, "feed_timeline", c38321qM2.getId()), ig5, c37671Gi4).A0S.getValue();
                    CU0 cu0 = new CU0(fragmentActivity, userSession, interfaceC60442pS);
                    BLJ A05 = blk.A05(clipsViewerConfig, c120985dq, c37644Ghd, c75113Zb.getPosition());
                    C25385BLc A06 = blk.A06();
                    A06.EXv(new BVI(cu0, 44));
                    A06.EXy(new BVI(cu0, 45));
                    A06.EXA(new C29912DHa(15, c38321qM2, cu0, c75113Zb));
                    A06.EXw(new C30713DfB(32, c41176IKp, c75113Zb));
                    A06.EXV(c41176IKp.A03);
                    A06.EY0(new C30753Dfq(c41176IKp, 9));
                    C43061J2b c43061J2b = new C43061J2b(fragmentActivity, c2xi2, userSession, c39g, c41176IKp, interfaceC60442pS, c75113Zb, cu0, hashMap);
                    C29113Cse c29113Cse = new C29113Cse();
                    HashMap A1G = AbstractC166987dD.A1G();
                    C42204Imq c42204Imq = new C42204Imq(c120985dq, userSession, c75113Zb);
                    C006802i c006802i = C006802i.A0p;
                    C14360o3.A07(c006802i);
                    C9I7 c9i7 = new C9I7(c006802i);
                    if (c62862tP != null) {
                        C29562D0o c29562D0o = new C29562D0o();
                        return new BLI(c2xi2, AbstractC25225BEi.A0p(AbstractC25229BEm.A0K(i)), c62862tP, null, clipsViewerConfig, c42204Imq, c29113Cse, userSession, null, interfaceC60442pS, c149566o8, null, c9i7, new C676533f(AbstractC13330mJ.A00(context), null, userSession, interfaceC60442pS), c43061J2b, new C29545Czx(context, i), null, new C29546Czy(), null, A06, A05, c29562D0o, new C37616GhB(userSession, interfaceC60442pS), null, "12345", null, null, hashMap, A1G, null, false, false);
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC65902yS
    public final void A06(LithoView lithoView, InterfaceC16820sZ interfaceC16820sZ) {
        String id;
        C25370BKn c25370BKn;
        lithoView.setBackgroundColor(AbstractC167007dF.A09(AbstractC53172bz.A01(AbstractC13330mJ.A00(this.A00)), R.attr.igds_color_primary_background));
        C26082BgB c26082BgB = (C26082BgB) interfaceC16820sZ.invoke();
        Object tag = lithoView.getTag();
        C14360o3.A0C(tag, AbstractC111324zv.A00(1140));
        Object obj = ((C81253jv) tag).A00;
        C120985dq c120985dq = (C120985dq) c26082BgB.A01;
        C75113Zb c75113Zb = ((C37644Ghd) c26082BgB.A03).A0E;
        if (c75113Zb != null) {
            AbstractC167007dF.A1K(c120985dq, obj);
            if ((obj instanceof C51) && (c25370BKn = (C25370BKn) obj) != null) {
                c25370BKn.A00 = c120985dq;
                c25370BKn.A03 = c75113Zb;
            }
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                this.A0B.put(id, obj);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC65902yS
    public final String A04() {
        return "LITHO_FULL_HEIGHT_SINGLE_MEDIA_CLIPS_UI";
    }
}
