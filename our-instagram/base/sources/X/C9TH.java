package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.9TH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9TH extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C9TH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
                ((C144526fY) this.A02).A01 = false;
                ((InterfaceC144766fw) this.A01).Djj();
                return true;
            case 2:
                C14360o3.A0B(motionEvent, 0);
                ((InterfaceC145436h2) this.A01).DBc(motionEvent.getRawX());
                return true;
            default:
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                InterfaceC187328Rz interfaceC187328Rz = (InterfaceC187328Rz) this.A01;
                if (interfaceC187328Rz == null) {
                    return;
                }
                interfaceC187328Rz.DNZ((C9V0) this.A02);
                return;
            case 1:
                C14360o3.A0B(motionEvent, 0);
                ((C144526fY) this.A02).A01 = true;
                super.onLongPress(motionEvent);
                return;
            case 2:
                C14360o3.A0B(motionEvent, 0);
                ((InterfaceC145436h2) this.A01).DQV(motionEvent.getRawX(), motionEvent.getRawY());
                ((C84823qW) this.A02).A1I = false;
                return;
            default:
                ((C69561VrQ) this.A02).A01.D6C((C84923qg) this.A01);
                return;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                InterfaceC187328Rz interfaceC187328Rz = (InterfaceC187328Rz) this.A01;
                if (interfaceC187328Rz != null) {
                    interfaceC187328Rz.DNs((C9V0) this.A02);
                    return true;
                }
                return true;
            case 1:
            default:
                return super.onSingleTapUp(motionEvent);
            case 2:
                C14360o3.A0B(motionEvent, 0);
                ((InterfaceC145436h2) this.A01).DsB(motionEvent.getRawX(), motionEvent.getRawY());
                ((C84823qW) this.A02).A1I = false;
                return true;
            case 3:
                ((C69561VrQ) this.A02).A01.D6C((C84923qg) this.A01);
                return true;
        }
    }
}
