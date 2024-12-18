package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.clips.model.metadata.PlaylistContext;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.List;

/* renamed from: X.BJr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25348BJr {
    public C37554GgA A00;
    public final Context A01;
    public final C29104CsV A02;
    public final UserSession A03;
    public final C57112jm A04;
    public final C37538Gfu A05;
    public final InterfaceC60442pS A06;
    public final InterfaceC43589JPu A07;
    public final C25354BJx A08;
    public final C37526Gfi A09;
    public final BK4 A0A;
    public final C25353BJw A0B;
    public final BK6 A0C;
    public final C25356BJz A0D;
    public final C25355BJy A0E;
    public final BK1 A0F;
    public final C25349BJs A0G;
    public final BK2 A0H;
    public final C25351BJu A0I;
    public final String A0J;
    public final List A0K;
    public final C64052vQ A0L;
    public final C25347BJq A0M;
    public final C37529Gfl A0N;
    public final String A0O;

    public final void A01(InterfaceC43071ya interfaceC43071ya) {
        C14360o3.A0B(interfaceC43071ya, 0);
        this.A0G.A00.add(interfaceC43071ya);
    }

    public final void A02(InterfaceC43071ya interfaceC43071ya) {
        C14360o3.A0B(interfaceC43071ya, 0);
        this.A08.A00.add(interfaceC43071ya);
    }

    public final C29106CsX A00() {
        return new C29106CsX(this.A03, this.A04, this.A06, this.A0O);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.CsV] */
    public C25348BJr(Context context, FragmentActivity fragmentActivity, C07T c07t, C07T c07t2, IntentAwareAdsInfo intentAwareAdsInfo, PlaylistContext playlistContext, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, C64052vQ c64052vQ, C5GV c5gv, SearchContext searchContext, InterfaceC43589JPu interfaceC43589JPu, C25347BJq c25347BJq, C37526Gfi c37526Gfi, String str, String str2, String str3, List list) {
        C14360o3.A0B(c07t2, 3);
        AbstractC167017dG.A1U(c57112jm, userSession);
        AbstractC167007dF.A1J(interfaceC60442pS, 8, interfaceC43589JPu);
        AbstractC25229BEm.A1M(searchContext, 12, playlistContext);
        C14360o3.A0B(c37526Gfi, 15);
        this.A01 = context;
        this.A0J = str;
        this.A04 = c57112jm;
        this.A03 = userSession;
        this.A06 = interfaceC60442pS;
        this.A07 = interfaceC43589JPu;
        this.A0O = str3;
        this.A0K = list;
        this.A09 = c37526Gfi;
        this.A0L = c64052vQ;
        this.A0M = c25347BJq;
        C37529Gfl c37529Gfl = new C37529Gfl(context, playlistContext, userSession, interfaceC60442pS, searchContext, interfaceC43589JPu);
        this.A0N = c37529Gfl;
        this.A02 = new Object();
        this.A0G = new C25349BJs(userSession, interfaceC60442pS, c25347BJq, c37529Gfl, str);
        this.A0I = new C25351BJu(userSession, interfaceC60442pS);
        this.A0B = new C25353BJw(c07t, c07t2, userSession, interfaceC60442pS, c5gv, interfaceC43589JPu);
        this.A08 = new C25354BJx(context, fragmentActivity, intentAwareAdsInfo, userSession, interfaceC60442pS, interfaceC43589JPu, c25347BJq, c37529Gfl, str, str2);
        this.A0E = new C25355BJy(userSession, interfaceC60442pS, c64052vQ, c25347BJq, c37526Gfi);
        this.A0D = new C25356BJz(c07t, userSession, interfaceC60442pS);
        this.A0F = new BK1(c07t, userSession, interfaceC60442pS, interfaceC43589JPu, c25347BJq);
        this.A0H = new BK2(userSession, interfaceC60442pS);
        this.A0A = new BK4(context, userSession, c57112jm, interfaceC60442pS, interfaceC43589JPu);
        this.A0C = new BK6(context, userSession, c57112jm, interfaceC60442pS, interfaceC43589JPu);
        this.A05 = new C37538Gfu(userSession, c57112jm, interfaceC60442pS.getModuleName());
    }
}
