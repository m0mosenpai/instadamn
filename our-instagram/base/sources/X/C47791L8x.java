package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.L8x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47791L8x {
    public String A00;
    public List A01;
    public List A02;
    public List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C47791L8x c47791L8x = (C47791L8x) obj;
            if (!C14360o3.A0K(this.A00, c47791L8x.A00) || !C14360o3.A0K(this.A03, c47791L8x.A03) || !C14360o3.A0K(this.A02, c47791L8x.A02) || !C14360o3.A0K(this.A01, c47791L8x.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A03, this.A02, this.A01});
    }
}
