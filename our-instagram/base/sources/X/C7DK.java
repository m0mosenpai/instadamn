package X;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7DK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DK implements C6C3 {
    public C46089Kan A01;
    public C47664L2x A02;
    public LGD A03;
    public C7DO A04;
    public C7DM A05;
    public C5TA A06;
    public String A07;
    public C7DN A08;
    public C7GV A09;
    public final Context A0A;
    public final UserSession A0B;
    public final InterfaceC60442pS A0D;
    public int A00 = 0;
    public final C7DL A0C = new C7DL();

    private void A00() {
        SensorManager sensorManager;
        C48029LMy c48029LMy;
        C47664L2x c47664L2x = this.A02;
        if (c47664L2x != null) {
            LGD lgd = this.A03;
            if (lgd == null) {
                UserSession userSession = this.A0B;
                Context context = this.A0A;
                Integer num = c47664L2x.A03;
                InterfaceC16820sZ interfaceC16820sZ = new InterfaceC16820sZ() { // from class: X.M94
                    @Override // X.InterfaceC16820sZ
                    public final Object invoke() {
                        C7DM c7dm = C7DK.this.A05;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        c7dm.A00(EnumC53362NjD.RAISE_DEVICE, timeUnit.toSeconds(r3.A01()), timeUnit.toSeconds(r3.A02()));
                        return C0eB.A00;
                    }
                };
                C14360o3.A0B(num, 3);
                if (num == C05F.A01) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36323577804434817L)) {
                        lgd = new LGD(context, this, interfaceC16820sZ, (int) C18U.A01(c06090Tz, userSession, 36605052781466824L), (int) C18U.A00(c06090Tz, userSession, 37168002734948817L), C18U.A06(c06090Tz, userSession, 36323577804631428L));
                        this.A03 = lgd;
                    }
                }
                lgd = null;
                this.A03 = lgd;
            }
            if (lgd != null) {
                Integer num2 = this.A02.A03;
                C14360o3.A0B(num2, 0);
                if (!AbstractC226389yv.A00(lgd.A03) && (sensorManager = lgd.A05) != null && lgd.A04 != null && (c48029LMy = lgd.A00) != null && num2 == C05F.A01) {
                    C14360o3.A0B(sensorManager, 0);
                    c48029LMy.A00 = System.currentTimeMillis();
                    boolean A01 = C0fX.A01(c48029LMy.A03, c48029LMy, sensorManager, 2);
                    c48029LMy.A01 = A01;
                    if (A01) {
                        lgd.A07.A00(lgd.A02);
                    }
                }
            }
        }
    }

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCues(List list) {
    }

    @Override // X.C6C3
    public final void onLoop(int i) {
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
        this.A02 = null;
        this.A09 = null;
        LGD lgd = this.A03;
        if (lgd != null) {
            lgd.A01();
        }
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C6C3
    public final void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
    }

    public final int A01() {
        C5TA c5ta = this.A06;
        if (c5ta != null) {
            return c5ta.A06.getCurrentPositionMs();
        }
        return 0;
    }

    public final int A02() {
        C5TA c5ta = this.A06;
        if (c5ta != null) {
            return c5ta.A06.Azm();
        }
        return 0;
    }

    public final void A03() {
        if (this.A06 != null) {
            A00();
            this.A06.A0B("resume", false);
            C47664L2x c47664L2x = this.A02;
            if (c47664L2x != null && c47664L2x.A03 == C05F.A00) {
                C7DM c7dm = this.A05;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long seconds = timeUnit.toSeconds(A01());
                long seconds2 = timeUnit.toSeconds(A02());
                C18920wW c18920wW = c7dm.A00;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "music_sharing_playback_resume");
                if (A00.isSampled()) {
                    A00.A9K("position", Long.valueOf(seconds));
                    A00.A9K("duration", Long.valueOf(seconds2));
                    A00.Cht();
                    return;
                }
                return;
            }
            C7DM c7dm2 = this.A05;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            c7dm2.A00(null, timeUnit2.toSeconds(A01()), timeUnit2.toSeconds(A02()));
        }
    }

    public final void A04(int i) {
        if (this.A06 != null) {
            C7DN c7dn = this.A08;
            c7dn.removeMessages(1);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(A01());
            if (c7dn.A02 == -1) {
                c7dn.A02 = seconds;
            }
            c7dn.A01 = timeUnit.toSeconds(i);
            c7dn.A00 = timeUnit.toSeconds(A02());
            this.A06.A04(i, true);
            c7dn.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    public final void A05(int i) {
        C95334Qt c95334Qt;
        C5TA c5ta = this.A06;
        if (c5ta != null && (c95334Qt = ((C4QT) c5ta.A06).A0K) != null) {
            C4RQ c4rq = c95334Qt.A09.A0I;
            Integer valueOf = Integer.valueOf(i);
            C4RQ.A05(c4rq, "setAudioUsage: %d", valueOf);
            Handler handler = c4rq.A0E;
            handler.sendMessage(handler.obtainMessage(23, valueOf));
        }
    }

    public final void A06(C7GU c7gu) {
        C47664L2x c47664L2x = this.A02;
        if (c47664L2x != null && c7gu == c47664L2x.A00) {
            c47664L2x.A00 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0185, code lost:
    
        if (r39.isEmpty() != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.C7GU r29, X.EnumC92794Ds r30, X.C7GV r31, X.C38321qM r32, com.instagram.model.direct.messageid.DirectMessageIdentifier r33, X.C75363a3 r34, java.lang.Integer r35, java.lang.Integer r36, java.lang.Integer r37, java.lang.Long r38, java.lang.String r39, java.lang.String r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7DK.A07(X.7GU, X.4Ds, X.7GV, X.1qM, com.instagram.model.direct.messageid.DirectMessageIdentifier, X.3a3, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void A08(C7GU c7gu, DirectMessageIdentifier directMessageIdentifier, C75363a3 c75363a3) {
        C47664L2x c47664L2x;
        UserSession userSession = this.A0B;
        C06090Tz c06090Tz = C06090Tz.A05;
        int min = Math.min(2, Long.valueOf(C18U.A01(c06090Tz, userSession, 36612822376978850L)).intValue());
        if (c75363a3 != null && this.A00 < min && C18U.A06(c06090Tz, userSession, 36331347400213760L)) {
            C4VX c4vx = new C4VX(this.A0A, userSession, c75363a3, "direct_voice_message");
            c4vx.A02 = true;
            c4vx.A06 = false;
            C4VZ.A00(c4vx.A00());
            this.A00++;
        }
        if (this.A06 != null && (c47664L2x = this.A02) != null && directMessageIdentifier.A02(c47664L2x.A01)) {
            c47664L2x.A00 = c7gu;
        }
    }

    public final void A09(String str) {
        if (this.A06 != null) {
            A0B(false);
            this.A06.A0A(str);
            this.A06 = null;
            this.A04.A00 = null;
        }
        LGD lgd = this.A03;
        if (lgd != null) {
            lgd.A01();
            lgd.A00 = null;
        }
        this.A03 = null;
    }

    public final void A0A(String str) {
        C5TA c5ta = this.A06;
        if (c5ta != null) {
            c5ta.A0C(str, true);
        }
        LGD lgd = this.A03;
        if (lgd != null) {
            lgd.A01();
        }
    }

    public final void A0B(boolean z) {
        String str;
        InterfaceC02590Ai A00;
        C7GU c7gu;
        LGD lgd = this.A03;
        if (lgd != null) {
            lgd.A01();
        }
        C5TA c5ta = this.A06;
        if (c5ta != null) {
            if (z) {
                str = "tapped";
            } else {
                str = "fragment_paused";
            }
            c5ta.A09(str);
            C47664L2x c47664L2x = this.A02;
            if (c47664L2x != null && (c7gu = c47664L2x.A00) != null) {
                c7gu.Cy3();
            }
            C47664L2x c47664L2x2 = this.A02;
            if (c47664L2x2 != null && c47664L2x2.A03 == C05F.A00) {
                C7DM c7dm = this.A05;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long seconds = timeUnit.toSeconds(A01());
                long seconds2 = timeUnit.toSeconds(A02());
                C18920wW c18920wW = c7dm.A00;
                A00 = c18920wW.A00(c18920wW.A00, "music_sharing_playback_pause");
                if (A00.isSampled()) {
                    A00.A9K("position", Long.valueOf(seconds));
                    A00.A9K("duration", Long.valueOf(seconds2));
                } else {
                    return;
                }
            } else {
                C7DM c7dm2 = this.A05;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                long seconds3 = timeUnit2.toSeconds(A01());
                long seconds4 = timeUnit2.toSeconds(A02());
                C18920wW c18920wW2 = c7dm2.A00;
                A00 = c18920wW2.A00(c18920wW2.A00, "audio_clips_playback_pause");
                if (!A00.isSampled()) {
                    return;
                }
                A00.A9K("position", Long.valueOf(seconds3));
                A00.A9K("duration", Long.valueOf(seconds4));
                A00.AAP("attachment_id", null);
                A00.A7v("has_access_token", false);
            }
            A00.Cht();
        }
    }

    public final boolean A0C() {
        C5TA c5ta = this.A06;
        if (c5ta != null && c5ta.A0E()) {
            return true;
        }
        return false;
    }

    public final boolean A0D(DirectMessageIdentifier directMessageIdentifier) {
        C47664L2x c47664L2x;
        C5TA c5ta = this.A06;
        if (c5ta != null && !c5ta.A01 && (c47664L2x = this.A02) != null && directMessageIdentifier.A02(c47664L2x.A01)) {
            return true;
        }
        return false;
    }

    @Override // X.C6C3
    public final void onCompletion() {
        DirectMessageIdentifier directMessageIdentifier;
        C72495Xf8 c72495Xf8;
        C7GU c7gu;
        C47664L2x c47664L2x = this.A02;
        if (c47664L2x != null) {
            directMessageIdentifier = c47664L2x.A01;
            if (directMessageIdentifier != null && (c72495Xf8 = (C72495Xf8) this.A0C.A01(directMessageIdentifier)) != null) {
                int i = c72495Xf8.A01;
                c72495Xf8.A00 = i;
                C47664L2x c47664L2x2 = this.A02;
                if (c47664L2x2 != null && (c7gu = c47664L2x2.A00) != null) {
                    c7gu.Cy4(i, i, false);
                    c47664L2x2.A00.Cy3();
                }
            }
        } else {
            directMessageIdentifier = null;
        }
        C7GV c7gv = this.A09;
        if (c7gv != null) {
            c7gv.Cy2(directMessageIdentifier);
        }
        C5TA c5ta = this.A06;
        if (c5ta != null) {
            c5ta.A0C("finished", true);
        }
        LGD lgd = this.A03;
        if (lgd != null) {
            lgd.A01();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.Xf8] */
    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        C7GU c7gu;
        DirectMessageIdentifier directMessageIdentifier;
        C47664L2x c47664L2x = this.A02;
        if (c47664L2x != null && (directMessageIdentifier = c47664L2x.A01) != null) {
            C7DL c7dl = this.A0C;
            C72495Xf8 c72495Xf8 = (C72495Xf8) c7dl.A01(directMessageIdentifier);
            if (c72495Xf8 != null) {
                c72495Xf8.A00 = i;
            } else {
                ?? obj = new Object();
                obj.A00 = i;
                obj.A01 = i2;
                c7dl.A02(directMessageIdentifier, obj);
            }
        }
        C47664L2x c47664L2x2 = this.A02;
        if (c47664L2x2 != null && (c7gu = c47664L2x2.A00) != null) {
            c7gu.Cy4(i, i2, z);
        }
    }

    public C7DK(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        this.A0A = context;
        this.A0B = userSession;
        this.A0D = interfaceC60442pS;
        this.A07 = str;
        this.A05 = new C7DM(userSession);
        this.A08 = new C7DN(Looper.getMainLooper(), this.A05);
        this.A04 = new C7DO(userSession);
    }
}
