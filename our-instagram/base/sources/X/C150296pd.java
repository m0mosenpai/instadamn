package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* renamed from: X.6pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150296pd extends C4QU implements InterfaceC678133v, C30G {
    public float A00;
    public int A01;
    public C189908b9 A02;
    public MusicDataSource A03;
    public InterfaceC150336ph A04;
    public C95334Qt A05;
    public boolean A06;
    public int A07;
    public C30P A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final Handler A0C;
    public final UserSession A0D;
    public final InterfaceC60442pS A0E;
    public final C677933t A0F;
    public final Integer A0G;
    public final Context A0H;
    public final AudioManager.OnAudioFocusChangeListener A0I;
    public final C677733r A0J;
    public final Runnable A0K;
    public final InterfaceC08830cm A0L;
    public final boolean A0M;

    private final void A01(int i) {
        this.A09 = true;
        this.A0F.A03();
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackPrepared(i);
        }
        int i2 = this.A07;
        if (i2 != -1) {
            C95334Qt c95334Qt = this.A05;
            if (c95334Qt != null) {
                c95334Qt.seekTo(i2);
            }
            this.A07 = -1;
        }
        if (this.A0A) {
            A00();
            this.A0A = false;
        }
    }

    public static final void A02(C150296pd c150296pd) {
        C95334Qt c95334Qt;
        C677933t c677933t = c150296pd.A0F;
        if (c150296pd.A06 && ((c95334Qt = c150296pd.A05) == null || !c95334Qt.A09.A0I.A0J())) {
            c677933t.A01.A0D("pause_started", c677933t.A00, null, null, null, null);
        }
        C95334Qt c95334Qt2 = c150296pd.A05;
        if (c95334Qt2 != null) {
            c150296pd.A0A = false;
            if (c150296pd.A09) {
                c95334Qt2.pause();
            }
            c150296pd.A03(true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A03(boolean z) {
        C677733r c677733r;
        this.A06 = false;
        this.A0C.removeCallbacks(this.A0K);
        if (z && (c677733r = this.A0J) != null) {
            c677733r.A00();
        }
        this.A0F.A00();
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackStopped();
        }
    }

    @Override // X.InterfaceC678133v
    public final void AHi() {
        this.A03 = null;
    }

    @Override // X.InterfaceC678133v
    public final int Azm() {
        C95334Qt c95334Qt = this.A05;
        if (c95334Qt != null) {
            return (int) c95334Qt.A09.A0I.A09();
        }
        return -1;
    }

    @Override // X.C4QU, X.C4QV
    public final void D6i(InterfaceC95344Qu interfaceC95344Qu) {
        A03(true);
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackCompleted();
        }
    }

    @Override // X.C4QU, X.C4QV
    public final void DEE(InterfaceC95344Qu interfaceC95344Qu, String str, String str2, String str3) {
        C14360o3.A0B(str3, 3);
        this.A0F.A05(str3);
    }

    @Override // X.C4QU, X.C4QV
    public final void DaX(InterfaceC95344Qu interfaceC95344Qu, long j) {
        C14360o3.A0B(interfaceC95344Qu, 0);
        A01((int) ((C95334Qt) interfaceC95344Qu).A09.A0I.A09());
    }

    @Override // X.C4QU, X.C4QV
    public final void Dk0(InterfaceC95344Qu interfaceC95344Qu, long j) {
        this.A01 = -1;
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackSeekComplete();
        }
    }

    @Override // X.InterfaceC678133v
    public final int getCurrentPositionMs() {
        C95334Qt c95334Qt = this.A05;
        if (c95334Qt != null) {
            return c95334Qt.getCurrentPosition();
        }
        return -1;
    }

    @Override // X.C30G
    public final void onCompletion() {
        A03(true);
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackCompleted();
        }
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
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C30G
    public final void onProgressUpdate(int i, int i2, boolean z) {
    }

    @Override // X.C30G
    public final void onSeeking(long j) {
        this.A01 = -1;
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackSeekComplete();
        }
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
    public final void onSurfaceTextureUpdated(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C30G
    public final void onVideoPrepared(C4S7 c4s7, boolean z) {
        A01(0);
    }

    @Override // X.C30G
    public final void onVideoSwitchToWarmupPlayer(C4S7 c4s7) {
    }

    @Override // X.C30G
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    private final void A00() {
        if (this.A09) {
            if (!this.A06) {
                C677933t c677933t = this.A0F;
                c677933t.A01.A0D("play_on_prepared_requested", c677933t.A00, null, null, null, null);
                C95334Qt c95334Qt = this.A05;
                if (c95334Qt != null) {
                    c95334Qt.start();
                } else {
                    c677933t.A05("Null video player while playOnPrepared()");
                }
                C677733r c677733r = this.A0J;
                if (c677733r != null) {
                    c677733r.A01(this.A0I);
                }
                this.A06 = true;
                this.A0C.postDelayed(this.A0K, this.A0B);
                c677933t.A01();
                InterfaceC150336ph interfaceC150336ph = this.A04;
                if (interfaceC150336ph != null) {
                    interfaceC150336ph.onCurrentTrackPlaybackStarted();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // X.InterfaceC678133v
    public final MusicDataSource Avn() {
        return this.A03;
    }

    @Override // X.InterfaceC678133v
    public final Integer CAJ(MusicDataSource musicDataSource) {
        if (musicDataSource != null && this.A05 != null && C14360o3.A0K(this.A03, musicDataSource)) {
            if (this.A09) {
                return C05F.A0C;
            }
            return C05F.A01;
        }
        return C05F.A00;
    }

    @Override // X.InterfaceC678133v
    public final float CH1() {
        return this.A00;
    }

    @Override // X.InterfaceC678133v
    public final boolean CLN() {
        if (this.A03 == null) {
            return false;
        }
        return true;
    }

    @Override // X.C4QU, X.C4QV
    public final void DVN(byte[] bArr, long j) {
        C189908b9 c189908b9 = this.A02;
        if (c189908b9 != null) {
            c189908b9.A03.add(new C24237Ap4(bArr, j));
        }
    }

    @Override // X.C4QU, X.C4QV
    public final void E05(long j) {
        this.A0F.A02();
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackStartedPlaying();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r4.A0A != false) goto L6;
     */
    @Override // X.InterfaceC678133v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E4S() {
        /*
            r4 = this;
            X.33t r3 = r4.A0F
            boolean r0 = r4.A06
            r2 = 1
            if (r0 != 0) goto Lc
            boolean r1 = r4.A0A
            r0 = 0
            if (r1 == 0) goto Ld
        Lc:
            r0 = 1
        Ld:
            r3.A06(r0)
            com.instagram.music.common.model.MusicDataSource r0 = r4.A03
            if (r0 != 0) goto L1a
            java.lang.String r0 = "Null data source during play()"
        L16:
            r3.A05(r0)
            return
        L1a:
            java.lang.Integer r0 = r4.CAJ(r0)
            int r1 = r0.intValue()
            if (r1 == r2) goto L37
            r0 = 2
            if (r1 == r0) goto L33
            r0 = 0
            if (r1 != r0) goto L2d
            java.lang.String r0 = "UNSET TrackState during play()"
            goto L16
        L2d:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L33:
            r4.A00()
            return
        L37:
            r4.A0A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C150296pd.E4S():void");
    }

    @Override // X.InterfaceC678133v
    public final void EJa(boolean z) {
        C95334Qt c95334Qt = this.A05;
        if (c95334Qt != null) {
            C677933t c677933t = this.A0F;
            if (this.A06 && !c95334Qt.A09.A0I.A0J()) {
                c677933t.A01.A0D("reset_started", c677933t.A00, null, null, null, null);
            }
            C95334Qt c95334Qt2 = this.A05;
            if (c95334Qt2 != null) {
                c95334Qt2.reset();
            }
            A03(!z);
            this.A01 = -1;
            this.A0A = false;
            this.A07 = -1;
            this.A09 = false;
            this.A03 = null;
            this.A04 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0182  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, X.4Qi] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.4SM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.4SI, java.lang.Object] */
    @Override // X.InterfaceC678133v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ESz(com.instagram.music.common.model.MusicDataSource r42, X.InterfaceC150336ph r43, java.lang.String r44, int r45, int r46, int r47, boolean r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C150296pd.ESz(com.instagram.music.common.model.MusicDataSource, X.6ph, java.lang.String, int, int, int, boolean, boolean):void");
    }

    @Override // X.InterfaceC678133v
    public final void EhH(float f) {
        C95334Qt c95334Qt = this.A05;
        if (c95334Qt != null) {
            c95334Qt.EhH(f);
        }
        this.A00 = f;
    }

    @Override // X.InterfaceC678133v
    public final boolean isPlaying() {
        int intValue = CAJ(this.A03).intValue();
        if ((intValue != 1 && intValue != 2) || (!this.A0A && !this.A06)) {
            return false;
        }
        return true;
    }

    @Override // X.C30G
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        this.A0F.A02();
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackStartedPlaying();
        }
    }

    @Override // X.InterfaceC678133v
    public final void release() {
        if (this.A05 != null) {
            EJa(false);
            C95334Qt c95334Qt = this.A05;
            if (c95334Qt != null) {
                c95334Qt.EE5(false);
            }
            this.A05 = null;
        }
    }

    @Override // X.InterfaceC678133v
    public final void seekTo(int i) {
        MusicDataSource musicDataSource = this.A03;
        if (musicDataSource != null) {
            int intValue = CAJ(musicDataSource).intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 0) {
                        throw new RuntimeException();
                    }
                    return;
                } else {
                    C95334Qt c95334Qt = this.A05;
                    if (c95334Qt != null) {
                        c95334Qt.seekTo(i);
                        return;
                    }
                    return;
                }
            }
            this.A07 = i;
        }
    }

    public C150296pd(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C677733r c677733r, C677933t c677933t, boolean z) {
        this.A0D = userSession;
        this.A0J = c677733r;
        this.A0F = c677933t;
        this.A0E = interfaceC60442pS;
        this.A0M = z;
        if (C18U.A06(C06090Tz.A05, userSession, 36325944331482648L)) {
            context = context.getApplicationContext();
            C14360o3.A0A(context);
        }
        this.A0H = context;
        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.6pe
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return C150296pd.this.A03;
            }
        };
        this.A0L = interfaceC08830cm;
        this.A0C = new Handler(Looper.getMainLooper());
        this.A07 = -1;
        this.A0B = 16;
        this.A01 = -1;
        this.A0G = C05F.A15;
        this.A0I = new AudioManager.OnAudioFocusChangeListener() { // from class: X.6pf
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                if (i != -2 && i != -1) {
                    return;
                }
                C150296pd.A02(C150296pd.this);
            }
        };
        this.A00 = 1.0f;
        this.A0K = new Runnable() { // from class: X.6pg
            @Override // java.lang.Runnable
            public final void run() {
                C150296pd c150296pd = C150296pd.this;
                if (c150296pd.A06 && c150296pd.A04 != null) {
                    c150296pd.A0C.postDelayed(this, c150296pd.A0B);
                    C95334Qt c95334Qt = c150296pd.A05;
                    if (c95334Qt != null) {
                        if (c150296pd.A04 != null) {
                            Integer valueOf = Integer.valueOf(c95334Qt.getCurrentPosition());
                            if (valueOf != null) {
                                int i = c150296pd.A01;
                                if (i == -1 || valueOf.intValue() > i) {
                                    InterfaceC150336ph interfaceC150336ph = c150296pd.A04;
                                    if (interfaceC150336ph != null) {
                                        interfaceC150336ph.onCurrentTrackPlayTimeUpdated(valueOf.intValue());
                                    }
                                    c150296pd.A01 = valueOf.intValue();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }
        };
        if (interfaceC60442pS != null) {
            this.A08 = new C678533z(interfaceC60442pS, interfaceC08830cm);
        }
    }

    @Override // X.InterfaceC678133v
    public final void pause() {
        A02(this);
    }

    @Override // X.InterfaceC678133v
    public final void EPv(C189908b9 c189908b9) {
        this.A02 = c189908b9;
    }
}
