package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92314Bl implements C2BB {
    public List A00 = new ArrayList();
    public final InterfaceC92334Bn A01 = new InterfaceC92334Bn(this) { // from class: X.4Bm
        public final C92314Bl A00;

        {
            this.A00 = this;
        }
    };
    public final boolean A02;

    @Override // X.C2BC
    public final void D15(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, int i, boolean z) {
        if (this.A02) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((C2BC) it.next()).D15(interfaceC92354Bq, c4c7, i, z);
            }
        } else {
            synchronized (this) {
                Iterator it2 = this.A00.iterator();
                while (it2.hasNext()) {
                    ((C2BB) it2.next()).D15(interfaceC92354Bq, c4c7, i, z);
                }
            }
        }
    }

    @Override // X.C2BB
    public final void DHL(EnumC92424Bx enumC92424Bx, long j, long j2, long j3) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C2BB) it.next()).DHL(enumC92424Bx, j, j2, j3);
        }
    }

    @Override // X.C2BB
    public final void DHM(long j, long j2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C2BB) it.next()).DHM(j, j2);
        }
    }

    @Override // X.C2BB
    public final void Dv8() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C2BB) it.next()).Dv8();
        }
    }

    @Override // X.C2BC
    public final void Dv9(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z) {
        if (this.A02) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((C2BC) it.next()).Dv9(interfaceC92354Bq, c4c7, z);
            }
        } else {
            synchronized (this) {
                Iterator it2 = this.A00.iterator();
                while (it2.hasNext()) {
                    ((C2BB) it2.next()).Dv9(interfaceC92354Bq, c4c7, z);
                }
            }
        }
    }

    @Override // X.C2BB
    public final void DvA(IOException iOException) {
        if (this.A02) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((C2BB) it.next()).DvA(iOException);
            }
        } else {
            synchronized (this) {
                Iterator it2 = this.A00.iterator();
                while (it2.hasNext()) {
                    ((C2BB) it2.next()).DvA(iOException);
                }
            }
        }
    }

    @Override // X.C2BD
    public final void DvD(String str, Object obj) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C2BD) it.next()).DvD(str, obj);
        }
    }

    @Override // X.C2BB
    public final void DvF(EnumC92424Bx enumC92424Bx, C4C7 c4c7) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C2BB) it.next()).DvF(enumC92424Bx, c4c7);
        }
    }

    @Override // X.C2BC
    public final void DvH(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z, boolean z2) {
        if (this.A02) {
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                ((C2BC) it.next()).DvH(interfaceC92354Bq, c4c7, z, z2);
            }
        } else {
            synchronized (this) {
                Iterator it2 = this.A00.iterator();
                while (it2.hasNext()) {
                    ((C2BB) it2.next()).DvH(interfaceC92354Bq, c4c7, z, z2);
                }
            }
        }
    }

    @Override // X.C2BB
    public final void ETY(String str) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C2BB) it.next()).ETY(str);
        }
    }

    public C92314Bl(boolean z) {
        this.A02 = z;
    }
}
