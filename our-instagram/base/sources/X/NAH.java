package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes9.dex */
public final class NAH extends NA7 {
    public final /* synthetic */ C52685NSq A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NAH(C1P1 c1p1, C52685NSq c52685NSq) {
        super(c1p1);
        this.A00 = c52685NSq;
    }

    @Override // X.NA7, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C2JS requiredTreeField;
        C2JS reinterpretRequired;
        C2JS requiredTreeField2;
        int A03 = C0f9.A03(-358997547);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A032 = C0f9.A03(963799422);
        C14360o3.A0B(anonymousClass435, 0);
        super.onSuccess(anonymousClass435);
        C2JS c2js = (C2JS) anonymousClass435.A01;
        if (c2js != null && (requiredTreeField = c2js.getRequiredTreeField(0, "xdt_users__info(entry_point:$entry_point,from_module:$from_module,user_id:$user_id)", C60171Qv7.class, 958712321)) != null && (reinterpretRequired = requiredTreeField.reinterpretRequired(0, C60181QvH.class, -294452885)) != null && (requiredTreeField2 = reinterpretRequired.getRequiredTreeField(0, PublicKeyCredentialControllerUtility.JSON_KEY_USER, C60180QvG.class, -1102752027)) != null) {
            C52685NSq c52685NSq = this.A00;
            String A0D = requiredTreeField2.A0D("strong_id__");
            if (A0D != null && requiredTreeField2.hasFieldValue("account_type")) {
                ((AnonymousClass706) c52685NSq).A00.EPB(C16Z.A00(requiredTreeField2.getCoercedIntField(0, "account_type")), A0D);
            }
        }
        C0f9.A0A(-783898750, A032);
        C0f9.A0A(-686889912, A03);
    }
}
