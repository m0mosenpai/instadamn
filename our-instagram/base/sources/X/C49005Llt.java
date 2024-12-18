package X;

import android.content.Intent;
import android.view.MotionEvent;
import com.instagram.common.session.UserSession;

/* renamed from: X.Llt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49005Llt implements C7Q6 {
    public final UserSession A00;

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        KT1 kt1 = (KT1) obj;
        C7QD c7qd = (C7QD) obj2;
        AbstractC167017dG.A1N(kt1, c7qd);
        UserSession userSession = this.A00;
        String str = kt1.A04;
        if (str == null) {
            str = "";
        }
        AbstractC46994KqD.A00(EnumC53373NjO.FILE_PILL_CLICK_TO_DOWNLOAD, userSession, str);
        String str2 = kt1.A01;
        if (str2 == null) {
            return false;
        }
        C12260kU.A00(c7qd.BKF().getContext(), new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(str2)));
        return true;
    }

    public C49005Llt(UserSession userSession) {
        this.A00 = userSession;
    }
}
