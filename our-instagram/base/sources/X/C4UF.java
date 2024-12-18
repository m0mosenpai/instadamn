package X;

/* renamed from: X.4UF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UF implements C4UG {
    public final C4UH A00;
    public final C4UK A01;
    public final C4UE[] A02;

    public C4UF(C4UE... c4ueArr) {
        C4UH c4uh = new C4UH();
        C4UK c4uk = new C4UK();
        int length = c4ueArr.length;
        C4UE[] c4ueArr2 = new C4UE[length + 2];
        this.A02 = c4ueArr2;
        System.arraycopy(c4ueArr, 0, c4ueArr2, 0, length);
        this.A00 = c4uh;
        this.A01 = c4uk;
        c4ueArr2[length] = c4uh;
        c4ueArr2[length + 1] = c4uk;
    }
}
