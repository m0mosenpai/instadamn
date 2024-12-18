package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class K5H extends K5S {
    @Override // X.K5S, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1492209184);
        C14360o3.A0B(layoutInflater, 0);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.xmds_photo_review_fragment, viewGroup, false);
        this.A0B = (FrameLayout) layoutInflater.inflate(R.layout.photo_review_full, viewGroup2, false);
        C0f9.A09(547932977, A02);
        return viewGroup2;
    }
}
