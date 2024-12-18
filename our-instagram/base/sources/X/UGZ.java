package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.business.promote.model.AudienceInterest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class UGZ extends C2UU {
    public List A00;
    public final XA9 A01;

    public UGZ(XA9 xa9) {
        C14360o3.A0B(xa9, 1);
        this.A01 = xa9;
        this.A00 = new ArrayList();
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UIY(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.interest_typeahead_item_view, false), this.A01);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        UIY uiy = (UIY) c3oo;
        C14360o3.A0B(uiy, 0);
        AudienceInterest audienceInterest = (AudienceInterest) this.A00.get(i);
        C14360o3.A0B(audienceInterest, 0);
        uiy.A00.setText(audienceInterest.A01());
        WNP.A00(uiy.itemView, 2, audienceInterest, uiy);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1011513242);
        int size = this.A00.size();
        C0f9.A0A(730684203, A03);
        return size;
    }
}
