package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.arlink.ui.NametagCardHintView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import com.instagram.user.model.User;
import java.util.Map;

/* loaded from: classes8.dex */
public final class KFD extends AbstractC60592pi implements C85F, InterfaceC23471Cj, C85G, MO7 {
    public static final C55942hf A0a = C55942hf.A01();
    public Dialog A00;
    public ViewGroup A01;
    public C47957LGt A02;
    public Lf8 A03;
    public C48213LVn A04;
    public C174757qB A05;
    public C66305U8d A06;
    public C195838lR A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public Drawable A0D;
    public InterfaceC25160BBf A0E;
    public C44413Jju A0F;
    public boolean A0G;
    public final Activity A0H;
    public final View A0J;
    public final ViewGroup A0K;
    public final ImageView A0L;
    public final ImageView A0M;
    public final C55982hj A0O;
    public final NametagController A0P;
    public final NametagCardHintView A0Q;
    public final AbstractC59962oe A0R;
    public final UserSession A0S;
    public final WXc A0T;
    public final View A0V;
    public final ViewGroup A0W;
    public final ImageView A0X;
    public final L5R A0Y;
    public final InterfaceC11380iw A0Z;
    public final Handler A0I = AbstractC167007dF.A0J();
    public final Runnable A0U = new Runnable() { // from class: X.Lzj
        @Override // java.lang.Runnable
        public final void run() {
            KFD.this.A06();
        }
    };
    public final InterfaceC184558Gw A0N = new LVW(this);

    public final void A08(boolean z) {
        this.A08 = false;
        if (z) {
            this.A0O.A03();
        }
        A04();
        C174757qB c174757qB = this.A05;
        if (c174757qB != null) {
            this.A09 = false;
            c174757qB.A0C();
            c174757qB.A0G(this.A0N);
        } else {
            this.A0I.removeCallbacks(this.A0U);
        }
        NametagCardHintView nametagCardHintView = this.A0Q;
        AnonymousClass693 anonymousClass693 = nametagCardHintView.A00;
        if (anonymousClass693 != null) {
            anonymousClass693.pause();
            nametagCardHintView.A00.EMk(0.0f);
        }
        nametagCardHintView.setVisibility(8);
        Lf8 lf8 = this.A03;
        if (lf8 != null) {
            lf8.A03 = false;
            lf8.A0L.clear();
        }
    }

