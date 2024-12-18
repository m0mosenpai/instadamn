package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.6rU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151266rU {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC38371qR A00(com.instagram.common.session.UserSession r3, java.lang.String r4, java.lang.String r5) {
        /*
            X.6rV r1 = X.C151276rV.A00
            java.lang.Class<X.6rW> r0 = X.C151286rW.class
            java.lang.Object r0 = r3.A01(r0, r1)
            X.6rW r0 = (X.C151286rW) r0
            r2 = 0
            if (r4 == 0) goto L30
            java.util.Map r1 = r0.A00
            java.lang.Object r0 = r1.get(r4)
            X.1v4 r0 = (X.C40971v4) r0
            if (r0 == 0) goto L1f
            X.1qM r0 = r0.A0K
            if (r0 == 0) goto L1f
            java.lang.String r2 = r0.getId()
        L1f:
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L30
            java.lang.Object r0 = r1.remove(r4)
            X.1v4 r0 = (X.C40971v4) r0
            if (r0 == 0) goto L30
        L2d:
            X.1qR r0 = (X.InterfaceC38371qR) r0
            return r0
        L30:
            X.1DX r0 = X.C1DW.A00(r3)
            X.1qM r0 = r0.A02(r5)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC151266rU.A00(com.instagram.common.session.UserSession, java.lang.String, java.lang.String):X.1qR");
    }

    public static final String A01(UserSession userSession, C40971v4 c40971v4) {
        C151286rW c151286rW = (C151286rW) userSession.A01(C151286rW.class, C151276rV.A00);
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        c151286rW.A00.put(obj, c40971v4);
        return obj;
    }

    public static final void A02(Bundle bundle, UserSession userSession, C40971v4 c40971v4) {
        C151286rW c151286rW = (C151286rW) userSession.A01(C151286rW.class, C151276rV.A00);
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        c151286rW.A00.put(obj, c40971v4);
        bundle.putString("fragment_argument_ad_retrieval_key", obj);
    }
}
