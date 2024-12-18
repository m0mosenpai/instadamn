package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.ArrayList;

/* renamed from: X.MiU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51125MiU extends C2UU {
    public final View.OnClickListener A00;
    public final C51008MgF A01;

    public C51125MiU(View.OnClickListener onClickListener, C51008MgF c51008MgF) {
        C14360o3.A0B(c51008MgF, 1);
        this.A01 = c51008MgF;
        this.A00 = onClickListener;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C51252Mkb(new C66359UCf(AbstractC166997dE.A0L(viewGroup)));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        String str2;
        C51252Mkb c51252Mkb = (C51252Mkb) c3oo;
        C14360o3.A0B(c51252Mkb, 0);
        C66359UCf c66359UCf = c51252Mkb.A00;
        if (c66359UCf != null) {
            C51008MgF c51008MgF = this.A01;
            ArrayList arrayList = c51008MgF.A0D;
            LeadForm leadForm = (LeadForm) AbstractC001800i.A0O(arrayList, i);
            if (leadForm != null && (str2 = leadForm.A02) != null) {
                c66359UCf.setPrimaryText(str2);
            }
            c66359UCf.setActionLabel(AbstractC166997dE.A0p(AbstractC31172DnG.A05(c51252Mkb), 2131964880), c51008MgF.A08, this.A00);
            ViewOnClickListenerC55458OkC.A01(c66359UCf, this, i, 6);
            LeadForm leadForm2 = c51008MgF.A01;
            String str3 = null;
            if (leadForm2 != null) {
                str = leadForm2.A03;
            } else {
                str = null;
            }
            LeadForm leadForm3 = (LeadForm) AbstractC001800i.A0O(arrayList, i);
            if (leadForm3 != null) {
                str3 = leadForm3.A03;
            }
            c66359UCf.setChecked(C14360o3.A0K(str, str3));
            c66359UCf.A03(c66359UCf.isChecked());
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(846468024);
        int size = this.A01.A0D.size();
        C0f9.A0A(-162454882, A03);
        return size;
    }
}
