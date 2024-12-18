package X;

import android.widget.TextView;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.Dty, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31572Dty {
    public static void A00(TextView textView) {
        AbstractC166997dE.A1F(textView.getCompoundDrawablesRelative()[0].mutate(), textView.getResources().getColor(AbstractC53242c7.A0B(textView.getContext())));
    }

    public static void A01(SearchEditText searchEditText) {
        searchEditText.setClearButtonColorFilter(C3DY.A00(searchEditText.getResources().getColor(AbstractC53242c7.A08(searchEditText.getContext()))));
    }
}
