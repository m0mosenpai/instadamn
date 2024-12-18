package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class MTQ {
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC57969PnF A05;
    public final Class A06;
    public final MTR A04 = new MTR();
    public boolean A00 = true;

    public MTQ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC57969PnF interfaceC57969PnF, Class cls) {
        this.A06 = cls;
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A05 = interfaceC57969PnF;
    }

    public static final List A00(MTQ mtq, InterfaceC57967PnD interfaceC57967PnD, Object obj) {
        C5qT BAM = interfaceC57967PnD.BAM(obj);
        if (BAM.A01 >= 0 && BAM.A00 >= 0) {
            return mtq.A05.AMp(mtq.A01, mtq.A02, BAM, mtq.A03, obj);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (r6.size() != r4.size()) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.InterfaceC57967PnD r11, X.InterfaceC57968PnE r12, java.util.Iterator r13) {
        /*
            r10 = this;
            r7 = 0
            java.util.ArrayList r2 = X.AbstractC166997dE.A12(r13, r7)
            X.2Z2 r3 = X.AbstractC224717j.A0A(r13)
            r1 = 17
            X.Pjb r0 = new X.Pjb
            r0.<init>(r10, r1)
            X.17n r0 = X.AbstractC224517h.A04(r0, r3)
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            X.17p r8 = new X.17p
            r8.<init>(r0)
        L21:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r4 = r8.next()
            X.MTR r3 = r10.A04
            java.lang.String r0 = r12.BKf(r4)
            int r9 = r0.hashCode()
            X.5qT r1 = r11.BAM(r4)
            r0 = 1
            X.C14360o3.A0B(r1, r0)
            com.google.common.collect.HashBiMap r3 = r3.A00
            java.lang.Object r0 = r3.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L51
            int r0 = r0.intValue()
            if (r0 != r9) goto L51
            r6.add(r4)
            goto L21
        L51:
            java.lang.String r0 = r12.BKf(r4)
            int r0 = r0.hashCode()
            X.TsG r1 = r3.A03
            if (r1 != 0) goto L64
            com.google.common.collect.HashBiMap$Inverse r1 = new com.google.common.collect.HashBiMap$Inverse
            r1.<init>(r3)
            r3.A03 = r1
        L64:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.remove(r0)
            X.5qT r0 = r11.BAM(r4)
            X.C14360o3.A0B(r0, r7)
            r3.remove(r0)
            r5.add(r4)
            goto L21
        L79:
            X.MTR r0 = r10.A04
            com.google.common.collect.HashBiMap r4 = r0.A00
            int r0 = r4.size()
            if (r0 == 0) goto L8e
            int r3 = r6.size()
            int r1 = r4.size()
            r0 = 0
            if (r3 == r1) goto L8f
        L8e:
            r0 = 1
        L8f:
            r10.A00 = r0
            if (r0 == 0) goto L99
            r4.clear()
            A01(r10, r11, r12, r6, r2)
        L99:
            A01(r10, r11, r12, r5, r2)
            boolean r0 = r10.A00
            if (r0 == 0) goto Lb0
            com.instagram.common.session.UserSession r0 = r10.A03
            X.1yQ r1 = X.AbstractC42951yN.A00(r0)
            X.0iw r0 = r10.A02
            java.lang.String r0 = r0.getModuleName()
            r1.A06(r0, r2)
        Laf:
            return
        Lb0:
            int r0 = r2.size()
            if (r0 <= 0) goto Laf
            com.instagram.common.session.UserSession r0 = r10.A03
            X.1yQ r1 = X.AbstractC42951yN.A00(r0)
            X.0iw r0 = r10.A02
            java.lang.String r0 = r0.getModuleName()
            r1.A05(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MTQ.A02(X.PnD, X.PnE, java.util.Iterator):void");
    }

    public static final void A01(MTQ mtq, InterfaceC57967PnD interfaceC57967PnD, InterfaceC57968PnE interfaceC57968PnE, List list, List list2) {
        List A00;
        for (Object obj : list) {
            if (mtq.A06.isInstance(obj) && (A00 = A00(mtq, interfaceC57967PnD, obj)) != null) {
                list2.addAll(A00);
                MTR mtr = mtq.A04;
                C5qT BAM = interfaceC57967PnD.BAM(obj);
                int hashCode = interfaceC57968PnE.BKf(obj).hashCode();
                C14360o3.A0B(BAM, 0);
                mtr.A00.A0D(BAM, Integer.valueOf(hashCode), true);
            }
        }
    }

    public final void A03(InterfaceC57967PnD interfaceC57967PnD, Object obj) {
        List A00 = A00(this, interfaceC57967PnD, obj);
        if (A00 != null) {
            AbstractC42951yN.A00(this.A03).A05(this.A02.getModuleName(), A00);
        }
        this.A00 = false;
    }
}
