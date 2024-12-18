package X;

import java.util.LinkedList;

/* loaded from: classes10.dex */
public final class SP8 {
    public InterfaceC65236TgS A00;
    public Object A01;
    public LinkedList A02;
    public final TI4 A03;

    public final void A00(SW1 sw1) {
        LinkedList linkedList = this.A02;
        if (linkedList == null) {
            linkedList = AbstractC58318PtA.A11();
            this.A02 = linkedList;
        }
        linkedList.add(sw1);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x017a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SP8.A01(java.lang.Object):void");
    }

    public final String toString() {
        return String.valueOf(this.A03);
    }

    public SP8(TI4 ti4) {
        this.A03 = ti4;
    }
}
