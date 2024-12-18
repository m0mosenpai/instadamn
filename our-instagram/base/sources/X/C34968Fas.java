package X;

import android.graphics.drawable.Drawable;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: X.Fas, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34968Fas {
    public Drawable A00;
    public Scene A01;
    public Scene A02;
    public Transition A03;
    public TransitionSet A04;
    public ViewGroup A05;
    public Runnable A06;
    public Runnable A07;
    public final InterfaceC11380iw A08;

    public static final void A00(Scene scene, Transition transition, ViewGroup viewGroup, int... iArr) {
        ArrayList A17 = AbstractC25225BEi.A17(2);
        int i = 0;
        do {
            View findViewById = viewGroup.findViewById(iArr[i]);
            if (findViewById != null) {
                ViewPropertyAnimator duration = findViewById.animate().alpha(0.0f).setDuration(150L);
                C14360o3.A07(duration);
                A17.add(duration);
            }
            i++;
        } while (i < 2);
        int size = A17.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == size - 1) {
                ((ViewPropertyAnimator) A17.get(i2)).withEndAction(new GOR(scene, transition));
            }
            ((ViewPropertyAnimator) A17.get(0)).start();
        }
    }

    public C34968Fas(InterfaceC11380iw interfaceC11380iw) {
        this.A08 = interfaceC11380iw;
    }
}
