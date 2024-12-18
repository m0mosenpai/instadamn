package X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.JkJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44423JkJ extends FrameLayout {
    public C56352iT A00;
    public SearchEditText A01;

    public final ImageView getBackButton() {
        C56352iT c56352iT = this.A00;
        if (c56352iT == null) {
            C14360o3.A0F("actionBarService");
            throw C00O.createAndThrow();
        }
        return c56352iT.A0Q();
    }

    public final SearchEditText getEditText() {
        SearchEditText searchEditText = this.A01;
        if (searchEditText == null) {
            C14360o3.A0F("_editText");
            throw C00O.createAndThrow();
        }
        return searchEditText;
    }
}
