package X;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import com.facebook.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PCB implements InterfaceC57985PnV {
    public P3A A00;
    public final Context A01;
    public final View A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51891MwZ c51891MwZ = (C51891MwZ) interfaceC57856PlM;
        C14360o3.A0B(c51891MwZ, 0);
        MSW.A0D(this.A06).setText(c51891MwZ.A00);
        MSW.A0D(this.A07).setText(c51891MwZ.A01);
        List list = c51891MwZ.A02;
        if (list != null) {
            ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0E.A00(new C45181JzN(AbstractC166987dD.A1B(it)));
            }
            ((C66362zD) this.A08.getValue()).A05(A0E);
        }
        InterfaceC09390do interfaceC09390do = this.A09;
        int count = ((ArrayAdapter) interfaceC09390do.getValue()).getCount();
        List list2 = c51891MwZ.A03;
        if (count != list2.size()) {
            ((ArrayAdapter) interfaceC09390do.getValue()).clear();
            ((ArrayAdapter) interfaceC09390do.getValue()).addAll(list2);
            C0fA.A00((BaseAdapter) interfaceC09390do.getValue(), -1620706576);
        }
        AbstractC43593JPy.A1W(this.A04, 0);
    }

    public PCB(View view) {
        this.A02 = view;
        this.A01 = AbstractC166997dE.A0L(view);
        InterfaceC09390do A00 = C57520Pfu.A00(this, 20);
        this.A05 = A00;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new BFI(R.id.debug_sheet_text_content, 28, A00, null));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new BFI(R.id.debug_sheet_media_stats_call_level_text_view, 28, A00, null));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new BFI(R.id.debug_sheet_media_stats_search_view, 28, A00, new C57753Pjg(this, 20)));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new BFI(R.id.debug_sheet_media_stats_stream_level_recycler_view, 29, A00, new C57753Pjg(this, 22)));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new BFI(R.id.debug_sheet_media_stats_spinner, 29, A00, new C57753Pjg(this, 23)));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new BFI(R.id.bottom_sheet_contents, 27, view, null));
    }
}
