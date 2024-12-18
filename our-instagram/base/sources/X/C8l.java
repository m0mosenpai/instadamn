package X;

/* loaded from: classes5.dex */
public enum C8l implements InterfaceC02530Ab {
    DISMISS_NUX("dismiss_nux"),
    DISMISS_CONSENT("dismiss_consent"),
    DENY_CONSENT("deny_consent"),
    CAMERA_ERROR("camera_error"),
    DISMISS_CAMERA("dismiss_camera"),
    DISMISS_UPLOADING("dismiss_uploading"),
    DISMISS_UPLOAD_SUCCESS("dismiss_upload_success"),
    DISMISS_UPLOAD_FAIL("dismiss_upload_fail"),
    DISMISS_PHOTO_PICKER("dismiss_photo_picker");

    public final String A00;

    C8l(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
