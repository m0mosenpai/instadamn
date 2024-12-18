package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.6ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class TextureViewSurfaceTextureListenerC147506ka implements InterfaceC147516kc, C4QV, TextureView.SurfaceTextureListener, AudioManager.OnAudioFocusChangeListener, C4QZ, InterfaceC95144Qa, InterfaceC95154Qb, View.OnKeyListener {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public ViewGroup A0G;
    public C95744Si A0H;
    public C95224Qi A0I;
    public EnumC92424Bx A0J;
    public InterfaceC60442pS A0K;
    public C41181vS A0L;
    public InterfaceC95344Qu A0M;
    public C66354UBs A0N;
    public InterfaceC143586dx A0O;
    public Integer A0P;
    public String A0Q;
    public String A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public long A0i;
    public EnumC92424Bx A0j;
    public Runnable A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public final long A0p;
    public final Context A0q;
    public final AudioManager A0r;
    public final Handler A0s;
    public final UserSession A0t;
    public final InterfaceC95254Ql A0u;
    public final C30P A0v;
    public final C95644Ry A0w;
    public final C95654Rz A0x;
    public final C95634Rx A0y;
    public final C95604Ru A0z;
    public final C95294Qp A10;
    public final C95624Rw A11;
    public final C121595fA A12;
    public final ReelViewerFragment A13;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final long A19;
    public final Handler A1A;
    public final C41101vI A1B;
    public final C3G2 A1C;
    public final Runnable A1D;
    public final boolean A1E;
    public final boolean A1F;
    public volatile boolean A1G;
    public volatile boolean A1H;
    public final AtomicBoolean A14 = new AtomicBoolean(false);
    public final AtomicBoolean A15 = new AtomicBoolean(false);
    public boolean A0b = false;

    @Override // X.InterfaceC147516kc, X.InterfaceC95164Qc
    public final synchronized View CFf() {
        InterfaceC95344Qu interfaceC95344Qu = this.A0M;
        if (interfaceC95344Qu != null && this.A0a) {
            return ((C95334Qt) interfaceC95344Qu).A09.A04;
        }
        InterfaceC143586dx interfaceC143586dx = this.A0O;
        if (interfaceC143586dx != null && !this.A0a) {
            return interfaceC143586dx.C6w();
        }
        return null;
    }

    @Override // X.InterfaceC95144Qa
    public final void Cxu(int i, int i2) {
        int i3;
        if (i == i2) {
            i3 = 0;
        } else {
            i3 = 25;
            if (i2 > i) {
                i3 = 24;
            }
        }
        this.A15.set(true);
        A0C(this, AbstractC41221vX.A00().A0C, 100, i3);
        C4SG A02 = A02(getCurrentPositionMs());
        this.A0y.A03(i2, i3);
        this.A0u.EIX(A02, this.A0L, i3, false);
    }

    @Override // X.C4QV
    public final void Cxx() {
        this.A1G = true;
        this.A0y.A04(this.A1G);
    }

    @Override // X.C4QV
    public final synchronized void D6i(InterfaceC95344Qu interfaceC95344Qu) {
        if (((C95334Qt) interfaceC95344Qu).A09.A0I.A0X) {
            this.A0Y = true;
        } else {
            A09(this.A0H, this.A0L, A04(this), "finished");
            this.A0u.EIg(this.A0L);
            C41181vS c41181vS = this.A0L;
            if (c41181vS != null) {
                this.A13.Dbs(c41181vS);
            }
        }
    }

    @Override // X.C4QV
    public final void DBs(InterfaceC95344Qu interfaceC95344Qu, String str, String str2, int i, int i2, int i3) {
        String str3 = str2;
        String str4 = str;
        if (interfaceC95344Qu.equals(this.A0M)) {
            InterfaceC95254Ql interfaceC95254Ql = this.A0u;
            C41181vS c41181vS = this.A0L;
            if (str == null) {
                str4 = "";
            }
            if (str2 == null) {
                str3 = "";
            }
            interfaceC95254Ql.EHU(A03(getCurrentPositionMs(), A00(), i, i2), c41181vS, str4, str3, i3, i);
        }
    }

    @Override // X.C4QV
    public final void DCT(InterfaceC95344Qu interfaceC95344Qu) {
    }

    @Override // X.C4QV
    public final synchronized void DEE(InterfaceC95344Qu interfaceC95344Qu, String str, String str2, String str3) {
        ReelViewerFragment reelViewerFragment;
        String str4;
        InterfaceC95344Qu interfaceC95344Qu2;
        UserSession userSession = this.A0t;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36310950600769925L) && this.A09 < this.A0A) {
            if (C18U.A06(c06090Tz, userSession, 36310950600638851L) && this.A0L != null) {
                this.A0c = true;
                this.A09++;
                int currentPositionMs = getCurrentPositionMs();
                InterfaceC95344Qu interfaceC95344Qu3 = this.A0M;
                if (interfaceC95344Qu3 != null) {
                    interfaceC95344Qu3.reset();
                }
                C3Q0 c3q0 = C3Q0.IDLE;
                C121595fA c121595fA = this.A12;
                if (c121595fA != null) {
                    c121595fA.A00 = c3q0;
                }
                C41181vS c41181vS = this.A0L;
                if (c41181vS != null) {
                    E5l(c41181vS, true);
                }
                A0B(this, currentPositionMs);
            } else if (C18U.A06(c06090Tz, userSession, 36310950600704388L) && (interfaceC95344Qu2 = this.A0M) != null) {
                this.A09++;
                interfaceC95344Qu2.EKu();
            }
        }
        if (this.A0M == interfaceC95344Qu && (reelViewerFragment = this.A13) != null) {
            int currentPositionMs2 = getCurrentPositionMs();
            if (currentPositionMs2 > 0) {
                A09(this.A0H, this.A0L, A02(currentPositionMs2), "error");
            }
            if (this.A0L != null) {
                C140706Xy A00 = AbstractC140696Xx.A00(userSession);
                C41181vS c41181vS2 = this.A0L;
                C14360o3.A0B(c41181vS2, 0);
                A00.A08(c41181vS2);
            }
            InterfaceC95254Ql interfaceC95254Ql = this.A0u;
            interfaceC95254Ql.EIa(A04(this), this.A0L, str, str2, str3);
            interfaceC95254Ql.EIg(this.A0L);
            C41181vS c41181vS3 = this.A0L;
            if (c41181vS3 != null && c41181vS3.A1o()) {
                C145776ha c145776ha = reelViewerFragment.A0y;
                c145776ha.getClass();
                c145776ha.Dz0();
                if (c41181vS3.A0M(reelViewerFragment.getSession()) != null) {
                    str4 = c41181vS3.A0M(reelViewerFragment.getSession()).A0L;
                } else {
                    str4 = null;
                }
                String str5 = c41181vS3.A0k;
                String moduleName = reelViewerFragment.getModuleName();
                UserSession session = reelViewerFragment.getSession();
                C14360o3.A0B(str5, 1);
                C14360o3.A0B(moduleName, 2);
                C14360o3.A0B(session, 4);
                C15790qZ A04 = AbstractC15820qc.A04();
                C18920wW A01 = AbstractC12220kQ.A01(AbstractC115975Mo.A00, session);
                InterfaceC02590Ai A002 = A01.A00(A01.A00, "reel_loading_error");
                A002.AAP("error_type", "reel_video_playback_error");
                A002.AAP("network_connection_cellular_type", AbstractC15770qX.A00(A04.A00));
                A002.AAP("network_connection_state", AbstractC15820qc.A06());
                A002.AAP("network_connection_type", AbstractC15780qY.A00(A04.A01));
                A002.AAP("reel_module_source", moduleName);
                A002.AAP("reel_id", str5);
                A002.AAP("reel_video_uri", str4);
                String str6 = session.userId;
                C14360o3.A0B(str6, 0);
                A002.A9K(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC003100w.A0k(10, str6));
                A002.Cht();
                AbstractC140696Xx.A00(reelViewerFragment.getSession()).A0A(c41181vS3, C05F.A0N);
            }
        }
    }

    @Override // X.C4QV
    public final void DVN(byte[] bArr, long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (A0G() == false) goto L10;
     */
    @Override // X.C4QV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void DaX(X.InterfaceC95344Qu r9, long r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            X.4Qu r0 = r8.A0M     // Catch: java.lang.Throwable -> L5f
            if (r0 != r9) goto L5d
            if (r0 == 0) goto L20
            boolean r0 = r0.FE0()     // Catch: java.lang.Throwable -> L5f
            r8.A0h = r0     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L16
            boolean r1 = r8.A0G()     // Catch: java.lang.Throwable -> L5f
            r0 = 1
            if (r1 != 0) goto L17
        L16:
            r0 = 0
        L17:
            r8.A1G = r0     // Catch: java.lang.Throwable -> L5f
            X.4Rx r1 = r8.A0y     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r8.A1G     // Catch: java.lang.Throwable -> L5f
            r1.A04(r0)     // Catch: java.lang.Throwable -> L5f
        L20:
            X.1yB r0 = X.C42831yB.A00()     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r0.A02     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L5a
            X.1vS r1 = r8.A0L     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L5a
            com.instagram.common.session.UserSession r0 = r8.A0t     // Catch: java.lang.Throwable -> L5f
            X.3a3 r2 = r1.A0M(r0)     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L5a
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5f
            long r0 = r8.A0F     // Catch: java.lang.Throwable -> L5f
            long r6 = r6 - r0
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5a
            X.1yB r0 = X.C42831yB.A00()     // Catch: java.lang.Throwable -> L5f
            int r0 = r0.A01(r2)     // Catch: java.lang.Throwable -> L5f
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L5f
            long r2 = r2 - r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5a
            android.os.Handler r1 = r8.A0s     // Catch: java.lang.Throwable -> L5f
            X.AtK r0 = new X.AtK     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L5f
            r1.postDelayed(r0, r2)     // Catch: java.lang.Throwable -> L5f
            goto L5d
        L5a:
            A0A(r8)     // Catch: java.lang.Throwable -> L5f
        L5d:
            monitor-exit(r8)
            return
        L5f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC147506ka.DaX(X.4Qu, long):void");
    }

    @Override // X.C4QV
    public final synchronized void DaZ(InterfaceC95344Qu interfaceC95344Qu) {
        if (this.A0M == interfaceC95344Qu) {
            this.A0u.EIi(A04(this), this.A0L, getCurrentPositionMs());
        }
    }

    @Override // X.C4QV
    public final synchronized void Dk0(InterfaceC95344Qu interfaceC95344Qu, long j) {
        this.A01 = ((float) j) / this.A03;
    }

    @Override // X.C4QV
    public final void DzK(long j, String str) {
    }

    @Override // X.C4QZ
    public final synchronized void E0L() {
        C95304Qq c95304Qq = this.A10.A01;
        if (this.A0L != null && CFA() != null) {
            this.A11.A02(c95304Qq, false);
        }
    }

    @Override // X.InterfaceC147516kc
    public final synchronized void E3d(String str) {
        if (!this.A0X) {
            this.A0g = false;
            Handler handler = this.A0s;
            handler.removeCallbacksAndMessages(null);
            this.A0e = false;
            InterfaceC143586dx interfaceC143586dx = this.A0O;
            if (interfaceC143586dx != null) {
                interfaceC143586dx.Egt(8);
            }
            InterfaceC95344Qu interfaceC95344Qu = this.A0M;
            if (interfaceC95344Qu != null && (((C95334Qt) interfaceC95344Qu).A09.A0I.A0J() || this.A0V)) {
                this.A0X = true;
                C3Q0 c3q0 = C3Q0.PAUSED;
                C121595fA c121595fA = this.A12;
                if (c121595fA != null) {
                    c121595fA.A00 = c3q0;
                }
                this.A0i = System.currentTimeMillis();
                int currentPositionMs = getCurrentPositionMs();
                int A00 = A00();
                if (((C95334Qt) this.A0M).A09.A0I.A0J()) {
                    this.A0M.pause();
                }
                InterfaceC95254Ql interfaceC95254Ql = this.A0u;
                interfaceC95254Ql.EIf(this.A0L, this.A0M.Be0());
                A09(this.A0H, this.A0L, A03(currentPositionMs, A00, this.A0C, this.A04), str);
                interfaceC95254Ql.EIg(this.A0L);
                Runnable runnable = this.A1D;
                if (runnable != null && this.A0S) {
                    handler.removeCallbacks(runnable);
                }
            }
            this.A1B.A03(this);
            this.A0b = false;
        }
    }

    @Override // X.InterfaceC147516kc
    public final synchronized void F92(String str) {
        boolean z;
        ViewGroup viewGroup;
        this.A0T = false;
        InterfaceC143586dx interfaceC143586dx = this.A0O;
        if (interfaceC143586dx != null) {
            interfaceC143586dx.Egt(8);
            this.A0O.D0K(false);
            if (this.A0O.C6w() != null) {
                ((MultiListenerTextureView) this.A0O.C6w()).A00.A00.remove(this);
                ScalingTextureView C6w = this.A0O.C6w();
                C6w.A02 = 0;
                C6w.A01 = 0;
                ScalingTextureView.A00(C6w);
            }
        }
        InterfaceC95344Qu interfaceC95344Qu = this.A0M;
        if (interfaceC95344Qu != null) {
            interfaceC95344Qu.AP9(this.A0G);
            this.A0u.EIf(this.A0L, this.A0M.Be0());
        }
        C66354UBs c66354UBs = this.A0N;
        if (c66354UBs != null && (viewGroup = (ViewGroup) c66354UBs.getParent()) != null) {
            viewGroup.removeView(this.A0N);
        }
        InterfaceC95344Qu interfaceC95344Qu2 = this.A0M;
        if (interfaceC95344Qu2 != null) {
            if (!this.A0a) {
                C95334Qt c95334Qt = (C95334Qt) interfaceC95344Qu2;
                c95334Qt.A09.A0E(new RunnableC131535wp(c95334Qt, new Runnable() { // from class: X.6Os
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                }));
            }
            z = true;
        } else {
            z = false;
        }
        E3d(str);
        this.A0P = C05F.A00;
        if (this.A0M != null) {
            this.A0E = 0L;
        }
        C3Q0 c3q0 = C3Q0.STOPPING;
        C121595fA c121595fA = this.A12;
        if (c121595fA != null) {
            c121595fA.A00 = c3q0;
        }
        A0E(this, z);
        if (this.A0L != null) {
            UserSession userSession = this.A0t;
            if (C18U.A06(C06090Tz.A05, userSession, 36320756010853235L)) {
                AbstractC46782Cq.A00(userSession).A00(this.A0L.A0j);
            } else {
                AbstractC54278Nyy.A00(userSession).A00(this.A0L.A0j);
            }
        }
        Runnable runnable = this.A1D;
        if (runnable != null) {
            this.A0s.removeCallbacks(runnable);
        }
        if (this.A0f) {
            C95294Qp c95294Qp = this.A10;
            c95294Qp.A07.remove(this);
            C95294Qp.A0D.removeCallbacks(c95294Qp.A06);
            c95294Qp.A01 = new C95304Qq(-2);
        }
        AbstractC41221vX.A00().A0A.remove(this);
        this.A01 = 0.0f;
        this.A03 = -1;
        this.A07 = 0;
        this.A06 = -1;
        this.A0O = null;
        this.A0L = null;
        this.A02 = -1;
        this.A0U = false;
        this.A05 = 0;
        this.A0n = false;
        this.A1H = false;
        this.A0i = 0L;
        this.A09 = 0;
        this.A0h = false;
        this.A1G = false;
        this.A0d = false;
        this.A0b = false;
        this.A08 = 0;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        float f;
        if (i == -2) {
            A08(0.0f, -8);
            return;
        }
        if (i == -3) {
            f = 0.5f;
        } else {
            if (i != 1 && i != 2 && i != 4 && i != 3) {
                if (i != -1) {
                    return;
                }
                A08(0.0f, -8);
                this.A1B.A03(this);
                return;
            }
            f = 1.0f;
        }
        A08(f, -8);
    }

    private int A00() {
        InterfaceC95344Qu interfaceC95344Qu;
        C41181vS c41181vS = this.A0L;
        if (c41181vS != null && c41181vS.A18() && (interfaceC95344Qu = this.A0M) != null) {
            return interfaceC95344Qu.getCurrentPosition();
        }
        return -1;
    }

    public static int A01(TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka, boolean z) {
        InterfaceC95344Qu interfaceC95344Qu;
        EnumC41231vY enumC41231vY;
        C41181vS c41181vS = textureViewSurfaceTextureListenerC147506ka.A0L;
        if (c41181vS != null && (interfaceC95344Qu = textureViewSurfaceTextureListenerC147506ka.A0M) != null) {
            if (!c41181vS.A18() && (enumC41231vY = c41181vS.A0e) != EnumC41231vY.A04) {
                C0w9.A03("ReelVideoPlayer#getBroadcastPositionMs", AnonymousClass001.A0g("mCurrentItem type: ", enumC41231vY.name(), " is not live-related"));
            } else {
                if (z) {
                    return (int) ((C95334Qt) interfaceC95344Qu).A09.A0I.A06();
                }
                return interfaceC95344Qu.getCurrentPosition();
            }
        }
        return -1;
    }

    private C4SG A03(int i, int i2, int i3, int i4) {
        Integer num;
        int i5;
        int i6;
        String Be2;
        String str = null;
        if (this.A0f) {
            num = Integer.valueOf(this.A10.A01.A00);
        } else {
            num = null;
        }
        int i7 = this.A02;
        int i8 = this.A07;
        int i9 = this.A06;
        int i10 = this.A03;
        InterfaceC95344Qu interfaceC95344Qu = this.A0M;
        if (interfaceC95344Qu == null) {
            i5 = 0;
        } else {
            i5 = (int) (((C95334Qt) interfaceC95344Qu).A0q / 1000);
        }
        InterfaceC95344Qu interfaceC95344Qu2 = this.A0M;
        if (interfaceC95344Qu2 == null) {
            i6 = 0;
        } else {
            C98704bq c98704bq = ((C95334Qt) interfaceC95344Qu2).A0E;
            if (c98704bq != null) {
                i6 = c98704bq.A02;
            } else {
                i6 = 0;
            }
        }
        boolean z = this.A0Z;
        boolean z2 = this.A1G;
        int i11 = this.A08;
        int i12 = this.A09;
        InterfaceC95344Qu interfaceC95344Qu3 = this.A0M;
        if (interfaceC95344Qu3 == null) {
            Be2 = "";
        } else {
            Be2 = interfaceC95344Qu3.Be2();
        }
        InterfaceC95344Qu interfaceC95344Qu4 = this.A0M;
        if (interfaceC95344Qu4 != null) {
            C4SS c4ss = ((C95334Qt) interfaceC95344Qu4).A09.A08;
            if (c4ss != null) {
                str = c4ss.A07;
            } else {
                str = null;
            }
        }
        return new C4SG(false, null, null, num, Be2, str, A05(this), null, null, null, this.A00, i7, i, i8, i2, i9, i10, i3, i4, i5, i6, i11, i12, z, z2, this.A0b, true);
    }

    public static String A05(TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka) {
        String str;
        C41181vS c41181vS = textureViewSurfaceTextureListenerC147506ka.A0L;
        if (c41181vS != null) {
            if (c41181vS.A18()) {
                str = "live_";
            } else if (c41181vS.A0f != null) {
                str = "stories_ad4ad";
            }
            return AnonymousClass001.A0R(str, textureViewSurfaceTextureListenerC147506ka.A1C.A00);
        }
        str = "reel_";
        return AnonymousClass001.A0R(str, textureViewSurfaceTextureListenerC147506ka.A1C.A00);
    }

    private void A07() {
        C41181vS c41181vS = this.A0L;
        if (c41181vS != null && !this.A0e && !this.A0X) {
            this.A0e = true;
            String str = c41181vS.A0j;
            if (!AbstractC50102Ry.A00(this.A0R, str) && !this.A0g) {
                this.A0g = true;
                this.A0s.postDelayed(new JZN(this, str), 3000L);
            }
            Handler handler = this.A0s;
            handler.sendMessageDelayed(Message.obtain(handler, 1, this.A0L.A0j), this.A0p);
        }
    }

    private void A08(float f, int i) {
        if (this.A0M != null) {
            C4SG A02 = A02(getCurrentPositionMs());
            this.A0y.A02(f, i);
            this.A0u.EIX(A02, this.A0L, i, false);
            this.A00 = f;
            this.A0M.EhH(f);
        }
    }

    private void A09(C95744Si c95744Si, C41181vS c41181vS, C4SG c4sg, String str) {
        if (c41181vS != null) {
            String str2 = null;
            if (c95744Si != null) {
                ArrayList arrayList = new ArrayList();
                c95744Si.A00.drainTo(arrayList);
                str2 = C95744Si.A00(arrayList);
            }
            this.A0u.EIh(c4sg, c41181vS, "autoplay", str, str2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r5.A0j == r1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0A(final X.TextureViewSurfaceTextureListenerC147506ka r5) {
        /*
            X.3Q0 r1 = X.C3Q0.PREPARED
            X.5fA r0 = r5.A12
            if (r0 == 0) goto L8
            r0.A00 = r1
        L8:
            X.1vS r0 = r5.A0L
            r4 = 0
            if (r0 == 0) goto L38
            com.instagram.common.session.UserSession r3 = r5.A0t
            X.6Xy r1 = X.AbstractC140696Xx.A00(r3)
            X.1vS r0 = r5.A0L
            X.C14360o3.A0B(r0, r4)
            r1.A0D(r0, r4)
            X.4Bx r0 = r5.A0J
            X.4Bx r1 = X.EnumC92424Bx.CACHED
            if (r0 == r1) goto L26
            X.4Bx r0 = r5.A0j
            r2 = 0
            if (r0 != r1) goto L27
        L26:
            r2 = 1
        L27:
            X.1vS r1 = r5.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A0G = r0
            X.6Xy r1 = X.AbstractC140696Xx.A00(r3)
            X.1vS r0 = r5.A0L
            r1.A0B(r0, r2)
        L38:
            r5.A0V = r4
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r5.A0F
            long r2 = r2 - r0
            X.9JW r1 = new X.9JW
            r1.<init>()
            r5.A0k = r1
            boolean r0 = r5.A0X
            if (r0 != 0) goto L52
            r1.run()
            r0 = 0
            r5.A0k = r0
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC147506ka.A0A(X.6ka):void");
    }

    public static void A0B(TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka, int i) {
        int i2;
        if (textureViewSurfaceTextureListenerC147506ka.A0M != null) {
            boolean z = !textureViewSurfaceTextureListenerC147506ka.A0X;
            boolean z2 = textureViewSurfaceTextureListenerC147506ka.A0l;
            if (z2 && z) {
                textureViewSurfaceTextureListenerC147506ka.E3d("seek");
            }
            i2 = textureViewSurfaceTextureListenerC147506ka.A0M.getCurrentPosition();
            textureViewSurfaceTextureListenerC147506ka.A0M.seekTo(i);
            if (z2 && z) {
                textureViewSurfaceTextureListenerC147506ka.EKe("resume", true);
            }
        } else {
            i2 = 0;
        }
        textureViewSurfaceTextureListenerC147506ka.A01 = i / textureViewSurfaceTextureListenerC147506ka.A03;
        C4SG A02 = textureViewSurfaceTextureListenerC147506ka.A02(i2);
        textureViewSurfaceTextureListenerC147506ka.A0u.EIk(A02, textureViewSurfaceTextureListenerC147506ka.A0L, i);
        if (!textureViewSurfaceTextureListenerC147506ka.A0X && !textureViewSurfaceTextureListenerC147506ka.A0l) {
            textureViewSurfaceTextureListenerC147506ka.A09(textureViewSurfaceTextureListenerC147506ka.A0H, textureViewSurfaceTextureListenerC147506ka.A0L, A02, "seek");
        }
        if (!textureViewSurfaceTextureListenerC147506ka.A1F || textureViewSurfaceTextureListenerC147506ka.A1E) {
            textureViewSurfaceTextureListenerC147506ka.A07 = i;
        }
    }

    public static void A0C(TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka, int i, int i2, int i3) {
        C41181vS c41181vS = textureViewSurfaceTextureListenerC147506ka.A0L;
        if (c41181vS != null) {
            textureViewSurfaceTextureListenerC147506ka.A13.A0R(c41181vS, i, i2);
        }
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        AbstractC24321Hb.A00(textureViewSurfaceTextureListenerC147506ka.A0t).A00(z);
        if (textureViewSurfaceTextureListenerC147506ka.A0M != null && textureViewSurfaceTextureListenerC147506ka.A0Z != textureViewSurfaceTextureListenerC147506ka.A0G()) {
            textureViewSurfaceTextureListenerC147506ka.A0F(textureViewSurfaceTextureListenerC147506ka.A0G(), i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r14.A05 <= 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0D(X.TextureViewSurfaceTextureListenerC147506ka r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC147506ka.A0D(X.6ka, java.lang.String, boolean, boolean):void");
    }

    public static void A0E(TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka, boolean z) {
        textureViewSurfaceTextureListenerC147506ka.A0s.removeCallbacksAndMessages(null);
        InterfaceC95344Qu interfaceC95344Qu = textureViewSurfaceTextureListenerC147506ka.A0M;
        if (interfaceC95344Qu != null) {
            interfaceC95344Qu.EE5(z);
            ((C95334Qt) interfaceC95344Qu).A0M = null;
            textureViewSurfaceTextureListenerC147506ka.A0M = null;
        }
        if (textureViewSurfaceTextureListenerC147506ka.A0k != null) {
            textureViewSurfaceTextureListenerC147506ka.A0V = false;
            textureViewSurfaceTextureListenerC147506ka.A0k = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r13 != r6.A2X) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0F(boolean r13, int r14) {
        /*
            r12 = this;
            r12.A0Z = r13
            if (r13 == 0) goto L8c
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.A08(r0, r14)
            X.1vI r0 = r12.A1B
            r0.A04(r12)
        Le:
            int r7 = r12.getCurrentPositionMs()
            X.1vS r1 = r12.A0L
            if (r1 == 0) goto L6e
            instagram.features.stories.fragment.ReelViewerFragment r6 = r12.A13
            X.5Gn r0 = r6.A1C
            X.6iL r0 = (X.C146226iL) r0
            X.6iR r0 = r0.A0C
            X.6ac r5 = r0.C00(r1)
            r5.A0v = r13
            com.instagram.common.session.UserSession r0 = r6.getSession()
            X.6PF r11 = X.C6PE.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.getSession()
            java.lang.Integer r10 = X.C6P0.A00(r0, r1)
            com.instagram.common.session.UserSession r3 = r11.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321885587253117(0x810a900000277d, double:3.0334449296482126E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L6a
            java.util.Map r9 = r11.A02
            java.lang.String r8 = "TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON"
            java.lang.Object r0 = r9.get(r8)
            X.6Pp r0 = (X.C138596Pp) r0
            if (r0 == 0) goto L6a
            long r3 = r0.A00
            X.C6PF.A00(r11, r10, r3)
            if (r13 != 0) goto L7f
            if (r10 != 0) goto L7f
            X.1QT r0 = r11.A00
            X.AHF r2 = new X.AHF
            r2.<init>(r0)
            r2.A01 = r3
            r1 = 0
            java.lang.String r0 = "audio state did not match"
            r2.A06(r0, r1)
        L67:
            r9.remove(r8)
        L6a:
            if (r7 != 0) goto L72
            r6.A2X = r13
        L6e:
            r12.A02(r7)
            return
        L72:
            boolean r0 = r5.A19
            if (r0 != 0) goto L7b
            boolean r1 = r6.A2X
            r0 = 0
            if (r13 == r1) goto L7c
        L7b:
            r0 = 1
        L7c:
            r5.A19 = r0
            goto L6e
        L7f:
            X.1QT r1 = r11.A00
            X.AHF r0 = new X.AHF
            r0.<init>(r1)
            r0.A01 = r3
            r0.A02()
            goto L67
        L8c:
            r0 = 0
            r12.A08(r0, r14)
            X.1vI r0 = r12.A1B
            r0.A03(r12)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC147506ka.A0F(boolean, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0G() {
        /*
            r3 = this;
            X.1vS r1 = r3.A0L
            r2 = 1
            if (r1 == 0) goto Le
            com.instagram.common.session.UserSession r0 = r3.A0t
            boolean r0 = X.C6P0.A01(r0, r1)
            r1 = 1
            if (r0 != 0) goto Lf
        Le:
            r1 = 0
        Lf:
            boolean r0 = r3.CeA()
            if (r0 == 0) goto L18
            if (r1 != 0) goto L18
            return r2
        L18:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC147506ka.A0G():boolean");
    }

    @Override // X.InterfaceC95154Qb
    public final /* bridge */ /* synthetic */ Object Be1() {
        C41181vS c41181vS = this.A0L;
        if (c41181vS == null) {
            return null;
        }
        return c41181vS.A0b;
    }

    @Override // X.InterfaceC95164Qc
    public final String CFA() {
        C41181vS c41181vS = this.A0L;
        if (c41181vS != null) {
            UserSession userSession = this.A0t;
            if (c41181vS.A0M(userSession) != null) {
                return this.A0L.A0M(userSession).A0G;
            }
            return null;
        }
        return null;
    }

    @Override // X.C4QZ
    public final String CFS() {
        return this.A1C.A00;
    }

    @Override // X.InterfaceC147516kc
    public final boolean CQo(C41181vS c41181vS, InterfaceC143586dx interfaceC143586dx) {
        if (this.A0T && interfaceC143586dx == this.A0O && c41181vS != null && c41181vS.equals(this.A0L)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC95164Qc
    public final boolean CdZ() {
        C41181vS c41181vS = this.A0L;
        if (c41181vS != null && c41181vS.CdW()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC147516kc
    public final boolean CeA() {
        if (this.A0r != null) {
            UserSession userSession = this.A0t;
            boolean z = this.A15.get();
            C14360o3.A0B(userSession, 0);
            if (C4AJ.A00(userSession, null, z, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C4QV
    public final void CuH(C121955fn c121955fn) {
        this.A0u.EHH(c121955fn);
    }

    @Override // X.C4QV
    public final void D0Y(InterfaceC95344Qu interfaceC95344Qu, int i) {
        if (interfaceC95344Qu.equals(this.A0M)) {
            this.A0U = false;
            C41181vS c41181vS = this.A0L;
            if (c41181vS != null && c41181vS.A18()) {
                A07();
            }
            this.A0u.EIY(A04(this), this.A0L, i);
        }
        this.A0b = false;
    }

    @Override // X.C4QV
    public final void D0Z(InterfaceC95344Qu interfaceC95344Qu) {
        if (interfaceC95344Qu.equals(this.A0M)) {
            this.A0U = true;
            C41181vS c41181vS = this.A0L;
            if (c41181vS != null && c41181vS.A18()) {
                this.A0g = false;
                this.A0s.removeCallbacksAndMessages(null);
                this.A0e = false;
            }
            InterfaceC95254Ql interfaceC95254Ql = this.A0u;
            C41181vS c41181vS2 = this.A0L;
            C4SG A04 = A04(this);
            InterfaceC95344Qu interfaceC95344Qu2 = this.A0M;
            interfaceC95344Qu2.getClass();
            interfaceC95254Ql.EIZ(A04, c41181vS2, interfaceC95344Qu2.BEF());
        }
    }

    @Override // X.C4QV
    public final synchronized void D8s(InterfaceC95344Qu interfaceC95344Qu, List list) {
        InterfaceC143586dx interfaceC143586dx;
        C86013sY BRe;
        boolean z;
        final C38321qM c38321qM;
        if (interfaceC95344Qu.equals(this.A0M) && (interfaceC143586dx = this.A0O) != null && (BRe = interfaceC143586dx.BRe()) != null) {
            C41181vS c41181vS = this.A0L;
            String str = null;
            if (c41181vS != null && (c38321qM = c41181vS.A0b) != null) {
                UserSession userSession = this.A0t;
                Boolean valueOf = Boolean.valueOf(this.A0Z);
                boolean CdW = c38321qM.CdW();
                boolean Cff = c38321qM.Cff();
                boolean A5A = c38321qM.A5A();
                boolean A4T = c38321qM.A4T();
                List CAf = c38321qM.A0C.CAf();
                C75363a3 CFR = c38321qM.CFR();
                if (c38321qM.A0C.CDj() != null) {
                    str = c38321qM.A0C.CDj().getId();
                }
                boolean A09 = AbstractC75343a1.A09(userSession, CFR, valueOf, str, c38321qM.A0C.CFX(), CAf, false, CdW, Cff, A5A, A4T);
                z = true;
                if (A09) {
                    if (AbstractC75343a1.A0B(c38321qM) && !list.isEmpty() && !this.A0m) {
                        String A0g = AnonymousClass001.A0g("[", this.A0q.getString(2131954803), "]");
                        this.A0m = true;
                        list.add(0, A0g);
                        final InterfaceC60442pS interfaceC60442pS = this.A0K;
                        if (interfaceC60442pS != null) {
                            this.A1A.post(new Runnable() { // from class: X.Ayb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka = this;
                                    AbstractC75343a1.A02(textureViewSurfaceTextureListenerC147506ka.A0t, c38321qM, interfaceC60442pS);
                                }
                            });
                        }
                    }
                    AbstractC86533tR.A02(BRe, list, z);
                }
            }
            z = false;
            AbstractC86533tR.A02(BRe, list, z);
        }
    }

    @Override // X.C4QV
    public final void DQs(InterfaceC95344Qu interfaceC95344Qu) {
        InterfaceC95344Qu interfaceC95344Qu2;
        int i = this.A08 + 1;
        this.A08 = i;
        C41181vS c41181vS = this.A0L;
        if (c41181vS != null) {
            this.A0b = true;
            ReelViewerFragment reelViewerFragment = this.A13;
            if (reelViewerFragment.mShortVideoDTDController != null) {
                C141596ac C00 = ((C146226iL) reelViewerFragment.A1C).A0C.C00(c41181vS);
                C00.A0E = i;
                C148746mj c148746mj = reelViewerFragment.mShortVideoDTDController;
                if (i == C00.A0H && (interfaceC95344Qu2 = ((TextureViewSurfaceTextureListenerC147506ka) c148746mj.A01).A0M) != null) {
                    interfaceC95344Qu2.EYb(false);
                }
            }
            this.A0u.EId(A04(this), this.A0L, "autoplay");
        }
    }

    @Override // X.C4QV
    public final void DRP(C53302cE c53302cE) {
        this.A0u.EHp(c53302cE);
    }

    @Override // X.C4QV
    public final void Dz4(EnumC92424Bx enumC92424Bx, InterfaceC95344Qu interfaceC95344Qu) {
        if (this.A0L != null) {
            boolean z = false;
            if (enumC92424Bx == EnumC92424Bx.CACHED) {
                z = true;
            }
            this.A1H = z;
            this.A0u.EIc(this.A0L, z);
        }
    }

    @Override // X.C4QV
    public final void Dz5(EnumC92424Bx enumC92424Bx, InterfaceC95344Qu interfaceC95344Qu, long j) {
        if (this.A0L != null && this.A0J == EnumC92424Bx.NOT_APPLY) {
            this.A0J = enumC92424Bx;
            this.A0w.A02(enumC92424Bx);
            this.A0u.EHb(enumC92424Bx, this.A0L);
        }
    }

    @Override // X.C4QV
    public final void DzA(EnumC92424Bx enumC92424Bx, InterfaceC95344Qu interfaceC95344Qu) {
        C41181vS c41181vS = this.A0L;
        if (c41181vS != null) {
            this.A0j = enumC92424Bx;
            this.A0u.EHk(enumC92424Bx, c41181vS);
        }
    }

    @Override // X.C4QV
    public final void Dzw(InterfaceC95344Qu interfaceC95344Qu, float f, int i, int i2) {
        InterfaceC143586dx interfaceC143586dx = this.A0O;
        if (interfaceC143586dx != null) {
            if (interfaceC143586dx.C6w() != null) {
                ScalingTextureView C6w = this.A0O.C6w();
                C6w.A02 = i;
                C6w.A01 = i2;
                ScalingTextureView.A00(C6w);
            }
            this.A0C = i;
            this.A04 = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r15.A0h != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r15.A0h != false) goto L31;
     */
    @Override // X.C4QV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E05(long r16) {
        /*
            r15 = this;
            X.4Qu r0 = r15.A0M
            if (r0 == 0) goto L25
            X.6dx r0 = r15.A0O
            if (r0 == 0) goto Le
            com.instagram.ui.widget.textureview.ScalingTextureView r0 = r0.C6w()
            if (r0 == 0) goto L25
        Le:
            java.lang.Runnable r3 = r15.A1D
            if (r3 == 0) goto L25
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.A14
            boolean r0 = r0.get()
            if (r0 != 0) goto L25
            boolean r0 = r15.A0S
            if (r0 == 0) goto L25
            android.os.Handler r2 = r15.A0s
            long r0 = r15.A19
            r2.postDelayed(r3, r0)
        L25:
            r0 = r16
            int r4 = (int) r0
            X.4SG r3 = r15.A02(r4)
            X.4Rx r2 = r15.A0y
            java.util.concurrent.atomic.AtomicReference r1 = r2.A01
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.set(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A00
            r5 = 0
            r0.set(r5)
            float r0 = r15.A00
            r2.A02(r0, r5)
            X.4Ql r6 = r15.A0u
            X.1vS r0 = r15.A0L
            r1 = 1
            r6.EIX(r3, r0, r5, r1)
            boolean r0 = r15.A1F
            if (r0 == 0) goto L51
            r15.A07 = r4
        L51:
            X.4Ry r3 = r15.A0w
            boolean r4 = r15.A18
            if (r4 == 0) goto Lac
            X.4Bx r2 = r15.A0J
            X.4Bx r0 = X.EnumC92424Bx.CACHED
            if (r2 == r0) goto L61
        L5d:
            boolean r0 = r15.A0h
            if (r0 == 0) goto L62
        L61:
            r5 = 1
        L62:
            boolean r0 = r15.A0h
            r3.A03(r5, r0)
            long r10 = android.os.SystemClock.elapsedRealtime()
            long r2 = r15.A0F
            long r10 = r10 - r2
            X.1vS r8 = r15.A0L
            r12 = 0
            if (r4 == 0) goto La7
            X.4Bx r2 = r15.A0J
            X.4Bx r0 = X.EnumC92424Bx.CACHED
            if (r2 == r0) goto L7d
        L79:
            boolean r0 = r15.A0h
            if (r0 == 0) goto L7e
        L7d:
            r12 = 1
        L7e:
            boolean r13 = r15.A0h
            java.lang.String r9 = r15.A0Q
            X.4SG r7 = A04(r15)
            boolean r14 = r15.A0W
            r6.EIm(r7, r8, r9, r10, r12, r13, r14)
            boolean r0 = r15.A0f
            if (r0 == 0) goto La2
            X.4Qp r0 = r15.A10
            X.4Qq r2 = r0.A01
            X.1vS r0 = r15.A0L
            if (r0 == 0) goto La2
            java.lang.String r0 = r15.CFA()
            if (r0 == 0) goto La2
            X.4Rw r0 = r15.A11
            r0.A02(r2, r1)
        La2:
            java.lang.String r0 = ""
            r15.A0Q = r0
            return
        La7:
            boolean r0 = r15.A1H
            if (r0 != 0) goto L7d
            goto L79
        Lac:
            boolean r0 = r15.A1H
            if (r0 != 0) goto L61
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC147506ka.E05(long):void");
    }

    @Override // X.C4QV
    public final void E1l(InterfaceC95344Qu interfaceC95344Qu, String str, String str2, String str3) {
        if (this.A0M == interfaceC95344Qu && this.A13 != null) {
            this.A0u.EIs(this.A0L, str, str2, str3);
        }
    }

    @Override // X.InterfaceC147516kc
    public final synchronized void EKe(String str, boolean z) {
        if (this.A0T && this.A0X) {
            this.A0X = false;
            C3Q0 c3q0 = C3Q0.PLAYING;
            C121595fA c121595fA = this.A12;
            if (c121595fA != null) {
                c121595fA.A00 = c3q0;
            }
            long j = this.A0i;
            if (j > 0) {
                this.A0E += System.currentTimeMillis() - j;
            }
            Runnable runnable = this.A0k;
            if (runnable != null) {
                runnable.run();
                this.A0k = null;
            } else if (!this.A0V) {
                this.A0u.EIj(A04(this), this.A0L, "resume");
                A0D(this, "resume", true, z);
            }
        }
    }

    @Override // X.InterfaceC147516kc
    public final void EMd(int i) {
        C41181vS c41181vS;
        if (this.A03 > 0 && (c41181vS = this.A0L) != null && this.A0M != null) {
            C18C.A0E(!c41181vS.A18());
            A0B(this, AbstractC13600mm.A03(this.A0M.getCurrentPosition() + i, 0, this.A03));
        }
    }

    @Override // X.InterfaceC147516kc, X.InterfaceC95164Qc
    public final int getCurrentPositionMs() {
        InterfaceC95344Qu interfaceC95344Qu;
        C41181vS c41181vS = this.A0L;
        if (c41181vS != null && (interfaceC95344Qu = this.A0M) != null) {
            if (c41181vS.A18()) {
                return (int) ((C95334Qt) interfaceC95344Qu).A09.A0I.A08();
            }
            return interfaceC95344Qu.getCurrentPosition();
        }
        return 0;
    }

    @Override // X.InterfaceC147516kc, android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            if (i == 25 || i == 24) {
                final int i3 = -1;
                if (i == 24) {
                    i3 = 1;
                }
                final AudioManager audioManager = this.A0r;
                if (audioManager != null) {
                    this.A1A.post(new Runnable() { // from class: X.PRr
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                audioManager.adjustStreamVolume(3, i3, 0);
                            } catch (Exception e) {
                                C0w9.A06("REEL_VIDEO_PLAYER_FAILED_TO_ADJUST_VOLUME", "Failed to adjust volume", e);
                            }
                        }
                    });
                }
                this.A15.set(true);
                int i4 = 0;
                if (audioManager != null) {
                    i2 = audioManager.getStreamVolume(3);
                    i4 = audioManager.getStreamMaxVolume(3);
                } else {
                    i2 = 0;
                }
                if (!this.A0Z && i2 > 0 && this.A0L != null) {
                    C6PF A00 = C6PE.A00(this.A0t);
                    if (C18U.A06(C06090Tz.A05, A00.A01, 36321885587253117L)) {
                        Map map = A00.A02;
                        if (!map.containsKey("TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON")) {
                            map.put("TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON", new C138596Pp(A00.A00.A00(C05F.A1F, "TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON", "stories_viewer"), "TOGGLE_STORY_SOUND_FROM_VOLUME_BUTTON", false));
                        }
                    }
                }
                A0C(this, i2, i4, i);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.A0P = C05F.A01;
        InterfaceC95344Qu interfaceC95344Qu = this.A0M;
        if (interfaceC95344Qu != null) {
            interfaceC95344Qu.setSurface(new Surface(surfaceTexture));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        final SurfaceTexture surfaceTexture2;
        InterfaceC143586dx interfaceC143586dx = this.A0O;
        if (interfaceC143586dx == null) {
            return true;
        }
        ScalingTextureView C6w = interfaceC143586dx.C6w();
        if (C6w != null) {
            ((MultiListenerTextureView) C6w).A00.A00.remove(this);
        }
        if (this.A0M == null) {
            return true;
        }
        if (C6w != null) {
            surfaceTexture2 = C6w.getSurfaceTexture();
        } else {
            surfaceTexture2 = null;
        }
        C95334Qt c95334Qt = (C95334Qt) this.A0M;
        c95334Qt.A09.A0E(new RunnableC131535wp(c95334Qt, new Runnable() { // from class: X.6R7
            @Override // java.lang.Runnable
            public final void run() {
                TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka = this;
                SurfaceTexture surfaceTexture3 = surfaceTexture2;
                if (surfaceTexture3 != null) {
                    surfaceTexture3.release();
                }
                InterfaceC143586dx interfaceC143586dx2 = textureViewSurfaceTextureListenerC147506ka.A0O;
                if (interfaceC143586dx2 != null) {
                    interfaceC143586dx2.onSurfaceTextureDestroyed();
                }
            }
        }));
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.4Ru] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.4Ry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.4Rz] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.4Qi] */
    public TextureViewSurfaceTextureListenerC147506ka(Context context, UserSession userSession, C3G2 c3g2, C30P c30p, ReelViewerFragment reelViewerFragment) {
        this.A0l = false;
        this.A0S = false;
        this.A0f = false;
        final Looper mainLooper = Looper.getMainLooper();
        this.A0s = new Handler(mainLooper) { // from class: X.6ke
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
            
                if (r3 > r1) goto L38;
             */
            @Override // android.os.Handler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void handleMessage(android.os.Message r15) {
                /*
                    Method dump skipped, instructions count: 235
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.HandlerC147536ke.handleMessage(android.os.Message):void");
            }
        };
        this.A03 = -1;
        this.A06 = -1;
        this.A02 = -1;
        EnumC92424Bx enumC92424Bx = EnumC92424Bx.NOT_APPLY;
        this.A0j = enumC92424Bx;
        this.A0J = enumC92424Bx;
        this.A09 = 0;
        this.A0c = false;
        this.A0W = false;
        this.A0d = false;
        this.A0Q = "";
        this.A0q = context;
        this.A0t = userSession;
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A0r = audioManager;
        this.A0I = new Object();
        this.A1B = new C41101vI(audioManager, userSession);
        this.A13 = reelViewerFragment;
        this.A0u = AbstractC95234Qj.A00(context, this.A0I, userSession, c30p);
        this.A0v = c30p;
        this.A0K = c30p.A00;
        this.A1C = c3g2;
        this.A0p = 20000L;
        this.A0Z = A0G();
        this.A10 = new C95294Qp(context, userSession);
        this.A11 = new C95624Rw();
        this.A0z = new Object();
        this.A0w = new Object();
        this.A0x = new Object();
        this.A0y = new C95634Rx();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342154522461602345L)) {
            C37911pU A00 = AbstractC37901pT.A00(userSession);
            C121595fA c121595fA = new C121595fA(A00);
            A00.A02.add(new WeakReference(c121595fA));
            this.A12 = c121595fA;
        } else {
            this.A12 = null;
        }
        this.A0W = C18U.A06(c06090Tz, userSession, 36311204003578323L);
        this.A0S = C18U.A06(c06090Tz, userSession, 36311242658283994L);
        this.A0f = C18U.A06(c06090Tz, userSession, 36324741740573101L);
        this.A0l = C18U.A06(c06090Tz, userSession, 36314712991992600L);
        AbstractC41221vX.A00().A03 = new WeakReference(this);
        this.A19 = C18U.A01(c06090Tz, userSession, 36592717635060380L);
        this.A1D = new Runnable() { // from class: X.6kf
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC95344Qu interfaceC95344Qu;
                C41181vS c41181vS;
                C75363a3 A0M;
                TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka = TextureViewSurfaceTextureListenerC147506ka.this;
                if (!textureViewSurfaceTextureListenerC147506ka.A14.get() && (interfaceC95344Qu = textureViewSurfaceTextureListenerC147506ka.A0M) != null && ((C95334Qt) interfaceC95344Qu).A09.A0I.A0J() && textureViewSurfaceTextureListenerC147506ka.A0S && (c41181vS = textureViewSurfaceTextureListenerC147506ka.A0L) != null && (A0M = c41181vS.A0M(textureViewSurfaceTextureListenerC147506ka.A0t)) != null) {
                    textureViewSurfaceTextureListenerC147506ka.A0u.EHM(A0M);
                }
            }
        };
        this.A1F = C18U.A06(c06090Tz, userSession, 36314712991861527L);
        this.A17 = C18U.A06(c06090Tz, userSession, 36320111766085702L);
        this.A16 = C18U.A06(c06090Tz, userSession, 36328005915851816L);
        this.A1E = C18U.A06(c06090Tz, userSession, 36314712992123674L);
        this.A18 = C18U.A06(c06090Tz, userSession, 36318449613412502L);
        this.A1A = new Handler(C1CG.A00());
        if (C18U.A06(c06090Tz, userSession, 36315181144607835L)) {
            if (C4S0.A01 == null) {
                C4S0.A01 = (C4S2) userSession.A01(C4S2.class, new C57517Pfr(userSession, 38));
            }
            C57242jz A002 = AbstractC57232jy.A00(userSession);
            A002.A03.put(this, null);
            C57242jz.A03(A002);
        }
    }

    private C4SG A02(int i) {
        return A03(i, A00(), this.A0C, this.A04);
    }

    public static C4SG A04(TextureViewSurfaceTextureListenerC147506ka textureViewSurfaceTextureListenerC147506ka) {
        return textureViewSurfaceTextureListenerC147506ka.A03(textureViewSurfaceTextureListenerC147506ka.getCurrentPositionMs(), textureViewSurfaceTextureListenerC147506ka.A00(), textureViewSurfaceTextureListenerC147506ka.A0C, textureViewSurfaceTextureListenerC147506ka.A04);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06() {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC147506ka.A06():void");
    }

    @Override // X.InterfaceC95164Qc
    public final boolean CfM() {
        return CFf() instanceof TextureView;
    }

    @Override // X.C4QV
    public final void DrP() {
        A06();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    @Override // X.InterfaceC147516kc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E5l(X.C41181vS r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TextureViewSurfaceTextureListenerC147506ka.E5l(X.1vS, boolean):void");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        A06();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
