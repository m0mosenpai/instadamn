package X;

import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class N3R extends C40781ul {
    public Boolean A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            N3R n3r = (N3R) obj;
            if (!C14360o3.A0K(this.A06, n3r.A06) || !C14360o3.A0K(this.A01, n3r.A01) || !C14360o3.A0K(this.A02, n3r.A02) || !C14360o3.A0K(this.A0A, n3r.A0A) || !C14360o3.A0K(this.A09, n3r.A09) || !C14360o3.A0K(this.A08, n3r.A08) || !C14360o3.A0K(this.A04, n3r.A04) || !C14360o3.A0K(this.A03, n3r.A03) || this.A0B != n3r.A0B || !C14360o3.A0K(this.A00, n3r.A00) || !C14360o3.A0K(this.A05, n3r.A05) || !C14360o3.A0K(this.A07, n3r.A07)) {
                return false;
            }
        }
        return true;
    }

    public static DirectMessagesInteropOptionsViewModel A00(N3R n3r) {
        return new DirectMessagesInteropOptionsViewModel(AbstractC54192NxW.A00(n3r.A06), AbstractC54192NxW.A00(n3r.A01), AbstractC54192NxW.A00(n3r.A02), AbstractC54192NxW.A00(n3r.A0A), AbstractC54192NxW.A00(n3r.A09), AbstractC54192NxW.A00(n3r.A08), AbstractC54192NxW.A00(n3r.A04), AbstractC54192NxW.A00(n3r.A03), AbstractC54192NxW.A00(n3r.A05), AbstractC54192NxW.A00(n3r.A07));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A01, this.A02, this.A0A, this.A09, this.A08, this.A04, this.A03, Boolean.valueOf(this.A0B), this.A00, this.A05, this.A07});
    }
}
