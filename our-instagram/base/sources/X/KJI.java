package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes8.dex */
public final class KJI extends AbstractC66422zJ {
    public final float A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.media_thumbnail_preview_null_state_item_layout, viewGroup, false);
        ((MediaFrameLayout) AbstractC166997dE.A0R(inflate, R.id.preview_null_state_item)).A00 = this.A00;
        return new C3OO(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZ6.class;
    }

    public KJI(float f) {
        this.A00 = f;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
