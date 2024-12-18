package X;

import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.M0w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49877M0w implements Runnable {
    public final /* synthetic */ C45466KBb A00;

    public RunnableC49877M0w(C45466KBb c45466KBb) {
        this.A00 = c45466KBb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgLinearLayout igLinearLayout = this.A00.A0K;
        if (igLinearLayout == null) {
            C14360o3.A0F("noteTypeEntryPointsLayout");
            throw C00O.createAndThrow();
        }
        igLinearLayout.setVisibility(0);
    }
}
