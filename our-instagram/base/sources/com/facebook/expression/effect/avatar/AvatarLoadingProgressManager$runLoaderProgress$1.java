package com.facebook.expression.effect.avatar;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C55035OZg;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.expression.effect.avatar.AvatarLoadingProgressManager$runLoaderProgress$1", f = "AvatarLoadingProgressManager.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"$this$async"}, s = {"L$0"})
/* loaded from: classes9.dex */
public final class AvatarLoadingProgressManager$runLoaderProgress$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ C55035OZg A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarLoadingProgressManager$runLoaderProgress$1(C55035OZg c55035OZg, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A06 = i;
        this.A08 = c55035OZg;
        this.A07 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        AvatarLoadingProgressManager$runLoaderProgress$1 avatarLoadingProgressManager$runLoaderProgress$1 = new AvatarLoadingProgressManager$runLoaderProgress$1(this.A08, interfaceC23621Ds, this.A06, this.A07);
        avatarLoadingProgressManager$runLoaderProgress$1.A05 = obj;
        return avatarLoadingProgressManager$runLoaderProgress$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0041 -> B:4:0x0018). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1JX r8 = X.C1JX.A02
            int r0 = r9.A02
            r7 = 1
            if (r0 == 0) goto L44
            int r6 = r9.A01
            long r3 = r9.A03
            int r0 = r9.A00
            java.lang.Object r5 = r9.A04
            X.OZg r5 = (X.C55035OZg) r5
            java.lang.Object r1 = r9.A05
            X.19L r1 = (X.C19L) r1
            X.AbstractC09560e7.A00(r10)
        L18:
            java.lang.Integer r2 = r5.A01
            int r2 = X.AbstractC167017dG.A0K(r2)
            int r2 = r2 + 1
            java.lang.Integer r2 = X.AbstractC43592JPx.A0r(r2)
            X.C55035OZg.A01(r5, r2)
            int r6 = r6 + 1
        L29:
            if (r6 >= r0) goto L53
            boolean r2 = X.AnonymousClass194.A07(r1)
            if (r2 == 0) goto L59
            r9.A05 = r1
            r9.A04 = r5
            r9.A00 = r0
            r9.A03 = r3
            r9.A01 = r6
            r9.A02 = r7
            java.lang.Object r2 = X.AbstractC89993zf.A01(r9, r3)
            if (r2 != r8) goto L18
            return r8
        L44:
            X.AbstractC09560e7.A00(r10)
            java.lang.Object r1 = r9.A05
            X.19L r1 = (X.C19L) r1
            int r0 = r9.A06
            long r3 = r9.A07
            X.OZg r5 = r9.A08
            r6 = 0
            goto L29
        L53:
            X.OZg r1 = r9.A08
            r0 = 0
            X.C55035OZg.A01(r1, r0)
        L59:
            X.0eB r8 = X.C0eB.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.expression.effect.avatar.AvatarLoadingProgressManager$runLoaderProgress$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarLoadingProgressManager$runLoaderProgress$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
