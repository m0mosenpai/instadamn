package X;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167217da extends AbstractC51572Yf {
    public final Activity A00;
    public final C166587cU A01;
    public final C25814BbV A02;
    public final InterfaceC166347c3 A03;
    public final UserSession A04;
    public final C167207dZ A05;
    public final C62882tR A06;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C3e8 c3e8;
        float f;
        EnumC77683ds enumC77683ds;
        Integer num;
        C51722Yv c51722Yv;
        C2Z0 c2z0;
        C51722Yv c51722Yv2;
        Object obj;
        C14360o3.A0B(c76223bS, 0);
        C168127f7 c168127f7 = (C168127f7) AbstractC77073ct.A00(c76223bS, C167227db.A00).A03;
        Object A00 = AbstractC77183d4.A00(c76223bS, C167237dc.A00, new Object[0]);
        Object A002 = AbstractC77183d4.A00(c76223bS, new C206879Ds(this, 30), new Object[0]);
        InterfaceC166347c3 interfaceC166347c3 = this.A03;
        AbstractC77313dH.A00(c76223bS, new C9FP(14, c168127f7, this, A00), new Object[]{interfaceC166347c3});
        if (interfaceC166347c3 instanceof C166337c2) {
            C166337c2 c166337c2 = (C166337c2) interfaceC166347c3;
            C168137f8 c168137f8 = new C168137f8(new C206879Ds(this, 29));
            C3F0 c3f0 = new C3F0() { // from class: X.7df
                @Override // X.C3F1
                public final void A0I() {
                }

                @Override // X.C3F1
                public final void A0J() {
                }

                @Override // X.C3F1
                public final void A0K(C3OO c3oo) {
                }

                @Override // X.C3F1
                public final boolean A0L() {
                    return false;
                }

                @Override // X.C3F0
                public final boolean A0U(C3OO c3oo, C3OO c3oo2, int i, int i2, int i3, int i4) {
                    if (c3oo != c3oo2) {
                        A0C(c3oo);
                    }
                    A0C(c3oo2);
                    return true;
                }

                {
                    ((C3F0) this).A00 = false;
                }

                @Override // X.C3F0
                public final boolean A0R(C3OO c3oo) {
                    A0O(c3oo);
                    return true;
                }

                @Override // X.C3F0
                public final boolean A0S(C3OO c3oo) {
                    A0Q(c3oo);
                    return true;
                }

                @Override // X.C3F0
                public final boolean A0T(C3OO c3oo, int i, int i2, int i3, int i4) {
                    A0P(c3oo);
                    return true;
                }
            };
            C167207dZ c167207dZ = this.A05;
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 0);
            if (AbstractC65492xl.A00(userSession).A0C) {
                WeakReference weakReference = c167207dZ.A01;
                if (weakReference != null) {
                    obj = weakReference.get();
                } else {
                    obj = null;
                }
            } else {
                obj = c167207dZ.A00;
            }
            List A1Q = AbstractC16960so.A1Q(new C1I4() { // from class: X.7dg
                @Override // X.C1I4
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    int A03 = C0f9.A03(-2002729372);
                    C14360o3.A0B(recyclerView, 0);
                    super.onScrolled(recyclerView, i, i2);
                    C167217da.this.A02.A00 = new C9BA(!recyclerView.canScrollVertically(-1), !recyclerView.canScrollVertically(1), 2);
                    C0f9.A0A(-1382685897, A03);
                }
            }, this.A06);
            Integer valueOf = Integer.valueOf(R.id.sticky_header_list);
            long doubleToRawLongBits = Double.doubleToRawLongBits(0.0d);
            Integer num2 = C05F.A00;
            C2XE ArD = c76223bS.ArD();
            C2V3 c2v3 = ArD.A02.A01;
            C2VF c2vf = c2v3.A02;
            boolean z = c2v3.A0W;
            C168877gM c168877gM = new C168877gM(ArD);
            C75933ay c75933ay = C51722Yv.A02;
            C2WH A0J = AbstractC76963ci.A0J(null, c168877gM, new C51722Yv(new C51722Yv(null, new C9CT(num2, 100.0f, 0)), new C9CU(C05F.A01, 0, 9221401712017801217L)), null, null, null, null, null, false);
            AbstractC107374si.A01(A0J, AbstractC111324zv.A00(2178));
            c168877gM.A00(A0J, null, -1.0f, -1.0f);
            c168877gM.A01(c166337c2.A08, C167287dh.A00, new C9FN(2, A002, this, c166337c2));
            C2XH c2xh = c76223bS.ArD().A0D;
            C14360o3.A07(c2xh);
            return new C168977gW(c3f0, null, null, null, null, (InterfaceC168047ez) obj, AbstractC168947gT.A01(ArD, c2vf, num2, 1, Integer.MIN_VALUE, C2Z3.A00(c2xh, doubleToRawLongBits), false, z), c168877gM.A01, c168127f7, c168137f8, null, null, null, null, null, null, valueOf, null, A1Q, null, null, true, false);
        }
        if (interfaceC166347c3 instanceof C26165Bhq) {
            c3e8 = C3e8.CENTER;
            C75933ay c75933ay2 = C51722Yv.A02;
            Integer num3 = C05F.A00;
            f = 100.0f;
            enumC77683ds = null;
            C51722Yv c51722Yv3 = new C51722Yv(null, new C9CT(num3, 100.0f, 0));
            num = C05F.A01;
            c51722Yv = new C51722Yv(c51722Yv3, new C9CT(num, 100.0f, 0));
            c2z0 = new C2Z0(c76223bS.ArD(), new ArrayList());
            C166047bW c166047bW = ((C26165Bhq) interfaceC166347c3).A00;
            if (c166047bW != null && !c166047bW.A0d) {
                c51722Yv2 = new C51722Yv(null, new C9CT(num3, 100.0f, 0));
            }
            return AbstractC76963ci.A0J(c2z0, c76223bS, c51722Yv, enumC77683ds, enumC77683ds, enumC77683ds, c3e8, enumC77683ds, false);
        }
        if (interfaceC166347c3 instanceof C29125Csq) {
            c3e8 = C3e8.CENTER;
            C75933ay c75933ay3 = C51722Yv.A02;
            Integer num4 = C05F.A00;
            f = 100.0f;
            enumC77683ds = null;
            C51722Yv c51722Yv4 = new C51722Yv(null, new C9CT(num4, 100.0f, 0));
            num = C05F.A01;
            c51722Yv = new C51722Yv(c51722Yv4, new C9CT(num, 100.0f, 0));
            c2z0 = new C2Z0(c76223bS.ArD(), new ArrayList());
            c51722Yv2 = new C51722Yv(null, new C9CT(num4, 100.0f, 0));
        } else {
            throw new RuntimeException();
        }
        c2z0.A00(new C26593Boq(new C51722Yv(c51722Yv2, new C9CT(num, f, 0)), this.A02));
        return AbstractC76963ci.A0J(c2z0, c76223bS, c51722Yv, enumC77683ds, enumC77683ds, enumC77683ds, c3e8, enumC77683ds, false);
    }

    public C167217da(Activity activity, C166587cU c166587cU, C25814BbV c25814BbV, InterfaceC166347c3 interfaceC166347c3, UserSession userSession, C167207dZ c167207dZ, C62882tR c62882tR) {
        this.A03 = interfaceC166347c3;
        this.A00 = activity;
        this.A04 = userSession;
        this.A02 = c25814BbV;
        this.A01 = c166587cU;
        this.A06 = c62882tR;
        this.A05 = c167207dZ;
    }
}
