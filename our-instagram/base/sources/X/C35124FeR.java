package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.AbstractCollection;

/* renamed from: X.FeR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35124FeR {
    public View.OnClickListener A00;
    public final SpannableStringBuilder A01;
    public final String A02;
    public final String A03;

    public static void A00(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C35124FeR(str, str2));
    }

    public C35124FeR(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder;
        if (!TextUtils.isEmpty(str3)) {
            spannableStringBuilder = AbstractC25225BEi.A0H(str3);
        } else {
            spannableStringBuilder = null;
        }
        this.A02 = str;
        this.A03 = str2;
        this.A01 = spannableStringBuilder;
    }

    public C35124FeR(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder;
        if (!TextUtils.isEmpty("")) {
            spannableStringBuilder = AbstractC25225BEi.A0H("");
        } else {
            spannableStringBuilder = null;
        }
        this.A02 = str;
        this.A03 = str2;
        this.A01 = spannableStringBuilder;
    }
}
