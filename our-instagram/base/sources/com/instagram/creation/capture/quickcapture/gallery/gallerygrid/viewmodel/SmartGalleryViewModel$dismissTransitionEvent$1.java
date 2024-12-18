package com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.C86S;
import X.InterfaceC16610sE;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.SmartGalleryViewModel$dismissTransitionEvent$1", f = "SmartGalleryViewModel.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class SmartGalleryViewModel$dismissTransitionEvent$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C86S A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartGalleryViewModel$dismissTransitionEvent$1(C86S c86s, InterfaceC23621Ds interfaceC23621Ds) {
        super(3, interfaceC23621Ds);
        this.A03 = c86s;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        SmartGalleryViewModel$dismissTransitionEvent$1 smartGalleryViewModel$dismissTransitionEvent$1 = new SmartGalleryViewModel$dismissTransitionEvent$1(this.A03, (InterfaceC23621Ds) obj3);
        smartGalleryViewModel$dismissTransitionEvent$1.A01 = booleanValue;
        smartGalleryViewModel$dismissTransitionEvent$1.A02 = booleanValue2;
        return smartGalleryViewModel$dismissTransitionEvent$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        boolean z = false;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            boolean z2 = this.A01;
            boolean z3 = this.A02;
            if (z2 && z3) {
                InterfaceC24731Iq interfaceC24731Iq = this.A03.A04;
                this.A00 = 1;
                if (interfaceC24731Iq.EMz(false, this) == c1jx) {
                    return c1jx;
                }
            }
            return Boolean.valueOf(z);
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
