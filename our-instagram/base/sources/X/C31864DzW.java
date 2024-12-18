package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.DzW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31864DzW extends AbstractC155316yK {
    public final FHY A00;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31926E1g(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.content_language_locale_item, false));
    }

    public C31864DzW(FHY fhy) {
        super(C31851DzJ.A00);
        this.A00 = fhy;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C31926E1g c31926E1g = (C31926E1g) c3oo;
        C14360o3.A0B(c31926E1g, 0);
        C15370ps A1F = AbstractC25225BEi.A1F();
        Object item = getItem(i);
        A1F.A00 = item;
        Context A05 = AbstractC31172DnG.A05(c31926E1g);
        String A0p = AbstractC166997dE.A0p(A05, ((C32110E9i) ((C51758Mth) item).A00).A01);
        String A0p2 = AbstractC166997dE.A0p(A05, ((C32110E9i) ((C51758Mth) A1F.A00).A00).A00);
        IgdsListCell igdsListCell = c31926E1g.A00;
        igdsListCell.A0I(A0p);
        igdsListCell.A0H(A0p2);
        igdsListCell.setTextCellType(EnumC53237Nga.A08);
        igdsListCell.setChecked(((C51758Mth) A1F.A00).A01);
        igdsListCell.A0E(new G9E(this, A1F, i));
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(-2121347804);
        long j = ((C32110E9i) ((C51758Mth) getItem(i)).A00).A00;
        C0f9.A0A(-1380351127, A03);
        return j;
    }
}
