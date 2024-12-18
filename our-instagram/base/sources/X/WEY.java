package X;

import android.content.Context;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class WEY {
    public C178927x4 A00;
    public AbstractC180277zH A01;
    public C70190WFt A02;
    public C55169OdX A03;
    public String A05;
    public final int A06;
    public final int A07;
    public final Handler A08;
    public final C179877yd A09;
    public final O5A A0B;
    public final float[] A0E;
    public final UserSession A0F;
    public volatile boolean A0G;
    public final AtomicInteger A0D = new AtomicInteger(0);
    public final List A0C = new ArrayList();
    public final C201278vB A0A = new C201278vB();
    public EnumC53384NjZ A04 = EnumC53384NjZ.A05;

    public static C201278vB A00(WEY wey, List list, int i, long j) {
        C201278vB c201278vB = wey.A0A;
        c201278vB.A01(((C200688uB) list.get(i)).A03, wey.A0E, j);
        return c201278vB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x03b1, code lost:
    
        if (r15 < 5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04d4, code lost:
    
        if (r15 < 5) goto L90;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x004a. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.WEY r30) {
        /*
            Method dump skipped, instructions count: 1732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WEY.A01(X.WEY):void");
    }

    public static final void A02(WEY wey) {
        if (wey.A00 != null) {
            C55169OdX c55169OdX = new C55169OdX(wey.A0F);
            c55169OdX.A04 = new C68727Vb6(wey);
            boolean A04 = c55169OdX.A04(wey.A07, wey.A06, (int) (r8 * r2 * (1.0E9d / 3.3E7d) * 4.0d * 0.07d), 0);
            AbstractC180277zH abstractC180277zH = null;
            if (!A04) {
                AbstractC12120kG.A07(MSV.A00(359), "startEncoder() mPosesEncoder.configure failed.", null);
                return;
            }
            Surface surface = c55169OdX.A03;
            if (surface == null) {
                return;
            }
            C178927x4 c178927x4 = wey.A00;
            if (c178927x4 != null) {
                abstractC180277zH = c178927x4.AMi(surface);
            }
            wey.A01 = abstractC180277zH;
            if (abstractC180277zH != null) {
                abstractC180277zH.A05();
            }
            String str = wey.A05;
            synchronized (c55169OdX) {
                if (c55169OdX.A05 == null) {
                    HandlerC50752MbH handlerC50752MbH = new HandlerC50752MbH(AbstractC65702TsY.A0G(MSV.A00(692)), c55169OdX);
                    c55169OdX.A05 = handlerC50752MbH;
                    Message obtainMessage = handlerC50752MbH.obtainMessage(1, str);
                    obtainMessage.arg1 = 0;
                    c55169OdX.A05.sendMessage(obtainMessage);
                } else {
                    throw new IllegalStateException("startVideoRecording() is called more than once!");
                }
            }
            wey.A03 = c55169OdX;
        }
    }

    public WEY(Context context, UserSession userSession, O5A o5a, String str, int i, int i2) {
        this.A0F = userSession;
        this.A07 = i;
        this.A06 = i2;
        this.A05 = str;
        this.A0B = o5a;
        float[] fArr = new float[16];
        this.A0E = fArr;
        this.A09 = new C179877yd(context.getResources());
        Matrix.setIdentityM(fArr, 0);
        AbstractC197988p9.A01(fArr);
        Looper A0G = AbstractC65702TsY.A0G("PosesRenderThread");
        if (A0G != null) {
            this.A08 = new Handler(A0G);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
