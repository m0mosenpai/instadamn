package X;

import com.instagram.api.schemas.StoryTrendingTemplateSectionType;
import java.util.List;

/* renamed from: X.GyW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38629GyW extends C0T6 {
    public final C51756Mtf A00;
    public final String A01;
    public final List A02;
    public final boolean A03;
    public final StoryTrendingTemplateSectionType A04;
    public final String A05;
    public final String A06;

    public C38629GyW(C51756Mtf c51756Mtf, StoryTrendingTemplateSectionType storyTrendingTemplateSectionType, String str, String str2, String str3, List list, boolean z) {
        AbstractC167007dF.A1G(str, 1, list);
        this.A01 = str;
        this.A05 = str2;
        this.A00 = c51756Mtf;
        this.A03 = z;
        this.A02 = list;
        this.A06 = str3;
        this.A04 = storyTrendingTemplateSectionType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38629GyW) {
                C38629GyW c38629GyW = (C38629GyW) obj;
                if (!C14360o3.A0K(this.A01, c38629GyW.A01) || !C14360o3.A0K(this.A05, c38629GyW.A05) || !C14360o3.A0K(this.A00, c38629GyW.A00) || this.A03 != c38629GyW.A03 || !C14360o3.A0K(this.A02, c38629GyW.A02) || !C14360o3.A0K(this.A06, c38629GyW.A06) || this.A04 != c38629GyW.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A03, (((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31)) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC166997dE.A0I(this.A04);
    }
}
