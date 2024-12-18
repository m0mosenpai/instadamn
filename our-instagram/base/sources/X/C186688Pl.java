package X;

import android.graphics.Bitmap;
import android.os.Handler;
import com.instagram.common.session.UserSession;

/* renamed from: X.8Pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186688Pl implements C1NJ, InterfaceC1810781j, C8PY {
    public Bitmap A00;
    public X1v A01;
    public YQ3 A02;
    public C22978ABc A03;
    public final UserSession A04;
    public final C1810281e A05;
    public final C8PX A06;
    public final InterfaceC186578Pa A07;
    public final C186668Pj A08;

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        this.A00 = c73033Pe.A01;
        this.A05.A04(new Object());
    }

    @Override // X.C8PY
    public final void DIn(X1v x1v, C22978ABc c22978ABc) {
        this.A03 = c22978ABc;
        this.A01 = x1v;
        C1810281e c1810281e = this.A05;
        Object obj = c1810281e.A00.first;
        if (obj == EnumC186698Pm.THREAD_READY || obj == EnumC186698Pm.READY_TO_INITIALIZE) {
            C0w9.A03("BrushMaker", "Thread available called multiple times");
        }
        c1810281e.A04(new Object());
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        this.A05.A04(new Object());
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        C8PX c8px;
        java.util.Set set;
        int ordinal = ((EnumC186698Pm) obj2).ordinal();
        if (ordinal != 3) {
            if (ordinal != 5) {
                if (ordinal == 4) {
                    c8px = this.A06;
                    YQ3 yq3 = this.A02;
                    C8PW c8pw = c8px.A04;
                    C11T.A00();
                    c8pw.A01.put(yq3.Aia(), yq3);
                    C8PR c8pr = c8pw.A00;
                    Handler handler = c8pr.A0D;
                    Runnable runnable = c8pr.A0P;
                    handler.removeCallbacks(runnable);
                    if (c8pr.A0N.A01.size() == c8pr.A0T.size()) {
                        runnable.run();
                    } else {
                        handler.postDelayed(runnable, 500L);
                    }
                    set = c8px.A06;
                    set.remove(this);
                    A8B a8b = c8px.A01;
                    if (!set.isEmpty() && a8b != null) {
                        C8PR c8pr2 = a8b.A00;
                        C8Q0 c8q0 = a8b.A01;
                        C8PR.A00(c8pr2).A00.A04(a8b.A02, c8q0.A00);
                        return;
                    }
                }
                return;
            }
        } else {
            X1v x1v = this.A01;
            if (x1v == null) {
                C0w9.A03("BrushMaker", "Illegal state in brushMaker: null thread");
            } else {
                x1v.A07(new RunnableC24493AtC(this));
                return;
            }
        }
        c8px = this.A06;
        set = c8px.A06;
        set.remove(this);
        A8B a8b2 = c8px.A01;
        if (!set.isEmpty()) {
        }
    }

    public C186688Pl(UserSession userSession, C8PX c8px, InterfaceC186578Pa interfaceC186578Pa, C186668Pj c186668Pj) {
        this.A08 = c186668Pj;
        this.A06 = c8px;
        this.A07 = interfaceC186578Pa;
        this.A04 = userSession;
        EnumC186698Pm enumC186698Pm = EnumC186698Pm.NEW;
        C1810281e c1810281e = new C1810281e(enumC186698Pm);
        this.A05 = c1810281e;
        c1810281e.A02(this);
        EnumC186698Pm enumC186698Pm2 = EnumC186698Pm.BITS_READY;
        c1810281e.A03(C186708Pn.class, enumC186698Pm, enumC186698Pm2);
        c1810281e.A03(C186718Po.class, enumC186698Pm, enumC186698Pm2);
        EnumC186698Pm enumC186698Pm3 = EnumC186698Pm.THREAD_READY;
        c1810281e.A03(C186728Pp.class, enumC186698Pm, enumC186698Pm3);
        EnumC186698Pm enumC186698Pm4 = EnumC186698Pm.BRUSH_MAKER_FAILED;
        c1810281e.A03(C186738Pq.class, enumC186698Pm, enumC186698Pm4);
        EnumC186698Pm enumC186698Pm5 = EnumC186698Pm.READY_TO_INITIALIZE;
        c1810281e.A03(C186708Pn.class, enumC186698Pm3, enumC186698Pm5);
        c1810281e.A03(C186718Po.class, enumC186698Pm3, enumC186698Pm5);
        c1810281e.A03(C186728Pp.class, enumC186698Pm2, enumC186698Pm5);
        c1810281e.A03(C186748Pr.class, enumC186698Pm5, EnumC186698Pm.BRUSH_READY);
        c1810281e.A03(C186758Ps.class, enumC186698Pm5, enumC186698Pm4);
    }
}
