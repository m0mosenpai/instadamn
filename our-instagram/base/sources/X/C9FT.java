package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9FT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FT extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FT(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i2;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String Aw8;
        String queryParameter;
        int i;
        switch (this.A00) {
            case 0:
                if (obj != this.A04) {
                    if (obj instanceof InterfaceC74933Yj) {
                        int i2 = ((C5U4) this.A02).A00;
                        C18630vq c18630vq = (C18630vq) this.A03;
                        int i3 = i2 - this.A01;
                        int A03 = c18630vq.A03(obj);
                        if (A03 >= 0) {
                            i = c18630vq.A02[A03];
                        } else {
                            i = Integer.MAX_VALUE;
                        }
                        c18630vq.A06(obj, Math.min(i3, i));
                    }
                    return C0eB.A00;
                }
                throw new IllegalStateException("A derived state calculation cannot read itself");
            case 1:
                InterfaceC1128857w interfaceC1128857w = (InterfaceC1128857w) obj;
                C14360o3.A0B(interfaceC1128857w, 0);
                List<C09530e4> list = (List) this.A03;
                int i4 = this.A01;
                C119625bL c119625bL = (C119625bL) this.A02;
                C5Y1 c5y1 = (C5Y1) this.A04;
                float f = 0.0f;
                for (C09530e4 c09530e4 : list) {
                    long j = ((C1132359l) c09530e4.A01).A00;
                    float f2 = ((C119145aW) c09530e4.A00).A00;
                    float EqT = interfaceC1128857w.EqT(f2) / 2.0f;
                    float f3 = c119625bL.A00;
                    interfaceC1128857w.AQe(null, C119815bf.A00, EqT, 1.0f, 3, j, AbstractC119395aw.A00(f + (i4 * (interfaceC1128857w.EqT(f3) - (interfaceC1128857w.EqT(f3) * ((Number) c5y1.A04.getValue()).floatValue()))), 0.0f));
                    f += interfaceC1128857w.EqT(f2) + interfaceC1128857w.EqT(f3);
                }
                return C0eB.A00;
            case 2:
                Context context = (Context) obj;
                C14360o3.A0B(context, 0);
                C101024gI c101024gI = (C101024gI) this.A04;
                C38321qM c38321qM = (C38321qM) this.A02;
                int i5 = this.A01 - 1;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A03;
                UserSession userSession = c101024gI.A00;
                AndroidLink A02 = AbstractC905941u.A02(context, userSession, c38321qM, i5, false);
                if (A02 != null && (Aw8 = A02.Aw8()) != null && Aw8.length() != 0) {
                    String Aw82 = A02.Aw8();
                    if (Aw82 != null) {
                        android.net.Uri A032 = AbstractC08820cl.A03(Aw82);
                        if (A032 != null && (queryParameter = A032.getQueryParameter("shopping_session_id")) != null && queryParameter.length() != 0) {
                            C38687GzS A01 = AbstractC41355ISa.A01(userSession, c38321qM, A02, interfaceC11380iw.getModuleName());
                            if (A01 != null) {
                                AbstractC191798eb.A04(context, new C191778eZ(userSession), A01.A01, (HashMap) A01.A00, AbstractC22797A3q.A00);
                            } else {
                                throw new IllegalStateException("link is valid and bloksRequestInput cannot be null");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                return C0eB.A00;
            case 3:
                C107124sI c107124sI = (C107124sI) this.A02;
                C9C1 c9c1 = (C9C1) this.A04;
                C75113Zb c75113Zb = (C75113Zb) this.A03;
                int i6 = this.A01;
                C14360o3.A0B(c9c1, 0);
                C14360o3.A0B(c75113Zb, 1);
                c107124sI.A00.A00.D4G((C38321qM) c9c1.A01, c75113Zb, null, i6, false);
                return C0eB.A00;
            default:
                ((CWU) this.A03).A03(((C81283jy) this.A02).A0F, (C25993Beh) this.A04, this.A01);
                return C0eB.A00;
        }
    }
}
