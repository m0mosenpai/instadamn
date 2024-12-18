package com.instagram.hallpass.repository;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.C008002u;
import X.C00O;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.C4A7;
import X.C4A8;
import X.E7m;
import X.E7q;
import X.EnumC33352Eol;
import X.InterfaceC37242Gar;
import X.InterfaceC37245Gau;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.model.HallPassViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class HallPassRepository extends C4A7 {
    public final C05A A00;
    public final C0UO A01;
    public final C0UO A02;
    public final UserSession A03;
    public final C05A A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HallPassRepository(UserSession userSession) {
        super("HallPass", C4A8.A00(317297559));
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A00 = A0o;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC33352Eol.A03);
        this.A04 = A1H;
        this.A02 = AbstractC208910l.A02(A0o);
        this.A01 = AbstractC208910l.A02(A1H);
    }

    private final List A00(InterfaceC37245Gau interfaceC37245Gau, String str) {
        boolean A1N;
        List list = ((E7q) interfaceC37245Gau).A00;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            E7m e7m = (E7m) ((InterfaceC37242Gar) obj);
            String str2 = e7m.A03;
            String str3 = e7m.A04;
            String str4 = e7m.A02;
            int i3 = e7m.A00;
            int i4 = e7m.A01;
            List list2 = e7m.A05;
            if (str != null) {
                A1N = str.equals(str2);
            } else {
                A1N = AbstractC167007dF.A1N(i);
            }
            A0q.add(new HallPassViewModel(str2, str3, str4, list2, i3, i4, A1N));
            i = i2;
        }
        return A0q;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 37
            boolean r0 = X.MAK.A01(r7, r3)
            if (r0 == 0) goto L80
            r4 = r7
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L67
            if (r0 != r2) goto L8b
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r4.A01
            com.instagram.hallpass.repository.HallPassRepository r2 = (com.instagram.hallpass.repository.HallPassRepository) r2
            X.AbstractC09560e7.A00(r1)
        L2c:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L5e
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.Gau r0 = (X.InterfaceC37245Gau) r0
            X.05A r1 = r2.A00
            java.util.List r0 = r2.A00(r0, r6)
            r1.Egh(r0)
            X.05A r1 = r2.A04
            X.Eol r0 = X.EnumC33352Eol.A05
            r1.Egh(r0)
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L4c:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L5b
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L86
            X.05A r1 = r2.A04
            X.Eol r0 = X.EnumC33352Eol.A02
            r1.Egh(r0)
        L5b:
            X.0eB r3 = X.C0eB.A00
        L5d:
            return r3
        L5e:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L4c
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L67:
            X.AbstractC09560e7.A00(r1)
            X.05A r1 = r5.A04
            X.Eol r0 = X.EnumC33352Eol.A04
            r1.Egh(r0)
            com.instagram.hallpass.util.HallPassApiUtil r1 = com.instagram.hallpass.util.HallPassApiUtil.A00
            com.instagram.common.session.UserSession r0 = r5.A03
            X.AbstractC31172DnG.A1V(r5, r6, r4, r2)
            java.lang.Object r1 = r1.A06(r0, r4)
            if (r1 == r3) goto L5d
            r2 = r5
            goto L2c
        L80:
            X.MAK r4 = new X.MAK
            r4.<init>(r5, r7, r3)
            goto L16
        L86:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.repository.HallPassRepository.A01(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 38
            boolean r0 = X.MAK.A01(r7, r3)
            if (r0 == 0) goto L83
            r4 = r7
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L71
            if (r0 != r2) goto L8e
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r4.A01
            com.instagram.hallpass.repository.HallPassRepository r3 = (com.instagram.hallpass.repository.HallPassRepository) r3
            X.AbstractC09560e7.A00(r1)
        L2c:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L68
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.Gau r0 = (X.InterfaceC37245Gau) r0
            java.util.List r2 = r3.A00(r0, r6)
            X.05A r1 = r3.A00
            java.lang.Object r0 = r1.getValue()
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 != 0) goto L4b
            r1.Egh(r2)
        L4b:
            X.05A r1 = r3.A04
            X.Eol r0 = X.EnumC33352Eol.A05
            r1.Egh(r0)
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L56:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L65
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L89
            X.05A r1 = r3.A04
            X.Eol r0 = X.EnumC33352Eol.A02
            r1.Egh(r0)
        L65:
            X.0eB r3 = X.C0eB.A00
        L67:
            return r3
        L68:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L56
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L71:
            X.AbstractC09560e7.A00(r1)
            com.instagram.hallpass.util.HallPassApiUtil r1 = com.instagram.hallpass.util.HallPassApiUtil.A00
            com.instagram.common.session.UserSession r0 = r5.A03
            X.AbstractC31172DnG.A1V(r5, r6, r4, r2)
            java.lang.Object r1 = r1.A06(r0, r4)
            if (r1 == r3) goto L67
            r3 = r5
            goto L2c
        L83:
            X.MAK r4 = new X.MAK
            r4.<init>(r5, r7, r3)
            goto L16
        L89:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.repository.HallPassRepository.A02(java.lang.String, X.1Ds):java.lang.Object");
    }
}
