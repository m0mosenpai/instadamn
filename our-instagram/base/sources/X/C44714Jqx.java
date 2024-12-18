package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.Jqx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44714Jqx extends C3OO {
    public final View A00;
    public final ImageView A01;
    public final JUV A02;
    public final /* synthetic */ C45672KJj A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44714Jqx(View view, C45672KJj c45672KJj) {
        super(view);
        this.A03 = c45672KJj;
        this.A00 = view;
        Resources A0M = AbstractC25228BEl.A0M(this.itemView);
        this.A02 = new JUX(AbstractC166997dE.A08(A0M), A0M.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), A0M.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        this.A01 = AbstractC31176DnK.A0D(this.itemView, R.id.direct_indicator_animation);
    }
}
