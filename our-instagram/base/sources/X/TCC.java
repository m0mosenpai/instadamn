package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class TCC implements InterfaceC65668Tqy {
    public static final TCC A00 = new Object();
    public static final C63200Sf3 A01;
    public static final C63200Sf3 A02;
    public static final C63200Sf3 A03;
    public static final C63200Sf3 A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TCC, java.lang.Object] */
    static {
        C63407Sjf A032 = C63407Sjf.A03(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        EnumC61071Rel enumC61071Rel = EnumC61071Rel.DEFAULT;
        A01 = C63407Sjf.A04(enumC61071Rel, A032);
        A02 = C63407Sjf.A06(enumC61071Rel, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A03 = C63407Sjf.A07(enumC61071Rel, "version");
        A04 = C63407Sjf.A08(enumC61071Rel, "featureLevel");
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        throw null;
    }
}
