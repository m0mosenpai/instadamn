package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.DzZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31867DzZ extends C2UU {
    public final C32308EKv A00;
    public final List A01 = AbstractC166987dD.A1E();

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C33599EtB c33599EtB = (C33599EtB) this.A01.get(i);
        View A06 = AbstractC31171DnF.A06(c3oo);
        C32188ECj c32188ECj = c33599EtB.A00;
        IgdsListCell igdsListCell = (IgdsListCell) A06;
        igdsListCell.setTextCellType(EnumC53237Nga.A03);
        String str = c32188ECj.A02;
        if (str == null) {
            str = "";
        }
        igdsListCell.A0I(str);
        float f = 0.3f;
        if (c33599EtB.A01) {
            f = 1.0f;
        }
        igdsListCell.setAlpha(f);
        boolean z = true;
        if (!AbstractC166997dE.A1Z(c32188ECj.A00, true) || !c33599EtB.A01) {
            z = false;
        }
        igdsListCell.setChecked(z);
        igdsListCell.setEnabled(c33599EtB.A01);
        igdsListCell.A0D(new C35730FqD(0, this, c33599EtB));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C3OO(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.add_objectives_list_item, false));
    }

    public C31867DzZ(C32308EKv c32308EKv) {
        this.A00 = c32308EKv;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1303997032);
        int size = this.A01.size();
        C0f9.A0A(-596426457, A03);
        return size;
    }
}
