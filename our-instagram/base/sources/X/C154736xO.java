package X;

/* renamed from: X.6xO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154736xO {
    public int A00;
    public final C006802i A01;

    public C154736xO(C006802i c006802i) {
        C14360o3.A0B(c006802i, 1);
        this.A01 = c006802i;
    }

    public final void A01(String str, boolean z) {
        C006802i c006802i;
        String str2;
        int i = this.A00;
        if (i != 0) {
            if (i != 224331890) {
                if (i != 224338334) {
                    if (i != 224340202) {
                        str2 = "";
                    } else {
                        str2 = "Previous reload did not end";
                    }
                } else {
                    str2 = "Previous head load did not end";
                }
            } else {
                str2 = "Previous tail load did not end";
            }
            C006802i c006802i2 = this.A01;
            c006802i2.markerAnnotate(i, "cancel_reason", str2);
            c006802i2.markerEnd(this.A00, (short) 4);
            this.A00 = 0;
        }
        if (str.equals("head_load")) {
            this.A00 = 224338334;
            c006802i = this.A01;
            c006802i.markerStart(224338334);
        } else {
            if (str.equals("reload")) {
                this.A00 = 224340202;
                C006802i c006802i3 = this.A01;
                c006802i3.markerStart(224340202);
                c006802i3.markerAnnotate(this.A00, "is_user_initiated", z);
                c006802i3.markerAnnotate(this.A00, "is_blocked_by_rate_limiter", false);
                return;
            }
            if (!str.equals("tail_load")) {
                return;
            }
            this.A00 = 224331890;
            c006802i = this.A01;
            c006802i.markerStart(224331890);
            c006802i.markerPoint(this.A00, "tail_load_indicator_start");
        }
        c006802i.markerAnnotate(this.A00, "is_user_initiated", z);
    }

    public final void A00() {
        int i = this.A00;
        if (i != 0) {
            C006802i c006802i = this.A01;
            c006802i.markerAnnotate(i, "is_private_profile", true);
            c006802i.markerPoint(this.A00, "no_grid_rendered");
            int i2 = this.A00;
            if (i2 != 0) {
                c006802i.markerEnd(i2, (short) 2);
                this.A00 = 0;
            }
        }
    }
}
