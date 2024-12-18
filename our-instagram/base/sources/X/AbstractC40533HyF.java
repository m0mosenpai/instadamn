package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import java.util.List;

/* renamed from: X.HyF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40533HyF {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        View view;
        ViewGroup viewGroup;
        C62862tP A06 = C6BQ.A06(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        List list = c6fw.A00;
        C102884kP c102884kP = (C102884kP) list.get(1);
        if (c102884kP != null) {
            str = c102884kP.A0G();
        } else {
            str = null;
        }
        Fragment A00 = AbstractC39709Hjf.A00(A04);
        if (A00 != null && (view = A00.mView) != null && (viewGroup = (ViewGroup) view.getParent()) != null && !A00.mDetached && !A00.mRemoving) {
            C1338462s c1338462s = (C1338462s) list.get(0);
            View findViewWithTag = viewGroup.findViewWithTag("story_viewer_media_container_view_tag");
            C14360o3.A0B(A04, 1);
            C126545np c126545np = new C126545np(A04);
            if (findViewWithTag != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(findViewWithTag.getWidth(), findViewWithTag.getHeight());
                layoutParams.setMargins(0, findViewWithTag.getTop(), 0, 0);
                c126545np.setLayoutParams(layoutParams);
            }
            SparseArray sparseArray = new SparseArray();
            C6FG c6fg = c6fq.A03;
            if (c6fg != null) {
                Object obj = c6fg.A01.get(R.id.video_player_origin);
                if (PlayerOrigin.class.isInstance(obj) && obj != null) {
                    sparseArray.put(R.id.video_player_origin, obj);
                }
            }
            C6T8 A002 = C6T7.A00(A04, c1338462s, A06);
            A002.A00 = sparseArray;
            C6T7 A003 = A002.A00();
            A003.A07(c126545np);
            viewGroup.setOnKeyListener(new ViewOnKeyListenerC42037Ik6(viewGroup, c126545np, A003));
            C0eR c0eR = A00.mLifecycleRegistry;
            C42076Ikj c42076Ikj = new C42076Ikj(viewGroup, c0eR, c126545np, A003, str);
            c0eR.A09(c42076Ikj);
            c126545np.setTag(R.id.stories_overlay, c42076Ikj);
            viewGroup.addView(c126545np);
            c126545np.setVisibility(0);
        }
        return null;
    }
}
