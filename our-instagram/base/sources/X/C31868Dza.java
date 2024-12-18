package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.Dza, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31868Dza extends C2UU {
    public final C32307EKu A00;
    public final List A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C32187ECi c32187ECi = (C32187ECi) this.A01.get(i);
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC31171DnF.A06(c3oo);
        igdsListCell.setTextCellType(EnumC53237Nga.A03);
        String str = c32187ECi.A02;
        if (str == null) {
            str = "";
        }
        igdsListCell.A0I(str);
        igdsListCell.setChecked(AbstractC166997dE.A1Z(c32187ECi.A00, true));
        igdsListCell.A0D(new C35730FqD(1, this, c32187ECi));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C3OO(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.add_objectives_list_item, false));
    }

    public C31868Dza(C32307EKu c32307EKu, List list) {
        this.A01 = list;
        this.A00 = c32307EKu;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1351782982);
        int size = this.A01.size();
        C0f9.A0A(218291059, A03);
        return size;
    }
}
