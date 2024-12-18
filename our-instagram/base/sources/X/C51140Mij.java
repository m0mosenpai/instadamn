package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.leadgen.core.api.LeadForm;
import java.util.List;

/* renamed from: X.Mij, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51140Mij extends C2UU {
    public int A00;
    public final FragmentActivity A01;
    public final P4U A02;
    public final C70399WUb A03;
    public final PromoteData A04;
    public final Long A05;
    public final List A06;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C51232MkH(new C66359UCf(AbstractC166997dE.A0L(viewGroup)));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51232MkH c51232MkH = (C51232MkH) c3oo;
        C14360o3.A0B(c51232MkH, 0);
        C66359UCf c66359UCf = c51232MkH.A00;
        List list = this.A06;
        c66359UCf.setPrimaryText(((LeadForm) list.get(i)).A02);
        LeadForm leadForm = (LeadForm) list.get(i);
        FragmentActivity fragmentActivity = this.A01;
        c66359UCf.setSecondaryText(OSH.A00(fragmentActivity, leadForm));
        c66359UCf.setTag(((LeadForm) list.get(i)).A03);
        c66359UCf.setActionLabel(AbstractC166997dE.A0p(fragmentActivity, 2131970590), this.A04.A0y, new ViewOnClickListenerC55464OkJ(20, this, c51232MkH));
        ViewOnClickListenerC55458OkC.A01(c66359UCf, this, i, 0);
        c66359UCf.setChecked(AbstractC167007dF.A1P(this.A00, i));
        c66359UCf.A03(false);
        c66359UCf.A04(false);
    }

    public C51140Mij(FragmentActivity fragmentActivity, P4U p4u, C70399WUb c70399WUb, PromoteData promoteData, Long l, List list) {
        String str;
        this.A06 = list;
        this.A04 = promoteData;
        this.A03 = c70399WUb;
        this.A02 = p4u;
        this.A05 = l;
        this.A01 = fragmentActivity;
        LeadForm leadForm = promoteData.A16;
        if (leadForm != null) {
            str = leadForm.A03;
        } else {
            str = null;
        }
        this.A00 = C14360o3.A0K(str, ((LeadForm) list.get(0)).A03) ? 0 : -1;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(462626984);
        int size = this.A06.size();
        C0f9.A0A(-2041533499, A03);
        return size;
    }
}
