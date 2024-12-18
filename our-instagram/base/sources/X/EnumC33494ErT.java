package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.ErT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33494ErT implements InterfaceC02530Ab {
    PHOTO("photo"),
    REELS("reels"),
    USER(PublicKeyCredentialControllerUtility.JSON_KEY_USER),
    CAROUSEL("carousel"),
    META_AI_SUBSCRIPTION("meta_ai_subscription"),
    META_AI_REMINDER("meta_ai_reminder");

    public final String A00;

    EnumC33494ErT(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
