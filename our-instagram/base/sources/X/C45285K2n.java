package X;

/* renamed from: X.K2n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45285K2n extends C0T6 implements MSE {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45285K2n) {
                C45285K2n c45285K2n = (C45285K2n) obj;
                if (!C14360o3.A0K(this.A00, c45285K2n.A00) || !C14360o3.A0K(this.A01, c45285K2n.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return AnonymousClass001.A0v("EditableMutedWordItemModel(key=", this.A00, ", value=", this.A01, ')');
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C45285K2n(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
