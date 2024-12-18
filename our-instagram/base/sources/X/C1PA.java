package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Keep in sync with AdsAndNetegoControllersKt which is the Kotlin equivalent of this class, which is being AB tested. If adding a usage of this class, you should also use AdsAndNetegoControllersKt depending on A/B test state.")
/* renamed from: X.1PA, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1PA {
    public static C1PK A00;
    public static final C1PC A01;

    static {
        C1PB c1pb = C1PB.A00;
        A01 = c1pb;
        C1PE c1pe = new C1PE() { // from class: X.1PD
            /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
            
                if (X.AbstractC22736A1g.A00(r10).booleanValue() != false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
            
                if (r1 != false) goto L6;
             */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // X.C1PE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C1PY AMn(com.instagram.common.session.UserSession r10) {
                /*
                    r9 = this;
                    r2 = r10
                    java.lang.Boolean r0 = X.C1PQ.A00(r10)
                    boolean r1 = r0.booleanValue()
                    java.lang.Boolean r0 = X.C1PR.A00(r10)
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L16
                    r5 = 0
                    if (r1 == 0) goto L60
                L16:
                    r5 = 1
                    if (r1 == 0) goto L60
                    java.lang.Long r0 = X.C51v.A00(r10)
                L1d:
                    int r3 = r0.intValue()
                    if (r1 == 0) goto L5b
                    java.lang.Long r0 = X.C51w.A00(r10)
                L27:
                    int r4 = r0.intValue()
                    java.lang.Boolean r0 = X.C1PU.A00(r10)
                    boolean r6 = r0.booleanValue()
                    java.lang.Boolean r0 = X.C1PV.A00(r10)
                    boolean r7 = r0.booleanValue()
                    java.lang.Boolean r0 = X.C1PW.A00(r10)
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L50
                    java.lang.Boolean r0 = X.AbstractC22736A1g.A00(r10)
                    boolean r0 = r0.booleanValue()
                    r8 = 0
                    if (r0 == 0) goto L51
                L50:
                    r8 = 1
                L51:
                    r0 = 6
                    X.C14360o3.A0B(r10, r0)
                    X.1PX r1 = new X.1PX
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    return r1
                L5b:
                    java.lang.Long r0 = X.C1PT.A00(r10)
                    goto L27
                L60:
                    java.lang.Long r0 = X.C1PS.A00(r10)
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1PD.AMn(com.instagram.common.session.UserSession):X.1PY");
            }

            @Override // X.C1PE
            public final boolean ABH(UserSession userSession) {
                return AbstractC26211Pc.A00(userSession).booleanValue();
            }
        };
        C1PH.A07.put(c1pb, new C1PI(new C1PG(new InterfaceC16660sJ() { // from class: X.1PF
            public static final C3GL A00(UserSession userSession) {
                return new C3GL(userSession);
            }

            @Override // X.InterfaceC16660sJ
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return A00((UserSession) obj);
            }
        }), c1pe, "stories_surface"));
        A00 = new C1PK() { // from class: X.1PJ
            public static final C38211qB A00(C41551w4 c41551w4) {
                return c41551w4.A0H.A0Z;
            }

            @Override // X.C1PK
            public final /* bridge */ /* synthetic */ InterfaceC38221qC ATz(Object obj) {
                return A00((C41551w4) obj);
            }
        };
    }

    public static C101934i8 A02(UserSession userSession, InterfaceC114805Gn interfaceC114805Gn, AnonymousClass320 anonymousClass320, InterfaceC671231d interfaceC671231d, C1PY c1py, InterfaceC671531g interfaceC671531g) {
        return new C101934i8(userSession, interfaceC114805Gn, anonymousClass320, interfaceC671231d, c1py, interfaceC671531g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (X.C18U.A06(r2, r3, 36321426026276257L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AnonymousClass328 A03(com.instagram.common.session.UserSession r3) {
        /*
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321426026210720(0x810a25000725a0, double:3.033154301394497E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L1b
            r0 = 36321426026276257(0x810a25000825a1, double:3.033154301435943E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L34
        L18:
            X.328 r0 = X.AnonymousClass328.A03
            return r0
        L1b:
            r0 = 36310538286858396(0x81003e0031009c, double:3.02626885118668E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L18
            r0 = 36310538286268565(0x81003e00280095, double:3.0262688508136683E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L34
            X.328 r0 = X.AnonymousClass328.A04
            return r0
        L34:
            X.328 r0 = X.AnonymousClass328.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1PA.A03(com.instagram.common.session.UserSession):X.328");
    }

    public static void A06(UserSession userSession) {
        if (C18U.A06(C06090Tz.A05, userSession, 36310538284040316L)) {
            C1PH.A00(userSession).A05(A01);
            return;
        }
        boolean booleanValue = C1PQ.A00(userSession).booleanValue();
        C1PR.A00(userSession);
        if (booleanValue) {
            C51v.A00(userSession);
            C51w.A00(userSession);
        } else {
            C1PS.A00(userSession);
            C1PT.A00(userSession);
        }
        C1PU.A00(userSession);
        C1PV.A00(userSession);
        if (C1PW.A00(userSession).booleanValue()) {
            return;
        }
        AbstractC22736A1g.A00(userSession);
    }

    public static C6YX A00(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C145806hd c145806hd, C145816he c145816he, InterfaceC114805Gn interfaceC114805Gn, C32O c32o, InterfaceC61432r6 interfaceC61432r6, InterfaceC61522rF interfaceC61522rF, C1M1 c1m1, ReelViewerFragment reelViewerFragment, String str, List list, int i, boolean z) {
        return A01(context, abstractC018607g, userSession, interfaceC60442pS, c3g2, c145806hd, c145816he, interfaceC114805Gn, c32o, interfaceC61432r6, interfaceC61522rF, c1m1, reelViewerFragment, str, list, i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0122, code lost:
    
        if (r37 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (X.AbstractC22736A1g.A00(r52).booleanValue() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C6YX A01(android.content.Context r50, X.AbstractC018607g r51, com.instagram.common.session.UserSession r52, X.InterfaceC60442pS r53, X.C3G2 r54, X.C145806hd r55, X.C145816he r56, X.InterfaceC114805Gn r57, X.C32O r58, X.InterfaceC61432r6 r59, X.InterfaceC61522rF r60, X.C1M1 r61, instagram.features.stories.fragment.ReelViewerFragment r62, java.lang.String r63, java.util.List r64, int r65, boolean r66) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1PA.A01(android.content.Context, X.07g, com.instagram.common.session.UserSession, X.2pS, X.3G2, X.6hd, X.6he, X.5Gn, X.32O, X.2r6, X.2rF, X.1M1, instagram.features.stories.fragment.ReelViewerFragment, java.lang.String, java.util.List, int, boolean):X.6YX");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0104, code lost:
    
        if (X.AbstractC61652rS.A0A(r59, X.AbstractC23021Ah.A00(r59)) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0147, code lost:
    
        if (X.C1PQ.A00(r59).booleanValue() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x016f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r59, 2342160801698158155L) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02e0, code lost:
    
        if (X.AbstractC61652rS.A0A(r59, X.AbstractC23021Ah.A00(r59)) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0324, code lost:
    
        if (X.C1PQ.A00(r59).booleanValue() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0350, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r59, 2342160801698158155L) != false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C32S A04(android.content.Context r57, X.AbstractC018607g r58, com.instagram.common.session.UserSession r59, X.AnonymousClass318 r60, X.InterfaceC60442pS r61, X.C3G2 r62, X.C101934i8 r63, X.C145806hd r64, X.C6Y2 r65, X.C145816he r66, X.C3GU r67, X.C1PH r68, X.InterfaceC671131c r69, X.AnonymousClass315 r70, X.C26191Pa r71, X.AnonymousClass320 r72, X.InterfaceC62242sP r73, X.C32O r74, X.C31E r75, X.C1PY r76, X.InterfaceC61432r6 r77, X.InterfaceC671531g r78, X.InterfaceC61522rF r79, X.C672131m r80, X.C1M1 r81, java.lang.String r82, boolean r83, boolean r84, boolean r85) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1PA.A04(android.content.Context, X.07g, com.instagram.common.session.UserSession, X.318, X.2pS, X.3G2, X.4i8, X.6hd, X.6Y2, X.6he, X.3GU, X.1PH, X.31c, X.315, X.1Pa, X.320, X.2sP, X.32O, X.31E, X.1PY, X.2r6, X.31g, X.2rF, X.31m, X.1M1, java.lang.String, boolean, boolean, boolean):X.32S");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0107, code lost:
    
        if (X.AbstractC61652rS.A0A(r61, X.AbstractC23021Ah.A00(r61)) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0137, code lost:
    
        if (X.C1PQ.A00(r61).booleanValue() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01f1, code lost:
    
        if (X.AbstractC61652rS.A0A(r61, X.AbstractC23021Ah.A00(r61)) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x021e, code lost:
    
        if (X.C1PQ.A00(r61).booleanValue() != false) goto L42;
     */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.1M1, X.1M0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C32S A05(android.content.Context r59, X.AbstractC018607g r60, com.instagram.common.session.UserSession r61, X.InterfaceC60442pS r62, X.C3G2 r63, X.C32O r64, java.lang.String r65) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1PA.A05(android.content.Context, X.07g, com.instagram.common.session.UserSession, X.2pS, X.3G2, X.32O, java.lang.String):X.32S");
    }
}
