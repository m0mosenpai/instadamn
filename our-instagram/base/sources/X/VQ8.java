package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes11.dex */
public abstract class VQ8 {
    public static final Object A00(C6FQ c6fq) {
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0J = AbstractC31175DnJ.A0J(c6fq);
        AbstractC65702TsY.A0q();
        Bundle bundle = new Bundle();
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "ads_manager");
        V15 v15 = new V15();
        v15.setArguments(bundle);
        C140966Yy c140966Yy = new C140966Yy(A04, A0J);
        c140966Yy.A0B(null, v15);
        c140966Yy.A04();
        return null;
    }
}
