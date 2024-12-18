package X;

import com.instagram.api.schemas.ContextualAdResponseExtras;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfo;
import java.util.List;

/* renamed from: X.Gyl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38644Gyl extends C0T6 {
    public final ContextualAdResponseExtras A00;
    public final ContextualAdResponseOrganicInfo A01;
    public final H4K A02;
    public final C38011pl A03;
    public final Boolean A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Long A08;
    public final List A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38644Gyl) {
                C38644Gyl c38644Gyl = (C38644Gyl) obj;
                if (!C14360o3.A0K(this.A09, c38644Gyl.A09) || !C14360o3.A0K(this.A03, c38644Gyl.A03) || !C14360o3.A0K(this.A05, c38644Gyl.A05) || !C14360o3.A0K(this.A06, c38644Gyl.A06) || !C14360o3.A0K(this.A00, c38644Gyl.A00) || !C14360o3.A0K(this.A07, c38644Gyl.A07) || !C14360o3.A0K(this.A04, c38644Gyl.A04) || !C14360o3.A0K(this.A02, c38644Gyl.A02) || !C14360o3.A0K(this.A08, c38644Gyl.A08) || !C14360o3.A0K(this.A01, c38644Gyl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0M(this.A09) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38644Gyl(ContextualAdResponseExtras contextualAdResponseExtras, ContextualAdResponseOrganicInfo contextualAdResponseOrganicInfo, H4K h4k, C38011pl c38011pl, Boolean bool, Long l, String str, String str2, List list, List list2) {
        this.A09 = list;
        this.A03 = c38011pl;
        this.A05 = str;
        this.A06 = str2;
        this.A00 = contextualAdResponseExtras;
        this.A07 = list2;
        this.A04 = bool;
        this.A02 = h4k;
        this.A08 = l;
        this.A01 = contextualAdResponseOrganicInfo;
    }
}
