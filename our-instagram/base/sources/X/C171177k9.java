package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;
import com.instagram.modal.ModalActivity;
import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.7k9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171177k9 implements InterfaceC171187kA {
    public static final String __redex_internal_original_name = "IgLiveComposeController";
    public View A00;
    public ImageView A01;
    public TextView A02;
    public C64842wi A03;
    public C3PO A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final Handler A08;
    public final ViewGroup A09;
    public final C55982hj A0A;
    public final AbstractC59962oe A0B;
    public final C1815283f A0C;
    public final InterfaceC11380iw A0D;
    public final UserSession A0E;
    public final C1810981l A0F;
    public final C8JI A0G;
    public final C171287kK A0H;
    public final C171237kF A0I;
    public final InterfaceC171217kD A0J;
    public final C64742wY A0K;
    public final C3PO A0L;
    public final C171197kB A0M;
    public final Boolean A0N;
    public final Long A0O;
    public final InterfaceC25214BDm A0P;
    public final C171587ko A0Q;
    public final InterfaceC171577kn A0R;
    public final String A0S;

    @Override // X.InterfaceC171187kA
    public final void D2N(Intent intent, C22P c22p, int i) {
        C14360o3.A0B(c22p, 2);
        this.A0B.registerLifecycleListener(this.A0G);
        if (i != -1) {
            if (i != 6001) {
                String A00 = MSV.A00(348);
                if (intent != null && intent.hasExtra(A00)) {
                    String stringExtra = intent.getStringExtra(A00);
                    C146106i8 c146106i8 = new C146106i8();
                    c146106i8.A05();
                    c146106i8.A0H = MSV.A00(1386);
                    c146106i8.A0D = stringExtra;
                    C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                }
                C55772hI.A00(this.A0E).A0D("unknown", this.A0D);
                return;
            }
        } else {
            C22P c22p2 = C22P.A43;
            InterfaceC25214BDm interfaceC25214BDm = this.A0P;
            if (c22p == c22p2) {
                interfaceC25214BDm.AIF();
            } else {
                interfaceC25214BDm.Cqz(NetInfoModule.CONNECTION_TYPE_NONE);
            }
        }
        C171287kK c171287kK = this.A0H;
        C171287kK.A01(EnumC171297kL.A03, c171287kK);
        C171287kK.A02(c171287kK);
        C171287kK.A09(c171287kK, null, new ArrayList(), false);
        c171287kK.A02 = null;
        c171287kK.A08 = new ArrayList();
        c171287kK.A0D(C3PO.A08, false);
        c171287kK.A0B = false;
        C171287kK.A00(C81W.A0c, c171287kK, false);
        c171287kK.A0N.A09(true);
    }

    @Override // X.InterfaceC171187kA
    public final void E1E(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        this.A06 = true;
        if (c55u == C81S.A00) {
            A00(this);
        }
        C37021nz A00 = C4M5.A00();
        UserSession userSession = this.A0E;
        String str = AbstractC171597kp.A00(userSession).A02;
        InterfaceC171577kn interfaceC171577kn = this.A0R;
        A00.A05(userSession, this.A0Q, interfaceC171577kn, str);
        C4M5.A00().A06(userSession, interfaceC171577kn);
        if (AbstractC171517kh.A00(userSession).A00 != null) {
            C171287kK.A06(this.A0H);
        }
    }

    public static final void A00(C171177k9 c171177k9) {
        c171177k9.A0I.A03(EnumC222849sP.A03);
        if (c171177k9.A06) {
            c171177k9.A06 = false;
            C3PO c3po = c171177k9.A0L;
            if (c3po != null) {
                UserSession userSession = c171177k9.A0E;
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A05, userSession, 36320416708436462L)) {
                    c171177k9.A0H.A0D(c3po, true);
                    return;
                }
            }
            if (c3po == null || c3po == C3PO.A08) {
                return;
            }
            if (C18U.A06(C06090Tz.A05, c171177k9.A0E, 36323801142668915L)) {
                return;
            }
            c171177k9.A08.postDelayed(new RunnableC24382ArP(c171177k9), 200L);
        }
    }

    public static final void A01(C171177k9 c171177k9) {
        Window window;
        AbstractC59962oe abstractC59962oe = c171177k9.A0B;
        Activity rootActivity = abstractC59962oe.getRootActivity();
        if (rootActivity != null) {
            window = rootActivity.getWindow();
        } else {
            window = null;
        }
        if (abstractC59962oe.isAdded() && window != null) {
            window.clearFlags(128);
        }
        c171177k9.A0A.A06(0.0d);
        View view = c171177k9.A00;
        if (view != null) {
            view.setVisibility(8);
        }
        c171177k9.A08.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC171187kA
    public final void DLG() {
        String str;
        String str2;
        C3PO c3po;
        String str3;
        String str4;
        NewFundraiserInfo newFundraiserInfo;
        FundraiserDisplayInfoModel fundraiserDisplayInfoModel;
        UserSession userSession = this.A0E;
        boolean A00 = AbstractC1565371b.A00(userSession);
        String A002 = MSV.A00(472);
        if (A00) {
            AbstractC35176FfT.A02(this.A0B.requireContext(), userSession, A002);
            return;
        }
        C1815283f c1815283f = this.A0C;
        CameraAREffect cameraAREffect = c1815283f.A00().A05.A09;
        C22C A01 = AnonymousClass229.A01(userSession);
        AnonymousClass249 anonymousClass249 = AnonymousClass249.OTHER;
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0E;
        EnumC114925Hg enumC114925Hg = EnumC114925Hg.LIVE;
        if (cameraAREffect != null) {
            str = cameraAREffect.A0K;
            str2 = cameraAREffect.A0M;
        } else {
            str = null;
            str2 = null;
        }
        A01.A0y(enumC114925Hg, anonymousClass249, enumC50631MWs, str, str2);
        Object obj = this.A0F.A08.A00;
        if (obj != C81S.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append(MSV.A00(804));
            sb.append(obj);
            AbstractC12120kG.A07(A002, sb.toString(), null);
            return;
        }
        AbstractC59962oe abstractC59962oe = this.A0B;
        Context applicationContext = abstractC59962oe.requireContext().getApplicationContext();
        AbstractC27671Vv A003 = C3ER.A00();
        C14360o3.A0A(applicationContext);
        if (A003.A02(applicationContext, userSession)) {
            C193328hC c193328hC = new C193328hC(abstractC59962oe.requireContext());
            c193328hC.A0A(2131965605);
            c193328hC.A09(2131965604);
            c193328hC.A07();
            c193328hC.A04();
            C0fJ.A00(c193328hC.A02());
            return;
        }
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36318196210407431L)) {
            c3po = this.A04;
        } else {
            c3po = this.A0H.A05;
        }
        boolean z = false;
        if (c3po == C3PO.A06) {
            z = true;
        }
        CameraAREffect A012 = c1815283f.A00().A01();
        if (A012 != null && (!A012.A0f || z)) {
            str3 = A012.A0K;
        } else {
            str3 = null;
        }
        C171287kK c171287kK = this.A0H;
        String str5 = c171287kK.A07;
        ArrayList arrayList = c171287kK.A08;
        EnumC171297kL enumC171297kL = c171287kK.A01;
        if (enumC171297kL == EnumC171297kL.A02) {
            str4 = c171287kK.A06;
            newFundraiserInfo = c171287kK.A04;
            fundraiserDisplayInfoModel = c171287kK.A03;
        } else {
            str4 = null;
            newFundraiserInfo = null;
            fundraiserDisplayInfoModel = null;
        }
        boolean z2 = false;
        if (enumC171297kL == EnumC171297kL.A0A) {
            z2 = true;
        }
        boolean z3 = c171287kK.A0B;
        C54805OJz A013 = C190298bn.A03.A00(abstractC59962oe.requireContext(), userSession).A01();
        A013.A00.Egh(c3po);
        A013.A01.Egh(arrayList);
        A013.A02.Egh(new OTn(fundraiserDisplayInfoModel, newFundraiserInfo, str4));
        A013.A03.Egh(null);
        A013.A04.Egh(Boolean.valueOf(z2));
        A013.A05.Egh(this.A0O);
        A013.A06.Egh(str3);
        A013.A07.Egh(Boolean.valueOf(z3));
        A013.A08.Egh(AbstractC171597kp.A00(userSession).A02);
        A013.A09.Egh(str5);
        C55772hI.A00(userSession).A0C(this.A0D, "button", this.A07 + 1);
        Bundle bundle = new Bundle();
        Object A004 = AbstractC13320mI.A00(abstractC59962oe.requireContext(), Activity.class);
        if (A004 != null) {
            C6XJ c6xj = new C6XJ((Activity) A004, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(2518));
            c6xj.A0J = ModalActivity.A08;
            c6xj.A0B = true;
            c6xj.A0D(abstractC59962oe, 5150);
            C8JI c8ji = this.A0G;
            abstractC59962oe.unregisterLifecycleListener(c8ji);
            c8ji.A06();
            c8ji.A07();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0S;
    }

    @Override // X.InterfaceC171187kA
    public final void onDestroyView() {
        AbstractC59962oe abstractC59962oe = this.A0B;
        abstractC59962oe.unregisterLifecycleListener(this.A0K);
        C171287kK c171287kK = this.A0H;
        UserSession userSession = c171287kK.A0K;
        AbstractC25651Mw.A00(userSession).A02(c171287kK.A0J, C171427kY.class);
        AbstractC25651Mw.A00(userSession).A02(c171287kK.A0I, C171437kZ.class);
        abstractC59962oe.unregisterLifecycleListener(c171287kK);
        abstractC59962oe.unregisterLifecycleListener(this.A0G);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.7kB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.2fr, java.lang.Object] */
    public C171177k9(ViewGroup viewGroup, AbstractC59962oe abstractC59962oe, C1815283f c1815283f, InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C1810981l c1810981l, C8GG c8gg, InterfaceC25214BDm interfaceC25214BDm, C8JI c8ji, FundraiserSharedToLive fundraiserSharedToLive, C3PO c3po, Boolean bool, Long l, String str, int i) {
        C14360o3.A0B(c8gg, 2);
        C14360o3.A0B(c8ji, 8);
        C14360o3.A0B(interfaceC11380iw, 9);
        C14360o3.A0B(c1815283f, 15);
        this.A0B = abstractC59962oe;
        this.A0M = new Object();
        this.A04 = C3PO.A08;
        InterfaceC171217kD interfaceC171217kD = new InterfaceC171217kD() { // from class: X.7kC
            @Override // X.InterfaceC171217kD
            public final void Cxk(C3PO c3po2) {
                int i2;
                Drawable A00;
                C171177k9 c171177k9 = this;
                c171177k9.A04 = c3po2;
                ImageView imageView = c171177k9.A01;
                if (imageView != null && (A00 = AbstractC23020ADc.A00(c171177k9.A0B.getContext(), c171177k9.A04, true)) != null) {
                    imageView.setImageDrawable(A00);
                }
                TextView textView = c171177k9.A02;
                if (textView != null) {
                    textView.setText(AbstractC23020ADc.A01(c171177k9.A0B.getContext(), userSession, c171177k9.A04, true));
                }
                if (AbstractC109224vo.A00(userSession)) {
                    C146106i8 c146106i8 = new C146106i8();
                    Resources resources = c171177k9.A0B.requireContext().getResources();
                    switch (c3po2.ordinal()) {
                        case 0:
                            i2 = 2131964029;
                            break;
                        case 1:
                            i2 = 2131964026;
                            break;
                        case 2:
                            i2 = 2131964034;
                            break;
                        case 3:
                            i2 = 2131964017;
                            break;
                        case 4:
                            i2 = 2131964019;
                            break;
                        case 5:
                            i2 = 2131964014;
                            break;
                        case 6:
                            i2 = 2131964022;
                            break;
                        default:
                            throw new UnsupportedOperationException(MSV.A00(71));
                    }
                    c146106i8.A0D = resources.getString(i2);
                    C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                }
            }
        };
        this.A0J = interfaceC171217kD;
        this.A0F = c1810981l;
        this.A08 = new Handler(Looper.getMainLooper());
        c1810981l.A0H(new AnonymousClass822() { // from class: X.7kE
            @Override // X.AnonymousClass822
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                Window window;
                int i2;
                C14360o3.A0B(obj, 0);
                C171177k9 c171177k9 = C171177k9.this;
                if (obj == C81S.A00) {
                    C171177k9.A00(c171177k9);
                    UserSession userSession2 = c171177k9.A0E;
                    C14360o3.A0B(userSession2, 0);
                    if (C18U.A06(C06090Tz.A05, userSession2, 36318196210407431L)) {
                        if (c171177k9.A00 == null) {
                            View inflate = ((ViewStub) c171177k9.A09.requireViewById(R.id.iglive_audience_pill_stub)).inflate();
                            c171177k9.A00 = inflate;
                            if (inflate != null) {
                                C3P9 c3p9 = new C3P9(inflate);
                                c3p9.A04 = new C23685AeK(c171177k9);
                                c3p9.A05 = C05F.A01;
                                c3p9.A00();
                                View requireViewById = inflate.requireViewById(R.id.iglive_audience_pill_icon);
                                C14360o3.A07(requireViewById);
                                ImageView imageView = (ImageView) requireViewById;
                                c171177k9.A01 = imageView;
                                AbstractC59962oe abstractC59962oe2 = c171177k9.A0B;
                                Drawable A00 = AbstractC23020ADc.A00(abstractC59962oe2.getContext(), c171177k9.A04, true);
                                if (A00 != null) {
                                    imageView.setImageDrawable(A00);
                                }
                                View requireViewById2 = inflate.requireViewById(R.id.iglive_audience_pill_text);
                                C14360o3.A07(requireViewById2);
                                TextView textView = (TextView) requireViewById2;
                                textView.setText(AbstractC23020ADc.A01(abstractC59962oe2.getContext(), userSession2, c171177k9.A04, true));
                                c171177k9.A02 = textView;
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        if (!c171177k9.A05 && (i2 = AbstractC23021Ah.A00(userSession2).A01.getInt("live_pre_live_audience_pill_tooltip_view_count", 0)) < 2) {
                            Handler handler = c171177k9.A08;
                            handler.removeCallbacksAndMessages(null);
                            handler.postDelayed(new RunnableC24643Avd(c171177k9, i2), 2000L);
                        }
                    }
                    View view = c171177k9.A00;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    c171177k9.A0H.A0A(c171177k9.A09);
                    C64842wi c64842wi = c171177k9.A03;
                    if (c64842wi != null) {
                        c64842wi.DiZ();
                        c171177k9.A0A.A06(1.0d);
                        AbstractC59962oe abstractC59962oe3 = c171177k9.A0B;
                        Activity rootActivity = abstractC59962oe3.getRootActivity();
                        if (rootActivity != null) {
                            window = rootActivity.getWindow();
                        } else {
                            window = null;
                        }
                        if (abstractC59962oe3.isAdded() && window != null) {
                            window.addFlags(128);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                if (obj == C208509Kk.A00 && AbstractC25351Lp.A01(c171177k9.A0E)) {
                    C171177k9.A01(c171177k9);
                    c171177k9.A0I.A03(EnumC222849sP.A04);
                    c171177k9.A0A.A03();
                    return;
                }
                C171177k9.A01(c171177k9);
            }
        });
        this.A0P = interfaceC25214BDm;
        this.A09 = viewGroup;
        this.A0E = userSession;
        this.A07 = i;
        this.A0I = new C171237kF(viewGroup, abstractC59962oe, userSession, c1810981l);
        this.A0D = interfaceC11380iw;
        this.A0C = c1815283f;
        this.A0L = c3po;
        this.A0N = bool;
        this.A0G = c8ji;
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A08(0.0d, true);
        A02.A0A(new C668630d() { // from class: X.7kG
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                C171177k9 c171177k9 = C171177k9.this;
                float f = (float) c55982hj.A09.A00;
                LinearLayout linearLayout = c171177k9.A0I.A03;
                if (linearLayout != null) {
                    linearLayout.setAlpha(f);
                    int i2 = 8;
                    if (f > 0.0f) {
                        i2 = 0;
                    }
                    linearLayout.setVisibility(i2);
                }
            }
        });
        this.A0A = A02;
        this.A0O = l;
        C27961Xa A00 = AbstractC54912fq.A00();
        HashMap hashMap = new HashMap();
        QPTooltipAnchor qPTooltipAnchor = QPTooltipAnchor.A0j;
        hashMap.put(qPTooltipAnchor, new C171257kH());
        hashMap.put(QPTooltipAnchor.A0h, new C171257kH());
        hashMap.put(QPTooltipAnchor.A0i, new C171257kH());
        hashMap.put(QPTooltipAnchor.A0k, new C171257kH());
        QPTooltipAnchor qPTooltipAnchor2 = QPTooltipAnchor.A0g;
        hashMap.put(qPTooltipAnchor2, new C171257kH());
        hashMap.put(QPTooltipAnchor.A0l, new C171257kH());
        hashMap.put(QPTooltipAnchor.A0m, new C171257kH());
        C64742wY A05 = A00.A05(userSession, hashMap);
        this.A0K = A05;
        C27961Xa A002 = AbstractC54912fq.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0b;
        AbstractC54912fq.A00();
        ?? obj = new Object();
        obj.A01(new InterfaceC55022g1() { // from class: X.7kI
            @Override // X.InterfaceC55022g1
            public final void Dtj(C125715mI c125715mI) {
                C14360o3.A0B(c125715mI, 0);
                C171177k9 c171177k9 = C171177k9.this;
                C64742wY c64742wY = c171177k9.A0K;
                C64842wi c64842wi = c171177k9.A03;
                if (c64842wi != null) {
                    c64742wY.A01(c64842wi, c125715mI);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }

            @Override // X.InterfaceC55022g1
            public final void DXC(C125715mI c125715mI) {
                C171177k9.this.A0K.A02 = c125715mI;
            }
        }, A05);
        obj.A02 = new InterfaceC55112gB() { // from class: X.7kJ
            @Override // X.InterfaceC55112gB
            public final void DMz(Context context, C4NL c4nl, InterfaceC55362gb interfaceC55362gb, String str2) {
                C14360o3.A0B(interfaceC55362gb, 0);
                C14360o3.A0B(c4nl, 1);
                C14360o3.A0B(context, 2);
                if (c4nl.CB6().contains(Trigger.A1R)) {
                    C171177k9 c171177k9 = this;
                    AbstractC59962oe abstractC59962oe2 = c171177k9.A0B;
                    UserSession userSession2 = userSession;
                    C1ON A01 = AbstractC55182Odn.A01(userSession2);
                    A01.A00 = new C52222N9l(context, userSession2, c171177k9, c4nl, interfaceC55362gb);
                    abstractC59962oe2.schedule(A01);
                }
            }
        };
        C64842wi A022 = A002.A02(abstractC59962oe, abstractC59962oe, userSession, obj.A00(), quickPromotionSlot);
        this.A03 = A022;
        C171287kK c171287kK = new C171287kK(abstractC59962oe, this, userSession, c1810981l, c8gg, c8ji, fundraiserSharedToLive, A022, A05, str);
        this.A0H = c171287kK;
        if (c3po != null && AbstractC171917lM.A00(userSession).A00().contains(c3po) && this.A04 != c3po) {
            this.A04 = c3po;
            interfaceC171217kD.Cxk(c3po);
            if (C14360o3.A0K(bool, true)) {
                c171287kK.A0C(abstractC59962oe.requireView(), c3po);
            }
        }
        abstractC59962oe.registerLifecycleListener(A05);
        abstractC59962oe.registerLifecycleListener(c171287kK);
        abstractC59962oe.registerLifecycleListener(c8ji);
        C8GG c8gg2 = c171287kK.A0M;
        C8GH A003 = c8gg2.A00();
        C81W c81w = c171287kK.A00;
        A003.A08(c81w, new C207189Ex(4, c171287kK, viewGroup));
        C8GH A004 = c8gg2.A00();
        C64742wY c64742wY = c171287kK.A0P;
        C64842wi c64842wi = c171287kK.A0O;
        boolean z = c171287kK.A0C;
        A004.A07(c81w, z ? qPTooltipAnchor2 : qPTooltipAnchor, c64842wi, c64742wY);
        C171287kK.A03(c171287kK);
        C171287kK.A05(c171287kK);
        C171287kK.A04(c171287kK);
        UserSession userSession2 = c171287kK.A0K;
        if (C2TN.A00(userSession2)) {
            C1810981l c1810981l2 = c171287kK.A0L;
            if (C14360o3.A0K(c1810981l2.A08.A00, C81S.A00)) {
                C171287kK.A07(c171287kK);
            }
            c1810981l2.A0H(new C23638AdX(c171287kK));
            c8gg2.A00().A08(C81W.A0Z, new C206899Du(c171287kK, 5));
        } else {
            InterfaceC19610xo ARD = C171547kk.A03.A00(userSession2).A01.ARD();
            ARD.E77("ig_live_employee_only_mode", false);
            ARD.apply();
        }
        if (C18U.A06(C06090Tz.A05, userSession2, 36318196210407431L)) {
            c171287kK.A0L.A0K(C81S.A00, C81W.A0V, false);
        } else {
            if (AbstractC109224vo.A02(userSession2)) {
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206639Cu(c171287kK, null, 36), C07Y.A00(c171287kK.A0G.getViewLifecycleOwner()));
            }
            c8gg2.A00().A08(C81W.A0V, new C207189Ex(3, c171287kK, viewGroup));
            c8gg2.A00().A07(c81w, z ? qPTooltipAnchor2 : qPTooltipAnchor, c64842wi, c64742wY);
        }
        String str2 = c171287kK.A0R;
        if (str2 != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC24642Avc(c171287kK, str2), 500L);
        }
        this.A0R = new InterfaceC171577kn() { // from class: X.7km
            @Override // X.InterfaceC171577kn
            public final void onSuccess() {
                C171177k9 c171177k9 = C171177k9.this;
                c171177k9.A0H.A0A(c171177k9.A09);
            }
        };
        this.A0Q = new C171587ko(userSession, this, c3po, bool);
        this.A0S = "live_composer";
    }
}
