package com.instagram.creation.genai.magicmod.common.ui;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C25245BFe;
import X.DS3;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC74953Yl;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.genai.magicmod.common.ui.MagicModGenAIImageSelectorKt$LastItemAnimatingBox$1$1", f = "MagicModGenAIImageSelector.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class MagicModGenAIImageSelectorKt$LastItemAnimatingBox$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ InterfaceC74953Yl A02;
    public final /* synthetic */ InterfaceC74953Yl A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicModGenAIImageSelectorKt$LastItemAnimatingBox$1$1(InterfaceC74953Yl interfaceC74953Yl, InterfaceC74953Yl interfaceC74953Yl2, InterfaceC23621Ds interfaceC23621Ds, float f, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = z;
        this.A01 = f;
        this.A03 = interfaceC74953Yl;
        this.A02 = interfaceC74953Yl2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        boolean z = this.A04;
        return new MagicModGenAIImageSelectorKt$LastItemAnimatingBox$1$1(this.A03, this.A02, interfaceC23621Ds, this.A01, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            if (this.A04) {
                C25245BFe A00 = C25245BFe.A00(500, 0);
                DS3 ds3 = new DS3(this.A03, this.A02, this.A01);
                this.A00 = 1;
                if (SuspendAnimationKt.A03(A00, this, ds3, 0.0f, 1.0f, 0.0f) == c1jx) {
                    return c1jx;
                }
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MagicModGenAIImageSelectorKt$LastItemAnimatingBox$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
