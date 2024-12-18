package X;

import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Q9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Q9 implements C7QA {
    public final InterfaceC165307aJ A00;
    public final boolean A01;

    @Override // X.C7QA
    public final /* bridge */ /* synthetic */ void DTA(MotionEvent motionEvent, Object obj, boolean z) {
        InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) obj;
        InterfaceC165307aJ interfaceC165307aJ = this.A00;
        long micros = TimeUnit.MILLISECONDS.toMicros(interfaceC129525tH.BT8());
        interfaceC165307aJ.El9(new PointF(motionEvent.getRawX(), motionEvent.getRawY()), interfaceC129525tH, interfaceC129525tH.BPA(), micros, z, this.A01);
    }

    public C7Q9(InterfaceC165307aJ interfaceC165307aJ, boolean z) {
        this.A00 = interfaceC165307aJ;
        this.A01 = z;
    }
}
