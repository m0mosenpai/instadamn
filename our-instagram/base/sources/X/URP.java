package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppSearchDiscussionTopic;

/* loaded from: classes11.dex */
public final class URP extends C0T6 implements InterfaceC99404dC {
    public final TextAppSearchDiscussionTopic A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC99404dC
    public final URP F2x() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URP) {
                URP urp = (URP) obj;
                if (!C14360o3.A0K(this.A00, urp.A00) || !C14360o3.A0K(this.A01, urp.A01) || !C14360o3.A0K(this.A02, urp.A02) || !C14360o3.A0K(this.A03, urp.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC99404dC
    public final TextAppSearchDiscussionTopic AyN() {
        return this.A00;
    }

    @Override // X.InterfaceC99404dC
    public final Integer Bm9() {
        return this.A01;
    }

    @Override // X.InterfaceC99404dC
    public final String BmA() {
        return this.A02;
    }

    @Override // X.InterfaceC99404dC
    public final String CAy() {
        return this.A03;
    }

    @Override // X.InterfaceC99404dC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextAppPostRelatedTrendsInfo", VP9.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0M + i;
    }

    public URP(TextAppSearchDiscussionTopic textAppSearchDiscussionTopic, Integer num, String str, String str2) {
        this.A00 = textAppSearchDiscussionTopic;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
    }
}
