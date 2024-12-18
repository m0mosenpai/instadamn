package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.7f9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC168147f9 implements Runnable {
    public final /* synthetic */ C166627cY A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public RunnableC168147f9(C166627cY c166627cY, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = c166627cY;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C166627cY c166627cY = this.A00;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = c166627cY.A0B;
        composerAutoCompleteTextView.requestFocus();
        final InterfaceC16820sZ interfaceC16820sZ = this.A01;
        composerAutoCompleteTextView.postDelayed(new Runnable() { // from class: X.7fK
            @Override // java.lang.Runnable
            public final void run() {
                ComposerAutoCompleteTextView composerAutoCompleteTextView2 = C166627cY.this.A0B;
                AbstractC13880nE.A0R(composerAutoCompleteTextView2);
                composerAutoCompleteTextView2.requestFocus();
                interfaceC16820sZ.invoke();
            }
        }, 60L);
    }
}
