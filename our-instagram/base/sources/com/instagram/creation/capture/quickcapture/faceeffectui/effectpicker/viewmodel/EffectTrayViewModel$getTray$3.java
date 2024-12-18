package com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.InterfaceC16600sD;
import X.InterfaceC19960yQ;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.faceeffectui.effectpicker.viewmodel.EffectTrayViewModel$getTray$3", f = "EffectTrayViewModel.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class EffectTrayViewModel$getTray$3 extends AbstractC23611Dp implements InterfaceC16600sD {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;

    public EffectTrayViewModel$getTray$3(InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        EffectTrayViewModel$getTray$3 effectTrayViewModel$getTray$3 = new EffectTrayViewModel$getTray$3((InterfaceC23621Ds) obj4);
        effectTrayViewModel$getTray$3.A01 = obj;
        effectTrayViewModel$getTray$3.A02 = obj2;
        effectTrayViewModel$getTray$3.A03 = booleanValue;
        return effectTrayViewModel$getTray$3.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            Object obj2 = this.A02;
            if (this.A03) {
                this.A01 = null;
                this.A00 = 1;
                if (interfaceC19960yQ.emit(obj2, this) == c1jx) {
                    return c1jx;
                }
            }
        }
        return C0eB.A00;
    }
}
