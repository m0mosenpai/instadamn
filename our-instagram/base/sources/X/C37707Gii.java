package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Gii, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37707Gii implements JIM {
    public C120985dq A01;
    public C37644Ghd A02;
    public C147416kR A03;
    public C43647JSf A04;
    public C4S7 A05;
    public C4QW A06;
    public C25370BKn A07;
    public Runnable A09;
    public final AbstractC59962oe A0A;
    public final UserSession A0B;
    public final C30P A0C;
    public final String A0E;
    public final IB2 A0G;
    public final java.util.Set A0F = new CopyOnWriteArraySet();
    public Integer A08 = C05F.A00;
    public final C4ZE A0D = new C4ZE(this);
    public long A00 = -1;

    @Override // X.JIM
    public final int E3c(String str) {
        C147416kR c147416kR = this.A03;
        if (c147416kR != null) {
            c147416kR.A01();
        }
        C43647JSf c43647JSf = this.A04;
        if (c43647JSf != null) {
            c43647JSf.A00();
        }
        C4QW c4qw = this.A06;
        if (c4qw == null) {
            return 0;
        }
        if (Be4() == C3Q0.PLAYING) {
            c4qw.E3d(str);
        }
        return c4qw.getCurrentPositionMs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f8, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fa, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fd, code lost:
    
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0210, code lost:
    
        if (X.AbstractC167017dG.A1b(r5, r5.A1G, X.C17280tP.A4G, 13) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011e, code lost:
    
        if (new X.C37712Gin(r23.A0B, r10.getModuleName(), A00(r25)).A04() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        r25.CdW();
        r10.getModuleName();
        A00(r25);
        r4 = r23.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012c, code lost:
    
        if (r4 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012e, code lost:
    
        r4 = (X.C4QT) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0130, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0132, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        if (X.C4R8.A01(r4.A0m, r4.A0Q) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013e, code lost:
    
        r4.A0a = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0140, code lost:
    
        r1 = r23.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
    
        if (r1 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        r1.Eol("unknown", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        r23.A08 = X.C05F.A00;
        r5 = r25.A0N;
        r14 = r23.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r14, 36319746695175836L) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015e, code lost:
    
        r0 = r23.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0160, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0162, code lost:
    
        r0 = r0.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0164, code lost:
    
        if (r0 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0166, code lost:
    
        r1 = r25.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
    
        if (r1 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        r1 = X.AbstractC25225BEi.A0x(r1, r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0176, code lost:
    
        if (X.AbstractC37655Gho.A03(r25) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0178, code lost:
    
        if (r1 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017e, code lost:
    
        if (r1.Cff() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0180, code lost:
    
        r0 = X.C128085qc.A02(r1);
        r5 = r1.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
    
        r1 = new X.C4S7(r0, r29);
        r0 = r23.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        if (r0 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018f, code lost:
    
        r13 = r23.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0191, code lost:
    
        if (r13 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0193, code lost:
    
        r4 = null;
        r11 = new X.RunnableC37708Gij(r25, r13, r14, r27.A03(), r1, r0, r10.getModuleName(), r5, r28, r30, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ad, code lost:
    
        r23.A09 = r11;
        r23.A05 = r1;
        r0 = r23.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        if (r0 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b5, code lost:
    
        r1 = ((X.C4QT) r0).A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        if (r1 != X.C3Q0.IDLE) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bd, code lost:
    
        if (r11 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bf, code lost:
    
        r11.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c2, code lost:
    
        r23.A09 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ce, code lost:
    
        if (X.C17280tP.A4E.A00().A0Z() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d4, code lost:
    
        if (r25.CdW() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d6, code lost:
    
        r0 = r23.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d8, code lost:
    
        if (r0 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
    
        r5 = ((X.C4QT) r0).A0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01de, code lost:
    
        if (r5 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e0, code lost:
    
        r5.setExtraFeatureDebugInfo(X.AnonymousClass001.A19("id=", r25.getId(), " isSensitive=", r25.A06().A11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f5, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f6, code lost:
    
        r1 = r4;
     */
    @Override // X.JIM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E5w(X.C62862tP r24, X.C120985dq r25, X.C37644Ghd r26, X.C25370BKn r27, float r28, int r29, int r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37707Gii.E5w(X.2tP, X.5dq, X.Ghd, X.BKn, float, int, int, boolean, boolean):boolean");
    }

    @Override // X.JIM
    public final boolean EKg(String str, boolean z) {
        String str2;
        C147416kR c147416kR = this.A03;
        if (c147416kR != null && (str2 = c147416kR.A01) != null) {
            C147416kR.A00(c147416kR, str2);
        }
        C43647JSf c43647JSf = this.A04;
        if (c43647JSf != null) {
            c43647JSf.A01();
        }
        C3Q0 Be4 = Be4();
        C4QW c4qw = this.A06;
        if (c4qw == null) {
            return false;
        }
        if (Be4 != C3Q0.PAUSED && Be4 != C3Q0.PREPARED) {
            return false;
        }
        c4qw.E4T(str, z);
        return true;
    }

    @Override // X.JIM
    public final void A9A(C37560GgG c37560GgG) {
        this.A0F.add(c37560GgG);
    }

    @Override // X.JIM
    public final void AHp() {
        this.A0F.clear();
    }

    @Override // X.JIM
    public final C9C1 AuC() {
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            return c4qw.AuC();
        }
        return null;
    }

    @Override // X.JIM
    public final C120985dq AuE() {
        return this.A01;
    }

    @Override // X.JIM
    public final C3Q0 Be4() {
        C3Q0 c3q0;
        C4QW c4qw = this.A06;
        if (c4qw == null || (c3q0 = ((C4QT) c4qw).A0M) == null) {
            return C3Q0.IDLE;
        }
        return c3q0;
    }

    @Override // X.JIM
    public final C4S7 CFH() {
        return this.A05;
    }

    @Override // X.JIM
    public final C25370BKn CFh() {
        return this.A07;
    }

    @Override // X.JIM
    public final boolean CKi() {
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            return c4qw.CKi();
        }
        return false;
    }

    @Override // X.JIM
    public final boolean Cfm() {
        C4QW c4qw = this.A06;
        if (c4qw != null && c4qw.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // X.JIM
    public final void EE4(String str) {
        C147416kR c147416kR = this.A03;
        if (c147416kR != null) {
            c147416kR.A04();
        }
        this.A03 = null;
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            c4qw.E3d(str);
        }
        C4QW c4qw2 = this.A06;
        if (c4qw2 != null) {
            c4qw2.EE4(str);
        }
        this.A06 = null;
        this.A07 = null;
    }

    @Override // X.JIM
    public final void EFb(C37560GgG c37560GgG) {
        this.A0F.remove(c37560GgG);
    }

    @Override // X.JIM
    public final void EKu() {
        C4QT c4qt;
        C95334Qt c95334Qt;
        C4QW c4qw = this.A06;
        if (c4qw != null && (c95334Qt = (c4qt = (C4QT) c4qw).A0K) != null) {
            c95334Qt.EKu();
            c4qt.A0K.start();
        }
    }

    @Override // X.JIM
    public final void EMg(int i, boolean z) {
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            c4qw.EMg(i, z);
        }
    }

    @Override // X.JIM
    public final void EMl() {
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            c4qw.EMg(0, false);
        }
    }

    @Override // X.JIM
    public final boolean EPc() {
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            return c4qw.EPc();
        }
        return false;
    }

    @Override // X.JIM
    public final void EQ0(boolean z) {
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            c4qw.EQ0(z);
        }
    }

    @Override // X.JIM
    public final void Eb1(float f) {
        C95334Qt c95334Qt;
        C4QW c4qw = this.A06;
        if (c4qw != null && (c95334Qt = ((C4QT) c4qw).A0K) != null) {
            c95334Qt.A07(f);
        }
    }

    @Override // X.JIM
    public final void EbH(String str) {
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            c4qw.EbH(str);
        }
    }

    @Override // X.JIM
    public final void Ef8(boolean z, String str) {
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            c4qw.Ef8(z, str);
        }
    }

    @Override // X.JIM
    public final void EhI(float f, int i) {
        C147416kR c147416kR = this.A03;
        if (c147416kR != null) {
            c147416kR.A05(f);
        }
        C4QW c4qw = this.A06;
        if (c4qw != null) {
            c4qw.EhI(f, i);
        }
        C4S7 c4s7 = this.A05;
        if (c4s7 != null) {
            c4s7.A00 = AbstractC167007dF.A1O((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
    }

    public C37707Gii(AbstractC59962oe abstractC59962oe, UserSession userSession, C30P c30p, IB2 ib2, String str) {
        this.A0A = abstractC59962oe;
        this.A0B = userSession;
        this.A0C = c30p;
        this.A0G = ib2;
        this.A0E = str;
    }

    private final List A00(C120985dq c120985dq) {
        Integer num;
        C37644Ghd c37644Ghd;
        if (AbstractC37655Gho.A03(c120985dq) && (c37644Ghd = this.A02) != null) {
            num = c37644Ghd.A0H;
        } else {
            num = null;
        }
        UserSession userSession = this.A0B;
        C75363a3 A0A = c120985dq.A0A(userSession, num);
        if (A0A == null) {
            return null;
        }
        if (!C18U.A06(C06090Tz.A05, userSession, 36321932831893401L)) {
            String A04 = A0A.A04();
            if (A04 == null) {
                return null;
            }
            return AbstractC166987dD.A1J(A04);
        }
        return A0A.A01(this.A0A.getContext());
    }

    @Override // X.JIM
    public final boolean CsD(C120985dq c120985dq, C25370BKn c25370BKn) {
        C3Q0 c3q0;
        AbstractC167017dG.A1N(c25370BKn, c120985dq);
        C25370BKn c25370BKn2 = this.A07;
        if (c25370BKn2 != null && c25370BKn2 == c25370BKn && AbstractC50102Ry.A00(this.A01, c120985dq)) {
            C4QW c4qw = this.A06;
            if (c4qw != null) {
                c3q0 = ((C4QT) c4qw).A0M;
            } else {
                c3q0 = null;
            }
            if (c3q0 != C3Q0.IDLE) {
                return false;
            }
        }
        return true;
    }
}
