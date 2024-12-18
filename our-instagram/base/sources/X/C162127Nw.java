package X;

/* renamed from: X.7Nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162127Nw extends AbstractC162137Nx implements InterfaceC162057Np {
    public final String A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (X.C18U.A06(r2, r19, 36326833389713561L) == false) goto L6;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C162127Nw(android.app.Activity r18, com.instagram.common.session.UserSession r19, X.C162097Nt r20, X.AbstractC159137Bz r21, java.lang.Integer r22) {
        /*
            r17 = this;
            r15 = 0
            r14 = 1
            r13 = r21
            X.7FY r5 = r13.commandType
            java.lang.String r6 = r13.trigger
            X.7FZ r7 = r13.loggingId
            X.AbstractC31265Don.A00()
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36326833389582487(0x810f1000003897, double:3.036573939764507E-306)
            r4 = r19
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L2a
            r0 = 36326833389713561(0x810f1000023899, double:3.036573939847399E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
            r0 = 2131960665(0x7f132359, float:1.9558005E38)
            if (r1 != 0) goto L2d
        L2a:
            r0 = 2131960664(0x7f132358, float:1.9558003E38)
        L2d:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            X.7C2 r10 = r13.inputChecker
            r16 = 0
            r9 = 2131238693(0x7f081f25, float:1.8093672E38)
            r2 = r17
            r3 = r18
            r12 = r20
            r11 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.AbstractC31265Don.A00()
            r0 = 2131960663(0x7f132357, float:1.9558001E38)
            java.lang.String r1 = r3.getString(r0)
            X.C14360o3.A07(r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            X.C14360o3.A07(r0)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162127Nw.<init>(android.app.Activity, com.instagram.common.session.UserSession, X.7Nt, X.7Bz, java.lang.Integer):void");
    }

    @Override // X.InterfaceC162057Np
    public final boolean shouldPrependOnReply(String str, EnumC46202Kce enumC46202Kce) {
        C14360o3.A0B(enumC46202Kce, 1);
        if (enumC46202Kce != EnumC46202Kce.LONG_PRESS_REIMAGINE) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC162137Nx, X.AbstractC159137Bz
    public final AbstractC160207Gg createCommandData() {
        if (this.removePrefix) {
            C7FY c7fy = this.commandType;
            String str = this.A00;
            String str2 = this.description;
            int i = this.iconDrawableRes;
            C7FZ c7fz = this.loggingId;
            Integer num = this.textRangeId;
            return new C162157Nz(this.firstCommand.createCommandData(), new C45978KWo(this.loggingId, this.commandType, this.textRangeId, str, this.description, this.iconDrawableRes), c7fz, c7fy, num, str, str2, i, this.preventDuplicates, this.removePrefix);
        }
        return super.createCommandData();
    }
}
