package X;

import com.instagram.api.schemas.ErrorIdentifier;
import java.util.List;

/* loaded from: classes11.dex */
public final class UPA extends C0T6 {
    public final UPI A00;
    public final ErrorIdentifier A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public UPA(UPI upi, ErrorIdentifier errorIdentifier, String str, String str2, List list) {
        AbstractC25234BEr.A0j(2, str, upi, errorIdentifier, str2);
        this.A04 = list;
        this.A02 = str;
        this.A00 = upi;
        this.A01 = errorIdentifier;
        this.A03 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPA) {
                UPA upa = (UPA) obj;
                if (!C14360o3.A0K(this.A04, upa.A04) || !C14360o3.A0K(this.A02, upa.A02) || !C14360o3.A0K(this.A00, upa.A00) || this.A01 != upa.A01 || !C14360o3.A0K(this.A03, upa.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0M(this.A04) * 31))) + this.A03.hashCode();
    }
}
