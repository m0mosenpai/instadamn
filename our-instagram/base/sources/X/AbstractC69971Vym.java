package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.reels.question.constants.QuestionStickerType;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vym, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69971Vym {
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b4, code lost:
    
        if (r3 == false) goto L49;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.UPe] */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.UPW, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C66617UPe A01(X.C148286ly r11) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69971Vym.A01(X.6ly):X.UPe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final C148286ly A00(C66617UPe c66617UPe) {
        SimpleImageUrl simpleImageUrl;
        ?? r6;
        ?? r5;
        QuestionStickerType questionStickerType;
        SimpleImageUrl simpleImageUrl2;
        String str = c66617UPe.A0L;
        String str2 = c66617UPe.A0P;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = c66617UPe.A0M;
        C148286ly c148286ly = null;
        if (str4 != null) {
            simpleImageUrl = new SimpleImageUrl(str4);
        } else {
            simpleImageUrl = null;
        }
        float f = c66617UPe.A01;
        float f2 = c66617UPe.A00;
        float f3 = c66617UPe.A02;
        int i = c66617UPe.A08;
        C148286ly c148286ly2 = new C148286ly();
        c148286ly2.A0S = str;
        c148286ly2.A0U = str2;
        c148286ly2.A0H = simpleImageUrl;
        c148286ly2.A01 = f;
        c148286ly2.A00 = f2;
        c148286ly2.A02 = f3;
        c148286ly2.A09 = i;
        c148286ly2.A07 = c66617UPe.A06;
        c148286ly2.A0d = c66617UPe.A0W;
        c148286ly2.A08 = c66617UPe.A07;
        c148286ly2.A05 = c66617UPe.A04;
        c148286ly2.A06 = c66617UPe.A05;
        String str5 = c66617UPe.A0a;
        if (str5 != null) {
            str3 = str5;
        }
        c148286ly2.A0h = str3;
        c148286ly2.A0f = c66617UPe.A0Y;
        c148286ly2.A0e = c66617UPe.A0X;
        c148286ly2.A04 = c66617UPe.A03;
        C66613UPa c66613UPa = c66617UPe.A0D;
        if (c66613UPa != null) {
            c148286ly2.A0K = AbstractC69969Vyk.A00(c66613UPa);
        }
        UPW upw = c66617UPe.A0C;
        if (upw != null) {
            Boolean bool = upw.A00;
            Boolean bool2 = upw.A01;
            Integer num = upw.A07;
            Integer num2 = upw.A08;
            String str6 = upw.A0A;
            Boolean bool3 = upw.A02;
            String str7 = upw.A0B;
            Boolean bool4 = upw.A03;
            Boolean bool5 = upw.A04;
            Integer num3 = upw.A09;
            String str8 = upw.A0C;
            Boolean bool6 = upw.A05;
            String str9 = upw.A0D;
            if (str9 != null) {
                simpleImageUrl2 = new SimpleImageUrl(str9);
            } else {
                simpleImageUrl2 = null;
            }
            c148286ly2.A0J = new HashtagImpl(simpleImageUrl2, bool, bool2, bool3, bool4, bool5, bool6, upw.A06, num, num2, num3, str6, str7, str8, upw.A0E, upw.A0F);
        }
        c148286ly2.A0N = c66617UPe.A0H;
        c148286ly2.A0Y = c66617UPe.A0S;
        List list = c66617UPe.A0c;
        if (list != null) {
            r6 = AbstractC167007dF.A0i(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A05 = AbstractC25227BEk.A05((EnumC68152VDw) it.next(), 0);
                if (A05 != 1) {
                    if (A05 != 2) {
                        if (A05 != 3) {
                            if (A05 != 4) {
                                questionStickerType = QuestionStickerType.A09;
                            } else {
                                questionStickerType = QuestionStickerType.A04;
                            }
                        } else {
                            questionStickerType = QuestionStickerType.A05;
                        }
                    } else {
                        questionStickerType = QuestionStickerType.A06;
                    }
                } else {
                    questionStickerType = QuestionStickerType.A08;
                }
                r6.add(questionStickerType);
            }
        } else {
            r6 = C16930sl.A00;
        }
        c148286ly2.A0n = r6;
        List list2 = c66617UPe.A0d;
        if (list2 != null) {
            r5 = AbstractC167007dF.A0i(list2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                r5.add(AbstractC69970Vyl.A00((EnumC68151VDv) it2.next()));
            }
        } else {
            r5 = C16930sl.A00;
        }
        c148286ly2.A0m = r5;
        c148286ly2.A0P = c66617UPe.A0I;
        c148286ly2.A0L = c66617UPe.A0F;
        c148286ly2.A0A = c66617UPe.A09;
        c148286ly2.A05(AbstractC166987dD.A1J(c66617UPe.A0N));
        C66617UPe c66617UPe2 = c66617UPe.A0E;
        if (c66617UPe2 != null) {
            c148286ly = A00(c66617UPe2);
        }
        c148286ly2.A0I = c148286ly;
        c148286ly2.A0X = c66617UPe.A0R;
        c148286ly2.A0R = c66617UPe.A0K;
        List list3 = c66617UPe.A0b;
        if (list3 == null) {
            list3 = C16930sl.A00;
        }
        c148286ly2.A0j = list3;
        c148286ly2.A0a = c66617UPe.A0T;
        c148286ly2.A0b = c66617UPe.A0U;
        c148286ly2.A0W = c66617UPe.A0Q;
        c148286ly2.A0T = c66617UPe.A0O;
        c148286ly2.A0B = c66617UPe.A0A;
        c148286ly2.A0g = c66617UPe.A0Z;
        c148286ly2.A0F = c66617UPe.A0B;
        c148286ly2.A0c = c66617UPe.A0V;
        c148286ly2.A0M = c66617UPe.A0G;
        return c148286ly2;
    }
}
