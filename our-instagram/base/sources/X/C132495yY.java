package X;

/* renamed from: X.5yY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132495yY {
    public final C23031Ai A00;
    public final C13920nI A01;

    public C132495yY(C13920nI c13920nI, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 1);
        C14360o3.A0B(c13920nI, 2);
        this.A00 = c23031Ai;
        this.A01 = c13920nI;
    }

    public final C51740MtP A00() {
        String str;
        C23031Ai c23031Ai = this.A00;
        boolean z = true;
        if (c23031Ai.A1m()) {
            str = "direct_messages_muted";
        } else if (System.currentTimeMillis() < c23031Ai.A01.getLong(AbstractC43591JPw.A00(923), -1L)) {
            str = "all_notifications_paused";
        } else {
            z = false;
            str = "";
        }
        return new C51740MtP(str, 14, z);
    }
}
