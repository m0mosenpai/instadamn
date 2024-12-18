package X;

import com.facebook.profilo.ipc.TraceContext;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09920ft implements InterfaceC20060yb {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    @Override // X.C0VP
    public final void DxL(File file, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C0VP) it.next()).DxL(file, 1);
        }
    }

    @Override // X.InterfaceC20060yb
    public final boolean AGE(TraceContext traceContext, File file) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC20060yb) it.next()).AGE(traceContext, file)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC20060yb
    public final void D6p() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060yb) it.next()).D6p();
        }
    }

    @Override // X.InterfaceC20060yb
    public final void DVP() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060yb) it.next()).DVP();
        }
    }

    @Override // X.InterfaceC20060yb
    public final void DcJ(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060yb) it.next()).DcJ(traceContext);
        }
    }

    @Override // X.InterfaceC20060yb
    public final void DcK(TraceContext traceContext, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060yb) it.next()).DcK(traceContext, i);
        }
    }

    @Override // X.InterfaceC20060yb
    public final void DuN(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060yb) it.next()).DuN(traceContext);
        }
    }

    @Override // X.InterfaceC20060yb
    public final void DuO(int i, int i2, int i3, int i4) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060yb) it.next()).DuO(i, i2, i3, i4);
        }
    }

    @Override // X.InterfaceC20060yb
    public final void DuP(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060yb) it.next()).DuP(traceContext);
        }
    }

    @Override // X.InterfaceC20060yb
    public final void DuQ(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060yb) it.next()).DuQ(traceContext);
        }
    }

    @Override // X.InterfaceC20060yb
    public final void DuS(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC20060yb) it.next()).DuS(traceContext);
        }
    }

    @Override // X.InterfaceC06430Vk
    public final void DuU(TraceContext traceContext, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC06430Vk) it.next()).DuU(traceContext, i);
        }
    }

    @Override // X.InterfaceC06430Vk
    public final void DuV(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC06430Vk) it.next()).DuV(traceContext);
        }
    }

    @Override // X.InterfaceC06430Vk
    public final void DuW(TraceContext traceContext, Throwable th) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC06430Vk) it.next()).DuW(traceContext, th);
        }
    }

    @Override // X.InterfaceC06430Vk
    public final void DuX(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC06430Vk) it.next()).DuX(traceContext);
        }
    }

    @Override // X.C0VP
    public final void DxO(File file) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C0VP) it.next()).DxO(file);
        }
    }
}
