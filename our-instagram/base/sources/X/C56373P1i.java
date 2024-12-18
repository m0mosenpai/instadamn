package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.P1i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56373P1i implements InterfaceC173987oq {
    public final /* synthetic */ C59228Qb0 A00;
    public final /* synthetic */ boolean A01;

    public C56373P1i(C59228Qb0 c59228Qb0, boolean z) {
        this.A00 = c59228Qb0;
        this.A01 = z;
    }

    @Override // X.InterfaceC173987oq
    public final EnumC53307Nhj AY3() {
        if (this.A01) {
            return EnumC53307Nhj.PRIVATE;
        }
        return EnumC53307Nhj.PUBLIC;
    }

    @Override // X.InterfaceC173987oq
    public final String getId() {
        return this.A00.A05(C59227Qaz.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 857315551).A08("fbid_v2");
    }

    @Override // X.InterfaceC173987oq
    public final String getProfilePicUrl() {
        return this.A00.A05(C59227Qaz.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 857315551).A09("profile_pic_url");
    }

    @Override // X.InterfaceC173987oq
    public final String getUsername() {
        return this.A00.A05(C59227Qaz.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 857315551).A0A(AbstractC50635MWw.A00());
    }
}
