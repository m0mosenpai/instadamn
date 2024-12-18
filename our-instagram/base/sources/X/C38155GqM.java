package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GqM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38155GqM implements InterfaceC13000lm {
    public static final HashMap A01 = AbstractC166987dD.A1G();
    public final UserSession A00;

    public C38155GqM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        r4.A03("FAILURE_REASON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.AbstractC115105If r10, X.C93Z r11) {
        /*
            r9 = this;
            r3 = 0
            com.instagram.common.session.UserSession r0 = r9.A00
            X.1ZW r2 = X.C1ZV.A00(r0)
            java.lang.Integer r1 = X.C05F.A0u
            java.lang.Integer r0 = X.C05F.A06
            X.1ZX r4 = r2.A01(r1, r0, r3)
            java.lang.Object r8 = r10.A00()
            X.1ul r8 = (X.C40781ul) r8
            java.lang.String r2 = "FAILURE_REASON"
            java.lang.String r3 = "FAILURE_NAME"
            r0 = 632(0x278, float:8.86E-43)
            java.lang.String r6 = X.AbstractC111324zv.A00(r0)
            if (r8 == 0) goto L93
            int r1 = r8.mStatusCode
            java.lang.String r0 = "RESPONSE_CODE"
            r4.A01(r0, r1)
            java.lang.String r0 = "NETWORK"
            r4.A03(r6, r0)
            java.lang.String r0 = r8.mErrorTitle
            if (r0 == 0) goto L34
            r4.A03(r3, r0)
        L34:
            java.lang.String r0 = r8.getErrorMessage()
            if (r0 == 0) goto L93
        L3a:
            r4.A03(r2, r0)
        L3d:
            r4.A00()
        L40:
            int r7 = r11.A01
            boolean r0 = X.AbstractC38151GqI.A01(r7)
            if (r0 == 0) goto L6e
            X.02i r5 = X.C006802i.A0p
            r4 = 1011615852(0x3c4c086c, float:0.01245318)
            if (r8 == 0) goto L6f
            int r1 = r8.mStatusCode
            java.lang.String r0 = "RESPONSE_CODE"
            r5.markerAnnotate(r4, r7, r0, r1)
            java.lang.String r0 = "NETWORK"
            r5.markerAnnotate(r4, r7, r6, r0)
            java.lang.String r0 = r8.mErrorTitle
            r5.markerAnnotate(r4, r7, r3, r0)
            java.lang.String r0 = r8.getErrorMessage()
        L64:
            r5.markerAnnotate(r4, r7, r2, r0)
        L67:
            X.C14360o3.A0A(r5)
            r0 = 3
        L6b:
            A00(r5, r7, r0)
        L6e:
            return
        L6f:
            java.lang.Throwable r1 = r10.A01()
            if (r1 == 0) goto L67
            boolean r0 = r1 instanceof X.C39527Hct
            if (r0 == 0) goto L7e
            X.C14360o3.A0A(r5)
            r0 = 4
            goto L6b
        L7e:
            java.lang.String r0 = "CLIENT"
            r5.markerAnnotate(r4, r7, r6, r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r5.markerAnnotate(r4, r7, r3, r0)
            java.lang.String r0 = r1.getMessage()
            goto L64
        L93:
            java.lang.Throwable r1 = r10.A01()
            if (r1 == 0) goto L3d
            boolean r0 = r1 instanceof X.C39527Hct
            if (r0 != 0) goto L40
            r4.A05(r1)
            java.lang.String r0 = "CLIENT"
            r4.A03(r6, r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            X.C14360o3.A07(r0)
            r4.A03(r3, r0)
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L3d
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38155GqM.A01(X.5If, X.93Z):void");
    }

    public static final void A00(C006802i c006802i, int i, short s) {
        if (A01.remove(Integer.valueOf(i)) != null) {
            c006802i.markerEnd(1011615852, i, s);
        }
    }

    public final void A02(C2044693f c2044693f, C93Z c93z, boolean z) {
        int i = c93z.A01;
        if (AbstractC38151GqI.A01(i)) {
            C006802i c006802i = C006802i.A0p;
            c006802i.markerPoint(1011615852, i, "GRID_RESPONSE_PARSED");
            if (c2044693f.CR4()) {
                c006802i.markerAnnotate(1011615852, i, "SOURCE", "CACHED");
            }
            if (!z) {
                A00(c006802i, i, (short) 2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 == X.C05F.A0j) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C93Z r7, java.lang.Integer r8) {
        /*
            r6 = this;
            X.02i r4 = X.C006802i.A0p
            java.util.HashMap r2 = X.C38155GqM.A01
            int r3 = r7.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 113(0x71, float:1.58E-43)
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r2.put(r1, r0)
            r2 = 1011615852(0x3c4c086c, float:0.01245318)
            r0 = 30000(0x7530, double:1.4822E-319)
            r4.A0Q(r2, r3, r0)
            java.lang.Integer r5 = r7.A03
            int r0 = r5.intValue()
            switch(r0) {
                case 0: goto L59;
                case 1: goto L5c;
                case 2: goto L5f;
                case 3: goto L62;
                case 4: goto L65;
                case 5: goto L68;
                default: goto L24;
            }
        L24:
            java.lang.String r1 = "cache_fetch"
        L26:
            java.lang.String r0 = "FETCH_REASON"
            r4.markerAnnotate(r2, r3, r0, r1)
            java.lang.Integer r0 = X.C05F.A0Y
            if (r5 == r0) goto L34
            java.lang.Integer r0 = X.C05F.A0j
            r1 = 0
            if (r5 != r0) goto L35
        L34:
            r1 = 1
        L35:
            java.lang.String r0 = "IS_PREFETCH"
            r4.markerAnnotate(r2, r3, r0, r1)
            java.lang.String r0 = "GRID_REQUEST_SENT"
            r4.markerPoint(r2, r3, r0)
            java.lang.String r1 = "GRID_TYPE"
            java.lang.String r0 = "EXPLORE"
            r4.markerAnnotate(r2, r3, r1, r0)
            boolean r1 = r7.A0E
            java.lang.String r0 = "IS_FIRST_PAGE"
            r4.markerAnnotate(r2, r3, r0, r1)
            if (r8 == 0) goto L58
            int r1 = r8.intValue()
            java.lang.String r0 = "INITIAL_GRID_ITEM_COUNT"
            r4.markerAnnotate(r2, r3, r0, r1)
        L58:
            return
        L59:
            java.lang.String r1 = "surface_created"
            goto L26
        L5c:
            java.lang.String r1 = "auto_refresh"
            goto L26
        L5f:
            java.lang.String r1 = "pull_to_refresh"
            goto L26
        L62:
            java.lang.String r1 = "pagination"
            goto L26
        L65:
            java.lang.String r1 = "foreground_prefetch"
            goto L26
        L68:
            java.lang.String r1 = "background_prefetch"
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38155GqM.A03(X.93Z, java.lang.Integer):void");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C006802i.A0p.endAllInstancesOfMarker(1011615852, (short) 4);
        A01.clear();
    }
}