    @Override // X.MO7
    public final void DJ2(float f, float f2) {
        if (f2 > 0.0f) {
            A00(this.A0D, this.A0X, (int) AbstractC70163Da.A00(f));
            A04();
        } else {
            A07();
        }
        NametagCardHintView nametagCardHintView = this.A0Q;
        float f3 = 1.0f - f;
        nametagCardHintView.setAlpha(f3);
        int i = 0;
        if (f3 <= 0.0f) {
            i = 8;
        }
        nametagCardHintView.setVisibility(i);
        NametagController nametagController = this.A0P;
        nametagController.mTopBar.setAlpha(f3);
        int i2 = 0;
        nametagController.mTopBar.setVisibility(JQ0.A02((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1))));
        nametagController.mBottomBar.setAlpha(f3);
        View view = nametagController.mBottomBar;
        if (f3 <= 0.0f) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        String str;
        this.A0G = false;
        Object obj = map.get("android.permission.CAMERA");
        this.A0A = obj == EnumC172127lh.A04;
        EnumC172127lh enumC172127lh = EnumC172127lh.A05;
        if (obj == enumC172127lh) {
            ViewGroup viewGroup = this.A0K;
            if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
                A06();
            } else {
                this.A0I.post(this.A0U);
            }
        } else {
            if (this.A07 == null) {
                ViewGroup viewGroup2 = this.A0K;
                C195838lR A0j = AbstractC43593JPy.A0j(viewGroup2);
                A0j.A06(map);
                Activity activity = this.A0H;
                A0j.A05(activity.getString(2131968160));
                A0j.A04(activity.getString(2131971206));
                A0j.A02(2131968159);
                Context context = viewGroup2.getContext();
                int A02 = AbstractC53242c7.A02(context);
                int A0H = AbstractC53242c7.A0H(context, R.attr.textColorPrimary);
                Context context2 = A0j.A00;
                int color = context2.getColor(A02);
                int color2 = context2.getColor(A0H);
                int color3 = context2.getColor(R.color.badge_color);
                A0j.A01.setBackgroundColor(color);
                TextView textView = A0j.A05;
                if (textView != null) {
                    textView.setTextColor(color2);
                }
                TextView textView2 = A0j.A04;
                if (textView2 != null) {
                    textView2.setTextColor(color2);
                }
                TextView textView3 = A0j.A03;
                if (textView3 != null) {
                    textView3.setTextColor(color3);
                }
                A0j.A01();
                this.A07 = A0j;
                A0j.A03(LQ0.A01(this, 53));
            }
            this.A07.A06(map);
        }
        Object obj2 = map.get("android.permission.CAMERA");
        if (obj2 != null) {
            if (obj2.equals(enumC172127lh)) {
                str = "app_permission_grant";
            } else {
                str = "app_permission_deny";
            }
            UserSession userSession = this.A0S;
            AbstractC43594JPz.A1N(new C4I7(new LXT(this), userSession), C4I8.A00(userSession), str, "SCAN_CAMERA_CONTROLLER", AbstractC166987dD.A1J(C4I9.UNKNOWN));
        }
    }

    @Override // X.C85F
    public final void Dxn(User user, boolean z) {
        this.A0C = 0;
        if (A03(this) != z) {
            A04();
            C44413Jju c44413Jju = this.A0F;
            if (c44413Jju != null) {
                synchronized (c44413Jju.A0E) {
                    c44413Jju.A01 = 0;
                    c44413Jju.A0F.clear();
                    c44413Jju.A02 = 0;
                    c44413Jju.A08 = null;
                }
                c44413Jju.postInvalidate();
            }
            NametagController nametagController = this.A0P;
            if (nametagController.A0B.isResumed()) {
                nametagController.A00 = user;
                NametagController.A03(nametagController, C05F.A0Y);
            }
        }
        if (!z) {
            A01(this);
        }
    }

    public static void A00(Drawable drawable, ImageView imageView, int i) {
        if (drawable != null) {
            boolean z = true;
            if (drawable instanceof C66305U8d) {
                C66305U8d c66305U8d = (C66305U8d) drawable;
                c66305U8d.A09 = true;
                C66305U8d.A05(c66305U8d);
                c66305U8d.A0A = AbstractC167007dF.A1Q(i, 255);
            }
            drawable.setVisible(AbstractC167007dF.A1O(i), false);
            int i2 = 4;
            if (i > 0) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
            if (i < 255) {
                z = false;
            }
            imageView.setEnabled(z);
            imageView.setImageDrawable(drawable);
            imageView.setImageAlpha(i);
        }
    }

    public static void A01(final KFD kfd) {
        kfd.A0I.post(new Runnable() { // from class: X.Lzk
            @Override // java.lang.Runnable
            public final void run() {
                KFD kfd2 = KFD.this;
                AbstractC10360h2 abstractC10360h2 = kfd2.A0R.mFragmentManager;
                if (kfd2.A0B && abstractC10360h2 != null) {
                    AbstractC63248Sg4.A01(abstractC10360h2);
                }
                kfd2.A0B = false;
            }
        });
    }

    public static void A02(KFD kfd) {
        C48213LVn c48213LVn = kfd.A04;
        if (c48213LVn != null) {
            UserSession userSession = kfd.A0S;
            C19280xC A04 = C1QE.A01("instagram_nametag").A04("ig_nametag_gallery_closed");
            if (userSession != null) {
                AbstractC31173DnH.A1S(A04, userSession);
                c48213LVn.A04.A04();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static boolean A03(KFD kfd) {
        C48213LVn c48213LVn = kfd.A04;
        if (c48213LVn != null && c48213LVn.A00 > 0.0f) {
            return true;
        }
        return false;
    }

    public final void A04() {
        InterfaceC25160BBf interfaceC25160BBf;
        C174757qB c174757qB = this.A05;
        if (c174757qB != null && c174757qB.CWZ() && (interfaceC25160BBf = this.A0E) != null) {
            c174757qB.EFz(interfaceC25160BBf);
            this.A0E = null;
        }
        C44413Jju c44413Jju = this.A0F;
        if (c44413Jju != null) {
            this.A0K.removeView(c44413Jju);
        }
        this.A0F = null;
    }

    public final void A05() {
        if (!this.A0G) {
            this.A0G = true;
            AbstractC43592JPx.A1C(this.A0H, this, "android.permission.CAMERA");
        }
    }

    public final void A06() {
        C195838lR c195838lR = this.A07;
        if (c195838lR != null) {
            c195838lR.A00();
            this.A07 = null;
        }
        UserSession userSession = this.A0S;
        L77 A00 = AbstractC46618Kjv.A00(userSession);
        AbstractC43592JPx.A1V("open_camera", A00.A00.now(), A00.A01);
        if (this.A05 == null) {
            this.A0O.A02();
            ViewGroup viewGroup = this.A0K;
            ViewStub A0G = AbstractC31173DnH.A0G(viewGroup, R.id.camera_stub);
            Activity activity = this.A0H;
            C174627pw c174627pw = new C174627pw(userSession, activity.getApplicationContext());
            DisplayMetrics A0K = AbstractC167007dF.A0K(activity);
            RectF rectF = AbstractC13880nE.A01;
            C14360o3.A0B(A0K, 0);
            c174627pw.A00 = Integer.MAX_VALUE;
            C174757qB A02 = AbstractC174697q4.A02(A0G, null, c174627pw, null, userSession, "scan_camera", 0, false);
            this.A05 = A02;
            A02.EYx(true);
            A02.A00 = 0;
            A02.A0O(new LVY(this, 0));
            ColorDrawable colorDrawable = new ColorDrawable(AbstractC166997dE.A03(viewGroup.getContext()));
            this.A0D = colorDrawable;
            colorDrawable.setVisible(false, false);
            ViewGroup A0F = AbstractC31173DnH.A0F(viewGroup, R.id.nametag_outer_container);
            AbstractC31173DnH.A0G(A0F, R.id.gallery_grid_stub).inflate();
            AbstractC31173DnH.A0G(A0F, R.id.gallery_folder_menu_stub).inflate();
            this.A01 = AbstractC31173DnH.A0F(A0F, R.id.gallery_container_coordinator);
            C08790ch A002 = AbstractC018607g.A00(this.A0R);
            Lf8 lf8 = new Lf8(activity, this.A01, this.A0M, A002, this, this.A0Z, userSession, (TriangleSpinner) viewGroup.requireViewById(R.id.gallery_folder_menu));
            this.A03 = lf8;
            lf8.A03 = true;
            lf8.A0M.A07();
            L5R l5r = this.A0Y;
            Lf8 lf82 = this.A03;
            l5r.A05 = lf82;
            int i = 0;
            AbstractC43594JPz.A1Q(new InterfaceC1829689r[]{lf82}[0], l5r.A0G);
            C48213LVn c48213LVn = new C48213LVn(A0F, this.A0W, this.A03);
            this.A04 = c48213LVn;
            MO7[] mo7Arr = {this, this.A03};
            do {
                MO7 mo7 = mo7Arr[i];
                C14360o3.A0B(mo7, 0);
                AbstractC43594JPz.A1Q(mo7, c48213LVn.A06);
                i++;
            } while (i < 2);
        }
        C48213LVn c48213LVn2 = this.A04;
        if (c48213LVn2 != null) {
            c48213LVn2.A04.A0A(c48213LVn2);
        }
        Lf8 lf83 = this.A03;
        if (lf83 != null) {
            C189058Yv c189058Yv = lf83.A0M;
            if (c189058Yv.A04) {
                Object A0m = AbstractC166997dE.A0m(c189058Yv.A0A, -1);
                if (A0m != null) {
                    if (!AbstractC31171DnF.A1b(((Folder) A0m).A05)) {
                        lf83.A0M.A07();
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        NametagController.A03(this.A0P, C05F.A01);
        if (!this.A09) {
            onResume();
        } else {
            C175007qa c175007qa = ((BasicCameraOutputController) C174757qB.A02(this.A05)).A04;
            if (c175007qa != null) {
                c175007qa.A0N.EKm(null);
            }
        }
        this.A05.A0H.A00().setEnabled(true);
        C174757qB c174757qB = this.A05;
        c174757qB.A0H.A00().post(new Runnable() { // from class: X.Lzi
            @Override // java.lang.Runnable
            public final void run() {
                C174757qB c174757qB2 = KFD.this.A05;
                c174757qB2.getClass();
                c174757qB2.A0H.A00().requestLayout();
            }
        });
    }

    public final void A07() {
        C174757qB c174757qB = this.A05;
        if (c174757qB != null && c174757qB.CWZ() && this.A0E == null) {
            Rect A0A = c174757qB.A0A();
            C47957LGt c47957LGt = this.A02;
            if (c47957LGt != null) {
                int width = A0A.width();
                int height = A0A.height();
                c47957LGt.A01 = width;
                c47957LGt.A00 = height;
                this.A0C = 0;
            }
            C209759Pl c209759Pl = new C209759Pl(this, 2);
            this.A0E = c209759Pl;
            c174757qB.A9h(c209759Pl, 1);
            C17280tP A00 = C17280tP.A00();
            if (AbstractC167017dG.A1b(A00, A00.A2q, C17280tP.A4G, 113)) {
                C44413Jju c44413Jju = new C44413Jju(this.A0H);
                this.A0F = c44413Jju;
                int width2 = A0A.width();
                int height2 = A0A.height();
                c44413Jju.A04 = width2;
                c44413Jju.A03 = height2;
                this.A0K.addView(this.A0F, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    @Override // X.C85G
    public final void Dh6(boolean z) {
        NametagController.A03(this.A0P, C05F.A01);
    }

    @Override // X.C85G
    public final void Dh7(float f) {
        Drawable drawable;
        ImageView imageView;
        float f2 = 1.0f - f;
        View view = this.A0V;
        view.setAlpha(f2);
        int i = 0;
        view.setVisibility(JQ0.A02((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1))));
        if (this.A05 != null) {
            ImageView imageView2 = this.A0M;
            imageView2.setAlpha(f2);
            imageView2.setVisibility(JQ0.A02((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1))));
            NametagCardHintView nametagCardHintView = this.A0Q;
            nametagCardHintView.setAlpha(f2);
            if (f2 <= 0.0f) {
                i = 8;
            }
            nametagCardHintView.setVisibility(i);
        }
        int A00 = (int) AbstractC70163Da.A00(f);
        if (!A03(this)) {
            drawable = this.A0D;
            imageView = this.A0X;
        } else {
            drawable = this.A06;
            imageView = this.A0L;
        }
        A00(drawable, imageView, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.1vN, X.Fvw] */
    @Override // X.C85G
    public final void Dlz(String str, int i, String str2) {
        NametagController nametagController = this.A0P;
        nametagController.A05();
        C25671My A00 = AbstractC25651Mw.A00(nametagController.A0D);
        ?? obj = new Object();
        obj.A01 = str2;
        obj.A02 = str;
        obj.A00 = i;
        A00.E4s(obj);
    }

    @Override // X.C85F
    public final void Dxw(String str, boolean z) {
        if (z) {
            int i = this.A0C + 1;
            this.A0C = i;
            if (i >= 10) {
                C19280xC A04 = C1QE.A01("instagram_nametag").A04("ig_nametag_camera_scan_failed");
                A04.A08(Integer.valueOf(this.A0C), AbstractC58317Pt9.A00(276));
                AbstractC31173DnH.A1S(A04, this.A0S);
                C9GR.A07(this.A0H, 2131968158);
                this.A0C = 0;
            }
            C44413Jju c44413Jju = this.A0F;
            if (c44413Jju != null) {
                c44413Jju.setMessage(str);
            }
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A0O.A00();
        C47957LGt c47957LGt = this.A02;
        if (c47957LGt != null) {
            c47957LGt.A01();
        }
        this.A02 = null;
        WXc wXc = this.A0T;
        AbstractC25651Mw.A00(wXc.A0G).A02(wXc.A0F, C70073Cr.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C174757qB c174757qB = this.A05;
        if (this.A08 && c174757qB != null) {
            if (this.A09) {
                this.A0O.A04();
            } else {
                this.A09 = true;
            }
            c174757qB.A0P(null, "");
            c174757qB.A0F(this.A0N);
        }
    }

    public KFD(Activity activity, ViewGroup viewGroup, NametagController nametagController, L5R l5r, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A0H = activity;
        this.A0R = abstractC59962oe;
        this.A0K = viewGroup;
        this.A0V = viewGroup.requireViewById(R.id.close_button);
        this.A0W = AbstractC31173DnH.A0F(viewGroup, R.id.camera_container);
        this.A0J = viewGroup.requireViewById(R.id.gradient_overlay);
        ImageView A0I = AbstractC31173DnH.A0I(viewGroup, R.id.camera_preview_overlay);
        this.A0X = A0I;
        LQ0.A02(A0I, 52, this);
        this.A0L = AbstractC31173DnH.A0I(viewGroup, R.id.gallery_blur_overlay);
        ImageView A0I2 = AbstractC31173DnH.A0I(viewGroup, R.id.gallery_button);
        this.A0M = A0I2;
        A0I2.setColorFilter(C3DY.A00(-1));
        this.A0Q = (NametagCardHintView) viewGroup.requireViewById(R.id.card_hint_view);
        this.A0Y = l5r;
        WXc wXc = new WXc(abstractC59962oe.requireActivity(), viewGroup, new C68710Vam(userSession, abstractC59962oe.getModuleName()), interfaceC11380iw, userSession, this);
        this.A0T = wXc;
        AbstractC25651Mw.A00(wXc.A0G).A01(wXc.A0F, C70073Cr.class);
        this.A0S = userSession;
        this.A0P = nametagController;
        this.A0Z = interfaceC11380iw;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(A0a);
        A0R.A06 = true;
        A0R.A0A(new C45336K4p(this));
        this.A0O = A0R;
    }

    @Override // X.C85F
    public final void D1R(String str) {
        A01(this);
        AbstractC35047FcK.A01(this.A0P.A0B.requireActivity(), null, str, null, null);
    }

    @Override // X.C85F
    public final void DFD(String str) {
        A01(this);
        this.A0P.A0E.A00(str, true, "dogfooding_assistant".equals(AbstractC08820cl.A03(str).getHost()));
    }

    @Override // X.C85F
    public final void DLZ() {
        A01(this);
        C9GR.A0F(this.A0P.A06, "SCAN_QR_CODE_error", 2131971209);
    }

    @Override // X.C85F
    public final void DMy(String str) {
        A01(this);
        this.A0P.A0E.A00(str, false, "dogfooding_assistant".equals(AbstractC08820cl.A03(str).getHost()));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        A04();
        C174757qB c174757qB = this.A05;
        if (c174757qB != null) {
            this.A09 = false;
            c174757qB.A0C();
            c174757qB.A0G(this.A0N);
        } else {
            this.A0I.removeCallbacks(this.A0U);
        }
        Lf8 lf8 = this.A03;
        if (lf8 != null) {
            lf8.onPause();
        }
    }
}
