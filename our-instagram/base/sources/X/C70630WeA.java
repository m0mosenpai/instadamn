package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.business.promote.model.PromoteData;

/* renamed from: X.WeA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70630WeA implements XLK {
    public final /* synthetic */ PromoteActivity A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    @Override // X.XLK
    public final void DoL(LinkingAuthState linkingAuthState) {
        C14360o3.A0B(linkingAuthState, 0);
        PromoteData promoteData = this.A00.A00;
        if (promoteData == null) {
            C14360o3.A0F("promoteData");
            throw C00O.createAndThrow();
        }
        promoteData.A0n = linkingAuthState;
    }

    @Override // X.XCJ
    public final void DqC(String str) {
        C14360o3.A0B(str, 0);
        C70816WhZ.A01(C67908V1x.A00, VRD.A00(this.A00.getSession()), "fetch_buat_success");
        this.A01.invoke(str);
    }

    public C70630WeA(PromoteActivity promoteActivity, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = promoteActivity;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.XCJ
    public final void DFf() {
        PromoteActivity promoteActivity = this.A00;
        PromoteActivity.A03(promoteActivity);
        AbstractC65702TsY.A0q();
        ErrorIdentifier errorIdentifier = ErrorIdentifier.A04;
        Bundle bundle = new Bundle();
        bundle.putString("error_title", null);
        bundle.putString(TraceFieldType.Error, null);
        bundle.putString("error_type", errorIdentifier.toString());
        bundle.putString("ad_account_id", null);
        V0Y v0y = new V0Y();
        v0y.setArguments(bundle);
        C140966Yy A0C = AbstractC31180DnO.A0C(promoteActivity, promoteActivity.getSession());
        A0C.A0D(v0y);
        A0C.A04();
    }
}
