package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StoryAdKeywordStyleEnum;
import com.instagram.api.schemas.StoryAdKeywordTypeEnum;

/* renamed from: X.H7g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38816H7g extends C0T6 implements JMQ {
    public final StoryAdKeywordStyleEnum A00;
    public final StoryAdKeywordTypeEnum A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // X.JMQ
    public final C38816H7g F5l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38816H7g) {
                C38816H7g c38816H7g = (C38816H7g) obj;
                if (!C14360o3.A0K(this.A02, c38816H7g.A02) || !C14360o3.A0K(this.A04, c38816H7g.A04) || !C14360o3.A0K(this.A05, c38816H7g.A05) || this.A00 != c38816H7g.A00 || this.A01 != c38816H7g.A01 || !C14360o3.A0K(this.A03, c38816H7g.A03) || !C14360o3.A0K(this.A06, c38816H7g.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMQ
    public final Integer B1u() {
        return this.A02;
    }

    @Override // X.JMQ
    public final String BKp() {
        return this.A04;
    }

    @Override // X.JMQ
    public final String BKq() {
        return this.A05;
    }

    @Override // X.JMQ
    public final StoryAdKeywordStyleEnum BKt() {
        return this.A00;
    }

    @Override // X.JMQ
    public final StoryAdKeywordTypeEnum BKu() {
        return this.A01;
    }

    @Override // X.JMQ
    public final Integer Bzd() {
        return this.A03;
    }

    @Override // X.JMQ
    public final String C99() {
        return this.A06;
    }

    @Override // X.JMQ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryAdKeywordInfoDict", I37.A00(this));
    }

    public final int hashCode() {
        return (((((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public C38816H7g(StoryAdKeywordStyleEnum storyAdKeywordStyleEnum, StoryAdKeywordTypeEnum storyAdKeywordTypeEnum, Integer num, Integer num2, String str, String str2, String str3) {
        this.A02 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = storyAdKeywordStyleEnum;
        this.A01 = storyAdKeywordTypeEnum;
        this.A03 = num2;
        this.A06 = str3;
    }
}
