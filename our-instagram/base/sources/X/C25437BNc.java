package X;

import com.instagram.api.schemas.SocialContextType;
import java.util.List;

/* renamed from: X.BNc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25437BNc extends C0T6 {
    public final int A00;
    public final SocialContextType A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public C25437BNc(SocialContextType socialContextType, String str, List list, int i, boolean z) {
        C14360o3.A0B(list, 2);
        this.A01 = socialContextType;
        this.A03 = list;
        this.A04 = z;
        this.A02 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25437BNc) {
                C25437BNc c25437BNc = (C25437BNc) obj;
                if (this.A01 != c25437BNc.A01 || !C14360o3.A0K(this.A03, c25437BNc.A03) || this.A04 != c25437BNc.A04 || !C14360o3.A0K(this.A02, c25437BNc.A02) || this.A00 != c25437BNc.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A01))) + AbstractC167017dG.A0O(this.A02)) * 31) + this.A00) * 31;
    }
}
