package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: X.7L5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7L5 {
    public DirectMessageIdentifier A00;
    public boolean A02;
    public final LinearLayoutManager A04;
    public final RecyclerView A05;
    public final UserSession A06;
    public final C7L6 A07;
    public final InterfaceC163557Ts A08;
    public final C7LU A09;
    public final C7IN A0A;
    public final C33T A0B;
    public final java.util.Set A0C;
    public final boolean A0F;
    public final Rect A03 = new Rect();
    public final InterfaceC09390do A0D = AbstractC09440dt.A01(new C206869Dr(this, 35));
    public final InterfaceC09390do A0E = AbstractC09440dt.A01(new C206869Dr(this, 36));
    public Integer A01 = C05F.A00;

    public final void A00(final boolean z) {
        if (this.A02) {
            C11T.A02(new Runnable(this) { // from class: X.7MI
                public final /* synthetic */ C7L5 A00;

                {
                    this.A00 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C17v c17v;
                    View A0d;
                    View findViewById;
                    Object A0V;
                    C7D8 CFg;
                    C38321qM BQZ;
                    C7LU c7lu;
                    if (z) {
                        C7L5 c7l5 = this.A00;
                        Object value = c7l5.A0D.getValue();
                        C14360o3.A07(value);
                        if (((Boolean) value).booleanValue() && (c7lu = c7l5.A09) != null && c7lu.A00 == null) {
                            java.util.Set singleton = Collections.singleton(78);
                            C14360o3.A07(singleton);
                            c7lu.A02(c7l5.A04, c7l5.A05, singleton, C18U.A06(C06090Tz.A05, c7l5.A06, 36322010141370317L));
                            return;
                        }
                    }
                    C7L5 c7l52 = this.A00;
                    C7IN c7in = c7l52.A0A;
                    if (c7in.A04 == C05F.A01) {
                        Object value2 = c7l52.A0E.getValue();
                        C14360o3.A07(value2);
                        if (((Boolean) value2).booleanValue()) {
                            return;
                        }
                    }
                    LinearLayoutManager linearLayoutManager = c7l52.A04;
                    int A1a = linearLayoutManager.A1a();
                    int A1b = linearLayoutManager.A1b();
                    if (A1a != -1) {
                        Integer num = c7l52.A01;
                        Integer num2 = C05F.A00;
                        if (num == num2) {
                            c17v = new C17u(A1a, A1b);
                        } else {
                            c17v = new C17v(A1b, A1a, -1);
                        }
                        int i = c17v.A00;
                        int i2 = c17v.A01;
                        int i3 = c17v.A02;
                        if (i3 <= 0 ? !(i3 >= 0 || i2 > i) : i <= i2) {
                            while (true) {
                                InterfaceC163557Ts interfaceC163557Ts = c7l52.A08;
                                DirectMessageIdentifier BT9 = interfaceC163557Ts.BT9(new JTP(c7l52), i, true);
                                if (BT9 != null && (A0d = linearLayoutManager.A0d(i)) != null && (findViewById = A0d.findViewById(R.id.media_container)) != null) {
                                    if (findViewById.getGlobalVisibleRect(c7l52.A03) && r1.height() >= findViewById.getHeight() * 0.95f) {
                                        DirectMessageIdentifier directMessageIdentifier = c7l52.A00;
                                        if (directMessageIdentifier != null && directMessageIdentifier.A02(BT9)) {
                                            return;
                                        }
                                        c7l52.A00 = null;
                                        c7in.A02 = null;
                                        if (c7in.A04 == C05F.A0C) {
                                            c7in.A03("scroll");
                                        }
                                        UserSession userSession = c7l52.A06;
                                        if (!C3Q3.A00(userSession).A00()) {
                                            return;
                                        }
                                        if (C18U.A06(C06090Tz.A05, userSession, 36317809663743596L)) {
                                            A0V = interfaceC163557Ts.BK0(i);
                                        } else {
                                            A0V = c7l52.A05.A0V(i);
                                        }
                                        if (!(A0V instanceof C7AX) || (CFg = ((C7AX) A0V).CFg(BT9)) == null || (BQZ = CFg.BQZ()) == null) {
                                            return;
                                        }
                                        BQZ.CFR();
                                        c7l52.A00 = BT9;
                                        C48649Lfa BT0 = interfaceC163557Ts.BT0(BT9, i);
                                        if (c7in.A04 == num2) {
                                            c7in.A01(BT0, CFg);
                                            return;
                                        } else {
                                            c7in.A02 = CFg;
                                            return;
                                        }
                                    }
                                }
                                if (i == i2) {
                                    break;
                                } else {
                                    i += i3;
                                }
                            }
                        }
                    }
                    c7l52.A00 = null;
                    c7in.A02 = null;
                    if (c7in.A04 != C05F.A0C) {
                        return;
                    }
                    c7in.A03("scroll");
                }
            });
        }
    }

    public C7L5(LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, UserSession userSession, InterfaceC163557Ts interfaceC163557Ts, C7IN c7in, boolean z) {
        C7LU c7lu;
        this.A06 = userSession;
        this.A0A = c7in;
        this.A05 = recyclerView;
        this.A04 = linearLayoutManager;
        this.A08 = interfaceC163557Ts;
        this.A0F = z;
        Object value = this.A0D.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue()) {
            c7lu = new C7LU(new YFA(this));
        } else {
            c7lu = null;
        }
        this.A09 = c7lu;
        this.A0B = new C33T();
        this.A07 = new C7L6(this);
        this.A0C = new LinkedHashSet();
    }
}
