package X;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.P8m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56540P8m implements InterfaceC144616fh {
    public final /* synthetic */ C54476O5e A00;
    public final /* synthetic */ boolean A01;

    @Override // X.InterfaceC144616fh
    public final boolean DQr(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC144616fh
    public final boolean Ddl(C84823qW c84823qW, int i, int i2) {
        throw C00O.createAndThrow();
    }

    public C56540P8m(C54476O5e c54476O5e, boolean z) {
        this.A01 = z;
        this.A00 = c54476O5e;
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return false;
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return false;
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC167017dG.A1N(motionEvent, motionEvent2);
        if (this.A01) {
            C54476O5e c54476O5e = this.A00;
            EnumC53107NeK[] values = EnumC53107NeK.values();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (EnumC53107NeK enumC53107NeK : values) {
                Object obj = c54476O5e.A00.get(enumC53107NeK);
                if (obj != null) {
                    A1E.add(obj);
                }
            }
            Iterator it = A1E.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (AbstractC166987dD.A1a(((InterfaceC16600sD) next).invoke(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)))) {
                    if (next == null) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC144616fh
    public final void DBc(float f) {
    }

    @Override // X.InterfaceC144616fh
    public final void DQV(float f, float f2) {
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        return false;
    }

    @Override // X.InterfaceC144616fh
    public final void DsB(float f, float f2) {
    }

    @Override // X.InterfaceC144616fh
    public final void Dwo(boolean z) {
    }
}
