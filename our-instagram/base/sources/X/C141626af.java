package X;

import android.view.MotionEvent;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.6af, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141626af implements InterfaceC144616fh {
    public final java.util.Set A00 = new LinkedHashSet();

    @Override // X.InterfaceC144616fh
    public final void DBc(float f) {
        A00(new C206759Dg(f, 1));
    }

    @Override // X.InterfaceC144616fh
    public final void DQV(float f, float f2) {
        A00(new C206769Dh(1, f, f2));
    }

    @Override // X.InterfaceC144616fh
    public final boolean DQr(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return A01(new C57754Pjh(motionEvent, 9));
    }

    @Override // X.InterfaceC144616fh
    public final boolean Ddl(C84823qW c84823qW, int i, int i2) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        return A01(new C206769Dh(2, f, f2));
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent, 0);
        C14360o3.A0B(motionEvent2, 1);
        return A01(new C57565Pgd(motionEvent, motionEvent2, f, f2));
    }

    @Override // X.InterfaceC144616fh
    public final void DsB(float f, float f2) {
        A00(new C206769Dh(3, f, f2));
    }

    @Override // X.InterfaceC144616fh
    public final void Dwo(boolean z) {
        A00(new C206799Dk(z, 1));
    }

    private final void A00(InterfaceC16660sJ interfaceC16660sJ) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            interfaceC16660sJ.invoke(it.next());
        }
    }

    private final boolean A01(InterfaceC16660sJ interfaceC16660sJ) {
        Iterator it = this.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Boolean) interfaceC16660sJ.invoke(next)).booleanValue()) {
                if (next == null) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return A01(C57668PiJ.A00);
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return A01(C57669PiK.A00);
    }
}
