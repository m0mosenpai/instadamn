package X;

import java.util.Arrays;

/* renamed from: X.Ma8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50711Ma8 {
    public final C47Z A00;
    public final InterfaceC40171tl A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C50711Ma8 c50711Ma8 = (C50711Ma8) obj;
            if (!C14360o3.A0K(this.A00, c50711Ma8.A00) || !C14360o3.A0K(this.A01, c50711Ma8.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public C50711Ma8(C47Z c47z, InterfaceC40171tl interfaceC40171tl) {
        if (c47z.A4w && interfaceC40171tl == null) {
            throw AbstractC166997dE.A0g();
        }
        this.A00 = c47z;
        this.A01 = interfaceC40171tl;
    }
}
