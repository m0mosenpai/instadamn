package X;

import com.facebook.smartcapture.view.HelpButton;

/* renamed from: X.LzW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49825LzW implements Runnable {
    public final /* synthetic */ HelpButton A00;

    public RunnableC49825LzW(HelpButton helpButton) {
        this.A00 = helpButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HelpButton helpButton = this.A00;
        if (!helpButton.A00) {
            helpButton.setExpanded(true);
        }
    }
}
