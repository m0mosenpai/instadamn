package com.instagram.creation.capture.quickcapture.autocreatedclips.repository;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25229BEm;
import X.AbstractC37302Gc3;
import X.AbstractC43592JPx;
import X.C00O;
import X.C06090Tz;
import X.C12L;
import X.C14090nZ;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C50151MDe;
import X.InterfaceC09390do;
import X.ME3;
import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class ClipsSoundSyncMediaImportRepository {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public final Context A06;
    public final UserSession A07;
    public final C14090nZ A08;
    public final CameraSpec A09;
    public final HashSet A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    public ClipsSoundSyncMediaImportRepository(Context context, UserSession userSession, CameraSpec cameraSpec, String str) {
        AbstractC37302Gc3.A1U(cameraSpec, str);
        this.A06 = context;
        this.A07 = userSession;
        this.A09 = cameraSpec;
        this.A0A = AbstractC166987dD.A1H();
        this.A0B = AbstractC09440dt.A01(new C50151MDe(this, 23));
        this.A0C = AbstractC09440dt.A01(new ME3(str, this, 23));
        this.A08 = C12L.A00.AOT(422445809, 1);
        C16930sl c16930sl = C16930sl.A00;
        this.A00 = c16930sl;
        this.A01 = c16930sl;
        this.A04 = c16930sl;
        this.A02 = c16930sl;
        this.A05 = c16930sl;
    }

    public final void A01(Integer num, List list) {
        int i;
        int intValue;
        this.A03 = list;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium medium = (Medium) it.next();
            if (medium.A05()) {
                i = 5000;
            } else if (medium.Cff() && (intValue = num.intValue()) != 0) {
                if (intValue != 1) {
                    if (intValue != 2 && intValue != 3) {
                        i = (int) (C18U.A00(C06090Tz.A05, this.A07, 37165159466205571L) * 1000.0d);
                    } else {
                        i = medium.A03 - medium.A0A;
                    }
                } else {
                    i = medium.A09;
                }
            } else {
                i = medium.A03;
            }
            AbstractC166997dE.A1R(medium, Integer.valueOf(i), A1E);
        }
        this.A05 = A1E;
        ArrayList A0i = AbstractC167007dF.A0i(A1E);
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            AbstractC166997dE.A1W(A0i, AbstractC25229BEm.A0A(AbstractC43592JPx.A17(it2)));
        }
        this.A00 = A0i;
        List list2 = this.A03;
        if (list2 != null) {
            ArrayList A0i2 = AbstractC167007dF.A0i(list2);
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                AbstractC166997dE.A1W(A0i2, ((Medium) it3.next()).A0A);
            }
            this.A01 = A0i2;
            List list3 = this.A03;
            if (list3 != null) {
                ArrayList A0i3 = AbstractC167007dF.A0i(list3);
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    AbstractC166997dE.A1W(A0i3, ((Medium) it4.next()).A09);
                }
                this.A04 = A0i3;
                List list4 = this.A03;
                if (list4 != null) {
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        int i2 = 2;
                        if (((Medium) it5.next()).A05()) {
                            i2 = 1;
                        }
                        AbstractC166997dE.A1W(A1E2, i2);
                    }
                    this.A02 = A1E2;
                    return;
                }
            }
        }
        C14360o3.A0F("importedMedia");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.common.gallery.Medium r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 45
            boolean r0 = X.MAS.A03(r10, r3)
            if (r0 == 0) goto L25
            r4 = r10
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r7 = 2
            r6 = 1
            if (r1 == 0) goto L36
            if (r1 == r6) goto L5b
            if (r1 != r7) goto L31
            goto L2d
        L25:
            r0 = 42
            X.MAS r4 = new X.MAS
            r4.<init>(r8, r10, r3, r0)
            goto L16
        L2d:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.IllegalStateException -> L8c X.C166447cD -> L93 X.C53395Njk -> L9a
            return r0
        L31:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L36:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r3 = r8.A07
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317337217012827(0x81066d0002145b, double:3.030568521993436E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L78
            r4.A00 = r6     // Catch: java.lang.Throwable -> L62
            X.0nZ r3 = r8.A08     // Catch: java.lang.Throwable -> L62
            r2 = 0
            r1 = 19
            X.B5g r0 = new X.B5g     // Catch: java.lang.Throwable -> L62
            r0.<init>(r9, r8, r2, r1)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = X.AbstractC23641Du.A00(r4, r3, r0)     // Catch: java.lang.Throwable -> L62
            if (r0 != r5) goto L5e
            return r5
        L5b:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L62
        L5e:
            r5 = r0
            X.8lW r5 = (X.C195868lW) r5     // Catch: java.lang.Throwable -> L62
            return r5
        L62:
            r3 = move-exception
            X.0kj r2 = X.EnumC12410kj.A03
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto L6d
            java.lang.String r1 = "no message"
        L6d:
            java.lang.String r0 = "clips_sound_sync_import_photo"
            X.C0w9.A01(r2, r0, r1)
            X.Njj r0 = new X.Njj
            r0.<init>(r3)
            throw r0
        L78:
            r4.A00 = r7     // Catch: java.lang.IllegalStateException -> L8c X.C166447cD -> L93 X.C53395Njk -> L9a
            X.0nZ r3 = r8.A08     // Catch: java.lang.IllegalStateException -> L8c X.C166447cD -> L93 X.C53395Njk -> L9a
            r2 = 0
            r1 = 19
            X.B5g r0 = new X.B5g     // Catch: java.lang.IllegalStateException -> L8c X.C166447cD -> L93 X.C53395Njk -> L9a
            r0.<init>(r9, r8, r2, r1)     // Catch: java.lang.IllegalStateException -> L8c X.C166447cD -> L93 X.C53395Njk -> L9a
            java.lang.Object r0 = X.AbstractC23641Du.A00(r4, r3, r0)     // Catch: java.lang.IllegalStateException -> L8c X.C166447cD -> L93 X.C53395Njk -> L9a
            if (r0 != r5) goto L8b
            return r5
        L8b:
            return r0
        L8c:
            r1 = move-exception
            X.Njj r0 = new X.Njj
            r0.<init>(r1)
            throw r0
        L93:
            r1 = move-exception
            X.Njj r0 = new X.Njj
            r0.<init>(r1)
            throw r0
        L9a:
            r1 = move-exception
            X.Njj r0 = new X.Njj
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.autocreatedclips.repository.ClipsSoundSyncMediaImportRepository.A00(com.instagram.common.gallery.Medium, X.1Ds):java.lang.Object");
    }
}
