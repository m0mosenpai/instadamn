package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

/* loaded from: classes11.dex */
public final class UGb extends C2UU {
    public final XAC A00;
    public final PromoteData A01;
    public final PromoteState A02;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.3OO, X.UHl] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.promote_create_audience_selected_location, false);
        XAC xac = this.A00;
        AbstractC167017dG.A1P(A0D, xac);
        ?? c3oo = new C3OO(A0D);
        c3oo.A01 = xac;
        c3oo.A00 = AbstractC167007dF.A0N(A0D, R.id.selected_location_name);
        return c3oo;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        UHl uHl = (UHl) c3oo;
        C14360o3.A0B(uHl, 0);
        AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) this.A01.A0o.A05.get(i);
        C14360o3.A0B(audienceGeoLocation, 0);
        uHl.A00.setText(audienceGeoLocation.A05);
        WNP.A00(uHl.itemView, 9, audienceGeoLocation, uHl);
    }

    public UGb(XAC xac, PromoteData promoteData, PromoteState promoteState) {
        AbstractC167027dH.A13(promoteData, promoteState, xac);
        this.A01 = promoteData;
        this.A02 = promoteState;
        this.A00 = xac;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(997707517);
        int size = this.A01.A0o.A05.size();
        C0f9.A0A(-141023191, A03);
        return size;
    }
}
