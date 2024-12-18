package X;

/* renamed from: X.76J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C76J extends AnonymousClass766 {
    public final C129535tI A00;
    public final String A01;
    public final C162777Qo A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76J(C162777Qo c162777Qo, C129535tI c129535tI, String str) {
        super(c162777Qo, c129535tI);
        C14360o3.A0B(c162777Qo, 3);
        this.A01 = str;
        this.A00 = c129535tI;
        this.A02 = c162777Qo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C76J) {
                C76J c76j = (C76J) obj;
                if (!C14360o3.A0K(this.A01, c76j.A01) || !C14360o3.A0K(this.A00, c76j.A00) || !C14360o3.A0K(this.A02, c76j.A02)) {
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

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
