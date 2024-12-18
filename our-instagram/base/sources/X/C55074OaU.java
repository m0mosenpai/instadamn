package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;

/* renamed from: X.OaU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55074OaU {
    public ScreenShareApi A00;
    public OJD A01;
    public YJy A02;
    public CapturerObserver A03;
    public SurfaceTextureHelper A04;
    public final Context A05;
    public final AudioModule A06;
    public final UserSession A08;
    public final EglBase.Context A0D;
    public final C54453O4h A0E;
    public final InterfaceC09390do A0B = MSY.A0p(this, 2);
    public final InterfaceC09390do A09 = MSY.A0p(this, 0);
    public final InterfaceC09390do A0A = MSY.A0p(this, 1);
    public final InterfaceC09390do A0C = MSY.A0p(this, 3);
    public final ScreenShareProxy A07 = new C52026Mzt(this);

    public C55074OaU(Context context, AudioModule audioModule, UserSession userSession, C54453O4h c54453O4h, EglBase.Context context2) {
        this.A05 = context;
        this.A0D = context2;
        this.A0E = c54453O4h;
        this.A08 = userSession;
        this.A06 = audioModule;
    }

    private final void A00() {
        if (AbstractC167007dF.A1Z(this.A0B)) {
            OJD ojd = this.A01;
            if (ojd != null) {
                ojd.A02.set(false);
            }
            this.A01 = null;
        }
        YJy yJy = this.A02;
        if (yJy != null) {
            yJy.stopCapture();
        }
        YJy yJy2 = this.A02;
        if (yJy2 != null) {
            yJy2.dispose();
        }
        this.A02 = null;
        ScreenShareApi screenShareApi = this.A00;
        if (screenShareApi != null) {
            screenShareApi.enableScreenShare(false, 0);
        }
    }

    public static final void A01(Intent intent, Point point, C55074OaU c55074OaU) {
        MediaProjection mediaProjection;
        if (c55074OaU.A02 != null) {
            c55074OaU.A02();
        }
        try {
            try {
                try {
                    c55074OaU.A04 = SurfaceTextureHelper.create("rsys_screenshare_capture", c55074OaU.A0D, true);
                    YJy yJy = new YJy(intent, new Mb9(c55074OaU));
                    c55074OaU.A02 = yJy;
                    C57123PVt c57123PVt = new C57123PVt(c55074OaU);
                    c55074OaU.A03 = c57123PVt;
                    yJy.initialize(c55074OaU.A04, c55074OaU.A05, c57123PVt);
                    YJy yJy2 = c55074OaU.A02;
                    if (yJy2 != null) {
                        yJy2.startCapture(point.x, point.y, 0);
                    }
                    YJy yJy3 = c55074OaU.A02;
                    if (yJy3 != null) {
                        synchronized (yJy3) {
                            mediaProjection = yJy3.A01;
                        }
                    } else {
                        mediaProjection = null;
                    }
                    InterfaceC09390do interfaceC09390do = c55074OaU.A0B;
                    if (AbstractC167007dF.A1Z(interfaceC09390do) && mediaProjection != null) {
                        if (AbstractC167007dF.A1Z(interfaceC09390do)) {
                            OJD ojd = c55074OaU.A01;
                            if (ojd != null) {
                                ojd.A02.set(false);
                            }
                            c55074OaU.A01 = null;
                        }
                        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                        C14360o3.A0A(newSingleThreadExecutor);
                        OJD ojd2 = new OJD(new C54517O6u((float) MSW.A00(AbstractC166987dD.A17(c55074OaU.A0C))), new O5K(c55074OaU), newSingleThreadExecutor, C57602PhE.A00);
                        c55074OaU.A01 = ojd2;
                        ojd2.A00(mediaProjection);
                    }
                } catch (IllegalStateException e) {
                    C0K8.A0F("RtcScreenShareClient", "getMediaProjection failed", e);
                    new OLI(C18950wb.A01).A02("RtcScreenShareClient: getMediaProjection error", e);
                }
            } catch (SecurityException e2) {
                C0K8.A0F("RtcScreenShareClient", "getMediaProjection failed", e2);
                new OLI(C18950wb.A01).A02("RtcScreenShareClient: getMediaProjection security error", e2);
            }
        } finally {
            NU3 nu3 = c55074OaU.A0E.A00.A0a;
            C0K8.A0D("RtcScreenShareInter", "onEnableScreenShareFailed");
            NU1.A01(nu3.A0A, C05F.A0R, System.currentTimeMillis());
            NU3.A00(nu3, EnumC53174NfV.A02);
            c55074OaU.A02();
        }
    }

    public final void A02() {
        if (AbstractC167007dF.A1Z(this.A09)) {
            synchronized (this) {
                A00();
            }
        } else {
            A00();
        }
    }
}
