package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.arlink.ui.CameraMaskOverlay;
import com.instagram.arlink.ui.GridPatternView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LO8 implements TextureView.SurfaceTextureListener, InterfaceC55932he, InterfaceC23471Cj {
    public static final C55942hf A0M = C55942hf.A01();
    public int A00;
    public TextureView A01;
    public View A02;
    public ViewGroup A03;
    public ImageView A04;
    public CameraMaskOverlay A05;
    public C66305U8d A06;
    public C5SW A07;
    public C195838lR A08;
    public ShutterButton A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Activity A0D;
    public final View A0E;
    public final ViewStub A0F;
    public final KFE A0G;
    public final InterfaceC174767qC A0H;
    public final UserSession A0I;
    public final View A0J;
    public final C55982hj A0K;
    public final GridPatternView A0L;

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        String str;
        this.A0C = false;
        Object obj = map.get("android.permission.CAMERA");
        this.A0A = obj == EnumC172127lh.A04;
        EnumC172127lh enumC172127lh = EnumC172127lh.A05;
        if (obj == enumC172127lh) {
            UserSession userSession = this.A0I;
            L77 A00 = AbstractC46618Kjv.A00(userSession);
            AbstractC43592JPx.A1V("open_camera", A00.A00.now(), A00.A01);
            boolean isAvailable = this.A01.isAvailable();
            TextureView textureView = this.A01;
            if (isAvailable) {
                A00(textureView.getSurfaceTexture(), this.A01.getWidth(), this.A01.getHeight());
            } else {
                textureView.setSurfaceTextureListener(this);
            }
            this.A09.setEnabled(true);
            this.A05.setEnabled(true);
            View view = this.A0E;
            view.setEnabled(true);
            view.setVisibility(0);
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            if (!AbstractC167017dG.A1b(A002, A002.A45, C23031Ai.A8c, 104)) {
                ViewGroup viewGroup = this.A03;
                viewGroup.getClass();
                viewGroup.post(new Runnable() { // from class: X.Lzm
                    @Override // java.lang.Runnable
                    public final void run() {
                        LO8 lo8 = LO8.this;
                        ViewGroup viewGroup2 = lo8.A03;
                        viewGroup2.getClass();
                        Context context = viewGroup2.getContext();
                        context.getClass();
                        C5SU c5su = new C5SU(context, lo8.A03, new C149686oL(context.getString(2131968163)));
                        c5su.A03(lo8.A09);
                        c5su.A02();
                        c5su.A07(C5SV.A06);
                        c5su.A0B = true;
                        c5su.A0A = true;
                        C5SW A003 = KYR.A00(c5su, lo8, 0);
                        lo8.A07 = A003;
                        A003.A07(lo8.A0I);
                    }
                });
            }
            C195838lR c195838lR = this.A08;
            if (c195838lR != null) {
                c195838lR.A00();
                this.A08 = null;
            }
        } else {
            if (this.A08 == null) {
                ViewGroup viewGroup2 = this.A03;
                viewGroup2.getClass();
                Context context = viewGroup2.getContext();
                C195838lR A0j = AbstractC43593JPy.A0j(this.A03);
                A0j.A06(map);
                A0j.A05(context.getString(2131968160));
                A0j.A04(context.getString(2131968164));
                A0j.A02(2131968159);
                A0j.A01();
                this.A08 = A0j;
                A0j.A03(LQ0.A01(this, 55));
                this.A0E.setVisibility(8);
            }
            this.A08.A06(map);
        }
        Object obj2 = map.get("android.permission.CAMERA");
        if (obj2 != null) {
            if (obj2.equals(enumC172127lh)) {
                str = "app_permission_grant";
            } else {
                str = "app_permission_deny";
            }
            UserSession userSession2 = this.A0I;
            AbstractC43594JPz.A1N(new C4I7(new LXU(this), userSession2), C4I8.A00(userSession2), str, "SELFIE_CAMERA_CONTROLLER", AbstractC166987dD.A1J(C4I9.UNKNOWN));
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.7px, java.lang.Object] */
    private void A00(SurfaceTexture surfaceTexture, int i, int i2) {
        InterfaceC174767qC interfaceC174767qC = this.A0H;
        Map map = C174647py.A01;
        EnumC174667q0 enumC174667q0 = EnumC174667q0.LOW;
        interfaceC174767qC.Ecy(new C212559bO(enumC174667q0, enumC174667q0, new Object()));
        interfaceC174767qC.setInitialCameraFacing(1);
        interfaceC174767qC.EbS(surfaceTexture, i, i2);
        interfaceC174767qC.AJS(new C45327K4f(this, 0), null, null);
    }

    public static void A01(LO8 lo8) {
        if (lo8.A03 != null) {
            C69422Vn7 c69422Vn7 = new C69422Vn7(lo8.A05, "SelfieCameraController", lo8.A0L);
            c69422Vn7.A02 = 10;
            c69422Vn7.A00 = 10;
            c69422Vn7.A03 = lo8.A03.getContext().getColor(R.color.blur_mask_tint_color);
            C66305U8d c66305U8d = new C66305U8d(c69422Vn7);
            lo8.A06 = c66305U8d;
            c66305U8d.setVisible(true, false);
            lo8.A05.setImageDrawable(lo8.A06);
        }
    }

    public static void A02(LO8 lo8) {
        if (!lo8.A0C) {
            lo8.A0C = true;
            lo8.A0E.setEnabled(false);
            lo8.A09.setEnabled(false);
            AbstractC43592JPx.A1C(lo8.A0D, lo8, "android.permission.CAMERA");
        }
    }

    public static void A03(LO8 lo8) {
        EnumC46219Kcv enumC46219Kcv = (EnumC46219Kcv) EnumC46219Kcv.A04.get(lo8.A00);
        enumC46219Kcv.getClass();
        ViewGroup viewGroup = lo8.A03;
        viewGroup.getClass();
        Drawable drawable = viewGroup.getContext().getDrawable(enumC46219Kcv.A02);
        drawable.getClass();
        int A08 = (int) (AbstractC166987dD.A08(lo8.A01) * enumC46219Kcv.A00);
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() * A08) / drawable.getIntrinsicHeight());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) lo8.A04.getLayoutParams();
        ((ViewGroup.LayoutParams) marginLayoutParams).width = intrinsicWidth;
        ((ViewGroup.LayoutParams) marginLayoutParams).height = A08;
        marginLayoutParams.leftMargin = (lo8.A03.getWidth() - intrinsicWidth) / 2;
        marginLayoutParams.topMargin = lo8.A01.getTop() + ((int) (AbstractC166987dD.A08(lo8.A01) * enumC46219Kcv.A01));
        lo8.A04.setLayoutParams(marginLayoutParams);
        lo8.A04.setImageDrawable(drawable);
    }

    public final void A04(int i, boolean z, boolean z2) {
        if (this.A03 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A0F.inflate();
            this.A03 = viewGroup;
            this.A01 = (TextureView) viewGroup.requireViewById(R.id.selfie_camera_view);
            CameraMaskOverlay cameraMaskOverlay = (CameraMaskOverlay) this.A03.requireViewById(R.id.camera_mask_overlay);
            this.A05 = cameraMaskOverlay;
            cameraMaskOverlay.A00 = this.A01;
            LQ0.A02(cameraMaskOverlay, 56, this);
            A01(this);
            this.A05.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: X.LQM
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i2) {
                    LO8 lo8 = LO8.this;
                    if ((i2 & 2) != 0) {
                        LO8.A01(lo8);
                    }
                }
            });
            View requireViewById = this.A03.requireViewById(R.id.cancel_button);
            this.A02 = requireViewById;
            C3P9 A0s = AbstractC166987dD.A0s(requireViewById);
            A0s.A04 = new KKp(this, 4);
            Integer num = C05F.A01;
            A0s.A05 = num;
            A0s.A00();
            this.A04 = AbstractC31173DnH.A0I(this.A03, R.id.selfie_sticker_view);
            ShutterButton shutterButton = (ShutterButton) this.A03.requireViewById(R.id.selfie_camera_shutter_button);
            this.A09 = shutterButton;
            shutterButton.setVideoRecordingEnabled(false);
            shutterButton.setButtonActionsEnabled(false);
            KKp.A01(AbstractC166987dD.A0s(shutterButton), this, 5);
            AbstractC56952jT.A04(this.A09, num);
        }
        this.A00 = i;
        this.A0B = z2;
        C55982hj c55982hj = this.A0K;
        if (z) {
            c55982hj.A06(1.0d);
        } else {
            c55982hj.A08(1.0d, true);
        }
        this.A01.post(new Runnable() { // from class: X.Lzl
            @Override // java.lang.Runnable
            public final void run() {
                LO8.A03(LO8.this);
            }
        });
        A02(this);
    }

    public final void A05(boolean z) {
        ViewGroup viewGroup = this.A03;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            InterfaceC174767qC interfaceC174767qC = this.A0H;
            if (interfaceC174767qC.CWZ()) {
                interfaceC174767qC.disconnect();
            }
            C5SW c5sw = this.A07;
            if (c5sw != null) {
                c5sw.A08(true);
                this.A07 = null;
            }
            C55982hj c55982hj = this.A0K;
            if (z) {
                c55982hj.A06(0.0d);
            } else {
                c55982hj.A08(0.0d, true);
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        if (c55982hj.A01 == 0.0d) {
            this.A01.setVisibility(8);
            this.A09.setVisibility(8);
        }
        this.A0J.setLayerType(2, null);
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        if (c55982hj.A01 == 1.0d) {
            this.A01.setVisibility(0);
            this.A09.setVisibility(0);
            GridPatternView gridPatternView = this.A0L;
            EnumC46219Kcv enumC46219Kcv = (EnumC46219Kcv) EnumC46219Kcv.A04.get(this.A00);
            enumC46219Kcv.getClass();
            gridPatternView.setSticker(enumC46219Kcv.A02);
            C66305U8d c66305U8d = this.A06;
            c66305U8d.getClass();
            c66305U8d.A09 = true;
            C66305U8d.A05(c66305U8d);
        }
        this.A0J.setLayerType(0, null);
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C55992hk c55992hk = c55982hj.A09;
        float A00 = JQ0.A00(c55992hk.A00);
        boolean z = this.A0B;
        int i = 8;
        int i2 = 0;
        View view = this.A02;
        if (z) {
            view.setAlpha(A00);
            this.A02.setVisibility(JQ0.A02((A00 > 0.0f ? 1 : (A00 == 0.0f ? 0 : -1))));
        } else {
            view.setVisibility(8);
        }
        this.A09.setAlpha(A00);
        this.A09.setVisibility(JQ0.A02((A00 > 0.0f ? 1 : (A00 == 0.0f ? 0 : -1))));
        View view2 = this.A0J;
        float f = 1.0f - A00;
        view2.setAlpha(f);
        if (f > 0.0f) {
            i = 0;
        }
        view2.setVisibility(i);
        int A002 = (int) AbstractC70163Da.A00(c55992hk.A00);
        CameraMaskOverlay cameraMaskOverlay = this.A05;
        int i3 = 4;
        int i4 = 4;
        if (A002 > 0) {
            i4 = 0;
        }
        cameraMaskOverlay.setVisibility(i4);
        this.A05.setImageAlpha(A002);
        ImageView imageView = this.A04;
        int i5 = 4;
        if (A002 > 0) {
            i5 = 0;
        }
        imageView.setVisibility(i5);
        this.A04.setImageAlpha(A002);
        ViewGroup viewGroup = this.A03;
        viewGroup.getClass();
        if (A002 > 0) {
            i3 = 0;
        }
        viewGroup.setVisibility(i3);
        ViewGroup viewGroup2 = this.A03;
        if (A002 >= 255) {
            i2 = -16777216;
        }
        viewGroup2.setBackgroundColor(i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        InterfaceC174767qC interfaceC174767qC = this.A0H;
        if (interfaceC174767qC.EjF()) {
            interfaceC174767qC.EbS(null, 0, 0);
            return true;
        }
        return true;
    }

    public LO8(Activity activity, View view, KFE kfe, UserSession userSession) {
        this.A0D = activity;
        this.A0F = AbstractC31173DnH.A0G(view, R.id.selfie_camera_stub);
        this.A0E = view.requireViewById(R.id.background_mode_button);
        this.A0L = (GridPatternView) view.requireViewById(R.id.grid_pattern_view);
        this.A0J = view.requireViewById(R.id.camera_container);
        this.A0I = userSession;
        this.A0H = AbstractC174697q4.A01(activity, null, null, userSession, "nametag_selfie_camera", 2);
        this.A0G = kfe;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(A0M);
        A0R.A06 = true;
        A0R.A0A(this);
        this.A0K = A0R;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        A00(surfaceTexture, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        A00(surfaceTexture, i, i2);
    }
}
