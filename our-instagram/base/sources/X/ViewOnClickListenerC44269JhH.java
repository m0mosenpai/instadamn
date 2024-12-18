package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.FocusIndicatorView;
import com.instagram.creation.capture.MediaCaptureFragment;
import com.instagram.creation.capture.RotateLayout;
import com.instagram.creation.capture.ShutterButton;
import com.instagram.creation.video.ui.CamcorderBlinker;
import com.instagram.creation.video.ui.ClipStackView;
import com.instagram.creation.video.ui.VideoCaptureTimerView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.JhH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC44269JhH extends LinearLayout implements InterfaceC11380iw, View.OnClickListener, View.OnTouchListener, MSF, GestureDetector.OnGestureListener, MRD, InterfaceC23471Cj, MN4 {
    public static final String __redex_internal_original_name = "InAppCaptureView";
    public int A00;
    public int A01;
    public Dialog A02;
    public com.instagram.creation.base.ui.mediatabbar.Tab A03;
    public MN7 A04;
    public InterfaceC50446MPa A05;
    public EnumC44287Jhd A06;
    public C5SW A07;
    public C195838lR A08;
    public C6WQ A09;
    public Integer A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public View A0I;
    public FrameLayout A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Rect A0N;
    public final GestureDetector A0O;
    public final View A0P;
    public final View A0Q;
    public final View A0R;
    public final View A0S;
    public final FrameLayout A0T;
    public final AbstractC184688Hj A0U;
    public final AbstractC184688Hj A0V;
    public final C55982hj A0W;
    public final C69613Av A0X;
    public final C174757qB A0Y;
    public final InterfaceC41501vz A0Z;
    public final UserSession A0a;
    public final FocusIndicatorView A0b;
    public final RotateLayout A0c;
    public final ShutterButton A0d;
    public final C44272JhO A0e;
    public final Runnable A0f;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r8 != 3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00(int r8) {
        /*
            r7 = this;
            r0 = -1
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r8 == r0) goto L30
            r1 = 0
            if (r8 == r3) goto L36
            if (r8 == r4) goto L36
            if (r8 == r5) goto L36
            r7.setFlashButtonImageLevel(r8)
            android.view.View r2 = r7.A0R
            r0 = r2
            java.lang.Integer r1 = r7.A0A
            if (r1 == 0) goto L2e
            int r1 = r1.intValue()
            if (r3 != r1) goto L2e
        L1e:
            r2.setVisibility(r6)
            if (r8 != 0) goto L3f
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131962663(0x7f132b27, float:1.9562058E38)
            X.AbstractC31172DnG.A1E(r1, r2, r0)
            return
        L2e:
            r6 = 0
            goto L1e
        L30:
            android.view.View r0 = r7.A0R
            r0.setVisibility(r6)
            goto L45
        L36:
            r7.setFlashButtonImageLevel(r8)
            android.view.View r2 = r7.A0R
            r0 = r2
            r2.setVisibility(r1)
        L3f:
            if (r8 == r3) goto L53
            if (r8 == r4) goto L4b
            if (r8 == r5) goto L53
        L45:
            java.lang.String r1 = ""
            r0.setContentDescription(r1)
            return
        L4b:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131962660(0x7f132b24, float:1.9562051E38)
            goto L5a
        L53:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131962664(0x7f132b28, float:1.956206E38)
        L5a:
            X.AbstractC31172DnG.A1E(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC44269JhH.A00(int):void");
    }

    public final void A0D() {
        UserSession userSession = this.A0a;
        MYZ A01 = MX1.A01(userSession);
        C24Q c24q = A01.A0B;
        long A03 = c24q.A03(288428278, 300000L);
        A01.A08 = A03;
        c24q.A0A(A03, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "PROFILE_HEADER_PLUS");
        Context context = getContext();
        Activity activity = (Activity) context;
        boolean A05 = AbstractC23451Ch.A05(activity, "android.permission.RECORD_AUDIO");
        boolean A052 = AbstractC23451Ch.A05(activity, "android.permission.CAMERA");
        boolean A07 = AbstractC23451Ch.A07(context, "android.permission.RECORD_AUDIO");
        boolean A072 = AbstractC23451Ch.A07(context, "android.permission.CAMERA");
        if (A07 && A072) {
            A0A();
        } else {
            MX1.A01(userSession).A0C(false, "Requesting permissions");
            AbstractC23451Ch.A04(activity, new C48292LYq(this, activity, 1, A05, A052), "android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    @Override // X.MRD
    public final void D4t() {
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        this.A0M = false;
        Context context = getContext();
        if (map.get("android.permission.CAMERA") == EnumC172127lh.A05) {
            A02(this);
        } else {
            C195838lR c195838lR = this.A08;
            if (c195838lR != null) {
                c195838lR.A06(map);
                return;
            }
            Context context2 = getRootView().getContext();
            String A0K = AbstractC53242c7.A0K(context2);
            C195838lR A0j = AbstractC43593JPy.A0j(this.A0T);
            A0j.A06(map);
            A0j.A05(AbstractC167007dF.A0f(context2, A0K, 2131954590));
            A0j.A04(AbstractC167007dF.A0f(context2, A0K, 2131954589));
            A0j.A02(2131954588);
            this.A08 = A0j;
            A0j.A03(new ViewOnClickListenerC48066LPr(20, this, context));
        }
        C4IA c4ia = C4IA.A05;
        C4IB c4ib = C4IB.A0C;
        List A1Q = AbstractC16960so.A1Q(new Pair(c4ia, c4ib), new Pair(C4IA.A09, c4ib));
        UserSession userSession = this.A0a;
        new C4I7(new LXV(this), userSession).A01(C4I8.A00(userSession), "IN_APP_CAPTURE_VIEW", A1Q, AbstractC166987dD.A1J(C4I9.UNKNOWN), map);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.7px, java.lang.Object] */
    public ViewOnClickListenerC44269JhH(Context context, C69613Av c69613Av) {
        super(context, null, 0);
        int minVideoIndicatorXPos;
        int i;
        View A0U;
        this.A01 = -1;
        this.A0D = false;
        this.A0Z = new C44288Jhe(this, 0);
        this.A0U = new C45327K4f(this, 2);
        this.A0X = c69613Av;
        c69613Av.A08(null);
        setOrientation(1);
        Context context2 = getContext();
        UserSession CE4 = ((InterfaceC189628ah) context2).CE4();
        this.A0a = CE4;
        this.A0B = "tabbed_gallery_camera";
        this.A0N = AbstractC166987dD.A0U();
        this.A0W = AbstractC167007dF.A0R();
        this.A0V = new C45327K4f(this, 4);
        this.A0f = new RunnableC44270JhI(this);
        LayoutInflater.from(AbstractC53242c7.A0I(context, R.attr.captureStyle)).inflate(R.layout.in_app_capture_view, (ViewGroup) this, true);
        ShutterButton shutterButton = (ShutterButton) requireViewById(R.id.shutter_button);
        this.A0d = shutterButton;
        shutterButton.setOnTouchListener(this);
        shutterButton.setClickable(false);
        shutterButton.setFocusable(true);
        View requireViewById = requireViewById(R.id.flip_button);
        this.A0P = requireViewById;
        requireViewById.setOnClickListener(this);
        requireViewById.setVisibility(8);
        View requireViewById2 = requireViewById(R.id.flash_button);
        this.A0R = requireViewById2;
        requireViewById2.setOnClickListener(this);
        this.A0b = (FocusIndicatorView) requireViewById(R.id.focus_indicator);
        this.A0c = (RotateLayout) requireViewById(R.id.focus_indicator_rotate_layout);
        this.A0O = new GestureDetector(context, this);
        this.A0Q = requireViewById(R.id.clip_stack_view_container);
        ClipStackView clipStackView = (ClipStackView) requireViewById(R.id.clip_stack_view);
        CamcorderBlinker camcorderBlinker = (CamcorderBlinker) requireViewById(R.id.blinker);
        View requireViewById3 = requireViewById(R.id.minimum_clip_length_image);
        this.A0S = requireViewById3;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) requireViewById3.getLayoutParams();
        if (AbstractC13620mo.A02(context2)) {
            minVideoIndicatorXPos = 0;
            i = getMinVideoIndicatorXPos();
        } else {
            minVideoIndicatorXPos = getMinVideoIndicatorXPos();
            i = 0;
        }
        marginLayoutParams.setMargins(minVideoIndicatorXPos, 0, i, 0);
        FrameLayout frameLayout = (FrameLayout) requireViewById(R.id.media_frame_layout);
        this.A0T = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = requireViewById(R.id.capture_controls).getLayoutParams();
        C18C.A0E(layoutParams instanceof LinearLayout.LayoutParams);
        C18C.A0E(layoutParams2 instanceof LinearLayout.LayoutParams);
        Integer A01 = AbstractC43841Ja4.A01(context2);
        Integer num = C05F.A0N;
        if (A01 == num) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) shutterButton.getLayoutParams();
            ((ViewGroup.LayoutParams) marginLayoutParams2).height = dimensionPixelSize;
            ((ViewGroup.LayoutParams) marginLayoutParams2).width = dimensionPixelSize;
            marginLayoutParams2.bottomMargin = resources.getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
            ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
            ((LinearLayout.LayoutParams) layoutParams2).weight = 0.0f;
            AbstractC31172DnG.A1F(resources, layoutParams2, R.dimen.canvas_colour_wheel_offset_y);
            AbstractC31174DnI.A1C(this, AbstractC53242c7.A0F(context2, R.attr.creationTertiaryBackground));
        } else if (A01 == C05F.A0C) {
            Resources resources2 = getResources();
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.container_height);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) shutterButton.getLayoutParams();
            ((ViewGroup.LayoutParams) marginLayoutParams3).height = dimensionPixelSize2;
            ((ViewGroup.LayoutParams) marginLayoutParams3).width = dimensionPixelSize2;
            marginLayoutParams3.bottomMargin = resources2.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        }
        ?? obj = new Object();
        EnumC174667q0 enumC174667q0 = EnumC174667q0.HIGH;
        C174757qB A012 = AbstractC174697q4.A01(context, new C174677q1(context2, enumC174667q0, enumC174667q0, obj, CE4), obj, CE4, "in_app_capture_view", 0);
        this.A0Y = A012;
        A012.A0O(new LVY(this, 1));
        C23435Aa8 c23435Aa8 = new C23435Aa8(this, 1);
        C175007qa c175007qa = ((BasicCameraOutputController) C174757qB.A02(A012)).A04;
        if (c175007qa != null) {
            c175007qa.A0N.EUe(c23435Aa8);
        }
        A012.A0I.A00 = new C8HT() { // from class: X.JhN
            @Override // X.C8HT
            public final void DrO() {
                ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = ViewOnClickListenerC44269JhH.this;
                C006802i.A0p.markerEnd(android.R.xml.autotext, (short) 2);
                viewOnClickListenerC44269JhH.A0X.A05();
            }
        };
        C44272JhO c44272JhO = new C44272JhO(context, CE4, new C44273JhP(this), this, this, camcorderBlinker);
        this.A0e = c44272JhO;
        ((InterfaceC189598ae) context).EDa(new RunnableC44278JhU(context, c44272JhO));
        C44274JhQ c44274JhQ = c44272JhO.A06;
        clipStackView.setClipStack(c44274JhQ.A01);
        List list = c44274JhQ.A02;
        list.add(clipStackView);
        if (A01 != C05F.A0C && A01 != num) {
            A0U = requireViewById(R.id.video_capture_timer_view);
        } else {
            A0U = AbstractC167017dG.A0U(this, R.id.video_capture_timer_view_small_stub);
        }
        VideoCaptureTimerView videoCaptureTimerView = (VideoCaptureTimerView) A0U;
        videoCaptureTimerView.setClipStackManager(c44274JhQ);
        list.add(videoCaptureTimerView);
        this.A0E = AbstractC43594JPz.A0Q(context2).AGq() == EnumC69983Ch.A05 || AbstractC43594JPz.A0Q(context2).AGq() == EnumC69983Ch.A03;
    }

    public static void A02(ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH) {
        C195838lR c195838lR = viewOnClickListenerC44269JhH.A08;
        if (c195838lR != null) {
            c195838lR.A00();
            viewOnClickListenerC44269JhH.A08 = null;
        }
        C174757qB c174757qB = viewOnClickListenerC44269JhH.A0Y;
        C174747qA c174747qA = c174757qB.A0H;
        if (c174747qA.A00().getParent() == null) {
            viewOnClickListenerC44269JhH.A0T.addView(c174747qA.A00(), 0);
        }
        c174757qB.A0P(null, "FEED_GALLERY_MAIN_BUTTON");
    }

    public static void A03(ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH) {
        DialogInterfaceOnClickListenerC48023LMs A00 = DialogInterfaceOnClickListenerC48023LMs.A00(viewOnClickListenerC44269JhH, 13);
        C193328hC A0I = AbstractC31171DnF.A0I(viewOnClickListenerC44269JhH.getContext());
        A0I.A0s(false);
        A0I.A09(2131954768);
        A0I.A0F(A00);
        DialogInterfaceOnDismissListenerC48025LMu.A00(A0I, viewOnClickListenerC44269JhH, 3);
        Dialog A02 = A0I.A02();
        viewOnClickListenerC44269JhH.A02 = A02;
        C0fJ.A00(A02);
    }

    public static void A04(ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH) {
        C174757qB c174757qB = viewOnClickListenerC44269JhH.A0Y;
        if (c174757qB.CWZ()) {
            viewOnClickListenerC44269JhH.A00(c174757qB.A08());
        }
    }

    public static void A05(ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH) {
        String[] strArr;
        com.instagram.creation.base.ui.mediatabbar.Tab tab = viewOnClickListenerC44269JhH.A03;
        if (tab != null && tab != AbstractC43884Jap.A00) {
            if (viewOnClickListenerC44269JhH.A0L) {
                Context context = viewOnClickListenerC44269JhH.getContext();
                boolean A07 = AbstractC23451Ch.A07(context, "android.permission.CAMERA");
                boolean A072 = AbstractC23451Ch.A07(context, "android.permission.RECORD_AUDIO");
                tab = viewOnClickListenerC44269JhH.A03;
                if (tab == AbstractC43884Jap.A01) {
                    if (A07) {
                        return;
                    }
                } else if (A07 && A072) {
                    return;
                }
            }
            if (!viewOnClickListenerC44269JhH.A0M) {
                viewOnClickListenerC44269JhH.A0M = true;
                viewOnClickListenerC44269JhH.A0L = true;
                Activity activity = (Activity) viewOnClickListenerC44269JhH.getContext();
                if (tab == AbstractC43884Jap.A01) {
                    strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                } else {
                    strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO"};
                }
                AbstractC23451Ch.A04(activity, viewOnClickListenerC44269JhH, strArr);
            }
        }
    }

    public static void A06(ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH, boolean z) {
        C5SW c5sw = viewOnClickListenerC44269JhH.A07;
        if (c5sw != null) {
            c5sw.A08(z);
            viewOnClickListenerC44269JhH.A07 = null;
        }
    }

    private void setCaptureMode(com.instagram.creation.base.ui.mediatabbar.Tab tab) {
        EnumC44287Jhd enumC44287Jhd;
        if (tab == AbstractC43884Jap.A00) {
            enumC44287Jhd = EnumC44287Jhd.A04;
        } else if (tab == AbstractC43884Jap.A01) {
            enumC44287Jhd = EnumC44287Jhd.A03;
        } else if (tab != AbstractC43884Jap.A02) {
            return;
        } else {
            enumC44287Jhd = EnumC44287Jhd.A02;
        }
        this.A06 = enumC44287Jhd;
    }

    private void setFlashButtonImageLevel(int i) {
        View view = this.A0R;
        if (view instanceof ImageView) {
            ((ImageView) view).setImageLevel(i);
            return;
        }
        C0f5 AEp = C18950wb.A01.AEp(__redex_internal_original_name, 817904119);
        AEp.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A0R("setImageLevel() called with a View of type ", AbstractC31173DnH.A0q(view)));
        AEp.report();
    }

    private void setProgress(float f) {
        EnumC44287Jhd enumC44287Jhd;
        if (f < 0.5f) {
            enumC44287Jhd = EnumC44287Jhd.A04;
        } else if (f < 1.5f) {
            enumC44287Jhd = EnumC44287Jhd.A03;
        } else {
            enumC44287Jhd = EnumC44287Jhd.A02;
        }
        this.A06 = enumC44287Jhd;
    }

    public final void A08() {
        C44272JhO c44272JhO = this.A0e;
        C44274JhQ c44274JhQ = c44272JhO.A06;
        C44275JhR c44275JhR = c44274JhQ.A01;
        if (c44275JhR.A01() != null && c44275JhR.A01().A05 == C05F.A01) {
            if (c44275JhR.A01() != null) {
                c44275JhR.A01().A03(C05F.A0C);
            }
            Rect A0U = AbstractC166987dD.A0U();
            this.A0I.getGlobalVisibleRect(A0U);
            Context context = getContext();
            Window window = ((Activity) context).getWindow();
            window.getClass();
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            FrameLayout frameLayout = new FrameLayout(context);
            this.A0J = frameLayout;
            AbstractC43593JPy.A1B(frameLayout, -1);
            this.A0J.setOnTouchListener(new ViewOnTouchListenerC48075LQa(1, A0U, this));
            viewGroup.addView(this.A0J);
        } else if (c44272JhO.A01()) {
            A01(this);
            c44274JhQ.A00();
            A07();
        }
        A07();
    }

    public final void A09() {
        if (this.A0K) {
            ShutterButton shutterButton = this.A0d;
            if (shutterButton.getGlobalVisibleRect(this.A0N)) {
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(this.A0a));
                A0w.E77("show_tap_to_record_nux", true);
                A0w.apply();
                A06(this, true);
                shutterButton.post(new Runnable() { // from class: X.Lzz
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = ViewOnClickListenerC44269JhH.this;
                        ShutterButton shutterButton2 = viewOnClickListenerC44269JhH.A0d;
                        if (shutterButton2.isAttachedToWindow()) {
                            Context context = viewOnClickListenerC44269JhH.getContext();
                            C5SU A0Q = AbstractC31178DnM.A0Q((Activity) context, shutterButton2, context.getString(2131976721));
                            A0Q.A02();
                            A0Q.A07(C5SV.A06);
                            C5SW A00 = A0Q.A00();
                            viewOnClickListenerC44269JhH.A07 = A00;
                            A00.A07(viewOnClickListenerC44269JhH.A0a);
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.A9K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.ABh] */
    public final void A0A() {
        boolean z;
        try {
            if (this.A0Y.A0V()) {
                return;
            }
        } catch (C6M2 unused) {
        }
        C44272JhO c44272JhO = this.A0e;
        this.A00 = c44272JhO.A06.A01.A01.size();
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(this.A0a));
        A0w.E77("show_tap_to_record_nux", true);
        A0w.apply();
        if (c44272JhO.A01 != C05F.A0N) {
            z = false;
        } else {
            SystemClock.elapsedRealtime();
            c44272JhO.A01 = C05F.A00;
            z = true;
        }
        if (!z) {
            C9GR.A08(getContext(), 2131969965, 0);
        }
        View view = this.A0Q;
        view.setAlpha(1.0f);
        view.setVisibility(0);
        C174757qB c174757qB = this.A0Y;
        ?? obj = new Object();
        C22826A4v c22826A4v = C23106AGs.A09;
        C47Z c47z = c44272JhO.A00;
        c47z.getClass();
        String str = c47z.A3w;
        str.getClass();
        String A0C = AbstractC916948n.A0C(str);
        c44272JhO.A02 = A0C;
        obj.A00(c22826A4v, A0C);
        obj.A00(C23106AGs.A0B, true);
        C23106AGs c23106AGs = new C23106AGs(obj);
        C45327K4f c45327K4f = new C45327K4f(this, 1);
        AbstractC184688Hj abstractC184688Hj = this.A0U;
        ?? obj2 = new Object();
        obj2.A00 = false;
        c174757qB.A0E(new AGu(obj2), c45327K4f, abstractC184688Hj, null, c23106AGs);
        MN7 mn7 = this.A04;
        if (mn7 != null) {
            ((MediaCaptureFragment) mn7).mMediaTabHost.A03(AbstractC43884Jap.A02, true);
        }
    }

    public final void A0B() {
        C174757qB c174757qB;
        C44272JhO c44272JhO = this.A0e;
        Integer num = c44272JhO.A01;
        Integer num2 = C05F.A01;
        if (num == num2) {
            C44274JhQ c44274JhQ = c44272JhO.A06;
            C44059Jdk c44059Jdk = c44274JhQ.A00;
            if (c44059Jdk != null) {
                c44059Jdk.A03(num2);
                c44274JhQ.A00.A02();
            }
            String str = c44272JhO.A02;
            if (AbstractC166987dD.A11(str).exists()) {
                C44059Jdk c44059Jdk2 = c44274JhQ.A00;
                c44059Jdk2.getClass();
                c44059Jdk2.A07 = str;
            }
        }
        c44272JhO.A03.removeMessages(1);
        SystemClock.elapsedRealtime();
        c44272JhO.A01 = C05F.A0C;
        try {
            c174757qB = this.A0Y;
        } catch (C6M2 unused) {
        }
        if (c174757qB.A0V()) {
            c174757qB.A0R(C05F.A00);
            this.A0I.setVisibility(0);
        }
        SystemClock.elapsedRealtime();
        c44272JhO.A01 = C05F.A0N;
        this.A0I.setVisibility(0);
    }

    public final void A0C() {
        try {
            if (this.A0Y.A0V()) {
                return;
            }
        } catch (C6M2 unused) {
        }
        Integer num = C05F.A0F;
        UserSession userSession = this.A0a;
        AbstractC31718DwN.A01(userSession, num);
        MX1.A01(userSession).A06(((C22F) AnonymousClass229.A01(userSession)).A04.A09, 1, false);
        C449124v c449124v = AnonymousClass229.A01(userSession).A0A;
        AnonymousClass249 anonymousClass249 = AnonymousClass249.PHOTO;
        int A03 = AbstractC50677MYv.A03(this.A0A);
        List list = Collections.EMPTY_LIST;
        c449124v.A0b(anonymousClass249, EnumC50631MWs.A0J, C128535rM.A00, null, null, null, null, this.A0B, list, list, list, list, list, null, A03, 1);
        this.A0Y.A0L(new C45327K4f(this, 6), new C45327K4f(this, 7));
    }

    @Override // X.MSF
    public final boolean CKp() {
        return AbstractC167007dF.A1O(this.A0e.A06.A01.A01.size());
    }

    @Override // X.MRD
    public final void D4l(C44059Jdk c44059Jdk) {
        MN7 mn7 = this.A04;
        if (mn7 != null) {
            MediaCaptureFragment.A01((MediaCaptureFragment) mn7);
        }
        A07();
    }

    @Override // X.MRD
    public final void D4m(C44059Jdk c44059Jdk, Integer num) {
        MN7 mn7 = this.A04;
        if (mn7 != null) {
            MediaCaptureFragment.A01((MediaCaptureFragment) mn7);
        }
        A07();
    }

    @Override // X.MRD
    public final void D4n(C44059Jdk c44059Jdk) {
        C44272JhO c44272JhO = this.A0e;
        if (c44059Jdk.A05 == C05F.A00 && 60000 - c44272JhO.A06.A01.A00() <= 0) {
            this.A0G = true;
            A0B();
        }
    }

    @Override // X.MRD
    public final void D4s(C44059Jdk c44059Jdk) {
        MN7 mn7 = this.A04;
        if (mn7 != null) {
            MediaCaptureFragment.A01((MediaCaptureFragment) mn7);
        }
        A07();
    }

    @Override // X.MRD
    public final void Dgq() {
        double d;
        double d2;
        MN7 mn7 = this.A04;
        if (mn7 != null) {
            MediaCaptureFragment mediaCaptureFragment = (MediaCaptureFragment) mn7;
            GestureDetectorOnGestureListenerC44266JhD gestureDetectorOnGestureListenerC44266JhD = mediaCaptureFragment.mMediaTabHost;
            MSF msf = mediaCaptureFragment.mCaptureProvider;
            msf.getClass();
            boolean z = !msf.CKp();
            if (z) {
                d2 = 0.0d;
            } else {
                d2 = 1.0d;
            }
            gestureDetectorOnGestureListenerC44266JhD.A0I.setEnabled(z);
            gestureDetectorOnGestureListenerC44266JhD.A0H.A08(d2, true);
        }
        if (CKp()) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        this.A0W.A08(d, true);
    }

    @Override // X.MQQ
    public final void Drk(com.instagram.creation.base.ui.mediatabbar.Tab tab, com.instagram.creation.base.ui.mediatabbar.Tab tab2) {
        if (this.A03 != tab2) {
            this.A03 = tab2;
            if (!this.A0H) {
                C174757qB c174757qB = this.A0Y;
                if (c174757qB.CWZ() && tab != tab2 && c174757qB.A08() != -1) {
                    setFlashMode(0);
                }
            }
        }
    }

    @Override // X.MSF
    public final void E6C() {
        try {
            if (this.A0Y.A0V()) {
                this.A0F = true;
                A0B();
                return;
            }
        } catch (C6M2 unused) {
        }
        C44272JhO c44272JhO = this.A0e;
        new KF0(c44272JhO).A02(c44272JhO.A00);
    }

    public Integer getCameraFacing() {
        return this.A0A;
    }

    public EnumC44287Jhd getCaptureMode() {
        return this.A06;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        if (this.A06.ordinal() == 1 && !this.A0E) {
            requestDisallowInterceptTouchEvent(true);
            if (!this.A0H) {
                AbstractC31718DwN.A01(this.A0a, C05F.A0G);
                this.A0H = true;
                A0D();
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        if (this.A06.ordinal() == 2) {
            requestDisallowInterceptTouchEvent(true);
            if (!this.A0H) {
                AbstractC31718DwN.A01(this.A0a, C05F.A0H);
                this.A0H = true;
                A0D();
                A06(this, true);
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int ordinal = this.A06.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return false;
            }
            A09();
            return true;
        }
        A0C();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != 3) goto L9;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            android.view.GestureDetector r0 = r5.A0O
            boolean r4 = r0.onTouchEvent(r7)
            int r2 = r7.getAction()
            r1 = 1
            if (r2 == 0) goto L4e
            if (r2 == r1) goto L35
            r0 = 2
            if (r2 == r0) goto L16
            r0 = 3
            if (r2 == r0) goto L35
        L15:
            return r4
        L16:
            com.instagram.creation.capture.ShutterButton r3 = r5.A0d
            android.graphics.Rect r2 = r5.A0N
            r3.getGlobalVisibleRect(r2)
            float r0 = r7.getRawX()
            int r1 = (int) r0
            float r0 = r7.getRawY()
            int r0 = (int) r0
            boolean r1 = r2.contains(r1, r0)
            boolean r0 = r3.isPressed()
            if (r0 == r1) goto L15
            r3.setPressed(r1)
            return r4
        L35:
            com.instagram.creation.capture.ShutterButton r0 = r5.A0d
            r1 = 0
            r0.setPressed(r1)
            boolean r0 = r5.A0H
            if (r0 == 0) goto L15
            r5.A0H = r1
            X.7qB r0 = r5.A0Y     // Catch: X.C6M2 -> L4c
            boolean r0 = r0.A0V()     // Catch: X.C6M2 -> L4c
            if (r0 == 0) goto L4c
            r5.A0B()
        L4c:
            r4 = 1
            return r4
        L4e:
            com.instagram.creation.capture.ShutterButton r0 = r5.A0d
            r0.setPressed(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC44269JhH.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setDeleteClipButton(View view, InterfaceC55932he interfaceC55932he) {
        this.A0I = view;
        view.setOnClickListener(this);
        this.A0W.A0A(interfaceC55932he);
    }

    @Override // X.MSF
    public void setFocusIndicatorOrientation(int i) {
        this.A0c.setOrientation(i);
    }

    @Override // X.MSF
    public void setInitialCameraFacing(int i) {
        this.A0Y.A00 = i;
    }

    public void setListener(MN7 mn7) {
        this.A04 = mn7;
    }

    public void setNavigationDelegate(InterfaceC50446MPa interfaceC50446MPa) {
        this.A05 = interfaceC50446MPa;
    }

    public static void A01(ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH) {
        Window window = ((Activity) viewOnClickListenerC44269JhH.getContext()).getWindow();
        window.getClass();
        ((ViewGroup) window.getDecorView()).removeView(viewOnClickListenerC44269JhH.A0J);
        viewOnClickListenerC44269JhH.A0J = null;
    }

    private AnonymousClass841 getCameraCreationSession() {
        return AbstractC43594JPz.A0Q(getContext());
    }

    private int getMinVideoIndicatorXPos() {
        return AbstractC166987dD.A0A(AbstractC13880nE.A0A(getContext()), 3000.0f / 60000.0f);
    }

    public final void A07() {
        Integer num;
        double d;
        if (CKp()) {
            View view = this.A0Q;
            view.setVisibility(0);
            view.setAlpha(1.0f);
            if (this.A0e.A01()) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            this.A0P.setEnabled(false);
        } else {
            this.A0P.setEnabled(true);
            num = C05F.A0C;
        }
        if (num == C05F.A00) {
            this.A0I.setSelected(true);
        } else if (num == C05F.A01) {
            this.A0I.setSelected(false);
        } else {
            d = 0.0d;
            this.A0W.A06(d);
        }
        d = 1.0d;
        this.A0W.A06(d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r7.A0e.A00 != null) goto L6;
     */
    @Override // X.MQQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Drj(float r8, float r9) {
        /*
            r7 = this;
            r7.setProgress(r8)
            com.instagram.creation.capture.ShutterButton r6 = r7.A0d
            X.Jhd r1 = r7.A06
            X.Jhd r0 = X.EnumC44287Jhd.A02
            r3 = 0
            r4 = 1
            if (r1 != r0) goto L14
            X.JhO r0 = r7.A0e
            X.47Z r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L15
        L14:
            r0 = 1
        L15:
            r6.setEnabled(r0)
            r5 = 0
            r1 = 4
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 > 0) goto L34
            android.view.View r0 = r7.A0Q
            r0.setVisibility(r1)
            X.7qB r0 = r7.A0Y
            X.7qA r0 = r0.A0H
            android.view.View r1 = r0.A00()
            r0 = 8
            r1.setVisibility(r0)
        L30:
            A06(r7, r4)
        L33:
            return
        L34:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 > 0) goto L48
            r6.setProgress(r5)
            android.view.View r0 = r7.A0Q
            r0.setVisibility(r1)
            X.7qB r0 = r7.A0Y
            r0.A0B()
            goto L30
        L48:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L87
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 > 0) goto L87
            float r0 = r2 - r8
            float r1 = r1 - r0
            r6.setProgress(r1)
            android.view.View r0 = r7.A0Q
            r0.setVisibility(r3)
            r0.setAlpha(r1)
            X.7qB r1 = r7.A0Y
            r1.A0B()
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L30
            boolean r0 = r1.A0V()     // Catch: X.C6M2 -> L71
            if (r0 != 0) goto L33
        L71:
            com.instagram.common.session.UserSession r0 = r7.A0a
            X.0xq r1 = X.AbstractC166987dD.A0x(r0)
            java.lang.String r0 = "show_tap_to_record_nux"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L33
            java.lang.Runnable r2 = r7.A0f
            r0 = 300(0x12c, double:1.48E-321)
            r7.postDelayed(r2, r0)
            return
        L87:
            r6.setProgress(r1)
            android.view.View r0 = r7.A0Q
            r0.setAlpha(r1)
            X.7qB r0 = r7.A0Y
            r0.A0B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC44269JhH.Drj(float, float):void");
    }

    @Override // X.MQQ
    public final void Drl(com.instagram.creation.base.ui.mediatabbar.Tab tab) {
        A05(this);
        if (tab != AbstractC43884Jap.A00 && this.A0C && this.A02 == null) {
            A03(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1388917489);
        super.onAttachedToWindow();
        this.A0K = true;
        A04(this);
        C0f9.A0D(215121558, A06);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(254795142);
        if (view == this.A0P) {
            if (!CKp()) {
                C174757qB c174757qB = this.A0Y;
                if (c174757qB.CWZ()) {
                    c174757qB.Epe(new C45327K4f(this, 3));
                }
            }
        } else if (view == this.A0R) {
            C174757qB c174757qB2 = this.A0Y;
            if (c174757qB2.CWZ()) {
                int i = -1;
                try {
                    int ordinal = this.A06.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            int A08 = c174757qB2.A08();
                            if (A08 != 0) {
                                if (A08 != 1) {
                                    if (A08 == 2) {
                                        i = 0;
                                    }
                                } else {
                                    i = 2;
                                }
                            } else {
                                i = 1;
                            }
                            A00(i);
                            setFlashMode(i);
                            if (this.A0H) {
                                this.A0D = true;
                                this.A01 = i;
                            }
                        }
                    } else {
                        int A082 = c174757qB2.A08();
                        if (A082 != 0) {
                            if (A082 != 1) {
                                if (A082 == 2) {
                                    i = 0;
                                }
                            } else {
                                i = 2;
                            }
                        } else {
                            i = 1;
                        }
                        A00(i);
                        setFlashMode(i);
                    }
                } catch (RuntimeException unused) {
                }
            }
        } else if (view == this.A0I) {
            A08();
        }
        C0f9.A0C(-1004564712, A05);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(2079200001);
        super.onDetachedFromWindow();
        this.A0K = false;
        removeCallbacks(this.A0f);
        C174757qB c174757qB = this.A0Y;
        if (c174757qB.CWZ() && 3 == c174757qB.A08()) {
            setFlashMode(0);
        }
        c174757qB.A03 = null;
        InterfaceC198408pp interfaceC198408pp = new InterfaceC198408pp() { // from class: X.LVV
            @Override // X.InterfaceC198408pp
            public final void DHd(Point point, Integer num) {
            }
        };
        C175007qa c175007qa = ((BasicCameraOutputController) C174757qB.A02(c174757qB)).A04;
        if (c175007qa != null) {
            c175007qa.A0N.EUe(interfaceC198408pp);
        }
        C0f9.A0D(-1973539014, A06);
    }

    public void setFlashMode(int i) {
        String A01 = AbstractC208929Ma.A01(i);
        if (A01 != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(this.A0a);
            A00.A1I.Egi(A00, A01, C23031Ai.A8c[25]);
        }
        this.A0Y.A0J(this.A0V, i);
    }

    private double getMinimumVideoLengthMs() {
        return 3000.0d;
    }
}
