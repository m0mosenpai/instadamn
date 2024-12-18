package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class GP3 implements Runnable {
    public final /* synthetic */ C145386gx A00;
    public final /* synthetic */ boolean A01;

    public GP3(C145386gx c145386gx, boolean z) {
        this.A00 = c145386gx;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        int i;
        String str;
        C145386gx c145386gx = this.A00;
        C145386gx.A00(c145386gx);
        Fragment fragment = (Fragment) c145386gx.A05.get();
        if (fragment != null && (context = fragment.getContext()) != null) {
            if (this.A01) {
                i = 2131961151;
                str = null;
            } else {
                i = 2131962078;
                str = "failed_download_video";
            }
            C9GR.A0F(context, str, i);
        }
    }
}
