package X;

import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.MiX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51128MiX extends C2UU {
    public List A00 = C16930sl.A00;
    public final InterfaceC16660sJ A01;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C51722Msz c51722Msz = (C51722Msz) this.A00.get(i);
        String str = c51722Msz.A02;
        boolean z = c51722Msz.A03;
        boolean z2 = c51722Msz.A04;
        InterfaceC16660sJ interfaceC16660sJ = this.A01;
        AbstractC167007dF.A1F(str, 0, interfaceC16660sJ);
        IgdsListCell igdsListCell = ((C51261Mkk) c3oo).A00;
        igdsListCell.A04();
        igdsListCell.A0I(str);
        igdsListCell.A0G(EnumC53237Nga.A03, true);
        igdsListCell.setEnabled(true);
        igdsListCell.setChecked(z);
        igdsListCell.setEnabled(z2);
        igdsListCell.A0D(new C70266WOu(i, 1, interfaceC16660sJ));
        AbstractC50522MSa.A0y(igdsListCell);
    }

    public C51128MiX(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-2072347969);
        int size = this.A00.size();
        C0f9.A0A(473399668, A03);
        return size;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C51261Mkk(AbstractC31174DnI.A0Z(AbstractC31176DnK.A04(viewGroup)));
    }
}
