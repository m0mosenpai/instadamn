package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.reels.question.constants.QuestionStickerType;
import java.util.List;

/* loaded from: classes11.dex */
public final class URE extends C0T6 implements XGI {
    public final QuestionStickerType A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    @Override // X.XGI
    public final URE Eys() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URE) {
                URE ure = (URE) obj;
                if (!C14360o3.A0K(this.A04, ure.A04) || !C14360o3.A0K(this.A01, ure.A01) || !C14360o3.A0K(this.A05, ure.A05) || !C14360o3.A0K(this.A06, ure.A06) || !C14360o3.A0K(this.A07, ure.A07) || !C14360o3.A0K(this.A08, ure.A08) || !C14360o3.A0K(this.A03, ure.A03) || this.A00 != ure.A00 || !C14360o3.A0K(this.A0A, ure.A0A) || !C14360o3.A0K(this.A09, ure.A09) || !C14360o3.A0K(this.A02, ure.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGI
    public final String BjV() {
        return this.A08;
    }

    @Override // X.XGI
    public final Long Bjb() {
        return this.A03;
    }

    @Override // X.XGI
    public final QuestionStickerType Bjf() {
        return this.A00;
    }

    @Override // X.XGI
    public final List Bom() {
        return this.A0A;
    }

    @Override // X.XGI
    public final Boolean CG1() {
        return this.A02;
    }

    @Override // X.XGI
    public final Boolean CRP() {
        return this.A01;
    }

    @Override // X.XGI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTQuestionStickerDict", AbstractC68387VOv.A00(this));
    }

    @Override // X.XGI
    public final String getBackgroundColor() {
        return this.A04;
    }

    @Override // X.XGI
    public final String getMediaId() {
        return this.A05;
    }

    @Override // X.XGI
    public final String getProfilePicUrl() {
        return this.A06;
    }

    @Override // X.XGI
    public final String getQuestion() {
        return this.A07;
    }

    @Override // X.XGI
    public final String getTextColor() {
        return this.A09;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((((((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31;
        Boolean bool = this.A02;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0O + i;
    }

    public URE(QuestionStickerType questionStickerType, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A04 = str;
        this.A01 = bool;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A08 = str5;
        this.A03 = l;
        this.A00 = questionStickerType;
        this.A0A = list;
        this.A09 = str6;
        this.A02 = bool2;
    }
}
