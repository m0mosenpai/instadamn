package X;

import java.util.Arrays;

/* renamed from: X.7DA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DA extends C7AS implements InterfaceC129555tK {
    @Override // X.C7AS
    public final boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof C7DA) && super.equals(obj) && C14360o3.A0K(this.A0A, ((C7AS) obj).A0A));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A07, this.A0C, this.A0A, this.A0G, this.A0D, Boolean.valueOf(this.A0L), Boolean.valueOf(this.A0K), this.A06, this.A01, this.A0E});
    }
}
