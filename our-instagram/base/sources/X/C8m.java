package X;

/* loaded from: classes5.dex */
public enum C8m implements InterfaceC02530Ab {
    PRESENT_PROD_LOCKOUT_TOAST("present_prod_lockout_toast"),
    PRESENT_PROD_LOCKOUT_SCREEN("present_prod_lockout_screen"),
    PRESENT_PROD_LOCKOUT_SCREEN_NO_SNOOZE("present_prod_lockout_screen_no_snooze"),
    /* JADX INFO: Fake field, exist only in values array */
    SNOOZE_SEV("snooze_sev"),
    /* JADX INFO: Fake field, exist only in values array */
    SNOOZE_BROKEN_BUILD("snooze_broken_build"),
    ENROLL_IN_GP_BETA("enroll_in_gp_beta"),
    UPDATE_TO_ALPHA("update_to_alpha"),
    SNOOZE_OTHER("snooze_other"),
    /* JADX INFO: Fake field, exist only in values array */
    SWITCH_TO_ALPHA("switch_to_alpha"),
    /* JADX INFO: Fake field, exist only in values array */
    SWITCH_TO_BETA("switch_to_beta"),
    ELIGIBILITY_SERVICE_CHECK("eligibility_service_check"),
    ELIGIBILITY_SERVICE_SUCCESS("eligibility_service_success"),
    ELIGIBILITY_SERVICE_FAILURE("eligibility_service_failure"),
    PRESENT_STALE_BUILD_LOCKOUT_SCREEN("present_stale_build_lockout_screen"),
    SNOOZE_STALE_BUILD_BUILD("snooze_stale_build"),
    UPDATE_GOOGLE_PLAY("update_google_play"),
    SUGGEST_UNINSTALL_GOOGLE_PLAY("suggest_uninstall_google_play"),
    /* JADX INFO: Fake field, exist only in values array */
    UPDATE_DIRECT_DOWNLOAD("update_direct_download");

    public final String A00;

    C8m(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }
}
