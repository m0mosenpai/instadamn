package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.HyC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40530HyC {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0G;
        View view;
        ViewGroup viewGroup;
        C6BQ.A06(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C102884kP c102884kP = (C102884kP) c6fw.A00.get(0);
        if (c102884kP == null) {
            A0G = null;
        } else {
            A0G = c102884kP.A0G();
        }
        Fragment A00 = AbstractC39709Hjf.A00(A04);
        if (A00 != null && (view = A00.mView) != null && (viewGroup = (ViewGroup) view.getParent()) != null && !A00.mDetached && !A00.mRemoving) {
            if (A0G == null) {
                A0G = "";
            }
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    C42076Ikj c42076Ikj = (C42076Ikj) viewGroup.getChildAt(childCount).getTag(R.id.stories_overlay);
                    if (c42076Ikj != null && A0G.equals(c42076Ikj.A00)) {
                        c42076Ikj.onDestroy();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return null;
    }
}
