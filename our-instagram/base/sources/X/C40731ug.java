package X;

import com.instagram.common.session.UserSession;
import com.instagram.graphservice.service.pando.IGPandoGraphQLRequestDecoratorInfo;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40731ug {
    public static final C40731ug A00 = new Object();
    public static final ExecutorC14040nU A01;

    public final C40851us A02(AbstractC12990ll abstractC12990ll, String str) {
        C14360o3.A0B(abstractC12990ll, 1);
        return new C40851us(null, null, A01, AbstractC09440dt.A01(new C207429Fv(str, abstractC12990ll, 30)), null, null);
    }

    public final C40851us A03(UserSession userSession, String str, InterfaceC09390do interfaceC09390do) {
        C14360o3.A0B(userSession, 2);
        C17050sx A012 = AbstractC09440dt.A01(C40771uk.A00);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36317320038978622L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36317320039109696L);
        C17050sx A013 = AbstractC09440dt.A01(new C207119Eq(7, userSession, A06));
        C17050sx A014 = AbstractC09440dt.A01(C40811uo.A00);
        boolean A063 = C18U.A06(c06090Tz, userSession, 36314476773706364L);
        boolean A064 = C18U.A06(c06090Tz, userSession, 36314476773771901L);
        boolean A065 = C18U.A06(c06090Tz, userSession, 36317320040092745L);
        if (!str.equals("distillery") && !str.equals("instagram")) {
            throw new IllegalStateException(AnonymousClass001.A0g("Unable to create a query executor. The schema type \"", str, "\" is unsupported."));
        }
        C17050sx c17050sx = new C17050sx(new C9GA(userSession, str, A013, A014, A012, A062, A06, A063));
        C40831uq c40831uq = new C40831uq(A012);
        C17050sx A015 = AbstractC09440dt.A01(new C207429Fv(str, userSession, 29));
        return new C40851us(new C40841ur(new C9EM(userSession, 22), A063, A064, A065), c40831uq, A01, c17050sx, interfaceC09390do, A015);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1ug, java.lang.Object] */
    static {
        C13920nI c13920nI = C13920nI.A00;
        InterfaceC14020nS A002 = C14120nc.A00();
        C14360o3.A07(A002);
        C14360o3.A0B(c13920nI, 1);
        A01 = new ExecutorC14040nU(new C18220v9(c13920nI, A002), 2122904696, 3, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005d  */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.pando.PandoPrimaryExecution, com.facebook.pando.primaryexecution.tigon.PandoTigonService] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.pando.primaryexecution.tigon.PandoTigonService A00(X.AbstractC12990ll r11, java.lang.String r12, boolean r13) {
        /*
            if (r13 == 0) goto Lb9
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317320037209127(0x81066900031427, double:3.030557657416399E-306)
            boolean r0 = X.C18U.A06(r2, r11, r0)
            if (r0 == 0) goto Lbe
            X.NxU r0 = com.instagram.service.http.IGTigonAsyncHttpServiceHolder.Companion
            r0 = 0
            X.C14360o3.A0B(r11, r0)
            java.lang.Class<com.instagram.service.http.IGTigonAsyncHttpServiceHolder> r2 = com.instagram.service.http.IGTigonAsyncHttpServiceHolder.class
            r1 = 30
            X.X2z r0 = new X.X2z
            r0.<init>(r11, r1)
            java.lang.Object r4 = r11.A01(r2, r0)
            com.facebook.tigon.iface.TigonServiceHolder r4 = (com.facebook.tigon.iface.TigonServiceHolder) r4
        L24:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36885432541446773(0x830b1b00050275, double:3.389834292701724E-306)
            java.lang.String r5 = X.C18U.A04(r2, r11, r0)
            r0 = 36885432541381236(0x830b1b00040274, double:3.3898342926602784E-306)
            java.lang.String r0 = X.C18U.A04(r2, r11, r0)
            com.deidentified.ohai.tigon.TigonOhaiServiceHolder r3 = new com.deidentified.ohai.tigon.TigonOhaiServiceHolder
            r3.<init>(r4, r5, r0)
            r0 = 36317320037536812(0x8106690008142c, double:3.030557657623628E-306)
            boolean r8 = X.C18U.A06(r2, r11, r0)
            r0 = 36314476773247608(0x8103d300460a78, double:3.028759565838229E-306)
            boolean r9 = X.C18U.A06(r2, r11, r0)
            java.lang.String r0 = "distillery"
            boolean r0 = X.C14360o3.A0K(r12, r0)
            r6 = 0
            r10 = 1
            r5 = 0
            java.lang.String r2 = ""
            if (r0 == 0) goto L8b
            X.5Od r0 = X.C116245Od.A00
            com.instagram.graphservice.service.pando.IGPandoGraphQLRequestDecoratorInfo r3 = A01(r11, r0, r13)
            X.4IL r0 = com.facebook.pando.primaryexecution.tigon.PandoTigonService.Companion
            X.4IM r1 = new X.4IM
            r1.<init>(r6, r5, r10)
            r0 = 9
            X.9Eb r6 = new X.9Eb
            r6.<init>(r3, r0)
            r0 = 23
            X.9EM r7 = new X.9EM
            r7.<init>(r3, r0)
            com.facebook.pando.primaryexecution.tigon.PandoTigonConfig r5 = new com.facebook.pando.primaryexecution.tigon.PandoTigonConfig
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 2
            X.C14360o3.A0B(r4, r0)
            com.facebook.jni.HybridData r1 = com.facebook.pando.primaryexecution.tigon.PandoTigonService.initHybridData(r2, r4, r1, r5)
        L85:
            com.facebook.pando.primaryexecution.tigon.PandoTigonService r0 = new com.facebook.pando.primaryexecution.tigon.PandoTigonService
            r0.<init>(r1)
            return r0
        L8b:
            java.lang.String r0 = "instagram"
            boolean r0 = X.C14360o3.A0K(r12, r0)
            if (r0 == 0) goto Lc7
            X.4IF r0 = X.C4IF.A00
            com.instagram.graphservice.service.pando.IGPandoGraphQLRequestDecoratorInfo r4 = A01(r11, r0, r13)
            X.4IL r0 = com.facebook.pando.primaryexecution.tigon.PandoTigonService.Companion
            X.4IM r1 = new X.4IM
            r1.<init>(r6, r5, r10)
            r0 = 10
            X.9Eb r6 = new X.9Eb
            r6.<init>(r4, r0)
            r0 = 24
            X.9EM r7 = new X.9EM
            r7.<init>(r4, r0)
            com.facebook.pando.primaryexecution.tigon.PandoTigonConfig r5 = new com.facebook.pando.primaryexecution.tigon.PandoTigonConfig
            r5.<init>(r6, r7, r8, r9, r10)
            com.facebook.jni.HybridData r1 = com.facebook.pando.primaryexecution.tigon.PandoTigonService.initHybridData(r2, r3, r1, r5)
            goto L85
        Lb9:
            com.instagram.service.tigon.IGTigonService r4 = com.instagram.service.tigon.IGTigonService.getTigonService(r11)
            goto Lc2
        Lbe:
            com.instagram.service.tigon.IGAuthedTigonService r4 = com.instagram.service.tigon.IGAuthedTigonService.getInstance(r11)
        Lc2:
            X.C14360o3.A07(r4)
            goto L24
        Lc7:
            java.lang.String r1 = "Unable to create a query executor. No tigon service set for the schema type \""
            java.lang.String r0 = "\"."
            java.lang.String r1 = X.AnonymousClass001.A0g(r1, r12, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40731ug.A00(X.0ll, java.lang.String, boolean):com.facebook.pando.primaryexecution.tigon.PandoTigonService");
    }

    public static final IGPandoGraphQLRequestDecoratorInfo A01(AbstractC12990ll abstractC12990ll, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        if (z) {
            C14360o3.A0B(abstractC12990ll, 0);
            C3JU A002 = C3JU.A02.A00();
            String A04 = C18U.A04(C06090Tz.A05, abstractC12990ll, 36875244878692419L);
            ConcurrentHashMap concurrentHashMap = C4IG.A01;
            if (!concurrentHashMap.containsKey(A04)) {
                concurrentHashMap.put(A04, new C4IG(A04));
            }
            return new IGPandoGraphQLRequestDecoratorInfo(A002, (C4IG) AbstractC09990gB.A0I(A04, concurrentHashMap), interfaceC16820sZ);
        }
        return new IGPandoGraphQLRequestDecoratorInfo(null, null, interfaceC16820sZ);
    }
}
