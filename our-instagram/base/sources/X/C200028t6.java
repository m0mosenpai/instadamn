package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8t6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200028t6 {
    public boolean A00;
    public final int A01;
    public final C006802i A02;
    public final UserSession A03;

    public C200028t6(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 2);
        this.A01 = i;
        this.A03 = userSession;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A02 = c006802i;
    }

    public final void A01(String str, String str2) {
        C14360o3.A0B(str2, 1);
        if (!this.A00) {
            C0K8.A0D("CLNoticePerformanceLogger", "Marker not started.");
        } else {
            this.A02.markerAnnotate(this.A01, str, str2);
        }
    }

    public final void A00(String str, long j) {
        if (!this.A00) {
            C0K8.A0D("CLNoticePerformanceLogger", "Marker not started.");
        } else {
            this.A02.markerAnnotate(this.A01, str, j);
        }
    }

    public final void A02(String str, String str2, String str3) {
        if (this.A00) {
            C0K8.A0D("CLNoticePerformanceLogger", "Marker already started");
        }
        this.A00 = true;
        C006802i c006802i = this.A02;
        int i = this.A01;
        c006802i.markerStart(i);
        if (str != null) {
            c006802i.markerAnnotate(i, "entrypoint", str);
        }
        if (str2 != null) {
            c006802i.markerAnnotate(i, "notice_variant", str2);
        }
        if (str3 != null) {
            c006802i.markerAnnotate(i, "surface", str3);
        }
    }

    public final void A03(short s) {
        if (!this.A00) {
            C0K8.A0D("CLNoticePerformanceLogger", "Marker not started.");
        } else {
            this.A02.markerEnd(this.A01, s);
            this.A00 = false;
        }
    }
}
