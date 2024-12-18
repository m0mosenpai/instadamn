package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.view.TextureView;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Wot, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71158Wot implements C30G {
    public boolean A02;
    public InterfaceC11380iw A03;
    public String A04;
    public final C4QW A05;
    public final UserSession A07;
    public final C57012jc A08;
    public final Map A09 = new HashMap();
    public final List A06 = new CopyOnWriteArrayList();
    public MediaMapPin A01 = null;
    public Bitmap A00 = null;

    @Override // X.C30G
    public final void onCompletion() {
    }

    @Override // X.C30G
    public final void onCues(List list) {
    }

    @Override // X.C30G
    public final void onDrawnToSurface() {
    }

    @Override // X.C30G
    public final void onLoop(int i) {
    }

    @Override // X.C30G
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C30G
    public final void onSeeking(long j) {
    }

    @Override // X.C30G
    public final void onStopVideo(String str, boolean z) {
    }

    @Override // X.C30G
    public final void onStopped(C4S7 c4s7, int i) {
    }

    @Override // X.C30G
    public final void onSurfaceTextureDestroyed() {
    }

    @Override // X.C30G
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C30G
    public final void onVideoPrepared(C4S7 c4s7, boolean z) {
    }

    @Override // X.C30G
    public final void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoSwitchToWarmupPlayer(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    public final int A00(String str) {
        Map map = this.A09;
        Number number = (Number) map.get(str);
        if (number == null) {
            number = 0;
            map.put(str, number);
        }
        return number.intValue();
    }

    public final void A01() {
        C120985dq c120985dq;
        MediaMapPin mediaMapPin = this.A01;
        String str = null;
        if (mediaMapPin != null) {
            C111034zF c111034zF = mediaMapPin.A03;
            if (c111034zF != null) {
                c120985dq = AbstractC128065qa.A02(c111034zF);
            } else {
                c120985dq = null;
            }
        } else {
            c120985dq = null;
        }
        MediaMapPin mediaMapPin2 = this.A01;
        if (mediaMapPin2 != null) {
            str = AbstractC69973Vyo.A01(mediaMapPin2);
        }
        if (this.A05 != null && this.A02 && c120985dq != null && str != null) {
            this.A02 = false;
            A02(c120985dq, str);
        }
    }

    public final void A02(C120985dq c120985dq, String str) {
        String moduleName;
        UserSession userSession = this.A07;
        if (C18U.A06(C06090Tz.A05, userSession, 36325944331417111L)) {
            moduleName = this.A04;
            moduleName.getClass();
        } else {
            InterfaceC11380iw interfaceC11380iw = this.A03;
            interfaceC11380iw.getClass();
            moduleName = interfaceC11380iw.getModuleName();
        }
        C4QW c4qw = this.A05;
        if (c4qw.isPlaying()) {
            c4qw.Eol("", true);
        }
        C4QT c4qt = (C4QT) c4qw;
        c4qt.A0Z = true;
        c4qt.A06 = 1;
        C75363a3 A0A = c120985dq.A0A(userSession, null);
        InterfaceC74623Ww interfaceC74623Ww = (InterfaceC74623Ww) this.A08.A01();
        C4S7 c4s7 = new C4S7(c120985dq, 0);
        C14360o3.A0B(moduleName, 6);
        c4qw.E5v(new C4SC(interfaceC74623Ww, new C4QP(false, false, false, false), A0A, c4s7, c120985dq.A0N, moduleName, 1.0f, 0, A00(str), true));
        c4qw.EMg(A00(str), true);
        c4qw.EYb(true);
    }

    @Override // X.C30G
    public final void onPrepare(C4S7 c4s7) {
        MediaMapPin mediaMapPin = this.A01;
        if (mediaMapPin != null) {
            this.A05.EMg(A00(AbstractC69973Vyo.A01(mediaMapPin)), true);
        }
    }

    @Override // X.C30G
    public final void onProgressUpdate(int i, int i2, boolean z) {
        MediaMapPin mediaMapPin = this.A01;
        if (mediaMapPin != null) {
            AbstractC37301Gc2.A1T(AbstractC69973Vyo.A01(mediaMapPin), this.A09, i);
        }
    }

    @Override // X.C30G
    public final void onSurfaceTextureUpdated(C4S7 c4s7) {
        String A01;
        Bitmap bitmap;
        C4QW c4qw = this.A05;
        if (c4qw.isPlaying()) {
            this.A00 = ((TextureView) ((ViewGroup) this.A08.A01()).getChildAt(0)).getBitmap();
            MediaMapPin mediaMapPin = this.A01;
            if (mediaMapPin != null) {
                AbstractC37301Gc2.A1T(AbstractC69973Vyo.A01(mediaMapPin), this.A09, c4qw.getCurrentPositionMs());
                for (C68756VbZ c68756VbZ : this.A06) {
                    KYY kyy = c68756VbZ.A00;
                    if (kyy != null) {
                        String str = kyy.A0F;
                        MediaMapPin mediaMapPin2 = this.A01;
                        if (mediaMapPin2 == null) {
                            A01 = null;
                        } else {
                            A01 = AbstractC69973Vyo.A01(mediaMapPin2);
                        }
                        if (C14360o3.A0K(str, A01) && (bitmap = this.A00) != null) {
                            KYY kyy2 = c68756VbZ.A00;
                            C14360o3.A0A(kyy2);
                            AbstractC44340Jif abstractC44340Jif = kyy2.A03;
                            if (abstractC44340Jif instanceof C46014KYc) {
                                C46014KYc c46014KYc = (C46014KYc) abstractC44340Jif;
                                c46014KYc.A08 = bitmap;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                                c46014KYc.A0A = bitmapShader;
                                c46014KYc.A0L.setShader(bitmapShader);
                                c46014KYc.invalidateSelf();
                            }
                        }
                    }
                }
            }
        }
    }

    public C71158Wot(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57012jc c57012jc) {
        this.A03 = null;
        this.A04 = null;
        this.A07 = userSession;
        this.A08 = c57012jc;
        if (C18U.A06(C06090Tz.A05, userSession, 36325944331417111L)) {
            String moduleName = interfaceC11380iw.getModuleName();
            this.A04 = moduleName;
            moduleName.getClass();
            this.A05 = C4QS.A00(context, userSession, null, this, moduleName);
            return;
        }
        this.A03 = interfaceC11380iw;
        this.A05 = C4QS.A00(context, userSession, null, this, interfaceC11380iw.getModuleName());
    }
}
