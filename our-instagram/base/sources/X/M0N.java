package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes8.dex */
public final class M0N implements Runnable {
    public final /* synthetic */ L46 A00;

    public M0N(L46 l46) {
        this.A00 = l46;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00.A03;
        AbstractC13880nE.A0O(composerAutoCompleteTextView);
        composerAutoCompleteTextView.clearFocus();
    }
}