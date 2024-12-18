package X;

import androidx.core.widget.NestedScrollView;
import com.instagram.direct.ui.polls.PollMessageOptionView;

/* renamed from: X.M3s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49951M3s implements Runnable {
    public final /* synthetic */ NestedScrollView A00;
    public final /* synthetic */ PollMessageOptionView A01;

    public RunnableC49951M3s(NestedScrollView nestedScrollView, PollMessageOptionView pollMessageOptionView) {
        this.A00 = nestedScrollView;
        this.A01 = pollMessageOptionView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0D((int) this.A01.getY());
    }
}
