package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.27t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC455927t implements InterfaceC456127v {
    public List A00 = new ArrayList();
    public final UserSession A01;

    public abstract C9C2 A00(Map map);

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    @Override // X.InterfaceC456127v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9BN Cst(java.util.Map r10) {
        /*
            r9 = this;
            r5 = 0
            X.9C2 r3 = r9.A00(r10)
            com.instagram.common.session.UserSession r4 = r9.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36893764778591206(0x8312af000e03e6, double:3.39510363302309E-306)
            java.lang.String r1 = X.C18U.A04(r2, r4, r0)
            r4 = 1
            java.lang.String r0 = ";"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r0 = X.AbstractC001900j.A0R(r1, r0, r5)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r8 = r0.iterator()
        L26:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r6 = X.AbstractC001900j.A0R(r1, r0, r5)
            int r1 = r6.size()
            r0 = 2
            if (r1 != r0) goto L26
            int r1 = r6.size()
            r0 = 0
            if (r1 <= 0) goto L4b
            r0 = 1
        L4b:
            java.lang.String r2 = ""
            if (r0 == 0) goto L61
            java.lang.Object r1 = r6.get(r5)
        L53:
            int r0 = r6.size()
            if (r4 >= r0) goto L5d
            java.lang.Object r2 = r6.get(r4)
        L5d:
            r7.put(r1, r2)
            goto L26
        L61:
            r1 = r2
            goto L53
        L63:
            X.27x r0 = r9.CBj()
            java.lang.String r0 = r0.A00
            java.lang.Object r1 = r7.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lc0
            java.util.Locale r0 = java.util.Locale.ENGLISH
            X.C14360o3.A08(r0)
            java.lang.String r1 = r1.toUpperCase(r0)
            X.C14360o3.A07(r1)
            java.lang.String r0 = "MINIMAL"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lc0
            java.lang.String r0 = "BASIC"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb5
            java.lang.Integer r0 = X.C05F.A01
        L8f:
            int r2 = r0.intValue()
            java.util.Map r1 = r9.CNY()
            if (r2 == r5) goto Lab
            java.util.Map r0 = r9.A01(r3)
            if (r2 == r4) goto La7
            java.util.LinkedHashMap r1 = X.AbstractC06930Yk.A04(r1, r0)
            java.lang.Object r0 = r3.A01
            java.util.Map r0 = (java.util.Map) r0
        La7:
            java.util.LinkedHashMap r1 = X.AbstractC06930Yk.A04(r1, r0)
        Lab:
            java.util.List r0 = r9.A00
            r0.add(r1)
            java.lang.Object r0 = r3.A00
            X.9BN r0 = (X.C9BN) r0
            return r0
        Lb5:
            java.lang.String r0 = "FULL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc3
            java.lang.Integer r0 = X.C05F.A0C
            goto L8f
        Lc0:
            java.lang.Integer r0 = X.C05F.A00
            goto L8f
        Lc3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC455927t.Cst(java.util.Map):X.9BN");
    }

    @Override // X.InterfaceC456127v
    public final List BOx() {
        return this.A00;
    }

    public AbstractC455927t(UserSession userSession) {
        this.A01 = userSession;
    }

    public final Map A01(C9C2 c9c2) {
        String str;
        String str2;
        Object obj;
        String obj2;
        Long BLw = BLw();
        String str3 = "[none]";
        if (BLw == null || (str = BLw.toString()) == null) {
            str = "[none]";
        }
        C09530e4 c09530e4 = new C09530e4("last_seen", str);
        C9BN c9bn = (C9BN) c9c2.A00;
        if (c9bn == null || (str2 = Long.valueOf(c9bn.A01).toString()) == null) {
            str2 = "[none]";
        }
        C09530e4 c09530e42 = new C09530e4("schedule_date_start", str2);
        if (c9bn != null && (obj = c9bn.A02) != null && (obj2 = obj.toString()) != null) {
            str3 = obj2;
        }
        return AbstractC06930Yk.A06(c09530e4, c09530e42, new C09530e4("schedule_date_end", str3), new C09530e4("schedule_result", c9c2.A02));
    }
}
