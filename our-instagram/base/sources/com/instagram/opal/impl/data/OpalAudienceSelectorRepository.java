package com.instagram.opal.impl.data;

import X.AbstractC166177bl;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC40691uc;
import X.C05A;
import X.C05F;
import X.C0T6;
import X.C0eB;
import X.C14360o3;
import X.C16930sl;
import X.C1JX;
import X.C40701ud;
import X.C41856IgA;
import X.C4A7;
import X.C4A8;
import X.C51742MtR;
import X.C92674Dc;
import X.C92694De;
import X.InterfaceC23621Ds;
import X.JWd;
import X.MAZ;
import X.MZG;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class OpalAudienceSelectorRepository extends C4A7 {
    public JWd A00;
    public JWd A01;
    public final Context A02;
    public final C92694De A03;
    public final C92694De A04;
    public final UserSession A05;
    public final C40701ud A06;
    public final C05A A07;

    /* loaded from: classes5.dex */
    public final class OpalAudience extends C0T6 implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C41856IgA(98);
        public final String A00;
        public final String A01;
        public final String A02;
        public final String A03;
        public final boolean A04;
        public final boolean A05;
        public final boolean A06;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OpalAudience) {
                    OpalAudience opalAudience = (OpalAudience) obj;
                    if (!C14360o3.A0K(this.A01, opalAudience.A01) || !C14360o3.A0K(this.A03, opalAudience.A03) || this.A05 != opalAudience.A05 || this.A06 != opalAudience.A06 || !C14360o3.A0K(this.A00, opalAudience.A00) || !C14360o3.A0K(this.A02, opalAudience.A02) || this.A04 != opalAudience.A04) {
                    }
                }
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeString(this.A01);
            parcel.writeString(this.A03);
            parcel.writeInt(this.A05 ? 1 : 0);
            parcel.writeInt(this.A06 ? 1 : 0);
            parcel.writeString(this.A00);
            parcel.writeString(this.A02);
            parcel.writeInt(this.A04 ? 1 : 0);
        }

        public final int hashCode() {
            return AbstractC166987dD.A0K(this.A04, (((AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A01)))) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31);
        }

        public OpalAudience(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
            AbstractC167017dG.A1P(str, str2);
            this.A01 = str;
            this.A03 = str2;
            this.A05 = z;
            this.A06 = z2;
            this.A00 = str3;
            this.A02 = str4;
            this.A04 = z3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        if (r7 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r16, java.lang.String r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A00(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0206, code lost:
    
        if (r6 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A01(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r12, X.InterfaceC23621Ds r13) {
        /*
            r3 = 18
            boolean r0 = X.C57145PWx.A02(r13, r3)
            if (r0 == 0) goto L93
            r4 = r13
            X.PWx r4 = (X.C57145PWx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L64
            if (r0 != r1) goto L99
            java.lang.Object r12 = r4.A01
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository r12 = (com.instagram.opal.impl.data.OpalAudienceSelectorRepository) r12
            X.AbstractC09560e7.A00(r3)
        L28:
            X.MtR r3 = (X.C51742MtR) r3
            java.util.ArrayList r9 = X.AbstractC166987dD.A1E()
            X.05A r2 = r12.A07
            java.lang.Object r0 = r2.getValue()
            X.MtR r0 = (X.C51742MtR) r0
            java.lang.Object r0 = r0.A04
            java.util.Collection r0 = (java.util.Collection) r0
            r9.addAll(r0)
            java.lang.Object r0 = r3.A04
            java.util.Collection r0 = (java.util.Collection) r0
            r9.addAll(r0)
        L44:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            X.MtR r4 = (X.C51742MtR) r4
            java.lang.Object r5 = r3.A03
            X.C74 r5 = (X.C74) r5
            r6 = 0
            r12 = 0
            r13 = 222(0xde, float:3.11E-43)
            r7 = r6
            r8 = r6
            r10 = r6
            r11 = r6
            X.MtR r0 = X.C51742MtR.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L44
        L61:
            X.0eB r2 = X.C0eB.A00
            return r2
        L64:
            X.AbstractC09560e7.A00(r3)
            X.JWd r0 = r12.A00
            if (r0 == 0) goto L7a
            boolean r0 = r0.A02
            if (r0 != r1) goto L7a
            r4.A01 = r12
            r4.A00 = r1
            java.lang.Object r3 = A03(r12, r4)
            if (r3 != r2) goto L28
            return r2
        L7a:
            X.05A r5 = r12.A07
        L7c:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.MtR r3 = (X.C51742MtR) r3
            r2 = 0
            X.C74 r1 = X.C74.A04
            r0 = 223(0xdf, float:3.12E-43)
            X.MtR r0 = X.C51742MtR.A01(r3, r1, r2, r2, r0)
            boolean r0 = r5.AIi(r4, r0)
            if (r0 == 0) goto L7c
            goto L61
        L93:
            X.PWx r4 = X.C57145PWx.A00(r12, r13, r3)
            goto L16
        L99:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A02(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 19
            boolean r0 = X.C57145PWx.A02(r7, r3)
            if (r0 == 0) goto L4b
            r5 = r7
            X.PWx r5 = (X.C57145PWx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L3c
            if (r1 != r0) goto L50
            java.lang.Object r3 = r5.A01
            java.util.List r3 = (java.util.List) r3
            X.AbstractC09560e7.A00(r4)
        L28:
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L39
            r3.addAll(r4)
            X.C74 r2 = X.C74.A04
        L31:
            r1 = 222(0xde, float:3.11E-43)
            X.MtR r0 = new X.MtR
            r0.<init>(r2, r3, r1)
            return r0
        L39:
            X.C74 r2 = X.C74.A03
            goto L31
        L3c:
            java.util.ArrayList r3 = X.MSY.A0i(r4)
            r5.A01 = r3
            r5.A00 = r0
            java.lang.Object r4 = A04(r6, r5)
            if (r4 != r2) goto L28
            return r2
        L4b:
            X.PWx r5 = X.C57145PWx.A00(r6, r7, r3)
            goto L16
        L50:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A03(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(com.instagram.opal.impl.data.OpalAudienceSelectorRepository r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalAudienceSelectorRepository.A04(com.instagram.opal.impl.data.OpalAudienceSelectorRepository, X.1Ds):java.lang.Object");
    }

    public final Object A05(String str, InterfaceC23621Ds interfaceC23621Ds) {
        Integer num;
        List list;
        JWd jWd;
        Object value;
        if (str != null && str.length() != 0) {
            num = C05F.A00;
        } else {
            JWd jWd2 = this.A00;
            if (jWd2 == null || (num = (Integer) jWd2.A00) == null) {
                num = (Integer) ((C51742MtR) this.A07.getValue()).A02;
            }
        }
        C05A c05a = this.A07;
        boolean A1a = AbstractC25225BEi.A1a(((C51742MtR) c05a.getValue()).A08, str);
        if (A1a) {
            this.A01 = null;
            list = C16930sl.A00;
        } else {
            list = (List) ((C51742MtR) c05a.getValue()).A07;
        }
        boolean z = false;
        if (num == C05F.A00) {
            jWd = this.A01;
        } else {
            jWd = this.A00;
        }
        if (jWd == null || jWd.A02) {
            z = true;
        }
        if (A1a || z) {
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, C51742MtR.A00((C51742MtR) value, null, null, num, str, null, list, null, 0, 229)));
            Object A00 = this.A03.A00(C0eB.A00, interfaceC23621Ds, new MAZ(this, num, str, list, null));
            if (A00 == C1JX.A02) {
                return A00;
            }
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OpalAudienceSelectorRepository(Context context, UserSession userSession) {
        super("Opal", C4A8.A01(72627069, 3));
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        AbstractC167017dG.A1P(context, userSession);
        C14360o3.A0B(A01, 3);
        this.A02 = context;
        this.A05 = userSession;
        this.A06 = A01;
        this.A07 = AbstractC25225BEi.A1H(new C51742MtR(null, null, 255));
        this.A03 = AbstractC166177bl.A00(MZG.A00);
        this.A04 = AbstractC166177bl.A00(C92674Dc.A00);
    }
}
