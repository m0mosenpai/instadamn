package com.instagram.barcelona.location.api;

import X.C14360o3;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class LocationRepository {
    public final UserSession A00;
    public final Map A01;

    public LocationRepository(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r4 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(com.instagram.barcelona.location.model.LocationModel r21) {
        /*
            r20 = this;
            r5 = r21
            long r0 = r5.A00
            r2 = r20
            java.util.Map r3 = r2.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            boolean r4 = r3.containsKey(r2)
            if (r4 == 0) goto L47
            java.lang.Object r4 = r3.get(r2)
            com.instagram.barcelona.location.model.LocationModel r4 = (com.instagram.barcelona.location.model.LocationModel) r4
            r16 = 0
            java.lang.Double r6 = r5.A01
            if (r6 != 0) goto L22
            if (r4 == 0) goto L59
            java.lang.Double r6 = r4.A01
        L22:
            java.lang.Double r7 = r5.A02
            if (r7 != 0) goto L4b
            if (r4 == 0) goto L4e
            java.lang.Double r7 = r4.A02
        L2a:
            java.lang.String r9 = r4.A05
            java.lang.String r10 = r4.A04
            java.lang.String r11 = r4.A0A
            java.lang.String r12 = r4.A0B
            java.lang.String r13 = r4.A07
            java.lang.String r14 = r4.A09
            java.lang.String r15 = r4.A08
        L38:
            java.lang.String r8 = r5.A06
            r4 = 1
            X.C14360o3.A0B(r8, r4)
            com.instagram.barcelona.location.model.LocationModel r5 = new com.instagram.barcelona.location.model.LocationModel
            r17 = r16
            r18 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L47:
            r3.put(r2, r5)
            return
        L4b:
            if (r4 == 0) goto L50
            goto L2a
        L4e:
            r7 = r16
        L50:
            r9 = r16
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            goto L38
        L59:
            r6 = r16
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.location.api.LocationRepository.A00(com.instagram.barcelona.location.model.LocationModel):void");
    }
}
