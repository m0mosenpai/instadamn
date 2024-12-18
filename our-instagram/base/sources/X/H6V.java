package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.util.List;

/* loaded from: classes7.dex */
public final class H6V extends C0T6 implements JMZ {
    public final INLINE_SURVEY_QUESTION_TYPES A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    @Override // X.JMZ
    public final H6V F2k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6V) {
                H6V h6v = (H6V) obj;
                if (!C14360o3.A0K(this.A08, h6v.A08) || !C14360o3.A0K(this.A02, h6v.A02) || !C14360o3.A0K(this.A03, h6v.A03) || !C14360o3.A0K(this.A04, h6v.A04) || !C14360o3.A0K(this.A05, h6v.A05) || !C14360o3.A0K(this.A01, h6v.A01) || !C14360o3.A0K(this.A06, h6v.A06) || !C14360o3.A0K(this.A07, h6v.A07) || this.A00 != h6v.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMZ
    public final List Ac6() {
        return this.A08;
    }

    @Override // X.JMZ
    public final String AyE() {
        return this.A02;
    }

    @Override // X.JMZ
    public final String BX4() {
        return this.A04;
    }

    @Override // X.JMZ
    public final String Bdb() {
        return this.A05;
    }

    @Override // X.JMZ
    public final Boolean C3K() {
        return this.A01;
    }

    @Override // X.JMZ
    public final String C3M() {
        return this.A06;
    }

    @Override // X.JMZ
    public final INLINE_SURVEY_QUESTION_TYPES CBV() {
        return this.A00;
    }

    @Override // X.JMZ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSurveyQuestionDict", AbstractC40374HvL.A00(this));
    }

    @Override // X.JMZ
    public final String getId() {
        return this.A03;
    }

    @Override // X.JMZ
    public final String getTitle() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((AbstractC167017dG.A0M(this.A08) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H6V(INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A08 = list;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = bool;
        this.A06 = str5;
        this.A07 = str6;
        this.A00 = inline_survey_question_types;
    }
}
