package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.endtoend.EndToEnd;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.82r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1813982r implements InterfaceC11380iw, InterfaceC23471Cj {
    public static boolean A0Y = true;
    public InterfaceC142616cN A00;
    public C177447ue A01;
    public C174757qB A02;
    public C184948Ij A03;
    public C184938Ii A04;
    public C195838lR A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final int A0D;
    public final Activity A0E;
    public final ViewGroup A0F;
    public final ViewStub A0G;
    public final InterfaceC1813882q A0J;
    public final C1813282k A0K;
    public final UserSession A0L;
    public final C1810981l A0M;
    public final InterfaceC08830cm A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final C172027lX A0T;
    public final C171977lS A0U;
    public final AnonymousClass825 A0V;
    public final Integer A0W;
    public static final String __redex_internal_original_name = "CameraInitializationController";
    public static final String A0Z = AnonymousClass001.A0R("sup:", __redex_internal_original_name);
    public final List A0N = new ArrayList(4);
    public final C1814082s A0H = new C1814082s();
    public final Map A0X = new HashMap();
    public final InterfaceC1814282u A0I = new InterfaceC1814282u() { // from class: X.82t
        @Override // X.InterfaceC1814282u
        public final void DM7(C177447ue c177447ue) {
            ViewStub viewStub;
            C174757qB c174757qB;
            C1813982r c1813982r = C1813982r.this;
            C184948Ij c184948Ij = c1813982r.A03;
            if (c184948Ij != null && (c174757qB = c1813982r.A02) != null) {
                C81Z c81z = c184948Ij.A01;
                final AnonymousClass828 anonymousClass828 = c184948Ij.A02;
                C184958Ik c184958Ik = c184948Ij.A00;
                boolean A0H = ((C178647wc) ((InterfaceC178667we) ((AbstractC179807yU) C174757qB.A02(c174757qB)).A00.Aq0(InterfaceC178667we.A00))).A02.A0H();
                c81z.A0M.A00().A05.A08 = c174757qB;
                C1810981l c1810981l = c81z.A0V;
                C208509Kk c208509Kk = C208509Kk.A00;
                C81W c81w = C81W.A0D;
                c1810981l.A0K(c208509Kk, c81w, A0H);
                c1810981l.A0K(C81T.A00, c81w, A0H);
                C81U c81u = C81U.A00;
                c1810981l.A0K(c81u, c81w, A0H);
                C184528Gs c184528Gs = (C184528Gs) c81z.A1A.A00.A00();
                c184528Gs.A06 = new C177497uj(c174757qB, c81z.A1P);
                C184528Gs.A01(c184528Gs, ((java.util.Set) c184528Gs.A0H.A09.A00).contains(c81w));
                final C8HI c8hi = c81z.A0k;
                C14360o3.A0B(c8hi, 0);
                C59072n8 A00 = C59062n7.A00(null, null, "camera_preview");
                A00.A00(new InterfaceC43071ya() { // from class: X.7uk
                    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[ORIG_RETURN, RETURN] */
                    @Override // X.InterfaceC43071ya
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void ATP(X.C59062n7 r7, X.InterfaceC57162jr r8) {
                        /*
                            r6 = this;
                            r1 = 0
                            X.C14360o3.A0B(r7, r1)
                            r0 = 1
                            X.C14360o3.A0B(r8, r0)
                            X.8HI r3 = X.C8HI.this
                            X.9Lk r2 = r3.A0C
                            X.9R2 r0 = r3.A0D
                            if (r2 != 0) goto L17
                            if (r0 == 0) goto L24
                            boolean r0 = r0.A01
                        L14:
                            if (r0 != 0) goto L24
                        L16:
                            return
                        L17:
                            if (r0 != 0) goto L1c
                            boolean r0 = r2.A03
                            goto L14
                        L1c:
                            boolean r0 = r0.A01
                            if (r0 == 0) goto L16
                            boolean r0 = r2.A03
                            if (r0 == 0) goto L16
                        L24:
                            java.lang.Integer r0 = r8.CFq(r7)
                            int r2 = r0.intValue()
                            if (r2 == r1) goto L70
                            r0 = 2
                            if (r2 != r0) goto L16
                            boolean r0 = r3.A0I
                            if (r0 == 0) goto L38
                            r3.onPause()
                        L38:
                            boolean r0 = X.C1KM.A08
                            X.828 r0 = r2
                            X.2oe r0 = r0.A02
                            java.lang.String r3 = r0.getModuleName()
                            X.C14360o3.A0B(r3, r1)
                            boolean r0 = X.C1KT.A05
                            if (r0 == 0) goto L59
                            X.1KO r1 = X.C1KT.A04
                            long r4 = android.os.SystemClock.uptimeMillis()
                            java.lang.String r2 = "camera"
                            X.8tt r0 = new X.8tt
                            r0.<init>(r1, r2, r3, r4)
                            X.C1KT.A01(r0)
                        L59:
                            boolean r0 = X.C1KM.A08
                            if (r0 == 0) goto L16
                            X.1KO r1 = X.C1KM.A01()
                            long r4 = android.os.SystemClock.uptimeMillis()
                            java.lang.String r2 = "camera"
                            X.8tt r0 = new X.8tt
                            r0.<init>(r1, r2, r3, r4)
                        L6c:
                            X.C1KM.A05(r0)
                            return
                        L70:
                            boolean r0 = r3.A0I
                            if (r0 != 0) goto L77
                            r3.onResume()
                        L77:
                            boolean r0 = X.C1KM.A08
                            X.828 r0 = r2
                            X.2oe r0 = r0.A02
                            java.lang.String r3 = r0.getModuleName()
                            X.C14360o3.A0B(r3, r1)
                            boolean r0 = X.C1KT.A05
                            if (r0 == 0) goto L98
                            X.1KO r1 = X.C1KT.A04
                            long r4 = android.os.SystemClock.uptimeMillis()
                            java.lang.String r2 = "camera"
                            X.7v6 r0 = new X.7v6
                            r0.<init>(r1, r2, r3, r4)
                            X.C1KT.A01(r0)
                        L98:
                            boolean r0 = X.C1KM.A08
                            if (r0 == 0) goto L16
                            X.1KO r1 = X.C1KM.A01()
                            long r4 = android.os.SystemClock.uptimeMillis()
                            java.lang.String r2 = "camera"
                            X.7v6 r0 = new X.7v6
                            r0.<init>(r1, r2, r3, r4)
                            goto L6c
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C177507uk.ATP(X.2n7, X.2jr):void");
                    }
                });
                C59062n7 A01 = A00.A01();
                View requireViewById = anonymousClass828.A01.requireViewById(R.id.camera_stub_constraint_layout);
                C14360o3.A07(requireViewById);
                View findViewById = requireViewById.findViewById(R.id.camera_view);
                if (findViewById == null && (findViewById = requireViewById.findViewById(R.id.preview_view)) == null) {
                    AbstractC12120kG.A07("QuickCaptureViewpointController", "Camera preview view not found.", null);
                } else {
                    anonymousClass828.A03.A05(findViewById, A01);
                }
                if (AnonymousClass836.A00(c81z.A0Q)) {
                    c184958Ik.getClass();
                    java.util.Set set = c184958Ik.A04;
                    HashMap hashMap = c1810981l.A0E;
                    AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(c81u);
                    if (abstractCollection == null) {
                        abstractCollection = new HashSet();
                        hashMap.put(c81u, abstractCollection);
                    }
                    abstractCollection.clear();
                    abstractCollection.addAll(set);
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        C1810981l.A04(c81u, (C81W) it.next(), c1810981l, false);
                    }
                }
            }
            C174757qB c174757qB2 = c1813982r.A02;
            if (c174757qB2 != null && c174757qB2.A0T() && c177447ue.A00 == null) {
                return;
            }
            c1813982r.A01 = c177447ue;
            c1813982r.A0A = true;
            C1814082s c1814082s = c1813982r.A0H;
            List list = c1814082s.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                InterfaceC1814282u interfaceC1814282u = (InterfaceC1814282u) list.get(i);
                c1814082s.A02(interfaceC1814282u);
                interfaceC1814282u.DM7(c177447ue);
            }
            C174757qB c174757qB3 = c1813982r.A02;
            if (c174757qB3 != null) {
                c174757qB3.A0S(c1813982r.A0Q);
            }
            if (!c1813982r.A0P || (viewStub = (ViewStub) c1813982r.A0F.findViewById(R.id.birthday_selfie_confetti_view_stub)) == null) {
                return;
            }
            CircularImageView circularImageView = (CircularImageView) viewStub.inflate().requireViewById(R.id.birthday_selfie_confetti_circular_imageview);
            AbstractC73003Pb.A00(circularImageView.getContext(), circularImageView);
            AbstractC73003Pb.A01(circularImageView.getDrawable());
        }

        @Override // X.InterfaceC1814282u
        public final void DEf(Exception exc) {
            EndToEnd.A05();
            C1813982r c1813982r = C1813982r.this;
            AbstractC12120kG.A01("Camera initialization failure", AbstractC174697q4.A03(exc));
            C1814082s c1814082s = c1813982r.A0H;
            List list = c1814082s.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                InterfaceC1814282u interfaceC1814282u = (InterfaceC1814282u) list.get(i);
                c1814082s.A02(interfaceC1814282u);
                interfaceC1814282u.DEf(exc);
            }
        }
    };

    private void A00() {
        UserSession userSession = this.A0L;
        Activity activity = this.A0E;
        if (AbstractC195888lY.A01(activity.getApplicationContext(), userSession)) {
            AbstractC195978lm.A02.A01(A0Z, "maybeStoreMediaStreamControllerCallback");
            C37101o8.A00(AbstractC195888lY.A00()).A00(activity.getApplicationContext(), userSession, new InterfaceC57997Pnh() { // from class: X.Am4
                @Override // X.InterfaceC57997Pnh
                public final void Dd6(C54845OMq c54845OMq) {
                    C1813982r c1813982r = C1813982r.this;
                    if (c1813982r.A02 == null) {
                        String str = C1813982r.A0Z;
                        C195988ln c195988ln = AbstractC195978lm.A02;
                        C14360o3.A0B(str, 0);
                        c195988ln.A06(str, "maybeSetupMediaStreamController null cameraController", null);
                        return;
                    }
                    String str2 = C1813982r.A0Z;
                    C195988ln c195988ln2 = AbstractC195978lm.A02;
                    c195988ln2.A01(str2, "running maybeSetupMediaStreamController");
                    C174757qB c174757qB = c1813982r.A02;
                    c174757qB.A04 = new C55872OrM(c54845OMq, c1813982r);
                    c195988ln2.A01(str2, AnonymousClass001.A1D("mCameraController isInitialised: ", c174757qB.CWZ()));
                    if (!c1813982r.A02.CWZ()) {
                        return;
                    }
                    c195988ln2.A01(str2, "Calling reinitializeInputToggleListener");
                    C174757qB.A04(c1813982r.A02);
                }
            }, __redex_internal_original_name);
        }
    }

    public static void A01(C1813982r c1813982r, boolean z) {
        String str;
        boolean z2;
        String str2;
        String str3;
        C195838lR c195838lR = c1813982r.A05;
        if (c195838lR != null) {
            c195838lR.A00();
        }
        C174757qB c174757qB = c1813982r.A02;
        if (c174757qB == null) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("igcam_start_camera_initialization", -670230927);
            }
            try {
                if (Systrace.A0E(1L)) {
                    C0fO.A01("igcam_inflate_optic_layout", 1084636240);
                }
                Activity activity = c1813982r.A0E;
                boolean A00 = C6PX.A00(activity.getApplicationContext());
                try {
                    UserSession userSession = c1813982r.A0L;
                    C174627pw c174627pw = new C174627pw(userSession, activity.getApplicationContext());
                    c174627pw.A00 = Integer.MAX_VALUE;
                    A0Y = false;
                    ViewStub viewStub = c1813982r.A0G;
                    C1810981l c1810981l = c1813982r.A0M;
                    C1811981v c1811981v = c1810981l.A08;
                    String str4 = ((C55U) c1811981v.A00).A01;
                    Map map = C174647py.A01;
                    Context applicationContext = activity.getApplicationContext();
                    EnumC174667q0 enumC174667q0 = EnumC174667q0.HIGH;
                    c1813982r.A02 = AbstractC174697q4.A02(viewStub, new C174677q1(applicationContext, enumC174667q0, enumC174667q0, c174627pw, userSession), c174627pw, c1813982r.A0J, userSession, str4, A00 ? 1 : 0, c1813982r.A0S);
                    c1813982r.A00();
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(184883532);
                    }
                    z2 = true;
                    c1813982r.A02.EYx(true);
                    int A002 = AbstractC174837qJ.A00(userSession, (C55U) c1811981v.A00, Integer.valueOf(c1813982r.A0D), c1810981l.A0W(C81W.A0C));
                    C174757qB c174757qB2 = c1813982r.A02;
                    c174757qB2.A00 = A002;
                    if (!A00) {
                        String name = ((C22P) c1813982r.A0O.get()).name();
                        if (z) {
                            str3 = ":GALLERY_SWIPE";
                        } else {
                            str3 = "";
                        }
                        c174757qB2.A0Q((C55U) c1811981v.A00, AnonymousClass001.A0R(name, str3));
                    } else {
                        c1813982r.A0K.A00(c174757qB2.A0H.A00(), c174757qB2, ((C55U) c1811981v.A00).A01, c1813982r.A0R);
                        C174757qB c174757qB3 = c1813982r.A02;
                        String name2 = ((C22P) c1813982r.A0O.get()).name();
                        if (z) {
                            str2 = ":GALLERY_SWIPE";
                        } else {
                            str2 = "";
                        }
                        c174757qB3.A0Q((C55U) c1811981v.A00, AnonymousClass001.A0R(name2, str2));
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(471589795);
                    }
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-973672690);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1342204948);
                }
                throw th2;
            }
        } else {
            String name3 = ((C22P) c1813982r.A0O.get()).name();
            if (z) {
                str = ":GALLERY_SWIPE";
            } else {
                str = "";
            }
            c174757qB.A0P((C55U) c1813982r.A0M.A08.A00, AnonymousClass001.A0R(name3, str));
            C184938Ii c184938Ii = c1813982r.A04;
            if (c184938Ii != null) {
                C184528Gs c184528Gs = (C184528Gs) c184938Ii.A00.A1A.A00.A00();
                if (!c184528Gs.A09 && c184528Gs.A08) {
                    c184528Gs.A09 = true;
                    C177497uj c177497uj = c184528Gs.A06;
                    if (c177497uj != null) {
                        InterfaceC184558Gw interfaceC184558Gw = c184528Gs.A0F;
                        C14360o3.A0B(interfaceC184558Gw, 0);
                        c177497uj.A00.A0F(interfaceC184558Gw);
                    }
                }
            }
            z2 = true;
            c174757qB.EYx(true);
            c1813982r.A00();
        }
        c1813982r.A02.getClass();
        c1813982r.A02.A0O(c1813982r.A0I);
        c1813982r.A06 = z2;
        List list = c1813982r.A0N;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C8HL) it.next()).D1Z();
            }
        }
    }

    public static void A02(C1813982r c1813982r, boolean z) {
        String[] A05;
        if (!c1813982r.A0C) {
            c1813982r.A0C = true;
            c1813982r.A0B = z;
            if (Systrace.A0E(1L)) {
                AbstractC13090lv.A03("igcam_permission_request_callback", 0);
            }
            Activity activity = c1813982r.A0E;
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            UserSession userSession = c1813982r.A0L;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(activity, 1);
            if (AbstractC193398hK.A01(userSession) && (AbstractC93174Ft.A03(activity) || AbstractC93174Ft.A02(activity))) {
                A05 = new String[0];
            } else {
                A05 = AbstractC93174Ft.A05(activity);
            }
            int length = A05.length;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, length + 2);
            System.arraycopy(A05, 0, strArr2, 2, length);
            AbstractC23451Ch.A04(activity, c1813982r, strArr2);
        }
    }

    public final void A03(InterfaceC1814282u interfaceC1814282u) {
        C177447ue c177447ue = this.A01;
        if (c177447ue != null && this.A0A) {
            interfaceC1814282u.DM7(c177447ue);
        } else {
            this.A0H.A01(interfaceC1814282u);
        }
    }

    public final void A04(C8HL c8hl) {
        List list = this.A0N;
        synchronized (list) {
            if (this.A06) {
                c8hl.D1Z();
            }
            list.add(c8hl);
        }
    }

    public final void A05(final boolean z) {
        Activity activity = this.A0E;
        Context applicationContext = activity.getApplicationContext();
        C14360o3.A0B(applicationContext, 0);
        C15900qk.A01();
        if (C15900qk.A00(applicationContext, false) < 78643200) {
            String A0g = AnonymousClass001.A0g(activity.getString(2131954579), "\n\n", activity.getString(2131954580));
            C193328hC c193328hC = new C193328hC(activity);
            c193328hC.A0A(2131954581);
            c193328hC.A0r(A0g);
            c193328hC.A0I(null, 2131968948);
            C0fJ.A00(c193328hC.A02());
            return;
        }
        C171977lS c171977lS = this.A0U;
        if (c171977lS != null && c171977lS.A00 < c171977lS.A02) {
            c171977lS.A01 = this.A0T;
            return;
        }
        if (this.A0O.get() != C22P.A0Z && !this.A06 && !AbstractC184448Gi.A00(activity.getApplicationContext())) {
            if (!this.A07) {
                this.A07 = true;
                A02(this, z);
                return;
            } else {
                C0f5 AEp = C18950wb.A01.AEp(A0Z, 817892279);
                AEp.ABW(DialogModule.KEY_MESSAGE, "Not starting the camera, permissions were requested by denied since last hide");
                AEp.report();
                return;
            }
        }
        if (A0Y) {
            this.A0F.post(new Runnable() { // from class: X.7pv
                @Override // java.lang.Runnable
                public final void run() {
                    C1813982r.A01(C1813982r.this, z);
                }
            });
        } else {
            A01(this, z);
        }
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        String str;
        if (Systrace.A0E(1L)) {
            AbstractC13090lv.A04("igcam_permission_request_callback", 0);
        }
        this.A0C = false;
        Map map2 = this.A0X;
        map2.putAll(map);
        if (this.A09) {
            this.A08 = false;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            int i = 0;
            boolean z = true;
            do {
                String str2 = strArr[i];
                arrayList.add(str2);
                if (map2.get(str2) != null) {
                    str = map2.get(str2).toString();
                } else {
                    str = "Error reading permission status";
                }
                arrayList2.add(str);
                if (!EnumC172127lh.A05.equals(map2.get(str2))) {
                    z = false;
                }
                if (EnumC172127lh.A04.equals(map2.get(str2))) {
                    this.A08 = true;
                }
                i++;
            } while (i < 2);
            if (1 - this.A0W.intValue() != 0) {
                C19280xC A00 = C19280xC.A00(this, "story_camera_permissions");
                A00.A0D("permission_type", arrayList);
                A00.A0D("permission_action", arrayList2);
                AbstractC11060iN.A00(this.A0L).EHW(A00);
            }
            if (z) {
                A01(this, this.A0B);
            } else {
                C195838lR c195838lR = this.A05;
                if (c195838lR == null) {
                    ViewGroup viewGroup = this.A0F;
                    Context context = viewGroup.getContext();
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.requireViewById(R.id.camera_permissions_cover);
                    C14360o3.A0B(viewGroup2, 1);
                    c195838lR = new C195838lR(viewGroup2, R.layout.permission_empty_state_view);
                    c195838lR.A06(map);
                    Drawable drawable = context.getDrawable(R.drawable.ig_illustrations_illo_camera_microphone_permissions);
                    ImageView imageView = c195838lR.A02;
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                        imageView.setVisibility(0);
                    }
                    c195838lR.A05(context.getString(2131969541));
                    c195838lR.A04(context.getString(2131969540));
                    c195838lR.A02(2131969538);
                    c195838lR.A03(new View.OnClickListener() { // from class: X.9RH
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1813982r c1813982r = C1813982r.this;
                            if (c1813982r.A08) {
                                Activity activity = c1813982r.A0E;
                                C14360o3.A0B(activity, 0);
                                WGH.A06(activity, null);
                                return;
                            }
                            C1813982r.A02(c1813982r, c1813982r.A0B);
                        }
                    });
                    c195838lR.A01();
                    this.A05 = c195838lR;
                }
                c195838lR.A06(map);
            }
            C4IA c4ia = C4IA.A05;
            C4IB c4ib = C4IB.A0C;
            List A1Q = AbstractC16960so.A1Q(new Pair(c4ia, c4ib), new Pair(C4IA.A09, c4ib));
            UserSession userSession = this.A0L;
            C4I7 c4i7 = new C4I7(new InterfaceC11380iw() { // from class: X.9RB
                public static final String __redex_internal_original_name = "CameraInitializationController$$ExternalSyntheticLambda0";

                @Override // X.InterfaceC11380iw
                public final String getModuleName() {
                    return C1813982r.__redex_internal_original_name;
                }
            }, userSession);
            Long A002 = C4I8.A00(userSession);
            List singletonList = Collections.singletonList(C4I9.UNKNOWN);
            C14360o3.A07(singletonList);
            c4i7.A01(A002, "CAMERA_INITIALIZATION_CONTROLLER", A1Q, singletonList, map);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_composer_camera";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r9.A3m != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1813982r(android.view.ViewGroup r5, X.InterfaceC1813882q r6, X.C1813282k r7, X.C1810981l r8, X.C81J r9, X.C171977lS r10, X.AnonymousClass825 r11, X.InterfaceC08830cm r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1813982r.<init>(android.view.ViewGroup, X.82q, X.82k, X.81l, X.81J, X.7lS, X.825, X.0cm):void");
    }
}
