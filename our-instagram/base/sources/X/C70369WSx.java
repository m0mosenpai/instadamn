package X;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.WSx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70369WSx implements InterfaceC65452xh, JI3, InterfaceC58150PqF {
    public static final Comparator A0E = C71655Wy6.A00;
    public static final Comparator A0F = C71656Wy7.A00;
    public int A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C66102Tzd A03;
    public final XG0 A04;
    public final P2J A05;
    public final C676233b A06;
    public final List A07;
    public final Map A08;
    public final Map A09;
    public final boolean A0A;
    public final boolean A0B;
    public final Handler A0C;
    public final C38082GpB A0D;

    public C70369WSx(Fragment fragment, UserSession userSession, C66102Tzd c66102Tzd, XG0 xg0, P2J p2j, C38082GpB c38082GpB, boolean z) {
        AbstractC167007dF.A1F(fragment, 1, xg0);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A05 = p2j;
        this.A04 = xg0;
        this.A03 = c66102Tzd;
        this.A0B = z;
        this.A0D = c38082GpB;
        this.A08 = new LinkedHashMap();
        this.A07 = new ArrayList();
        this.A09 = new LinkedHashMap();
        this.A0A = C15900qk.A01().A06() > 1;
        this.A06 = new C676233b(C05F.A01);
        this.A00 = -1;
        this.A0C = new HandlerC65967TxK(Looper.getMainLooper(), this, 6);
        p2j.A00.A03 = this;
    }

    @Override // X.InterfaceC65452xh
    public final void D2j(int i, int i2, Object obj) {
    }

    @Override // X.InterfaceC65452xh
    public final void DMJ(int i, int i2) {
    }

    @Override // X.InterfaceC65452xh
    public final void DTy(int i, int i2) {
    }

    @Override // X.InterfaceC65452xh
    public final void DfC(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (X.C3Q3.A00(r3.A02).A00() == false) goto L10;
     */
    @Override // X.InterfaceC58150PqF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DzY(X.C38321qM r4) {
        /*
            r3 = this;
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.GpB r2 = r3.A0D
            if (r2 == 0) goto L25
            boolean r0 = r3.A0A
            if (r0 == 0) goto L21
            androidx.fragment.app.Fragment r0 = r3.A01
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L21
            com.instagram.common.session.UserSession r0 = r3.A02
            X.3Q4 r0 = X.C3Q3.A00(r0)
            boolean r1 = r0.A00()
            r0 = 1
            if (r1 != 0) goto L22
        L21:
            r0 = 0
        L22:
            r2.A04(r4, r0)
        L25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70369WSx.DzY(X.1qM):void");
    }

    @Override // X.InterfaceC58150PqF
    public final void E06(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C38082GpB c38082GpB = this.A0D;
        if (c38082GpB != null) {
            c38082GpB.A02(c38321qM);
        }
    }

    @Override // X.JI3
    public final void E0H(Rect rect, AbstractC127945qN abstractC127945qN, float f, int i) {
        C14360o3.A0B(abstractC127945qN, 0);
        this.A08.put(abstractC127945qN, new C69112Vi2(i, this.A04.AVT(abstractC127945qN), f));
        EJ1();
    }

    @Override // X.JI3
    public final void E0I(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        this.A08.remove(abstractC127945qN);
        EJ1();
    }

    @Override // X.JI3
    public final void E0K(Rect rect, AbstractC127945qN abstractC127945qN, float f, int i) {
        int i2;
        C14360o3.A0B(abstractC127945qN, 0);
        Map map = this.A08;
        C69112Vi2 c69112Vi2 = (C69112Vi2) map.get(abstractC127945qN);
        if (c69112Vi2 != null && (i2 = c69112Vi2.A01 - i) != 0) {
            this.A06.A01(i2);
        }
        C69112Vi2 c69112Vi22 = (C69112Vi2) map.get(abstractC127945qN);
        if (c69112Vi22 == null) {
            map.put(abstractC127945qN, new C69112Vi2(i, this.A04.AVT(abstractC127945qN), f));
        } else {
            if (c69112Vi22.A00 == f && c69112Vi22.A01 == i) {
                return;
            }
            c69112Vi22.A00 = f;
            c69112Vi22.A01 = i;
        }
        EJ1();
    }

    @Override // X.InterfaceC58150PqF
    public final void onCompletion() {
    }

    @Override // X.JI3
    public final void AGc() {
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC58150PqF
    public final void DaG(C38321qM c38321qM) {
        C38082GpB c38082GpB = this.A0D;
        if (c38082GpB != null) {
            c38082GpB.A01(c38321qM);
        }
    }

    @Override // X.JI3
    public final void Dj3() {
        this.A0C.sendEmptyMessageDelayed(0, 200L);
    }

    @Override // X.JI3
    public final void EJ1() {
        this.A0C.sendEmptyMessage(0);
    }
}
