package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class K5P extends K5J {
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C14360o3.A0B(view, 0);
        View A00 = AbstractC47961LGz.A00(view, R.id.tv_permissions_title);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.facebook.smartcapture.ui.ResourcesTextView");
        TextView textView = (TextView) A00;
        if (this instanceof K5F) {
            i = R.string.res_0x7f130031_name_removed;
        } else {
            i = R.string.res_0x7f130030_name_removed;
        }
        textView.setText(i);
        LQ0.A02(AbstractC47961LGz.A00(view, R.id.btn_camera_access_allow), 6, this);
        LQ0.A02(AbstractC47961LGz.A00(view, R.id.btn_camera_access_deny), 7, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-885655930);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_credit_card_permissions_fragment, viewGroup, false);
        C0f9.A09(76470324, A02);
        return inflate;
    }
}
