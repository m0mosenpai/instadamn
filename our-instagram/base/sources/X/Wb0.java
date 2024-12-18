package X;

/* loaded from: classes11.dex */
public final class Wb0 implements InterfaceC71855X7n {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Wb0) && C14360o3.A0K(this.A00, ((Wb0) obj).A00));
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + AbstractC53644Nnp.A00();
    }

    public final String toString() {
        return AnonymousClass001.A0m("UriTransitionInfo(uri=", this.A00, ", forceThirdPartyApp=", ')', false);
    }

    public Wb0(String str) {
        this.A00 = str;
    }
}
