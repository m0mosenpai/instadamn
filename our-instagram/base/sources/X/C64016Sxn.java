package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Sxn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64016Sxn implements InterfaceC48192Ji {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;

    public C64016Sxn(Activity activity, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS A0k;
        C2JS optionalTreeField;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (optionalTreeField = A0k.getOptionalTreeField(0, "xig_teen_bio_education_qp", C59761Qmb.class, -1369013323)) != null && optionalTreeField.hasFieldValue("has_seen_qp") && optionalTreeField.getCoercedBooleanField(0, "has_seen_qp")) {
            UserSession userSession = this.A01;
            Activity activity = this.A00;
            C1VN c1vn = C1VN.A00;
            if (c1vn != null) {
                c1vn.A02(userSession, activity, "773795347802528");
            }
        }
    }
}
