package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* loaded from: classes6.dex */
public final class GMO implements Runnable {
    public final /* synthetic */ EMP A00;

    public GMO(EMP emp) {
        this.A00 = emp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        String str;
        EMP emp = this.A00;
        if (emp.getActivity() != null) {
            View view = emp.A01;
            if (view == null) {
                str = "spinner";
            } else {
                view.setVisibility(8);
                View view2 = emp.A00;
                if (view2 == null) {
                    str = "divider";
                } else {
                    view2.setVisibility(0);
                    RecyclerView recyclerView = emp.A02;
                    if (recyclerView == null) {
                        str = "mentionedUsersRecyclerView";
                    } else {
                        recyclerView.setVisibility(0);
                        Fragment fragment = emp.mParentFragment;
                        if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null && (c189478aR = bottomSheetFragment.A02) != null) {
                            c189478aR.A0R(true, false);
                            return;
                        }
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
