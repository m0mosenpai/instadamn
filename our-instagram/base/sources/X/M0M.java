package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes8.dex */
public final class M0M implements Runnable {
    public final /* synthetic */ L46 A00;

    public M0M(L46 l46) {
        this.A00 = l46;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L46 l46 = this.A00;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = l46.A03;
        composerAutoCompleteTextView.requestFocus();
        composerAutoCompleteTextView.postDelayed(new M0L(l46), 60L);
    }
}
