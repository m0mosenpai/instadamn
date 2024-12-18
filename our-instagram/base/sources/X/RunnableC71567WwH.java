package X;

import android.widget.ImageView;

/* renamed from: X.WwH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71567WwH implements Runnable {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ ViewOnKeyListenerC67976V4r A01;
    public final /* synthetic */ C23031Ai A02;

    public RunnableC71567WwH(ImageView imageView, ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r, C23031Ai c23031Ai) {
        this.A01 = viewOnKeyListenerC67976V4r;
        this.A02 = c23031Ai;
        this.A00 = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC67976V4r viewOnKeyListenerC67976V4r = this.A01;
        if (viewOnKeyListenerC67976V4r.A0A) {
            C23031Ai c23031Ai = this.A02;
            int i = c23031Ai.A01.getInt("canvas_show_audio_button_tooltip", 0);
            if (i < 3) {
                C67882V0n c67882V0n = viewOnKeyListenerC67976V4r.A0I;
                C5SU c5su = new C5SU(c67882V0n.requireActivity(), new C149686oL(AbstractC166997dE.A0q(AbstractC166997dE.A0N(c67882V0n), 2131953295)));
                c5su.A04(this.A00, 0, AbstractC167017dG.A0E(c67882V0n.requireContext()), true);
                c5su.A01();
                c5su.A07(C5SV.A06);
                c5su.A04 = new V8F(c23031Ai, i);
                c5su.A00().A07(viewOnKeyListenerC67976V4r.A0O);
            }
        }
    }
}
