package X;

import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;

/* renamed from: X.7P1, reason: invalid class name */
/* loaded from: classes3.dex */
public enum C7P1 implements InterfaceC02530Ab {
    IMPRESSION("impression"),
    /* JADX INFO: Fake field, exist only in values array */
    CLOSE("close"),
    CLICK("click"),
    SAVE("save"),
    /* JADX INFO: Fake field, exist only in values array */
    CLEAR(QuickExperimentDumperPlugin.CLEAR_CMD),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW("allow"),
    /* JADX INFO: Fake field, exist only in values array */
    DISALLOW("disallow"),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR("error"),
    /* JADX INFO: Fake field, exist only in values array */
    DEBUG("debug");

    public final String A00;

    @Override // X.InterfaceC02530Ab
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A00;
    }

    C7P1(String str) {
        this.A00 = str;
    }
}
