package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes11.dex */
public final class V21 extends AbstractC67958V3x {
    public final /* synthetic */ V9j A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC71543Iw A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V21(C70399WUb c70399WUb, V9j v9j, String str, String str2, InterfaceC71543Iw interfaceC71543Iw) {
        super(c70399WUb, str2);
        this.A00 = v9j;
        this.A01 = str;
        this.A02 = interfaceC71543Iw;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1289406876);
        C38852H9a c38852H9a = (C38852H9a) obj;
        int A0N = AbstractC167017dG.A0N(c38852H9a, 6618013);
        A01(c38852H9a);
        UPP upp = c38852H9a.A08;
        if (upp == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
            throw C00O.createAndThrow();
        }
        this.A00.A00.put(this.A01, upp);
        AbstractC129685tX.A00(upp, this.A02);
        C0f9.A0A(-230660728, A0N);
        C0f9.A0A(-1398358110, A03);
    }
}
