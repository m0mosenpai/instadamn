package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: X.7Hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160607Hu {
    public int A00;
    public int A01;
    public ViewGroup A02;
    public C7P0 A03;
    public JUI A04;
    public C47929LEy A05;
    public LG2 A06;
    public C47579Kzp A07;
    public JU2 A08;
    public SmartSuggestion A09;
    public LGj A0A;
    public L4K A0B;
    public Integer A0C;
    public Integer A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public LinearLayout A0J;
    public final Activity A0K;
    public final Context A0L;
    public final UserSession A0M;
    public final C159777Ep A0N;
    public final InterfaceC83703oF A0O;
    public final List A0P;
    public final LayoutInflater A0Q;
    public final ViewStub A0R;
    public final InterfaceC11380iw A0S;

    public C160607Hu(Activity activity, Context context, LayoutInflater layoutInflater, ViewStub viewStub, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C159777Ep c159777Ep, InterfaceC83703oF interfaceC83703oF, List list) {
        C14360o3.A0B(viewStub, 6);
        C14360o3.A0B(list, 9);
        this.A0O = interfaceC83703oF;
        this.A0L = context;
        this.A0M = userSession;
        this.A0S = interfaceC11380iw;
        this.A0K = activity;
        this.A0R = viewStub;
        this.A0N = c159777Ep;
        this.A0Q = layoutInflater;
        this.A0P = list;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A0E = obj;
    }

    public static final void A00(C160607Hu c160607Hu) {
        ViewGroup viewGroup = c160607Hu.A02;
        if (viewGroup == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        c160607Hu.A00 = Math.min(c160607Hu.A0I, c160607Hu.A01);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.height = c160607Hu.A00;
        viewGroup.setLayoutParams(layoutParams);
    }

    public static final void A01(C160607Hu c160607Hu, EnumC82333lv enumC82333lv, String str) {
        String str2;
        if (c160607Hu.A02 == null) {
            ViewStub viewStub = c160607Hu.A0R;
            viewStub.setLayoutResource(R.layout.suggested_reply_container);
            View inflate = viewStub.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            c160607Hu.A02 = viewGroup;
            if (viewGroup == null) {
                str2 = "rootView";
            } else {
                c160607Hu.A0J = (LinearLayout) viewGroup.findViewById(R.id.suggested_reply_container);
                UserSession userSession = c160607Hu.A0M;
                c160607Hu.A04 = JUJ.A00(userSession);
                AbstractC92784Dr.A02(c160607Hu.A0O);
                LG2 lg2 = new LG2(userSession, (String) AbstractC001800i.A0O(c160607Hu.A0P, 0));
                c160607Hu.A06 = lg2;
                UserSession userSession2 = lg2.A02;
                if (C18U.A06(C06090Tz.A06, userSession2, 36316173281136733L)) {
                    C2JM c2jm = new C2JM();
                    C2JM c2jm2 = new C2JM();
                    C2JQ c2jq = PandoGraphQLRequest.Companion;
                    C1Dk freshCacheAgeMs = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGPreviousReplyMessageSuggestionListQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), QmG.class, false, PandoRealtimeInfoJNI.forLiveQuery("igd_business_my_sayt_list_query"), 0, null, AbstractC58317Pt9.A00(1104), new ArrayList()).setFreshCacheAgeMs(86400000L);
                    AbstractC40691uc.A01(userSession2).ATV(AXm.A00, new C64010Sxh(lg2), freshCacheAgeMs);
                } else {
                    lg2.A01.A02(C137756Lx.A03.A01(userSession2, EnumC132075xi.A0F).A01.A05.A0L(new C6D2() { // from class: X.LaB
                        @Override // X.C6D2
                        public final Object apply(Object obj) {
                            C137766Ly c137766Ly = C137766Ly.A0L;
                            return C42221xC.A07(new C43645JSd(obj, 3), AbstractC137146It.A00("load_previous_replies"));
                        }
                    }).A0K(new C48346LaM(lg2)), PKH.A00);
                }
                InterfaceC11380iw interfaceC11380iw = c160607Hu.A0S;
                c160607Hu.A0A = new LGj(interfaceC11380iw, userSession);
                c160607Hu.A08 = new JU2(interfaceC11380iw, userSession, EnumC31318Dpe.A04);
                c160607Hu.A07 = new C47579Kzp(interfaceC11380iw, userSession);
                c160607Hu.A03 = new C7P0(interfaceC11380iw, userSession);
                Context context = c160607Hu.A0L;
                LGj lGj = c160607Hu.A0A;
                if (lGj == null) {
                    str2 = "suggestedReplyLogger";
                } else {
                    c160607Hu.A05 = new C47929LEy(context, userSession, new C47422KxD(c160607Hu), lGj);
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C47929LEy c47929LEy = c160607Hu.A05;
        str2 = "bottomSheetController";
        if (c47929LEy != null) {
            C14360o3.A0B(enumC82333lv, 0);
            c47929LEy.A00 = enumC82333lv;
            C47929LEy c47929LEy2 = c160607Hu.A05;
            if (c47929LEy2 != null) {
                c47929LEy2.A03 = str;
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0165, code lost:
    
        if (r9 < 3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b7, code lost:
    
        r24.A0I = r5;
        A00(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01bc, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C160607Hu r24, java.util.List r25, X.InterfaceC16660sJ r26) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C160607Hu.A02(X.7Hu, java.util.List, X.0sJ):void");
    }
}
