package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Tzv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C66117Tzv implements JI3, InterfaceC58150PqF {
    public static final Comparator A0D = U0X.A00;
    public final Fragment A00;
    public final UserSession A01;
    public final C66102Tzd A02;
    public final XG0 A03;
    public final MZ4 A04;
    public final C676233b A05;
    public final List A06;
    public final Map A07;
    public final boolean A08;
    public final Handler A09;
    public final C38082GpB A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C66117Tzv(Fragment fragment, UserSession userSession, C66102Tzd c66102Tzd, XG0 xg0, MZ4 mz4, C38082GpB c38082GpB) {
        C14360o3.A0B(fragment, 1);
        C14360o3.A0B(xg0, 4);
        this.A00 = fragment;
        this.A01 = userSession;
        this.A04 = mz4;
        this.A03 = xg0;
        this.A02 = c66102Tzd;
        this.A0A = c38082GpB;
        this.A07 = new LinkedHashMap();
        this.A06 = new ArrayList();
        this.A05 = new C676233b(C05F.A01);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0C = C18U.A06(c06090Tz, userSession, 36321464680719838L);
        this.A0B = C18U.A06(c06090Tz, userSession, 36320111765954628L);
        this.A09 = new HandlerC65967TxK(Looper.getMainLooper(), this, 4);
        this.A08 = C15900qk.A01().A06() > 1;
        mz4.A01 = this;
        Iterator A16 = AbstractC166997dE.A16(mz4.A03);
        while (A16.hasNext()) {
            ((MZA) A16.next()).A03 = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (X.C3Q3.A00(r3.A01).A00() == false) goto L10;
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
            X.GpB r2 = r3.A0A
            if (r2 == 0) goto L25
            boolean r0 = r3.A08
            if (r0 == 0) goto L21
            androidx.fragment.app.Fragment r0 = r3.A00
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L21
            com.instagram.common.session.UserSession r0 = r3.A01
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
        throw new UnsupportedOperationException("Method not decompiled: X.C66117Tzv.DzY(X.1qM):void");
    }

    @Override // X.InterfaceC58150PqF
    public final void E06(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C38082GpB c38082GpB = this.A0A;
        if (c38082GpB != null) {
            c38082GpB.A02(c38321qM);
        }
    }

    @Override // X.JI3
    public void E0I(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        A00(this, abstractC127945qN, 0.0f, -1);
    }

    @Override // X.InterfaceC58150PqF
    public final void onCompletion() {
    }

    public static final void A00(C66117Tzv c66117Tzv, AbstractC127945qN abstractC127945qN, float f, int i) {
        boolean A1O;
        XG0 xg0;
        int AVT;
        C17v c17v;
        U0N A02;
        boolean A1P;
        int i2;
        Map map = c66117Tzv.A07;
        if (map.containsKey(abstractC127945qN)) {
            U0r u0r = (U0r) map.get(abstractC127945qN);
            if (u0r != null && (i2 = u0r.A00 - i) != 0) {
                c66117Tzv.A05.A01(i2);
            }
            if (c66117Tzv instanceof C66118Tzw) {
                C66118Tzw c66118Tzw = (C66118Tzw) c66117Tzv;
                C38321qM A022 = c66118Tzw.A02(abstractC127945qN);
                if (A022 != null) {
                    A1P = !c66118Tzw.A00.containsKey(A022);
                }
                map.remove(abstractC127945qN);
                c66117Tzv.EJ1();
                return;
            }
            A1P = AbstractC25230BEn.A1P((f > 0.2f ? 1 : (f == 0.2f ? 0 : -1)));
            if (!A1P) {
                map.put(abstractC127945qN, new U0r(i));
                return;
            }
            map.remove(abstractC127945qN);
            c66117Tzv.EJ1();
            return;
        }
        if (c66117Tzv instanceof C66118Tzw) {
            C66118Tzw c66118Tzw2 = (C66118Tzw) c66117Tzv;
            C38321qM A023 = c66118Tzw2.A02(abstractC127945qN);
            if (A023 == null) {
                return;
            } else {
                A1O = c66118Tzw2.A00.containsKey(A023);
            }
        } else {
            A1O = AbstractC167007dF.A1O((f > 0.25f ? 1 : (f == 0.25f ? 0 : -1)));
        }
        if (!A1O) {
            return;
        }
        boolean z = c66117Tzv.A0C;
        if (z && (A02 = c66117Tzv.A02.A02(abstractC127945qN)) != null) {
            c66117Tzv.A01(A02.A01);
        }
        map.put(abstractC127945qN, new U0r(i));
        c66117Tzv.EJ1();
        if (z || (AVT = (xg0 = c66117Tzv.A03).AVT(abstractC127945qN)) == -1) {
            return;
        }
        if (c66117Tzv.A05.A01 == C05F.A01) {
            c17v = C17s.A0C(AVT + 1, xg0.getCount());
        } else {
            c17v = new C17v(AVT - 1, 0, -1);
        }
        int i3 = c17v.A00;
        int i4 = c17v.A01;
        int i5 = c17v.A02;
        if (i5 > 0) {
            if (i3 > i4) {
                return;
            }
        } else if (i5 >= 0 || i4 > i3) {
            return;
        }
        while (true) {
            U0N CFF = xg0.CFF(i3);
            if (CFF != null && CFF.A03) {
                c66117Tzv.A01(CFF.A01);
                return;
            } else if (i3 == i4) {
                return;
            } else {
                i3 += i5;
            }
        }
    }

    private final void A01(C38321qM c38321qM) {
        Integer num;
        C66122U0e c66122U0e;
        Context context = this.A00.getContext();
        if (context != null) {
            if ((this instanceof C66118Tzw) && (c66122U0e = (C66122U0e) ((C66118Tzw) this).A00.get(c38321qM)) != null) {
                num = Integer.valueOf(c66122U0e.A00);
            } else {
                num = null;
            }
            int A02 = AbstractC37302Gc3.A02(num);
            C75363a3 CFR = c38321qM.CFR();
            if (A02 > 0 && this.A0B) {
                CFR.A01 = 0;
                CFR.A00 = A02;
            }
            C4VZ.A00(new C4VX(context, this.A01, CFR, "explore").A00());
        }
    }

    @Override // X.JI3
    public final void AGc() {
        this.A09.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC58150PqF
    public final void DaG(C38321qM c38321qM) {
        C38082GpB c38082GpB = this.A0A;
        if (c38082GpB != null) {
            c38082GpB.A01(c38321qM);
        }
    }

    @Override // X.JI3
    public final void Dj3() {
        this.A09.sendEmptyMessageDelayed(0, 200L);
    }

    @Override // X.JI3
    public final void E0H(Rect rect, AbstractC127945qN abstractC127945qN, float f, int i) {
        if (this instanceof C66118Tzw) {
            C66118Tzw c66118Tzw = (C66118Tzw) this;
            AbstractC167007dF.A1E(abstractC127945qN, 0, rect);
            C66118Tzw.A01(rect, c66118Tzw, abstractC127945qN, f, i);
            A00(c66118Tzw, abstractC127945qN, f, i);
            return;
        }
        C14360o3.A0B(abstractC127945qN, 0);
        A00(this, abstractC127945qN, f, i);
    }

    @Override // X.JI3
    public final void E0K(Rect rect, AbstractC127945qN abstractC127945qN, float f, int i) {
        if (this instanceof C66118Tzw) {
            C66118Tzw c66118Tzw = (C66118Tzw) this;
            AbstractC167007dF.A1E(abstractC127945qN, 0, rect);
            C66118Tzw.A01(rect, c66118Tzw, abstractC127945qN, f, i);
            A00(c66118Tzw, abstractC127945qN, f, i);
            return;
        }
        C14360o3.A0B(abstractC127945qN, 0);
        A00(this, abstractC127945qN, f, i);
    }

    @Override // X.JI3
    public final void EJ1() {
        this.A09.sendEmptyMessage(0);
    }
}
