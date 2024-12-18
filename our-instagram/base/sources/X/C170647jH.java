package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7jH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170647jH {
    public int A00;
    public int A01;
    public boolean A02;
    public int A03;
    public int A04;
    public int A05;
    public final C170657jI A06 = new C1I4() { // from class: X.7jI
        @Override // X.C1I4
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int A03 = C0f9.A03(113729184);
            C170647jH.this.A00(0);
            C0f9.A0A(-225500722, A03);
        }
    };
    public final List A07 = new ArrayList(2);
    public final InterfaceC170457iy A08;

    public final void A00(int i) {
        InterfaceC170457iy interfaceC170457iy = this.A08;
        int AVR = interfaceC170457iy.AVR();
        int AVV = interfaceC170457iy.AVV();
        int AVQ = interfaceC170457iy.AVQ();
        int AVU = interfaceC170457iy.AVU();
        int itemCount = interfaceC170457iy.getItemCount();
        if (AVR >= 0 && AVV >= 0) {
            if (AVR == this.A00 && AVV == this.A01 && AVQ == this.A03 && AVU == this.A04 && itemCount == this.A05 && i != 1) {
                return;
            }
            this.A00 = AVR;
            this.A01 = AVV;
            this.A03 = AVQ;
            this.A04 = AVU;
            this.A05 = itemCount;
            this.A02 = false;
            synchronized (this) {
                List list = this.A07;
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((InterfaceC170577jA) arrayList.get(i2)).FDi(AVR, AVV, AVQ, AVU, i);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r2 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.A02
            if (r0 != 0) goto L7
            r0 = 0
            if (r2 == 0) goto L8
        L7:
            r0 = 1
        L8:
            r1.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170647jH.A01(boolean):void");
    }

    public final boolean A02() {
        if (this.A00 >= 0 && this.A01 >= 0 && !this.A02) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7jI] */
    public C170647jH(InterfaceC170457iy interfaceC170457iy, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = interfaceC170457iy.AVQ();
        this.A04 = interfaceC170457iy.AVU();
        this.A05 = interfaceC170457iy.getItemCount();
        this.A08 = interfaceC170457iy;
    }

    public final boolean A03(int i, int i2) {
        if (A02() || i2 == -1 || i <= Math.max((this.A00 + i2) - 1, this.A01)) {
            return true;
        }
        return false;
    }
}
