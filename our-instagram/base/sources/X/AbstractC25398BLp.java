package X;

import android.content.Context;
import android.util.TypedValue;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;

/* renamed from: X.BLp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25398BLp extends AbstractC25399BLq {
    public float A00;
    public int A01;
    public C2XI A02;
    public ReboundViewPager A03;
    public BWT A04;
    public boolean A05;
    public final Context A06;
    public final C1I4 A07;
    public final C2XI A08;
    public final C2XI A09;
    public final C2XI A0A;
    public final C2XI A0B;
    public final C2XI A0C;
    public final C120985dq A0D;
    public final C37644Ghd A0E;
    public final InterfaceC31077DlK A0F;
    public final InterfaceC11380iw A0G;
    public final UserSession A0H;
    public final C75113Zb A0I;
    public final List A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC30855DhU A0N;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36321211277386967L) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09() {
        /*
            r6 = this;
            r1 = r6
            boolean r0 = r6 instanceof X.C25673BWj
            if (r0 == 0) goto L56
            X.BWj r1 = (X.C25673BWj) r1
            X.CbX r0 = r1.A00
            boolean r0 = r0.A03
            if (r0 == 0) goto L56
            X.2XI r5 = r6.A0B
            java.lang.Object r0 = r5.A00
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r0 != 0) goto L56
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r6.A03
            if (r4 == 0) goto L56
            X.BWT r0 = r6.A04
            if (r0 != 0) goto L45
            X.Ghd r0 = r6.A0E
            boolean r0 = r0.A0N
            if (r0 != 0) goto L45
            boolean r0 = r6.A05
            if (r0 == 0) goto L57
            com.instagram.common.session.UserSession r3 = r6.A0H
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36325055273317035(0x810d72000332ab, double:3.0354494518783356E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L45
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321211277386967(0x8109f3000024d7, double:3.0330184933736314E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L57
        L45:
            X.Ghd r0 = r6.A0E
            boolean r0 = r0.A0N
            if (r0 == 0) goto L56
            java.lang.Object r0 = r5.A00
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r0 != 0) goto L56
            r6.A08()
        L56:
            return
        L57:
            java.lang.Integer r0 = r6.A05()
            if (r0 == 0) goto L7b
            int r0 = r0.intValue()
            long r1 = (long) r0
            X.BWT r0 = new X.BWT
            r0.<init>(r6, r1)
        L67:
            r6.A04 = r0
            if (r0 == 0) goto L70
            r0.A01 = r4
            r0.A01()
        L70:
            X.DlK r2 = r6.A0F
            if (r2 == 0) goto L56
            X.5dq r1 = r6.A0D
            r0 = 1
            r2.EVG(r1, r0)
            return
        L7b:
            r0 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25398BLp.A09():void");
    }

    public void A0B(ReboundViewPager reboundViewPager) {
        float applyDimension;
        this.A03 = reboundViewPager;
        reboundViewPager.A0P(this);
        reboundViewPager.A0K(AbstractC25230BEn.A0B(this.A0A));
        if (A0E()) {
            reboundViewPager.setScrollMode(EnumC74213Va.A02);
            reboundViewPager.setCarouselModeEnabled(true);
            applyDimension = 0.0f;
        } else {
            reboundViewPager.setScrollMode(EnumC74213Va.A03);
            reboundViewPager.setCarouselModeEnabled(false);
            reboundViewPager.A0C = -1;
            applyDimension = TypedValue.applyDimension(1, 2.0f, reboundViewPager.getResources().getDisplayMetrics());
        }
        reboundViewPager.setPageSpacing(applyDimension);
    }

    public final int A01() {
        if (this instanceof C25673BWj) {
            return ((C25673BWj) this).A00.A00;
        }
        if (!(this instanceof C5D) && !(this instanceof BNN)) {
            return (int) ((C5E) this).A00;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r1 == 0.0f) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A02() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C25673BWj
            if (r0 == 0) goto Lc
            r0 = r5
            X.BWj r0 = (X.C25673BWj) r0
            X.CbX r0 = r0.A00
            int r0 = r0.A00
            return r0
        Lc:
            boolean r0 = r5 instanceof X.C5E
            if (r0 == 0) goto L33
            r4 = r5
            X.C5E r4 = (X.C5E) r4
            com.instagram.common.session.UserSession r3 = r4.A0H
            X.0Tz r2 = X.AbstractC166997dE.A0U(r3)
            r0 = 36321713789216472(0x810a68000a26d8, double:3.033336283878063E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L2b
            float r1 = r4.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L31
        L2b:
            float r0 = r4.A00
            float r1 = X.C5E.A00(r4, r0)
        L31:
            int r0 = (int) r1
            return r0
        L33:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25398BLp.A02():int");
    }

    public final InterfaceC31012DkB A04() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C5D) {
            return ((C5D) this).A00;
        }
        if (this instanceof C25673BWj) {
            interfaceC09390do = ((C25673BWj) this).A01;
        } else {
            if (this instanceof BNN) {
                return ((BNN) this).A00;
            }
            interfaceC09390do = ((C5E) this).A05;
        }
        return (InterfaceC31012DkB) interfaceC09390do.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r0 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A05() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C25673BWj
            if (r0 == 0) goto Lc
            r0 = r9
            X.BWj r0 = (X.C25673BWj) r0
            X.CbX r0 = r0.A00
            java.lang.Integer r0 = r0.A01
            return r0
        Lc:
            boolean r0 = r9 instanceof X.C5E
            if (r0 == 0) goto L63
            r5 = r9
            X.C5E r5 = (X.C5E) r5
            com.instagram.common.session.UserSession r6 = r5.A0H
            r8 = 0
            X.0Tz r7 = X.AbstractC25225BEi.A0j(r6, r8)
            r0 = 37166138719797669(0x840a68001101a5, double:3.5673540102038857E-306)
            double r3 = X.C18U.A00(r7, r6, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L60
            X.C14360o3.A0B(r6, r8)
            r0 = 36321713789216472(0x810a68000a26d8, double:3.033336283878063E-306)
            boolean r0 = X.C18U.A06(r7, r6, r0)
            if (r0 != 0) goto L60
            r0 = 36321713788626639(0x810a68000126cf, double:3.0333362835050503E-306)
            boolean r3 = X.C18U.A06(r7, r6, r0)
            boolean r2 = X.AbstractC28342CeU.A02(r6)
            java.util.List r0 = r5.A0I()
            int r1 = r0.size()
            r0 = 6
            boolean r0 = X.AbstractC25230BEn.A1S(r1, r0)
            if (r3 == 0) goto L59
            if (r2 == 0) goto L59
            r1 = 2500(0x9c4, float:3.503E-42)
            if (r0 != 0) goto L5b
        L59:
            r1 = 1500(0x5dc, float:2.102E-42)
        L5b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L60:
            r1 = 2000(0x7d0, float:2.803E-42)
            goto L5b
        L63:
            boolean r0 = r9 instanceof X.BNN
            if (r0 == 0) goto L69
            r0 = 0
            return r0
        L69:
            r1 = 3000(0xbb8, float:4.204E-42)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25398BLp.A05():java.lang.Integer");
    }

    public final String A06() {
        if (!(this instanceof BNN) && !(this instanceof C5D)) {
            if (this instanceof C5E) {
                return "progress_dots";
            }
            return ((C25673BWj) this).A00.A02;
        }
        return "dots";
    }

    public final String A07() {
        InterfaceC87893vx interfaceC87893vx;
        String C87;
        if (!(this instanceof BNN) && (this instanceof C25673BWj)) {
            C25673BWj c25673BWj = (C25673BWj) this;
            if (c25673BWj.A0E() && (interfaceC87893vx = c25673BWj.A00.A04) != null && (C87 = interfaceC87893vx.C87()) != null && C87.length() != 0) {
                return C87;
            }
        }
        return "under_hero";
    }

    public final void A0A(int i) {
        if (this instanceof C5C) {
            C5E c5e = (C5E) this;
            int i2 = 2;
            if (AbstractC28342CeU.A02(c5e.A0H)) {
                i2 = 3;
            }
            int A0H = i / (c5e.A0H() * i2);
            C2XI c2xi = ((AbstractC25398BLp) c5e).A02;
            if (A0H != AbstractC25230BEn.A0B(c2xi) && A0H >= 0 && A0H < c5e.A03()) {
                AbstractC25227BEk.A1E(c2xi, A0H);
                return;
            }
            return;
        }
        int i3 = 2;
        if (AbstractC28342CeU.A02(this.A0H)) {
            i3 = 3;
        }
        int i4 = i / i3;
        C2XI c2xi2 = this.A02;
        if (i4 == AbstractC25230BEn.A0B(c2xi2) || i4 < 0 || i4 >= A03()) {
            return;
        }
        AbstractC25227BEk.A1E(c2xi2, i4);
    }

    public final boolean A0C() {
        if (this instanceof BNN) {
            return false;
        }
        if (this instanceof C5D) {
            return AbstractC25397BLo.A00(this.A0D);
        }
        return this.A0D.A0F();
    }

    public final boolean A0D() {
        if (!(this instanceof BNN) && !(this instanceof C5D) && !(this instanceof C25673BWj)) {
            return true;
        }
        return false;
    }

    public final boolean A0E() {
        if (!(this instanceof BNN) && !(this instanceof C5D) && (this instanceof C25673BWj)) {
            return AbstractC167007dF.A1X(AdFormatType.A05, this.A0D.A0E);
        }
        return false;
    }

    public final boolean A0F() {
        if (!(this instanceof C5D) && (this instanceof C25673BWj)) {
            return AbstractC167007dF.A1X(AdFormatType.A07, this.A0D.A0E);
        }
        return false;
    }

    public final boolean A0G() {
        long j;
        long j2;
        C120985dq c120985dq = this.A0D;
        boolean A04 = AbstractC37655Gho.A04(c120985dq);
        C38321qM c38321qM = (C38321qM) this.A09.A00;
        if (c38321qM != null) {
            j = (long) c38321qM.A0l();
        } else {
            j = 0;
        }
        boolean A03 = AbstractC37655Gho.A03(c120985dq);
        if (!A04) {
            return false;
        }
        if (A03) {
            j2 = 10;
        } else {
            j2 = 15;
        }
        if (j < j2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.2XI, X.Bjp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC25398BLp(android.content.Context r8, X.C120985dq r9, X.C37644Ghd r10, X.InterfaceC31077DlK r11, X.InterfaceC11380iw r12, com.instagram.common.session.UserSession r13, X.C75113Zb r14, X.InterfaceC30855DhU r15) {
        /*
            r7 = this;
            r7.<init>()
            r7.A06 = r8
            r7.A0D = r9
            r7.A0H = r13
            r7.A0G = r12
            r7.A0E = r10
            r7.A0I = r14
            r7.A0F = r11
            r7.A0N = r15
            java.util.List r0 = r9.A0R
            r7.A0J = r0
            boolean r0 = r14.A2W
            r6 = 1
            r2 = -1
            r5 = 0
            if (r0 == 0) goto Lc6
            boolean r0 = r9.A0F()
            if (r0 == 0) goto Lc6
            int r1 = r14.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 == r2) goto Ld6
            if (r0 == 0) goto Ld6
        L2e:
            X.2XI r4 = X.AbstractC25230BEn.A0c(r1)
            r7.A0A = r4
            boolean r0 = r7.A0D()
            if (r0 == 0) goto L3b
            r2 = 0
        L3b:
            X.2XI r0 = X.AbstractC25230BEn.A0c(r2)
            r7.A02 = r0
            X.BLr r3 = new X.BLr
            r3.<init>(r7)
            int r1 = X.AbstractC25230BEn.A0B(r4)
            X.BLp r0 = r3.A00
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r1)
        L54:
            X.Bjp r2 = new X.Bjp
            r2.<init>(r0)
            X.BLs r1 = new X.BLs
            r1.<init>(r2, r4, r3)
            java.util.Set r0 = r4.A01
            r0.add(r1)
            r7.A09 = r2
            java.lang.Float r1 = X.AbstractC25227BEk.A0l()
            X.2XI r0 = new X.2XI
            r0.<init>(r1)
            r7.A08 = r0
            boolean r0 = r14.A2W
            if (r0 == 0) goto Lc2
            X.5dq r0 = r7.A0D
            boolean r0 = r0.A0F()
            if (r0 == 0) goto Lc2
        L7c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            X.2XI r0 = new X.2XI
            r0.<init>(r1)
            r7.A0B = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            X.2XI r0 = new X.2XI
            r0.<init>(r1)
            r7.A0C = r0
            X.BOg r0 = X.C25467BOg.A00
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r7.A0M = r0
            r0 = 38
            X.DGq r0 = X.C29902DGq.A01(r7, r0)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r7.A0K = r0
            X.BOh r0 = X.C25468BOh.A00
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r7.A0L = r0
            int r0 = X.AbstractC13880nE.A0A(r8)
            float r0 = (float) r0
            float r0 = X.AbstractC13880nE.A01(r8, r0)
            r7.A00 = r0
            r1 = 6
            X.BdB r0 = new X.BdB
            r0.<init>(r7, r1)
            r7.A07 = r0
            return
        Lc2:
            r6 = 0
            goto L7c
        Lc4:
            r0 = 0
            goto L54
        Lc6:
            boolean r0 = r15 instanceof X.C26237Bj6
            if (r0 == 0) goto Ld6
            X.Bj6 r15 = (X.C26237Bj6) r15
            java.lang.Integer r0 = r15.A00
            if (r0 == 0) goto Ld6
            int r1 = r0.intValue()
            goto L2e
        Ld6:
            r1 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25398BLp.<init>(android.content.Context, X.5dq, X.Ghd, X.DlK, X.0iw, com.instagram.common.session.UserSession, X.3Zb, X.DhU):void");
    }

    public final int A03() {
        if (A0D()) {
            if (this instanceof C5C) {
                C5E c5e = (C5E) this;
                int A0I = AbstractC25231BEo.A0I(c5e.A0J);
                int i = 2;
                if (AbstractC28342CeU.A02(c5e.A0H)) {
                    i = 3;
                }
                return (int) Math.ceil(A0I / (c5e.A0H() * i));
            }
            int A0I2 = AbstractC25231BEo.A0I(this.A0J);
            if (AbstractC28342CeU.A02(this.A0H)) {
                return (A0I2 / 3) - 1;
            }
            int i2 = A0I2 % 2;
            if (A0I2 == 0) {
                return 1;
            }
            if (i2 == 0) {
                return (A0I2 / 2) - 1;
            }
            return A0I2 / 2;
        }
        List list = this.A0J;
        if (list != null) {
            return list.size();
        }
        return 1;
    }

    public final void A08() {
        if (A0F()) {
            this.A0B.A00(AbstractC166997dE.A0b());
            BWT bwt = this.A04;
            if (bwt != null) {
                bwt.A00();
                bwt.A01 = null;
                bwt.A00();
            }
        }
    }
}
