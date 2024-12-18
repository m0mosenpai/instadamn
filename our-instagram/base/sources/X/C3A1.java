package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.TifuViewModel;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3A1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3A1 {
    public final C3A3 A00;
    public final ConcurrentHashMap A01;

    public final void A03(Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("ComposePrepareBinder.prepare", -1565604060);
        }
        try {
            C46w c46w = (C46w) this.A01.get(obj);
            if (c46w == null || !C14360o3.A0K(c46w.A01, obj3)) {
                this.A00.ATR(new C9FY(26, obj3, this, obj2, obj));
            }
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1647476970);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1480263414);
            }
            throw th;
        }
    }

    public C3A1(C3A3 c3a3) {
        C14360o3.A0B(c3a3, 2);
        this.A00 = c3a3;
        this.A01 = new ConcurrentHashMap(10);
    }

    public final Object A01(Object obj) {
        int i;
        InterfaceC132105xl c44226JgW;
        C132355yE c132355yE;
        if (this instanceof C46u) {
            C46u c46u = (C46u) this;
            C206209Bd c206209Bd = (C206209Bd) obj;
            C14360o3.A0B(c206209Bd, 0);
            C77133cz c77133cz = (C77133cz) c206209Bd.A02;
            Context context = c46u.A00;
            C38321qM c38321qM = (C38321qM) c206209Bd.A00;
            C75113Zb c75113Zb = (C75113Zb) c206209Bd.A01;
            return c77133cz.A02(context, new C84953qj(context), c38321qM, c46u.A02, c75113Zb);
        }
        C3A0 c3a0 = (C3A0) this;
        C9BW c9bw = (C9BW) obj;
        C14360o3.A0B(c9bw, 0);
        if (Systrace.A0E(1L)) {
            C0fO.A01("TifuNetegoComposeBinder.createPreparableForInput", -1463748435);
        }
        try {
            C4dV c4dV = (C4dV) c9bw.A00;
            C119835bh c119835bh = (C119835bh) c9bw.A01;
            FragmentActivity fragmentActivity = c3a0.A00;
            if (Systrace.A0E(1L)) {
                C0fO.A01("TifuNetegoComposeBinder.createViewModel", -563474321);
            }
            try {
                UserSession userSession = c3a0.A02;
                InterfaceC11380iw interfaceC11380iw = c3a0.A01;
                AnonymousClass386 anonymousClass386 = c3a0.A03;
                if (c4dV.B5n() == C1XV.A0z) {
                    c44226JgW = new C132095xk(interfaceC11380iw, userSession);
                } else {
                    c44226JgW = new C44226JgW(interfaceC11380iw, userSession, AbstractC14490oL.A0A(fragmentActivity));
                }
                TifuViewModel tifuViewModel = new TifuViewModel(fragmentActivity, interfaceC11380iw, userSession, anonymousClass386, c44226JgW, c4dV, c119835bh, c3a0.A04);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-1780288082);
                }
                C207179Ew c207179Ew = new C207179Ew(10, tifuViewModel, c3a0);
                Object obj2 = new Object();
                if (Systrace.A0E(1L)) {
                    C0fO.A01("TifuNetegoComposeBinder.createPostNavigator", -195504707);
                }
                try {
                    c132355yE = new C132355yE(c207179Ew, new C9FO(23, c3a0, obj2, tifuViewModel), new C207179Ew(9, tifuViewModel, c3a0));
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1339519329);
                    }
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("TifuNetegoComposeBinder.createEventHandler", -701410389);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (Systrace.A0E(1L)) {
                        i = -1839332638;
                    } else {
                        throw th;
                    }
                }
                try {
                    C132375yH c132375yH = new C132375yH(c132355yE, interfaceC11380iw, c4dV.A04, new C206849Dp(obj2, 28), new C207179Ew(3, tifuViewModel, c3a0), new C207179Ew(4, tifuViewModel, c3a0), new C207179Ew(5, tifuViewModel, c3a0), new C207179Ew(6, tifuViewModel, c3a0), new C207179Ew(7, tifuViewModel, c3a0), new C207179Ew(8, tifuViewModel, c3a0), c207179Ew, new C206989Ed(obj2, 32));
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1409149923);
                    }
                    C206279Bk c206279Bk = new C206279Bk(1, tifuViewModel, c132355yE, c132375yH, obj2, c207179Ew);
                    if (!Systrace.A0E(1L)) {
                        return c206279Bk;
                    }
                    C0fO.A00(1963902476);
                    return c206279Bk;
                } catch (Throwable th2) {
                    th = th2;
                    if (Systrace.A0E(1L)) {
                        i = -1729654579;
                        C0fO.A00(i);
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (Systrace.A0E(1L)) {
                    i = -1698922131;
                } else {
                    throw th;
                }
            }
        } catch (Throwable th4) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1756703051);
            }
            throw th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0162 A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:5:0x001a, B:7:0x0026, B:8:0x0036, B:10:0x003b, B:12:0x0041, B:14:0x0047, B:16:0x0051, B:23:0x0079, B:67:0x0190, B:25:0x0082, B:27:0x0086, B:28:0x0098, B:29:0x00ab, B:30:0x00c0, B:32:0x00ca, B:46:0x015c, B:48:0x0162, B:64:0x0184, B:66:0x018a, B:69:0x0076, B:34:0x00d2, B:36:0x00e0, B:42:0x00ff, B:45:0x0159, B:52:0x0150, B:59:0x0176, B:61:0x017c, B:62:0x0182), top: B:4:0x001a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.view.View r19, java.lang.Object r20, java.lang.Object r21, X.InterfaceC16820sZ r22) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3A1.A02(android.view.View, java.lang.Object, java.lang.Object, X.0sZ):void");
    }
}
