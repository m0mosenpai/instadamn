package X;

import com.instagram.api.schemas.ContentAppreciationDisclaimerType;
import java.util.List;

/* renamed from: X.Jwi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45053Jwi extends C0T6 {
    public final int A00;
    public final long A01;
    public final ContentAppreciationDisclaimerType A02;
    public final List A03;
    public final boolean A04;
    public final List A05;
    public final boolean A06;

    public C45053Jwi(ContentAppreciationDisclaimerType contentAppreciationDisclaimerType, List list, List list2, int i, long j, boolean z, boolean z2) {
        AbstractC167007dF.A1G(contentAppreciationDisclaimerType, 3, list2);
        this.A00 = i;
        this.A06 = z;
        this.A02 = contentAppreciationDisclaimerType;
        this.A05 = list;
        this.A03 = list2;
        this.A04 = z2;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45053Jwi) {
                C45053Jwi c45053Jwi = (C45053Jwi) obj;
                if (this.A00 != c45053Jwi.A00 || this.A06 != c45053Jwi.A06 || this.A02 != c45053Jwi.A02 || !C14360o3.A0K(this.A05, c45053Jwi.A05) || !C14360o3.A0K(this.A03, c45053Jwi.A03) || this.A04 != c45053Jwi.A04 || this.A01 != c45053Jwi.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0J(this.A03, (AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A06, this.A00 * 31)) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC25228BEl.A03(this.A01);
    }
}
