package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLUtils;
import android.os.Handler;
import android.view.Surface;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.blur.BlurUtil;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Ocx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55142Ocx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bitmap A04;
    public Bitmap A05;
    public Surface A06;
    public Surface A07;
    public C69722VuH A08;
    public ImageUrl A09;
    public YQR A0A;
    public InterfaceC58006Pnq A0B;
    public boolean A0D;
    public boolean A0E;
    public int A0F;
    public final Bitmap A0G;
    public final InterfaceC197758om A0H;
    public final C176537tB A0I;
    public final UserSession A0J;
    public final Context A0K;
    public C69700Vtv A0C = new C69700Vtv();
    public final Handler A0L = AbstractC167007dF.A0J();

    private final float A00() {
        if (this.A03 <= this.A01 * 0.6f) {
            return 0.35349f;
        }
        if (this.A02 > this.A00 * 0.6f) {
            return 0.19225f;
        }
        return 0.17447f;
    }

    public static final void A02(C55142Ocx c55142Ocx) {
        Bitmap bitmap = c55142Ocx.A05;
        if (bitmap != null) {
            Surface surface = c55142Ocx.A06;
            if (surface != null) {
                try {
                    synchronized (surface) {
                        float A00 = c55142Ocx.A00();
                        float f = c55142Ocx.A03;
                        float f2 = A00 * f;
                        Bitmap A01 = A01(bitmap, f, c55142Ocx.A02, f2, f2, AbstractC166987dD.A0A(f, 0.074074075f));
                        C69700Vtv c69700Vtv = c55142Ocx.A0C;
                        c69700Vtv.A01(surface);
                        C69722VuH c69722VuH = new C69722VuH(A01.getWidth(), A01.getHeight());
                        GLUtils.texImage2D(3553, 0, A01, 0);
                        c69722VuH.A01();
                        c55142Ocx.A08 = c69722VuH;
                        AbstractC180237zD.A02("IgLiveImageStreamingController rendered image to preview surface", new Object[0]);
                        EGL14.eglSwapBuffers(c69700Vtv.A00, c69700Vtv.A01);
                        c69700Vtv.A00();
                        c55142Ocx.A06 = null;
                    }
                } catch (Exception e) {
                    C0w9.A03("IgLiveImageStreamingController", AbstractC166997dE.A0y("Exception while trying to render frame to preview surface. Error: ", e));
                }
            }
            YQR yqr = c55142Ocx.A0A;
            if (yqr != null) {
                try {
                    synchronized (yqr) {
                        float A002 = c55142Ocx.A00();
                        float C4S = yqr.C4S();
                        float f3 = A002 * C4S;
                        Bitmap bitmap2 = c55142Ocx.A04;
                        if (bitmap2 == null) {
                            bitmap2 = A01(bitmap, C4S, yqr.C4O(), f3, f3, AbstractC166987dD.A0A(C4S, 0.074074075f));
                            c55142Ocx.A04 = bitmap2;
                        }
                        C69700Vtv c69700Vtv2 = c55142Ocx.A0C;
                        Surface surface2 = yqr.getSurface();
                        if (surface2 != null) {
                            c69700Vtv2.A01(surface2);
                            C69722VuH c69722VuH2 = new C69722VuH(bitmap2.getWidth(), bitmap2.getHeight());
                            GLUtils.texImage2D(3553, 0, bitmap2, 0);
                            c69722VuH2.A01();
                            c55142Ocx.A08 = c69722VuH2;
                            AbstractC180237zD.A02("IgLiveImageStreamingController rendered image to output surface", new Object[0]);
                            long A003 = c55142Ocx.A0I.A00(c55142Ocx.A0H.ANc());
                            yqr.Ecc(A003 / 1000000);
                            EGLExt.eglPresentationTimeANDROID(c69700Vtv2.A00, c69700Vtv2.A01, A003);
                            AbstractC180237zD.A02("IgLiveImageStreamingController set presentation time on frame to output surface", new Object[0]);
                            EGL14.eglSwapBuffers(c69700Vtv2.A00, c69700Vtv2.A01);
                            c69700Vtv2.A00();
                            InterfaceC58006Pnq interfaceC58006Pnq = c55142Ocx.A0B;
                            if (interfaceC58006Pnq != null) {
                                interfaceC58006Pnq.CsP(yqr);
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                } catch (Exception e2) {
                    C0w9.A03("IgLiveImageStreamingController", AbstractC166997dE.A0y("Exception while trying to render frame to output surface. Error: ", e2));
                }
            }
        }
        c55142Ocx.A0L.postDelayed(new RunnableC56948POp(c55142Ocx), 33L);
    }

    public final void A03() {
        int i = this.A0F;
        this.A0F = i + 1;
        if (i < 3) {
            this.A0L.postDelayed(new RunnableC56946POn(this), 300L);
            Surface surface = this.A06;
            if (surface != null) {
                this.A07 = surface;
            }
        }
    }

    public final void A04() {
        this.A0L.removeCallbacksAndMessages(null);
        this.A0C.A00();
        this.A0E = false;
        C69722VuH c69722VuH = this.A08;
        if (c69722VuH != null) {
            c69722VuH.A00();
        }
        this.A08 = null;
        this.A04 = null;
        if (C14360o3.A0K(this.A05, this.A0G)) {
            this.A05 = null;
        }
    }

    public final void A05(Surface surface) {
        if (surface == null) {
            C0w9.A03("IgLiveImageStreamingController", "previewSurface is null when starting to stream image");
        }
        if (this.A0E) {
            A04();
        }
        this.A0E = true;
        this.A06 = surface;
        if (this.A05 == null && !this.A0D) {
            C1GJ.A03(new NFX(this));
        }
        this.A0L.post(new RunnableC56947POo(this));
    }

    public C55142Ocx(Context context, UserSession userSession, int i, int i2) {
        this.A0J = userSession;
        this.A0K = context;
        this.A01 = i;
        this.A00 = i2;
        C197578oU c197578oU = C197578oU.A01;
        C14360o3.A07(c197578oU);
        this.A0H = c197578oU;
        this.A0I = new C176537tB();
        Bitmap createBitmap = Bitmap.createBitmap(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        this.A0G = createBitmap;
    }

    public static final Bitmap A01(Bitmap bitmap, float f, float f2, float f3, float f4, int i) {
        float f5;
        int round = Math.round(f);
        int round2 = Math.round(f2);
        Bitmap.Config config = bitmap.getConfig();
        C14360o3.A0A(config);
        Bitmap createBitmap = Bitmap.createBitmap(round, round2, config);
        C14360o3.A07(createBitmap);
        Canvas A06 = AbstractC43592JPx.A06(createBitmap);
        if (f2 > f) {
            f5 = f2;
        } else {
            f5 = 1.7777778f * f;
        }
        Bitmap A09 = C1NC.A09(bitmap, round, Math.round(f5), 0, false);
        C14360o3.A07(A09);
        Bitmap blur = BlurUtil.blur(A09, 1.0f, i);
        A06.drawBitmap(blur, (f - blur.getWidth()) / 2.0f, (f2 - blur.getHeight()) / 2.0f, (Paint) null);
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(-16777216);
        A0R.setAlpha(StringTreeSet.MAX_SYMBOL_COUNT);
        A06.drawRect(AbstractC50522MSa.A0D(blur), A0R);
        Bitmap A05 = C1NC.A05(C1NC.A09(bitmap, Math.round(f3), Math.round(f4), 0, false));
        if (A05 != null) {
            A06.drawBitmap(A05, (f - A05.getWidth()) / 2.0f, (f2 - A05.getHeight()) / 2.0f, (Paint) null);
            return createBitmap;
        }
        throw AbstractC166997dE.A0g();
    }
}
