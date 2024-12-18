package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes11.dex */
public final class W4N {
    public EnumC68206VFy A00;
    public String A01;
    public String A02;
    public String A03;

    public final EnumC68206VFy A00() {
        EnumC68206VFy enumC68206VFy = this.A00;
        if (enumC68206VFy != null) {
            return enumC68206VFy;
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        throw C00O.createAndThrow();
    }

    public W4N(EnumC68206VFy enumC68206VFy, String str, String str2) {
        AbstractC167017dG.A1R(str, str2);
        this.A00 = enumC68206VFy;
        this.A02 = str;
        this.A01 = str2;
    }

    public W4N() {
    }
}
