package X;

import android.widget.HorizontalScrollView;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;

/* loaded from: classes6.dex */
public final class GLV implements Runnable {
    public final /* synthetic */ C36473G6x A00;

    public GLV(C36473G6x c36473G6x) {
        this.A00 = c36473G6x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C36473G6x c36473G6x = this.A00;
        SearchWithDeleteEditText searchWithDeleteEditText = c36473G6x.A07;
        boolean hasFocus = searchWithDeleteEditText.hasFocus();
        HorizontalScrollView horizontalScrollView = c36473G6x.A05;
        horizontalScrollView.fullScroll(66);
        horizontalScrollView.clearFocus();
        if (hasFocus) {
            searchWithDeleteEditText.requestFocus();
        }
    }
}
