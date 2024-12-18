package com.airbnb.lottie.compose;

import X.AbstractC63385Sj0;
import X.AnonymousClass001;
import X.B4Z;
import X.C14360o3;
import X.C63338Shs;
import X.CV0;
import X.TUS;
import android.content.Context;

/* loaded from: classes5.dex */
public abstract class RememberLottieCompositionKt {
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        if (r13 == r1) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(android.content.Context r13, X.CV0 r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt.A01(android.content.Context, X.CV0, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static final C63338Shs A00(Context context, CV0 cv0, String str) {
        if (cv0 != null) {
            boolean A0K = C14360o3.A0K(str, "__LottieInternalDefaultCacheKey__");
            String str2 = cv0.A00;
            if (A0K) {
                String A0R = AnonymousClass001.A0R("url_", str2);
                return AbstractC63385Sj0.A05(null, A0R, new TUS(context, str2, A0R, 1));
            }
            return AbstractC63385Sj0.A05(null, str, new TUS(context, str2, str, 1));
        }
        throw B4Z.A00();
    }
}
