package X;

/* renamed from: X.55U, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C55U {
    public final EnumC114925Hg A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C55U)) {
            return false;
        }
        return C14360o3.A0K(this.A02, ((C55U) obj).A02);
    }

    public C55U(EnumC114925Hg enumC114925Hg, String str, String str2, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = enumC114925Hg;
    }
}
