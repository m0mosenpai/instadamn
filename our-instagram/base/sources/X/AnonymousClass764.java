package X;

/* renamed from: X.764, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass764 extends C4F4 implements C7VC {
    public final String A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass764) {
                AnonymousClass764 anonymousClass764 = (AnonymousClass764) obj;
                if (!C14360o3.A0K(this.A02, anonymousClass764.A02) || this.A03 != anonymousClass764.A03 || !C14360o3.A0K(this.A00, anonymousClass764.A00) || this.A01 != anonymousClass764.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C7VC
    public final long C8f() {
        return 0L;
    }

    @Override // X.C7VC
    public final int getType() {
        return 158;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A02.hashCode() * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((i2 + hashCode) * 31) + this.A01;
    }

    public AnonymousClass764(String str, boolean z, String str2, int i) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = str2;
        this.A01 = i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
