package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9Gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207549Gh extends AbstractC59962oe implements InterfaceC60072op, C2fe, InterfaceC11480j6, BBw, InterfaceC25179BCc, InterfaceC25175BBx, InterfaceC53912dV, InterfaceC11210ic {
    public static final String __redex_internal_original_name = "QuickCaptureFragment";
    public C54845OMq A00;
    public C69613Av A01;
    public CameraConfiguration A02;
    public C208279Jm A04;
    public C23476Aap A05;
    public C81Y A06;
    public InterfaceC25214BDm A07;
    public C171977lS A08;
    public C81I A09;
    public C54822fg A0A;
    public C48672Ll A0B;
    public String A0D;
    public String A0E;
    public String A0F;
    public C64842wi A0G;
    public boolean A0H;
    public boolean A0I;
    public final A70 A0K = new A70(this);
    public String A0C = "stories_precapture_camera";
    public C55U A03 = C208509Kk.A00;
    public final InterfaceC09390do A0J = AbstractC60492pY.A02(this);

    @Override // X.C2fe
    public final C25548BRk AvQ() {
        return null;
    }

    @Override // X.C2fe
    public final /* synthetic */ void CKS(MotionEvent motionEvent, Long l, boolean z) {
    }

    @Override // X.C2fe
    public final /* synthetic */ void DVb() {
    }

    @Override // X.InterfaceC25179BCc
    public final void Dx6(C55U c55u) {
        C8XA c8xa;
        C8XB A00;
        C14360o3.A0B(c55u, 0);
        if (this.A03 != c55u) {
            this.A03 = c55u;
            A00();
            C81Y c81y = this.A06;
            if (c81y != null && (c8xa = c81y.A00.A17) != null && (A00 = c8xa.A00()) != null) {
                A00.A07();
                A00.A06();
            }
        }
    }

    @Override // X.C2fe
    public final void F84(MotionEvent motionEvent) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(final Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        AbstractC167007dF.A0z(this, new Runnable() { // from class: X.7mz
            @Override // java.lang.Runnable
            public final void run() {
                C81Y c81y = this.A06;
                if (c81y != null) {
                    c81y.A00.A0w.onSaveInstanceState(bundle);
                }
            }
        });
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, final Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C81I c81i = new C81I();
        this.A09 = c81i;
        registerLifecycleListener(c81i);
        AbstractC167007dF.A0z(this, new Runnable() { // from class: X.7ju
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (r7 == X.C22P.A5H) goto L18;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, (X.AbstractC12990ll) r3.A0J.getValue(), 36323251386985573L) == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x00f1, code lost:
            
                if (r6.getBoolean("SAVE_INSTANCE_KEY_WAS_SHOWING_MG") != true) goto L33;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.1vN] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 505
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC171037ju.run():void");
            }
        });
        A01(this);
        C43822JZk A00 = AbstractC208269Jl.A00(AbstractC166987dD.A0r(this.A0J));
        C0J8.A01();
        C24Q c24q = A00.A04;
        if (c24q.A0E(585177486, A00.A00)) {
            c24q.A0C("fragment_view_created", A00.A00);
        }
    }

    private final void A00() {
        C81Y c81y;
        String str;
        C55U c55u = this.A03;
        if (c55u == C208509Kk.A00) {
            if (this.A0H) {
                str = "stories_gallery";
            } else {
                str = "stories_precapture_camera";
            }
        } else if (c55u instanceof C81V) {
            if (C14360o3.A0K(this.A0C, "clips_postcapture_camera")) {
                return;
            }
            if (this.A0H) {
                str = "clips_gallery";
            } else {
                str = "clips_precapture_camera";
            }
        } else if (c55u == C81S.A00) {
            str = "live_precapture_camera";
        } else if (c55u == C1811481q.A00) {
            str = "note_precapture_camera";
        } else if (c55u != C128535rM.A00 || (c81y = this.A06) == null || !c81y.A00.A07) {
            return;
        } else {
            str = "feed_precapture_camera";
        }
        this.A0C = str;
        updateModuleNameV2_USE_WITH_CAUTION(str);
    }

    public static final void A01(final C207549Gh c207549Gh) {
        C48672Ll c48672Ll;
        C48672Ll c48672Ll2 = c207549Gh.A0B;
        if (c48672Ll2 == null) {
            c48672Ll2 = new C48672Ll(C12L.A00);
            c207549Gh.A0B = c48672Ll2;
        }
        AnonymousClass195 anonymousClass195 = c48672Ll2.A00;
        if ((anonymousClass195 == null || !anonymousClass195.isActive()) && (c48672Ll = c207549Gh.A0B) != null) {
            c48672Ll.A00(c207549Gh.requireActivity(), c207549Gh.getViewLifecycleOwner(), new InterfaceC57292k4() { // from class: X.7k7
                @Override // X.InterfaceC57292k4
                public final void DVZ(final C4PX c4px) {
                    C14360o3.A0B(c4px, 0);
                    C57992lC c57992lC = C57982lB.A0B;
                    final C207549Gh c207549Gh2 = C207549Gh.this;
                    c57992lC.A05(c207549Gh2.requireActivity(), new Runnable() { // from class: X.7l6
                        @Override // java.lang.Runnable
                        public final void run() {
                            C81Y c81y = c207549Gh2.A06;
                            if (c81y != null) {
                                c81y.A03(c4px);
                            }
                        }
                    });
                }
            }, true);
        }
    }

    public final void A02() {
        C208279Jm c208279Jm = this.A04;
        String str = "navigationPerfLogger";
        if (c208279Jm != null) {
            boolean z = ((AbstractC69603Au) c208279Jm).A01;
            c208279Jm.A0E("partially_visible");
            C208279Jm c208279Jm2 = this.A04;
            if (c208279Jm2 != null) {
                Context requireContext = requireContext();
                C55782hJ A00 = C55772hI.A00(AbstractC166987dD.A0o(this.A0J));
                if (!((AbstractC69603Au) c208279Jm2).A01) {
                    c208279Jm2.A04();
                    ((JQS) c208279Jm2).A01 = false;
                    c208279Jm2.A0P(requireContext, A00, null, false);
                }
                if (!z) {
                    C69613Av c69613Av = this.A01;
                    if (c69613Av == null) {
                        str = "qccNavComponent";
                    } else {
                        c69613Av.A03();
                    }
                }
                C30D.A02(requireActivity());
                if (C14360o3.A0K(this.A03, C208509Kk.A00)) {
                    C64842wi c64842wi = this.A0G;
                    if (c64842wi == null) {
                        str = "quickPromotionDelegate";
                    } else {
                        c64842wi.DiZ();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A03(C5GJ c5gj, String str) {
        AbstractC167007dF.A0z(this, new RunnableC24763Axl(c5gj, this, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r2 == X.C22P.A5E) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(com.instagram.creation.cameraconfiguration.CameraConfiguration r6) {
        /*
            r5 = this;
            X.81Y r0 = r5.A06
            if (r0 == 0) goto L40
            X.81Z r4 = r0.A00
            if (r6 == 0) goto L39
            X.81l r1 = r4.A0V
            X.22P r0 = r4.A01
            r1.A0D(r0, r6)
            X.55U r3 = r6.A03
        L11:
            r4.A02 = r3
        L13:
            X.22P r2 = r4.A01
            X.22P r0 = X.C22P.A0a
            if (r2 == r0) goto L1e
            X.22P r0 = X.C22P.A5E
            r1 = 0
            if (r2 != r0) goto L1f
        L1e:
            r1 = 1
        L1f:
            X.5rM r0 = X.C128535rM.A00
            if (r3 != r0) goto L2d
            if (r1 == 0) goto L2d
            if (r6 == 0) goto L2d
            X.86b r0 = r4.A0m
            r0.A0A()
        L2c:
            return
        L2d:
            X.81Q r0 = X.C81Q.A00
            if (r3 != r0) goto L2c
            if (r6 == 0) goto L2c
            X.86b r0 = r4.A0m
            r0.A0B()
            return
        L39:
            X.55U r3 = r4.A02
            if (r3 != 0) goto L13
            X.9Kk r3 = X.C208509Kk.A00
            goto L11
        L40:
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r5.A02
            if (r0 != 0) goto L2c
            r5.A02 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207549Gh.A04(com.instagram.creation.cameraconfiguration.CameraConfiguration):void");
    }

    public final void A05(String str, String str2, String str3, String str4, int i) {
        C81Y c81y = this.A06;
        if (c81y != null) {
            this.A0J.getValue();
            C54822fg c54822fg = this.A0A;
            if (c54822fg == null) {
                C14360o3.A0F("navigationState");
                throw C00O.createAndThrow();
            }
            String A00 = AbstractC203558zG.A00(AbstractC189418aK.A00(c54822fg.A02));
            C81Z c81z = c81y.A00;
            if (c81z.A1H != null) {
                AnonymousClass858 anonymousClass858 = c81z.A0I;
                if (!anonymousClass858.A02(str)) {
                    anonymousClass858.A00.Egh(new C189118Zc(C85B.A0C, str, A00, null, str2, str3, str4, i, AbstractC167007dF.A1W(str2)));
                    return;
                }
                return;
            }
            return;
        }
        this.A0D = str;
        this.A0E = str2;
        this.A0F = str3;
    }

    @Override // X.C2fe
    public final /* synthetic */ double BbC() {
        return 0.0d;
    }

    @Override // X.C2fe
    public final /* synthetic */ boolean BvL() {
        return false;
    }

    @Override // X.C2fe
    public final /* synthetic */ boolean Ce6() {
        return false;
    }

    @Override // X.C2fe
    public final boolean Ce8(MotionEvent motionEvent) {
        C81Y c81y = this.A06;
        if (c81y != null) {
            C81Z c81z = c81y.A00;
            InterfaceC1810081c interfaceC1810081c = c81z.A1e;
            switch (((EnumC1810181d) ((C1809981b) interfaceC1810081c).A01.A00.first).ordinal()) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                case Process.SIGTERM /* 15 */:
                case 16:
                case 17:
                case Process.SIGSTOP /* 19 */:
                case 20:
                case 21:
                case 25:
                case 27:
                case 28:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 37:
                case 45:
                case 47:
                case 48:
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                case 51:
                case 52:
                case 54:
                case 57:
                case 59:
                case 67:
                case 71:
                case 74:
                case 75:
                case 76:
                case 78:
                case 84:
                case 87:
                    return false;
                default:
                    C89E c89e = c81z.A1q;
                    if (!c89e.A00().A0K) {
                        Integer num = c89e.A00().A0J;
                        num.getClass();
                        if (!num.equals(C05F.A0j)) {
                            C188798Xv c188798Xv = c81z.A1M;
                            if (c188798Xv == null || c188798Xv.A00().A01 == null || c188798Xv.A00().A01.A00 == 0.0f) {
                                Object obj = c81z.A0V.A08.A00;
                                if (obj instanceof C81V) {
                                    C8KA Aus = c81z.A1i.Aus();
                                    if (Aus.A01 != C8K9.A03 || Aus.A00.ordinal() != 0) {
                                        return false;
                                    }
                                }
                                if (obj instanceof C128535rM) {
                                    Fragment A0O = c81z.A0J.getChildFragmentManager().A0O(R.id.feed_gallery_fragment_holder);
                                    if (A0O instanceof C189588ad) {
                                        GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = ((C189588ad) A0O).A06;
                                        if (gestureDetectorOnGestureListenerC43829JZs == null) {
                                            C14360o3.A0F("galleryPickerView");
                                            throw C00O.createAndThrow();
                                        }
                                        Rect A0U = AbstractC166987dD.A0U();
                                        if ((!GestureDetectorOnGestureListenerC43829JZs.A0Q(gestureDetectorOnGestureListenerC43829JZs) || !gestureDetectorOnGestureListenerC43829JZs.A0W) && ((FragmentActivity) AbstractC13320mI.A01(gestureDetectorOnGestureListenerC43829JZs.getContext(), FragmentActivity.class)).getSupportFragmentManager().A0Q(KCQ.__redex_internal_original_name) == null) {
                                            View view = gestureDetectorOnGestureListenerC43829JZs.A07;
                                            if (view != null && view.getGlobalVisibleRect(A0U) && gestureDetectorOnGestureListenerC43829JZs.A0V) {
                                                return false;
                                            }
                                        } else {
                                            return false;
                                        }
                                    }
                                }
                                if (c81z.A1i.CW4() == 2 || c81z.A0r.A09() || c81z.A1V.A00().Aue() == C05F.A0N) {
                                    return false;
                                }
                                C8HI c8hi = c81z.A0k;
                                if (c8hi.A08.A0M.get() != 1 && c8hi.A08.A0M.get() != 2 && interfaceC1810081c.Cap() && c8hi.A0X()) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
            }
        }
        return false;
    }

    @Override // X.BBw
    public final void D2U(boolean z) {
        String str;
        if (z) {
            this.A0I = true;
            C55U c55u = this.A03;
            if (c55u instanceof C208509Kk) {
                str = "stories_postcapture_camera";
            } else {
                if (c55u instanceof C81V) {
                    str = "clips_postcapture_camera";
                }
                updateModuleNameV2_USE_WITH_CAUTION(this.A0C);
                return;
            }
            this.A0C = str;
            updateModuleNameV2_USE_WITH_CAUTION(this.A0C);
            return;
        }
        if (!this.A0I) {
            return;
        }
        this.A0C = "clips_precapture_camera";
        A00();
        this.A0I = false;
    }

    @Override // X.InterfaceC25175BBx
    public final void DJ3(boolean z) {
        if (z != this.A0H) {
            this.A0H = z;
            A00();
        }
    }

    @Override // X.InterfaceC25179BCc
    public final void DV4() {
        C81Y c81y = this.A06;
        if (c81y != null) {
            c81y.A00.A07 = true;
        }
        A00();
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C11520jB c11520jB = new C11520jB();
        c11520jB.A04(new C11500j9(C05F.A0Y, "camera_session_id"), AbstractC166997dE.A0t(AbstractC166987dD.A0r(this.A0J)));
        return c11520jB;
    }

    @Override // X.C2fe
    public final /* synthetic */ boolean Ei8() {
        return false;
    }

    @Override // X.AbstractC59962oe, X.InterfaceC60042om
    public final boolean getCanShowVoiceMessageBar() {
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0C;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0J);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A06;
        if (c81y != null && c81y.A06()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC53912dV
    public final void DWU(final C54822fg c54822fg) {
        int A0N = AbstractC167017dG.A0N(c54822fg, 1461970012);
        AbstractC167007dF.A0z(this, new Runnable() { // from class: X.7k6
            @Override // java.lang.Runnable
            public final void run() {
                C172027lX c172027lX;
                AnonymousClass195 anonymousClass195;
                C48672Ll c48672Ll;
                AnonymousClass195 anonymousClass1952;
                C207549Gh c207549Gh = C207549Gh.this;
                C81Y c81y = c207549Gh.A06;
                if (c81y != null) {
                    C54822fg c54822fg2 = c54822fg;
                    float f = c54822fg2.A01;
                    C54132eL c54132eL = c54822fg2.A04;
                    C14360o3.A07(c54132eL);
                    float A01 = c54132eL.A01(f);
                    if (A01 == 0.0f) {
                        c207549Gh.setUserVisibleHint(false);
                        C48672Ll c48672Ll2 = c207549Gh.A0B;
                        if (c48672Ll2 != null && (anonymousClass195 = c48672Ll2.A00) != null && anonymousClass195.isActive() && (c48672Ll = c207549Gh.A0B) != null && (anonymousClass1952 = c48672Ll.A00) != null) {
                            anonymousClass1952.AGH(null);
                        }
                    } else {
                        C207549Gh.A01(c207549Gh);
                    }
                    c81y.A00.A17.A00().A0A(AbstractC189418aK.A00(c54822fg2.A02), C05F.A0C, A01);
                    C171977lS c171977lS = c207549Gh.A08;
                    if (c171977lS == null) {
                        C14360o3.A0F("swipePercentageThresholdController");
                        throw C00O.createAndThrow();
                    }
                    c171977lS.A00 = A01;
                    if (A01 >= c171977lS.A02 && (c172027lX = c171977lS.A01) != null) {
                        c172027lX.A00.A01 = null;
                        c172027lX.A01.A05(false);
                    }
                }
            }
        });
        C0f9.A0A(1986652017, A0N);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.2fr, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(417748447);
        super.onCreate(bundle);
        C1KM.A04(this);
        C54822fg c54822fg = this.A0A;
        Context context = null;
        if (c54822fg == null) {
            C14360o3.A0F("navigationState");
            throw C00O.createAndThrow();
        }
        A70 a70 = this.A0K;
        InterfaceC09390do interfaceC09390do = this.A0J;
        C208279Jm c208279Jm = new C208279Jm(AbstractC166987dD.A0r(interfaceC09390do), a70, c54822fg);
        c208279Jm.A0P(requireContext(), C55772hI.A00(AbstractC166987dD.A0o(interfaceC09390do)), null, true);
        this.A04 = c208279Jm;
        this.A01 = c208279Jm.A02("QCC");
        if (bundle != null) {
            this.A02 = C82R.A00(AbstractC171987lT.A00(bundle.getString("SAVE_INSTANCE_KEY_LAST_CAMERA_DESTINATION", C208509Kk.A00.A02)), new C81W[0]);
            this.A0D = bundle.getString("SAVE_INSTANCE_KEY_AR_EFFECT_ID");
        }
        setModuleNameV2(this.A0C);
        C27961Xa A00 = AbstractC54912fq.A00();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A16;
        AbstractC54912fq.A00();
        this.A0G = A00.A02(this, this, A0r, new Object().A00(), quickPromotionSlot);
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        Context context2 = getContext();
        if (context2 != null) {
            context = context2.getApplicationContext();
        }
        if (AbstractC195888lY.A01(context, A0r2)) {
            C37101o8.A00(AbstractC195888lY.A00()).A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), new C24066Am5(this, 0), __redex_internal_original_name);
        }
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        this.A08 = new C171977lS((float) C18U.A00(AbstractC166997dE.A0U(A0o), A0o, 37174574034453102L));
        C43822JZk A002 = AbstractC208269Jl.A00(AbstractC166987dD.A0r(interfaceC09390do));
        C24Q c24q = A002.A04;
        if (c24q.A0E(585177486, A002.A00)) {
            c24q.A0C("fragment_created", A002.A00);
        }
        C0f9.A09(-1538381685, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(59943673);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_quick_capture, viewGroup, false);
        C0f9.A09(111862770, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1781293023);
        super.onDestroy();
        C54845OMq c54845OMq = this.A00;
        if (c54845OMq != null) {
            InterfaceC58276PsU interfaceC58276PsU = c54845OMq.A0B;
            if (interfaceC58276PsU.isConnected()) {
                interfaceC58276PsU.disconnect();
            }
        }
        C0f9.A09(1373587661, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2082327495);
        super.onDestroyView();
        C54822fg c54822fg = this.A0A;
        if (c54822fg == null) {
            C14360o3.A0F("navigationState");
            throw C00O.createAndThrow();
        }
        c54822fg.A01(this);
        C81Y c81y = this.A06;
        if (c81y != null) {
            c81y.A00();
        }
        this.A06 = null;
        unregisterLifecycleListener(this.A09);
        C81I c81i = this.A09;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A09 = null;
        C0f9.A09(-1421251991, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(2055031146);
        C43822JZk A00 = AbstractC208269Jl.A00(AbstractC166987dD.A0r(this.A0J));
        C81Y c81y = this.A06;
        C22P c22p = null;
        if (c81y != null) {
            c22p = c81y.A00.A01;
        }
        C0J8.A01();
        C24Q c24q = A00.A04;
        if (c24q.A0E(585177486, A00.A00)) {
            c24q.A0C("fragment_resumed", A00.A00);
            c24q.A09(A00.A00, "late_entry_point", String.valueOf(c22p));
        }
        C54822fg c54822fg = this.A0A;
        if (c54822fg == null) {
            C14360o3.A0F("navigationState");
            throw C00O.createAndThrow();
        }
        DWU(c54822fg);
        super.onResume();
        C54822fg c54822fg2 = this.A0A;
        if (c54822fg2 != null && c54822fg2.A01 != 0.0f) {
            AbstractC65987Txg.A01(requireActivity(), requireContext().getColor(R.color.fds_transparent));
            C30D.A02(requireActivity());
        }
        C0f9.A09(66358642, A02);
    }
}
