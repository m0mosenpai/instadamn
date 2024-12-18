package X;

/* renamed from: X.OCe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54652OCe {
    public final int A00;
    public final int A01;
    public final EnumC53109NeM A02;
    public final Object A03;
    public final boolean A04;

    public C54652OCe(EnumC53109NeM enumC53109NeM, Object obj, int i, int i2, boolean z) {
        this.A02 = enumC53109NeM;
        this.A03 = obj;
        this.A00 = i;
        this.A04 = z;
        this.A01 = i2;
        if (enumC53109NeM != EnumC53109NeM.REFRESH && obj == null) {
            throw AbstractC166987dD.A12("Key must be non-null for prepend/append");
        }
    }
}
