package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U7l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66290U7l {
    public int A00;
    public int A01;
    public AbstractC70663Fe A02;
    public C69457Vng A03;
    public C66289U7k A04;
    public boolean A05;
    public final Context A06;
    public final UserSession A07;
    public final String A08;
    public final C70723Wfo A09 = new C70723Wfo(this, 11);
    public final ViewOnTouchListenerC60632pm A0A;
    public final C68752VbV A0B;
    public final boolean A0C;

    public final void A05(XDm xDm, C33P c33p, C3FP c3fp) {
        C14360o3.A0B(c3fp, 0);
        RecyclerView recyclerView = c3fp.A03;
        C14360o3.A07(recyclerView);
        this.A02 = recyclerView.A0D;
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0A;
        UserSession userSession = this.A07;
        C66289U7k c66289U7k = new C66289U7k(recyclerView, viewOnTouchListenerC60632pm, userSession, this, xDm);
        C68752VbV c68752VbV = this.A0B;
        C69457Vng c69457Vng = new C69457Vng(AbstractC166997dE.A0L(recyclerView), this, c66289U7k, c3fp);
        c3fp.A04.add(c69457Vng.A07);
        AbstractC61812ri abstractC61812ri = recyclerView.A0E;
        if (abstractC61812ri != null && abstractC61812ri != c3fp.A02) {
            throw new IllegalStateException("RecyclerView should not have fling listeners set directly!");
        }
        recyclerView.A0E = c3fp.A02;
        recyclerView.A14(c69457Vng.A09);
        recyclerView.A12(c69457Vng.A08);
        if (c68752VbV != null) {
            c68752VbV.A00 = c69457Vng;
        }
        this.A03 = c69457Vng;
        this.A04 = c66289U7k;
        if (c33p != null) {
            c33p.A01 = this;
            c33p.A0F.A02 = this;
        }
        AbstractC25651Mw.A00(userSession).A01(this.A09, C42240InQ.class);
    }

    public final void A07(C33P c33p, C3FP c3fp) {
        C14360o3.A0B(c3fp, 0);
        if (c33p != null) {
            c33p.A01 = null;
            c33p.A0F.A02 = null;
        }
        C69457Vng c69457Vng = this.A03;
        if (c69457Vng != null) {
            C68752VbV c68752VbV = this.A0B;
            RecyclerView recyclerView = c3fp.A03;
            C14360o3.A07(recyclerView);
            AbstractC61812ri abstractC61812ri = c69457Vng.A07;
            List list = c3fp.A04;
            list.remove(abstractC61812ri);
            if (list.isEmpty()) {
                recyclerView.A0E = null;
            }
            recyclerView.A15(c69457Vng.A09);
            recyclerView.A13(c69457Vng.A08);
            if (c68752VbV != null) {
                c68752VbV.A00 = null;
            }
            this.A03 = null;
            this.A02 = null;
            this.A04 = null;
            AbstractC25651Mw.A00(this.A07).A02(this.A09, C42240InQ.class);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(C66290U7l c66290U7l) {
        AbstractC70663Fe abstractC70663Fe;
        C66289U7k c66289U7k = c66290U7l.A04;
        if (c66289U7k != null && (abstractC70663Fe = c66290U7l.A02) != null) {
            int A00 = AbstractC72193Ls.A00(abstractC70663Fe);
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = c66290U7l.A0A;
            if (viewOnTouchListenerC60632pm.A01 < 2.0f && c66289U7k.A02(c66289U7k.A00) == A00) {
                AbstractC72193Ls.A05(abstractC70663Fe, A00, (int) (viewOnTouchListenerC60632pm.A00 - viewOnTouchListenerC60632pm.A01));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.4yt, X.4ys, X.4yu] */
    public static final void A01(C66290U7l c66290U7l, float f, int i, boolean z) {
        AbstractC70663Fe abstractC70663Fe;
        int i2;
        C66289U7k c66289U7k = c66290U7l.A04;
        if (c66289U7k != null && (abstractC70663Fe = c66290U7l.A02) != null) {
            java.util.Set AZX = c66289U7k.A04.AZX();
            Integer valueOf = Integer.valueOf(i);
            boolean contains = AZX.contains(valueOf);
            XDm xDm = c66289U7k.A04;
            boolean containsKey = xDm.C9S().containsKey(valueOf);
            if (z) {
                i2 = c66290U7l.A00;
            } else {
                i2 = c66290U7l.A01;
            }
            Iterator it = new HashSet().iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue < i) {
                    i3 += c66289U7k.A01(intValue);
                }
            }
            int i4 = i2 + i3;
            if (contains) {
                i4 = Math.max(i4, ((abstractC70663Fe.A00 - c66289U7k.A01(i)) - i4) / 2);
            } else if (containsKey) {
                i4 += AbstractC167017dG.A0K((Number) xDm.C9S().get(valueOf));
            }
            AbstractC70663Fe abstractC70663Fe2 = c66290U7l.A02;
            if (abstractC70663Fe2 != 0 && i != -1) {
                ?? c110814yt = new C110814yt(c66290U7l.A06);
                c110814yt.A00 = -1.0f;
                c110814yt.A00 = i;
                c110814yt.A01 = i4;
                c110814yt.A00 = f;
                abstractC70663Fe2.A10(c110814yt);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (X.C14360o3.A0K(r1, "feed_contextual_keyword") != false) goto L19;
     */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.4yt, X.UGR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(X.C66290U7l r10, boolean r11) {
        /*
            X.U7k r3 = r10.A04
            r6 = 0
            r5 = 1
            if (r3 == 0) goto Ld7
            int r0 = r3.A00
            int r1 = r0 + 1
            X.XDm r0 = r3.A04
            java.util.List r0 = r0.AZY()
            int r0 = r0.size()
            if (r1 >= r0) goto Ld7
            int r0 = r3.A00
            r3.A02(r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            int r4 = r3.A02(r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            int r2 = r3.A02(r0)
            X.3Fe r9 = r3.A02
            int r8 = X.AbstractC72193Ls.A02(r9)
            if (r2 <= r8) goto L4a
            int r1 = r2 - r8
            r0 = 2
            if (r1 > r0) goto L7e
            X.XDm r0 = r3.A04
            java.util.Set r1 = r0.B5o()
            int r0 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L7e
        L4a:
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            r2 = 1
            int r1 = r0 + 1
            X.XDm r0 = r3.A04
            java.util.List r0 = r0.AZY()
            int r0 = r0.size()
            if (r1 < r0) goto L60
            r2 = 0
        L60:
            r0 = r2 ^ 1
            r3.A01 = r0
            java.lang.String r1 = r10.A08
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L78
            java.lang.String r0 = "feed_contextual_keyword"
            boolean r1 = X.C14360o3.A0K(r1, r0)
            r0 = 1085276160(0x40b00000, float:5.5)
            if (r1 == 0) goto L7a
        L78:
            r0 = 1090781184(0x41040000, float:8.25)
        L7a:
            A01(r10, r0, r4, r5)
        L7d:
            return r5
        L7e:
            X.C14360o3.A0B(r9, r6)
            int r7 = r9.A00
            int r0 = r9.Bat()
            int r7 = r7 - r0
            int r0 = r9.Bax()
            int r7 = r7 - r0
            int r2 = X.C66289U7k.A00(r3, r8, r2, r6)
            int r0 = r8 + 1
            int r1 = X.C66289U7k.A00(r3, r8, r0, r5)
            r0 = -1
            if (r2 == r0) goto La6
            int r2 = r2 - r1
            float r2 = (float) r2
            float r1 = (float) r7
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            float r1 = r1 * r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto La6
            goto L4a
        La6:
            if (r11 != 0) goto L4a
            X.3Fe r3 = r10.A02
            if (r3 == 0) goto L7d
            java.lang.String r1 = r10.A08
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            android.content.Context r1 = r10.A06
            if (r0 == 0) goto Lc5
            int r0 = r10.A01
            X.UGS r2 = new X.UGS
            r2.<init>(r1, r0)
        Lbf:
            r2.A00 = r4
            r3.A10(r2)
            return r5
        Lc5:
            X.UGR r2 = new X.UGR
            r2.<init>(r1)
            r2.A01 = r6
            r2.A03 = r5
            int r1 = r10.A00
            int r0 = r10.A01
            r2.A00 = r1
            r2.A02 = r0
            goto Lbf
        Ld7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66290U7l.A02(X.U7l, boolean):boolean");
    }

    public final int A03() {
        AbstractC70663Fe abstractC70663Fe;
        int scrollState;
        C66289U7k c66289U7k = this.A04;
        if (c66289U7k == null || (abstractC70663Fe = this.A02) == null) {
            return 0;
        }
        int A02 = c66289U7k.A02(c66289U7k.A00 + 1);
        int A022 = AbstractC72193Ls.A02(abstractC70663Fe);
        C66289U7k c66289U7k2 = this.A04;
        if (c66289U7k2 != null) {
            AbstractC110824yu abstractC110824yu = c66289U7k2.A02.A06;
            if ((abstractC110824yu == null || !abstractC110824yu.A05) && (scrollState = c66289U7k2.A03.getScrollState()) != 1) {
                if (scrollState == 2) {
                    return A022;
                }
            }
            return A022;
        }
        if (A02 != -1) {
            if (A02 > A022) {
                return A022;
            }
            return A02;
        }
        return A022;
    }

    public final int A04() {
        AbstractC70663Fe abstractC70663Fe;
        int scrollState;
        C66289U7k c66289U7k = this.A04;
        if (c66289U7k == null || (abstractC70663Fe = this.A02) == null) {
            return 0;
        }
        int A02 = c66289U7k.A02(c66289U7k.A00);
        int A01 = AbstractC72193Ls.A01(abstractC70663Fe);
        C66289U7k c66289U7k2 = this.A04;
        if (c66289U7k2 != null) {
            AbstractC110824yu abstractC110824yu = c66289U7k2.A02.A06;
            if ((abstractC110824yu == null || !abstractC110824yu.A05) && (scrollState = c66289U7k2.A03.getScrollState()) != 1) {
                if (scrollState == 2) {
                    return A01;
                }
            }
            return A01;
        }
        if (A02 != -1) {
            if (A02 < A01) {
                return A01;
            }
            return A02;
        }
        return A01;
    }

    public final void A06(C38321qM c38321qM, C75113Zb c75113Zb) {
        C69457Vng c69457Vng = this.A03;
        if (this.A0C && c69457Vng != null && !c69457Vng.A01 && !c69457Vng.A00 && !this.A05 && c38321qM != null && !c38321qM.A5M()) {
            c38321qM.A3y();
            Integer num = null;
            InterfaceC39541sb injected = c38321qM.A0C.getInjected();
            if (injected != null && injected.BFe() != null) {
                UserSession userSession = this.A07;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36327095382718764L)) {
                    if (c75113Zb != null) {
                        num = c75113Zb.A13;
                    }
                    if (num == C05F.A00 && C18U.A06(c06090Tz, userSession, 36327095382784301L)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            c69457Vng.A01 = true;
            A02(this, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (X.C14360o3.A0K(r1, "feed_contextual_keyword") != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A08() {
        /*
            r6 = this;
            X.U7k r5 = r6.A04
            r2 = 1
            r4 = 0
            if (r5 == 0) goto L53
            int r0 = r5.A00
            if (r0 <= 0) goto L53
            int r0 = r0 - r2
            int r3 = r5.A02(r0)
            int r0 = r5.A00
            int r1 = r5.A02(r0)
            X.3Fe r0 = r5.A02
            int r0 = X.AbstractC72193Ls.A01(r0)
            if (r1 <= r0) goto L3f
            int r0 = r5.A00
            int r0 = r0 + (-1)
            r5.A00 = r0
            r5.A01 = r4
            java.lang.String r1 = r6.A08
            java.lang.String r0 = "feed_contextual_chain"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L39
            java.lang.String r0 = "feed_contextual_keyword"
            boolean r1 = X.C14360o3.A0K(r1, r0)
            r0 = 1085276160(0x40b00000, float:5.5)
            if (r1 == 0) goto L3b
        L39:
            r0 = 1090781184(0x41040000, float:8.25)
        L3b:
            A01(r6, r0, r3, r4)
        L3e:
            return r2
        L3f:
            int r0 = r5.A00
            int r1 = r5.A02(r0)
            X.3Fe r0 = r6.A02
            if (r0 == 0) goto L3e
            X.U7k r0 = r6.A04
            if (r0 == 0) goto L3e
            r0 = 1085276160(0x40b00000, float:5.5)
            A01(r6, r0, r1, r2)
            return r2
        L53:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66290U7l.A08():boolean");
    }

    public C66290U7l(Context context, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, C68752VbV c68752VbV, String str, int i, int i2, boolean z) {
        this.A07 = userSession;
        this.A06 = context;
        this.A0A = viewOnTouchListenerC60632pm;
        this.A08 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A0C = z;
        this.A0B = c68752VbV;
    }
}
