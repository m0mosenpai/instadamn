package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;

/* loaded from: classes8.dex */
public final class KKF extends IgFrameLayout {
    public InterfaceC16820sZ A00;
    public final View A01;
    public final IgView A02;
    public final IgTextView A03;
    public final IgTextView A04;

    public KKF(Context context) {
        super(context, null, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.gallery_partial_permission_view, (ViewGroup) this, false);
        this.A01 = inflate;
        addView(inflate);
        this.A02 = (IgView) findViewById(R.id.top_separator);
        IgTextView A0Y = AbstractC31172DnG.A0Y(this, R.id.btn_manage);
        this.A03 = A0Y;
        this.A04 = AbstractC31172DnG.A0Y(this, R.id.description_text);
        KKp.A01(AbstractC43592JPx.A0U(A0Y), this, 11);
    }

    public final void setOnManagePermissionsClickedListener(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        this.A00 = interfaceC16820sZ;
    }

    public final void setCtaButtonColor(int i) {
        AbstractC166987dD.A1O(getContext(), this.A03, i);
    }

    public final void setDescriptionTextColor(int i) {
        AbstractC166987dD.A1O(getContext(), this.A04, i);
    }
}
