package com.instagram.genericsurvey.fragment;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC10360h2;
import X.AbstractC111324zv;
import X.AbstractC12120kG;
import X.AbstractC125325le;
import X.AbstractC12990ll;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25230BEn;
import X.AbstractC25231BEo;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31177DnL;
import X.AbstractC31179DnN;
import X.AbstractC31180DnO;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC37303Gc4;
import X.AbstractC37304Gc5;
import X.AbstractC37505GfN;
import X.AbstractC40654I0m;
import X.AbstractC40655I0n;
import X.AbstractC43591JPw;
import X.AbstractC60492pY;
import X.AbstractC60622pl;
import X.AbstractC66261U6f;
import X.AbstractC68579VWg;
import X.AnonymousClass341;
import X.AnonymousClass391;
import X.AnonymousClass396;
import X.C00O;
import X.C05F;
import X.C0f9;
import X.C105854pw;
import X.C11500j9;
import X.C11520jB;
import X.C140326Wl;
import X.C140966Yy;
import X.C14360o3;
import X.C150956qv;
import X.C1I2;
import X.C1M1;
import X.C1M3;
import X.C1ON;
import X.C1OU;
import X.C218914p;
import X.C25621Ms;
import X.C31559Dtj;
import X.C33A;
import X.C33F;
import X.C33P;
import X.C36Q;
import X.C36Y;
import X.C37816GkW;
import X.C38287GsW;
import X.C38321qM;
import X.C38492GwD;
import X.C38611qr;
import X.C38896HAs;
import X.C38E;
import X.C38K;
import X.C39030HGg;
import X.C39140HKt;
import X.C3CO;
import X.C3G2;
import X.C3M4;
import X.C3XG;
import X.C3u9;
import X.C41008IEd;
import X.C41021IEq;
import X.C41222IMn;
import X.C41228IMt;
import X.C41232IMx;
import X.C41708Ide;
import X.C42251Inb;
import X.C42665IuM;
import X.C42790IwS;
import X.C50152MDf;
import X.C55942hf;
import X.C56352iT;
import X.C57112jm;
import X.C57251PbZ;
import X.C57332k8;
import X.C5I8;
import X.C60972qL;
import X.C61142qc;
import X.C61372qz;
import X.C64362vv;
import X.C675132q;
import X.C676533f;
import X.C683736a;
import X.C684436h;
import X.C684636j;
import X.C71163Hc;
import X.C82713mZ;
import X.EnumC09460dv;
import X.HEH;
import X.HLZ;
import X.IGH;
import X.IKO;
import X.IMQ;
import X.IQW;
import X.InterfaceC09390do;
import X.InterfaceC12870lZ;
import X.InterfaceC41501vz;
import X.InterfaceC43439JHd;
import X.InterfaceC53712dA;
import X.InterfaceC56362iU;
import X.InterfaceC57142jp;
import X.InterfaceC58290Psi;
import X.InterfaceC60072op;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC60602pj;
import X.InterfaceC63912vC;
import X.InterfaceC63932vE;
import X.J39;
import X.J5I;
import X.LJW;
import X.MSV;
import X.S88;
import X.ViewOnClickListenerC42032Ik1;
import X.ViewOnTouchListenerC60632pm;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class GenericSurveyFragment extends C38K implements InterfaceC60442pS, InterfaceC12870lZ, InterfaceC60072op, InterfaceC63932vE, AbsListView.OnScrollListener, InterfaceC60122ou, InterfaceC63912vC, InterfaceC43439JHd {
    public long A01;
    public long A02;
    public long A03;
    public ViewGroup A04;
    public HEH A05;
    public C41222IMn A06;
    public C41232IMx A07;
    public C38896HAs A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public IGH A0E;
    public C57112jm A0F;
    public C3CO A0G;
    public C33P A0H;
    public C38E A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public final InterfaceC09390do A0O;
    public ViewGroup contentContainer;
    public ViewGroup endScreen;
    public ViewStub endScreenViewStub;
    public SpinnerImageView loadingSpinner;
    public C41228IMt navbarController;
    public ViewGroup retryView;
    public ViewStub retryViewStub;
    public final C61372qz A0T = new C61372qz();
    public final C1M1 A0U = C1M3.A00();
    public final InterfaceC09390do A0P = AbstractC60492pY.A02(this);
    public final List A0N = AbstractC166987dD.A1E();
    public int A00 = -1;
    public final C684636j A0S = new Object();
    public final InterfaceC41501vz A0Q = C37816GkW.A00(this, 7);
    public final InterfaceC41501vz A0R = C37816GkW.A00(this, 8);
    public final String A0M = "GenericSurveyFragment";

    public final void A0b(Reel reel, InterfaceC58290Psi interfaceC58290Psi, List list) {
        HEH heh = this.A05;
        if (heh == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        heh.A03.A06 = true;
        C38E c38e = this.A0I;
        if (c38e == null) {
            c38e = new C38E(this, AbstractC166987dD.A0r(this.A0P), AbstractC37301Gc2.A0L(this));
        }
        this.A0I = c38e;
        c38e.A0C = this.A0U.getSessionId();
        c38e.A05 = new C31559Dtj(getRootActivity(), interfaceC58290Psi.Ahl(), new C42790IwS(this, 1), C05F.A01);
        c38e.A07(reel, C3G2.A1d, interfaceC58290Psi, list, list, 0);
    }

    @Override // X.InterfaceC63932vE
    public final void Dcd(C41222IMn c41222IMn, C41232IMx c41232IMx) {
        C14360o3.A0B(c41232IMx, 0);
        this.A07 = c41232IMx;
        this.A06 = c41222IMn;
    }

    @Override // X.InterfaceC63912vC
    public final void DmK() {
    }

    @Override // X.InterfaceC63912vC
    public final void DmM() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        int i2;
        C14360o3.A0B(interfaceC56362iU, 0);
        C41228IMt c41228IMt = this.navbarController;
        if (c41228IMt != null) {
            c41228IMt.A01(requireContext(), interfaceC56362iU);
        }
        if (this.A0C) {
            C38896HAs c38896HAs = this.A08;
            if (c38896HAs != null) {
                C41228IMt c41228IMt2 = this.navbarController;
                if (c41228IMt2 != null) {
                    String str = c38896HAs.A03;
                    if (str != null) {
                        boolean z = this.A0B;
                        boolean z2 = c38896HAs.A07;
                        boolean z3 = c38896HAs.A08;
                        TextView textView = c41228IMt2.A01;
                        String str2 = "pageTitle";
                        if (textView != null) {
                            textView.setText(str);
                            TextView textView2 = c41228IMt2.A00;
                            if (textView2 == null) {
                                str2 = "pageIndicator";
                            } else {
                                textView2.setVisibility(AbstractC167007dF.A05(z2 ? 1 : 0));
                                if (!z2) {
                                    TextView textView3 = c41228IMt2.A01;
                                    if (textView3 != null) {
                                        textView3.setTextSize(0, c41228IMt2.A02.getDimension(R.dimen.font_large));
                                    }
                                }
                                if (z) {
                                    i = 2131961124;
                                    i2 = 32;
                                } else if (z3) {
                                    i = 2131974123;
                                    i2 = 33;
                                }
                                interfaceC56362iU.AAF(ViewOnClickListenerC42032Ik1.A00(c41228IMt2, i2), i);
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                C41228IMt c41228IMt3 = this.navbarController;
                if (c41228IMt3 != null) {
                    c41228IMt3.A00(this.A00, c38896HAs.A00, this.A0N.size());
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57112jm c57112jm = this.A0F;
        if (c57112jm == null) {
            C14360o3.A0F("viewpointManager");
            throw C00O.createAndThrow();
        }
        int i = 0;
        c57112jm.A08(AbstractC37300Gc1.A02(this), C71163Hc.A00(this), new InterfaceC57142jp[0]);
        SpinnerImageView spinnerImageView = this.loadingSpinner;
        if (spinnerImageView != null) {
            if (this.A0C) {
                i = 8;
            }
            spinnerImageView.setVisibility(i);
        }
        if (this.A0B) {
            A02(this);
        } else {
            C218914p.A05(this);
            AbstractC37300Gc1.A02(this).setOnScrollListener(this);
        }
    }

    public static final void A01(GenericSurveyFragment genericSurveyFragment) {
        String str;
        UserSession A0r = AbstractC166987dD.A0r(genericSurveyFragment.A0P);
        String str2 = genericSurveyFragment.A09;
        if (str2 == null) {
            str = "surveyType";
        } else {
            String str3 = genericSurveyFragment.A0J;
            if (str3 == null) {
                str = "extraDataToken";
            } else {
                C25621Ms A0D = AbstractC31179DnN.A0D(A0r);
                A0D.A0B("survey/get/");
                A0D.A9s(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                AbstractC37303Gc4.A15(A0D);
                A0D.A0H("extra_data_token", str3);
                C1ON A0e = AbstractC25227BEk.A0e(A0D, C38896HAs.class, C41708Ide.class);
                C39030HGg.A00(A0e, genericSurveyFragment, 9);
                genericSurveyFragment.schedule(A0e);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A02(GenericSurveyFragment genericSurveyFragment) {
        C41008IEd c41008IEd;
        KeyEvent.Callback callback;
        AbstractC167007dF.A0x(genericSurveyFragment.contentContainer);
        C38896HAs c38896HAs = genericSurveyFragment.A08;
        if (c38896HAs != null && (c41008IEd = c38896HAs.A01) != null) {
            int intValue = c41008IEd.A01.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    ViewGroup viewGroup = genericSurveyFragment.endScreen;
                    if (viewGroup == null) {
                        ViewStub viewStub = genericSurveyFragment.endScreenViewStub;
                        viewGroup = null;
                        if (viewStub != null) {
                            callback = viewStub.inflate();
                        } else {
                            callback = null;
                        }
                        if (callback instanceof ViewGroup) {
                            viewGroup = (ViewGroup) callback;
                        }
                        genericSurveyFragment.endScreen = viewGroup;
                    }
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            Context requireContext = genericSurveyFragment.requireContext();
            ViewGroup viewGroup2 = genericSurveyFragment.A04;
            if (viewGroup2 != null) {
                View A00 = IQW.A00(requireContext, viewGroup2);
                Object tag = A00.getTag();
                if (tag != null) {
                    C38492GwD c38492GwD = (C38492GwD) tag;
                    C38611qr c38611qr = c41008IEd.A00;
                    if (c38611qr != null) {
                        IQW.A01(genericSurveyFragment, genericSurveyFragment, c38492GwD, new C42665IuM(), new C105854pw(c38611qr));
                        ViewGroup viewGroup3 = genericSurveyFragment.A04;
                        if (viewGroup3 != null) {
                            viewGroup3.addView(A00);
                        }
                        ViewGroup viewGroup4 = genericSurveyFragment.A04;
                        if (viewGroup4 == null) {
                            return;
                        }
                        viewGroup4.invalidate();
                        return;
                    }
                    C14360o3.A0F("simpleActionDict");
                    throw C00O.createAndThrow();
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static final void A04(GenericSurveyFragment genericSurveyFragment) {
        AbstractC13880nE.A0O(genericSurveyFragment.mView);
        genericSurveyFragment.A02 = System.currentTimeMillis();
        genericSurveyFragment.A03 = 0L;
        HEH heh = genericSurveyFragment.A05;
        if (heh != null) {
            IMQ imq = heh.A03;
            if (imq.A07) {
                heh.A02.A01.A0C("context_switch", true);
            }
            heh.A04.clear();
            imq.A08.clear();
            imq.A00(0);
            imq.A05 = false;
            imq.A04 = false;
            imq.A00 = 0;
            imq.A02 = 0;
            imq.A06 = false;
            imq.A07 = false;
            heh.A01.A04();
            HEH.A00(heh);
            int i = genericSurveyFragment.A00;
            List list = genericSurveyFragment.A0N;
            if (i >= AbstractC25226BEj.A05(list)) {
                genericSurveyFragment.A0B = true;
                A03(genericSurveyFragment);
                A02(genericSurveyFragment);
                return;
            }
            C33P c33p = genericSurveyFragment.A0H;
            if (c33p != null) {
                if (C3u9.A00(c33p.A0G.A0J())) {
                    C33P c33p2 = genericSurveyFragment.A0H;
                    if (c33p2 != null) {
                        c33p2.A0C("context_switch");
                    }
                }
                genericSurveyFragment.A00++;
                A03(genericSurveyFragment);
                HEH heh2 = genericSurveyFragment.A05;
                if (heh2 != null) {
                    List list2 = ((C41021IEq) list.get(genericSurveyFragment.A00)).A01;
                    if (list2 != null) {
                        heh2.A0C(list2);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
            C14360o3.A0F("feedVideoModule");
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r28.equals("done_button") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05(java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genericsurvey.fragment.GenericSurveyFragment.A05(java.lang.String):void");
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return AbstractC166987dD.A0o(this.A0P);
    }

    @Override // X.InterfaceC43439JHd
    public final void D3i() {
        A05("close_button");
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            abstractC10360h2.A0b();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC43439JHd
    public final void D3m() {
        A05("done_button");
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            abstractC10360h2.A0b();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        r3.A00(r1);
        X.HEH.A00(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        return;
     */
    @Override // X.InterfaceC43439JHd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D4W() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genericsurvey.fragment.GenericSurveyFragment.D4W():void");
    }

    @Override // X.InterfaceC63932vE
    public final /* bridge */ /* synthetic */ void DHF(Object obj, Object obj2) {
        C41222IMn c41222IMn = (C41222IMn) obj;
        IMQ imq = (IMQ) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, c41222IMn, imq);
        C38896HAs c38896HAs = this.A08;
        if (c38896HAs != null) {
            List list = c38896HAs.A06;
            if (list != null) {
                String str = c38896HAs.A04;
                if (str != null) {
                    String str2 = this.A09;
                    if (str2 == null) {
                        C14360o3.A0F("surveyType");
                        throw C00O.createAndThrow();
                    }
                    String str3 = ((C41021IEq) list.get(this.A00)).A00;
                    if (str3 != null) {
                        int i = imq.A01;
                        InterfaceC09390do interfaceC09390do = this.A0P;
                        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
                        String A00 = MSV.A00(245);
                        C14360o3.A0B(A0o, 7);
                        C82713mZ A0M = AbstractC37302Gc3.A0M(this, "instagram_survey_", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                        A0M.A6O = A00;
                        A0M.A7F = str;
                        A0M.A7G = str2;
                        A0M.A6N = str3;
                        A0M.A0Z = i;
                        ArrayList A1E = AbstractC166987dD.A1E();
                        C41232IMx A01 = c41222IMn.A01(i);
                        C11520jB A0B = AbstractC37300Gc1.A0B();
                        A0B.A0A("question_id", A01.A03.A03);
                        A0B.A0C("answers", A01.A00());
                        A1E.add(A0B);
                        A0M.A89 = A1E;
                        A0M.A0m = AbstractC37300Gc1.A0B();
                        AbstractC37304Gc5.A1P(A0o, A0M);
                        C41222IMn c41222IMn2 = this.A06;
                        if (c41222IMn2 != null) {
                            int i2 = imq.A01;
                            Type type = S88.A00;
                            ArrayList A1E2 = AbstractC166987dD.A1E();
                            C41232IMx A012 = c41222IMn2.A01(i2);
                            String str4 = A012.A03.A03;
                            List A0X = AbstractC001800i.A0X(A012.A00());
                            if (str4 != null && AbstractC166987dD.A1b(A0X)) {
                                AbstractC166997dE.A1R(str4, A0X, A1E2);
                            }
                            if (A1E2.isEmpty()) {
                                AbstractC12120kG.A07(this.A0M, "Unable to log survey response event ig_survey_response due to empty rapid feedback logger responses, using old survey response format", null);
                                String str5 = c41222IMn.A01(imq.A01).A03.A03;
                                List A0X2 = AbstractC001800i.A0X(c41222IMn.A01(imq.A01).A00());
                                if (str5 != null && AbstractC166987dD.A1b(A0X2)) {
                                    A1E2 = AbstractC16960so.A1M(AbstractC25230BEn.A1b(str5, A0X2));
                                }
                            }
                            AbstractC68579VWg.A00(AbstractC166987dD.A0r(interfaceC09390do)).A04(A1E2, this.A02, this.A01, imq.A01, A1R);
                        }
                        if (this.A06 == null) {
                            AbstractC12120kG.A07(this.A0M, "Unable to log survey response event ig_survey_response due to currentSurveyQuestionModule being null", null);
                        }
                        View requireView = requireView();
                        C55942hf c55942hf = C150956qv.A02;
                        AbstractC125325le A013 = AbstractC125325le.A01(requireView, 0);
                        A013.A0G();
                        A013.A0K(0.0f);
                        A013.A0H();
                        AbstractC13880nE.A0O(this.mView);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC63932vE
    public final /* bridge */ /* synthetic */ void DHH(Object obj, Object obj2) {
        C3XG c3xg;
        C41222IMn c41222IMn = (C41222IMn) obj;
        IMQ imq = (IMQ) obj2;
        boolean A1R = AbstractC167007dF.A1R(0, c41222IMn, imq);
        C38896HAs c38896HAs = this.A08;
        if (c38896HAs != null) {
            String str = c38896HAs.A04;
            if (str != null) {
                List list = this.A0N;
                C41021IEq c41021IEq = (C41021IEq) list.get(this.A00);
                C11520jB A0B = AbstractC37300Gc1.A0B();
                Integer num = imq.A03;
                if (num != null && num == C05F.A0C) {
                    A0B.A05(C5I8.A8g, Boolean.valueOf(imq.A06));
                    A0B.A05(C5I8.A8h, Boolean.valueOf(imq.A07));
                    C11500j9 c11500j9 = C5I8.A8f;
                    HEH heh = this.A05;
                    if (heh != null) {
                        A0B.A05(c11500j9, Boolean.valueOf(heh.A02.A01.A0D()));
                        C11500j9 c11500j92 = C5I8.A8i;
                        HEH heh2 = this.A05;
                        if (heh2 != null) {
                            A0B.A05(c11500j92, Integer.valueOf(heh2.A02.A01.A06.getCurrentPositionMs()));
                            C11500j9 c11500j93 = C5I8.A8j;
                            HEH heh3 = this.A05;
                            if (heh3 != null) {
                                A0B.A05(c11500j93, Integer.valueOf(heh3.A02.A01.A06.Azm()));
                                C11500j9 c11500j94 = C5I8.A8k;
                                HEH heh4 = this.A05;
                                if (heh4 != null) {
                                    A0B.A05(c11500j94, Integer.valueOf(heh4.A02.A01.A00()));
                                }
                            }
                        }
                    }
                    C14360o3.A0F("adapter");
                    throw C00O.createAndThrow();
                }
                String str2 = this.A09;
                if (str2 == null) {
                    C14360o3.A0F("surveyType");
                    throw C00O.createAndThrow();
                }
                String str3 = c41021IEq.A00;
                if (str3 != null) {
                    C38896HAs c38896HAs2 = this.A08;
                    if (c38896HAs2 != null) {
                        List list2 = c38896HAs2.A06;
                        if (list2 != null) {
                            List<IKO> list3 = ((C41021IEq) list2.get(this.A00)).A01;
                            if (list3 != null) {
                                String str4 = null;
                                for (IKO iko : list3) {
                                    Integer num2 = iko.A08;
                                    if (num2 == C05F.A00 || num2 == C05F.A0C) {
                                        C38321qM c38321qM = iko.A03;
                                        if (c38321qM != null || ((c3xg = iko.A02) != null && (c38321qM = AbstractC37300Gc1.A0E(c3xg)) != null)) {
                                            str4 = c38321qM.getId();
                                        } else {
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                    }
                                }
                                long currentTimeMillis = (this.A03 + System.currentTimeMillis()) - this.A02;
                                int i = imq.A02;
                                AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0P);
                                AbstractC167007dF.A1J(str, 0, A0o);
                                C82713mZ A0M = AbstractC37302Gc3.A0M(this, "instagram_survey_", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                                A0M.A7F = str;
                                A0M.A6O = "finished";
                                A0M.A7G = str2;
                                A0M.A6N = str3;
                                A0M.A61 = str4;
                                A0M.A0B(currentTimeMillis);
                                A0M.A0Z = i;
                                ArrayList A1E = AbstractC166987dD.A1E();
                                int A00 = c41222IMn.A00();
                                for (int i2 = 0; i2 < A00; i2++) {
                                    C41232IMx A01 = c41222IMn.A01(i2);
                                    C11520jB A0B2 = AbstractC37300Gc1.A0B();
                                    A0B2.A0A("question_id", A01.A03.A03);
                                    A0B2.A0C("answers", A01.A00());
                                    A1E.add(A0B2);
                                }
                                A0M.A89 = A1E;
                                A0M.A0m = AbstractC37300Gc1.A0B();
                                A0M.A0t = A0B;
                                AbstractC37304Gc5.A1P(A0o, A0M);
                                C38896HAs c38896HAs3 = this.A08;
                                C41008IEd c41008IEd = null;
                                if (c38896HAs3 != null) {
                                    c41008IEd = c38896HAs3.A01;
                                }
                                Integer num3 = C05F.A01;
                                if ((c41008IEd == null || num3 != c41008IEd.A01) && this.A00 >= AbstractC31172DnG.A03(list, A1R ? 1 : 0)) {
                                    A05("auto_exit_after_completion");
                                    AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
                                    if (abstractC10360h2 != null) {
                                        abstractC10360h2.A0b();
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                }
                                A04(this);
                                return;
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A09;
        if (str == null) {
            C14360o3.A0F("surveyType");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A05("back_button");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C1OU c1ou = C1OU.$redex_init_class;
            C3M4 A05 = C3M4.A05(activity);
            if (A05 != null && A05.A0b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.36j] */
    public GenericSurveyFragment() {
        C50152MDf c50152MDf = new C50152MDf(this, 37);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50152MDf(new C50152MDf(this, 38), 39));
        this.A0O = AbstractC25225BEi.A0a(new C50152MDf(A00, 40), c50152MDf, new C57251PbZ(2, null, A00), AbstractC25225BEi.A1D(C61142qc.class));
    }

    public static final void A03(GenericSurveyFragment genericSurveyFragment) {
        FragmentActivity requireActivity = genericSurveyFragment.requireActivity();
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(6));
        C56352iT AYT = ((BaseFragmentActivity) requireActivity).AYT();
        if (AYT != null) {
            AYT.A0T();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC63932vE
    public final void Dce(String str, int i) {
        this.A01 = System.currentTimeMillis();
        AbstractC40654I0m.A00(AbstractC166987dD.A0r(this.A0P), this, this.A0U.getSessionId(), AbstractC40655I0n.A00(this.A08, this.A00), str, i);
    }

    @Override // X.InterfaceC63912vC
    public final void DmL(C42665IuM c42665IuM, C105854pw c105854pw) {
        if (C14360o3.A0K(c105854pw.A00(), "bake_off")) {
            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
            if (abstractC10360h2 != null) {
                abstractC10360h2.A0b();
                C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity(), this.A0P);
                IgFragmentFactoryImpl.A00();
                AdBakeOffFragment adBakeOffFragment = new AdBakeOffFragment();
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString(AbstractC111324zv.A00(288), null);
                AbstractC31175DnJ.A0v(A0b, adBakeOffFragment, A0c);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(719571197);
        this.A03 += System.currentTimeMillis() - this.A02;
        C0f9.A0A(-808301759, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1451412524);
        this.A02 = System.currentTimeMillis();
        C0f9.A0A(543659890, A03);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, X.392] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.36e, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1795258400);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0P;
        C60972qL c60972qL = new C60972qL(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), this);
        this.A05 = new HEH(requireActivity(), (C61142qc) this.A0O.getValue(), c60972qL, this);
        this.A09 = requireArguments().getString("GenericSurveyFragment.SURVEY_TYPE", "");
        this.A0J = requireArguments().getString("GenericSurveyFragment.EXTRA_DATA_TOKEN", "");
        this.A0L = requireArguments().getString("GenericSurveyFragment.ARGUMENTS_TRACKING_TOKEN", "");
        this.A0K = requireArguments().getString("GenericSurveyFragment.ARGUMENTS_PARENT_MEDIA_ID", "");
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0Q, C140326Wl.class);
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A0R, C42251Inb.class);
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        ViewOnTouchListenerC60632pm A00 = AbstractC60622pl.A00(requireContext(), null, false);
        HEH heh = this.A05;
        String str = "adapter";
        if (heh != null) {
            C61372qz c61372qz = this.A0T;
            C33A c33a = new C33A(this, A00, c61372qz, heh);
            Context requireContext = requireContext();
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            HEH heh2 = this.A05;
            if (heh2 != null) {
                this.A0H = new C33P(requireContext, A0r, this, heh2);
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                HEH heh3 = this.A05;
                if (heh3 != null) {
                    C64362vv c64362vv = new C64362vv(A0r2, this, heh3, (C1M1) null);
                    HEH heh4 = this.A05;
                    if (heh4 != null) {
                        C36Y c36y = new C36Y(this, c64362vv, this, heh4, false);
                        UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                        FragmentActivity requireActivity = requireActivity();
                        HEH heh5 = this.A05;
                        if (heh5 != null) {
                            C676533f c676533f = new C676533f(requireActivity, heh5, A0r3, this);
                            ?? obj = new Object();
                            C33F c33f = new C33F(AbstractC166987dD.A0r(interfaceC09390do), new C683736a(AbstractC166987dD.A0r(interfaceC09390do)));
                            this.A0F = AbstractC37301Gc2.A0E();
                            Context requireContext2 = requireContext();
                            FragmentActivity requireActivity2 = requireActivity();
                            UserSession A0r4 = AbstractC166987dD.A0r(interfaceC09390do);
                            C1M1 c1m1 = this.A0U;
                            C57112jm c57112jm = this.A0F;
                            if (c57112jm != null) {
                                AnonymousClass341 anonymousClass341 = AnonymousClass341.A0K;
                                HLZ hlz = new HLZ();
                                AbstractC167007dF.A1G(A0r4, 3, c1m1);
                                ArrayList A17 = AbstractC25225BEi.A17(1);
                                A17.add(hlz);
                                C36Q A002 = AbstractC37505GfN.A00(requireContext2, requireActivity2, this, A0r4, c57112jm, this, null, anonymousClass341, null, null, null, c1m1, null, A17);
                                AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
                                HEH heh6 = this.A05;
                                if (heh6 != null) {
                                    C33P c33p = this.A0H;
                                    if (c33p != null) {
                                        UserSession A0r5 = AbstractC166987dD.A0r(interfaceC09390do);
                                        C684436h c684436h = new C684436h(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do));
                                        C57332k8 A003 = C57332k8.A0m.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do));
                                        C57112jm c57112jm2 = this.A0F;
                                        if (c57112jm2 != null) {
                                            C39140HKt c39140HKt = new C39140HKt(parentFragmentManager, this, c684436h, A0r5, c57112jm2, this.A0S, c36y, this, c33a, c33f, A003, c33p, A002, heh6, obj, c676533f, c1m1);
                                            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
                                            HEH heh7 = this.A05;
                                            if (heh7 != null) {
                                                AnonymousClass391 anonymousClass391 = new AnonymousClass391(this, abstractC10360h2, heh7, c60972qL);
                                                C33P c33p2 = this.A0H;
                                                if (c33p2 != null) {
                                                    anonymousClass391.A0G = c33p2;
                                                    anonymousClass391.A08 = c36y;
                                                    anonymousClass391.A0R = c1m1;
                                                    anonymousClass391.A0C = c33a;
                                                    anonymousClass391.A0Q = c676533f;
                                                    anonymousClass391.A0A = c39140HKt;
                                                    anonymousClass391.A0E = c33f;
                                                    anonymousClass391.A0N = obj;
                                                    anonymousClass391.A0B = new Object();
                                                    AnonymousClass396 A004 = anonymousClass391.A00();
                                                    this.A0G = new C3CO(AbstractC166987dD.A0r(interfaceC09390do), new C38287GsW(this, 2), false, false);
                                                    InterfaceC60602pj c675132q = new C675132q(this, AbstractC166987dD.A0r(interfaceC09390do), this);
                                                    InterfaceC60602pj interfaceC60602pj = this.A0G;
                                                    if (interfaceC60602pj == null) {
                                                        str = "mediaUpdateListener";
                                                    } else {
                                                        registerLifecycleListener(interfaceC60602pj);
                                                        registerLifecycleListener(c675132q);
                                                        C14360o3.A0A(A004);
                                                        registerLifecycleListener(A004);
                                                        InterfaceC60602pj interfaceC60602pj2 = this.A05;
                                                        if (interfaceC60602pj2 != null) {
                                                            registerLifecycleListener(interfaceC60602pj2);
                                                            c61372qz.A01(A004);
                                                            int i2 = requireArguments().getInt("GenericSurveyFragment.ARGUMENTS_BLOKS_GENERIC_SURVEY_DELEGATE_KEY", -1);
                                                            if (i2 != -1) {
                                                                this.A0E = (IGH) AbstractC66261U6f.A01(IGH.class, Integer.valueOf(i2));
                                                            }
                                                            A01(this);
                                                            ListAdapter listAdapter = this.A05;
                                                            if (listAdapter != null) {
                                                                A0U(listAdapter);
                                                                C0f9.A09(1582036265, A02);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    C14360o3.A0F("feedVideoModule");
                                    throw C00O.createAndThrow();
                                }
                            }
                            C14360o3.A0F("viewpointManager");
                            throw C00O.createAndThrow();
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-707673643);
        C14360o3.A0B(layoutInflater, 0);
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ComponentCallbacks2 rootActivity = getRootActivity();
            C14360o3.A0C(rootActivity, AbstractC111324zv.A00(36));
            ((InterfaceC53712dA) rootActivity).EfL(8);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_ad_survey, viewGroup, false);
        this.A04 = (ViewGroup) inflate.requireViewById(R.id.layout_container);
        this.endScreenViewStub = AbstractC31173DnH.A0G(inflate, R.id.survey_end_screen);
        this.retryViewStub = AbstractC31173DnH.A0G(inflate, R.id.survey_retry);
        this.contentContainer = (ViewGroup) inflate.requireViewById(R.id.content_container);
        this.loadingSpinner = AbstractC31180DnO.A0V(inflate);
        this.navbarController = new C41228IMt(AbstractC31177DnL.A09(this), this);
        ViewGroup viewGroup2 = this.A04;
        C14360o3.A0C(viewGroup2, "null cannot be cast to non-null type android.view.ViewGroup");
        C0f9.A09(-1305064042, A02);
        return viewGroup2;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(100112190);
        super.onDestroy();
        C218914p.A06(this);
        InterfaceC09390do interfaceC09390do = this.A0P;
        AbstractC31176DnK.A0Q(interfaceC09390do).A02(this.A0Q, C140326Wl.class);
        AbstractC31176DnK.A0Q(interfaceC09390do).A02(this.A0R, C42251Inb.class);
        C0f9.A09(-1121700583, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1898914274);
        super.onDestroyView();
        this.A04 = null;
        if (getRootActivity() instanceof InterfaceC53712dA) {
            ComponentCallbacks2 rootActivity = getRootActivity();
            C14360o3.A0C(rootActivity, AbstractC111324zv.A00(36));
            ((InterfaceC53712dA) rootActivity).EfL(0);
        }
        C0f9.A09(44631198, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(578613551);
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(this.A0D);
            AbstractC13880nE.A0O(this.mView);
            super.onPause();
            C0f9.A09(1754405616, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1882648723, A02);
        throw A0g;
    }

    @Override // X.C38K, androidx.fragment.app.Fragment
    public final void onResume() {
        IllegalStateException A14;
        int i;
        C3M4 A05;
        FragmentActivity activity;
        ViewGroup viewGroup;
        int A02 = C0f9.A02(-72329843);
        super.onResume();
        Window window = requireActivity().getWindow();
        if (window != null) {
            this.A0D = window.getAttributes().softInputMode;
            Window window2 = requireActivity().getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(16);
                FragmentActivity activity2 = getActivity();
                if (activity2 == null) {
                    A05 = null;
                } else {
                    C1OU c1ou = C1OU.$redex_init_class;
                    A05 = C3M4.A05(activity2);
                }
                if (A05 != null && A05.A0a() && (activity = getActivity()) != null) {
                    C1OU c1ou2 = C1OU.$redex_init_class;
                    C3M4 A052 = C3M4.A05(activity);
                    if (A052 != null && (viewGroup = this.A04) != null) {
                        viewGroup.post(new J5I(viewGroup, this, A052));
                    }
                }
                if (this.A0A) {
                    A04(this);
                    this.A0A = false;
                }
                C0f9.A09(-483256035, A02);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -629640195;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1881938449;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = C0f9.A03(-762507138);
        C14360o3.A0B(absListView, 0);
        HEH heh = this.A05;
        if (heh != null) {
            if (heh.A00) {
                if (LJW.A01()) {
                    AbstractC167007dF.A0J().postDelayed(new J39(this), 0L);
                } else if (LJW.A02(absListView)) {
                    HEH heh2 = this.A05;
                    if (heh2 != null) {
                        heh2.A00 = false;
                    }
                }
                C0f9.A0A(1192902625, A03);
                return;
            }
            this.A0T.onScroll(absListView, i, i2, i3);
            C0f9.A0A(1192902625, A03);
            return;
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0N = AbstractC167017dG.A0N(absListView, -2067981848);
        HEH heh = this.A05;
        if (heh == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (!heh.A00) {
            this.A0T.onScrollStateChanged(absListView, i);
        }
        C0f9.A0A(-971736117, A0N);
    }
}
