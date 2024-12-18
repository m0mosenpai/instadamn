package X;

import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.view.ViewGroup;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.9EP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9EP extends C0YY implements InterfaceC16600sD {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9EP(Object obj, int i) {
        super(4);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object value;
        C5e8 c5e8;
        C121125e6 c121125e6;
        ReentrantReadWriteLock reentrantReadWriteLock;
        User user;
        C6XW c6xw;
        C41618Ib8 c41618Ib8;
        InterfaceC16820sZ meb;
        C41181vS c41181vS;
        int i;
        C41181vS c41181vS2;
        int i2;
        EnumC129395t1 enumC129395t1;
        C38321qM c38321qM;
        C27111Bxa c27111Bxa;
        switch (this.A00) {
            case 0:
                ((Number) obj2).intValue();
                C5Tl c5Tl = (C5Tl) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 6) == 0) {
                    int i3 = 2;
                    if (c5Tl.AH4(obj)) {
                        i3 = 4;
                    }
                    intValue |= i3;
                }
                if ((intValue & 131) == 130 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(1936675074, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
                    }
                    ((InterfaceC16610sE) this.A01).invoke(obj, c5Tl, Integer.valueOf(intValue & 14));
                    if (C0fH.A02()) {
                        C0fH.A00(1404572560);
                    }
                }
                return C0eB.A00;
            case 1:
                int i4 = ((C122165gC) obj3).A00;
                int i5 = ((C122175gD) obj4).A00;
                C122585gt c122585gt = (C122585gt) this.A01;
                InterfaceC74963Ym EKD = c122585gt.A04.EKD((AbstractC119845bi) obj, (C5W5) obj2, i4, i5);
                if (!(EKD instanceof C122685h3)) {
                    ABI abi = new ABI(EKD, c122585gt.A00);
                    c122585gt.A00 = abi;
                    value = abi.A00;
                } else {
                    value = EKD.getValue();
                }
                C14360o3.A0C(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return value;
            case 2:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                InterfaceC37501on interfaceC37501on = (InterfaceC37501on) this.A01;
                C14360o3.A0A(sQLiteQuery);
                interfaceC37501on.ADs(new C37531oq(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 3:
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                C14360o3.A0B(obj, 0);
                try {
                    c5e8 = (C5e8) this.A01;
                    c121125e6 = c5e8.A02;
                    reentrantReadWriteLock = c121125e6.A00;
                } catch (InterruptedException e) {
                    C0K8.A0F("BanyanCache", "Unable to update cutover status for this user.", e);
                }
                if (reentrantReadWriteLock.writeLock().tryLock(1L, TimeUnit.SECONDS)) {
                    try {
                        c121125e6.A00();
                        C121375ed c121375ed = (C121375ed) c5e8.A09.get(obj);
                        c121125e6.A00();
                        User user2 = (User) c5e8.A0A.get(obj);
                        if (user2 == null && c121375ed == null) {
                            reentrantReadWriteLock.writeLock().unlock();
                        } else {
                            if (user2 != null) {
                                if (bool != null) {
                                    user2.A03.EVK(bool);
                                    if (bool2 != null) {
                                        user2.A03.ET5(bool2);
                                        user2.A03.ET6(false);
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                            if (c121375ed != null) {
                                Iterator it = c121375ed.A0B.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        user = (User) it.next();
                                        if (user.getId().equals(obj)) {
                                        }
                                    } else {
                                        user = null;
                                    }
                                }
                                if (user != null) {
                                    if (bool != null) {
                                        user.A03.EVK(bool);
                                        if (bool2 != null) {
                                            user.A03.ET5(bool2);
                                            user.A03.ET6(false);
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            }
                            reentrantReadWriteLock.writeLock().unlock();
                        }
                        return C0eB.A00;
                    } catch (Throwable th) {
                        reentrantReadWriteLock.writeLock().unlock();
                        throw th;
                    }
                }
                throw new InterruptedException(AbstractC111324zv.A00(3612));
            case 4:
                C7T3 c7t3 = (C7T3) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                C14360o3.A0B(c7t3, 0);
                ((C7YJ) this.A01).A01((EnumC46283KeF) obj4, c7t3, (RtcStartCoWatchPlaybackArguments) obj3, booleanValue);
                return C0eB.A00;
            case 5:
                C41181vS c41181vS3 = (C41181vS) obj;
                C14360o3.A0B(c41181vS3, 0);
                C14360o3.A0B(obj2, 1);
                C14360o3.A0B(obj3, 2);
                c6xw = ((C6XU) this.A01).A02;
                C14360o3.A0B(c6xw, 0);
                Context context = c6xw.A04().getContext();
                c41618Ib8 = c41181vS3.A0E;
                c41618Ib8.getClass();
                meb = new MEB(31, obj2, context, obj3, c41181vS3, c6xw);
                c6xw.A06(c41618Ib8, meb);
                return C0eB.A00;
            case 6:
                C41181vS c41181vS4 = (C41181vS) obj;
                C14360o3.A0B(c41181vS4, 0);
                C14360o3.A0B(obj2, 1);
                C14360o3.A0B(obj3, 2);
                C14360o3.A0B(obj4, 3);
                C140536Xh c140536Xh = ((C6XU) this.A01).A01;
                C14360o3.A0B(c140536Xh, 0);
                C41618Ib8 c41618Ib82 = c41181vS4.A0E;
                c41618Ib82.getClass();
                List list = c41618Ib82.A03.A01;
                c140536Xh.A05();
                Context context2 = c140536Xh.A04().getContext();
                ViewGroup A04 = c140536Xh.A04();
                if (A04.isLaidOut() && !A04.isLayoutRequested()) {
                    c140536Xh.A06(c41618Ib82, new C50245MHa(6, c140536Xh, list, obj2, obj4, A04, context2, obj3));
                } else {
                    A04.addOnLayoutChangeListener(new AT5(1, obj2, context2, c41181vS4, c140536Xh, list, obj3, obj4));
                }
                c140536Xh.A04().post(new RunnableC43126J4p(c41181vS4, c140536Xh));
                return C0eB.A00;
            case 7:
                c41181vS = (C41181vS) obj;
                C14360o3.A0B(c41181vS, 0);
                i = 1;
                C14360o3.A0B(obj2, 1);
                c6xw = ((C6XU) this.A01).A03;
                C14360o3.A0B(c6xw, 0);
                c41618Ib8 = c41181vS.A0E;
                c41618Ib8.getClass();
                meb = new C43210J8h(i, c41181vS, c6xw, obj2);
                c6xw.A06(c41618Ib8, meb);
                return C0eB.A00;
            case 8:
                c41181vS2 = (C41181vS) obj;
                C14360o3.A0B(c41181vS2, 0);
                C14360o3.A0B(obj2, 1);
                C14360o3.A0B(obj3, 2);
                c6xw = ((C6XU) this.A01).A04;
                C14360o3.A0B(c6xw, 0);
                c41618Ib8 = c41181vS2.A0E;
                c41618Ib8.getClass();
                i2 = 18;
                meb = new C29901DGp(i2, obj2, c41181vS2, obj3, c6xw);
                c6xw.A06(c41618Ib8, meb);
                return C0eB.A00;
            case 9:
                c41181vS2 = (C41181vS) obj;
                C14360o3.A0B(c41181vS2, 0);
                C14360o3.A0B(obj2, 1);
                C14360o3.A0B(obj3, 2);
                c6xw = ((C6XU) this.A01).A05;
                C14360o3.A0B(c6xw, 0);
                c41618Ib8 = c41181vS2.A0E;
                c41618Ib8.getClass();
                i2 = 19;
                meb = new C29901DGp(i2, obj2, c41181vS2, obj3, c6xw);
                c6xw.A06(c41618Ib8, meb);
                return C0eB.A00;
            case 10:
                c41181vS = (C41181vS) obj;
                C14360o3.A0B(c41181vS, 0);
                C14360o3.A0B(obj2, 1);
                c6xw = ((C6XU) this.A01).A06;
                C14360o3.A0B(c6xw, 0);
                c41618Ib8 = c41181vS.A0E;
                c41618Ib8.getClass();
                i = 2;
                meb = new C43210J8h(i, c41181vS, c6xw, obj2);
                c6xw.A06(c41618Ib8, meb);
                return C0eB.A00;
            case 11:
                c41181vS = (C41181vS) obj;
                C14360o3.A0B(c41181vS, 0);
                C14360o3.A0B(obj2, 1);
                c6xw = ((C6XU) this.A01).A07;
                C14360o3.A0B(c6xw, 0);
                c41618Ib8 = c41181vS.A0E;
                c41618Ib8.getClass();
                i = 3;
                meb = new C43210J8h(i, c41181vS, c6xw, obj2);
                c6xw.A06(c41618Ib8, meb);
                return C0eB.A00;
            default:
                C120985dq c120985dq = (C120985dq) obj;
                int intValue2 = ((Number) obj2).intValue();
                int intValue3 = ((Number) obj3).intValue();
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                C59952od c59952od = (C59952od) this.A01;
                C37540Gfw c37540Gfw = c59952od.A09;
                if (c37540Gfw == null) {
                    C14360o3.A0F("clipsViewerFragmentViewModel");
                    throw C00O.createAndThrow();
                }
                int i6 = intValue3 - intValue2;
                if (c120985dq != null) {
                    enumC129395t1 = c120985dq.A01;
                } else {
                    enumC129395t1 = null;
                }
                if (enumC129395t1 == EnumC129395t1.A08) {
                    i6--;
                }
                int A0B = c37540Gfw.A0B();
                if (c37540Gfw.A0W.A1Z && booleanValue2) {
                    if (intValue2 == 1) {
                        C37540Gfw.A04(c37540Gfw);
                    }
                } else if (i6 <= A0B) {
                    C37540Gfw.A05(c37540Gfw, C16930sl.A00, false, false);
                }
                C25363BKg c25363BKg = (C25363BKg) c59952od.A14.getValue();
                if (c25363BKg.A08 && c120985dq != null && (c38321qM = c120985dq.A02) != null && c38321qM.A66()) {
                    C25482BOw c25482BOw = c25363BKg.A01;
                    Object value2 = c25482BOw.A02.getValue();
                    if ((value2 instanceof C27111Bxa) && (c27111Bxa = (C27111Bxa) value2) != null && c27111Bxa.A01) {
                        AbstractC23641Du.A05(AnonymousClass191.A00, new B5g(c27111Bxa, c25482BOw, null, 9), ((C4A7) c25482BOw).A01);
                    }
                }
                return C0eB.A00;
        }
    }
}
