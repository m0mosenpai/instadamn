package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import org.json.JSONObject;

/* renamed from: X.UNf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66569UNf extends AbstractC907342m implements MSA {
    @Override // X.MSA
    public final String Aqq() {
        return A05("content");
    }

    @Override // X.MSA
    public final EnumC68192VFk CBe() {
        return (EnumC68192VFk) A04(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC68192VFk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.MSA
    public final String getTitle() {
        return A05(DialogModule.KEY_TITLE);
    }

    @Override // X.MSA
    public final String getUrl() {
        return A05("url");
    }

    public C66569UNf(JSONObject jSONObject) {
        super(jSONObject);
    }
}
