package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.7kB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171197kB {
    public C5SW A00;

    public final void A00(View view, ViewGroup viewGroup, UserSession userSession, int i) {
        C14360o3.A0B(viewGroup, 0);
        C5SW c5sw = this.A00;
        if (c5sw == null) {
            C149686oL c149686oL = new C149686oL(i);
            Context context = view.getContext();
            C14360o3.A07(context);
            C5SU c5su = new C5SU(context, viewGroup, c149686oL);
            c5su.A03(view);
            c5su.A0F = false;
            c5su.A02();
            c5sw = c5su.A00();
            this.A00 = c5sw;
        }
        if (c5sw != null) {
            c5sw.A07(userSession);
        }
    }

    public final void A01(View view, ViewGroup viewGroup, UserSession userSession, String str) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(view, 2);
        C5SW c5sw = this.A00;
        if (c5sw == null) {
            C149686oL c149686oL = new C149686oL(str);
            Context context = view.getContext();
            C14360o3.A07(context);
            C5SU c5su = new C5SU(context, viewGroup, c149686oL);
            c5su.A03(view);
            c5su.A0F = false;
            c5su.A06(EnumC58132lV.A02);
            c5sw = c5su.A00();
            this.A00 = c5sw;
        }
        if (c5sw != null) {
            c5sw.A07(userSession);
        }
    }
}
