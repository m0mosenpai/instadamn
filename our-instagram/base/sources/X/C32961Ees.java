package X;

import android.view.View;

/* renamed from: X.Ees, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32961Ees extends AbstractC85543rj {
    public final /* synthetic */ Runnable A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32961Ees(int i, Runnable runnable) {
        super("", i, true);
        this.A00 = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A00.run();
    }
}
