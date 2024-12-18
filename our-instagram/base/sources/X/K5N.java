package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class K5N extends AbstractC44444JlB {
    public FrameLayout A00;
    public InterfaceC50384MMm A01;
    public View A02;
    public Button A03;
    public TextView A04;
    public TextView A05;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC44444JlB, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof InterfaceC50384MMm) {
            this.A01 = (InterfaceC50384MMm) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        C14360o3.A0B(view, 0);
        ImageView A01 = AbstractC47961LGz.A01(view, R.id.iv_back_button);
        if (super.A00 != null) {
            drawable = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
        } else {
            drawable = null;
        }
        A01.setImageDrawable(drawable);
        LQ0.A02(A01, 21, this);
        this.A02 = AbstractC47961LGz.A00(view, R.id.help_button);
        this.A00 = (FrameLayout) AbstractC47961LGz.A00(view, R.id.fl_overlay_container);
        LQ0 A012 = LQ0.A01(this, 23);
        View view2 = this.A02;
        if (view2 != null) {
            C0fQ.A00(A012, view2);
        }
        this.A05 = AbstractC47961LGz.A02(view, R.id.tv_title);
        this.A04 = AbstractC47961LGz.A02(view, R.id.tv_subtitle);
        TextView textView = this.A05;
        C14360o3.A0A(textView);
        TextView textView2 = this.A04;
        C14360o3.A0A(textView2);
        AbstractC46574KjD.A00(textView, textView2);
        Button button = (Button) AbstractC47961LGz.A00(view, R.id.btn_retake);
        this.A03 = button;
        if (button != null) {
            LQ0.A02(button, 22, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(55663143);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_selfie_timeout_fragment, viewGroup, false);
        C0f9.A09(917204088, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1670561543);
        super.onDestroyView();
        this.A05 = null;
        this.A04 = null;
        this.A02 = null;
        this.A00 = null;
        this.A03 = null;
        C0f9.A09(-1014098089, A02);
    }

    @Override // X.AbstractC44444JlB, androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(1857113316);
        super.onDetach();
        this.A01 = null;
        C0f9.A09(-1092598528, A02);
    }
}
