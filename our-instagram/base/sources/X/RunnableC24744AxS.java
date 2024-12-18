package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.AxS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24744AxS implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C166627cY A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    public RunnableC24744AxS(FragmentActivity fragmentActivity, C166627cY c166627cY, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = fragmentActivity;
        this.A02 = interfaceC16820sZ;
        this.A01 = c166627cY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00 != null) {
            C166627cY c166627cY = this.A01;
            int[] iArr = new int[2];
            View view = c166627cY.A01;
            view.getLocationOnScreen(iArr);
            Context context = view.getContext();
            int dimensionPixelSize = iArr[1] - context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            if (dimensionPixelSize > 0) {
                c166627cY.A0B.setDropDownHeight(dimensionPixelSize);
            } else {
                c166627cY.A0B.setDropDownHeight(context.getResources().getDimensionPixelSize(R.dimen.clips_viewer_recommend_clips_height));
            }
        }
        this.A02.invoke();
    }
}
