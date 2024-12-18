package com.instagram.creation.capture.quickcapture.cameradestinationpicker;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1821786b;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.cameradestinationpicker.CameraDestinationPickerController$7", f = "CameraDestinationPickerController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class CameraDestinationPickerController$7 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ boolean A00;
    public final /* synthetic */ C1821786b A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraDestinationPickerController$7(C1821786b c1821786b, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = c1821786b;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        CameraDestinationPickerController$7 cameraDestinationPickerController$7 = new CameraDestinationPickerController$7(this.A01, interfaceC23621Ds);
        cameraDestinationPickerController$7.A00 = ((Boolean) obj).booleanValue();
        return cameraDestinationPickerController$7;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CameraDestinationPickerController$7) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        boolean z = this.A00;
        C1821786b c1821786b = this.A01;
        c1821786b.A0I = z;
        C1821786b.A06(c1821786b);
        C1821786b.A04(c1821786b);
        return C0eB.A00;
    }
}
