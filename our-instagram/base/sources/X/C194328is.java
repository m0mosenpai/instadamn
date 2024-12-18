package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.8is, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194328is extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(interfaceC66482zP, 0);
        C14360o3.A0B(c3oo, 1);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        final View inflate = layoutInflater.inflate(R.layout.stories_gallery_meta_gallery_loading_spinner, viewGroup, false);
        C14360o3.A07(inflate);
        return new C3OO(inflate) { // from class: X.9Uc
            public final LoadingSpinnerView A00;

            {
                super(inflate);
                LoadingSpinnerView loadingSpinnerView = (LoadingSpinnerView) AbstractC166987dD.A0c(inflate, R.id.loading_spinner);
                this.A00 = loadingSpinnerView;
                loadingSpinnerView.setLoadingStatus(MY0.A02);
            }
        };
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C194378ix.class;
    }
}
