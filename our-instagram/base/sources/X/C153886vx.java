package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.6vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153886vx extends AbstractC66412zI {
    public final InterfaceC153586vT A00;

    @Override // X.AbstractC66422zJ
    public final C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        final View inflate = layoutInflater.inflate(R.layout.layout_clips_grid_video_series_item, viewGroup, false);
        C3OO c3oo = new C3OO(inflate) { // from class: X.9UZ
        };
        C0fQ.A00(new ARE(this), c3oo.itemView);
        return c3oo;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C153976w6.class;
    }

    public C153886vx(InterfaceC153586vT interfaceC153586vT) {
        this.A00 = interfaceC153586vT;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
