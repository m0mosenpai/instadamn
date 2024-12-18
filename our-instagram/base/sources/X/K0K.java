package X;

import kotlin.Deprecated;

@Deprecated(message = "This is slated to be merged with GenericXmaMessageViewModel.")
/* loaded from: classes8.dex */
public final class K0K extends C0T6 implements InterfaceC66482zP, InterfaceC162797Qq {
    public final C162777Qo A00;
    public final C7QY A01;
    public final C1576676a A02;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof K0K) && C14360o3.A0K(this.A02, ((K0K) obj).A02));
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    @Override // X.InterfaceC162797Qq
    public final C162777Qo Apt() {
        return this.A00;
    }

    @Override // X.InterfaceC162797Qq
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArC() {
        return this.A01;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02.A02;
    }

    public K0K(C1576676a c1576676a) {
        this.A02 = c1576676a;
        this.A01 = c1576676a.A01;
        this.A00 = c1576676a.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
