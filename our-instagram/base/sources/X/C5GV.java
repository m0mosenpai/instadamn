package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.5GV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GV {
    public final C57112jm A00;
    public final C64582wH A01;

    public C5GV(UserSession userSession, C57112jm c57112jm, C64572wG c64572wG, Integer num) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c57112jm, 3);
        this.A00 = c57112jm;
        this.A01 = new C64582wH(userSession, c64572wG, num, false);
    }

    public final void A00(View view, Object obj) {
        String A0O = AnonymousClass001.A0O("load-more:", obj.hashCode());
        C0eB c0eB = C0eB.A00;
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(obj, c0eB, A0O);
        c59072n8.A00(this.A01);
        this.A00.A05(view, c59072n8.A01());
    }
}
