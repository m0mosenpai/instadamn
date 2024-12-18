package X;

import android.content.Context;
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

/* renamed from: X.WSy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70370WSy implements InterfaceC65452xh, JI3, InterfaceC58150PqF {
    public static final Comparator A0F = C71654Wy5.A00;
    public int A00;
    public int A01;
    public AbstractC127945qN A02;
    public final Handler A03;
    public final Fragment A04;
    public final UserSession A05;
    public final C66102Tzd A06;
    public final XG0 A07;
    public final P2J A08;
    public final C676233b A09;
    public final List A0A;
    public final Map A0B;
    public final Map A0C;
    public final boolean A0D;
    public final C38082GpB A0E;

    public C70370WSy(Fragment fragment, UserSession userSession, C66102Tzd c66102Tzd, XG0 xg0, P2J p2j, C38082GpB c38082GpB) {
        AbstractC167027dH.A0a(1, fragment, userSession, p2j, xg0);
        this.A04 = fragment;
        this.A05 = userSession;
        this.A08 = p2j;
        this.A07 = xg0;
        this.A06 = c66102Tzd;
        this.A0E = c38082GpB;
        this.A0B = new LinkedHashMap();
        this.A0A = new ArrayList();
        this.A0C = new LinkedHashMap();
        this.A0D = C15900qk.A01().A06() > 1;
        this.A09 = new C676233b(C05F.A01);
        this.A00 = -1;
        this.A03 = new HandlerC65967TxK(Looper.getMainLooper(), this, 5);
        p2j.A00.A03 = this;
    }

    public static final void A01(C70370WSy c70370WSy, String str) {
        P2J p2j = c70370WSy.A08;
        C38321qM A08 = p2j.A00.A08();
        if (A08 != null) {
            p2j.Eoj(A08, str, true);
        }
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
    
        if (X.C3Q3.A00(r3.A05).A00() == false) goto L10;
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
            X.GpB r2 = r3.A0E
            if (r2 == 0) goto L25
            boolean r0 = r3.A0D
            if (r0 == 0) goto L21
            androidx.fragment.app.Fragment r0 = r3.A04
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L21
            com.instagram.common.session.UserSession r0 = r3.A05
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
        throw new UnsupportedOperationException("Method not decompiled: X.C70370WSy.DzY(X.1qM):void");
    }

    @Override // X.InterfaceC58150PqF
    public final void E06(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C38082GpB c38082GpB = this.A0E;
        if (c38082GpB != null) {
            c38082GpB.A02(c38321qM);
        }
    }

    @Override // X.JI3
    public final void E0H(Rect rect, AbstractC127945qN abstractC127945qN, float f, int i) {
        C14360o3.A0B(abstractC127945qN, 0);
        this.A0B.put(abstractC127945qN, new C69111Vi1(i, this.A07.AVT(abstractC127945qN), f));
        EJ1();
    }

    @Override // X.JI3
    public final void E0I(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        this.A0B.remove(abstractC127945qN);
        EJ1();
    }

    @Override // X.JI3
    public final void E0K(Rect rect, AbstractC127945qN abstractC127945qN, float f, int i) {
        int i2;
        C14360o3.A0B(abstractC127945qN, 0);
        Map map = this.A0B;
        C69111Vi1 c69111Vi1 = (C69111Vi1) map.get(abstractC127945qN);
        if (c69111Vi1 != null && (i2 = c69111Vi1.A01 - i) != 0) {
            this.A09.A01(i2);
        }
        C69111Vi1 c69111Vi12 = (C69111Vi1) map.get(abstractC127945qN);
        if (c69111Vi12 == null) {
            map.put(abstractC127945qN, new C69111Vi1(i, this.A07.AVT(abstractC127945qN), f));
        } else {
            if (c69111Vi12.A00 == f && c69111Vi12.A01 == i) {
                return;
            }
            c69111Vi12.A00 = f;
            c69111Vi12.A01 = i;
        }
        EJ1();
    }

    public static final void A00(C70370WSy c70370WSy, int i) {
        int i2;
        C17v c17v;
        int i3 = i;
        Map map = c70370WSy.A0B;
        if (!map.isEmpty()) {
            List list = c70370WSy.A0A;
            if (!list.isEmpty() && i3 != -1) {
                boolean z = false;
                int size = list.size();
                while (i3 < size) {
                    Map.Entry entry = (Map.Entry) AbstractC001800i.A0O(list, i3);
                    if (entry != null) {
                        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) entry.getKey();
                        if (((C69111Vi1) entry.getValue()).A00 <= 0.25f) {
                            continue;
                        } else {
                            if (!z) {
                                C66102Tzd c66102Tzd = c70370WSy.A06;
                                U0N A02 = c66102Tzd.A02(abstractC127945qN);
                                InterfaceC58117Ppg A01 = c66102Tzd.A01(abstractC127945qN);
                                if (A02 != null && A01 != null && A02.A03) {
                                    c70370WSy.A08.A00.A0C(new MZB(A02.A00, A01, A02.A01, c70370WSy.A07.CFG(A02), 0, AbstractC167007dF.A1P(map.size(), 1)));
                                    z = true;
                                    c70370WSy.A02 = abstractC127945qN;
                                } else {
                                    z = false;
                                }
                            }
                            if (c70370WSy.A01 < 1) {
                                C69111Vi1 c69111Vi1 = (C69111Vi1) map.get(abstractC127945qN);
                                if (c69111Vi1 != null && (i2 = c69111Vi1.A02) != -1 && c69111Vi1.A00 >= 1.0f && c70370WSy.A0C.size() < 1) {
                                    Integer num = c70370WSy.A09.A01;
                                    if (c70370WSy.A00 != i2) {
                                        XG0 xg0 = c70370WSy.A07;
                                        if (i2 >= xg0.getCount()) {
                                            c17v = C17u.A00;
                                        } else if (num == C05F.A01) {
                                            c17v = C17s.A0C(i2 + 1, xg0.getCount());
                                        } else {
                                            c17v = new C17v(i2 - 1, 0, -1);
                                        }
                                        int i4 = c17v.A00;
                                        int i5 = c17v.A01;
                                        int i6 = c17v.A02;
                                        if (i6 <= 0 ? !(i6 >= 0 || i5 > i4) : i4 <= i5) {
                                            while (true) {
                                                U0N CFF = xg0.CFF(i4);
                                                Context context = c70370WSy.A04.getContext();
                                                if (CFF != null && CFF.A03 && context != null) {
                                                    P2J p2j = c70370WSy.A08;
                                                    C38321qM c38321qM = CFF.A01;
                                                    if (!p2j.Cdd(c38321qM)) {
                                                        c70370WSy.A00 = i2;
                                                        C4VX c4vx = new C4VX(context, c70370WSy.A05, c38321qM.CFR(), "explore");
                                                        c4vx.A04 = true;
                                                        C4VZ.A00(c4vx.A00());
                                                    }
                                                } else if (i4 == i5) {
                                                    break;
                                                } else {
                                                    i4 += i6;
                                                }
                                            }
                                        }
                                        if (num == C05F.A01) {
                                            xg0.getCount();
                                        }
                                    }
                                }
                                c70370WSy.A01++;
                            } else {
                                return;
                            }
                        }
                    }
                    i3++;
                }
            }
        }
    }

    @Override // X.JI3
    public final void AGc() {
        this.A03.removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC58150PqF
    public final void DaG(C38321qM c38321qM) {
        C38082GpB c38082GpB = this.A0E;
        if (c38082GpB != null) {
            c38082GpB.A01(c38321qM);
        }
    }

    @Override // X.JI3
    public final void Dj3() {
        this.A03.sendEmptyMessageDelayed(0, 200L);
    }

    @Override // X.JI3
    public final void EJ1() {
        this.A03.sendEmptyMessage(0);
    }

    @Override // X.InterfaceC58150PqF
    public final void onCompletion() {
        MZA mza = this.A08.A00;
        if (mza.A0H() && mza.A08() != null) {
            A01(this, "finished");
        }
        this.A03.sendEmptyMessage(1);
    }
}
