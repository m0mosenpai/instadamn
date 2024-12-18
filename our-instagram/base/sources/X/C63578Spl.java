package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Spl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63578Spl implements C1N8 {
    public static final C63578Spl A00 = new C63578Spl();

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C2JS c2js;
        C2JS A03;
        C2JS A01;
        String A07;
        if (!(obj instanceof C60475R0b) || (c2js = (C2JS) obj) == null || (A03 = c2js.A03(C59070QWc.class, "shipping_address", 482258055)) == null || (A01 = A03.A01(C66718UZc.class, -1235561061)) == null || (A07 = A01.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) == null) {
            return null;
        }
        return AbstractC25228BEl.A13(A07);
    }
}
