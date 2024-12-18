package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.7gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169087gh extends C0YY implements InterfaceC16660sJ {
    public static final C169087gh A00 = new C169087gh();

    public C169087gh() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.7jL, X.7jK] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC16820sZ interfaceC16820sZ;
        C168927gR c168927gR = (C168927gR) ((C170157iU) obj).A01;
        AbstractC50812Vc abstractC50812Vc = c168927gR.A02;
        if (abstractC50812Vc == null && ((interfaceC16820sZ = c168927gR.A04) == null || (abstractC50812Vc = (AbstractC50812Vc) interfaceC16820sZ.invoke()) == null)) {
            return null;
        }
        ?? obj2 = new Object();
        boolean z = c168927gR.A05;
        if (z) {
            obj2.A00(Boolean.valueOf(z), "is_full_span");
        }
        obj2.A00(c168927gR.A03, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        float f = c168927gR.A01;
        if (0.0f <= f && f <= 100.0f) {
            obj2.A00(Float.valueOf(f), "parent_width_percent");
        }
        float f2 = c168927gR.A00;
        if (0.0f <= f2 && f2 <= 100.0f) {
            obj2.A00(Float.valueOf(f2), "parent_height_percent");
        }
        obj2.A00 = abstractC50812Vc;
        return new C170697jM(obj2);
    }
}
