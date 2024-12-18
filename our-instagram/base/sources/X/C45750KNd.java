package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KNd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45750KNd extends AbstractC44608JpE implements MOR {
    public int A00;
    public KNZ A01;
    public final TextView A02;
    public final TextView A03;
    public final RecyclerView A04;
    public final InterfaceC193828i3 A05;
    public final KNS A06;
    public final C51737MtK A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45750KNd(ViewGroup viewGroup, C51737MtK c51737MtK, UserSession userSession, L65 l65, InterfaceC193828i3 interfaceC193828i3) {
        super(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.album_category_layout, false), l65);
        AbstractC167017dG.A1S(c51737MtK, l65);
        this.A05 = interfaceC193828i3;
        this.A07 = c51737MtK;
        this.A03 = AbstractC25230BEn.A0Q(this.itemView, R.id.album_category_title);
        this.A02 = AbstractC25230BEn.A0Q(this.itemView, R.id.button_see_all);
        RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A0c(this.itemView, R.id.album_thumbnail_recycler_view);
        this.A04 = recyclerView;
        this.A00 = 2;
        KNS kns = new KNS(c51737MtK, userSession, null, interfaceC193828i3);
        this.A06 = kns;
        recyclerView.setAdapter(kns);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2, 0, false));
        Resources A0M = AbstractC25228BEl.A0M(this.itemView);
        recyclerView.A10(new JoJ(0, this.A00, A0M.getDimensionPixelOffset(R.dimen.abc_dialog_padding_material), A0M.getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material)));
    }

    public static final String A00(C45750KNd c45750KNd, Integer num) {
        Context A05;
        int i;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                A05 = AbstractC31172DnG.A05(c45750KNd);
                i = 2131964745;
            } else if (intValue == 2) {
                A05 = AbstractC31172DnG.A05(c45750KNd);
                i = 2131964743;
            } else if (intValue == 3) {
                A05 = AbstractC31172DnG.A05(c45750KNd);
                i = 2131964746;
            } else {
                return "";
            }
            return AbstractC166997dE.A0p(A05, i);
        }
        return "";
    }

    @Override // X.MOR
    public final /* bridge */ /* synthetic */ void DLn(Object obj, int i) {
        C51756Mtf c51756Mtf = (C51756Mtf) obj;
        C14360o3.A0B(c51756Mtf, 0);
        InterfaceC193828i3 interfaceC193828i3 = this.A05;
        if (interfaceC193828i3 != null) {
            interfaceC193828i3.CiN(c51756Mtf, i);
        }
    }
}
