package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OMe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54840OMe {
    public final InterfaceC09390do A00 = C57549PgN.A01(this, 33);

    public final int A00() {
        if (this instanceof N19) {
            return AbstractC25225BEi.A07(C06090Tz.A05, ((N19) this).A00, 36597695505042322L);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r1 = X.AbstractC001800i.A0K(X.AbstractC31171DnF.A0n(r4));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(int r6) {
        /*
            r5 = this;
            X.0do r4 = r5.A00
            java.util.List r3 = X.AbstractC31171DnF.A0n(r4)
            java.lang.Object r0 = r4.getValue()
            java.util.Iterator r2 = X.AbstractC25226BEj.A1J(r0)
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Ms3 r0 = (X.C51672Ms3) r0
            X.17u r0 = r0.A06
            int r0 = r0.A00
            if (r0 > r6) goto Le
            if (r1 != 0) goto L2b
        L23:
            java.util.List r0 = X.AbstractC31171DnF.A0n(r4)
            java.lang.Object r1 = X.AbstractC001800i.A0K(r0)
        L2b:
            int r0 = r3.indexOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54840OMe.A01(int):int");
    }

    public final C51712Msh A03() {
        C51672Ms3 c51672Ms3 = (C51672Ms3) AbstractC166987dD.A16(AbstractC31171DnF.A0n(this.A00));
        return AbstractC53762NqE.A00(c51672Ms3, A04(), c51672Ms3.A06.A01);
    }

    public final Integer A04() {
        C54995OUe c54995OUe;
        if (this instanceof N19) {
            N19 n19 = (N19) this;
            Integer num = C05F.A00;
            try {
                String A04 = C18U.A04(C06090Tz.A05, n19.A00, 36879170479980789L);
                if (!A04.equals("H264")) {
                    if (A04.equals("H265")) {
                        return C05F.A01;
                    }
                    throw AbstractC166987dD.A12(A04);
                }
            } catch (IllegalArgumentException e) {
                AbstractC195978lm.A02.A06("sup:BitrateLadderProvider", "Unable to find enum from configured string.  Fallback to H264", e);
            }
            return num;
        }
        if (this instanceof N18) {
            c54995OUe = ((N18) this).A00;
        } else {
            c54995OUe = ((N17) this).A00;
        }
        return c54995OUe.A03.A06;
    }

    public final List A05(boolean z) {
        String str;
        int i;
        int i2;
        String A1A;
        String A1A2;
        if (!z) {
            if (this instanceof N19) {
                str = AbstractC25228BEl.A1A(C18U.A04(C06090Tz.A05, ((N19) this).A00, 36879170479587572L));
            } else if (this instanceof N17) {
                str = ((N17) this).A00.A0H;
            } else {
                str = ((N18) this).A00.A0I;
            }
        } else {
            str = "720,1280,1000000-1000000,30|504,896,500000-1000000,30|432,768,270000-500000,30|360,640,200000-270000,30";
        }
        C195988ln c195988ln = AbstractC195978lm.A02;
        c195988ln.A03("sup:BaseBitrateLadderProvider", AnonymousClass001.A0R("Parsing bitrate ladder string: ", str));
        try {
            int i3 = 0;
            List A0R = AbstractC001900j.A0R(str, new String[]{"|"}, 0);
            ArrayList A0q = AbstractC167017dG.A0q(A0R);
            int i4 = 0;
            for (Object obj : A0R) {
                i3++;
                if (i4 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                List A0R2 = AbstractC001900j.A0R((String) obj, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                List A0R3 = AbstractC001900j.A0R((CharSequence) A0R2.get(2), new String[]{"-"}, 0);
                Integer num = C05F.A00(4)[i4];
                int parseInt = Integer.parseInt(AbstractC25228BEl.A1A(AbstractC25226BEj.A1I(A0R2, 0)));
                int parseInt2 = Integer.parseInt(AbstractC25228BEl.A1A(AbstractC25226BEj.A1I(A0R2, 1)));
                int parseInt3 = Integer.parseInt(AbstractC25228BEl.A1A(AbstractC25226BEj.A1I(A0R2, 3)));
                C17u c17u = new C17u(Integer.parseInt(AbstractC25228BEl.A1A(AbstractC25226BEj.A1I(A0R3, 0))), Integer.parseInt(AbstractC25228BEl.A1A(AbstractC25226BEj.A1I(A0R3, 1))));
                String A14 = MSW.A14(A0R2, 4);
                if (A14 != null && (A1A2 = AbstractC25228BEl.A1A(A14)) != null) {
                    i = Integer.parseInt(A1A2);
                } else {
                    i = 0;
                }
                String A142 = MSW.A14(A0R2, 5);
                if (A142 != null && (A1A = AbstractC25228BEl.A1A(A142)) != null) {
                    i2 = Integer.parseInt(A1A);
                } else {
                    i2 = 3;
                }
                C51672Ms3 c51672Ms3 = new C51672Ms3(num, c17u, parseInt, parseInt2, parseInt3, i, i2);
                c195988ln.A03("sup:BaseBitrateLadderProvider", AbstractC167017dG.A0n(c51672Ms3, "Adding Bitrate Rung To Ladder: ", AbstractC166987dD.A1C()));
                A0q.add(c51672Ms3);
                i4 = i3;
            }
            return A0q;
        } catch (IndexOutOfBoundsException e) {
            c195988ln.A04("sup:BaseBitrateLadderProvider", AnonymousClass001.A0g("Exception parsing ladder config ", str, ". Attempt with fallback"), e);
            if (!z) {
                return A05(true);
            }
            c195988ln.A04("sup:BaseBitrateLadderProvider", "Failed to parse ladder config AND Default Value Format(??) - Returning empty list", null);
            return AbstractC166987dD.A1E();
        }
    }

    public final C51712Msh A02() {
        if (A00() > 0 && A00() <= A03().A00) {
            return AbstractC53762NqE.A00((C51672Ms3) AbstractC166987dD.A16(AbstractC31171DnF.A0n(this.A00)), A04(), A00());
        }
        return A03();
    }
}
