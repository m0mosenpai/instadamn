package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.Ure, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67560Ure extends C2JS implements MSA {
    @Override // X.MSA
    public final String Aqq() {
        return A09("content");
    }

    @Override // X.MSA
    public final EnumC68192VFk CBe() {
        return (EnumC68192VFk) getOptionalEnumField(0, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC68192VFk.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.MSA
    public final String getTitle() {
        return A08(DialogModule.KEY_TITLE);
    }

    @Override // X.MSA
    public final String getUrl() {
        return A0A("url");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC58320PtC.A0U(c94754Oe, AbstractC58319PtB.A0J(c94754Oe), AbstractC58319PtB.A0L(c94754Oe), new C4OW(c94754Oe, "content"), "url");
    }

    public C67560Ure(int i) {
        super(i);
    }

    public C67560Ure() {
        super(-274625485);
    }
}
