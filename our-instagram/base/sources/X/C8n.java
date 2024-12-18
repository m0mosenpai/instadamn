package X;

/* loaded from: classes5.dex */
public enum C8n implements InterfaceC02530Ab {
    ADD_SCHOOL("add_school"),
    CONFIRM_ENROLLMENT("confirm_enrollment"),
    CONFIRM_SCHOOL("confirm_school"),
    DIRECTORY("directory"),
    EDIT_BANNER("edit_banner"),
    /* JADX INFO: Fake field, exist only in values array */
    EMAIL_SCREEN("email_screen"),
    GRADUATION_DATE("graduation_date"),
    MULTI_SCHOOL("multi_school"),
    RELIABILITY_PAGE_GENERAL("reliability_page_general"),
    REMOVE_SCHOOL("remove_school"),
    SCHOOL_SETTINGS("school_settings"),
    SUCCESS_BOTTOMSHEET("success_bottomsheet"),
    SWITCH_SCHOOL("switch_school"),
    THREE_DOT_SCHOOLS_BOTTOMSHEET("three_dot_schools_bottomsheet"),
    UPDATE_GRADUATION("update_graduation");

    public final String A00;

    C8n(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
