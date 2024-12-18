package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213969dv extends C2JS implements InterfaceC174197pB {
    @Override // X.InterfaceC174197pB
    public final ImmutableList C2r() {
        return getRequiredCompactedStringListField(4, "string_identifiers");
    }

    @Override // X.InterfaceC174197pB
    public final String AjY() {
        return A08("cache_key");
    }

    @Override // X.InterfaceC174197pB
    public final String getId() {
        return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    @Override // X.InterfaceC174197pB
    public final String getUri() {
        return A0C("uri");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC166987dD.A0k(new C4OM[]{AbstractC166997dE.A0V(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "cache_key"), AbstractC166987dD.A0i(c94754Oe, TraceFieldType.CompressionType), AbstractC166987dD.A0i(c94754Oe, "md5_hash"), AbstractC166987dD.A0i(C94754Oe.A01(), "string_identifiers"), AbstractC166987dD.A0i(c94754Oe, "uri")});
    }

    public C213969dv(int i) {
        super(i);
    }

    public C213969dv() {
        super(-1153896853);
    }
}
