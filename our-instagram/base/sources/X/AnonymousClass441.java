package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Arrays;

/* renamed from: X.441, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass441 {
    public ExtendedImageUrl A00;
    public Long A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    public AnonymousClass441(ExtendedImageUrl extendedImageUrl, Long l, String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = l;
        this.A00 = extendedImageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass441)) {
            return false;
        }
        AnonymousClass441 anonymousClass441 = (AnonymousClass441) obj;
        return C14360o3.A0K(A00(), anonymousClass441.A00()) && C14360o3.A0K(this.A02, anonymousClass441.A02) && C14360o3.A0K(this.A04, anonymousClass441.A04) && C14360o3.A0K(this.A01, anonymousClass441.A01) && this.A05 == anonymousClass441.A05 && C14360o3.A0K(this.A00, anonymousClass441.A00);
    }

    public final String A00() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("senderId");
        throw C00O.createAndThrow();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{A00(), this.A02, this.A04, this.A01, Boolean.valueOf(this.A05), this.A00});
    }

    public AnonymousClass441() {
    }
}
