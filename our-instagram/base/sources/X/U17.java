package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes11.dex */
public final class U17 extends C0YY implements InterfaceC16620sF {
    public static final U17 A00 = new U17();

    public U17() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass182 anonymousClass182 = (AnonymousClass182) obj;
        C66129U0n c66129U0n = (C66129U0n) obj2;
        AbstractC167017dG.A1N(anonymousClass182, c66129U0n);
        anonymousClass182.A0d();
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c66129U0n.A00);
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c66129U0n.A01);
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c66129U0n.A02);
        anonymousClass182.A0a();
        return C0eB.A00;
    }
}
