package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;
import java.util.UUID;

/* renamed from: X.7IN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7IN implements C6C3 {
    public C7L6 A00;
    public C46092Kaq A01;
    public C7D8 A02;
    public C5TA A03;
    public Integer A04 = C05F.A00;
    public final Context A05;
    public final UserSession A06;
    public final C7DO A07;
    public final InterfaceC60442pS A08;
    public final String A09;
    public final String A0A;
    public final double A0B;

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCompletion() {
    }

    @Override // X.C6C3
    public final void onCues(List list) {
    }

    @Override // X.C6C3
    public final void onLoop(int i) {
        C7L5 c7l5;
        DirectMessageIdentifier directMessageIdentifier;
        String str;
        if (i >= 1) {
            C7L6 c7l6 = this.A00;
            if (c7l6 != null && (directMessageIdentifier = (c7l5 = c7l6.A00).A00) != null && (str = directMessageIdentifier.A02) != null) {
                c7l5.A0C.add(str);
            }
            C46092Kaq c46092Kaq = this.A01;
            if (c46092Kaq != null) {
                C7D8 c7d8 = c46092Kaq.A01;
                c7d8.getClass();
                c7d8.EbK(8, 0);
            }
        }
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    public static void A00(C7IN c7in) {
        C46092Kaq c46092Kaq = c7in.A01;
        if (c46092Kaq != null) {
            C7D8 c7d8 = c46092Kaq.A01;
            c7d8.getClass();
            c7d8.setVideoIconState(EnumC74373Vt.A0A);
            c7d8.ESM(0);
            if (!C3Q3.A00(c7in.A06).A00()) {
                c7d8.EhT(EnumC79303gb.A03);
            }
            c7d8.EbK(8, 0);
        }
        c7in.A01 = null;
    }

    public final void A01(MRO mro, C7D8 c7d8) {
        String str;
        C75363a3 CFR;
        this.A04 = C05F.A01;
        C38321qM BQZ = c7d8.BQZ();
        DirectMessageIdentifier AxX = c7d8.AxX();
        C7DO c7do = this.A07;
        if (AxX != null) {
            str = AxX.A00();
        } else {
            str = null;
        }
        c7do.A01(str);
        C46092Kaq c46092Kaq = new C46092Kaq(mro, AxX);
        this.A01 = c46092Kaq;
        c46092Kaq.A01 = c7d8;
        C5TA c5ta = this.A03;
        if (c5ta == null) {
            UserSession userSession = this.A06;
            c5ta = new C5TA(this.A05, userSession, new C46089Kan(userSession, c7do, this.A08, this.A0A), this, this.A09);
            this.A03 = c5ta;
        }
        c5ta.getClass();
        String CFK = c7d8.CFK();
        if (BQZ == null) {
            C101644hZ c101644hZ = new C101644hZ(C05F.A1F, UUID.randomUUID().toString());
            String CFK2 = c7d8.CFK();
            c101644hZ.A0B = CFK2;
            boolean z = true;
            c101644hZ.A0G = true;
            c101644hZ.A02 = -1L;
            if (CFK2 == null || CFK2.isEmpty()) {
                z = false;
            }
            c101644hZ.A0I = z;
            CFR = c101644hZ.A00();
        } else {
            CFR = BQZ.CFR();
        }
        c5ta.A08(c7d8.C6x(), CFR, this.A01, CFK, this.A09, 0.0f, -1, 0, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r1.equals(r0.C6x()) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C7D8 r5, com.instagram.model.direct.messageid.DirectMessageIdentifier r6) {
        /*
            r4 = this;
            X.5TA r0 = r4.A03
            if (r0 == 0) goto L37
            X.Kaq r0 = r4.A01
            r3 = 1
            if (r0 == 0) goto L1d
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r1 = r5.C6x()
            X.7D8 r0 = r0.A01
            r0.getClass()
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r0.C6x()
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L1e
        L1d:
            r2 = 0
        L1e:
            X.Kaq r1 = r4.A01
            if (r1 == 0) goto L49
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r1.A02
            boolean r0 = r6.A02(r0)
            if (r0 == 0) goto L49
        L2a:
            if (r2 == 0) goto L38
            if (r3 != 0) goto L37
            r0 = 171(0xab, float:2.4E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r4.A03(r0)
        L37:
            return
        L38:
            if (r3 == 0) goto L37
            r1.getClass()
            r1.A01 = r5
            X.5TA r1 = r4.A03
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r5.C6x()
            r1.A06(r0)
            return
        L49:
            r3 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7IN.A02(X.7D8, com.instagram.model.direct.messageid.DirectMessageIdentifier):void");
    }

    public final void A03(String str) {
        this.A04 = C05F.A0N;
        C5TA c5ta = this.A03;
        if (c5ta != null) {
            c5ta.A0C(str, true);
        }
        A00(this);
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
        C46092Kaq c46092Kaq = (C46092Kaq) c4s7;
        C5TA c5ta = this.A03;
        if (c5ta != null) {
            int max = Math.max((c5ta.A06.Azm() - 5500) - c5ta.A06.getCurrentPositionMs(), 0);
            C7D8 c7d8 = c46092Kaq.A01;
            c7d8.getClass();
            c7d8.EbK(0, max);
        }
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
        C7D8 c7d8 = ((C46092Kaq) c4s7).A01;
        c7d8.getClass();
        c7d8.EhT(EnumC79303gb.A02);
    }

    @Override // X.C6C3
    public final void onProgressStateChanged(boolean z) {
        C7L6 c7l6;
        C7L5 c7l5;
        DirectMessageIdentifier directMessageIdentifier;
        String str;
        C46092Kaq c46092Kaq = this.A01;
        C5TA c5ta = this.A03;
        if (c5ta != null && c46092Kaq != null) {
            if (z) {
                C7D8 c7d8 = c46092Kaq.A01;
                c7d8.getClass();
                C4QW c4qw = c5ta.A06;
                c7d8.EcT(c4qw.Azm() - c4qw.getCurrentPositionMs());
                C46092Kaq c46092Kaq2 = this.A01;
                c46092Kaq2.getClass();
                C7D8 c7d82 = c46092Kaq2.A01;
                c7d82.getClass();
                c7d82.setVideoIconState(EnumC74373Vt.A09);
                c46092Kaq.A00 = c4qw.getCurrentPositionMs();
                return;
            }
            int currentPositionMs = c5ta.A06.getCurrentPositionMs();
            int i = c46092Kaq.A00;
            if (i >= 0 && currentPositionMs - i < 3000) {
                C46092Kaq c46092Kaq3 = this.A01;
                c46092Kaq3.getClass();
                C7D8 c7d83 = c46092Kaq3.A01;
                c7d83.getClass();
                c7d83.setVideoIconState(EnumC74373Vt.A0C);
                C46092Kaq c46092Kaq4 = this.A01;
                c46092Kaq4.getClass();
                C7D8 c7d84 = c46092Kaq4.A01;
                c7d84.getClass();
                c7d84.EcT(c5ta.A06.Azm() - currentPositionMs);
            } else {
                C46092Kaq c46092Kaq5 = this.A01;
                c46092Kaq5.getClass();
                C7D8 c7d85 = c46092Kaq5.A01;
                c7d85.getClass();
                c7d85.setVideoIconState(EnumC74373Vt.A05);
                c46092Kaq.A00 = -1;
            }
            if (currentPositionMs < 3000 || (c7l6 = this.A00) == null || (directMessageIdentifier = (c7l5 = c7l6.A00).A00) == null || (str = directMessageIdentifier.A02) == null) {
                return;
            }
            c7l5.A0C.add(str);
        }
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        C5TA c5ta = this.A03;
        if (c5ta != null) {
            double d = this.A0B;
            if (d > 0.0d && i > d) {
                c5ta.A04(0, false);
            }
        }
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
        this.A04 = C05F.A00;
        C7D8 c7d8 = this.A02;
        if (z && c7d8 != null) {
            A01(null, c7d8);
        }
        this.A02 = null;
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
        C46092Kaq c46092Kaq = (C46092Kaq) c4s7;
        C7D8 c7d8 = c46092Kaq.A01;
        c7d8.getClass();
        C5TA c5ta = this.A03;
        if (c5ta != null) {
            c7d8.EcT(c5ta.A06.Azm() - c5ta.A06.getCurrentPositionMs());
            c7d8.setVideoIconState(EnumC74373Vt.A09);
            c46092Kaq.A00 = 0;
            return;
        }
        c7d8.setVideoIconState(EnumC74373Vt.A08);
    }

    @Override // X.C6C3
    public final void onVideoStartedPlaying(C4S7 c4s7) {
        this.A04 = C05F.A0C;
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
        C7D8 c7d8 = ((C46092Kaq) c4s7).A01;
        c7d8.getClass();
        c7d8.setVideoIconState(EnumC74373Vt.A05);
        c7d8.ESM(4);
    }

    public C7IN(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2) {
        this.A05 = context.getApplicationContext();
        this.A06 = userSession;
        this.A09 = str;
        this.A08 = interfaceC60442pS;
        this.A0A = str2;
        this.A07 = new C7DO(userSession);
        this.A0B = C18U.A01(C06090Tz.A05, userSession, 36597583833729898L);
    }
}
