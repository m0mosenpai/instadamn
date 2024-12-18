package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IdO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41695IdO {
    public final UserSession A00;
    public final InterfaceC692739n A01;

    public C41695IdO(UserSession userSession, InterfaceC692739n interfaceC692739n) {
        C14360o3.A0B(interfaceC692739n, 2);
        this.A00 = userSession;
        this.A01 = interfaceC692739n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C51757Mtg A02(X.C38321qM r19, X.C75113Zb r20) {
        /*
            r18 = this;
            r0 = 1
            r2 = r20
            X.C14360o3.A0B(r2, r0)
            r3 = r19
            r4 = r18
            if (r19 == 0) goto Le2
            com.instagram.common.session.UserSession r0 = r4.A00
            com.instagram.user.model.User r0 = r3.A2E(r0)
            if (r0 == 0) goto Le2
            java.lang.String r1 = r0.getUsername()
        L18:
            X.3Zm r5 = r2.A0m
            X.3Zm r0 = X.EnumC75193Zm.A04
            if (r5 != r0) goto L75
            X.Itz r7 = X.C42642Itz.A00
        L20:
            X.JFW r7 = (X.JFW) r7
            r0 = 42
            X.MLq r15 = new X.MLq
            r15.<init>(r0, r2, r3, r4)
            r0 = 8
            X.DGo r8 = new X.DGo
            r8.<init>(r0, r3, r4, r2)
            r0 = 43
            X.MLq r5 = new X.MLq
            r5.<init>(r0, r2, r3, r4)
            r0 = 9
            X.DGo r9 = new X.DGo
            r9.<init>(r0, r3, r4, r2)
            r0 = 10
            X.DGo r10 = new X.DGo
            r10.<init>(r0, r3, r4, r2)
            r6 = 33
            X.DSA r0 = new X.DSA
            r0.<init>(r6, r3, r4)
            r6 = 11
            X.DGo r11 = new X.DGo
            r11.<init>(r6, r3, r4, r2)
            r6 = 6
            X.MDl r12 = new X.MDl
            r12.<init>(r3, r6)
            r6 = 12
            X.DGo r13 = new X.DGo
            r13.<init>(r6, r3, r4, r2)
            r6 = 7
            X.DGo r14 = new X.DGo
            r14.<init>(r6, r3, r4, r2)
            X.Gng r6 = new X.Gng
            r17 = r0
            r16 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.Mtg r0 = new X.Mtg
            r0.<init>(r6, r3, r1)
            return r0
        L75:
            X.3Zm r0 = X.EnumC75193Zm.A0B
            if (r5 != r0) goto L85
            r5 = 2131965981(0x7f13381d, float:1.9568787E38)
            r0 = 2131965980(0x7f13381c, float:1.9568785E38)
        L7f:
            X.Ity r7 = new X.Ity
            r7.<init>(r5, r0)
            goto L20
        L85:
            X.3Zm r0 = X.EnumC75193Zm.A0A
            if (r5 != r0) goto L90
            r5 = 2131965979(0x7f13381b, float:1.9568783E38)
            r0 = 2131965978(0x7f13381a, float:1.9568781E38)
            goto L7f
        L90:
            if (r19 == 0) goto Ld9
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1w7 r0 = X.AbstractC41561w6.A00(r0)
            X.1v4 r0 = r0.A00(r3)
            if (r0 == 0) goto Ld2
            java.util.List r5 = r0.A0m
            if (r5 == 0) goto Lcd
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lcd
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r5)
        Lac:
            X.C14360o3.A07(r0)
        Laf:
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            java.util.Iterator r5 = r0.iterator()
        Lb7:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Ldb
            java.lang.Object r0 = r5.next()
            X.1sE r0 = (X.InterfaceC39331sE) r0
            java.lang.String r0 = r0.Bks()
            if (r0 == 0) goto Lb7
            r6.add(r0)
            goto Lb7
        Lcd:
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            goto Lac
        Ld2:
            java.util.List r0 = r3.A3s()
            if (r0 == 0) goto Ld9
            goto Laf
        Ld9:
            X.0sl r6 = X.C16930sl.A00
        Ldb:
            X.Itx r7 = new X.Itx
            r7.<init>(r6)
            goto L20
        Le2:
            java.lang.String r1 = ""
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41695IdO.A02(X.1qM, X.3Zb):X.Mtg");
    }

    public static final InterfaceC84443pn A00(InterfaceC84443pn interfaceC84443pn, C41695IdO c41695IdO, String str, List list) {
        List list2;
        if (str != null && list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                InterfaceC88183wS interfaceC88183wS = (InterfaceC88183wS) it.next();
                if (C14360o3.A0K(interfaceC88183wS.getId(), str) && interfaceC88183wS.Awj() != null) {
                    interfaceC84443pn = interfaceC88183wS.Awj();
                    if (interfaceC84443pn == null) {
                        throw AbstractC25227BEk.A0n();
                    }
                } else {
                    InterfaceC84443pn Awj = interfaceC88183wS.Awj();
                    if (Awj != null) {
                        list2 = Awj.B7a();
                    } else {
                        list2 = null;
                    }
                    return A00(interfaceC84443pn, c41695IdO, str, list2);
                }
            }
        }
        return interfaceC84443pn;
    }

    public static final InterfaceC84443pn A01(C38321qM c38321qM, C75113Zb c75113Zb) {
        if (c38321qM == null) {
            return null;
        }
        if (c38321qM.CdW()) {
            return c38321qM.A0C.AZA();
        }
        if (c75113Zb.A0o.ordinal() != 3) {
            return c38321qM.A0C.B5w();
        }
        return c38321qM.A0C.B3L();
    }
}
