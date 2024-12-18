package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.KNc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45749KNc extends AbstractC44608JpE implements MOR {
    public final RecyclerView A00;
    public final KNR A01;
    public final InterfaceC193828i3 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45749KNc(ViewGroup viewGroup, L65 l65, InterfaceC193828i3 interfaceC193828i3) {
        super(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.horizontal_album_filters_row_layout, false), l65);
        C14360o3.A0B(l65, 3);
        this.A02 = interfaceC193828i3;
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(this.itemView, R.id.filter_type_recyclerview);
        this.A00 = recyclerView;
        KNR knr = new KNR(interfaceC193828i3);
        this.A01 = knr;
        recyclerView.setAdapter(knr);
        AbstractC31174DnI.A17(AbstractC31172DnG.A05(this), recyclerView, false);
    }

    @Override // X.MOR
    public final /* bridge */ /* synthetic */ void DLn(Object obj, int i) {
        L8Z l8z = (L8Z) obj;
        C14360o3.A0B(l8z, 0);
        InterfaceC193828i3 interfaceC193828i3 = this.A02;
        if (interfaceC193828i3 != null) {
            interfaceC193828i3.CiM(l8z, i);
        }
    }
}
