package com.instagram.creation.capture.quickcapture.save;

import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass195;
import X.C05F;
import X.C11T;
import X.C12L;
import X.C14090nZ;
import X.C14360o3;
import X.C19K;
import X.C19L;
import X.InterfaceC16820sZ;
import X.InterfaceC25207BDf;
import X.RunnableC24396Ard;
import X.RunnableC24772Axu;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class CachingVideoSaver {
    public final C14090nZ A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final C19L A05;

    public final void A01(InterfaceC25207BDf interfaceC25207BDf, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        Runnable runnableC24396Ard;
        int i;
        C14360o3.A0B(str, 0);
        if (z) {
            this.A02.put(str, interfaceC25207BDf);
        } else {
            if (this.A03.containsKey(str)) {
                runnableC24396Ard = new RunnableC24772Axu(this, interfaceC25207BDf, str);
            } else {
                this.A02.put(str, interfaceC25207BDf);
                if (this.A04.containsKey(str)) {
                    runnableC24396Ard = new RunnableC24396Ard(interfaceC25207BDf);
                }
            }
            C11T.A02(runnableC24396Ard);
            return;
        }
        Map map = this.A01;
        Number number = (Number) map.get(str);
        if (number != null) {
            i = number.intValue() + 1;
        } else {
            i = 0;
        }
        map.put(str, Integer.valueOf(i));
        Map map2 = this.A04;
        AnonymousClass195 anonymousClass195 = (AnonymousClass195) map2.get(str);
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        String str2 = (String) this.A03.remove(str);
        if (str2 != null && z2) {
            new File(str2).delete();
        }
        C19L c19l = this.A05;
        CachingVideoSaver$renderInternal$2 cachingVideoSaver$renderInternal$2 = new CachingVideoSaver$renderInternal$2(this, str, null, interfaceC16820sZ, i);
        map2.put(str, AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, cachingVideoSaver$renderInternal$2, c19l));
    }

    public CachingVideoSaver() {
        C14090nZ CPG = C12L.A00.CPG(460, 3);
        C19K A02 = AnonymousClass194.A02(CPG);
        C14360o3.A0B(CPG, 1);
        C14360o3.A0B(A02, 2);
        this.A00 = CPG;
        this.A05 = A02;
        this.A04 = new LinkedHashMap();
        this.A01 = new LinkedHashMap();
        this.A03 = new LinkedHashMap();
        this.A02 = new LinkedHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|13|(1:15)|16|(1:18)|19|20))|31|6|7|(0)(0)|12|13|(0)|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r2 = new X.C09540e5(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.save.CachingVideoSaver r7, X.InterfaceC25207BDf r8, X.InterfaceC23621Ds r9, X.InterfaceC16820sZ r10) {
        /*
            r3 = 10
            boolean r0 = X.C206489Cf.A00(r9, r3)
            if (r0 == 0) goto L2e
            r6 = r9
            X.9Cf r6 = (X.C206489Cf) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r2 = r6.A04
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L3c
            if (r0 != r4) goto L34
            java.lang.Object r3 = r6.A03
            X.AAW r3 = (X.AAW) r3
            java.lang.Object r1 = r6.A02
            X.2ya r1 = (X.InterfaceC65982ya) r1
            java.lang.Object r8 = r6.A01
            X.BDf r8 = (X.InterfaceC25207BDf) r8
            goto L68
        L2e:
            X.9Cf r6 = new X.9Cf
            r6.<init>(r7, r9, r3)
            goto L16
        L34:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L3c:
            X.AbstractC09560e7.A00(r2)
            X.AkT r1 = new X.AkT
            r1.<init>(r7)
            X.Are r0 = new X.Are
            r0.<init>(r8)
            X.C11T.A02(r0)
            java.lang.Object r3 = r10.invoke()     // Catch: java.lang.Throwable -> L73
            X.AAW r3 = (X.AAW) r3     // Catch: java.lang.Throwable -> L73
            X.47Z r0 = r3.A06     // Catch: java.lang.Throwable -> L73
            r0.A0W(r1)     // Catch: java.lang.Throwable -> L73
            X.0nZ r0 = r7.A00     // Catch: java.lang.Throwable -> L73
            r6.A01 = r8     // Catch: java.lang.Throwable -> L73
            r6.A02 = r1     // Catch: java.lang.Throwable -> L73
            r6.A03 = r3     // Catch: java.lang.Throwable -> L73
            r6.A00 = r4     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = X.AbstractC226749zW.A00(r0, r3, r6)     // Catch: java.lang.Throwable -> L73
            if (r2 != r5) goto L6b
            return r5
        L68:
            X.AbstractC09560e7.A00(r2)     // Catch: java.lang.Throwable -> L73
        L6b:
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L73
            X.47Z r0 = r3.A06     // Catch: java.lang.Throwable -> L73
            r0.A0X(r1)     // Catch: java.lang.Throwable -> L73
            goto L79
        L73:
            r0 = move-exception
            X.0e5 r2 = new X.0e5
            r2.<init>(r0)
        L79:
            boolean r0 = r2 instanceof X.C09540e5
            r0 = r0 ^ 1
            if (r0 == 0) goto L8a
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            X.Avj r0 = new X.Avj
            r0.<init>(r8, r1)
            X.C11T.A02(r0)
        L8a:
            java.lang.Throwable r1 = X.C09550e6.A00(r2)
            if (r1 == 0) goto L98
            X.Avk r0 = new X.Avk
            r0.<init>(r8, r1)
            X.C11T.A02(r0)
        L98:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.save.CachingVideoSaver.A00(com.instagram.creation.capture.quickcapture.save.CachingVideoSaver, X.BDf, X.1Ds, X.0sZ):java.lang.Object");
    }
}
