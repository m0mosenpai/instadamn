package X;

import java.util.Map;

/* renamed from: X.84U, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84U extends C0T6 {
    public final C84B A00;
    public final EnumC192868gS A01;
    public final Map A02;

    public C84U(EnumC192868gS enumC192868gS, C84B c84b, Map map) {
        C14360o3.A0B(c84b, 1);
        C14360o3.A0B(map, 2);
        this.A00 = c84b;
        this.A02 = map;
        this.A01 = enumC192868gS;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C84U) {
                C84U c84u = (C84U) obj;
                if (!C14360o3.A0K(this.A00, c84u.A00) || !C14360o3.A0K(this.A02, c84u.A02) || this.A01 != c84u.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31;
        EnumC192868gS enumC192868gS = this.A01;
        return hashCode + (enumC192868gS == null ? 0 : enumC192868gS.hashCode());
    }
}
