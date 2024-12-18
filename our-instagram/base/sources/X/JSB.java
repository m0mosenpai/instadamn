package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class JSB implements InterfaceC13000lm {
    public Map A00;
    public Map A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final UserSession A0A;
    public final C23031Ai A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final int A0E;

    public static final boolean A01(JSB jsb, EnumC44047JdY enumC44047JdY) {
        InterfaceC19630xq interfaceC19630xq;
        String str;
        C51761Mtk c51761Mtk = (C51761Mtk) jsb.A01.get(enumC44047JdY);
        if (c51761Mtk != null && jsb.A02(enumC44047JdY, (MRV) c51761Mtk.A00)) {
            int ordinal = enumC44047JdY.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    interfaceC19630xq = jsb.A0B.A01;
                    str = "inbox_receiver_reminder_impression_count";
                } else {
                    throw new RuntimeException();
                }
            } else {
                interfaceC19630xq = jsb.A0B.A01;
                str = "inbox_sender_reminder_impression_count";
            }
            if (interfaceC19630xq.getInt(str, 0) <= jsb.A0E) {
                return true;
            }
        }
        return false;
    }

    private final boolean A02(EnumC44047JdY enumC44047JdY, MRV mrv) {
        int i;
        if (mrv != null) {
            long C8g = mrv.C8g();
            if (Long.valueOf(C8g) != null) {
                if (enumC44047JdY == EnumC44047JdY.A04) {
                    i = this.A04;
                } else {
                    i = this.A03;
                }
                int i2 = this.A08;
                long hours = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - C8g);
                if (i <= hours && hours <= i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void A03(EnumC44047JdY enumC44047JdY, MRV mrv, InterfaceC50518MRv interfaceC50518MRv) {
        C2EY c2ey;
        String str;
        long j;
        String str2;
        User user;
        if (this.A0C && !A01(this, enumC44047JdY)) {
            if (interfaceC50518MRv.C7g() == 1003 || interfaceC50518MRv.C7g() == 1004) {
                if (mrv != null) {
                    c2ey = mrv.Ar9();
                } else {
                    c2ey = null;
                }
                if (c2ey != C2EY.A0G && A02(enumC44047JdY, mrv)) {
                    UserSession userSession = this.A0A;
                    List A0Y = AbstractC001800i.A0Y(C2JD.A00(userSession).Bkx(interfaceC50518MRv.Axg(), true));
                    int size = A0Y.size();
                    int i = this.A07;
                    if (size >= i) {
                        List A0i = AbstractC001800i.A0i(A0Y, C17s.A0C(0, i));
                        if (TimeUnit.MICROSECONDS.toHours(((C83403nh) AbstractC001800i.A0I(A0i)).C8i() - ((C83403nh) AbstractC001800i.A0K(A0i)).C8i()) < this.A06) {
                            return;
                        }
                    }
                    if (C18U.A06(C06090Tz.A06, userSession, 36326030230763083L)) {
                        Object A0J = AbstractC001800i.A0J(interfaceC50518MRv.Bl6());
                        if (!(A0J instanceof User) || (user = (User) A0J) == null || !user.A26() || !user.A27()) {
                            return;
                        }
                    }
                    if (mrv != null) {
                        str = mrv.getId();
                    } else {
                        str = null;
                    }
                    InterfaceC19630xq interfaceC19630xq = this.A0B.A01;
                    if (!interfaceC19630xq.C2v("inbox_recent_reminder_message_ids").contains(str) && !this.A0D) {
                        int ordinal = enumC44047JdY.ordinal();
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (ordinal != 0) {
                            j = 36326030231418446L;
                        } else {
                            j = 36326030231352909L;
                        }
                        if (C18U.A06(c06090Tz, userSession, j)) {
                            this.A01.put(enumC44047JdY, new C51761Mtk(mrv, interfaceC50518MRv));
                            A00(this);
                            if (mrv != null) {
                                str2 = mrv.getId();
                            } else {
                                str2 = null;
                            }
                            if (interfaceC19630xq.C2v("inbox_recent_reminder_message_ids").size() > 100) {
                                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                                ARD.EEj("inbox_recent_reminder_message_ids");
                                ARD.apply();
                            }
                            java.util.Set A0j = AbstractC001800i.A0j(interfaceC19630xq.C2v("inbox_recent_reminder_message_ids"));
                            A0j.add(str2);
                            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                            ARD2.E7L("inbox_recent_reminder_message_ids", A0j);
                            ARD2.apply();
                        }
                    }
                }
            }
        }
    }

    public final boolean A04(String str) {
        String str2;
        MRV mrv;
        if (this.A0C) {
            Collection<C51761Mtk> values = this.A01.values();
            if (values != null && values.isEmpty()) {
                return false;
            }
            for (C51761Mtk c51761Mtk : values) {
                if (c51761Mtk != null && (mrv = (MRV) c51761Mtk.A00) != null) {
                    str2 = mrv.getId();
                } else {
                    str2 = null;
                }
                if (C14360o3.A0K(str2, str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (this.A0C) {
            A00(this);
            this.A02 = false;
        }
    }

    public JSB(UserSession userSession, Context context) {
        AbstractC167017dG.A1P(userSession, context);
        this.A0A = userSession;
        this.A09 = context;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A05 = AbstractC25225BEi.A07(c06090Tz, userSession, 36607505207858798L);
        this.A0C = C18U.A06(c06090Tz, userSession, 36326030230697546L);
        this.A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36607505207989872L);
        this.A06 = AbstractC25225BEi.A07(c06090Tz, userSession, 36607505207924335L);
        this.A0E = AbstractC25225BEi.A07(c06090Tz, userSession, 36607505207596650L);
        this.A04 = AbstractC25225BEi.A07(c06090Tz, userSession, 36607505207662187L);
        this.A03 = AbstractC25225BEi.A07(c06090Tz, userSession, 36607505207727724L);
        this.A08 = AbstractC25225BEi.A07(c06090Tz, userSession, 36607505207793261L);
        this.A0D = C18U.A06(C06090Tz.A06, userSession, 36329384600158521L);
        this.A01 = AbstractC166987dD.A1G();
        this.A00 = AbstractC166987dD.A1G();
        this.A0B = AbstractC23021Ah.A00(userSession);
        Map map = this.A00;
        EnumC44047JdY enumC44047JdY = EnumC44047JdY.A04;
        Boolean A0a = AbstractC166997dE.A0a();
        map.put(enumC44047JdY, A0a);
        this.A00.put(EnumC44047JdY.A03, A0a);
    }

    public static final void A00(JSB jsb) {
        String str;
        HashMap A1G = AbstractC166987dD.A1G();
        Map map = jsb.A01;
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            C51761Mtk c51761Mtk = (C51761Mtk) map.get((EnumC44047JdY) A12.next());
            if (c51761Mtk != null && (str = ((InterfaceC50518MRv) c51761Mtk.A02).Axg().A00) != null) {
                A1G.put(str, Double.valueOf(r1.A00));
            }
        }
        C23031Ai.A05(jsb.A0B, "inbox_reminder_thread_map", A1G);
    }
}
