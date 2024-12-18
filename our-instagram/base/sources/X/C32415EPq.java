package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EPq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32415EPq extends C7E1 implements InterfaceC161877Mx {
    public int A00;
    public C47K A01;
    public boolean A02;
    public final C31369DqY A03;
    public final ERD A04;
    public final C31335Dq0 A05;
    public final C34531FJr A06;
    public final C168737g7 A07;
    public final List A08;
    public final Resources A09;
    public final UserSession A0A;
    public final C31545DtV A0B;
    public final C31567Dtt A0C;
    public final java.util.Set A0D;

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C47K c47k;
        C14360o3.A0B(str, 0);
        if (!this.A0D.contains(str) && ((c47k = this.A01) == null || !c47k.A0A(str))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.FJr, java.lang.Object] */
    public C32415EPq(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38O c38o, InterfaceC37216GaR interfaceC37216GaR, InterfaceC37175GZm interfaceC37175GZm, InterfaceC37297Gby interfaceC37297Gby, C31538DtO c31538DtO) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        C31567Dtt c31567Dtt = new C31567Dtt(null, context, interfaceC11380iw, userSession, null, interfaceC37297Gby, c31538DtO, null, false);
        this.A0C = c31567Dtt;
        C31335Dq0 A00 = C31335Dq0.A00(2131974883);
        this.A05 = A00;
        this.A08 = AbstractC166987dD.A1E();
        this.A0D = AbstractC166987dD.A1H();
        this.A09 = AbstractC166997dE.A0M(context);
        c31567Dtt.A01 = A1V;
        c31567Dtt.A00 = false;
        ERD erd = new ERD(context, interfaceC37175GZm);
        this.A04 = erd;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A07 = c168737g7;
        this.A06 = new Object();
        C31369DqY c31369DqY = new C31369DqY(context, interfaceC11380iw, userSession, c38o, interfaceC37216GaR, false, A1V, false);
        this.A03 = c31369DqY;
        this.A0A = userSession;
        A00.A02 = 0;
        A00.A0I = false;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A0B = c31545DtV;
        A0B(c31567Dtt, erd, c168737g7, c31369DqY, c31545DtV);
    }

    public static final void A00(C47K c47k, C32415EPq c32415EPq, int i) {
        java.util.Set set = c32415EPq.A0D;
        set.clear();
        Iterator it = c32415EPq.A08.iterator();
        while (it.hasNext()) {
            set.add(AbstractC25226BEj.A15(it).getId());
        }
        c32415EPq.A00 = i;
        c32415EPq.A01 = c47k;
        A01(c32415EPq);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[LOOP:1: B:23:0x0077->B:25:0x007d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C32415EPq r7) {
        /*
            r7.A06()
            java.util.List r6 = r7.A08
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L1d
            boolean r0 = r7.A02
            if (r0 == 0) goto L1d
            android.content.res.Resources r1 = r7.A09
            r0 = 2131968660(0x7f134294, float:1.957422E38)
            java.lang.String r1 = r1.getString(r0)
            X.DtV r0 = r7.A0B
            r7.A08(r0, r1)
        L1d:
            r5 = 0
            int r4 = r6.size()
        L22:
            if (r5 >= r4) goto L4c
            java.lang.Object r3 = r6.get(r5)
            r2 = 0
            r0 = 0
            X.Fai r1 = new X.Fai
            r1.<init>(r2, r2, r0)
            X.Dtt r0 = r7.A0C
            r7.A09(r0, r3, r1)
            int r0 = r7.A00
            if (r0 != r5) goto L95
            java.lang.Integer r2 = X.C05F.A0C
            int r0 = r6.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.FJL r1 = new X.FJL
            r1.<init>(r2, r0)
            X.ERD r0 = r7.A04
            r7.A08(r0, r1)
        L4c:
            X.47K r0 = r7.A01
            if (r0 == 0) goto La4
            r6 = 0
            boolean r0 = r0.A07()
            boolean r1 = X.AbstractC167007dF.A1N(r0)
            r5 = 0
            X.47K r0 = r7.A01
            if (r1 == 0) goto L8e
            if (r0 == 0) goto La4
            java.util.List r3 = r0.A0M
        L62:
            if (r3 == 0) goto La4
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto La4
            X.Dq0 r2 = r7.A05
            X.FJr r1 = r7.A06
            X.7g7 r0 = r7.A07
            r7.A09(r0, r2, r1)
            java.util.Iterator r4 = r3.iterator()
        L77:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r3 = r4.next()
            int r2 = r6 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            X.DqY r0 = r7.A03
            r7.A09(r0, r3, r1)
            r6 = r2
            goto L77
        L8e:
            if (r0 == 0) goto La4
            java.util.ArrayList r3 = r0.A03()
            goto L62
        L95:
            int r5 = r5 + 1
            goto L22
        L98:
            java.lang.Integer r0 = X.C05F.A00
            X.FJL r1 = new X.FJL
            r1.<init>(r0, r5)
            X.ERD r0 = r7.A04
            r7.A08(r0, r1)
        La4:
            r7.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32415EPq.A01(X.EPq):void");
    }
}
