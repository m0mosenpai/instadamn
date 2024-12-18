package com.facebook.onecamera.outputcontrollers.camera.basic;

import X.AbstractC179807yU;
import X.AbstractC184688Hj;
import X.C175007qa;
import X.C178647wc;
import X.C179837yX;
import X.InterfaceC175067qg;
import X.InterfaceC178207vu;
import X.InterfaceC178667we;
import X.InterfaceC179847yZ;
import android.os.Handler;

/* loaded from: classes4.dex */
public final class BasicCameraOutputController extends AbstractC179807yU implements InterfaceC179847yZ {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Integer A03;
    public volatile C175007qa A04;

    public static InterfaceC175067qg A00(BasicCameraOutputController basicCameraOutputController) {
        return ((C178647wc) ((InterfaceC178667we) ((AbstractC179807yU) basicCameraOutputController).A00.Aq0(InterfaceC178667we.A00))).A02.A0N;
    }

    @Override // X.AbstractC178227vw
    public final void A09() {
        this.A04 = ((C178647wc) ((InterfaceC178667we) ((AbstractC179807yU) this).A00.Aq0(InterfaceC178667we.A00))).A02;
    }

    @Override // X.InterfaceC179817yV
    public final C179837yX BKZ() {
        return InterfaceC179847yZ.A00;
    }

    public BasicCameraOutputController(InterfaceC178207vu interfaceC178207vu) {
        super(interfaceC178207vu);
        this.A01 = null;
        this.A00 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public static void A01(Handler handler, final AbstractC184688Hj abstractC184688Hj, final Exception exc) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            abstractC184688Hj.A01(exc);
        } else {
            handler.post(new Runnable() { // from class: X.AuN
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC184688Hj.this.A01(exc);
                }
            });
        }
    }

    public static void A03(Handler handler, final AbstractC184688Hj abstractC184688Hj, final Object obj) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            abstractC184688Hj.A02(obj);
        } else {
            handler.post(new Runnable() { // from class: X.91p
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC184688Hj.this.A02(obj);
                }
            });
        }
    }
}
