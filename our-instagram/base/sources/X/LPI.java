package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes8.dex */
public final class LPI implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C8QJ A02;
    public final /* synthetic */ C70K A03;

    public LPI(Context context, C8QJ c8qj, C70K c70k, int i) {
        this.A02 = c8qj;
        this.A03 = c70k;
        this.A00 = i;
        this.A01 = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1328039262);
        C8QJ c8qj = this.A02;
        IgSimpleImageView igSimpleImageView = this.A03.A03;
        int i = this.A00;
        Context context = this.A01;
        C14360o3.A0A(context);
        c8qj.showAsDropDown(igSimpleImageView, i, AbstractC13690mv.A01(context, -64));
        C0f9.A0C(-832784051, A05);
    }
}
