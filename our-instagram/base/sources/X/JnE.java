package X;

import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class JnE extends AbstractC51163Mj6 {
    @Override // X.AbstractC51163Mj6
    public final /* bridge */ /* synthetic */ C3OO A00(ViewGroup viewGroup, O1E o1e) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C3OO(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.audio_list_loading_view, false));
    }

    @Override // X.AbstractC51163Mj6
    public final /* bridge */ /* synthetic */ void A02(O1E o1e, C3OO c3oo) {
        c3oo.itemView.setVisibility(AbstractC167007dF.A05(o1e instanceof C51059MhD ? 1 : 0));
    }
}
