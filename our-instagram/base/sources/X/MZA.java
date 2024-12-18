package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes9.dex */
public class MZA implements Comparable, C6C3, AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public int A00;
    public long A01;
    public long A02;
    public InterfaceC58150PqF A03;
    public MZB A04;
    public C5TA A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C41101vI A09;
    public final UserSession A0A;
    public final Context A0B;
    public final AudioManager A0C;
    public final C38194Gqz A0D;
    public final InterfaceC60442pS A0E;
    public final boolean A0F;

    public static final void A05(MZA mza, int i) {
        AbstractC24321Hb.A00(mza.A0A).A00(false);
        MZB mzb = mza.A04;
        if (mzb != null) {
            ((C4S7) mzb).A00 = false;
            C5TA c5ta = mza.A05;
            if (c5ta != null) {
                c5ta.A02(0.0f, i);
                mza.A09.A03(mza);
                mza.A02();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A06(MZA mza, int i) {
        AbstractC24321Hb.A00(mza.A0A).A00(true);
        MZB mzb = mza.A04;
        if (mzb != null) {
            ((C4S7) mzb).A00 = true;
            C5TA c5ta = mza.A05;
            if (c5ta != null) {
                c5ta.A02(1.0f, i);
                mza.A09.A04(mza);
                mza.A03();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0A() {
        this.A03 = null;
        A0F(false);
        A0E(false);
        C5TA c5ta = this.A05;
        if (c5ta != null) {
            this.A00 = c5ta.A06.getCurrentPositionMs();
            c5ta.A0A("fragment_paused");
            this.A05 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void A0C(MZB mzb) {
        int i;
        int intValue;
        Boolean bool;
        if (this.A05 == null) {
            this.A05 = new C5TA(this.A0B, this.A0A, this.A0D, this, this.A0E.getModuleName());
        }
        this.A01 = System.currentTimeMillis();
        this.A00 = A07(mzb);
        this.A04 = mzb;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        if (this.A06 && (bool = AbstractC24321Hb.A00(this.A0A).A01) != null && bool.booleanValue()) {
            r4 = 1;
        }
        MZB mzb2 = this.A04;
        if (mzb2 != null) {
            ((C4S7) mzb2).A00 = r4;
        }
        Object obj = ((C4S7) mzb).A03;
        if (obj != null) {
            C38321qM c38321qM = (C38321qM) obj;
            C75363a3 CFR = c38321qM.CFR();
            Integer num = mzb.A06;
            if (num == null || (i = num.intValue()) == 0) {
                i = (int) this.A02;
            }
            if (i > 0 && this.A0F) {
                CFR.A01 = 0;
                CFR.A00 = i;
                C5TA c5ta = this.A05;
                if (c5ta != null) {
                    c5ta.A06.ERX(true);
                }
            }
            C5TA c5ta2 = this.A05;
            if (c5ta2 != null) {
                c5ta2.A08(mzb.A05.BMQ(), CFR, mzb, c38321qM.A0M, this.A0E.getModuleName(), AbstractC25230BEn.A01(r4), -1, A07(mzb), mzb.A07, true);
            }
            if (num != null && (intValue = num.intValue()) != 0) {
                this.A02 = intValue;
                return;
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r5.equals(r0.A05) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0I(X.InterfaceC58117Ppg r5, X.C38321qM r6) {
        /*
            r4 = this;
            r3 = 0
            X.MZB r0 = r4.A04
            r2 = 1
            if (r0 == 0) goto Lf
            X.Ppg r0 = r0.A05
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 != 0) goto L10
        Lf:
            r1 = 0
        L10:
            X.MZB r0 = r4.A04
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r0.A03
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L3a
        L1c:
            if (r1 == 0) goto L26
            if (r2 != 0) goto L25
            java.lang.String r0 = "media_mismatch"
            r4.A0D(r0, r3)
        L25:
            return r2
        L26:
            if (r2 == 0) goto L25
            X.MZB r0 = r4.A04
            if (r0 == 0) goto L3c
            r0.A05 = r5
            X.5TA r1 = r4.A05
            if (r1 == 0) goto L25
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r0 = r5.BMQ()
            r1.A07(r0)
            return r2
        L3a:
            r2 = 0
            goto L1c
        L3c:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZA.A0I(X.Ppg, X.1qM):boolean");
    }

    public final boolean A0J(C38321qM c38321qM) {
        MZB mzb;
        C5TA c5ta;
        return c38321qM != null && c38321qM.BRp() == EnumC40111tc.A0a && (mzb = this.A04) != null && c38321qM.equals(((C4S7) mzb).A03) && (c5ta = this.A05) != null && c5ta.A0F();
    }

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        InterfaceC58150PqF interfaceC58150PqF = this.A03;
        Object obj = c4s7.A03;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
        C38321qM c38321qM = (C38321qM) obj;
        if (interfaceC58150PqF != null) {
            interfaceC58150PqF.DzY(c38321qM);
        }
    }

    @Override // X.C6C3
    public void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCues(List list) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if (((X.C4S7) r2).A00 != true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r10 != 25) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
    
        if (r10 != 24) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r1 = r8.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r1 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        r1.adjustStreamVolume(3, r2, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r1.getStreamVolume(3) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        A05(r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        throw X.AbstractC166987dD.A14("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003c, code lost:
    
        r2 = -1;
     */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKey(android.view.View r9, int r10, android.view.KeyEvent r11) {
        /*
            r8 = this;
            r0 = 2
            X.C14360o3.A0B(r11, r0)
            boolean r0 = r8.A06
            r2 = 0
            if (r0 == 0) goto L26
            X.5TA r1 = r8.A05
            if (r1 == 0) goto L26
            X.MZB r0 = r8.A04
            if (r0 == 0) goto L26
            r5 = 1
            boolean r0 = r1.A0E()
            if (r0 != r5) goto L26
            int r0 = r11.getAction()
            if (r0 != 0) goto L26
            r7 = 25
            r6 = 24
            if (r10 == r7) goto L27
            if (r10 == r6) goto L27
        L26:
            return r2
        L27:
            X.MZB r2 = r8.A04
            if (r2 == 0) goto L30
            boolean r1 = r2.A00
            r0 = 1
            if (r1 == r5) goto L31
        L30:
            r0 = 0
        L31:
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L51
            r3 = 1
            if (r10 == r7) goto L3c
        L38:
            r3 = 0
            r2 = 1
            if (r10 == r6) goto L3d
        L3c:
            r2 = -1
        L3d:
            android.media.AudioManager r1 = r8.A0C
            if (r1 == 0) goto L74
            r0 = 3
            r1.adjustStreamVolume(r0, r2, r5)
            if (r3 == 0) goto L50
            int r0 = r1.getStreamVolume(r0)
            if (r0 != 0) goto L50
            A05(r8, r10)
        L50:
            return r5
        L51:
            if (r2 == 0) goto L79
            java.lang.Object r0 = r2.A03
            X.1qM r0 = (X.C38321qM) r0
            if (r0 == 0) goto L79
            boolean r0 = r0.A4g()
            if (r0 == 0) goto L70
            if (r10 == r6) goto L6c
            android.media.AudioManager r1 = r8.A0C
            if (r1 == 0) goto L38
            r0 = 3
            int r0 = r1.getStreamVolume(r0)
            if (r0 <= 0) goto L38
        L6c:
            A06(r8, r10)
            return r5
        L70:
            r8.A04()
            goto L38
        L74:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L79:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZA.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    @Override // X.C6C3
    public void onLoop(int i) {
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        InterfaceC58150PqF interfaceC58150PqF = this.A03;
        C38321qM c38321qM = (C38321qM) c4s7.A03;
        if (interfaceC58150PqF != null && c38321qM != null) {
            interfaceC58150PqF.DaG(c38321qM);
        }
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public void onVideoPlayerError(C4S7 c4s7, String str) {
        C14360o3.A0B(c4s7, 0);
        C38321qM c38321qM = (C38321qM) c4s7.A03;
        if (c38321qM != null && c38321qM.A4x()) {
            C0K8.A03(MZA.class, "Local file error, not using it anymore!");
            c38321qM.A0M = null;
        }
    }

    @Override // X.C6C3
    public void onVideoStartedPlaying(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        InterfaceC58150PqF interfaceC58150PqF = this.A03;
        Object obj = c4s7.A03;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.media.Media");
        C38321qM c38321qM = (C38321qM) obj;
        if (interfaceC58150PqF != null) {
            interfaceC58150PqF.E06(c38321qM);
        }
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        MZB mzb = (MZB) c4s7;
        AbstractC167007dF.A0x(mzb.A05.BGn());
        if (this.A06) {
            MZB mzb2 = this.A04;
            if (mzb2 != null) {
                C38321qM c38321qM = (C38321qM) ((C4S7) mzb2).A03;
                if (c38321qM != null) {
                    if (c38321qM.A4g()) {
                        if (((C4S7) mzb).A00) {
                            A03();
                            return;
                        } else {
                            A02();
                            return;
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A04();
        }
    }

    private final void A00() {
        C5TA c5ta;
        C38321qM A08;
        if (this.A04 != null && (c5ta = this.A05) != null && (A08 = A08()) != null) {
            UserSession userSession = this.A0A;
            Context context = this.A0B;
            int currentPositionMs = c5ta.A06.getCurrentPositionMs();
            MZB mzb = this.A04;
            if (mzb != null) {
                int i = mzb.A01;
                C5TA c5ta2 = this.A05;
                if (c5ta2 != null) {
                    int Azm = c5ta2.A06.Azm();
                    MZB mzb2 = this.A04;
                    if (mzb2 != null) {
                        int i2 = ((C4S7) mzb2).A01;
                        C5TA c5ta3 = this.A05;
                        if (c5ta3 != null) {
                            C133145zg.A00(context, userSession, A08, this.A0E, currentPositionMs, i, Azm, i2, 0, c5ta3.A00() - mzb2.A00, ((C4S7) mzb2).A00);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    private final void A01() {
        C5TA c5ta;
        C38321qM A08;
        if (this.A04 != null && (c5ta = this.A05) != null && (A08 = A08()) != null) {
            UserSession userSession = this.A0A;
            Context context = this.A0B;
            int currentPositionMs = c5ta.A06.getCurrentPositionMs();
            MZB mzb = this.A04;
            if (mzb != null) {
                int i = mzb.A04;
                C5TA c5ta2 = this.A05;
                if (c5ta2 != null) {
                    int Azm = c5ta2.A06.Azm();
                    MZB mzb2 = this.A04;
                    if (mzb2 != null) {
                        int i2 = ((C4S7) mzb2).A01;
                        C5TA c5ta3 = this.A05;
                        if (c5ta3 != null) {
                            C133145zg.A01(context, userSession, A08, this.A0E, currentPositionMs, i, Azm, i2, 0, c5ta3.A00() - mzb2.A03, ((C4S7) mzb2).A00);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    private final void A02() {
        C30R c30r;
        MZB mzb = this.A04;
        if (mzb != null) {
            InterfaceC58117Ppg interfaceC58117Ppg = mzb.A05;
            C38321qM A08 = A08();
            if (A08 != null && AbstractC76273bX.A02(A08)) {
                c30r = C30R.A0C;
            } else {
                c30r = C30R.A0B;
            }
            C14360o3.A0A(c30r);
            interfaceC58117Ppg.ABQ(c30r, R.drawable.instagram_volume_off_pano_filled_24);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A03() {
        C30R c30r;
        MZB mzb = this.A04;
        if (mzb != null) {
            InterfaceC58117Ppg interfaceC58117Ppg = mzb.A05;
            C38321qM A08 = A08();
            if (A08 != null && AbstractC76273bX.A02(A08)) {
                c30r = C30R.A0C;
            } else {
                c30r = C30R.A0B;
            }
            C14360o3.A0A(c30r);
            interfaceC58117Ppg.ABQ(c30r, R.drawable.instagram_volume_pano_filled_24);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A04() {
        C30R c30r;
        MZB mzb = this.A04;
        if (mzb != null) {
            InterfaceC58117Ppg interfaceC58117Ppg = mzb.A05;
            C38321qM A08 = A08();
            if (A08 != null && AbstractC76273bX.A02(A08)) {
                c30r = C30R.A08;
            } else {
                c30r = C30R.A07;
            }
            C14360o3.A0A(c30r);
            interfaceC58117Ppg.ABQ(c30r, R.drawable.instagram_volume_none_pano_filled_24);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final C38321qM A08() {
        MZB mzb = this.A04;
        if (mzb != null) {
            return (C38321qM) ((C4S7) mzb).A03;
        }
        return null;
    }

    public final void A09() {
        C5TA c5ta = this.A05;
        if (c5ta != null && this.A04 != null) {
            c5ta.A09("peek");
            C38321qM A08 = A08();
            if (A08 != null) {
                A08.CdW();
            }
        }
        if (this.A06) {
            this.A09.A03(this);
        }
    }

    public final void A0B() {
        MZB mzb = this.A04;
        C5TA c5ta = this.A05;
        if (c5ta != null && mzb != null) {
            c5ta.A0B("resume", false);
            if (this.A06) {
                boolean z = false;
                Boolean bool = AbstractC24321Hb.A00(this.A0A).A01;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                }
                ((C4S7) mzb).A00 = z;
                this.A09.A04(this);
            }
        }
    }

    public void A0D(String str, boolean z) {
        C5TA c5ta = this.A05;
        if (c5ta != null) {
            C38321qM A08 = A08();
            if (A08 != null && A08.CdW()) {
                if (this.A08) {
                    A01();
                }
                if (this.A07) {
                    A00();
                }
            }
            this.A00 = c5ta.A06.getCurrentPositionMs();
            c5ta.A0C(str, z);
        }
    }

    public final void A0E(boolean z) {
        int i;
        C5TA c5ta = this.A05;
        MZB mzb = this.A04;
        if (mzb != null && c5ta != null) {
            C38321qM A08 = A08();
            if (A08 != null && A08.CdW() && this.A07 && !z && c5ta.A0F()) {
                A00();
            } else if (!this.A07 && z) {
                C5TA c5ta2 = this.A05;
                if (c5ta2 != null) {
                    i = c5ta2.A06.getCurrentPositionMs();
                } else {
                    i = this.A00;
                }
                mzb.A01 = i;
                mzb.A00 = c5ta.A00();
            }
        }
        this.A07 = z;
    }

    public final void A0F(boolean z) {
        int i;
        C5TA c5ta = this.A05;
        MZB mzb = this.A04;
        if (mzb != null && c5ta != null) {
            C38321qM A08 = A08();
            if (A08 != null && A08.CdW() && this.A08 && !z && c5ta.A0E()) {
                A01();
            } else if (!this.A08 && z) {
                C5TA c5ta2 = this.A05;
                if (c5ta2 != null) {
                    i = c5ta2.A06.getCurrentPositionMs();
                } else {
                    i = this.A00;
                }
                mzb.A04 = i;
                mzb.A03 = c5ta.A00();
            }
        }
        this.A08 = z;
    }

    public final boolean A0G() {
        C5TA c5ta = this.A05;
        if (c5ta != null) {
            C3Q0 c3q0 = ((C4QT) c5ta.A06).A0M;
            C14360o3.A07(c3q0);
            if (c3q0 != C3Q0.IDLE) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0H() {
        C5TA c5ta = this.A05;
        if (c5ta != null && !c5ta.A0E()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        MZA mza = (MZA) obj;
        C14360o3.A0B(mza, 0);
        boolean A0G = A0G();
        boolean A0G2 = mza.A0G();
        if (A0G) {
            if (A0G2) {
                return 0;
            }
            return 1;
        }
        if (!A0G2) {
            return 0;
        }
        return -1;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        float f;
        if (this.A06) {
            if (i != -3) {
                if (i != -2) {
                    if (i != -1) {
                        if (i != 1 && i != 2 && i != 3 && i != 4) {
                            return;
                        } else {
                            f = 1.0f;
                        }
                    } else {
                        A05(this, 0);
                        return;
                    }
                } else {
                    f = 0.0f;
                }
            } else {
                f = 0.5f;
            }
            C5TA c5ta = this.A05;
            if (c5ta != null) {
                c5ta.A02(f, 0);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.C6C3
    public final void onCompletion() {
        InterfaceC58150PqF interfaceC58150PqF = this.A03;
        if (interfaceC58150PqF != null) {
            interfaceC58150PqF.onCompletion();
        }
    }

    @Override // X.C6C3
    public void onProgressUpdate(int i, int i2, boolean z) {
        C5TA c5ta = this.A05;
        if (c5ta != null) {
            long j = this.A02;
            if (j > 0 && i > j && !this.A0F) {
                c5ta.A04(0, false);
                onLoop(-1);
            }
        }
    }

    @Override // X.C6C3
    public void onStopVideo(String str, boolean z) {
        if (this.A06) {
            C14120nc.A00().ATO(new NGD(this));
        }
        MZB mzb = this.A04;
        if (mzb != null) {
            InterfaceC58117Ppg interfaceC58117Ppg = mzb.A05;
            if (z) {
                interfaceC58117Ppg.BGn().clearAnimation();
                interfaceC58117Ppg.BGn().setVisibility(0);
            }
        }
        this.A04 = null;
    }

    public MZA(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, long j) {
        this.A0B = context;
        this.A0A = userSession;
        this.A0E = interfaceC60442pS;
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.A0C = audioManager;
        this.A09 = new C41101vI(audioManager, userSession);
        this.A0D = new C38194Gqz(userSession, interfaceC60442pS, str, new MW9(this, 4), new MW9(this, 5), new MW9(this, 6));
        this.A0F = C18U.A06(C06090Tz.A05, userSession, 36320111765954628L);
        this.A02 = j;
    }

    public int A07(MZB mzb) {
        return mzb.A02;
    }

    @Override // X.C6C3
    public void onProgressStateChanged(boolean z) {
    }
}
