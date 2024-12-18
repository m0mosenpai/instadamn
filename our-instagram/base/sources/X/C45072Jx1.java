package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jx1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45072Jx1 extends C0T6 {
    public final LineType A00;
    public final ThreadItemType A01;
    public final MRM A02;
    public final User A03;
    public final Boolean A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45072Jx1) {
                C45072Jx1 c45072Jx1 = (C45072Jx1) obj;
                if (this.A00 != c45072Jx1.A00 || this.A01 != c45072Jx1.A01 || !C14360o3.A0K(this.A02, c45072Jx1.A02) || !C14360o3.A0K(this.A06, c45072Jx1.A06) || !C14360o3.A0K(this.A03, c45072Jx1.A03) || this.A0A != c45072Jx1.A0A || this.A07 != c45072Jx1.A07 || !C14360o3.A0K(this.A05, c45072Jx1.A05) || !C14360o3.A0K(this.A04, c45072Jx1.A04) || this.A08 != c45072Jx1.A08 || this.A09 != c45072Jx1.A09 || this.A0B != c45072Jx1.A0B) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0B, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A08, (((AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0A, (AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)))) + AbstractC167017dG.A0M(this.A03)) * 31)) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31)));
    }

    public C45072Jx1(LineType lineType, ThreadItemType threadItemType, MRM mrm, User user, Boolean bool, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AbstractC25234BEr.A1P(lineType, threadItemType, list);
        this.A00 = lineType;
        this.A01 = threadItemType;
        this.A02 = mrm;
        this.A06 = list;
        this.A03 = user;
        this.A0A = z;
        this.A07 = z2;
        this.A05 = str;
        this.A04 = bool;
        this.A08 = z3;
        this.A09 = z4;
        this.A0B = z5;
    }
}
