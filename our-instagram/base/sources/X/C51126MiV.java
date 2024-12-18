package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.ArrayList;

/* renamed from: X.MiV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51126MiV extends C2UU {
    public final View.OnClickListener A00;
    public final C51009MgG A01;

    public C51126MiV(View.OnClickListener onClickListener, C51009MgG c51009MgG) {
        C14360o3.A0B(c51009MgG, 1);
        this.A01 = c51009MgG;
        this.A00 = onClickListener;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C51254Mkd(new C66359UCf(AbstractC166997dE.A0L(viewGroup)));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        String str2;
        C51254Mkd c51254Mkd = (C51254Mkd) c3oo;
        C14360o3.A0B(c51254Mkd, 0);
        C66359UCf c66359UCf = c51254Mkd.A00;
        if (c66359UCf != null) {
            C51009MgG c51009MgG = this.A01;
            ArrayList arrayList = c51009MgG.A0D;
            LeadForm leadForm = (LeadForm) AbstractC001800i.A0O(arrayList, i);
            if (leadForm != null && (str2 = leadForm.A02) != null) {
                c66359UCf.setPrimaryText(str2);
            }
            c66359UCf.setActionLabel(AbstractC166997dE.A0p(AbstractC31172DnG.A05(c51254Mkd), 2131964880), c51009MgG.A07, this.A00);
            ViewOnClickListenerC55458OkC.A01(c66359UCf, this, i, 8);
            LeadForm leadForm2 = c51009MgG.A01;
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
        int A03 = C0f9.A03(790372058);
        int size = this.A01.A0D.size();
        C0f9.A0A(-2001603770, A03);
        return size;
    }
}
