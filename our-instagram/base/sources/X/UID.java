package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.facebookpay.widget.apm.ApmButtonsView;

/* loaded from: classes11.dex */
public final class UID extends C3OO {
    public final ApmButtonsView A00;
    public final ViewGroup A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UID(ViewGroup viewGroup) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A01 = viewGroup;
        this.A00 = (ApmButtonsView) AbstractC166997dE.A0R(viewGroup, R.id.apm_buttons);
    }
}
