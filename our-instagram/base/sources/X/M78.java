package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class M78 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ EnumC58132lV A03;
    public final /* synthetic */ C23031Ai A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;

    public M78(Activity activity, View view, UserSession userSession, EnumC58132lV enumC58132lV, C23031Ai c23031Ai, Integer num, String str) {
        this.A01 = view;
        this.A00 = activity;
        this.A06 = str;
        this.A03 = enumC58132lV;
        this.A02 = userSession;
        this.A05 = num;
        this.A04 = c23031Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            C5SU A0Q = AbstractC31178DnM.A0Q(this.A00, view, this.A06);
            A0Q.A06(this.A03);
            A0Q.A07(C5SV.A07);
            A0Q.A0B = false;
            A0Q.A0A = true;
            A0Q.A04 = new C220479oX(4, this.A05, this.A04);
            A0Q.A00().A07(this.A02);
        }
    }
}
