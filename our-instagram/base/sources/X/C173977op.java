package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.7op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173977op extends C2JS implements InterfaceC173987oq {
    @Override // X.InterfaceC173987oq
    public final String getId() {
        return getOptionalStringField(0, "strong_id__");
    }

    @Override // X.InterfaceC173987oq
    public final String getProfilePicUrl() {
        return getOptionalStringField(2, "profile_pic_url");
    }

    @Override // X.InterfaceC173987oq
    public final String getUsername() {
        return getOptionalStringField(3, AbstractC50635MWw.A02(52, 8, 97));
    }

    @Override // X.InterfaceC173987oq
    public final EnumC53307Nhj AY3() {
        return (EnumC53307Nhj) getOptionalEnumField(1, "account_privacy", EnumC53307Nhj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(c94754Oe, "account_privacy"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC50635MWw.A02(52, 8, 97)), new C4OW(C95124Py.A00, "auto_xposting_enabled")});
    }

    public C173977op(int i) {
        super(i);
    }

    public C173977op() {
        super(-1847786944);
    }
}
