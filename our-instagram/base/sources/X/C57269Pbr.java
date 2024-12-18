package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.creation.sharesheet.update.trial.TrialUseCase;
import java.util.ArrayList;

/* renamed from: X.Pbr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57269Pbr extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57269Pbr(Object obj, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = z;
        this.A03 = z2;
        this.A05 = z3;
        this.A02 = z4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            TrialUseCase trialUseCase = (TrialUseCase) this.A01;
            C153936w2 c153936w2 = trialUseCase.A02;
            boolean z = this.A05;
            boolean A1X = AbstractC167007dF.A1X(C51754Mtd.A0M(trialUseCase), EnumC76383bi.A07);
            boolean z2 = this.A02;
            boolean z3 = this.A04;
            boolean z4 = this.A03;
            ArrayList A1E = AbstractC166987dD.A1E();
            if (z) {
                A1E.add(EnumC53365NjG.AUDIENCE_CONTROL);
            }
            if (A1X) {
                A1E.add(EnumC53365NjG.SUBSCRIBER_ONLY);
            }
            if (z2) {
                A1E.add(EnumC53365NjG.ADD_COLLABORATORS);
            }
            if (z3) {
                A1E.add(EnumC53365NjG.SHARE_TO_FEED);
            }
            if (z4) {
                A1E.add(EnumC53365NjG.SCHEDULE_CONTENT);
            }
            C153936w2.A04(C153936w2.A00(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, A1E), c153936w2, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "share_sheet", "tap_override_conflicting_settings", null, null);
            trialUseCase.A0A(true);
        } else {
            ((C27V) this.A01).A01.add(new C45401K8o(this.A04, this.A03, this.A05, this.A02));
        }
        return C0eB.A00;
    }
}
