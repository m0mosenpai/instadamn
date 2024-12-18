package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes8.dex */
public final class M33 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC45465KBa A01;

    public M33(View view, AbstractC45465KBa abstractC45465KBa) {
        this.A01 = abstractC45465KBa;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC45465KBa abstractC45465KBa = this.A01;
        FragmentActivity activity = abstractC45465KBa.getActivity();
        if (activity != null) {
            AbstractC225619xg.A00(activity, this.A00, AbstractC166987dD.A0r(abstractC45465KBa.A0S));
        }
    }
}
