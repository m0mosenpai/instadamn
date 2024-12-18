package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.5lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125505lw extends C2JS implements C2JT {
    public final C58568Pxk A0E() {
        return (C58568Pxk) getOptionalTreeField(2, "ig_user_avatar_info", C58568Pxk.class, -1568815585);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(c94754Oe, "config_hash"), new C4OK(C58568Pxk.class, "ig_user_avatar_info", -1568815585)});
    }

    public C125505lw(int i) {
        super(i);
    }

    public C125505lw() {
        super(-417973107);
    }
}
