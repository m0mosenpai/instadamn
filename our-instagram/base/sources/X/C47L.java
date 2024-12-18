package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.47L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47L {
    public C54M A00;
    public C54M A01;
    public C54M A02;
    public C54M A03;
    public C54M A04;
    public C39561sd A05;
    public C47Q A06;
    public C47R A07;
    public C47M A08;
    public String A09;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r1.equals(r0) == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L38
            r2 = 0
            if (r5 == 0) goto L1e
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L1e
            X.47L r5 = (X.C47L) r5
            java.lang.String r1 = r4.A09
            java.lang.String r0 = r5.A09
            if (r1 == 0) goto L1f
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
        L1e:
            return r2
        L1f:
            if (r0 == 0) goto L22
            return r2
        L22:
            X.47R r1 = r4.A07
            X.47R r0 = r5.A07
            if (r1 != r0) goto L1e
            X.47Q r1 = r4.A06
            X.47Q r0 = r5.A06
            if (r1 == 0) goto L35
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L38
            return r2
        L35:
            if (r0 == 0) goto L38
            return r2
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47L.equals(java.lang.Object):boolean");
    }

    public C47L(C47I c47i) {
        C47M c47m;
        C39561sd Eyq;
        C47E c47e;
        C47G c47g = c47i.A06;
        if (c47g != null) {
            new C1DY((C1DV) new C37761pD(null), 6, false);
            String str = c47g.A09;
            String str2 = c47g.A0A;
            String str3 = c47g.A0B;
            C47F c47f = c47g.A01;
            Boolean bool = c47g.A03;
            Boolean bool2 = c47g.A04;
            String str4 = c47g.A0C;
            Boolean bool3 = c47g.A05;
            List list = c47g.A0F;
            Integer num = c47g.A08;
            List list2 = c47g.A0G;
            List list3 = c47g.A0H;
            C115875Md c115875Md = c47g.A00;
            Float f = c47g.A06;
            String str5 = c47g.A0D;
            List list4 = c47g.A0I;
            List list5 = c47g.A0J;
            User user = c47g.A02;
            String str6 = c47g.A0E;
            Float f2 = c47g.A07;
            new C1DY((C1DV) new C37761pD(null), 6, false);
            if (c47f != null) {
                c47e = c47f.EzI();
            } else {
                c47e = null;
            }
            c47m = new C47M(null, c115875Md != null ? c115875Md : null, c47e, null, user, bool, bool2, bool3, f, f2, num, str, str2, str3, str4, null, null, str5, str6, list, list2, list3, list4, list5);
        } else {
            c47m = null;
        }
        this.A08 = c47m;
        this.A02 = c47i.A02;
        this.A00 = c47i.A00;
        this.A03 = c47i.A03;
        this.A04 = c47i.A04;
        this.A01 = c47i.A01;
        InterfaceC39571se interfaceC39571se = c47i.A05;
        if (interfaceC39571se == null) {
            Eyq = null;
        } else {
            Eyq = interfaceC39571se.Eyq();
        }
        this.A05 = Eyq;
        A01();
    }

    public final C47O A00() {
        C47Q c47q = this.A06;
        if (c47q instanceof C47O) {
            return (C47O) c47q;
        }
        return null;
    }

    public final void A01() {
        String str;
        C47R c47r;
        C47M c47m = this.A08;
        if (c47m != null) {
            C47O c47o = new C47O(c47m);
            this.A06 = c47o;
            if (this.A08.A04 != null) {
                str = c47o.A03.getId();
            }
            c47r = this.A06.C3q();
            this.A07 = c47r;
        }
        C54M c54m = this.A02;
        if (c54m == null && (c54m = this.A00) == null && (c54m = this.A03) == null && (c54m = this.A04) == null && (c54m = this.A01) == null) {
            C0w9.A03("SuggestedItem", "Unknown SuggestedItem Type. PLEASE FIX ASAP BECAUSE YOU ARE SENDING UNKNOWN FEED ITEM JSON TO CLIENT.");
            c47r = C47R.A0B;
            this.A07 = c47r;
        }
        this.A06 = new C54O(c54m);
        str = c54m.A00;
        this.A09 = str;
        c47r = this.A06.C3q();
        this.A07 = c47r;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A09;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        C47R c47r = this.A07;
        if (c47r == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c47r.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C47Q c47q = this.A06;
        if (c47q != null) {
            i = c47q.hashCode();
        }
        return i3 + i;
    }

    public C47L() {
    }
}
