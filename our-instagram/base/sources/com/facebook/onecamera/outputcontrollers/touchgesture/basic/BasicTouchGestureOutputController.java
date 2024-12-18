package com.facebook.onecamera.outputcontrollers.touchgesture.basic;

import X.AbstractC179807yU;
import X.C178647wc;
import X.C179837yX;
import X.InterfaceC178207vu;
import X.InterfaceC178667we;
import X.InterfaceC179857yb;
import X.ViewOnTouchListenerC176317so;

/* loaded from: classes4.dex */
public final class BasicTouchGestureOutputController extends AbstractC179807yU implements InterfaceC179857yb {
    public final boolean A00;
    public volatile ViewOnTouchListenerC176317so A01;

    public BasicTouchGestureOutputController(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A00 = true;
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A01 = new ViewOnTouchListenerC176317so(((C178647wc) ((InterfaceC178667we) ((AbstractC179807yU) this).A00.Aq0(InterfaceC178667we.A00))).A02, this.A00);
    }

    @Override // X.InterfaceC179817yV
    public final C179837yX BKZ() {
        return InterfaceC179857yb.A00;
    }
}
