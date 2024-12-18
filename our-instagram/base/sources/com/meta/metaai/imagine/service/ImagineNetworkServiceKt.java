package com.meta.metaai.imagine.service;

import X.AbstractC50532MSl;
import X.C05F;
import X.C09530e4;
import X.C14360o3;
import X.C27327C4i;
import X.C27328C4j;
import X.C4Y;
import X.C59031QUp;
import X.C7N;
import X.C85;
import X.CA5;
import X.CAZ;
import X.CW2;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes5.dex */
public abstract class ImagineNetworkServiceKt {
    public static final CW2 A00(C59031QUp c59031QUp) {
        String A0A;
        String A07 = c59031QUp.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (A07 == null || (A0A = c59031QUp.A0A(AbstractC50532MSl.A01(247, 8, 59))) == null) {
            return null;
        }
        return new CW2(A07, A0A, c59031QUp.A09("profile_picture_url"), c59031QUp.getCoercedBooleanField(1, "is_verified"));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.CAZ, java.lang.Object] */
    public static final CAZ A01(CA5 ca5) {
        if (ca5 instanceof C27327C4i) {
            return new Object();
        }
        C14360o3.A0C(ca5, "null cannot be cast to non-null type com.meta.metaai.shared.graphql.GraphQLError.Failure");
        return new C4Y(((C27328C4j) ca5).A00);
    }

    public static final Integer A02(C85 c85) {
        if (c85 != null) {
            int ordinal = c85.ordinal();
            if (ordinal != 5) {
                if (ordinal != 2) {
                    if (ordinal != 9) {
                        if (ordinal != 8) {
                            if (ordinal == 3) {
                                return C05F.A0j;
                            }
                        } else {
                            return C05F.A0Y;
                        }
                    } else {
                        return C05F.A0N;
                    }
                } else {
                    return C05F.A0C;
                }
            } else {
                return C05F.A01;
            }
        }
        return C05F.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.InterfaceC23621Ds r7, X.InterfaceC16620sF r8, long r9) {
        /*
            r3 = 31
            boolean r0 = X.D3k.A02(r7, r3)
            if (r0 == 0) goto L23
            r6 = r7
            X.D3k r6 = (X.D3k) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L29
            goto L42
        L23:
            X.D3k r6 = new X.D3k
            r6.<init>(r3, r7)
            goto L16
        L29:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2e:
            X.AbstractC09560e7.A00(r1)
            r2 = 7
            r1 = 42
            X.PZa r0 = new X.PZa     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L4a X.C902540k -> L50
            r0.<init>(r8, r3, r2, r1)     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L4a X.C902540k -> L50
            r6.A00 = r4     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L4a X.C902540k -> L50
            java.lang.Object r1 = X.LHL.A00(r6, r0, r9)     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L4a X.C902540k -> L50
            if (r1 != r5) goto L45
            return r5
        L42:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L4a X.C902540k -> L50
        L45:
            X.3NY r1 = (X.C3NY) r1     // Catch: java.lang.Exception -> L48 java.util.concurrent.CancellationException -> L4a X.C902540k -> L50
            return r1
        L48:
            r0 = move-exception
            throw r0
        L4a:
            X.C4W r0 = new X.C4W
            r0.<init>()
            goto L55
        L50:
            X.NdK r0 = new X.NdK
            r0.<init>()
        L55:
            X.8jk r1 = new X.8jk
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A03(X.1Ds, X.0sF, long):java.lang.Object");
    }

    public static final C09530e4 A04(C7N c7n, C85 c85) {
        if (c85 != null && c85.ordinal() == 2) {
            if (c7n == C7N.A04) {
                return ImagineNetworkService.A06;
            }
            return ImagineNetworkService.A05;
        }
        if (c7n == C7N.A04) {
            return ImagineNetworkService.A08;
        }
        return ImagineNetworkService.A07;
    }
}
