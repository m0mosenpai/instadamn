package X;

import android.widget.TextSwitcher;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.GOm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36917GOm implements Runnable {
    public final /* synthetic */ TextSwitcher A00;
    public final /* synthetic */ IgTextView A01;

    public RunnableC36917GOm(TextSwitcher textSwitcher, IgTextView igTextView) {
        this.A01 = igTextView;
        this.A00 = textSwitcher;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.setVisibility(0);
        this.A00.setVisibility(8);
    }
}
