package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.2zH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66402zH extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.clips_netego_shimmer_card_view, viewGroup, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        C14360o3.A0B(inflate, 1);
        return new C3OO(inflate);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C66472zO.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
    }
}
