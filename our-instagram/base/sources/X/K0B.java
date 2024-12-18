package X;

import kotlin.Deprecated;

@Deprecated(message = "This is slated to be merged with PortraitXmaMessageViewModel.")
/* loaded from: classes8.dex */
public final class K0B extends C0T6 implements InterfaceC66482zP, InterfaceC162797Qq {
    public final C7QY A00;
    public final C1576676a A01;
    public final C162777Qo A02;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K0B) && C14360o3.A0K(this.A01, ((K0B) obj).A01));
    }

    public final int hashCode() {
        return this.A01.hashCode();
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
        return this.A01.A02;
    }

    public K0B(C1576676a c1576676a) {
        this.A01 = c1576676a;
        this.A00 = c1576676a.A01;
        this.A02 = c1576676a.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
