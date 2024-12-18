package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.TEb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64443TEb implements InterfaceC65567Tmt {
    public final TEY A00;
    public final C62234S3f A01;
    public final C62238S3j A02;

    @Override // X.InterfaceC65567Tmt
    public final boolean AT0(Object obj, Object obj2) {
        return AbstractC25230BEn.A1Q(((RaB) obj).unknownFields.equals(((RaB) obj2).unknownFields) ? 1 : 0);
    }

    @Override // X.InterfaceC65567Tmt
    public final int CME(Object obj) {
        return ((RaB) obj).unknownFields.hashCode();
    }

    @Override // X.InterfaceC65567Tmt
    public final void Cmk(Object obj) {
        throw AbstractC166987dD.A15(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }

    public C64443TEb(TEY tey, C62234S3f c62234S3f, C62238S3j c62238S3j) {
        this.A02 = c62238S3j;
        this.A01 = c62234S3f;
        this.A00 = tey;
    }

    @Override // X.InterfaceC65567Tmt
    public final void CpL(Object obj, Object obj2) {
        SV3.A00(obj, obj2);
    }
}
