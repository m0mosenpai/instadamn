package X;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import com.instagram.common.session.UserSession;

/* renamed from: X.8y2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202848y2 implements C3PE {
    public boolean A00;
    public final View A01;
    public final EditText A02;
    public final UserSession A03;
    public final Handler A04;
    public final InterfaceC190428c0 A05;

    public C202848y2(View view, EditText editText, UserSession userSession, InterfaceC190428c0 interfaceC190428c0) {
        C14360o3.A0B(view, 2);
        C14360o3.A0B(editText, 3);
        this.A03 = userSession;
        this.A01 = view;
        this.A02 = editText;
        this.A05 = interfaceC190428c0;
        this.A04 = new Handler(Looper.getMainLooper());
        C3P9 c3p9 = new C3P9(view);
        c3p9.A04 = this;
        c3p9.A07 = true;
        c3p9.A0D = true;
        c3p9.A00();
    }

    public static final void A00(View view, C202848y2 c202848y2, boolean z, boolean z2, boolean z3) {
        Handler handler = c202848y2.A04;
        RunnableC24868AzT runnableC24868AzT = new RunnableC24868AzT(view, c202848y2, z, z3, z2);
        long j = 2000;
        if (z && c202848y2.A00) {
            j = 7000;
        }
        handler.postDelayed(runnableC24868AzT, j);
    }

    @Override // X.C3PE
    public final void DQY(View view) {
    }

    public final void A01(Integer num) {
        AbstractC13880nE.A0q(this.A02, new RunnableC24667Aw8(this, num));
    }

    public final void A02(boolean z) {
        View view = this.A01;
        view.setActivated(z);
        Resources resources = view.getResources();
        int i = 2131975330;
        if (z) {
            i = 2131975329;
        }
        AbstractC010103p.A0G(view, resources.getString(i));
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
        ARD.E77("has_used_text_emphasis_button", true);
        ARD.apply();
        this.A05.Dsc();
        return true;
    }
}
