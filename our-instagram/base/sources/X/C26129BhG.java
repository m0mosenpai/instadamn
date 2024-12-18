package X;

import com.instagram.api.schemas.AchievementButtonInfoImpl;
import java.util.List;

/* renamed from: X.BhG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26129BhG extends C0T6 implements InterfaceC58226PrW {
    public final AchievementButtonInfoImpl A00;
    public final AchievementButtonInfoImpl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26129BhG) {
                C26129BhG c26129BhG = (C26129BhG) obj;
                if (!C14360o3.A0K(this.A06, c26129BhG.A06) || !C14360o3.A0K(this.A02, c26129BhG.A02) || !C14360o3.A0K(this.A03, c26129BhG.A03) || !C14360o3.A0K(this.A00, c26129BhG.A00) || !C14360o3.A0K(this.A01, c26129BhG.A01) || !C14360o3.A0K(this.A04, c26129BhG.A04) || !C14360o3.A0K(this.A05, c26129BhG.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, AbstractC166997dE.A0K(this.A04, (((((AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A06)) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01)) * 31));
    }

    public C26129BhG(AchievementButtonInfoImpl achievementButtonInfoImpl, AchievementButtonInfoImpl achievementButtonInfoImpl2, String str, String str2, String str3, String str4, List list) {
        AbstractC167017dG.A1P(list, str);
        AbstractC167017dG.A1U(str3, str4);
        this.A06 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = achievementButtonInfoImpl;
        this.A01 = achievementButtonInfoImpl2;
        this.A04 = str3;
        this.A05 = str4;
    }
}
