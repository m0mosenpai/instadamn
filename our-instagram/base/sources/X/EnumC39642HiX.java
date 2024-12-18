package X;

import com.facebook.proxygen.TraceEventType;

/* renamed from: X.HiX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39642HiX implements InterfaceC02530Ab {
    DEEPLINK("deeplink"),
    /* JADX INFO: Fake field, exist only in values array */
    EDIT_PROFILE("edit_profile"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTIFICATION_FEED("notification_feed"),
    PROFILE_BIO("profile_bio"),
    /* JADX INFO: Fake field, exist only in values array */
    PUSH(TraceEventType.Push),
    QP("qp"),
    SWITCH_SCHOOL_SETTING("switch_school_setting");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    EnumC39642HiX(String str) {
        this.A00 = str;
    }
}
