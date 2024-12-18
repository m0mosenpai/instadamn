package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class AlD implements C5NL {
    public static final int[] A02 = {-4652876, -720896};
    public URE A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AlD alD = (AlD) obj;
            if (C2I7.A00(this.A00, alD.A00)) {
                List A06 = A06();
                List A062 = alD.A06();
                QuestionResponseType questionResponseType = QuestionResponseType.A07;
                if (A06.contains(questionResponseType) == A062.contains(questionResponseType)) {
                    QuestionResponseType questionResponseType2 = QuestionResponseType.A05;
                    if (A06.contains(questionResponseType2) != A062.contains(questionResponseType2)) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, this.A00});
    }

    public final int A02() {
        Long l = this.A00.A03;
        if (l == null) {
            return 0;
        }
        return l.intValue();
    }

    public final int A03(Context context) {
        return AbstractC13950nL.A0C(this.A00.A04, A00(context));
    }

    public final int A04(Context context) {
        return AbstractC13950nL.A0C(this.A00.A09, A01(context));
    }

    public final String A05() {
        String str = this.A00.A07;
        if (str != null && str.length() <= 1000) {
            return str;
        }
        return null;
    }

    public final List A06() {
        List list = this.A00.A0A;
        if (list == null) {
            return AbstractC166987dD.A1E();
        }
        return list;
    }

    public final void A07(String str) {
        URE ure = this.A00;
        C14360o3.A0B(ure, 1);
        String str2 = ure.A04;
        Boolean bool = ure.A01;
        String str3 = ure.A05;
        String str4 = ure.A06;
        String str5 = ure.A08;
        Long l = ure.A03;
        QuestionStickerType questionStickerType = ure.A00;
        List list = ure.A0A;
        this.A00 = new URE(questionStickerType, bool, ure.A02, l, str2, str3, str4, str, str5, ure.A09, list);
    }

    public final boolean A08() {
        Boolean bool = this.A00.A01;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.C5NL
    public final /* synthetic */ List B6F() {
        return C16930sl.A00;
    }

    public AlD(ImageUrl imageUrl, QuestionStickerType questionStickerType, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        String url;
        ArrayList A1E = AbstractC166987dD.A1E();
        if (z2) {
            A1E.add(QuestionResponseType.A07);
        }
        if (z3) {
            A1E.add(QuestionResponseType.A05);
        }
        String A0F = AbstractC13950nL.A0F(i);
        Boolean valueOf = Boolean.valueOf(z);
        if (imageUrl == null) {
            url = null;
        } else {
            url = imageUrl.getUrl();
        }
        this.A00 = new URE(questionStickerType, valueOf, AbstractC166997dE.A0a(), AbstractC167007dF.A0d(), A0F, null, url, str2, null, AbstractC13950nL.A0F(i2), A1E);
        this.A01 = str;
    }

    public static int A00(Context context) {
        if (C14640oc.A0H()) {
            return context.getColor(R.color.abc_decor_view_status_guard_light);
        }
        return -1;
    }

    public static int A01(Context context) {
        if (C14640oc.A0H()) {
            return context.getColor(R.color.igds_primary_text);
        }
        return -16777216;
    }

    @Override // X.C5NL
    public final C5NG BlQ() {
        C5NG A0V = AbstractC167007dF.A0V();
        if (!A06().isEmpty()) {
            ((C148286ly) AbstractC166987dD.A16(C148276lx.A1J.A0O)).A0S = "expressive_question_sticker";
        }
        AbstractC166987dD.A1V(C148276lx.A1J, A0V);
        return A0V;
    }

    @Override // X.C5NL
    public final Integer CBq() {
        if (A08()) {
            return C05F.A0Q;
        }
        return C05F.A0P;
    }
}
