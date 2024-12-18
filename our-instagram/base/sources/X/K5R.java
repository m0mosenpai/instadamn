package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class K5R extends K5J {
    public Button A00;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        Drawable drawable2;
        C14360o3.A0B(view, 0);
        Button button = (Button) AbstractC47961LGz.A00(view, R.id.btn_camera_access_allow);
        this.A00 = button;
        if (button == null) {
            C14360o3.A0F("btnCameraAccessAllow");
            throw C00O.createAndThrow();
        }
        LQ0.A02(AbstractC47961LGz.A00(button, R.id.btn_camera_access_allow), 25, this);
        ImageView A01 = AbstractC47961LGz.A01(view, R.id.iv_permissions_statement1);
        ImageView A012 = AbstractC47961LGz.A01(view, R.id.iv_permissions_statement2);
        ImageView A013 = AbstractC47961LGz.A01(view, R.id.iv_permissions_statement3);
        Drawable drawable3 = null;
        if (((AbstractC44444JlB) this).A00 != null) {
            drawable = AbstractC166997dE.A0L(view).getDrawable(R.drawable.instagram_video_chat_pano_filled_24);
        } else {
            drawable = null;
        }
        A01.setImageDrawable(drawable);
        if (((AbstractC44444JlB) this).A00 != null && (drawable2 = AbstractC166997dE.A0L(view).getDrawable(R.drawable.instagram_sparkles_pano_outline_24)) != null) {
            AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_ATOP, drawable2, requireContext().getColor(R.color.abc_decor_view_status_guard_light));
        } else {
            drawable2 = null;
        }
        A012.setImageDrawable(drawable2);
        if (((AbstractC44444JlB) this).A00 != null) {
            drawable3 = AbstractC166997dE.A0L(view).getDrawable(R.drawable.instagram_settings_pano_outline_24);
        }
        A013.setImageDrawable(drawable3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1562989461);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.xmds_permissions_fragment, viewGroup, false);
        C0f9.A09(1137842974, A02);
        return inflate;
    }
}
