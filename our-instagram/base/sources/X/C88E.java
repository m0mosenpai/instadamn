package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.88E, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C88E implements InterfaceC1821886c, C88F, InterfaceC1810781j {
    public C88X A00;
    public C8TS A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final AbstractC10360h2 A08;
    public final AbstractC018607g A09;
    public final AbstractC59962oe A0A;
    public final InterfaceC11380iw A0B;
    public final UserSession A0C;
    public final C57012jc A0D;
    public final TargetViewSizeProvider A0E;
    public final C88R A0F;
    public final C88Y A0G;
    public final C88M A0H;
    public final C88H A0I;
    public final AnonymousClass880 A0J;
    public final InterfaceC1810081c A0K;
    public final List A0L;
    public final boolean A0N;
    public final AnonymousClass844 A0O;
    public final Map A0M = new HashMap();
    public boolean A02 = true;

    public final void A02() {
        if (this.A05) {
            C88M c88m = this.A0H;
            C88X A02 = c88m.A02(c88m.A00);
            A02.getClass();
            if (!A00(A02)) {
                this.A0J.A00().EMP(0, false);
            }
        }
    }

    @Override // X.InterfaceC1821886c
    public final /* synthetic */ void onResume() {
    }

    public static boolean A00(C88X c88x) {
        C88Z c88z = c88x.A04;
        if (c88z == null) {
            c88z = C88Z.A0G;
        }
        return c88z.equals(C88Z.A0g);
    }

    public final ACt A01(C88X c88x) {
        Map map = this.A0M;
        C88Z c88z = c88x.A04;
        if (c88z == null) {
            c88z = C88Z.A0G;
        }
        Object obj = map.get(c88z);
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find controller for element of type ");
        C88Z c88z2 = c88x.A04;
        if (c88z2 == null) {
            c88z2 = C88Z.A0G;
        }
        sb.append(c88z2);
        C18C.A07(obj, sb.toString());
        return (ACt) ((C150286pc) obj).get();
    }

    public final void A03() {
        if (this.A00 != null && !A0A()) {
            C88M c88m = this.A0H;
            List unmodifiableList = Collections.unmodifiableList(c88m.A08);
            C14360o3.A07(unmodifiableList);
            for (int i = 0; i < unmodifiableList.size(); i++) {
                C88Z c88z = ((C88X) unmodifiableList.get(i)).A04;
                if (c88z == null) {
                    c88z = C88Z.A0G;
                }
                C88Z c88z2 = this.A00.A04;
                if (c88z2 == null) {
                    c88z2 = C88Z.A0G;
                }
                if (c88z == c88z2) {
                    this.A0J.A00().EMP(i, this.A02);
                    c88m.A03(i);
                    A06((C88X) unmodifiableList.get(i), this.A00);
                    return;
                }
            }
        }
    }

    public final void A05() {
        UserSession userSession = this.A0C;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36327812643568521L)) {
            C11T.A02(new Runnable() { // from class: X.Aqr
                @Override // java.lang.Runnable
                public final void run() {
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = C88E.this.A0F.A04;
                    touchInterceptorFrameLayout.getClass();
                    touchInterceptorFrameLayout.setVisibility(8);
                }
            });
            return;
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A0F.A04;
        touchInterceptorFrameLayout.getClass();
        touchInterceptorFrameLayout.setVisibility(8);
    }

    public final void A06(C88X c88x, C88X c88x2) {
        InterfaceC183728Cx interfaceC183728Cx;
        List list;
        List list2;
        String str;
        List list3;
        JM1 jm1;
        List list4;
        C8TS c8ts = this.A01;
        boolean A00 = A00(c88x);
        C183688Ct c183688Ct = c8ts.A03;
        C8NW c8nw = (C8NW) c183688Ct.A1h.get();
        if (A00) {
            interfaceC183728Cx = c183688Ct.A1L;
        } else {
            interfaceC183728Cx = c183688Ct.A1M;
        }
        C14360o3.A0B(interfaceC183728Cx, 0);
        c8nw.A07 = interfaceC183728Cx;
        c8nw.A1l.A0T = interfaceC183728Cx.CSl();
        if (A00(c88x)) {
            if (!this.A03) {
                this.A01.A00();
            }
            C88R c88r = this.A0F;
            C150956qv.A08(new View[]{c88r.A02, c88r.A03}, true);
            C88T c88t = c88r.A09;
            c88t.A02();
            c88t.A03();
        } else {
            ACt A01 = A01(c88x);
            boolean z = A01 instanceof C218089kg;
            if (z) {
                C218089kg c218089kg = (C218089kg) A01;
                C14360o3.A0B(c88x, 0);
                C38828H7z c38828H7z = c88x.A0C;
                if (c38828H7z != null && (list4 = c38828H7z.A00) != null) {
                    c218089kg.A04 = list4;
                } else {
                    throw AbstractC166987dD.A14("CanvasTemplatesController: cannot set templates dial element without templates info.");
                }
            } else if (!(A01 instanceof C217989kW) && !(A01 instanceof C217999kX)) {
                if (A01 instanceof C218109ki) {
                    List list5 = c88x.A0L;
                    list5.getClass();
                    ((C218109ki) A01).A05 = list5;
                } else if (!(A01 instanceof C218099kh) && !(A01 instanceof C218079kf)) {
                    if (A01 instanceof C218019kZ) {
                        C22881A7b c22881A7b = c88x.A0B;
                        c22881A7b.getClass();
                        ((C218019kZ) A01).A01 = c22881A7b;
                    } else if (!(A01 instanceof C217959kT)) {
                        if (A01 instanceof C218029ka) {
                            C218029ka c218029ka = (C218029ka) A01;
                            C14360o3.A0B(c88x, 0);
                            List A02 = c88x.A02();
                            if (A02 != null) {
                                c218029ka.A01 = A02;
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        } else if (A01 instanceof C218039kb) {
                            ((C218039kb) A01).A01 = c88x;
                        } else if (A01 instanceof C218049kc) {
                            C218049kc c218049kc = (C218049kc) A01;
                            C14360o3.A0B(c88x, 0);
                            A69 a69 = c88x.A0A;
                            if (a69 != null) {
                                List list6 = a69.A00;
                                if (list6 != null) {
                                    list = ImmutableList.copyOf((Collection) list6);
                                    C14360o3.A07(list);
                                } else {
                                    C0w9.A01.EmN("javaClass", "empty media list");
                                    list = C16930sl.A00;
                                }
                                List list7 = c218049kc.A04;
                                if (list7 != null && list7.size() == list.size()) {
                                    int size = list.size();
                                    for (int i = 0; i < size; i++) {
                                        if (C14360o3.A0K(c218049kc.A04.get(i), list.get(i))) {
                                        }
                                    }
                                }
                                c218049kc.A04 = list;
                                c218049kc.A02 = new SparseArray(list.size());
                                break;
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        } else if (A01 instanceof C218059kd) {
                            A68 a68 = c88x.A09;
                            a68.getClass();
                            List list8 = a68.A00;
                            list8.getClass();
                            ((C218059kd) A01).A06 = list8;
                        } else if (A01 instanceof C218069ke) {
                            C218069ke c218069ke = (C218069ke) A01;
                            H3P h3p = c88x.A02;
                            h3p.getClass();
                            c218069ke.A00 = h3p.A02;
                            c218069ke.A03 = c88x.A02.A03;
                        } else if (A01 instanceof C218009kY) {
                            C218009kY c218009kY = (C218009kY) A01;
                            C14360o3.A0B(c88x, 0);
                            List list9 = c88x.A0H;
                            list9.getClass();
                            ImmutableList copyOf = ImmutableList.copyOf((Collection) list9);
                            if (copyOf != null) {
                                c218009kY.A02 = copyOf;
                                c218009kY.A01 = copyOf.size() + 1;
                                c218009kY.A04 = false;
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        } else if (!(A01 instanceof C217979kV) && (A01 instanceof C218119kj)) {
                            C218119kj c218119kj = (C218119kj) A01;
                            C214509eo c214509eo = c88x.A07;
                            c214509eo.getClass();
                            c218119kj.A01 = c214509eo.A00();
                            c218119kj.A02 = c88x.A07.A03;
                        }
                    }
                }
            }
            if (c88x2 != null && z) {
                C218089kg c218089kg2 = (C218089kg) A01;
                C38828H7z c38828H7z2 = c88x2.A0C;
                if (c38828H7z2 != null && (list2 = c38828H7z2.A00) != null && AbstractC001800i.A0O(list2, 0) != null) {
                    int size2 = c218089kg2.A04.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            break;
                        }
                        String C5f = ((JM1) c218089kg2.A04.get(i2)).C5f();
                        C38828H7z c38828H7z3 = c88x2.A0C;
                        if (c38828H7z3 != null && (list3 = c38828H7z3.A00) != null && (jm1 = (JM1) AbstractC001800i.A0O(list3, 0)) != null) {
                            str = jm1.C5f();
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(C5f, str)) {
                            c218089kg2.A00 = i2;
                            break;
                        }
                        i2++;
                    }
                } else {
                    AbstractC12120kG.A07("CanvasTemplatesController", "Selected CanvasTemplatesController with an initialDialElement, but the initialDialElement does not contain an initial template", null);
                }
                c218089kg2.A0A();
            } else {
                A01.A06();
            }
            this.A0F.A01(A01);
        }
        C8TN c8tn = this.A01.A02;
        c8tn.A0P.A00().A0O(!c8tn.A0E.A09());
        C8TN.A07(c8tn);
    }

    public final void A07(boolean z) {
        C55U c55u;
        if (this instanceof C88I) {
            this.A05 = false;
            if (z) {
                this.A0J.A00().hide();
                return;
            }
            return;
        }
        if (A09()) {
            C88X A01 = this.A0H.A01();
            C18C.A07(A01, "If a specific create mode was selected, the current dial element should not be null.");
            A01(A01).A08(true);
        }
        this.A05 = false;
        if (z) {
            this.A0J.A00().hide();
        }
        C57012jc c57012jc = this.A0D;
        if (c57012jc.A04()) {
            C150956qv.A08(new View[]{c57012jc.A01()}, true);
        }
        C448024k c448024k = AnonymousClass229.A01(this.A0C).A07;
        C18920wW c18920wW = c448024k.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
        if (!A00.isSampled()) {
            return;
        }
        A00.AAP("entity", "CREATE_MODE");
        A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_CREATE_MODE_SESSION");
        C22M c22m = c448024k.A04;
        String str = c22m.A0L;
        if (str == null) {
            str = "";
        }
        A00.AAP("camera_session_id", str);
        int i = 2;
        if (c22m.A01 != 2) {
            i = 1;
        }
        A00.A8p("camera_position", Integer.valueOf(i));
        C1810981l c1810981l = c22m.A0E;
        if (c1810981l == null || (c55u = (C55U) c1810981l.A08.A00) == null) {
            c55u = C208509Kk.A00;
        }
        A00.A8R(c55u.A00, "camera_destination");
        A00.A8R(c448024k.A0I(), "capture_type");
        A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A00.A8p("event_type", 2);
        A00.A8R(c22m.A0A, "media_type");
        A00.AAP("module", C22F.A08.getModuleName());
        A00.A8R(EnumC50631MWs.A06, "surface");
        A00.A9K("capture_format_index", 0L);
        A00.AAk("camera_tools_struct", c448024k.A0N(0));
        A00.AAP("discovery_session_id", c22m.A0O);
        A00.AAP("search_session_id", c22m.A0P);
        A00.AAP("nav_chain", C1QM.A00.A02.A00);
        A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
        A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
        A00.AAP("device_fold_state", AbstractC82683mW.A00);
        A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
        A00.Cht();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r5 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(boolean r5) {
        /*
            r4 = this;
            X.88R r3 = r4.A0F
            boolean r2 = r4.A04
            android.view.View r1 = r3.A01
            if (r1 == 0) goto L1f
            r0 = 8
            if (r5 == 0) goto Ld
            r0 = 0
        Ld:
            r1.setVisibility(r0)
            X.2jc r1 = r3.A08
            boolean r0 = r1.A04()
            if (r2 == 0) goto L20
            if (r0 == 0) goto L1f
        L1a:
            r0 = 8
        L1c:
            r1.A03(r0)
        L1f:
            return
        L20:
            if (r0 == 0) goto L1f
            r0 = 0
            if (r5 != 0) goto L1c
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88E.A08(boolean):void");
    }

    public final boolean A09() {
        if (this.A05) {
            C88X A01 = this.A0H.A01();
            A01.getClass();
            if (!A00(A01)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0A() {
        if (this.A00 != null) {
            C88M c88m = this.A0H;
            if (c88m.A01() != null) {
                C88Z c88z = this.A00.A04;
                if (c88z == null) {
                    c88z = C88Z.A0G;
                }
                C88Z c88z2 = c88m.A01().A04;
                if (c88z2 == null) {
                    c88z2 = C88Z.A0G;
                }
                if (c88z.equals(c88z2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C85H
    public final /* bridge */ /* synthetic */ boolean A7D(Object obj, Object obj2) {
        if (obj == EnumC1810181d.A0j) {
            if (((obj2 instanceof C187588Tb) || (obj2 instanceof C188058Uw) || (obj2 instanceof C188068Ux)) && A09()) {
                return false;
            }
            if (obj2 instanceof C8UR) {
                C88M c88m = this.A0H;
                if (c88m.A01() != null && A09()) {
                    ACt A01 = A01(c88m.A01());
                    if ((A01 instanceof C218109ki) || (A01 instanceof C218069ke)) {
                        return A01(c88m.A01()).A09();
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        EnumC1810181d enumC1810181d = (EnumC1810181d) obj2;
        switch (((EnumC1810181d) obj).ordinal()) {
            case 17:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            case 30:
            case 56:
                this.A04 = false;
                if (enumC1810181d != EnumC1810181d.A0j) {
                    C57012jc c57012jc = this.A0F.A08;
                    if (c57012jc.A04()) {
                        c57012jc.A03(0);
                        break;
                    }
                }
                break;
        }
        switch (enumC1810181d.ordinal()) {
            case 17:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 22:
            case 23:
            case 25:
            case 27:
            case 30:
            case 56:
                this.A04 = true;
                C57012jc c57012jc2 = this.A0F.A08;
                if (!c57012jc2.A04()) {
                    return;
                }
                c57012jc2.A03(8);
                return;
            default:
                return;
        }
    }

    @Override // X.C88F
    public final /* bridge */ /* synthetic */ void DvM(Object obj) {
        if (((EnumC1810181d) obj).ordinal() == 11) {
            C88M c88m = this.A0H;
            if (c88m.A01() != null && A09()) {
                ACt A01 = A01(c88m.A01());
                if ((A01 instanceof C218109ki) || (A01 instanceof C218069ke)) {
                    this.A0F.A09.A03();
                }
            }
        }
    }

    @Override // X.C88F
    public final /* bridge */ /* synthetic */ void DvQ(Object obj) {
        if (((EnumC1810181d) obj).ordinal() == 11) {
            C88M c88m = this.A0H;
            if (c88m.A01() != null && A09()) {
                ACt A01 = A01(c88m.A01());
                if ((A01 instanceof C218109ki) || (A01 instanceof C218069ke)) {
                    return;
                }
            }
            this.A0K.E4u(new Object());
        }
    }

    @Override // X.InterfaceC1821886c
    public final void onPause() {
        C88T c88t = this.A0F.A09;
        if (c88t.A08) {
            c88t.A03();
        }
    }

    public C88E(View view, InterfaceC11380iw interfaceC11380iw, C3I9 c3i9, TargetViewSizeProvider targetViewSizeProvider, C81J c81j, AnonymousClass880 anonymousClass880, InterfaceC1810081c interfaceC1810081c, AnonymousClass844 anonymousClass844) {
        C88K c88k;
        boolean z;
        OpenCarouselCaptureConfig openCarouselCaptureConfig;
        c81j.A0M.getClass();
        AbstractC59962oe abstractC59962oe = c81j.A0M;
        this.A0A = abstractC59962oe;
        Context requireContext = abstractC59962oe.requireContext();
        this.A06 = requireContext;
        this.A0B = interfaceC11380iw;
        this.A0J = anonymousClass880;
        this.A0I = new C88H() { // from class: X.88G
            @Override // X.C88H
            public final void CkA() {
            }

            @Override // X.C88H
            public final void DDA(C88X c88x) {
            }

            @Override // X.C88H
            public final boolean Ejm(C88X c88x) {
                return false;
            }
        };
        UserSession userSession = c81j.A0S;
        this.A0C = userSession;
        if (this instanceof C88I) {
            final C88I c88i = (C88I) this;
            c88k = new C88K() { // from class: X.892
                @Override // X.C88L
                public final void DA8(int i) {
                }

                @Override // X.AnonymousClass887
                public final void DDD(C88X c88x, int i, boolean z2) {
                }

                @Override // X.AnonymousClass887
                public final void DNi(C88X c88x, int i) {
                }

                @Override // X.AnonymousClass887
                public final void DDB(C88X c88x, String str, int i, boolean z2) {
                    if (c88x != null) {
                        C88I.this.A0J.A00().EMP(i, z2);
                    }
                }
            };
        } else {
            c88k = new C88K() { // from class: X.88J
                @Override // X.C88L
                public final void DA8(int i) {
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0150  */
                @Override // X.AnonymousClass887
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void DDB(X.C88X r8, java.lang.String r9, int r10, boolean r11) {
                    /*
                        Method dump skipped, instructions count: 394
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C88J.DDB(X.88X, java.lang.String, int, boolean):void");
                }

                @Override // X.AnonymousClass887
                public final void DDD(C88X c88x, int i, boolean z2) {
                    C88E c88e = C88E.this;
                    if (c88x != null && !C88E.A00(c88x)) {
                        c88e.A01(c88x).A08(false);
                    }
                }

                @Override // X.AnonymousClass887
                public final void DNi(C88X c88x, int i) {
                    C8TS c8ts = C88E.this.A01;
                    c8ts.A02.A09(c88x);
                    C1821786b c1821786b = c8ts.A04;
                    c1821786b.A03 = c88x;
                    C1821786b.A06(c1821786b);
                }
            };
        }
        this.A0H = new C88M(requireContext, interfaceC11380iw, userSession, c88k);
        this.A0K = interfaceC1810081c;
        ((C1809981b) interfaceC1810081c).A01.A01(this, EnumC1810181d.A0j);
        interfaceC1810081c.A82(this);
        this.A07 = view;
        this.A09 = AbstractC018607g.A00(abstractC59962oe);
        this.A08 = abstractC59962oe.getParentFragmentManager();
        this.A0O = anonymousClass844;
        C57012jc c57012jc = new C57012jc((ViewStub) view.findViewById(R.id.canvas_action_button_container_stub));
        this.A0D = c57012jc;
        C88Q c88q = new C88Q(this);
        if (c81j.A1I != null || c81j.A1S != null || ((openCarouselCaptureConfig = c81j.A0b) != null && openCarouselCaptureConfig.A02 != null)) {
            z = true;
        } else {
            z = false;
        }
        this.A0F = new C88R(requireContext, view, c3i9, c57012jc, c88q, interfaceC1810081c, z);
        this.A0N = c81j.A17.A05;
        this.A0E = targetViewSizeProvider;
        this.A00 = c81j.A0N;
        this.A0L = c81j.A30;
        this.A0G = new C88Y(this);
        Map map = this.A0M;
        map.put(C88Z.A0U, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88h
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                C88Y c88y = c88e.A0G;
                return new C218039kb(c88e.A06, c88e.A0C, c88e.A0E, c88y);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0V, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88i
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                return new C218029ka(c88e.A06, c88e.A0C, c88e.A0G);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0a, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88j
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                return new C218019kZ(c88e.A06, c88e.A0C, c88e.A0G);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0D, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88k
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                C88Y c88y = c88e.A0G;
                return new C218119kj(c88e.A06, c88e.A07, c88e.A0C, c88y, c88e.A0B.getModuleName());
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0b, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88l
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                C88Y c88y = c88e.A0G;
                Context context = c88e.A06;
                InterfaceC11380iw interfaceC11380iw2 = c88e.A0B;
                UserSession userSession2 = c88e.A0C;
                return new C218109ki(context, c88e.A09, interfaceC11380iw2, userSession2, c88e.A0E, c88y, c88e.A0K);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0M, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88m
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                return new C218069ke(c88e.A06, c88e.A0C, c88e.A0G);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0R, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88n
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                C88Y c88y = c88e.A0G;
                return new C218059kd(c88e.A06, c88e.A07, c88e.A0C, c88e.A0E, c88y);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0f, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88o
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                C88Y c88y = c88e.A0G;
                return new C218089kg(c88e.A06, c88e.A07, c88e.A0C, c88e.A0E, c88y);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0S, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88p
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                C88Y c88y = c88e.A0G;
                return new C218049kc(c88e.A06, c88e.A07, c88e.A0C, c88e.A0E, c88y);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0K, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88q
            @Override // X.InterfaceC08830cm
            public final Object get() {
                AlB alB;
                C189138Ze c189138Ze;
                C88E c88e = C88E.this;
                C88Y c88y = c88e.A0G;
                Context context = c88e.A06;
                UserSession userSession2 = c88e.A0C;
                View view2 = c88e.A07;
                AbstractC59962oe abstractC59962oe2 = c88e.A0A;
                InterfaceC1810081c interfaceC1810081c2 = c88e.A0K;
                C88X c88x = c88e.A00;
                if (c88x != null && (c189138Ze = c88x.A08) != null) {
                    alB = new AlB(c189138Ze);
                } else {
                    alB = null;
                }
                return new C218009kY(context, view2, abstractC59962oe2, userSession2, c88y, interfaceC1810081c2, alB);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0F, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88r
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                return new C217979kV(c88e.A06, c88e.A0C, c88e.A0G);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0e, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88s
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                return new C217989kW(c88e.A06, c88e.A0C, c88e.A0G);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0I, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88t
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                C88Y c88y = c88e.A0G;
                return new C218099kh(c88e.A06, c88e.A0C, c88e.A01.A03.A0y, c88e.A0E, c88y);
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A09, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88u
            @Override // X.InterfaceC08830cm
            public final Object get() {
                C88E c88e = C88E.this;
                C88Y c88y = c88e.A0G;
                return new C218079kf(c88e.A06, c88e.A0C, c88e.A01.A03.A0y, c88e.A0E, c88y);
            }
        }, new InterfaceC143366db[0]));
        final List list = this.A0L;
        if (list != null && !list.isEmpty()) {
            map.put(C88Z.A0d, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.B29
                @Override // X.InterfaceC08830cm
                public final Object get() {
                    C88E c88e = C88E.this;
                    List list2 = list;
                    C88Y c88y = c88e.A0G;
                    return new C217999kX(c88e.A06, c88e.A0C, c88e.A01.A03.A0y, c88e.A0E, c88y, list2);
                }
            }, new InterfaceC143366db[0]));
        }
        map.put(C88Z.A0X, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88v
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return new Object();
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0Z, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88w
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return new Object();
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0Y, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88x
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return new Object();
            }
        }, new InterfaceC143366db[0]));
        map.put(C88Z.A0g, AbstractC150276pb.A00(new InterfaceC08830cm() { // from class: X.88y
            @Override // X.InterfaceC08830cm
            public final Object get() {
                final C88E c88e = C88E.this;
                return new ACt() { // from class: X.9kU
                };
            }
        }, new InterfaceC143366db[0]));
    }

    public final void A04() {
        Drawable drawable;
        Object c187958Um;
        AlD alD;
        Wm1 wm1;
        C88Y c88y;
        if (A09()) {
            C88M c88m = this.A0H;
            C88X A01 = c88m.A01();
            C18C.A07(A01, "If a specific create mode was selected, the current dial element should not be null.");
            ACt A012 = A01(A01);
            ArrayList A0T = this.A01.A03.A1t.A0T(Drawable.class);
            if (AnonymousClass483.A04(A0T)) {
                drawable = null;
            } else {
                drawable = (Drawable) A0T.get(0);
            }
            if (A012.A09()) {
                if (A012 instanceof C218089kg) {
                    C218089kg c218089kg = (C218089kg) A012;
                    C88Y c88y2 = c218089kg.A08;
                    c88y2.A08(c218089kg.A03);
                    c88y2.A08(c218089kg.A02);
                } else if (A012 instanceof C218049kc) {
                    C218049kc c218049kc = (C218049kc) A012;
                    C88Y c88y3 = c218049kc.A09;
                    c88y3.A08(drawable);
                    c88y3.A08(c218049kc.A01);
                    c88y3.A08(c218049kc.A03);
                    c88y3.A0E(C88Z.A0S, (C38321qM) c218049kc.A04.get(c218049kc.A00));
                } else {
                    if (A012 instanceof C218059kd) {
                        C218059kd c218059kd = (C218059kd) A012;
                        c88y = c218059kd.A0A;
                        c88y.A0E(C88Z.A0R, c218059kd.A05);
                    } else if (A012 instanceof C218119kj) {
                        c88y = ((C218119kj) A012).A06;
                    }
                    C8TS c8ts = c88y.A00.A01;
                    c8ts.A08.A0r(new C23525Abf(c8ts, true));
                }
            } else {
                if (!(A012 instanceof C218109ki) && !(A012 instanceof C218069ke)) {
                    C1810281e c1810281e = ((C1809981b) this.A0K).A01;
                    if (!(A012 instanceof C218089kg)) {
                        if ((A012 instanceof C217989kW) || (A012 instanceof C217999kX) || (A012 instanceof C218099kh) || (A012 instanceof C218079kf)) {
                            return;
                        }
                        if (A012 instanceof C218019kZ) {
                            C218019kZ c218019kZ = (C218019kZ) A012;
                            if ((drawable instanceof V9Y) && (wm1 = ((V9Y) drawable).A0H) != null) {
                                c187958Um = new C8UV(wm1);
                            } else {
                                C22881A7b c22881A7b = c218019kZ.A01;
                                c22881A7b.getClass();
                                c187958Um = new C8UV(c22881A7b.A00);
                            }
                            c1810281e.getClass();
                        } else if (!(A012 instanceof C217959kT)) {
                            if (A012 instanceof C218029ka) {
                                if (drawable instanceof C221179pf) {
                                    alD = ((AbstractC220929pG) drawable).A0D;
                                } else {
                                    alD = null;
                                }
                                c187958Um = new C187838Ua(alD, false, false, false);
                            } else if (A012 instanceof C218039kb) {
                                c1810281e.getClass();
                                c187958Um = new C8UW((C220789p2) drawable);
                            } else if (!(A012 instanceof C218049kc) && !(A012 instanceof C218059kd)) {
                                if (A012 instanceof C218009kY) {
                                    C218009kY c218009kY = (C218009kY) A012;
                                    UserSession userSession = c218009kY.A08;
                                    AbstractC55215Oed.A03(c218009kY.A07, userSession, "CREATE_MODE_NULLSTATE");
                                    AbstractC226449z1.A00(c218009kY.A06, userSession).A00().A03(c218009kY.A05, c218009kY.A0A);
                                    return;
                                }
                                if ((A012 instanceof C217979kV) || !(A012 instanceof C218119kj)) {
                                    return;
                                }
                                if (drawable instanceof C220919pF) {
                                    c1810281e.getClass();
                                    c187958Um = new C187958Um(((C220919pF) drawable).A00);
                                }
                            }
                        }
                        c1810281e.A04(c187958Um);
                    }
                    this.A01.A00();
                    return;
                }
                this.A0F.A00();
                A01(c88m.A01()).A07(((C1809981b) this.A0K).A01);
                return;
            }
        }
        this.A0K.E4u(new Object());
    }
}
