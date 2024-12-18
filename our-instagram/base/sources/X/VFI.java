package X;

/* loaded from: classes11.dex */
public enum VFI {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    /* JADX INFO: Fake field, exist only in values array */
    LLM_FINISHED("LLM_FINISHED"),
    /* JADX INFO: Fake field, exist only in values array */
    LLM_OUTPUT("LLM_OUTPUT"),
    /* JADX INFO: Fake field, exist only in values array */
    LLM_STREAMING("LLM_STREAMING"),
    /* JADX INFO: Fake field, exist only in values array */
    SEND_QUERY("SEND_QUERY"),
    /* JADX INFO: Fake field, exist only in values array */
    START_TYPING("START_TYPING"),
    /* JADX INFO: Fake field, exist only in values array */
    STOP_TYPING("STOP_TYPING"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO_ABOUT_TO_FINISH("VIDEO_ABOUT_TO_FINISH");

    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    VFI(String str) {
        this.A00 = str;
    }
}
