package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.MediaActionSound;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.widget.TextView;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8Hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184748Hp {
    public Bitmap A00;
    public MediaActionSound A01;
    public C8HN A02;
    public Integer A03;
    public boolean A04;
    public final Activity A05;
    public final C1815383g A06;
    public final UserSession A07;
    public final C1GL A08;
    public final C1810981l A09;
    public final TargetViewSizeProvider A0A;
    public final C8HI A0B;
    public final C184658Hg A0C;
    public final InterfaceC1810081c A0D;
    public final C184758Hq A0E;
    public final ShutterButton A0F;
    public final Runnable A0G;

    public C184748Hp(Activity activity, C1815383g c1815383g, UserSession userSession, C1GL c1gl, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, C8HI c8hi, C184658Hg c184658Hg, InterfaceC1810081c interfaceC1810081c, C184758Hq c184758Hq, ShutterButton shutterButton) {
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c1815383g, 3);
        C14360o3.A0B(targetViewSizeProvider, 9);
        this.A05 = activity;
        this.A07 = userSession;
        this.A06 = c1815383g;
        this.A09 = c1810981l;
        this.A0D = interfaceC1810081c;
        this.A08 = c1gl;
        this.A0E = c184758Hq;
        this.A0C = c184658Hg;
        this.A0A = targetViewSizeProvider;
        this.A0F = shutterButton;
        this.A0B = c8hi;
        this.A0G = new Runnable() { // from class: X.8Hr
            @Override // java.lang.Runnable
            public final void run() {
                CameraAREffect cameraAREffect;
                C120425cl c120425cl;
                C120415ck c120415ck;
                C8HI c8hi2;
                C174757qB c174757qB;
                int intValue;
                Handler handler;
                Runnable runnable;
                TextView textView;
                C196518mh A01;
                final C184748Hp c184748Hp = C184748Hp.this;
                C184658Hg c184658Hg2 = c184748Hp.A0C;
                c184748Hp.A03 = c184658Hg2.A05();
                C1811981v c1811981v = c184748Hp.A09.A08;
                if (!C14360o3.A0K(c1811981v.A00, C128535rM.A00)) {
                    UserSession userSession2 = c184748Hp.A07;
                    Integer num = c184748Hp.A03;
                    AbstractC189688an.A02(userSession2, (C55U) c1811981v.A00, ((C22F) AnonymousClass229.A01(userSession2)).A04.A0L, AnonymousClass229.A01(userSession2).A0R(), R.bool.config_batterySdCardAccessibility);
                    C006802i c006802i = C006802i.A0p;
                    String str = "0";
                    if (num != null) {
                        int intValue2 = num.intValue();
                        if (intValue2 != 1 && intValue2 != 3) {
                            if (intValue2 == 2) {
                                str = "2";
                            }
                        } else {
                            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                        }
                    } else {
                        str = "null";
                    }
                    c006802i.markerAnnotate(R.bool.config_batterySdCardAccessibility, "flash_mode", str);
                }
                C1815383g c1815383g2 = c184748Hp.A06;
                if (c1815383g2.A01() == null && ((c174757qB = (c8hi2 = c184748Hp.A0B).A06) == null || (A01 = C174757qB.A01(c174757qB)) == null || A01.A01 == EnumC222819sM.A03)) {
                    C174757qB c174757qB2 = c8hi2.A06;
                    if (c174757qB2 != null) {
                        C8HN c8hn = c184748Hp.A02;
                        if (c8hn != null) {
                            C174757qB c174757qB3 = c8hn.A04;
                            if (c174757qB3.A09() == 1 || c174757qB3.A09() == 2) {
                                boolean A06 = C18U.A06(C06090Tz.A05, c184748Hp.A07, 36317736649496068L);
                                ShutterButton shutterButton2 = c184748Hp.A0F;
                                if (shutterButton2.A0B == null) {
                                    shutterButton2.A0B = new Handler(Looper.getMainLooper());
                                }
                                shutterButton2.A0I = A06;
                                shutterButton2.setMode(EnumC131445wb.A03);
                                C8I6 c8i6 = shutterButton2.A0i.A05;
                                if (c8i6 != null && (textView = ((C8I5) c8i6).A00.A02) != null) {
                                    textView.setVisibility(0);
                                }
                                shutterButton2.A0g.A06(shutterButton2.A0F.CFO());
                                if (shutterButton2.A0I) {
                                    shutterButton2.A01 = 0.01f;
                                    Handler handler2 = shutterButton2.A0B;
                                    if (handler2 != null) {
                                        handler2.removeCallbacks(shutterButton2.A0l);
                                    }
                                    handler = shutterButton2.A0B;
                                    if (handler != null) {
                                        runnable = shutterButton2.A0l;
                                        handler.postDelayed(runnable, 16L);
                                    }
                                    c184748Hp.A0D.E4u(new Object());
                                } else {
                                    shutterButton2.A00 = 0.0f;
                                    Handler handler3 = shutterButton2.A0B;
                                    if (handler3 != null) {
                                        handler3.removeCallbacks(shutterButton2.A0k);
                                    }
                                    handler = shutterButton2.A0B;
                                    if (handler != null) {
                                        runnable = shutterButton2.A0k;
                                        handler.postDelayed(runnable, 16L);
                                    }
                                    c184748Hp.A0D.E4u(new Object());
                                }
                            }
                        }
                        Integer A05 = c184658Hg2.A05();
                        boolean z = true;
                        if ((A05 == null || ((intValue = A05.intValue()) != 1 && intValue != 3)) && (!C184658Hg.A02(c184658Hg2) || !c184658Hg2.A06)) {
                            z = false;
                        }
                        c184748Hp.A04 = z;
                        int A02 = AbstractC178387wC.A02(18);
                        UserSession userSession3 = c184748Hp.A07;
                        Bitmap bitmap = null;
                        AbstractC189688an.A02(userSession3, (C55U) c1811981v.A00, ((C22F) AnonymousClass229.A01(userSession3)).A04.A0L, null, A02);
                        c174757qB2.A06 = new C196528mi(c184748Hp);
                        c174757qB2.A0L(new C202738xr(c184748Hp), new C202748xs(c184748Hp));
                        c184748Hp.A00 = null;
                        C174747qA c174747qA = c174757qB2.A0H;
                        if (c174747qA.A00 != null) {
                            c174757qB2.A0K(new C202758xt(c184748Hp), 4, 4);
                            return;
                        }
                        TextureView textureView = c174747qA.A01;
                        if (textureView != null) {
                            bitmap = textureView.getBitmap(4, 4);
                        }
                        c184748Hp.A00 = bitmap;
                        return;
                    }
                    return;
                }
                final Context applicationContext = c184748Hp.A05.getApplicationContext();
                C14360o3.A07(applicationContext);
                InterfaceC14020nS A00 = C14120nc.A00();
                C14360o3.A07(A00);
                A00.ATO(new AbstractRunnableC14200nk() { // from class: X.8nY
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object systemService = applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                        C14360o3.A0C(systemService, MSV.A00(7));
                        int i = AbstractC41221vX.A00().A01;
                        int streamVolume = ((AudioManager) systemService).getStreamVolume(1);
                        if (i > 0 && streamVolume > 0) {
                            C184748Hp c184748Hp2 = c184748Hp;
                            MediaActionSound mediaActionSound = c184748Hp2.A01;
                            if (mediaActionSound == null) {
                                mediaActionSound = new MediaActionSound();
                                c184748Hp2.A01 = mediaActionSound;
                            }
                            mediaActionSound.play(0);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1253171308, 3, false, false);
                    }
                });
                IgCameraEffectsController igCameraEffectsController = c1815383g2.A05;
                AnonymousClass818 anonymousClass818 = igCameraEffectsController.A07;
                if (anonymousClass818 != null && anonymousClass818.isEnabled() && (cameraAREffect = igCameraEffectsController.A09) != null) {
                    Map map = cameraAREffect.A0Z;
                    if (map.get("previewCaptureOutput") != null || map.get("cameraInfoScriptingModule") != null || ((c120425cl = (C120425cl) map.get("internalScriptingAPI")) != null && (c120415ck = c120425cl.A00) != null && c120415ck.A01)) {
                        C23441AaE c23441AaE = new C23441AaE(c184748Hp);
                        InterfaceC174857qL interfaceC174857qL = c1815383g2.A04.A04;
                        if (interfaceC174857qL == null) {
                            return;
                        }
                        interfaceC174857qL.Epw(c23441AaE);
                        return;
                    }
                }
                C197048nZ c197048nZ = new C197048nZ(c184748Hp);
                C184748Hp c184748Hp2 = c197048nZ.A01;
                Integer num2 = null;
                try {
                    C174757qB c174757qB4 = c184748Hp2.A0B.A06;
                    if (c174757qB4 != null) {
                        num2 = Integer.valueOf(c174757qB4.A07());
                    }
                } catch (C6M2 unused) {
                }
                c197048nZ.A00 = num2;
                C174757qB c174757qB5 = c184748Hp2.A0B.A06;
                if (c174757qB5 != null && c174757qB5.A0H.A00 != null) {
                    int A022 = AbstractC178387wC.A02(17);
                    UserSession userSession4 = c184748Hp2.A07;
                    AbstractC189688an.A02(userSession4, (C55U) c184748Hp2.A09.A08.A00, ((C22F) AnonymousClass229.A01(userSession4)).A04.A0L, null, A022);
                    C197998pA c197998pA = new C197998pA(c197048nZ);
                    C179717yL c179717yL = (C179717yL) ((InterfaceC179727yM) c174757qB5.A0G.A01(InterfaceC179727yM.A00));
                    AbstractC196588mo.A00(c179717yL.A00, C05F.A01, "BasicPhotoCaptureCoordinator", c179717yL.hashCode());
                    C175007qa c175007qa = c179717yL.A04;
                    C197058na c197058na = new C197058na(c179717yL, c197998pA);
                    if (c175007qa == null) {
                        c197058na.A01(new IllegalStateException("CameraViewController is null"));
                        return;
                    } else {
                        c175007qa.A0O.Bfi(c197058na, 0, 0);
                        return;
                    }
                }
                c184748Hp2.A08.schedule(c197048nZ);
            }
        };
    }

    public static final void A00(Bitmap bitmap, InterfaceC174807qG interfaceC174807qG, C184748Hp c184748Hp, Integer num) {
        int A02 = AbstractC178387wC.A02(17);
        UserSession userSession = c184748Hp.A07;
        C006802i.A0p.markerEnd(A02, (short) 2);
        C8HI c8hi = c184748Hp.A0B;
        C174757qB c174757qB = c8hi.A06;
        if (c174757qB != null) {
            C175007qa c175007qa = ((BasicCameraOutputController) C174757qB.A02(c174757qB)).A04;
            if (c175007qa != null) {
                c175007qa.A0N.A9j(interfaceC174807qG);
            }
            c174757qB.Eod(null);
        }
        Activity activity = c184748Hp.A05;
        TargetViewSizeProvider targetViewSizeProvider = c184748Hp.A0A;
        String A00 = AbstractC196798n9.A00(num);
        MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        C1815383g c1815383g = c184748Hp.A06;
        String A022 = c1815383g.A02();
        c184748Hp.A08.schedule(new C196808nA(activity, bitmap, null, c184748Hp.A00, null, null, null, null, null, c1815383g.A01(), mediaUploadMetadata, userSession, targetViewSizeProvider, c8hi, c184748Hp.A0E, null, null, null, null, null, null, null, null, null, null, A00, AbstractC197018nW.A00(c184748Hp.A09.A0A()), A022, null, null, null, null, -1, true, false, false));
    }
}
