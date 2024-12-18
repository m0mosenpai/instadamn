package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.3sD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85843sD extends AbstractC85803s9 {
    public final UserSession A00;
    public final boolean A01;
    public final Activity A02;
    public final Context A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85843sD(Activity activity, Context context, UserSession userSession, boolean z) {
        super(context);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(userSession, 3);
        this.A02 = activity;
        this.A03 = context;
        this.A00 = userSession;
        this.A01 = z;
    }

    public static final void A00(C206249Bh c206249Bh, C4Cn c4Cn) {
        C14360o3.A0B(c4Cn, 0);
        C14360o3.A0B(c206249Bh, 1);
        if (c206249Bh.A04) {
            C206209Bd c206209Bd = (C206209Bd) c206249Bh.A01;
            ((InterfaceC16660sJ) c206209Bd.A02).invoke(c206249Bh.A02);
            ((InterfaceC16660sJ) c206209Bd.A01).invoke(c4Cn);
        }
        c4Cn.A01 = c206249Bh;
        if (c206249Bh.A05) {
            c4Cn.A00();
            c4Cn.A01(c206249Bh);
        } else {
            TextView textView = c4Cn.A00;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }
}
