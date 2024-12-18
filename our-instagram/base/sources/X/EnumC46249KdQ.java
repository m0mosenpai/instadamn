package X;

import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KdQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46249KdQ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46249KdQ[] A01;
    public static final EnumC46249KdQ A02;
    public static final EnumC46249KdQ A03;
    public static final EnumC46249KdQ A04;
    public static final EnumC46249KdQ A05;
    public static final EnumC46249KdQ A06;

    public final void A00(UserSession userSession) {
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        C14360o3.A0B(userSession, 0);
        int ordinal = ordinal();
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        if (ordinal != 0) {
            interfaceC16530ry = A002.A1N;
            c0yrArr = C23031Ai.A8c;
            i = 499;
        } else {
            interfaceC16530ry = A002.A1P;
            c0yrArr = C23031Ai.A8c;
            i = 498;
        }
        AbstractC167027dH.A16(A002, interfaceC16530ry, c0yrArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(com.instagram.common.session.UserSession r7) {
        /*
            r6 = this;
            r1 = 0
            int r0 = r6.ordinal()
            r5 = 0
            r4 = 1
            if (r0 == r1) goto L3b
            if (r0 != r4) goto L39
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321722379413234(0x810a6a000e26f2, double:3.0333417163530853E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L3a
            boolean r0 = X.C3LA.A03(r7)
            if (r0 == 0) goto L3a
            r0 = 36321722380068604(0x810a6a001826fc, double:3.033341716767544E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 != 0) goto L39
            X.1Ai r3 = X.AbstractC23021Ah.A00(r7)
            X.0ry r2 = r3.A1N
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 499(0x1f3, float:6.99E-43)
        L33:
            int r0 = X.AbstractC43594JPz.A0B(r3, r2, r1, r0)
            if (r0 >= r4) goto L3a
        L39:
            r5 = 1
        L3a:
            return r5
        L3b:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321722379478771(0x810a6a000f26f3, double:3.033341716394531E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L3a
            boolean r0 = X.C3LA.A03(r7)
            if (r0 != 0) goto L3a
            r0 = 36321722380068604(0x810a6a001826fc, double:3.033341716767544E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 != 0) goto L39
            X.1Ai r3 = X.AbstractC23021Ah.A00(r7)
            X.0ry r2 = r3.A1P
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 498(0x1f2, float:6.98E-43)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC46249KdQ.A01(com.instagram.common.session.UserSession):boolean");
    }

    static {
        EnumC46249KdQ enumC46249KdQ = new EnumC46249KdQ("NOTES_NUX", 0);
        A04 = enumC46249KdQ;
        EnumC46249KdQ enumC46249KdQ2 = new EnumC46249KdQ("NOTES_WITH_LOCATION_NUX", 1);
        A05 = enumC46249KdQ2;
        EnumC46249KdQ enumC46249KdQ3 = new EnumC46249KdQ("CREATE_NOTE_LOCATION_EDUCATION", 2);
        A02 = enumC46249KdQ3;
        EnumC46249KdQ enumC46249KdQ4 = new EnumC46249KdQ("SHARE_LOCATION_EDUCATION", 3);
        A06 = enumC46249KdQ4;
        EnumC46249KdQ enumC46249KdQ5 = new EnumC46249KdQ("MAP_LOCATION_EDUCATION", 4);
        A03 = enumC46249KdQ5;
        EnumC46249KdQ[] enumC46249KdQArr = {enumC46249KdQ, enumC46249KdQ2, enumC46249KdQ3, enumC46249KdQ4, enumC46249KdQ5};
        A01 = enumC46249KdQArr;
        A00 = AbstractC12190kN.A00(enumC46249KdQArr);
    }

    public static EnumC46249KdQ valueOf(String str) {
        return (EnumC46249KdQ) Enum.valueOf(EnumC46249KdQ.class, str);
    }

    public static EnumC46249KdQ[] values() {
        return (EnumC46249KdQ[]) A01.clone();
    }

    public EnumC46249KdQ(String str, int i) {
    }
}
