package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import java.util.ArrayList;

/* renamed from: X.V6e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68012V6e extends AbstractRunnableC14200nk {
    public final /* synthetic */ C68853Vd9 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    @Override // java.lang.Runnable
    public final void run() {
        C68853Vd9 c68853Vd9 = this.A00;
        String str = this.A01;
        boolean z = this.A02;
        C2JM c2jm = new C2JM();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(c2jm, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str)), "IGVideoLoggingSessionDebugging", c2jm.getParamsCopy(), new C2JM().getParamsCopy(), C67544Uni.class, false, null, 0, null, "fetch__XFBVideoPlaySessionObjectFetch", new ArrayList());
        c68853Vd9.A00.ATV(C70439WVr.A00, new WW1(str, z), pandoGraphQLRequest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68012V6e(C68853Vd9 c68853Vd9, String str, boolean z) {
        super(2056094530, 3, false, false);
        this.A00 = c68853Vd9;
        this.A01 = str;
        this.A02 = z;
    }
}
