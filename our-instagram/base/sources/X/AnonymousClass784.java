package X;

/* renamed from: X.784, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass784 extends C0T6 implements InterfaceC66482zP, InterfaceC162797Qq {
    public final AnonymousClass781 A00;
    public final String A01;
    public final C162777Qo A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass784) {
                AnonymousClass784 anonymousClass784 = (AnonymousClass784) obj;
                if (!C14360o3.A0K(this.A01, anonymousClass784.A01) || !C14360o3.A0K(this.A00, anonymousClass784.A00) || !C14360o3.A0K(this.A02, anonymousClass784.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }

    @Override // X.InterfaceC162797Qq
    public final C162777Qo Apt() {
        return this.A02;
    }

    @Override // X.InterfaceC162797Qq
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArC() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public AnonymousClass784(C162777Qo c162777Qo, AnonymousClass781 anonymousClass781, String str) {
        this.A01 = str;
        this.A00 = anonymousClass781;
        this.A02 = c162777Qo;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
