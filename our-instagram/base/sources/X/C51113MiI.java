package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.MiI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51113MiI extends AbstractC155316yK {
    public final InterfaceC16660sJ A00;
    public final boolean A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Integer num = C05F.A00(3)[i];
        C14360o3.A0B(num, 1);
        IgdsListCell A0Z = AbstractC31174DnI.A0Z(AbstractC166997dE.A0L(viewGroup));
        A0Z.setTextCellType(EnumC53237Nga.A09);
        int intValue = num.intValue();
        if (intValue != 2) {
            if (intValue != 0) {
                if (intValue == 1) {
                    AbstractC51253Mkc abstractC51253Mkc = new AbstractC51253Mkc(A0Z);
                    A0Z.A0I(AbstractC166997dE.A0p(A0Z.getContext(), 2131964882));
                    return abstractC51253Mkc;
                }
                throw B4Z.A00();
            }
            AbstractC51253Mkc abstractC51253Mkc2 = new AbstractC51253Mkc(A0Z);
            Context context = A0Z.getContext();
            A0Z.A0I(AbstractC166997dE.A0p(context, 2131964881));
            A0Z.setBackgroundResource(R.drawable.lead_gen_item_row_with_top_border);
            A0Z.A08(R.style.igds_emphasized_label, AbstractC53242c7.A07(context));
            return abstractC51253Mkc2;
        }
        return new AbstractC51253Mkc(A0Z);
    }

    public C51113MiI(InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(O0D.A00);
        this.A01 = z;
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String A04;
        AbstractC51253Mkc abstractC51253Mkc = (AbstractC51253Mkc) c3oo;
        C14360o3.A0B(abstractC51253Mkc, 0);
        Object item = getItem(i);
        C14360o3.A07(item);
        C51761Mtk c51761Mtk = (C51761Mtk) item;
        boolean z = this.A01;
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (!(abstractC51253Mkc instanceof C52556NNc) && (abstractC51253Mkc instanceof C52555NNb)) {
            AbstractC167017dG.A1O(c51761Mtk, interfaceC16660sJ);
            IgdsListCell igdsListCell = abstractC51253Mkc.A00;
            if (z) {
                CountryCodeData countryCodeData = (CountryCodeData) c51761Mtk.A00;
                if (countryCodeData != null) {
                    A04 = countryCodeData.A01();
                } else {
                    A04 = "";
                }
            } else {
                A04 = c51761Mtk.A04();
            }
            igdsListCell.A0I(A04);
            igdsListCell.A0C(ViewOnClickListenerC55465OkK.A00(c51761Mtk, interfaceC16660sJ, 41));
        }
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1117479523);
        int A0H = AbstractC166987dD.A0H(((C51761Mtk) getItem(i)).A02);
        C0f9.A0A(147996710, A03);
        return A0H;
    }
}
