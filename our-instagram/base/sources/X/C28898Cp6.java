package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cp6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28898Cp6 implements BBK {
    public final /* synthetic */ C23299AUk A00;
    public final /* synthetic */ C1Z9 A01;

    public C28898Cp6(C23299AUk c23299AUk, C1Z9 c1z9) {
        this.A01 = c1z9;
        this.A00 = c23299AUk;
    }

    @Override // X.BBK
    public final void CJi(Activity activity, String str) {
        UserSession userSession = this.A00.A00;
        C63397SjR c63397SjR = new C63397SjR(activity, userSession, C2Fb.A0M, str, false);
        c63397SjR.A0E(userSession.userId);
        c63397SjR.A0S = AbstractC111324zv.A00(3919);
        c63397SjR.A0A();
        C71313Hs A00 = C71313Hs.A00(userSession);
        C14360o3.A07(A00);
        View requireViewById = activity.requireViewById(R.id.arads_camera_container);
        C14360o3.A07(requireViewById);
        A00.A0B(requireViewById, new String[0]);
    }
}
