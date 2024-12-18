package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.9k0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217679k0 extends C9PD {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C217679k0(Context context, UserSession userSession, C194808jg c194808jg, int i) {
        super(context, userSession, c194808jg, context.getResources().getString(2131974419));
        this.A00 = i;
    }

    @Override // X.C9PD, X.ACE
    public final boolean A01() {
        switch (this.A00) {
            case 0:
            case 1:
                return false;
            default:
                return super.A01();
        }
    }
}
