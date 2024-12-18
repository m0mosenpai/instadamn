package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;

/* renamed from: X.Vts, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69697Vts {
    public View A00;
    public final int A01;
    public final ViewStub A02;

    public final View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("itemView");
        throw C00O.createAndThrow();
    }

    public final void A01() {
        if (this instanceof C67698UwP) {
            C67698UwP c67698UwP = (C67698UwP) this;
            ImageView imageView = c67698UwP.A01;
            if (imageView != null) {
                AbstractC62752SPj.A00(imageView);
            }
            ImageView imageView2 = c67698UwP.A00;
            if (imageView2 != null) {
                AbstractC62752SPj.A00(imageView2);
            }
        }
    }

    public AbstractC69697Vts(ViewStub viewStub, int i) {
        this.A02 = viewStub;
        this.A01 = i;
    }
}
