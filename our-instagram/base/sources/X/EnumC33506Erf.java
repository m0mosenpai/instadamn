package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Erf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC33506Erf implements InterfaceC02530Ab {
    GALLERY("gallery"),
    PROMPT("prompt"),
    RESPONSE(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE),
    NUX("nux"),
    TOOLTIP("tooltip"),
    ADMIN_TEXT("admin_text"),
    EDIT_FLOW("edit_flow"),
    /* JADX INFO: Fake field, exist only in values array */
    ENTRY_POINT(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY),
    XMA("xma"),
    STICKER_TAB("sticker_tab"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSEND_DIALOG("unsend_dialog"),
    /* JADX INFO: Fake field, exist only in values array */
    FREQUENCY_PICKER("frequency_picker"),
    PROMPT_CREATION("prompt_creation"),
    FREQUENCY_TOGGLE("frequency_toggle"),
    STOP_PROMPT_DIALOG("stop_prompt_dialog");

    public final String A00;

    EnumC33506Erf(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
