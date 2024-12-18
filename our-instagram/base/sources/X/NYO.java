package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class NYO extends AbstractC208809Lo implements SurfaceTexture.OnFrameAvailableListener {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C208719Lf A06;
    public InterfaceC58174Pqe A07;
    public InterfaceC58179Pqj A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public UserSession A0E;
    public boolean A0F;
    public Context A0G;
    public final C18340vL A0H;
    public final InterfaceC58179Pqj A0I;
    public final Object A0J;
    public volatile long A0K;
    public volatile MediaCodec A0L;
    public volatile MY5 A0M;
    public volatile boolean A0N;
    public volatile boolean A0O;
    public volatile boolean A0P;

    @Override // X.AbstractC208809Lo
    public final void A03() {
        this.A09 = false;
        A00();
        super.A00.A02(C05F.A01);
        InterfaceC58179Pqj interfaceC58179Pqj = this.A08;
        C208719Lf c208719Lf = this.A06;
        interfaceC58179Pqj.COH(c208719Lf, -1);
        A0A(interfaceC58179Pqj.Bzi());
        interfaceC58179Pqj.E4x(c208719Lf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4 <= r11.A0K) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(int r12) {
        /*
            r11 = this;
            long r4 = (long) r12
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            r10 = r11
            long r1 = r11.A0K
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L51
            monitor-enter(r10)
            long r1 = r11.A0K     // Catch: java.lang.Throwable -> L3d
            r8 = 0
            r7 = 0
            r6 = 1
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L1d
            long r2 = r11.A0K     // Catch: java.lang.Throwable -> L3d
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L1e
        L1d:
            r0 = 0
        L1e:
            r11.A0N = r0     // Catch: java.lang.Throwable -> L3d
            r11.A0K = r4     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r11.A0P     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L28
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3d
            return
        L28:
            r11.A0P = r6     // Catch: java.lang.Throwable -> L3d
            long r2 = r11.A0K     // Catch: java.lang.Throwable -> L3d
            long r0 = r11.A04     // Catch: java.lang.Throwable -> L3d
            long r2 = r2 - r0
            long r3 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> L3d
            r1 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3b
            r7 = 1
        L3b:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3d
            goto L40
        L3d:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3d
            throw r0
        L40:
            if (r7 == 0) goto L47
            X.Pqe r0 = r11.A07
            r0.Eky()
        L47:
            X.0vL r1 = r11.A0H
            X.NGN r0 = new X.NGN
            r0.<init>(r11)
            r1.ATO(r0)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NYO.A0A(int):void");
    }

    private void A00() {
        synchronized (this.A0J) {
            if (!this.A0O) {
                this.A0O = A0B();
                if (!this.A0O) {
                    this.A07.DaI();
                }
            }
        }
    }

    private void A01() {
        synchronized (this.A0J) {
            if (this.A0O) {
                A08();
                this.A0O = false;
            }
        }
    }

    @Override // X.AbstractC208809Lo
    public final void A06() {
        if (!this.A0C) {
            this.A07.FC2();
        }
        if (this.A0C) {
            this.A07.ELo();
            super.A00.A00();
        }
    }

    @Override // X.AbstractC208809Lo
    public final boolean A07() {
        if (this.A0C) {
            return true;
        }
        if (this.A0F) {
            this.A0C = true;
            InterfaceC58179Pqj interfaceC58179Pqj = this.A0I;
            RunnableC208819Lp runnableC208819Lp = super.A00;
            interfaceC58179Pqj.EfU(runnableC208819Lp);
            runnableC208819Lp.A08.offer(new RunnableC24496AtF(runnableC208819Lp));
            return false;
        }
        return false;
    }

    public final void A08() {
        if (this.A0L != null) {
            C0fT.A06(this.A0L, 651483208);
            C0fT.A03(this.A0L, 1825722047);
            this.A0L = null;
            this.A0A = false;
        }
        if (this.A0M != null) {
            this.A0M.release();
            this.A0M = null;
        }
    }

    public final void A09() {
        C0K8.A0D("ScrubberRenderControllerBase", "Saving Poster Frame");
        super.A00.A02(C05F.A00);
        this.A0F = true;
    }

    public final boolean A0B() {
        MediaFormat mediaFormat;
        C208719Lf c208719Lf;
        this.A0M = MY5.A00("scrubber_render_controller");
        if (!this.A08.ESx(this.A0M)) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < ((MY7) this.A0M).A00.getTrackCount()) {
                mediaFormat = ((MY7) this.A0M).A00.getTrackFormat(i);
                mediaFormat.setInteger("max-input-size", 0);
                String string = mediaFormat.getString("mime");
                string.getClass();
                if (string.startsWith("video/")) {
                    try {
                        this.A0L = C0fT.A01(string, 444647748);
                        this.A0M.EMv(i);
                        this.A05 = mediaFormat.getLong("durationUs");
                        this.A0A = false;
                        break;
                    } catch (IOException e) {
                        C0K8.A0L("ScrubberRenderControllerBase", "Failed to create decoder: %s", e, e.getMessage());
                    }
                }
                i++;
            } else {
                mediaFormat = null;
                break;
            }
        }
        if (this.A0L == null) {
            C0K8.A0D("ScrubberRenderControllerBase", "Could not acquire decoder.");
            this.A0M.release();
            this.A0M = null;
            return false;
        }
        try {
            MediaCodec mediaCodec = this.A0L;
            c208719Lf = this.A06;
            C0fT.A07(mediaCodec, null, mediaFormat, new Surface(c208719Lf.A00()), 0, -1882605341);
        } catch (Exception e2) {
            try {
                try {
                    Thread.sleep(200L);
                } catch (InterruptedException unused) {
                }
                MediaCodec mediaCodec2 = this.A0L;
                c208719Lf = this.A06;
                C0fT.A07(mediaCodec2, null, mediaFormat, new Surface(c208719Lf.A00()), 0, 1538403511);
                C0w9.A06("Exception when configuring mDecoder ", "success on second attempt", e2);
            } catch (Exception unused2) {
                try {
                    try {
                        Thread.sleep(800L);
                    } catch (InterruptedException unused3) {
                    }
                    MediaCodec mediaCodec3 = this.A0L;
                    c208719Lf = this.A06;
                    C0fT.A07(mediaCodec3, null, mediaFormat, new Surface(c208719Lf.A00()), 0, 120315061);
                    C0w9.A06("Exception when configuring mDecoder ", "success on third attempt", e2);
                } catch (Exception unused4) {
                    C0w9.A06("Exception when configuring mDecoder ", "three failed attempts", e2);
                    return false;
                }
            }
        }
        SurfaceTexture A00 = c208719Lf.A00();
        A00.getClass();
        A00.setOnFrameAvailableListener(this);
        C0fT.A05(this.A0L, 860696989);
        return true;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (!this.A0D) {
            this.A09 = true;
            if (this.A0B) {
                A09();
            }
        }
        if (!this.A0D) {
            super.A00.A03(null);
        }
    }

    public NYO(Context context, UserSession userSession, RunnableC208819Lp runnableC208819Lp, C208719Lf c208719Lf, InterfaceC58174Pqe interfaceC58174Pqe, InterfaceC58179Pqj interfaceC58179Pqj, boolean z) {
        super(runnableC208819Lp);
        this.A0I = interfaceC58179Pqj;
        this.A0B = z;
        this.A0J = new Object();
        this.A0O = false;
        this.A0H = new C18340vL(C14120nc.A00(), 1);
        this.A0K = -1L;
        this.A0P = false;
        this.A0N = false;
        this.A04 = -1L;
        this.A03 = 0L;
        this.A02 = -1L;
        this.A01 = -1L;
        this.A00 = -1L;
        this.A0A = false;
        this.A0E = userSession;
        this.A06 = c208719Lf;
        this.A0G = context;
        this.A08 = interfaceC58179Pqj;
        this.A07 = interfaceC58174Pqe;
    }

    @Override // X.AbstractC208809Lo
    public final void A02() {
        A01();
    }

    @Override // X.AbstractC208809Lo
    public final void A04() {
        A01();
    }

    @Override // X.AbstractC208809Lo
    public final void A05() {
        A00();
    }
}
