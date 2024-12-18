package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.5H5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5H5 {
    public View A00;
    public AnonymousClass195 A01;
    public boolean A02;
    public final AbstractC43201yn A03;

    public C5H5(Context context, AbstractC43201yn abstractC43201yn) {
        this.A03 = abstractC43201yn;
        View inflate = LayoutInflater.from(context).inflate(R.layout.zero_video_placeholder, (ViewGroup) null, false);
        C0fQ.A00(new ViewOnClickListenerC41898Iha(context), inflate.findViewById(R.id.zero_video_placeholder));
        this.A00 = inflate;
    }

    public static final void A00(C5H5 c5h5) {
        Object obj;
        C0UO A00 = C3Q1.A00();
        if (A00 != null) {
            obj = A00.getValue();
        } else {
            obj = null;
        }
        if (obj == C3Q2.A02 && c5h5.A02) {
            View view = c5h5.A00;
            if (view.getParent() == null) {
                c5h5.A03.addView(view);
                return;
            }
            return;
        }
        View view2 = c5h5.A00;
        if (view2.getParent() == null) {
            return;
        }
        c5h5.A03.removeView(view2);
    }
}
