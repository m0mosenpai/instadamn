package X;

/* renamed from: X.SYo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62946SYo {
    public final int A00;
    public final RBH A01;
    public final SG6[] A02;
    public final C44W A03;

    public final String toString() {
        return this.A01.toString();
    }

    public C62946SYo(C44W c44w, RBH rbh, SG6[] sg6Arr, int i) {
        this.A03 = c44w;
        this.A01 = rbh;
        this.A02 = sg6Arr;
        this.A00 = i;
    }

    public static C62946SYo A00(C44W c44w, RBH rbh, AbstractC63037SbC[] abstractC63037SbCArr) {
        AbstractC63037SbC abstractC63037SbC;
        int A0F = rbh.A0F();
        SG6[] sg6Arr = new SG6[A0F];
        for (int i = 0; i < A0F; i++) {
            RBI A0H = rbh.A0H(i);
            TIB A02 = c44w.A02(A0H);
            if (abstractC63037SbCArr == null) {
                abstractC63037SbC = null;
            } else {
                abstractC63037SbC = abstractC63037SbCArr[i];
            }
            sg6Arr[i] = new SG6(A02, A0H, abstractC63037SbC);
        }
        return new C62946SYo(c44w, rbh, sg6Arr, A0F);
    }
}
