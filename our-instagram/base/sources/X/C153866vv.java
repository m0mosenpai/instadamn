package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.6vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153866vv extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        final View inflate = layoutInflater.inflate(R.layout.layout_clips_grid_loading_item, viewGroup, false);
        return new C3OO(inflate) { // from class: X.9UY
        };
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C153956w4.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
