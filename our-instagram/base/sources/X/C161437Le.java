package X;

/* renamed from: X.7Le, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161437Le extends C0T6 implements InterfaceC66482zP, C7VC {
    public final int A00;
    public final long A01;
    public final C162297Or A02;
    public final String A03;

    public C161437Le(C162297Or c162297Or, String str, int i, long j) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c162297Or, 4);
        this.A01 = j;
        this.A03 = str;
        this.A00 = i;
        this.A02 = c162297Or;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C161437Le) {
                C161437Le c161437Le = (C161437Le) obj;
                if (this.A01 != c161437Le.A01 || !C14360o3.A0K(this.A03, c161437Le.A03) || this.A00 != c161437Le.A00 || !C14360o3.A0K(this.A02, c161437Le.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C7VC
    public final long C8f() {
        return this.A01;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass001.A0Q("javaClass", this.A01);
    }

    @Override // X.C7VC
    public final int getType() {
        return 34;
    }

    public final int hashCode() {
        long j = this.A01;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
