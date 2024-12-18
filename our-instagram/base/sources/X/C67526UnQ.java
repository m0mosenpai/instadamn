package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.UnQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67526UnQ extends C2JS implements C2JT {
    public final EnumC68188VFg A0E() {
        return (EnumC68188VFg) getOptionalEnumField(0, "notification_source", EnumC68188VFg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "notification_source"), new C4OW(c94754Oe, "notification_identifier"), new C4OW(c94754Oe, "priority"), new C4OW(c94754Oe, "header_content"), new C4OW(c94754Oe, "body_content"), new C4OW(c94754Oe, "button_content"), new C4OK(C66704UYo.class, "action", -720091827), new C4OK(C66705UYp.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, 944074579)});
    }

    public C67526UnQ(int i) {
        super(i);
    }

    public C67526UnQ() {
        super(-476136082);
    }
}
