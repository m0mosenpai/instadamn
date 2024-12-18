package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.7SH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SH implements C7QD {
    public final C57012jc A00;

    public final void A00(C7BS c7bs) {
        int i;
        Integer num = c7bs.A00;
        C57012jc c57012jc = this.A00;
        if (num != null) {
            c57012jc.A03(0);
            ImageView imageView = (ImageView) c57012jc.A01();
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    i = R.drawable.instagram_atom_pano_outline_24;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i = R.drawable.instagram_lock_pano_outline_24;
            }
            imageView.setImageResource(i);
            return;
        }
        c57012jc.A02();
    }

    @Override // X.C7QD
    public final View BKF() {
        View view;
        C57012jc c57012jc = this.A00;
        if (c57012jc.A00 != null) {
            view = c57012jc.A01();
        } else {
            view = c57012jc.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7SH(C57012jc c57012jc) {
        this.A00 = c57012jc;
    }
}
