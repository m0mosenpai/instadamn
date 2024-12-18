package com.instagram.schools.management.data;

import X.AbstractC09440dt;
import X.AbstractC25225BEi;
import X.C05A;
import X.C05F;
import X.C14360o3;
import X.C26014Bf2;
import X.C29138Ct5;
import X.C37016GSx;
import X.C4A7;
import X.C4A8;
import X.C51759Mti;
import X.InterfaceC09390do;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SchoolSettingsRepository extends C4A7 {
    public final UserSession A00;
    public final SchoolSettingsDataSource A01;
    public final InterfaceC09390do A02;
    public final C05A A03;

    public SchoolSettingsRepository(UserSession userSession, SchoolSettingsDataSource schoolSettingsDataSource) {
        super("ig_school", C4A8.A01(1384462179, 3));
        this.A00 = userSession;
        this.A01 = schoolSettingsDataSource;
        this.A03 = AbstractC25225BEi.A1H(new C51759Mti((C26014Bf2) null, (Integer) null, (DefaultConstructorMarker) null, 3, 5));
        this.A02 = AbstractC09440dt.A01(new C37016GSx(this, 39));
    }

    public static SchoolSettingsRepository A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return new SchoolSettingsRepository(userSession, new SchoolSettingsDataSource(userSession));
    }

    public static C29138Ct5 A00(SchoolSettingsRepository schoolSettingsRepository) {
        A02(schoolSettingsRepository, C05F.A0N);
        return (C29138Ct5) schoolSettingsRepository.A02.getValue();
    }

    public static final void A02(SchoolSettingsRepository schoolSettingsRepository, Integer num) {
        Object value;
        C26014Bf2 c26014Bf2;
        C05A c05a = schoolSettingsRepository.A03;
        do {
            value = c05a.getValue();
            c26014Bf2 = (C26014Bf2) ((C51759Mti) value).A01;
            C14360o3.A0B(num, 1);
        } while (!c05a.AIi(value, new C51759Mti(c26014Bf2, num)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r9) {
        /*
            r8 = this;
            r3 = 48
            boolean r0 = X.C57145PWx.A02(r9, r3)
            if (r0 == 0) goto L7c
            r7 = r9
            X.PWx r7 = (X.C57145PWx) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r6 = r7.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L5a
            if (r0 != r5) goto L82
            java.lang.Object r1 = r7.A01
            com.instagram.schools.management.data.SchoolSettingsRepository r1 = (com.instagram.schools.management.data.SchoolSettingsRepository) r1
            X.AbstractC09560e7.A00(r6)
        L28:
            X.PkY r6 = (X.InterfaceC57806PkY) r6
            boolean r0 = X.MU9.A01(r6, r5)
            if (r0 == 0) goto L50
            X.05A r4 = r1.A03
        L32:
            java.lang.Object r3 = r4.getValue()
            r0 = r6
            X.MU9 r0 = (X.MU9) r0
            java.lang.Object r2 = r0.A01
            X.Bf2 r2 = (X.C26014Bf2) r2
            java.lang.Integer r1 = X.C05F.A0C
            X.C14360o3.A0B(r1, r5)
            X.Mti r0 = new X.Mti
            r0.<init>(r2, r1)
            boolean r0 = r4.AIi(r3, r0)
            if (r0 == 0) goto L32
        L4d:
            X.0eB r4 = X.C0eB.A00
        L4f:
            return r4
        L50:
            X.Ct5 r1 = A00(r1)
            java.lang.String r0 = "failed to fetch school settings"
            r1.A07(r0)
            goto L4d
        L5a:
            X.AbstractC09560e7.A00(r6)
            java.lang.Integer r0 = X.C05F.A01
            A02(r8, r0)
            X.19L r0 = r8.A01
            X.12W r3 = r0.Arv()
            r2 = 0
            r1 = 15
            X.PZC r0 = new X.PZC
            r0.<init>(r8, r2, r1)
            r7.A01 = r8
            r7.A00 = r5
            java.lang.Object r6 = X.AbstractC23641Du.A00(r7, r3, r0)
            if (r6 == r4) goto L4f
            r1 = r8
            goto L28
        L7c:
            X.PWx r7 = new X.PWx
            r7.<init>(r8, r9, r3)
            goto L16
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.management.data.SchoolSettingsRepository.A03(X.1Ds):java.lang.Object");
    }
}
