package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6Sc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC139216Sc {
    public static int A00;
    public static int A01;
    public static long A02;
    public static final HashMap A03 = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.InterfaceC11380iw r5, com.instagram.common.session.UserSession r6, com.instagram.user.model.FollowStatus r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r4 = 4
            r3 = 5
            X.C14360o3.A0B(r9, r3)
            java.lang.String r1 = r5.getModuleName()
            java.lang.String r0 = "su_stories"
            X.6PG r2 = new X.6PG
            r2.<init>(r0, r8, r1)
            r2.A00 = r12
            r2.A04 = r9
            java.lang.Integer r0 = X.AbstractC37441GeL.A00(r7)
            java.lang.String r0 = X.AbstractC37442GeM.A00(r0)
            r2.A06 = r0
            int r1 = r7.ordinal()
            if (r1 == r4) goto L45
            r0 = 3
            if (r1 == r0) goto L42
            if (r1 == r3) goto L48
            r0 = 0
        L2a:
            r2.A0A = r0
            if (r10 == 0) goto L30
            r2.A07 = r10
        L30:
            if (r11 == 0) goto L34
            r2.A08 = r11
        L34:
            X.2ur r1 = new X.2ur
            r1.<init>(r5, r6)
            X.6PH r0 = new X.6PH
            r0.<init>(r2)
            r1.A08(r0)
            return
        L42:
            X.EpZ r0 = X.EnumC33402EpZ.A06
            goto L4a
        L45:
            X.EpZ r0 = X.EnumC33402EpZ.A0A
            goto L4a
        L48:
            X.EpZ r0 = X.EnumC33402EpZ.A05
        L4a:
            java.lang.String r0 = r0.A00
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC139216Sc.A02(X.0iw, com.instagram.common.session.UserSession, com.instagram.user.model.FollowStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public static final C6PG A00(InterfaceC11380iw interfaceC11380iw, InterfaceC139206Sb interfaceC139206Sb, String str, int i, boolean z) {
        Number valueOf;
        long j;
        int i2;
        if (z) {
            valueOf = (Number) A03.get(((C139196Sa) interfaceC139206Sb).A02.getId());
        } else {
            valueOf = Long.valueOf(A02);
        }
        if (valueOf != null) {
            j = valueOf.longValue();
        } else {
            j = 0;
        }
        C6PG c6pg = new C6PG("su_stories", AbstractC139226Sd.A00(interfaceC139206Sb).getId(), interfaceC11380iw.getModuleName());
        c6pg.A00 = i;
        C139196Sa c139196Sa = (C139196Sa) interfaceC139206Sb;
        String str2 = c139196Sa.A09;
        if (str2 != null) {
            c6pg.A04 = str2;
        }
        c6pg.A03 = Long.valueOf(System.currentTimeMillis() - j);
        c6pg.A08 = str;
        c6pg.A0B = c139196Sa.A0D;
        List list = c139196Sa.A0I;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        c6pg.A02 = Integer.valueOf(i2);
        String str3 = c139196Sa.A0E;
        if (str3 != null) {
            c6pg.A07 = str3;
        }
        return c6pg;
    }

    public static final void A04(String str) {
        Number number;
        HashMap hashMap = A03;
        if (!hashMap.containsKey(str) || ((number = (Number) hashMap.get(str)) != null && number.longValue() == -1)) {
            hashMap.put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C104294ms c104294ms, boolean z) {
        List A012 = c104294ms.A01();
        int size = A012.size();
        C63702ur c63702ur = new C63702ur(interfaceC11380iw, userSession);
        int i = A00;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (A01 + i2) % size;
            InterfaceC139206Sb interfaceC139206Sb = (InterfaceC139206Sb) A012.get(i3);
            c63702ur.A09(new C6PH(A00(interfaceC11380iw, interfaceC139206Sb, c104294ms.getId(), i3, z)));
            if (z) {
                A03.put(((C139196Sa) interfaceC139206Sb).A02.getId(), -1L);
            }
        }
    }

    public static final void A03(C104294ms c104294ms, C141596ac c141596ac) {
        int i = 0;
        for (Object obj : c104294ms.A00()) {
            int i2 = i + 1;
            HashMap hashMap = c141596ac.A1C;
            if (!hashMap.containsKey(obj)) {
                hashMap.put(obj, Integer.valueOf(i));
            }
            i = i2;
        }
    }
}
