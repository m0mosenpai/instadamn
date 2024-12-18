package X;

import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;
import com.meta.metaai.components.voice.animation.transrcipt.widget.UserInputTextView;

/* renamed from: X.FpZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC35699FpZ implements View.OnLayoutChangeListener {
    public final int A00;
    public final Object A01;

    public ViewOnLayoutChangeListenerC35699FpZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC35699FpZ(obj, i));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        String str;
        switch (this.A00) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                DirectAggregatedMediaViewerController directAggregatedMediaViewerController = (DirectAggregatedMediaViewerController) this.A01;
                KL4 kl4 = directAggregatedMediaViewerController.A0I;
                if (kl4 == null) {
                    str = "pagerAdapter";
                    break;
                } else {
                    kl4.A00(directAggregatedMediaViewerController.A1D, true);
                    return;
                }
            case 1:
                view.removeOnLayoutChangeListener(this);
                AbstractC31179DnN.A0l(new Rect(), (TextView) this.A01);
                return;
            case 2:
                int i9 = i3 - i;
                E06 e06 = ((C32260EIu) this.A01).A00;
                if (e06 == null) {
                    str = "interestAccountsAdapter";
                    break;
                } else {
                    e06.A04 = i9;
                    return;
                }
            case 3:
                int i10 = i3 - i;
                E04 e04 = ((C32269EJe) this.A01).A02;
                if (e04 == null) {
                    str = "interestAdapter";
                    break;
                } else {
                    e04.A01 = i10;
                    return;
                }
            case 4:
                return;
            case 5:
                final ScrollView scrollView = (ScrollView) this.A01;
                scrollView.postDelayed(new Runnable() { // from class: X.GMm
                    @Override // java.lang.Runnable
                    public final void run() {
                        scrollView.fullScroll(130);
                    }
                }, 50L);
                return;
            case 6:
                C34971Faw c34971Faw = (C34971Faw) this.A01;
                c34971Faw.A01 = (i3 - i) / 2.0f;
                UserInputTextView userInputTextView = c34971Faw.A0B;
                CharSequence text = userInputTextView.getText();
                if (text != null && text.length() != 0) {
                    return;
                }
                userInputTextView.setTranslationX(c34971Faw.A01);
                return;
            default:
                C34971Faw c34971Faw2 = (C34971Faw) this.A01;
                float width = view.getWidth();
                float width2 = c34971Faw2.A0A.getWidth();
                float f = c34971Faw2.A06;
                float width3 = (r1.getWidth() - f) - view.getWidth();
                if (width < width2 - f) {
                    width3 /= 2.0f;
                }
                c34971Faw2.A02 = width3;
                C34971Faw.A00(c34971Faw2);
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
