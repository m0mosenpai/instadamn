package com.instagram.xme.threed.repository;

import X.AbstractC06930Yk;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.C05A;
import X.C10E;
import X.C4A7;
import X.C4A8;
import X.C51759Mti;
import X.C6Z6;
import X.InterfaceC13000lm;
import X.InterfaceC23621Ds;
import X.MVR;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Xme3dMediaRepository extends C4A7 implements InterfaceC13000lm {
    public final C05A A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r10, X.C6Z6 r11, com.instagram.xme.threed.repository.Xme3dMediaRepository r12, java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r7 = r13
            r4 = 16
            r5 = r14
            boolean r0 = X.C57147PWz.A02(r14, r4)
            if (r0 == 0) goto Lb3
            r3 = r5
            X.PWz r3 = (X.C57147PWz) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r3.A00 = r2
        L18:
            java.lang.Object r1 = r3.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r6 = 1
            r8 = 0
            if (r0 == 0) goto L59
            if (r0 != r6) goto Lba
            java.lang.Object r7 = r3.A02
            java.lang.Object r12 = r3.A01
            com.instagram.xme.threed.repository.Xme3dMediaRepository r12 = (com.instagram.xme.threed.repository.Xme3dMediaRepository) r12
            X.AbstractC09560e7.A00(r1)
        L2d:
            java.io.File r1 = (java.io.File) r1
            if (r1 != 0) goto L51
            java.lang.Integer r0 = X.C05F.A0C
            X.Mti r2 = new X.Mti
            r2.<init>(r0)
        L38:
            X.05A r1 = r12.A00
            java.lang.Object r0 = r1.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r0 = X.AbstractC06930Yk.A03(r0)
            r0.put(r7, r2)
            java.util.Map r0 = X.AbstractC06930Yk.A0B(r0)
            r1.Egh(r0)
        L4e:
            X.0eB r2 = X.C0eB.A00
            return r2
        L51:
            java.lang.Integer r0 = X.C05F.A00
            X.Mti r2 = new X.Mti
            r2.<init>(r1, r0)
            goto L38
        L59:
            X.AbstractC09560e7.A00(r1)
            X.05A r5 = r12.A00
            java.lang.Object r0 = r5.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r0.get(r13)
            X.Mti r1 = (X.C51759Mti) r1
            if (r1 == 0) goto Lb1
            java.lang.Object r0 = r1.A01
        L6e:
            java.lang.Integer r4 = X.C05F.A01
            if (r0 == r4) goto L4e
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r1.A01
        L76:
            java.lang.Integer r0 = X.C05F.A00
            if (r1 == r0) goto L4e
            X.Mti r1 = new X.Mti
            r1.<init>(r4)
            java.lang.Object r0 = r5.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.LinkedHashMap r0 = X.AbstractC06930Yk.A03(r0)
            r0.put(r13, r1)
            java.util.Map r0 = X.AbstractC06930Yk.A0B(r0)
            r5.Egh(r0)
            X.C57147PWz.A00(r12, r13, r3, r6)
            X.12L r1 = X.C12L.A00
            r0 = 1655073067(0x62a6692b, float:1.5348688E21)
            X.0nZ r0 = X.MSX.A0J(r1, r0)
            r9 = 26
            X.JXO r4 = new X.JXO
            r6 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r1 = X.AbstractC23641Du.A00(r3, r0, r4)
            if (r1 != r2) goto L2d
            return r2
        Laf:
            r1 = r8
            goto L76
        Lb1:
            r0 = r8
            goto L6e
        Lb3:
            X.PWz r3 = new X.PWz
            r3.<init>(r12, r14, r4)
            goto L18
        Lba:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.xme.threed.repository.Xme3dMediaRepository.A00(com.instagram.common.session.UserSession, X.6Z6, com.instagram.xme.threed.repository.Xme3dMediaRepository, java.lang.String, X.1Ds):java.lang.Object");
    }

    public final void A01(String str, UserSession userSession, C6Z6 c6z6) {
        AbstractC167027dH.A12(userSession, str, c6z6);
        AbstractC166987dD.A1Z(new MVR(c6z6, this, userSession, str, (InterfaceC23621Ds) null, 24), this.A01);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Iterator A16 = AbstractC166997dE.A16((Map) this.A00.getValue());
        while (A16.hasNext()) {
            File file = (File) ((C51759Mti) A16.next()).A00;
            if (file != null) {
                file.delete();
            }
        }
    }

    public Xme3dMediaRepository() {
        super("Xme3dMediaRepository", C4A8.A00(1238823130));
        this.A00 = C10E.A00(AbstractC06930Yk.A0E());
    }
}
