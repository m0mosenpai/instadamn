package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import com.instagram.tagging.widget.TagsLayout;
import java.util.List;

/* renamed from: X.3YH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YH implements C33R {
    public int A00;
    public C75113Zb A01;
    public Runnable A02;
    public Runnable A03;
    public InterfaceC16660sJ A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final TagsLayout A08;

    public C3YH(TagsLayout tagsLayout) {
        C14360o3.A0B(tagsLayout, 1);
        this.A08 = tagsLayout;
        this.A00 = -1;
        this.A07 = new Handler(Looper.getMainLooper());
    }

    public final void A01(UserSession userSession, C75113Zb c75113Zb, InterfaceC86433tG interfaceC86433tG, C80243iD c80243iD) {
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC86433tG, 3);
        C206279Bk c206279Bk = c80243iD.A02;
        if (((Boolean) ((InterfaceC16820sZ) c206279Bk.A05).invoke()).booleanValue()) {
            Runnable runnable = this.A03;
            if (runnable != null) {
                this.A07.removeCallbacks(runnable);
                this.A03 = null;
            }
            RunnableC43156J5t runnableC43156J5t = new RunnableC43156J5t(userSession, c75113Zb, interfaceC86433tG, c80243iD, this);
            this.A07.postDelayed(runnableC43156J5t, ((Number) ((InterfaceC16820sZ) c206279Bk.A02).invoke()).longValue());
            this.A03 = runnableC43156J5t;
        }
    }

    public final void A02(UserSession userSession, C80243iD c80243iD, boolean z) {
        C75113Zb c75113Zb = c80243iD.A04;
        if (this.A05) {
            c75113Zb.A07(c75113Zb.A03, -1).A05 = true;
        }
        TagsLayout tagsLayout = this.A08;
        tagsLayout.removeAllViews();
        tagsLayout.setTags((List) ((InterfaceC16660sJ) c80243iD.A02.A01).invoke(c75113Zb), c80243iD.A05, c75113Zb, c75113Zb.A03, z, this.A05, userSession);
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (this.A06) {
            if (this.A05 && i == 18 && !c75113Zb.A1v && !c75113Zb.A07(this.A00, -1).A04 && !c75113Zb.A2y) {
                A00();
                c75113Zb.A0k(false);
                this.A00 = -1;
            }
            if (this.A05 && i == 16 && c75113Zb.A0i != C3VZ.A03 && !c75113Zb.A2y && this.A00 == c75113Zb.A03) {
                A00();
                c75113Zb.A0k(false);
            }
        }
        int i2 = this.A00;
        if (i2 == c75113Zb.A03 && c75113Zb.A1z && c75113Zb == this.A01) {
            if ((this.A05 && (i != 16 ? !(i != 18 || c75113Zb.A1v || c75113Zb.A07(i2, -1).A04) : c75113Zb.A0i != C3VZ.A03) && !c75113Zb.A2y) || (this.A05 && i == 10 && c75113Zb.A1y)) {
                A00();
                c75113Zb.A0k(false);
            }
        }
    }

    public final void A00() {
        Runnable runnable = this.A03;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
            this.A03 = null;
        }
        Runnable runnable2 = this.A02;
        if (runnable2 != null) {
            this.A07.removeCallbacks(runnable2);
            this.A02 = null;
        }
        TagsLayout tagsLayout = this.A08;
        tagsLayout.setTouchDelegate(null);
        tagsLayout.A04(this.A05);
    }
}
