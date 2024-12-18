package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicDataSource;
import java.io.IOException;
import java.util.List;

/* renamed from: X.33u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C678033u implements InterfaceC678133v, C30G {
    public float A00;
    public int A01;
    public C189908b9 A02;
    public MusicDataSource A03;
    public InterfaceC150336ph A04;
    public C4QW A05;
    public boolean A06;
    public int A07;
    public C30P A08;
    public boolean A09;
    public boolean A0A;
    public final Handler A0B;
    public final UserSession A0C;
    public final InterfaceC60442pS A0D;
    public final Context A0E;
    public final AudioManager.OnAudioFocusChangeListener A0F;
    public final C677733r A0G;
    public final C677933t A0H;
    public final Runnable A0I;
    public final InterfaceC08830cm A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static final void A01(C678033u c678033u) {
        C4QW c4qw;
        C677933t c677933t = c678033u.A0H;
        if (c678033u.A06 && ((c4qw = c678033u.A05) == null || !c4qw.isPlaying())) {
            c677933t.A01.A0D(AbstractC111324zv.A00(5045), c677933t.A00, null, null, null, null);
        }
        C4QW c4qw2 = c678033u.A05;
        if (c4qw2 != null) {
            c678033u.A0A = false;
            if (c678033u.A09) {
                c4qw2.E3d(MSV.A00(276));
            }
            c678033u.A02(true);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final void A02(boolean z) {
        C677733r c677733r;
        this.A06 = false;
        this.A0B.removeCallbacks(this.A0I);
        if (z && (c677733r = this.A0G) != null) {
            c677733r.A00();
        }
        this.A0H.A00();
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
    public final void ESz(final MusicDataSource musicDataSource, InterfaceC150336ph interfaceC150336ph, final String str, final int i, final int i2, final int i3, boolean z, boolean z2) {
        final String str2;
        String str3;
        C14360o3.A0B(musicDataSource, 0);
        C14360o3.A0B(interfaceC150336ph, 2);
        if (!z && musicDataSource.equals(this.A03)) {
            this.A04 = interfaceC150336ph;
            return;
        }
        C677933t c677933t = this.A0H;
        if (this.A05 == null) {
            Context context = this.A0E;
            UserSession userSession = this.A0C;
            C30P c30p = this.A08;
            InterfaceC60442pS interfaceC60442pS = this.A0D;
            if (interfaceC60442pS == null || (str3 = interfaceC60442pS.getModuleName()) == null) {
                str3 = "MusicPlayer";
            }
            C4QT A00 = C4QS.A00(context, userSession, c30p, this, str3);
            A00.EhI(this.A00, 0);
            A00.ERX(this.A0K);
            A00.EYb(this.A0L);
            this.A05 = A00;
        } else {
            EJa(true);
        }
        this.A04 = interfaceC150336ph;
        this.A03 = musicDataSource;
        try {
            final android.net.Uri uri = musicDataSource.A00;
            final String str4 = musicDataSource.A05;
            if (uri == null || (str2 = uri.toString()) == null) {
                str2 = str4;
            }
            final String str5 = musicDataSource.A04;
            final C4QW c4qw = this.A05;
            if (c4qw != null) {
                C11T.A07(false, new Runnable() { // from class: X.9JO
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str6;
                        String str7;
                        C4QW c4qw2 = c4qw;
                        Integer num = C05F.A15;
                        MusicDataSource musicDataSource2 = musicDataSource;
                        String str8 = musicDataSource2.A03;
                        if (str8 == null) {
                            str8 = "MusicPlayer";
                        }
                        C14360o3.A0B(str8, 2);
                        C678033u c678033u = this;
                        String str9 = str5;
                        String str10 = str2;
                        boolean z3 = true;
                        boolean A1W = AbstractC167007dF.A1W(c678033u.A02);
                        int i4 = i2;
                        int i5 = i3;
                        if ((str9 == null || str9.length() == 0) && ((str6 = str4) == null || str6.length() == 0)) {
                            z3 = false;
                        }
                        C75363a3 c75363a3 = new C75363a3(null, null, null, null, null, num, 1, str8, null, str10, str9, null, null, null, null, null, null, null, null, i4, i5, -1L, false, false, false, false, false, A1W, z3, false);
                        C4S7 c4s7 = new C4S7(str, musicDataSource2);
                        float f = c678033u.A00;
                        InterfaceC60442pS interfaceC60442pS2 = c678033u.A0D;
                        if (interfaceC60442pS2 == null || (str7 = interfaceC60442pS2.getModuleName()) == null) {
                            str7 = "MusicPlayer";
                        }
                        c4qw2.E5v(new C4SC(null, new C4QP(false, false, false, false), c75363a3, c4s7, String.valueOf(uri), str7, f, 0, i, false));
                    }
                });
            } else {
                c677933t.A04(new IllegalArgumentException("Null igVideoPlayer during setDataSource"));
            }
            C677733r c677733r = this.A0G;
            if (c677733r == null) {
                C0w9.A03("MusicPlayer", "Failed to request audio focus");
            } else {
                c677733r.A01(this.A0F);
            }
        } catch (IOException e) {
            c677933t.A04(e);
            throw new RuntimeException(e);
        }
    }

    @Override // X.C30G
    public final void onCompletion() {
        A02(true);
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
    public final void onVideoPrepared(C4S7 c4s7, boolean z) {
        int i;
        this.A09 = true;
        this.A0H.A03();
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            C4QW c4qw = this.A05;
            if (c4qw != null) {
                i = c4qw.Azm();
            } else {
                i = 0;
            }
            interfaceC150336ph.onCurrentTrackPrepared(i);
        }
        int i2 = this.A07;
        if (i2 != -1) {
            C4QW c4qw2 = this.A05;
            if (c4qw2 != null) {
                c4qw2.EMg(i2, true);
            }
            this.A07 = -1;
        }
        if (this.A0A) {
            A00();
            this.A0A = false;
        }
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
                C677933t c677933t = this.A0H;
                c677933t.A01.A0D("play_on_prepared_requested", c677933t.A00, null, null, null, null);
                C4QW c4qw = this.A05;
                if (c4qw != null) {
                    c4qw.E4T("resume", false);
                } else {
                    c677933t.A05(AbstractC111324zv.A00(3695));
                }
                C677733r c677733r = this.A0G;
                if (c677733r != null) {
                    c677733r.A01(this.A0F);
                }
                this.A06 = true;
                this.A0B.postDelayed(this.A0I, 16L);
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
    public final int Azm() {
        C4QW c4qw = this.A05;
        if (c4qw != null) {
            return c4qw.Azm();
        }
        return -1;
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
            X.33t r3 = r4.A0H
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
            if (r0 != 0) goto L1e
            r0 = 3693(0xe6d, float:5.175E-42)
        L16:
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r3.A05(r0)
            return
        L1e:
            java.lang.Integer r0 = r4.CAJ(r0)
            int r1 = r0.intValue()
            if (r1 == r2) goto L3b
            r0 = 2
            if (r1 == r0) goto L37
            r0 = 0
            if (r1 != r0) goto L31
            r0 = 3790(0xece, float:5.311E-42)
            goto L16
        L31:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L37:
            r4.A00()
            return
        L3b:
            r4.A0A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C678033u.E4S():void");
    }

    @Override // X.InterfaceC678133v
    public final void EJa(boolean z) {
        C4QW c4qw = this.A05;
        if (c4qw != null) {
            C677933t c677933t = this.A0H;
            if (this.A06 && !c4qw.isPlaying()) {
                c677933t.A01.A0D("reset_started", c677933t.A00, null, null, null, null);
            }
            C4QW c4qw2 = this.A05;
            if (c4qw2 != null) {
                c4qw2.Eol("finished", false);
            }
            A02(!z);
            this.A01 = -1;
            this.A0A = false;
            this.A07 = -1;
            this.A09 = false;
            this.A03 = null;
            this.A04 = null;
        }
    }

    @Override // X.InterfaceC678133v
    public final void EhH(float f) {
        C4QW c4qw = this.A05;
        if (c4qw != null) {
            c4qw.EhI(f, 0);
        }
        this.A00 = f;
    }

    @Override // X.InterfaceC678133v
    public final int getCurrentPositionMs() {
        C4QW c4qw = this.A05;
        if (c4qw != null) {
            return c4qw.getCurrentPositionMs();
        }
        return -1;
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
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
        C677933t c677933t = this.A0H;
        if (str == null) {
            str = "Video Player Error";
        }
        c677933t.A05(str);
    }

    @Override // X.C30G
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        this.A0H.A02();
        InterfaceC150336ph interfaceC150336ph = this.A04;
        if (interfaceC150336ph != null) {
            interfaceC150336ph.onCurrentTrackStartedPlaying();
        }
    }

    @Override // X.InterfaceC678133v
    public final void release() {
        if (this.A05 != null) {
            EJa(false);
            C4QW c4qw = this.A05;
            if (c4qw != null) {
                c4qw.EE4("finished");
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
                    C4QW c4qw = this.A05;
                    if (c4qw != null) {
                        c4qw.EMg(i, true);
                        return;
                    }
                    return;
                }
            }
            this.A07 = i;
        }
    }

    public C678033u(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C677733r c677733r, C677933t c677933t, boolean z, boolean z2) {
        this.A0C = userSession;
        this.A0G = c677733r;
        this.A0H = c677933t;
        this.A0D = interfaceC60442pS;
        this.A0K = z;
        this.A0L = z2;
        if (C18U.A06(C06090Tz.A05, userSession, 36325944331482648L)) {
            context = context.getApplicationContext();
            C14360o3.A0A(context);
        }
        this.A0E = context;
        this.A0B = new Handler(Looper.getMainLooper());
        InterfaceC08830cm interfaceC08830cm = new InterfaceC08830cm() { // from class: X.33w
            @Override // X.InterfaceC08830cm
            public final /* bridge */ /* synthetic */ Object get() {
                return C678033u.this.A03;
            }
        };
        this.A0J = interfaceC08830cm;
        this.A07 = -1;
        this.A01 = -1;
        this.A0F = new AudioManager.OnAudioFocusChangeListener() { // from class: X.33x
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                if (i != -2 && i != -1) {
                    return;
                }
                C678033u.A01(C678033u.this);
            }
        };
        this.A00 = 1.0f;
        this.A0I = new Runnable() { // from class: X.33y
            @Override // java.lang.Runnable
            public final void run() {
                C678033u c678033u = C678033u.this;
                if (c678033u.A06 && c678033u.A04 != null) {
                    c678033u.A0B.postDelayed(this, 16L);
                    C4QW c4qw = c678033u.A05;
                    if (c4qw != null) {
                        if (c678033u.A04 != null) {
                            Integer valueOf = Integer.valueOf(c4qw.getCurrentPositionMs());
                            if (valueOf != null) {
                                int i = c678033u.A01;
                                if (i == -1 || valueOf.intValue() > i) {
                                    InterfaceC150336ph interfaceC150336ph = c678033u.A04;
                                    if (interfaceC150336ph != null) {
                                        interfaceC150336ph.onCurrentTrackPlayTimeUpdated(valueOf.intValue());
                                    }
                                    c678033u.A01 = valueOf.intValue();
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
        A01(this);
    }

    @Override // X.InterfaceC678133v
    public final void EPv(C189908b9 c189908b9) {
        this.A02 = c189908b9;
    }
}
