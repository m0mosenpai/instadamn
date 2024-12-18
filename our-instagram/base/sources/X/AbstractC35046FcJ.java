package X;

import com.google.common.collect.ImmutableList;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FcJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35046FcJ {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (X.C18U.A06(r3, r5, 36321533400458797L) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.common.collect.ImmutableList A01(X.EBH r4, X.AbstractC12990ll r5, java.lang.String r6, boolean r7, boolean r8) {
        /*
            r0 = 0
            X.AbstractC167007dF.A1F(r5, r0, r6)
            com.google.common.collect.ImmutableList$Builder r2 = new com.google.common.collect.ImmutableList$Builder
            r2.<init>()
            com.facebook.common.callercontext.CallerContext r0 = X.C35792FrU.A00
            r1 = r8 ^ 1
            int r0 = r6.length()
            if (r0 == 0) goto L1a
            if (r1 == 0) goto L1a
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.A0B
            X.AbstractC31180DnO.A1P(r2, r0)
        L1a:
            r1 = 1
            if (r4 == 0) goto L33
            boolean r0 = r4.A00
            if (r0 != r1) goto L33
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36330935083418711(0x8112cb00014457, double:3.0391678674627304E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L33
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.A07
            X.AbstractC31180DnO.A1P(r2, r0)
        L33:
            boolean r4 = r5 instanceof com.instagram.common.session.UserSession
            if (r4 == 0) goto L57
            X.0cb r0 = X.C17060sy.A01
            r1 = r5
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            com.instagram.user.model.User r0 = r0.A01(r1)
            boolean r0 = r0.A1a()
            if (r0 != 0) goto L57
            if (r1 == 0) goto L57
            com.instagram.user.model.User r1 = X.AbstractC166997dE.A0Y(r1)
            boolean r0 = r1.A2I()
            if (r0 == 0) goto L57
            X.17P r0 = r1.A03
            r0.BBV()
        L57:
            if (r7 != 0) goto L9b
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36321533400458797(0x810a3e0008262d, double:3.033222205301342E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L78
            if (r4 != 0) goto L78
            r0 = 36330935083418711(0x8112cb00014457, double:3.0391678674627304E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L78
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.A08
            X.AbstractC31180DnO.A1P(r2, r0)
        L78:
            r0 = 36321533400458797(0x810a3e0008262d, double:3.033222205301342E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 == 0) goto L9b
        L83:
            r0 = 36316684381852267(0x8105d50000126b, double:3.030155666409142E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 == 0) goto L98
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.A0E
        L90:
            X.AbstractC31180DnO.A1P(r2, r0)
            com.google.common.collect.ImmutableList r0 = X.AbstractC31172DnG.A0K(r2)
            return r0
        L98:
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.A0A
            goto L90
        L9b:
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36330935083418711(0x8112cb00014457, double:3.0391678674627304E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L83
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.A0C
            X.AbstractC31180DnO.A1P(r2, r0)
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35046FcJ.A01(X.EBH, X.0ll, java.lang.String, boolean, boolean):com.google.common.collect.ImmutableList");
    }

    public static final ImmutableList A02(UserSession userSession, String str, boolean z, boolean z2) {
        ConversionStep conversionStep;
        AbstractC167007dF.A1E(userSession, 0, str);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (C35792FrU.A00(userSession)) {
            AbstractC31180DnO.A1P(builder, ConversionStep.A0H);
        }
        boolean z3 = !z2;
        if (str.length() != 0 && z3) {
            AbstractC31180DnO.A1P(builder, ConversionStep.A0B);
        }
        if (!AbstractC166997dE.A0Y(userSession).A1a()) {
            User A0Y = AbstractC166997dE.A0Y(userSession);
            if (A0Y.A2I()) {
                A0Y.A03.BBV();
            }
        }
        boolean z4 = AbstractC149576oA.A00(userSession).A01;
        if (!z && (z4 || AbstractC31171DnF.A1X(C36007Fv5.A00().A02(userSession, "ig_android_access_library_creator_account_conversion_upsell", "BusinessConversionStatusUtil")))) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if ((C18U.A06(c06090Tz, userSession, 36313961372584278L) || C18U.A06(c06090Tz, userSession, 36313961372715351L)) && !C18U.A06(c06090Tz, userSession, 36321533400065575L) && !C18U.A06(c06090Tz, userSession, 36330935083418711L)) {
                AbstractC31180DnO.A1P(builder, ConversionStep.A08);
            }
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36316684381852267L)) {
            conversionStep = ConversionStep.A0E;
        } else {
            conversionStep = ConversionStep.A0A;
        }
        AbstractC31180DnO.A1P(builder, conversionStep);
        return AbstractC31172DnG.A0K(builder);
    }

    public static final ImmutableList A00() {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ConversionStep conversionStep = ConversionStep.A09;
        EnumC33376Ep9 enumC33376Ep9 = EnumC33376Ep9.A03;
        builder.add((Object) new BusinessConversionStep(enumC33376Ep9, conversionStep));
        builder.add((Object) new BusinessConversionStep(enumC33376Ep9, ConversionStep.A04));
        builder.add((Object) new BusinessConversionStep(enumC33376Ep9, ConversionStep.A03));
        return AbstractC31172DnG.A0K(builder);
    }
}
