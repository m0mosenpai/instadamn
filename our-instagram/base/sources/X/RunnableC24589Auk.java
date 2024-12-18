package X;

import android.view.KeyEvent;

/* renamed from: X.Auk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24589Auk implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C81N A01;

    public RunnableC24589Auk(C81N c81n, float f) {
        this.A01 = c81n;
        this.A00 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KeyEvent.Callback A05 = this.A01.A05();
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.creation.base.ui.ConstrainedView");
        ((InterfaceC25168BBo) A05).setAspectRatio(this.A00);
    }
}
