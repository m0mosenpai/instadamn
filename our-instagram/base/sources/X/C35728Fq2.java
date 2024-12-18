package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.instagram.phonenumber.model.CountryCodeData;

/* renamed from: X.Fq2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35728Fq2 implements AdapterView.OnItemClickListener {
    public final int A00;
    public final Object A01;

    public C35728Fq2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (this.A00 != 0) {
            CountryCodeData countryCodeData = (CountryCodeData) adapterView.getItemAtPosition(i);
            EHO eho = (EHO) this.A01;
            GY8 gy8 = eho.A01;
            if (gy8 != null || (gy8 = (GY8) eho.getTargetFragment()) != null) {
                gy8.ESF(countryCodeData);
            }
            AbstractC12990ll abstractC12990ll = eho.A00;
            String A0g = AbstractC167007dF.A0g(eho.A03);
            String A01 = countryCodeData.A01();
            AbstractC167017dG.A1N(abstractC12990ll, A0g);
            double A012 = AbstractC31171DnF.A01();
            double A00 = AbstractC31171DnF.A00();
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "register_country_code_selected");
            AbstractC31179DnN.A16(A0f, A012, A00);
            AbstractC31172DnG.A1O(A0f);
            A0f.AAP(AbstractC111324zv.A00(3052), A0g);
            AbstractC31177DnL.A1G(A0f, "selected_country", A01, A00);
            AbstractC31175DnJ.A0y(A0f);
            AbstractC31171DnF.A1A(A0f, "phone");
            AbstractC35274Fh9.A08(A0f, abstractC12990ll);
            if (eho.isAdded()) {
                eho.A08();
                return;
            }
            return;
        }
        C34615FMy c34615FMy = (C34615FMy) this.A01;
        ListAdapter adapter = c34615FMy.A01.getAdapter();
        adapter.getClass();
        Object item = adapter.getItem(i);
        AbstractC13880nE.A0O(view);
        InterfaceC37138GXz interfaceC37138GXz = c34615FMy.A03;
        item.getClass();
        interfaceC37138GXz.CuM((InterfaceC37225Gaa) item);
    }
}
