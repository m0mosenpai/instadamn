package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.IIj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41118IIj {
    public C41181vS A00;
    public boolean A01;
    public final Context A02;
    public final IgdsInlineSearchBox A03;

    public C41118IIj(View view, ViewGroup viewGroup, GZD gzd, IgdsInlineSearchBox igdsInlineSearchBox, ReelDashboardFragment reelDashboardFragment) {
        int i;
        AbstractC25233BEq.A0x(2, igdsInlineSearchBox, gzd, reelDashboardFragment);
        this.A03 = igdsInlineSearchBox;
        this.A02 = AbstractC166997dE.A0L(viewGroup);
        igdsInlineSearchBox.A02 = gzd;
        C3FQ A00 = C3FN.A00(viewGroup);
        C14360o3.A07(A00);
        A00.AAJ(new JXT(this, 6));
        if (viewGroup instanceof ListView) {
            i = 1;
        } else if (!(viewGroup instanceof RecyclerView)) {
            return;
        } else {
            i = 2;
        }
        igdsInlineSearchBox.A00 = new ViewOnFocusChangeListenerC42036Ik5(view, viewGroup, this, reelDashboardFragment, i);
    }
}
