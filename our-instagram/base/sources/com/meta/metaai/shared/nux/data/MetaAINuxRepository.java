package com.meta.metaai.shared.nux.data;

import X.AbstractC166997dE;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C28933Cph;
import X.C2JM;
import X.CL2;
import X.CX3;
import X.EnumC27387C6q;
import X.InterfaceC23621Ds;
import X.InterfaceC40711ue;
import android.app.Application;
import com.facebook.pando.PandoGraphQLRequest;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.shared.nux.service.MetaAINuxNetworkService;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public final class MetaAINuxRepository {
    public final Application A00;
    public final FoaUserSession A01;
    public final MetaAINuxNetworkService A02;

    public final Object A00(EnumC27387C6q enumC27387C6q, String str, InterfaceC23621Ds interfaceC23621Ds) {
        C14360o3.A0B(str, 0);
        this.A00.getSharedPreferences("MetaAINuxImpressionCache", 0).edit().putBoolean(str, true).commit();
        MetaAINuxNetworkService metaAINuxNetworkService = this.A02;
        String userId = this.A01.getUserId();
        if (userId != null) {
            InterfaceC40711ue interfaceC40711ue = metaAINuxNetworkService.A01;
            try {
                C28933Cph c28933Cph = (C28933Cph) CX3.class.getMethod("create", new Class[0]).invoke(null, new Object[0]);
                C2JM c2jm = c28933Cph.A00;
                c2jm.A04("owner", userId);
                c28933Cph.A03 = true;
                c2jm.A04("intent_card_type", MetaAINuxNetworkService.A00(enumC27387C6q));
                c28933Cph.A02 = true;
                c2jm.A02("has_seen", true);
                c28933Cph.A01 = true;
                PandoGraphQLRequest A00 = c28933Cph.A00();
                C14360o3.A07(A00);
                Object A002 = CL2.A00(interfaceC40711ue, A00, interfaceC23621Ds);
                C1JX c1jx = C1JX.A02;
                if (A002 != c1jx) {
                    A002 = C0eB.A00;
                }
                if (A002 != c1jx) {
                    return C0eB.A00;
                }
                return A002;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        throw AbstractC166997dE.A0g();
    }

    public /* synthetic */ MetaAINuxRepository(Application application, FoaUserSession foaUserSession) {
        MetaAINuxNetworkService metaAINuxNetworkService = new MetaAINuxNetworkService(application, foaUserSession);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A02 = metaAINuxNetworkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.EnumC27387C6q r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 23
            boolean r0 = X.C29631D3m.A03(r7, r3)
            if (r0 == 0) goto L72
            r4 = r7
            X.D3m r4 = (X.C29631D3m) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L64
            if (r0 != r1) goto L85
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L5b
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r4 = r3.A00
            X.2JS r4 = (X.C2JS) r4
            java.lang.Class<X.QV1> r3 = X.QV1.class
            r2 = 0
            r0 = 1080(0x438, float:1.513E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = -1919619742(0xffffffff8d94ed62, float:-9.178352E-31)
            X.2JS r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L59
            r0 = 802(0x322, float:1.124E-42)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
        L4c:
            X.3NX r3 = X.AbstractC25235BEs.A0f(r0)
        L50:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L77
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            return r0
        L59:
            r0 = 0
            goto L4c
        L5b:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L50
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L64:
            X.AbstractC09560e7.A00(r3)
            com.meta.metaai.shared.nux.service.MetaAINuxNetworkService r0 = r5.A02
            r4.A00 = r1
            java.lang.Object r3 = r0.A01(r6, r4)
            if (r3 != r2) goto L24
            return r2
        L72:
            X.D3m r4 = X.C29631D3m.A00(r5, r7, r3)
            goto L16
        L77:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L80
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L80:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L85:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.nux.data.MetaAINuxRepository.A01(X.C6q, X.1Ds):java.lang.Object");
    }
}
