package X;

import android.view.View;

/* renamed from: X.05h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC014105h {
    public final C10300gw A00;

    public final boolean A01() {
        Integer num;
        C10300gw c10300gw = this.A00;
        View view = c10300gw.A07.mView;
        if (view != null) {
            num = AnonymousClass077.A00.A01(view);
        } else {
            num = null;
        }
        Integer num2 = c10300gw.A00;
        if (num != num2) {
            Integer num3 = C05F.A01;
            if (num != num3 && num2 != num3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public AbstractC014105h(C10300gw c10300gw) {
        this.A00 = c10300gw;
    }
}
