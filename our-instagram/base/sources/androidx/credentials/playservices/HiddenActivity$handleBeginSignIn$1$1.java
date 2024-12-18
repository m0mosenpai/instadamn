package androidx.credentials.playservices;

import X.AbstractC166997dE;
import X.C0YY;
import X.C0eB;
import X.C14360o3;
import X.InterfaceC16660sJ;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.BeginSignInResult;

/* loaded from: classes10.dex */
public final class HiddenActivity$handleBeginSignIn$1$1 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int $requestCode;
    public final /* synthetic */ HiddenActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiddenActivity$handleBeginSignIn$1$1(HiddenActivity hiddenActivity, int i) {
        super(1);
        this.this$0 = hiddenActivity;
        this.$requestCode = i;
    }

    public final void invoke(BeginSignInResult beginSignInResult) {
        try {
            HiddenActivity hiddenActivity = this.this$0;
            hiddenActivity.mWaitingForActivityResult = true;
            hiddenActivity.startIntentSenderForResult(beginSignInResult.A00.getIntentSender(), this.$requestCode, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            HiddenActivity hiddenActivity2 = this.this$0;
            ResultReceiver resultReceiver = hiddenActivity2.resultReceiver;
            C14360o3.A0A(resultReceiver);
            hiddenActivity2.setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, AbstractC166997dE.A0y("During begin sign in, one tap ui intent sender failure: ", e));
        }
    }

    @Override // X.InterfaceC16660sJ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BeginSignInResult) obj);
        return C0eB.A00;
    }
}
