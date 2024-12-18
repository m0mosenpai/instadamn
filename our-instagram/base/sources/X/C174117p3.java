package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.7p3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174117p3 extends AbstractC907342m implements InterfaceC174127p4 {
    @Override // X.InterfaceC174127p4
    public final String AjY() {
        return A05("cache_key");
    }

    @Override // X.InterfaceC174127p4
    public final EnumC174137p5 Aq6() {
        return (EnumC174137p5) A04(TraceFieldType.CompressionType, EnumC174137p5.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.InterfaceC174127p4
    public final ImmutableList B0T() {
        return A02("effect_file_contents", C174187pA.class);
    }

    @Override // X.InterfaceC174127p4
    public final int B6J() {
        return this.A00.optInt("filesize_bytes");
    }

    @Override // X.InterfaceC174127p4
    public final boolean BJi() {
        return A06("is_encrypted");
    }

    @Override // X.InterfaceC174127p4
    public final String BQJ() {
        return A05("md5_hash");
    }

    @Override // X.InterfaceC174127p4
    public final int CCM() {
        return this.A00.optInt("uncompressed_filesize_bytes");
    }

    @Override // X.InterfaceC174127p4
    public final String getId() {
        return A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    @Override // X.InterfaceC174127p4
    public final String getUri() {
        return A05("uri");
    }

    public C174117p3(JSONObject jSONObject) {
        super(jSONObject);
    }
}
