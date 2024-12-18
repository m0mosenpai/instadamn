package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6yF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155266yF implements InterfaceC64682wS {
    public View A00;
    public final Integer A01 = C05F.A00;

    @Override // X.InterfaceC64682wS
    public final int CI5(Context context, UserSession userSession) {
        int i;
        int[] iArr = new int[2];
        View view = this.A00;
        if (view != null) {
            view.getLocationInWindow(iArr);
        }
        View view2 = this.A00;
        if (view2 != null) {
            i = view2.getWidth();
        } else {
            i = 0;
        }
        return iArr[0] + (i / 2);
    }

    @Override // X.InterfaceC64682wS
    public final int CIc(Context context) {
        int i;
        int[] iArr = new int[2];
        View view = this.A00;
        if (view != null) {
            view.getLocationInWindow(iArr);
        }
        View view2 = this.A00;
        if (view2 != null) {
            i = view2.getHeight();
        } else {
            i = 0;
        }
        return iArr[1] + i;
    }

    @Override // X.InterfaceC64682wS
    public final long EM4() {
        return 0L;
    }

    @Override // X.InterfaceC64682wS
    public final Integer AwQ() {
        return this.A01;
    }

    @Override // X.InterfaceC64682wS
    public final boolean CV9() {
        return false;
    }
}
