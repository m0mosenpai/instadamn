package com.instagram.camera.effect.mq.effectrendering;

import X.AbstractC23611Dp;
import X.C0eB;
import X.C1821385x;
import X.C203588zK;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.camera.effect.models.CameraAREffect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.camera.effect.mq.effectrendering.EffectRenderingService$applyEffect$1", f = "EffectRenderingService.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class EffectRenderingService$applyEffect$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ CameraAREffect A02;
    public final /* synthetic */ C1821385x A03;
    public final /* synthetic */ C203588zK A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectRenderingService$applyEffect$1(CameraAREffect cameraAREffect, C1821385x c1821385x, C203588zK c203588zK, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = c1821385x;
        this.A02 = cameraAREffect;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = c203588zK;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C1821385x c1821385x = this.A03;
        EffectRenderingService$applyEffect$1 effectRenderingService$applyEffect$1 = new EffectRenderingService$applyEffect$1(this.A02, c1821385x, this.A04, this.A05, this.A06, interfaceC23621Ds);
        effectRenderingService$applyEffect$1.A01 = obj;
        return effectRenderingService$applyEffect$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EffectRenderingService$applyEffect$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, X.PqH] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.6i8] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0sk] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.AbstractMap, java.util.HashMap] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.camera.effect.mq.effectrendering.EffectRenderingService$applyEffect$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
