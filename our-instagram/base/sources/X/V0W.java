package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class V0W extends AbstractC59962oe implements InterfaceC60122ou, XCM, XA8, InterfaceC25164BBk {
    public static final String __redex_internal_original_name = "PromoteWebsiteFragment";
    public XIGIGBoostCallToAction A00;
    public C70399WUb A01;
    public W65 A02;
    public FRW A03;
    public PromoteData A04;
    public String A05;
    public boolean A06;
    public W6E A07;
    public PromoteState A08;
    public UserSession A09;
    public final InterfaceC41501vz A0A = new C70723Wfo(this, 8);

    @Override // X.XCM
    public final void DGg() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r4.A00 == null) goto L12;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r5) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r0 = 2131971015(0x7f134bc7, float:1.9578997E38)
            r5.Efu(r0)
            X.AbstractC50523MSb.A1E(r5)
            com.instagram.common.session.UserSession r3 = r4.getSession()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321305766667578(0x810a090000253a, double:3.0330782487751676E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L4a
            android.content.Context r0 = r4.requireContext()
            X.FRW r3 = new X.FRW
            r3.<init>(r0, r5)
            r4.A03 = r3
            java.lang.Integer r2 = X.C05F.A1F
            r1 = 33
            X.WNO r0 = new X.WNO
            r0.<init>(r4, r1)
            r3.A00(r0, r2)
            X.FRW r2 = r4.A03
            if (r2 == 0) goto L4b
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L46
            boolean r0 = r4.A06
            if (r0 == 0) goto L46
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L47
        L46:
            r0 = 0
        L47:
            r2.A01(r0)
        L4a:
            return
        L4b:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0W.configureActionBar(X.2iU):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_website";
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0W.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(V0W v0w) {
        PromoteState promoteState = v0w.A08;
        if (promoteState != null) {
            XIGIGBoostDestination xIGIGBoostDestination = XIGIGBoostDestination.A0G;
            PromoteData promoteData = v0w.A04;
            if (promoteData != null) {
                promoteState.A05(xIGIGBoostDestination, promoteData);
                PromoteState promoteState2 = v0w.A08;
                if (promoteState2 != null) {
                    PromoteData promoteData2 = v0w.A04;
                    if (promoteData2 != null) {
                        promoteState2.A04(xIGIGBoostDestination, promoteData2);
                        AbstractC25226BEj.A1Q(v0w);
                        return;
                    }
                }
            }
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("promoteState");
        throw C00O.createAndThrow();
    }

    public static final void A02(V0W v0w) {
        String str;
        C193328hC A0O;
        int i;
        String str2 = v0w.A05;
        if (str2 != null) {
            if (!AbstractC001900j.A0a(str2, "wa.me", false)) {
                String str3 = v0w.A05;
                if (str3 != null) {
                    if (!AbstractC001900j.A0a(str3, "api.whatsapp.com", false)) {
                        FRW frw = v0w.A03;
                        if (frw != null) {
                            frw.A01.setIsLoading(true);
                        }
                        String str4 = v0w.A05;
                        if (str4 != null) {
                            PromoteData promoteData = v0w.A04;
                            if (promoteData != null) {
                                C70399WUb c70399WUb = v0w.A01;
                                if (c70399WUb == null) {
                                    str = "promoteLogger";
                                    C14360o3.A0F(str);
                                    throw C00O.createAndThrow();
                                }
                                VG4 vg4 = VG4.A0d;
                                C70557Wcn c70557Wcn = new C70557Wcn(v0w, 7);
                                C2JM c2jm = new C2JM();
                                C2JM c2jm2 = new C2JM();
                                c2jm.A04("destination_link", str4);
                                C40701ud A01 = AbstractC40691uc.A01(promoteData.A0y);
                                C2JQ c2jq = PandoGraphQLRequest.Companion;
                                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGPromoteWhatsAppLinkValidationQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67048UfZ.class, false, null, 0, null, "whatsapp_link_validation", new ArrayList());
                                A01.ATV(new C48147LSw(1, c70399WUb, c70557Wcn, vg4), new WW0(c70557Wcn, 6), pandoGraphQLRequest);
                                return;
                            }
                            str = "promoteData";
                            C14360o3.A0F(str);
                            throw C00O.createAndThrow();
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            PromoteData promoteData2 = v0w.A04;
            if (promoteData2 != null) {
                boolean A04 = C97F.A04(promoteData2);
                str = "promoteLogger";
                C70399WUb c70399WUb2 = v0w.A01;
                if (A04) {
                    if (c70399WUb2 != null) {
                        c70399WUb2.A0I(VG4.A0d, "reduce_hacky_way_promote_ctwa_dialog");
                        A0O = AbstractC31175DnJ.A0O(v0w);
                        A0O.A04();
                        A0O.A0A(2131970622);
                        A0O.A09(2131970620);
                        A0O.A0J(new WHP(v0w, 39), 2131970621);
                        i = 40;
                        A0O.A0D(new WHP(v0w, i));
                        AbstractC166987dD.A1W(A0O);
                        return;
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (c70399WUb2 != null) {
                    c70399WUb2.A0I(VG4.A0d, "reduce_hacky_way_promote_igwa_linking_dialog");
                    A0O = AbstractC31175DnJ.A0O(v0w);
                    A0O.A04();
                    A0O.A0A(2131970622);
                    A0O.A09(2131970623);
                    A0O.A0J(new WHP(v0w, 41), 2131970624);
                    i = 42;
                    A0O.A0D(new WHP(v0w, i));
                    AbstractC166987dD.A1W(A0O);
                    return;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            str = "promoteData";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A03(V0W v0w) {
        PromoteState promoteState = v0w.A08;
        String str = "promoteState";
        if (promoteState != null) {
            PromoteData promoteData = v0w.A04;
            str = "promoteData";
            if (promoteData != null) {
                promoteData.A0b = v0w.A00;
                promoteData.A1I = v0w.A05;
                promoteState.A04(XIGIGBoostDestination.A0E, promoteData);
                C70399WUb c70399WUb = v0w.A01;
                if (c70399WUb == null) {
                    str = "promoteLogger";
                } else {
                    VG4 vg4 = VG4.A0d;
                    PromoteData promoteData2 = v0w.A04;
                    if (promoteData2 != null) {
                        C70399WUb.A02(promoteData2.A0b, vg4, c70399WUb, null, null, null, null, null, null, null, "done_button", promoteData2.A1I, null, null, null, null);
                        AbstractC25226BEj.A1Q(v0w);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        UserSession userSession = this.A09;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC25164BBk
    public final void Czp() {
        W6E w6e = this.A07;
        if (w6e == null) {
            C14360o3.A0F("promoteDataFetcher");
            throw C00O.createAndThrow();
        }
        w6e.A03(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r4.A00 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r4.A00 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.V0W r4) {
        /*
            com.instagram.common.session.UserSession r3 = r4.getSession()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321305766667578(0x810a090000253a, double:3.0330782487751676E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L27
            X.W65 r2 = r4.A02
            if (r2 == 0) goto L26
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L22
            boolean r0 = r4.A06
            if (r0 == 0) goto L22
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L23
        L22:
            r0 = 0
        L23:
            r2.A04(r0)
        L26:
            return
        L27:
            X.FRW r2 = r4.A03
            if (r2 == 0) goto L26
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L38
            boolean r0 = r4.A06
            if (r0 == 0) goto L38
            com.instagram.api.schemas.XIGIGBoostCallToAction r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L39
        L38:
            r0 = 0
        L39:
            r2.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0W.A00(X.V0W):void");
    }

    @Override // X.XA8
    public final void CuW() {
        A02(this);
    }

    @Override // X.XCM
    public final void DGp(C67835Uz8 c67835Uz8) {
        A01(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-376728997);
        super.onCreate(bundle);
        this.A04 = InterfaceC72021XFj.A00(this);
        this.A08 = XFZ.A00(this);
        PromoteData promoteData = this.A04;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        this.A09 = promoteData.A0y;
        this.A01 = C70399WUb.A00(getSession());
        UserSession session = getSession();
        FragmentActivity activity = getActivity();
        this.A07 = new W6E(activity, activity, session);
        AbstractC25651Mw.A00(getSession()).A01(this.A0A, C23613Ad8.class);
        C0f9.A09(-43139459, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(998903975);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_website_view, viewGroup, false);
        C0f9.A09(-33677029, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(391184275);
        super.onDestroy();
        AbstractC25651Mw.A00(getSession()).A02(this.A0A, C23613Ad8.class);
        C0f9.A09(-581015385, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(1579296605);
        super.onDestroyView();
        C70399WUb c70399WUb = this.A01;
        if (c70399WUb == null) {
            str = "promoteLogger";
        } else {
            PromoteData promoteData = this.A04;
            if (promoteData == null) {
                str = "promoteData";
            } else {
                c70399WUb.A0C(VG4.A0d, promoteData);
                C0f9.A09(418542319, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
