package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes11.dex */
public final class UAE extends TextureView {
    public static final HeroPlayerSetting A0A;
    public long A00;
    public Surface A01;
    public C117275Sm A02;
    public C4SS A03;
    public InterfaceC71850X7i A04;
    public String A05;
    public boolean A06;
    public final int A07;
    public final C4RQ A08;
    public final C459529d A09;

    /* JADX WARN: Type inference failed for: r4v1, types: [X.4RO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, X.4RF] */
    public UAE(Context context, int i) {
        super(context);
        this.A07 = i;
        HashMap hashMap = new HashMap();
        HeroPlayerSetting heroPlayerSetting = A0A;
        C459529d A01 = C459529d.A01(context, heroPlayerSetting, InterfaceC459429c.A00, hashMap, null, null);
        this.A09 = A01;
        AtomicLong atomicLong = C4RQ.A0c;
        WYG wyg = new WYG(this);
        ?? obj = new Object();
        HandlerThread handlerThread = new HandlerThread("HeroPlayerInternalThread", -2);
        AbstractC09770fa.A00(handlerThread);
        handlerThread.start();
        C4RQ c4rq = new C4RQ(AbstractC167007dF.A0J(), handlerThread.getLooper(), new Object(), obj, wyg, A01, null, heroPlayerSetting);
        c4rq.A0H(false);
        this.A08 = c4rq;
        this.A02 = new C117275Sm();
        this.A05 = "";
        setSurfaceTextureListener(new WL2(this));
    }

    public final void setPlayerListener(InterfaceC71850X7i interfaceC71850X7i) {
        C14360o3.A0B(interfaceC71850X7i, 0);
        this.A04 = interfaceC71850X7i;
    }

    static {
        C41831wX c41831wX = new C41831wX();
        c41831wX.A01();
        c41831wX.A16 = "TransitionVideoPlayerV1";
        c41831wX.A2s = true;
        c41831wX.A0f = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        c41831wX.A1x = true;
        c41831wX.A0a = 1;
        c41831wX.A0C = 12000;
        c41831wX.A0E = 60000;
        c41831wX.A2J = true;
        A0A = new HeroPlayerSetting(c41831wX);
    }

    public final void A00() {
        this.A08.A0B();
    }

    public final void A01() {
        C4RQ c4rq = this.A08;
        C4RQ.A05(c4rq, "seekTo: seekTimeMsWithPreview: %d, jumpSeek: %s", 0, false);
        c4rq.A0T = 0L;
        c4rq.A0U = C4RQ.A0c.incrementAndGet();
        c4rq.A0V = SystemClock.elapsedRealtime();
        AbstractC166997dE.A1H(c4rq.A0E, new long[]{c4rq.A0T, c4rq.A0U, 0}, 4);
    }

    public final void A02(C4SS c4ss, boolean z) {
        this.A08.A0E(c4ss);
        this.A06 = z;
        this.A03 = c4ss;
        String str = c4ss.A07;
        if (str == null) {
            str = "";
        }
        this.A05 = str;
        this.A00 = 0L;
    }

    public final long getCurrentPositionMs() {
        return this.A08.A08();
    }

    public final long getVideoDurationMs() {
        return this.A08.A09();
    }
}
