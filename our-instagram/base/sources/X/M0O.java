package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes8.dex */
public final class M0O implements Runnable {
    public final /* synthetic */ L46 A00;

    public M0O(L46 l46) {
        this.A00 = l46;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L46 l46 = this.A00;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = l46.A03;
        composerAutoCompleteTextView.clearFocus();
        composerAutoCompleteTextView.postDelayed(new M0N(l46), 60L);
    }
}
