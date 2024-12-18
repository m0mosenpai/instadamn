package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.instagram.arlink.fragment.YUVImageData;
import com.instagram.common.session.UserSession;
import java.nio.ByteBuffer;

/* renamed from: X.LGt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47957LGt {
    public int A00;
    public int A01;
    public Handler A02;
    public HandlerThread A03;
    public final Handler A04;
    public final C63458Skd A05;
    public final C63334Shl A06;
    public final C85F A07;
    public final AbstractC59962oe A08;
    public final UserSession A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

    public static final boolean A00(C3AY c3ay, C47957LGt c47957LGt, boolean z) {
        Handler handler;
        Runnable runnableC49982M4x;
        Runnable runnableC49932M2z;
        if (c3ay == null) {
            return false;
        }
        Object obj = c3ay.A00;
        if (obj != null) {
            int ordinal = ((EnumC61133Rfn) obj).ordinal();
            if (ordinal != 1) {
                if (ordinal != 0) {
                    if (ordinal != 2 && ordinal != 4) {
                        if (ordinal != 3) {
                            return false;
                        }
                        handler = c47957LGt.A04;
                        runnableC49932M2z = new M31(c3ay, c47957LGt);
                    } else {
                        handler = c47957LGt.A04;
                        runnableC49932M2z = new M30(c3ay, c47957LGt);
                    }
                } else {
                    handler = c47957LGt.A04;
                    runnableC49932M2z = new RunnableC49932M2z(c3ay, c47957LGt);
                }
                runnableC49982M4x = runnableC49932M2z;
            } else {
                Object obj2 = c3ay.A01;
                if (obj2 != null) {
                    handler = c47957LGt.A04;
                    runnableC49982M4x = new RunnableC49982M4x(c47957LGt, (String) obj2, z);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            handler.post(runnableC49982M4x);
            return true;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void A04(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        Handler handler = this.A02;
        if (handler != null) {
            handler.removeMessages(1);
            C17280tP A0y = AbstractC166987dD.A0y();
            if (AbstractC167017dG.A1b(A0y, A0y.A2q, C17280tP.A4G, 113) || (!this.A0A && !this.A0B)) {
                Message obtainMessage = handler.obtainMessage(1, ByteBuffer.wrap(bArr));
                C14360o3.A07(obtainMessage);
                handler.sendMessage(obtainMessage);
            }
        }
    }

    public final void A01() {
        Handler handler;
        if (this.A03 != null && (handler = this.A02) != null) {
            handler.removeCallbacksAndMessages(null);
            HandlerThread handlerThread = this.A03;
            C14360o3.A0A(handlerThread);
            handlerThread.quitSafely();
            this.A02 = null;
            this.A03 = null;
        }
    }

    public final void A02() {
        if (this.A03 == null) {
            synchronized (this) {
                if (this.A03 == null) {
                    HandlerThread handlerThread = new HandlerThread("ArLinkScanController.FrameHandlerThread", 9);
                    AbstractC09770fa.A00(handlerThread);
                    this.A03 = handlerThread;
                    handlerThread.start();
                    HandlerThread handlerThread2 = this.A03;
                    C14360o3.A0A(handlerThread2);
                    Looper looper = handlerThread2.getLooper();
                    if (looper != null) {
                        this.A02 = new Handler(looper, this.A05);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
    }

    public final void A03(C196708n0 c196708n0) {
        Handler handler = this.A02;
        if (handler != null) {
            handler.removeMessages(2);
            C17280tP A0y = AbstractC166987dD.A0y();
            if (AbstractC167017dG.A1b(A0y, A0y.A2q, C17280tP.A4G, 113) || (!this.A0A && !this.A0B)) {
                Message obtainMessage = handler.obtainMessage(2);
                C14360o3.A07(obtainMessage);
                obtainMessage.setData(new YUVImageData(c196708n0).A03);
                handler.sendMessage(obtainMessage);
            }
        }
    }

    public C47957LGt(C85F c85f, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A04 = AbstractC167007dF.A0J();
        this.A05 = new C63458Skd(this);
        AbstractC46618Kjv.A00(userSession);
        this.A08 = abstractC59962oe;
        this.A09 = userSession;
        this.A07 = c85f;
        this.A06 = new C63334Shl(abstractC59962oe.requireContext(), userSession);
        abstractC59962oe.getModuleName();
    }
}
