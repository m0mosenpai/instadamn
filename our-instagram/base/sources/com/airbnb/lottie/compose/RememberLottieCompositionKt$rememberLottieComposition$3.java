package com.airbnb.lottie.compose;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.CV0;
import X.InterfaceC16610sE;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC74953Yl;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", i = {0, 0, 1, 1}, l = {90, 92}, m = "invokeSuspend", n = {"exception", "failedCount", "exception", "failedCount"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
public final class RememberLottieCompositionKt$rememberLottieComposition$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ InterfaceC74953Yl A04;
    public final /* synthetic */ CV0 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ InterfaceC16610sE A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$rememberLottieComposition$3(Context context, InterfaceC74953Yl interfaceC74953Yl, CV0 cv0, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16610sE interfaceC16610sE) {
        super(2, interfaceC23621Ds);
        this.A0A = interfaceC16610sE;
        this.A03 = context;
        this.A05 = cv0;
        this.A09 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A06 = str4;
        this.A04 = interfaceC74953Yl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC16610sE interfaceC16610sE = this.A0A;
        return new RememberLottieCompositionKt$rememberLottieComposition$3(this.A03, this.A04, this.A05, this.A09, this.A07, this.A08, this.A06, interfaceC23621Ds, interfaceC16610sE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (X.AbstractC166987dD.A1a(r14) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0027 -> B:8:0x0049). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x003d -> B:6:0x0043). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RememberLottieCompositionKt$rememberLottieComposition$3) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
