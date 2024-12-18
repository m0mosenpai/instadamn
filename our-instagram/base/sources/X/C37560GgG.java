package X;

import android.content.Context;
import android.media.AudioManager;
import android.view.View;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.GgG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37560GgG implements InterfaceC31048Dkm, AudioManager.OnAudioFocusChangeListener {
    public C07X A00;
    public C41230IMv A01;
    public C41699IdS A02;
    public String A03;
    public InterfaceC16820sZ A04;
    public InterfaceC16820sZ A05;
    public boolean A06;
    public boolean A07;
    public final AudioManager A08;
    public final C41101vI A09;
    public final ClipsViewerConfig A0A;
    public final InterfaceC31077DlK A0B;
    public final InterfaceC11380iw A0C;
    public final InterfaceC60022ok A0D;
    public final UserSession A0E;
    public final InterfaceC15680qO A0F;
    public final C23031Ai A0G;
    public final C37706Gih A0H;
    public final java.util.Set A0I;
    public final java.util.Set A0J;
    public final AtomicReference A0K;
    public final InterfaceC09390do A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final Context A0O;
    public final C4SZ A0P;
    public final MVO A0Q;
    public final AbstractC37552Gg8 A0R;
    public final InterfaceC16820sZ A0S;
    public final InterfaceC16820sZ A0T;
    public final InterfaceC16820sZ A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    public C37560GgG(Context context, AudioManager audioManager, C4SZ c4sz, ClipsViewerConfig clipsViewerConfig, InterfaceC31077DlK interfaceC31077DlK, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MVO mvo, AbstractC37552Gg8 abstractC37552Gg8, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC25229BEm.A1O(audioManager, 6, mvo);
        this.A0O = context;
        this.A0A = clipsViewerConfig;
        this.A0E = userSession;
        this.A0S = interfaceC16820sZ;
        this.A0P = c4sz;
        this.A08 = audioManager;
        this.A0R = abstractC37552Gg8;
        this.A0B = interfaceC31077DlK;
        this.A0T = interfaceC16820sZ2;
        this.A0N = z;
        this.A0W = z2;
        this.A0V = z3;
        this.A0U = interfaceC16820sZ3;
        this.A0Q = mvo;
        this.A0C = interfaceC11380iw;
        this.A0H = new C37706Gih(z4);
        this.A0L = AbstractC09440dt.A01(C37703Gie.A00);
        this.A0I = AbstractC31171DnF.A0l();
        this.A0J = AbstractC31171DnF.A0l();
        this.A09 = new C41101vI(audioManager, userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0X = C18U.A06(c06090Tz, userSession, 36323487610252587L);
        this.A0K = new AtomicReference(null);
        this.A0M = C18U.A06(c06090Tz, userSession, 36323487610449198L);
        this.A0D = new C37918GmF(this, 2);
        this.A0G = AbstractC23021Ah.A00(userSession);
        Ox4 ox4 = new Ox4(this, 2);
        C18150uz.A0B.A03(ox4);
        this.A0F = ox4;
    }

    private final void A08(C120985dq c120985dq, C25370BKn c25370BKn, int i, boolean z) {
        C37644Ghd A02 = A02(c120985dq, this);
        if (A02.A0J == null && !A02.A0Y) {
            A0A(c120985dq, c25370BKn, "start", i, false, z);
        } else {
            if (!z) {
                return;
            }
            Iterator it = this.A0J.iterator();
            while (it.hasNext()) {
                ((JIK) it.next()).E0F(i, "currentItemStateIsPausedByUser");
            }
        }
    }

    public final void A0H() {
        C25370BKn A04;
        C120985dq A01;
        if (A03(this).A00.isResumed() && C37546Gg2.A00(A03(this).A01.A0N().A09) != 0 && (A04 = A04(this)) != null && (A01 = A01(this)) != null) {
            if (A02(A01, this).A0J != null) {
                A09(A01, A04, A00(this), true, false);
            } else {
                A0W("resume", false);
            }
        }
    }

    public final void A0M(C120985dq c120985dq, int i) {
        C25370BKn A02;
        if (i != -1 && (A02 = A03(this).A02(i)) != null) {
            this.A03 = c120985dq.getId();
            A08(c120985dq, A02, i, true);
            A06(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b1, code lost:
    
        if (r0.A0n != null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0S(X.C120985dq r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37560GgG.A0S(X.5dq, java.lang.String, boolean, boolean):void");
    }

    public final void A0W(String str, boolean z) {
        C120985dq A01;
        C25370BKn A04 = A04(this);
        if (A04 != null && (A01 = A01(this)) != null) {
            A0A(A01, A04, str, A00(this), z, false);
        }
    }

    public final boolean A0c(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 0);
        if (A0a() && c120985dq.A0V && (c120985dq.A01 != EnumC129395t1.A03 || this.A0A.A0Q == null)) {
            if (!AbstractC76643c9.A0H(this.A0E, c120985dq.A02)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC31048Dkm
    public final synchronized void A99(JIH jih) {
        C14360o3.A0B(jih, 0);
        this.A0I.add(jih);
    }

    @Override // X.InterfaceC31048Dkm
    public final C4S7 Av4() {
        JIM jim;
        C4S7 c4s7 = null;
        try {
            C37563GgJ A03 = A03(this);
            C25370BKn A02 = A03.A02(A03.A00());
            if (A02 == null || (jim = (JIM) this.A0H.A01.get(A02)) == null) {
                return null;
            }
            c4s7 = jim.CFH();
            return c4s7;
        } catch (NullPointerException unused) {
            return c4s7;
        }
    }

    @Override // X.InterfaceC31048Dkm
    public final synchronized void EFa(JIH jih) {
        C14360o3.A0B(jih, 0);
        this.A0I.remove(jih);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C120985dq A01(X.C37560GgG r4) {
        /*
            boolean r0 = r4.A0V
            r3 = 0
            X.GgJ r1 = A03(r4)
            if (r0 == 0) goto L22
            int r0 = r1.A00()
            X.BKn r0 = r1.A02(r0)
            if (r0 == 0) goto L1e
            X.5dq r2 = r0.A00
            if (r2 == 0) goto L1f
            X.5t1 r1 = r2.A01
        L19:
            X.5t1 r0 = X.EnumC129395t1.A08
            if (r1 == r0) goto L21
            return r2
        L1e:
            r2 = r3
        L1f:
            r1 = r3
            goto L19
        L21:
            return r3
        L22:
            X.GhJ r0 = r1.A03
            X.5dq r2 = r0.A02()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37560GgG.A01(X.GgG):X.5dq");
    }

    public static final C37563GgJ A03(C37560GgG c37560GgG) {
        Object obj = new WeakReference(c37560GgG.A0S.invoke()).get();
        if (obj != null) {
            return (C37563GgJ) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static JIM A05(C37560GgG c37560GgG, Object obj) {
        return (JIM) c37560GgG.A0H.A01.get(obj);
    }

    private final void A06(int i) {
        String str;
        int i2 = i - 1;
        int i3 = i + 1;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        if (i2 > i3) {
            return;
        }
        while (true) {
            if (i2 != i) {
                C25370BKn A02 = A03(this).A02(i2);
                if (A02 != null) {
                    C120985dq A03 = A03(this).A03.A03(i2);
                    C120985dq c120985dq = A02.A00;
                    String str2 = null;
                    if (A03 != null) {
                        str = A03.getId();
                    } else {
                        str = null;
                    }
                    if (c120985dq != null) {
                        str2 = c120985dq.getId();
                    }
                    if (C14360o3.A0K(str, str2) && A03 != null) {
                        A09(A03, A02, i2, true, false);
                        A0l.add(A03.getId());
                    }
                }
            }
            if (i2 != i3) {
                i2++;
            } else {
                return;
            }
        }
    }

    private final void A07(int i) {
        int i2;
        C120985dq AuE;
        Collection values = this.A0H.A01.values();
        ArrayList<JIM> A1E = AbstractC166987dD.A1E();
        AbstractC001800i.A0r(values, A1E);
        for (JIM jim : A1E) {
            C4S7 CFH = jim.CFH();
            if (CFH != null) {
                i2 = CFH.A01;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            if (Math.abs(i - i2) > 1 && (AuE = jim.AuE()) != null) {
                A0D(AuE.getId());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c0, code lost:
    
        if (r6 > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c6, code lost:
    
        if (r5 != null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A09(X.C120985dq r23, X.C25370BKn r24, int r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37560GgG.A09(X.5dq, X.BKn, int, boolean, boolean):void");
    }

    private final void A0A(C120985dq c120985dq, C25370BKn c25370BKn, String str, int i, boolean z, boolean z2) {
        InterfaceC678133v interfaceC678133v;
        InterfaceC678133v interfaceC678133v2;
        UserSession userSession = this.A0E;
        if (C1LE.A07(userSession)) {
            C25370BKn.A01(c25370BKn, false, false);
        } else {
            IgImageView igImageView = c25370BKn.A02;
            if (igImageView != null) {
                AbstractC125325le.A05(new View[]{igImageView}, true);
            }
        }
        if (!this.A06) {
            C75113Zb c75113Zb = A02(c120985dq, this).A0E;
            if (c75113Zb != null && c75113Zb.A10 == C05F.A01 && !C18U.A06(C06090Tz.A06, userSession, 36315541921271176L)) {
                C25370BKn A02 = A03(this).A02(i);
                if (A02 != null) {
                    A09(c120985dq, A02, i, true, false);
                }
                A0S(null, "end_scene", false, true);
                if (z2) {
                    Iterator it = this.A0J.iterator();
                    while (it.hasNext()) {
                        ((JIK) it.next()).E0F(i, "mediaStateEndSceneState_showing_or_start");
                    }
                    return;
                }
                return;
            }
            if (z2) {
                Iterator it2 = this.A0J.iterator();
                while (it2.hasNext()) {
                    ((JIK) it2.next()).E0G(i);
                }
            }
            A09(c120985dq, c25370BKn, i, false, z2);
            JIM A05 = A05(this, c25370BKn);
            if (A05 != null) {
                C37644Ghd A022 = A02(c120985dq, this);
                if (c120985dq.A02 != null && !AbstractC37677GiE.A00(c120985dq, A022, userSession)) {
                    boolean z3 = this.A0X;
                    boolean A03 = AbstractC37655Gho.A03(c120985dq);
                    if (!z3 ? !A03 || this.A0A.A1n : !A03 && !z) {
                        int i2 = c120985dq.A00;
                        if (i2 > 0) {
                            A05.EMg(i2, false);
                            C41230IMv c41230IMv = this.A01;
                            if (c41230IMv != null && (interfaceC678133v2 = c41230IMv.A00) != null) {
                                interfaceC678133v2.seekTo(c41230IMv.A01 + i2);
                            }
                            this.A0R.A0R(c120985dq, 0);
                        }
                    }
                    C41230IMv c41230IMv2 = this.A01;
                    if (c41230IMv2 != null && (interfaceC678133v = c41230IMv2.A00) != null) {
                        interfaceC678133v.E4S();
                    }
                    A0B(c120985dq, A05, this, -5);
                    InterfaceC31077DlK interfaceC31077DlK = this.A0B;
                    interfaceC31077DlK.EX0(c120985dq, null);
                    interfaceC31077DlK.EWf(c120985dq, false);
                    interfaceC31077DlK.EWj(c120985dq, false);
                    boolean EKg = A05.EKg(str, z);
                    for (JIH jih : this.A0I) {
                        if (!EKg) {
                            jih.DzO(c120985dq, A03(this).A01(c120985dq), A03(this), c25370BKn, this.A0A.A1v);
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (!C18U.A06(c06090Tz, userSession, 36317418821325977L) && !C18U.A06(c06090Tz, userSession, 36317418821260440L)) {
                                Iterator it3 = this.A0J.iterator();
                                while (it3.hasNext()) {
                                    ((JIK) it3.next()).E02(i);
                                }
                            }
                        }
                    }
                    C06090Tz c06090Tz2 = C06090Tz.A05;
                    if (!C18U.A06(c06090Tz2, userSession, 36317418821325977L) && C18U.A06(c06090Tz2, userSession, 36317418821260440L)) {
                        Iterator it4 = this.A0J.iterator();
                        while (it4.hasNext()) {
                            ((JIK) it4.next()).E02(i);
                        }
                    }
                    if (C18U.A06(c06090Tz2, userSession, 36317418821325977L) && EKg) {
                        Iterator it5 = this.A0J.iterator();
                        while (it5.hasNext()) {
                            ((JIK) it5.next()).E02(i);
                        }
                    }
                }
            }
        }
    }

    private final void A0D(String str) {
        C37706Gih c37706Gih = this.A0H;
        JIM jim = (JIM) c37706Gih.A00.remove(str);
        Iterator A15 = AbstractC166997dE.A15(c37706Gih.A01);
        while (A15.hasNext()) {
            if (C14360o3.A0K(((Map.Entry) A15.next()).getValue(), jim)) {
                A15.remove();
            }
        }
        if (jim != null) {
            jim.EE4("out_of_playback_range");
            jim.EFb(this);
        }
    }

    public final void A0G() {
        Iterator it = this.A0J.iterator();
        while (it.hasNext()) {
            ((JIK) it.next()).E0C(A03(this).A00());
        }
    }

    public final void A0N(C120985dq c120985dq, int i) {
        if (this.A0N) {
            A07(A00(this));
        } else {
            if (c120985dq == null && (c120985dq = A03(this).A03.A03(i)) == null) {
                return;
            }
            A0D(c120985dq.getId());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r2 < r15) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0O(X.C120985dq r18, int r19) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37560GgG.A0O(X.5dq, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r7, 36320506904453742L) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r10.EPc() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0R(X.C120985dq r21, X.JIM r22, boolean r23) {
        /*
            r20 = this;
            r18 = 0
            r3 = 1
            r2 = r20
            r12 = r21
            X.Ghd r4 = A02(r12, r2)
            java.util.Set r0 = r2.A0J
            java.util.Iterator r5 = r0.iterator()
        L11:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r1 = r5.next()
            X.JIK r1 = (X.JIK) r1
            int r0 = r4.A06()
            r6 = r23
            r1.DzN(r0, r6)
            goto L11
        L27:
            com.instagram.common.session.UserSession r7 = r2.A0E
            X.0Tz r5 = X.C06090Tz.A05
            r0 = 36323092473457605(0x810ba900062bc5, double:3.0342081693436715E-306)
            boolean r0 = X.C18U.A06(r5, r7, r0)
            if (r0 == 0) goto L39
            r2.A0Y(r3)
        L39:
            boolean r0 = r12.CdW()
            if (r0 == 0) goto L4d
            X.0Tz r6 = X.C06090Tz.A06
            r0 = 36320506904453742(0x81094f001a226e, double:3.032573045094378E-306)
            boolean r1 = X.C18U.A06(r6, r7, r0)
            r0 = 1
            if (r1 != 0) goto L4e
        L4d:
            r0 = 0
        L4e:
            r11 = 0
            if (r0 == 0) goto Lba
            X.BKn r0 = A04(r2)
            if (r0 == 0) goto Laf
            X.JIM r10 = A05(r2, r0)
            if (r10 == 0) goto L101
            boolean r9 = r10.CKi()
        L61:
            X.0iw r8 = r2.A0C
            java.util.concurrent.atomic.AtomicReference r0 = r2.A0K
            java.lang.Object r6 = r0.get()
            java.lang.Number r6 = (java.lang.Number) r6
            r0 = 36320506904453742(0x81094f001a226e, double:3.032573045094378E-306)
            X.C18U.A06(r5, r7, r0)
            X.0wW r1 = X.AbstractC12220kQ.A01(r8, r7)
            java.lang.String r0 = "ig_reels_alternative_audio_track_usage"
            X.0Ai r5 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto La5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.lang.String r0 = "has_alternative_track"
            java.lang.Boolean r1 = X.AbstractC31173DnH.A0d(r5, r1, r0, r3)
            java.lang.String r0 = "should_use_alternative_track"
            r5.A7v(r0, r1)
            if (r6 == 0) goto Lff
            float r0 = r6.floatValue()
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L9d:
            java.lang.String r0 = "current_volume"
            r5.A8I(r0, r1)
            r5.Cht()
        La5:
            if (r9 == 0) goto Laf
            if (r10 == 0) goto Laf
            boolean r0 = r10.EPc()
            if (r0 != 0) goto Lba
        Laf:
            X.0iw r0 = r2.A0C
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "Setting alternative track unexpectedly failed"
            X.AbstractC12120kG.A07(r1, r0, r11)
        Lba:
            X.MVO r13 = r2.A0Q
            X.0iw r0 = r2.A0C
            java.lang.String r14 = r0.getModuleName()
            int r16 = r4.A06()
            X.07X r0 = r2.A00
            if (r0 == 0) goto Lce
            X.07T r11 = r0.getLifecycle()
        Lce:
            X.C14360o3.A0B(r14, r3)
            X.19L r0 = r13.A0N
            r15 = 0
            X.MVR r10 = new X.MVR
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.AbstractC166987dD.A1Z(r10, r0)
            X.BKn r1 = r22.CFh()
            if (r1 == 0) goto Lfe
            X.BKn r0 = A04(r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lfe
            java.lang.Integer r0 = r4.A0J
            if (r0 != 0) goto Lfe
            int r17 = A00(r2)
            java.lang.String r16 = "start"
            r13 = r2
            r14 = r12
            r15 = r1
            r19 = r18
            r13.A0A(r14, r15, r16, r17, r18, r19)
        Lfe:
            return
        Lff:
            r1 = 0
            goto L9d
        L101:
            r9 = 0
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37560GgG.A0R(X.5dq, X.JIM, boolean):void");
    }

    public final void A0T(C25370BKn c25370BKn) {
        int i;
        InterfaceC678133v interfaceC678133v;
        Map map = this.A0H.A01;
        for (C25370BKn c25370BKn2 : map.keySet()) {
            if (!C14360o3.A0K(c25370BKn2, c25370BKn)) {
                C14360o3.A0B(c25370BKn2, 0);
                JIM jim = (JIM) map.get(c25370BKn2);
                if (jim != null) {
                    C3Q0 Be4 = jim.Be4();
                    if (Be4 == C3Q0.PLAYING || Be4 == C3Q0.STOPPING) {
                        jim.E3c("out_of_playback_range");
                    }
                    C120985dq AuE = jim.AuE();
                    if (AuE != null) {
                        C37644Ghd A01 = A03(this).A01(AuE);
                        C75113Zb c75113Zb = A01.A0E;
                        if (c75113Zb != null && c75113Zb.A0p()) {
                            i = A01.A06();
                        } else {
                            i = -1;
                        }
                        C37556GgC A0N = A03(this).A01.A0N();
                        if ((A0N.A04() > i || i > A0N.A06()) && !this.A0M) {
                            jim.EMl();
                            C41230IMv c41230IMv = this.A01;
                            if (c41230IMv != null && (interfaceC678133v = c41230IMv.A00) != null) {
                                interfaceC678133v.seekTo(c41230IMv.A01);
                            }
                        }
                        InterfaceC31077DlK interfaceC31077DlK = this.A0B;
                        interfaceC31077DlK.EX0(AuE, null);
                        interfaceC31077DlK.EWf(AuE, false);
                    }
                    C25370BKn.A01(c25370BKn2, false, false);
                }
            }
        }
    }

    public final void A0V(String str) {
        Iterator it = this.A0J.iterator();
        while (it.hasNext()) {
            ((JIK) it.next()).DZE(A00(this), str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r1.A00, 36331012393288821L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0a() {
        /*
            r6 = this;
            com.instagram.common.session.UserSession r5 = r6.A0E
            boolean r4 = r6.A07
            com.instagram.clips.intf.ClipsViewerConfig r0 = r6.A0A
            com.instagram.clips.intf.ClipsViewerSource r0 = r0.A0J
            int r1 = r0.ordinal()
            r0 = 84
            if (r1 != r0) goto L28
            X.1Pp r1 = X.AbstractC26331Po.A00(r5)
            boolean r0 = X.C26341Pp.A02
            if (r0 == 0) goto L28
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36331012393288821(0x8112dd00084475, double:3.03921675853589E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L29
        L28:
            r0 = 0
        L29:
            r1 = r0 ^ 1
            r0 = 0
            boolean r0 = X.C4AJ.A00(r5, r0, r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37560GgG.A0a():boolean");
    }

    public final boolean A0e(String str) {
        JIM jim = (JIM) this.A0H.A00.get(str);
        if (jim != null) {
            return jim.Cfm();
        }
        return false;
    }

    public static int A00(C37560GgG c37560GgG) {
        return A03(c37560GgG).A00();
    }

    public static C37644Ghd A02(C120985dq c120985dq, C37560GgG c37560GgG) {
        return A03(c37560GgG).A01(c120985dq);
    }

    public static C25370BKn A04(C37560GgG c37560GgG) {
        C37563GgJ A03 = A03(c37560GgG);
        return A03.A02(A03.A00());
    }

    public static final void A0B(C120985dq c120985dq, JIM jim, C37560GgG c37560GgG, int i) {
        if (c37560GgG.A0c(c120985dq)) {
            c37560GgG.A0C(jim, 1.0f, i);
            c37560GgG.A09.A04(c37560GgG);
        } else {
            c37560GgG.A0C(jim, 0.0f, i);
            c37560GgG.A09.A03(c37560GgG);
        }
    }

    private final void A0C(JIM jim, float f, int i) {
        boolean z;
        jim.EhI(f, i);
        C120985dq A01 = A01(this);
        if (A01 != null) {
            C75113Zb c75113Zb = A02(A01, this).A0E;
            if (c75113Zb != null) {
                C4S7 Av4 = Av4();
                if (Av4 != null) {
                    z = Av4.A00;
                } else {
                    z = false;
                }
                if (c75113Zb.A1r != z) {
                    c75113Zb.A1r = z;
                    C75113Zb.A00(c75113Zb, 55);
                }
            }
            if (!C14360o3.A0I((Float) this.A0K.getAndSet(Float.valueOf(f)), f) || i == -5) {
                UserSession userSession = this.A0E;
                if (C1LE.A07(userSession) && C18U.A06(C06090Tz.A05, userSession, 36321211277452504L)) {
                    C11T.A03(new J48(this));
                }
            }
        }
    }

    public final C9C1 A0E() {
        JIM A05;
        C25370BKn A04 = A04(this);
        if (A04 == null || (A05 = A05(this, A04)) == null) {
            return null;
        }
        return A05.AuC();
    }

    public final C25370BKn A0F() {
        return A04(this);
    }

    public final void A0I(float f) {
        JIM A05;
        C25370BKn A04 = A04(this);
        if (A04 != null && (A05 = A05(this, A04)) != null) {
            A05.Eb1(f);
        }
    }

    public final void A0J(int i) {
        C120985dq A01;
        InterfaceC678133v interfaceC678133v;
        C25370BKn A04 = A04(this);
        if (A04 != null && (A01 = A01(this)) != null) {
            this.A0R.A0R(A01, i);
            JIM A05 = A05(this, A04);
            if (A05 != null) {
                A05.EMg(i, true);
                C41230IMv c41230IMv = this.A01;
                if (c41230IMv != null && (interfaceC678133v = c41230IMv.A00) != null) {
                    interfaceC678133v.seekTo(c41230IMv.A01 + i);
                }
                A0W("resume", true);
            }
        }
    }

    public final void A0K(int i) {
        JIM A05;
        C4S7 CFH;
        Object obj;
        int i2;
        ClipsWatchAndBrowseData clipsWatchAndBrowseData;
        EnumC37732Gj7 enumC37732Gj7;
        C25370BKn A04 = A04(this);
        if (A04 != null && (A05 = A05(this, A04)) != null && (CFH = A05.CFH()) != null && (obj = CFH.A03) != null) {
            C120985dq c120985dq = (C120985dq) obj;
            if (c120985dq.A0V) {
                C38321qM c38321qM = c120985dq.A02;
                UserSession userSession = this.A0E;
                if (!AbstractC76643c9.A0H(userSession, c38321qM)) {
                    boolean z = !CFH.A00;
                    AbstractC24321Hb.A00(userSession).A00(z);
                    CFH.A00 = z;
                    A0B(c120985dq, A05, this, i);
                    if (!C1LE.A07(userSession)) {
                        C120985dq A01 = A01(this);
                        if (A01 != null && A01.A0K() && ((clipsWatchAndBrowseData = this.A0A.A0K) == null || !clipsWatchAndBrowseData.A0M)) {
                            C75113Zb c75113Zb = A02(A01, this).A0E;
                            if (c75113Zb != null) {
                                enumC37732Gj7 = c75113Zb.A0n;
                            } else {
                                enumC37732Gj7 = null;
                            }
                            if (enumC37732Gj7 == EnumC37732Gj7.A04) {
                                if (clipsWatchAndBrowseData != null && !clipsWatchAndBrowseData.A0E) {
                                    return;
                                }
                            } else if (enumC37732Gj7 == EnumC37732Gj7.A02) {
                                return;
                            }
                        }
                        Context context = A04.A08.getContext();
                        if (z) {
                            i2 = R.drawable.instagram_volume_pano_filled_24;
                        } else {
                            i2 = R.drawable.instagram_volume_off_pano_filled_24;
                        }
                        C25370BKn.A00(context.getDrawable(i2), A04);
                        if (C18U.A06(C06090Tz.A05, userSession, 36321962896664491L)) {
                            InterfaceC19610xo A0w = AbstractC166987dD.A0w(this.A0G);
                            A0w.E77("last_clips_volume_is_mute", !z);
                            A0w.apply();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            C25370BKn.A00(A04.A08.getContext().getDrawable(R.drawable.instagram_volume_none_pano_filled_24), A04);
        }
    }

    public final void A0L(C120985dq c120985dq) {
        C37644Ghd A02 = A02(c120985dq, this);
        Iterator it = this.A0J.iterator();
        while (it.hasNext()) {
            ((JIK) it.next()).DzM(c120985dq, A02.A06());
        }
    }

    public final void A0P(C120985dq c120985dq, int i, int i2, boolean z) {
        C75113Zb c75113Zb = A03(this).A01(c120985dq).A0E;
        if (c75113Zb != null) {
            c75113Zb.A0C(i);
        }
        Iterator it = this.A0I.iterator();
        while (it.hasNext()) {
            ((JIH) it.next()).Dby(c120985dq, i, i2, z);
        }
    }

    public final void A0Q(C120985dq c120985dq, C37644Ghd c37644Ghd, JIM jim) {
        C25370BKn CFh = jim.CFh();
        if (CFh != null) {
            C37563GgJ A03 = A03(this);
            if (CFh == A03.A02(A03.A00())) {
                AbstractC37677GiE.A00(c120985dq, c37644Ghd, this.A0E);
            }
        }
    }

    public final void A0U(JIM jim, boolean z) {
        C25370BKn CFh = jim.CFh();
        if (CFh != null) {
            Iterator it = this.A0I.iterator();
            while (it.hasNext()) {
                ((JIH) it.next()).Dbv(CFh, z);
            }
        }
    }

    public final void A0X(boolean z) {
        C07S c07s;
        C07S c07s2;
        C07T lifecycle;
        C07T lifecycle2;
        int A00 = A00(this);
        if (z) {
            Iterator it = this.A0J.iterator();
            while (it.hasNext()) {
                ((JIK) it.next()).E0E(A00);
            }
        }
        C07X c07x = this.A00;
        if (c07x != null && (lifecycle2 = c07x.getLifecycle()) != null) {
            c07s = lifecycle2.A07();
        } else {
            c07s = null;
        }
        if (c07s != C07S.RESUMED) {
            if (z) {
                for (JIK jik : this.A0J) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LifeCycleNotResumed: ");
                    C07X c07x2 = this.A00;
                    if (c07x2 != null && (lifecycle = c07x2.getLifecycle()) != null) {
                        c07s2 = lifecycle.A07();
                    } else {
                        c07s2 = null;
                    }
                    sb.append(c07s2);
                    jik.E0F(A00, sb.toString());
                }
                return;
            }
            return;
        }
        C120985dq A01 = A01(this);
        C25370BKn A04 = A04(this);
        A0T(A04);
        if (A04 != null) {
            if (A01 != null) {
                A08(A01, A04, A00, z);
            }
            int A002 = A00(this);
            if (this.A0N) {
                A07(A002);
            }
            A06(A002);
            if (A01 != null) {
                return;
            }
        }
        if (z) {
            Iterator it2 = this.A0J.iterator();
            while (it2.hasNext()) {
                ((JIK) it2.next()).E0F(A00, "currentViewHolderOrClipItemIsNull");
            }
        }
    }

    public final void A0Y(boolean z) {
        JIM A05;
        C25370BKn A04 = A04(this);
        if (A04 != null && (A05 = A05(this, A04)) != null) {
            A05.EQ0(z);
        }
    }

    public final void A0Z(boolean z, String str) {
        JIM A05;
        C25370BKn A04 = A04(this);
        if (A04 != null && (A05 = A05(this, A04)) != null) {
            A05.Ef8(z, str);
        }
    }

    public final boolean A0b() {
        C120985dq c120985dq;
        C4S7 Av4 = Av4();
        if (Av4 != null && (c120985dq = (C120985dq) Av4.A03) != null && !A0c(c120985dq)) {
            return false;
        }
        return true;
    }

    public final boolean A0d(C25370BKn c25370BKn) {
        JIM A05 = A05(this, c25370BKn);
        if (A05 != null) {
            return A05.Cfm();
        }
        return false;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        JIM A05;
        C25370BKn A04 = A04(this);
        if (A04 != null && (A05 = A05(this, A04)) != null) {
            float f = 0.5f;
            if (i != -3) {
                f = 0.0f;
                if (i != -2) {
                    if (i != -1) {
                        if (i != 1 && i != 2 && i != 3 && i != 4) {
                            return;
                        } else {
                            f = 1.0f;
                        }
                    } else {
                        A0C(A05, 0.0f, 0);
                        this.A09.A03(this);
                        return;
                    }
                }
            }
            A0C(A05, f, 0);
        }
    }
}
