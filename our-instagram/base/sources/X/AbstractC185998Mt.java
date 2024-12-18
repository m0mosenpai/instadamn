package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.R;

/* renamed from: X.8Mt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC185998Mt {
    public static final void A00(View view) {
        C14360o3.A0B(view, 0);
        A01(view, view.getContext().getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), 0);
    }

    public static final void A01(View view, final float f, final int i) {
        ViewOutlineProvider viewOutlineProvider;
        C14360o3.A0B(view, 0);
        if (f > 0.0f) {
            viewOutlineProvider = new ViewOutlineProvider() { // from class: X.8Mu
                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    if (view2 != null && outline != null) {
                        outline.setRoundRect(0, i, view2.getWidth(), view2.getHeight(), f);
                    }
                }
            };
        } else {
            viewOutlineProvider = null;
        }
        view.setOutlineProvider(viewOutlineProvider);
        boolean z = false;
        if (f > 0.0f) {
            z = true;
        }
        view.setClipToOutline(z);
    }

    public static final void A02(View view, int i) {
        C14360o3.A0B(view, 0);
        if (AMo.A09()) {
            view.post(new RunnableC24296Aq1(view));
        } else {
            A01(view, i * 0.24f, 0);
        }
    }
}
