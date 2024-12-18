package X;

import android.view.View;

/* renamed from: X.Wrm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71318Wrm implements Runnable {
    public final /* synthetic */ C67882V0n A00;

    public RunnableC71318Wrm(C67882V0n c67882V0n) {
        this.A00 = c67882V0n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = this.A00.A01;
        if (viewOnKeyListenerC67976V4r == null) {
            str = "controller";
        } else {
            View view = viewOnKeyListenerC67976V4r.A00;
            if (view == null) {
                str = "canvasContainer";
            } else {
                ViewOnKeyListenerC67976V4r.A02(viewOnKeyListenerC67976V4r, view.getTranslationY(), 0.0f);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
