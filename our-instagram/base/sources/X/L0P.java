package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* loaded from: classes8.dex */
public final class L0P {
    public final IgSimpleImageView A00;
    public final InterfaceC50403MNf A01;

    public L0P(Context context, View.OnClickListener onClickListener, ViewGroup viewGroup, InterfaceC50403MNf interfaceC50403MNf) {
        this.A01 = interfaceC50403MNf;
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.picker_tab);
        this.A00 = igSimpleImageView;
        C49639LwW c49639LwW = (C49639LwW) interfaceC50403MNf;
        AbstractC166997dE.A19(igSimpleImageView.getContext(), igSimpleImageView, c49639LwW.A01);
        AbstractC166997dE.A18(context, igSimpleImageView, c49639LwW.A00);
        C0fQ.A00(onClickListener, igSimpleImageView);
    }
}
