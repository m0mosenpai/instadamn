package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.7pA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174187pA extends AbstractC907342m implements InterfaceC174197pB {
    @Override // X.InterfaceC174197pB
    public final String AjY() {
        return A05("cache_key");
    }

    @Override // X.InterfaceC174197pB
    public final ImmutableList C2r() {
        return A01("string_identifiers");
    }

    @Override // X.InterfaceC174197pB
    public final String getId() {
        return A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    @Override // X.InterfaceC174197pB
    public final String getUri() {
        return A05("uri");
    }

    public C174187pA(JSONObject jSONObject) {
        super(jSONObject);
    }
}
