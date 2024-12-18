package androidx.compose.ui.platform;

import X.C12W;
import X.C19L;
import X.C5D0;
import X.InterfaceC121645fG;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class AndroidPlatformTextInputSession implements C19L, InterfaceC121645fG {
    public final View A00;
    public final C5D0 A01;
    public final AtomicReference A02 = new AtomicReference(null);
    public final C19L A03;

    @Override // X.C19L
    public final C12W Arv() {
        return this.A03.Arv();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.InterfaceC121645fG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1JX EnS(X.InterfaceC65178TfM r11, X.InterfaceC23621Ds r12) {
        /*
            r10 = this;
            r4 = 5
            boolean r0 = X.C9CW.A00(r12, r4)
            if (r0 == 0) goto L28
            r3 = r12
            X.9CW r3 = (X.C9CW) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r4 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 == r1) goto L52
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L28:
            r0 = 42
            X.9CW r3 = new X.9CW
            r3.<init>(r10, r12, r4, r0)
            goto L15
        L30:
            X.AbstractC09560e7.A00(r4)
            java.util.concurrent.atomic.AtomicReference r6 = r10.A02
            r0 = 0
            X.Td9 r7 = new X.Td9
            r7.<init>(r0, r10, r11)
            r8 = 0
            r0 = 19
            X.PZq r5 = new X.PZq
            r5.<init>(r10, r8, r0)
            r3.A00 = r1
            r9 = 4
            X.MCP r4 = new X.MCP
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r0 = X.AnonymousClass194.A00(r3, r4)
            if (r0 != r2) goto L55
            return r2
        L52:
            X.AbstractC09560e7.A00(r4)
        L55:
            X.PW2 r0 = new X.PW2
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.EnS(X.TfM, X.1Ds):X.1JX");
    }

    public AndroidPlatformTextInputSession(View view, C5D0 c5d0, C19L c19l) {
        this.A00 = view;
        this.A01 = c5d0;
        this.A03 = c19l;
    }
}
