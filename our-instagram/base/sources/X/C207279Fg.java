package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.pando.PandoError;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.facebook.pando.Summary;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.9Fg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207279Fg extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207279Fg(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A01 = obj5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context;
        InterfaceC09390do interfaceC09390do;
        Context context2;
        InterfaceC09390do interfaceC09390do2;
        PandoGraphQLRequest pandoGraphQLRequest;
        String str;
        boolean z;
        boolean z2;
        InterfaceC16820sZ interfaceC16820sZ;
        int i;
        Fragment A0M;
        View view;
        String str2;
        String Au2;
        EnumC77173d3 enumC77173d3;
        Integer num;
        switch (this.A00) {
            case 0:
                PandoGraphQLServiceJNI pandoGraphQLServiceJNI = (PandoGraphQLServiceJNI) obj;
                try {
                    if (pandoGraphQLServiceJNI != null) {
                        C1Dk c1Dk = (C1Dk) this.A04;
                        if ((c1Dk instanceof PandoGraphQLRequest) && (pandoGraphQLRequest = (PandoGraphQLRequest) c1Dk) != null) {
                            C40851us c40851us = (C40851us) this.A05;
                            if (pandoGraphQLRequest.isMutation) {
                                pandoGraphQLRequest.setFreshCacheAgeMs(0L);
                                pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
                            }
                            C40841ur c40841ur = c40851us.A00;
                            if (c40841ur != null && (interfaceC16820sZ = c40841ur.A00) != null) {
                                str = (String) interfaceC16820sZ.invoke();
                            } else {
                                str = null;
                            }
                            boolean z3 = false;
                            if ((pandoGraphQLRequest.injectionCapabilities & 4) == 4) {
                                z3 = true;
                            }
                            boolean z4 = false;
                            if (!z3 || str == null) {
                                z = false;
                            } else {
                                z = AbstractC225079wW.A00(pandoGraphQLRequest.rootCallVariable, "actor_id", pandoGraphQLRequest.params, new TU7(str, 0));
                            }
                            if ((pandoGraphQLRequest.injectionCapabilities & 8) == 8) {
                                z2 = AbstractC225079wW.A00(pandoGraphQLRequest.rootCallVariable, "client_mutation_id", pandoGraphQLRequest.params, B1X.A00);
                            } else {
                                z2 = false;
                            }
                            if ((pandoGraphQLRequest.injectionCapabilities & 16) == 16) {
                                z4 = AbstractC225079wW.A00(pandoGraphQLRequest.rootCallVariable, AbstractC58317Pt9.A00(20), pandoGraphQLRequest.params, B1Y.A00);
                            }
                            if (z || z2 || z4) {
                                pandoGraphQLRequest.setQueryVariables(pandoGraphQLRequest.params, pandoGraphQLRequest.transientParams);
                            }
                            int i2 = pandoGraphQLRequest.injectionCapabilities;
                            boolean z5 = false;
                            if ((i2 & 128) == 128) {
                                z5 = true;
                            }
                            boolean z6 = false;
                            if ((i2 & 256) == 256) {
                                z6 = true;
                            }
                            boolean z7 = false;
                            C14360o3.A0B(c1Dk, 0);
                            boolean hasAcsToken = c1Dk.hasAcsToken();
                            boolean hasOhaiConfig = c1Dk.hasOhaiConfig();
                            boolean z8 = false;
                            if (z5 == hasAcsToken) {
                                z7 = true;
                            }
                            if (z6 == hasOhaiConfig) {
                                z8 = true;
                            }
                            if (!z7 || !z8) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList arrayList2 = new ArrayList();
                                if (!z7) {
                                    if (hasAcsToken) {
                                        arrayList2.add("ACS token");
                                    } else {
                                        arrayList.add("ACS token");
                                    }
                                }
                                if (!z8) {
                                    if (c1Dk.hasOhaiConfig()) {
                                        arrayList2.add("OHAI config");
                                    } else {
                                        arrayList.add("OHAI config");
                                    }
                                }
                                if (!(!arrayList.isEmpty())) {
                                    if (!arrayList2.isEmpty()) {
                                        throw new IllegalStateException(AnonymousClass001.A0g("Unexpected ", AbstractC001800i.A0P(" and ", "", "", arrayList2, null), " was provided to the request."));
                                    }
                                } else {
                                    throw new IllegalStateException(AnonymousClass001.A0g("Request was marked with @deidentified, but no ", AbstractC001800i.A0P(" or ", "", "", arrayList, null), " was provided."));
                                }
                            }
                            if (c40841ur != null && c40841ur.A03) {
                                pandoGraphQLRequest.addAdditionalHttpRequestParam("ig_legacy_dict_validate_null", "true");
                            }
                            final InterfaceC48192Ji interfaceC48192Ji = (InterfaceC48192Ji) this.A03;
                            final InterfaceC48212Jk interfaceC48212Jk = (InterfaceC48212Jk) this.A02;
                            return pandoGraphQLServiceJNI.initiate(null, pandoGraphQLRequest, new C48O(interfaceC48212Jk, interfaceC48192Ji) { // from class: X.48N
                                public final InterfaceC48212Jk A00;
                                public final InterfaceC48192Ji A01;
                                public final Throwable A02;

                                {
                                    Throwable th = new Throwable();
                                    C14360o3.A0B(interfaceC48192Ji, 1);
                                    this.A01 = interfaceC48192Ji;
                                    this.A00 = interfaceC48212Jk;
                                    this.A02 = th;
                                }

                                @Override // X.C48O
                                public final void DEA(PandoError pandoError) {
                                    InterfaceC48212Jk interfaceC48212Jk2 = this.A00;
                                    if (interfaceC48212Jk2 != null) {
                                        interfaceC48212Jk2.invoke(new X1y(new W5H(pandoError.additionalInfoFromRESTDoNotUseExceptForMigration), pandoError.message, this.A02));
                                    }
                                }

                                @Override // X.C48O
                                public final void Dx2(Summary summary, Object obj2) {
                                    this.A01.invoke(new C4OZ(summary, obj2));
                                }
                            }, (Executor) this.A01).cancelToken;
                        }
                        throw new IllegalStateException(AnonymousClass001.A0R("Pando Query Executor can only be used with Pando GraphQL Request, actual type is ", c1Dk.getClass().getName()));
                    }
                    throw new IllegalStateException("Attempted to execute a query with a null service. Most likely you either used executeAndSubscribe with a query executor that has not setup a consistency service, or you called executeAndSubscribe with a query executor that was intended to be for logged out calls.");
                } catch (IllegalStateException e) {
                    ((Executor) this.A01).execute(new RunnableC24571AuS((InterfaceC48212Jk) this.A02, e));
                    return new Object();
                }
            case 1:
                C2XB c2xb = (C2XB) obj;
                C14360o3.A0B(c2xb, 0);
                if (c2xb.A00.getAction() == 1) {
                    C77123cy c77123cy = (C77123cy) this.A03;
                    View view2 = c2xb.A01;
                    C14360o3.A06(view2);
                    int measuredHeight = view2.getMeasuredHeight();
                    C189478aR A00 = F86.A00(C3DN.A00.A01(view2.getContext()));
                    if (A00 != null && (A0M = A00.A03.A0M()) != null && (view = A0M.mView) != null) {
                        i = view.getHeight();
                    } else {
                        i = 0;
                    }
                    int[] iArr = new int[2];
                    view2.getLocationOnScreen(iArr);
                    A86 a86 = new A86((iArr[1] + C8S8.DEFAULT_SWIPE_ANIMATION_DURATION) - view2.getHeight(), measuredHeight, i);
                    C2XV.A00();
                    c77123cy.A00 = a86;
                }
                if (c2xb.A00.getAction() == 0) {
                    if (AbstractC166997dE.A0c(C06090Tz.A05, ((C170327il) this.A05).A03, 36322967919667996L).booleanValue()) {
                        C77123cy c77123cy2 = (C77123cy) this.A04;
                        View view3 = c2xb.A01;
                        C14360o3.A06(view3);
                        view3.getLocationInWindow(new int[2]);
                        Float valueOf = Float.valueOf(r2[1]);
                        C2XV.A00();
                        c77123cy2.A00 = valueOf;
                        C77123cy c77123cy3 = (C77123cy) this.A01;
                        View view4 = c2xb.A01;
                        C2XV.A00();
                        c77123cy3.A00 = view4;
                    }
                }
                return Boolean.valueOf(((GestureDetector) this.A02).onTouchEvent(c2xb.A00));
            case 2:
                context2 = (Context) obj;
                C14360o3.A0B(context2, 0);
                interfaceC09390do2 = ((C101024gI) this.A05).A05;
                return ((AnonymousClass422) interfaceC09390do2.getValue()).A00(context2, (C38321qM) this.A02, (C38321qM) this.A01, (InterfaceC60442pS) this.A03, (C75113Zb) this.A04);
            case 3:
                context = (Context) obj;
                C14360o3.A0B(context, 0);
                interfaceC09390do = ((C101024gI) this.A05).A06;
                return ((AbstractC86463tJ) interfaceC09390do.getValue()).A01(context, (C38321qM) this.A02, (C38321qM) this.A01, (InterfaceC60442pS) this.A03, (C75113Zb) this.A04);
            case 4:
                Context context3 = (Context) obj;
                C14360o3.A0B(context3, 0);
                return C79413go.A00.A00(context3, ((C105214ob) this.A05).A00, (C38321qM) this.A02, (C38321qM) this.A01, (InterfaceC60442pS) this.A03, (C75113Zb) this.A04, C3YE.A02);
            case 5:
                C3YD c3yd = (C3YD) obj;
                C14360o3.A0B(c3yd, 0);
                C38321qM c38321qM = (C38321qM) this.A01;
                C38321qM c38321qM2 = (C38321qM) this.A02;
                C75113Zb c75113Zb = (C75113Zb) this.A04;
                C105214ob c105214ob = (C105214ob) this.A05;
                return AbstractC86333t5.A00(c105214ob.A00, c38321qM, c38321qM2, (InterfaceC60442pS) this.A03, c75113Zb, c105214ob.A01.BRj(), c3yd, false);
            case 6:
                context2 = (Context) obj;
                C14360o3.A0B(context2, 0);
                interfaceC09390do2 = ((C105214ob) this.A05).A05;
                return ((AnonymousClass422) interfaceC09390do2.getValue()).A00(context2, (C38321qM) this.A02, (C38321qM) this.A01, (InterfaceC60442pS) this.A03, (C75113Zb) this.A04);
            case 7:
                context = (Context) obj;
                C14360o3.A0B(context, 0);
                interfaceC09390do = ((C105214ob) this.A05).A06;
                return ((AbstractC86463tJ) interfaceC09390do.getValue()).A01(context, (C38321qM) this.A02, (C38321qM) this.A01, (InterfaceC60442pS) this.A03, (C75113Zb) this.A04);
            case 8:
                C14360o3.A0B(obj, 0);
                AbstractC86463tJ abstractC86463tJ = (AbstractC86463tJ) this.A05;
                UserSession userSession = abstractC86463tJ.A00;
                C57532kS A002 = C57532kS.A00(userSession);
                C38321qM c38321qM3 = (C38321qM) this.A04;
                if (A002.A0N(c38321qM3)) {
                    enumC77173d3 = EnumC77173d3.A03;
                } else {
                    enumC77173d3 = EnumC77173d3.A02;
                }
                Context context4 = (Context) this.A01;
                if (abstractC86463tJ instanceof C86453tI) {
                    num = C05F.A1F;
                } else {
                    num = C05F.A0u;
                }
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A03;
                C3YD c3yd2 = (C3YD) this.A02;
                AbstractC41706Idc.A03(context4, interfaceC11380iw, userSession, new Aj7(context4, abstractC86463tJ, c38321qM3, c3yd2), enumC77173d3, c38321qM3, null, num, null, -1, -1, null, null, null, null, false, false);
                AbstractC86463tJ.A00(context4, abstractC86463tJ, c38321qM3, c3yd2);
                return C0eB.A00;
            case 9:
                Context context5 = (Context) obj;
                C14360o3.A0B(context5, 0);
                C5LQ c5lq = (C5LQ) this.A05;
                C38321qM c38321qM4 = (C38321qM) this.A03;
                C75113Zb c75113Zb2 = (C75113Zb) this.A04;
                Object obj2 = this.A02;
                InterfaceC76813cT interfaceC76813cT = (InterfaceC76813cT) this.A01;
                UserSession userSession2 = c5lq.A00;
                if (!C87153uY.A04(userSession2, c38321qM4)) {
                    if (AbstractC75103Za.A0J(c38321qM4)) {
                        Au2 = AbstractC75103Za.A06(context5, userSession2, c38321qM4, AbstractC47025Kqi.A00(userSession2, c38321qM4));
                    } else if (C14360o3.A0K(obj2, C5LW.A00)) {
                        Au2 = c38321qM4.A0C.Au2();
                    }
                    if (Au2 != null && !AbstractC001900j.A0T(Au2)) {
                        return Au2;
                    }
                }
                return interfaceC76813cT.C5v(context5, userSession2, c38321qM4, c75113Zb2);
            case 10:
                WeakReference weakReference = (WeakReference) obj;
                C14360o3.A0B(weakReference, 0);
                C38321qM c38321qM5 = (C38321qM) this.A02;
                String id = c38321qM5.getId();
                if (id != null) {
                    Integer num2 = (Integer) this.A01;
                    C77133cz c77133cz = (C77133cz) this.A05;
                    InterfaceC11380iw interfaceC11380iw2 = (InterfaceC11380iw) this.A04;
                    C75113Zb c75113Zb3 = (C75113Zb) this.A03;
                    C28358CfI c28358CfI = C28358CfI.A00;
                    UserSession userSession3 = c77133cz.A00;
                    String A2f = c38321qM5.A2f();
                    String moduleName = interfaceC11380iw2.getModuleName();
                    String BJN = c38321qM5.A0C.BJN();
                    String loggingInfoToken = c38321qM5.A0C.getLoggingInfoToken();
                    Integer valueOf2 = Integer.valueOf(c75113Zb3.getPosition());
                    C38321qM A1e = c38321qM5.A1e(c75113Zb3.A03);
                    if (A1e != null) {
                        str2 = A1e.getId();
                    } else {
                        str2 = null;
                    }
                    c28358CfI.A01(userSession3, c38321qM5.A1S(), c38321qM5, num2, valueOf2, Integer.valueOf(c75113Zb3.A03), id, A2f, moduleName, BJN, loggingInfoToken, str2, weakReference);
                }
                return C0eB.A00;
            case 11:
                C206189Bb c206189Bb = (C206189Bb) obj;
                C14360o3.A0B(c206189Bb, 0);
                C79293ga c79293ga = (C79293ga) this.A05;
                Context context6 = (Context) this.A01;
                C38321qM c38321qM6 = (C38321qM) this.A03;
                C75113Zb c75113Zb4 = (C75113Zb) this.A04;
                InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A02;
                if (c38321qM6.A4v()) {
                    return new C9BJ(((C41G) c79293ga.A07.getValue()).A00(context6, c38321qM6, c38321qM6, interfaceC60442pS, c75113Zb4));
                }
                if (c206189Bb.A01) {
                    return new C9BJ(c206189Bb);
                }
                return C86403tD.A00;
            default:
                int intValue = ((Number) obj).intValue();
                C80243iD c80243iD = (C80243iD) this.A04;
                if (intValue == c80243iD.A01) {
                    ((C3YH) this.A02).A01((UserSession) this.A05, (C75113Zb) this.A03, (InterfaceC86433tG) this.A01, c80243iD);
                }
                return C0eB.A00;
        }
    }
}
