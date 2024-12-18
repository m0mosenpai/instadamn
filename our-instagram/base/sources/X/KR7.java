package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class KR7 extends AbstractC46440Kh0 {
    public final DirectShareTarget A00;
    public final DirectThreadKey A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KR7) {
                KR7 kr7 = (KR7) obj;
                if (!C14360o3.A0K(this.A02, kr7.A02) || !C14360o3.A0K(this.A01, kr7.A01) || !C14360o3.A0K(this.A00, kr7.A00) || !C14360o3.A0K(this.A03, kr7.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC25236BEt.A05(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A02))) * 31) + AbstractC167017dG.A0O(this.A03);
    }

    public KR7(DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, String str, String str2) {
        this.A02 = str;
        this.A01 = directThreadKey;
        this.A00 = directShareTarget;
        this.A03 = str2;
    }
}
