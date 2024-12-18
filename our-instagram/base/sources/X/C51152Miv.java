package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.Miv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51152Miv extends C2UU {
    public final Activity A00;
    public final UserSession A01;
    public final List A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16660sJ A04;

    public C51152Miv(Activity activity, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        C14360o3.A0B(userSession, 4);
        this.A00 = activity;
        this.A03 = interfaceC16660sJ;
        this.A04 = interfaceC16660sJ2;
        this.A01 = userSession;
        this.A02 = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                C14360o3.A0A(A0E);
                InterfaceC16660sJ interfaceC16660sJ = this.A03;
                AbstractC167007dF.A1D(A0E, 0, interfaceC16660sJ);
                return new NJF(AbstractC25227BEk.A0D(A0E, viewGroup, R.layout.layout_share_content_funding_item, false), interfaceC16660sJ);
            }
            throw AbstractC25230BEn.A0n("unknown type: ", i);
        }
        C14360o3.A0A(A0E);
        Activity activity = this.A00;
        InterfaceC16660sJ interfaceC16660sJ2 = this.A03;
        InterfaceC16660sJ interfaceC16660sJ3 = this.A04;
        UserSession userSession = this.A01;
        AbstractC25233BEq.A0w(0, A0E, interfaceC16660sJ2, interfaceC16660sJ3);
        return new NJG(activity, AbstractC25227BEk.A0D(A0E, viewGroup, R.layout.layout_share_content_funding_item, false), userSession, interfaceC16660sJ2, interfaceC16660sJ3);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        AbstractC51210Mjv abstractC51210Mjv = (AbstractC51210Mjv) c3oo;
        C14360o3.A0B(abstractC51210Mjv, 0);
        C51711Msg c51711Msg = (C51711Msg) this.A02.get(i);
        if (abstractC51210Mjv instanceof NJG) {
            NJG njg = (NJG) abstractC51210Mjv;
            C14360o3.A0B(c51711Msg, 0);
            IgdsListCell igdsListCell = njg.A01;
            if (igdsListCell != null) {
                igdsListCell.A0I(BHX.A00(AbstractC37301Gc2.A03(njg), c51711Msg.A03));
                igdsListCell.A0H(BHX.A00(AbstractC37301Gc2.A03(njg), c51711Msg.A02));
                igdsListCell.setChecked(c51711Msg.A00);
                igdsListCell.setEnabled(c51711Msg.A04);
                igdsListCell.A0D(new C55518OlC(3, c51711Msg, njg));
            }
            if (c51711Msg.A05) {
                C5SU A0U = AbstractC167007dF.A0U(njg.A00, 2131953968);
                A0U.A03(AbstractC31171DnF.A06(njg));
                A0U.A02();
                A0U.A0A = true;
                A0U.A04 = new NMB(1, c51711Msg, njg);
                njg.itemView.postDelayed(new RunnableC56881PMa(A0U.A00()), 500L);
                return;
            }
            return;
        }
        NJF njf = (NJF) abstractC51210Mjv;
        C14360o3.A0B(c51711Msg, 0);
        IgdsListCell igdsListCell2 = njf.A00;
        if (igdsListCell2 == null) {
            return;
        }
        igdsListCell2.setChecked(c51711Msg.A00);
        igdsListCell2.A0D(new C55518OlC(2, c51711Msg, njf));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(526879990);
        int size = this.A02.size();
        C0f9.A0A(-1892340313, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-855427151);
        int i2 = 1;
        if (i != this.A02.size() - 1) {
            i2 = 0;
        }
        C0f9.A0A(-984411812, A03);
        return i2;
    }
}
