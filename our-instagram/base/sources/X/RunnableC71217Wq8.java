package X;

import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: X.Wq8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71217Wq8 implements Runnable {
    public final /* synthetic */ Toolbar A00;

    public RunnableC71217Wq8(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WPV wpv;
        ActionMenuView actionMenuView = this.A00.A0E;
        if (actionMenuView != null && (wpv = actionMenuView.A04) != null) {
            wpv.A04();
        }
    }
}
