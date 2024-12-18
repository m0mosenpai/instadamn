package X;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

/* renamed from: X.Vxw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69931Vxw {
    public static final C09530e4 A00(Spannable spannable, Object obj, char c, int i) {
        Object v78;
        String name;
        C14360o3.A0B(spannable, 0);
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (spannable.charAt(i2) == c) {
                boolean z = obj instanceof User;
                String A00 = AbstractC111324zv.A00(1844);
                if (z) {
                    v78 = new C202858y3((User) obj, 0);
                } else if (obj instanceof Hashtag) {
                    v78 = new V78((Hashtag) obj, 0);
                } else {
                    throw new UnsupportedOperationException(A00);
                }
                if (z) {
                    name = ((User) obj).getUsername();
                } else if (obj instanceof Hashtag) {
                    name = ((Hashtag) obj).getName();
                    if (name == null) {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw new UnsupportedOperationException(A00);
                }
                int A0A = AbstractC167007dF.A0A(name) + i2 + 1;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
                C0s6 A002 = AbstractC13190m5.A00(spannableStringBuilder.getSpans(i2, i, AbstractC202868y4.class));
                while (A002.hasNext()) {
                    spannableStringBuilder.removeSpan(A002.next());
                }
                spannableStringBuilder.replace(i2 + 1, i, (CharSequence) AnonymousClass001.A0C(name, ' '));
                spannableStringBuilder.setSpan(v78, i2, A0A, 33);
                A01(spannableStringBuilder);
                return AbstractC167007dF.A0o(spannableStringBuilder, A0A);
            }
        }
        return null;
    }

    public static final void A01(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (obj instanceof AbstractC202868y4) {
                spannable.setSpan(new StyleSpan(1), spannable.getSpanStart(obj), spannable.getSpanEnd(obj), 17);
            } else if (obj instanceof StyleSpan) {
                spannable.removeSpan(obj);
            }
        }
    }
}
