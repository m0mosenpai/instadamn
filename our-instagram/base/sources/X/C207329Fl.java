package X;

import android.animation.Animator;
import android.os.Handler;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.9Fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207329Fl extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207329Fl(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(1);
        this.A00 = i;
        this.A06 = obj;
        this.A07 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
        this.A04 = obj6;
        this.A05 = obj7;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Class<?> cls;
        if (this.A00 != 0) {
            C85233rE c85233rE = (C85233rE) this.A06;
            C38321qM c38321qM = c85233rE.A07.A01;
            if (c85233rE.A02 == EnumC85043qs.A05) {
                C51762Yz c51762Yz = (C51762Yz) this.A03;
                if (!((Boolean) c51762Yz.A03).booleanValue()) {
                    c51762Yz.A01(true);
                    C84913qf c84913qf = (C84913qf) this.A07;
                    AbstractC85353rQ.A02((Handler) this.A02, c84913qf.A00, new C23717Aeq((Animator) this.A01, (Animator) this.A04, (C51762Yz) this.A05, c84913qf, c38321qM));
                }
            }
        } else {
            C2YN c2yn = (C2YN) obj;
            C14360o3.A0B(c2yn, 0);
            c2yn.A01 = true;
            C77993eR c77993eR = (C77993eR) this.A06;
            C170197iY c170197iY = (C170197iY) this.A07;
            c77993eR.A00 = c170197iY.A0D;
            Object obj2 = this.A01;
            try {
                c2yn.A00 = C00Q.A03("recycler-decorations", StringTreeSet.MAX_SYMBOL_COUNT);
                c2yn.A02(new C30484DbT(18, obj2, c170197iY), new Object[]{c170197iY.A0C, obj2});
                c2yn.A00 = null;
                C51762Yz c51762Yz2 = (C51762Yz) this.A02;
                try {
                    c2yn.A00 = C00Q.A03("recycler-equivalent-mount", StringTreeSet.MAX_SYMBOL_COUNT);
                    Object obj3 = c51762Yz2.A03;
                    C2Z7 c2z7 = c170197iY.A0A;
                    Boolean valueOf = Boolean.valueOf(c170197iY.A0E);
                    Boolean valueOf2 = Boolean.valueOf(c170197iY.A0H);
                    Integer valueOf3 = Integer.valueOf(c170197iY.A01);
                    Integer valueOf4 = Integer.valueOf(c170197iY.A06);
                    Integer valueOf5 = Integer.valueOf(c170197iY.A05);
                    Boolean valueOf6 = Boolean.valueOf(c170197iY.A0G);
                    Boolean valueOf7 = Boolean.valueOf(c170197iY.A0I);
                    Boolean valueOf8 = Boolean.valueOf(c170197iY.A0O);
                    Integer valueOf9 = Integer.valueOf(c170197iY.A00);
                    Integer valueOf10 = Integer.valueOf(c170197iY.A04);
                    C3F1 c3f1 = c170197iY.A07;
                    if (c3f1 != null) {
                        cls = c3f1.getClass();
                    } else {
                        cls = null;
                    }
                    c2yn.A02(new C30484DbT(19, c77993eR, c170197iY), new Object[]{obj3, c2z7, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, 0, valueOf6, 0, valueOf7, valueOf8, valueOf9, null, valueOf10, cls});
                    c2yn.A00 = null;
                    Object obj4 = this.A03;
                    Object obj5 = this.A04;
                    Object obj6 = this.A05;
                    try {
                        c2yn.A00 = C00Q.A03("recycler-equivalent-bind", StringTreeSet.MAX_SYMBOL_COUNT);
                        c2yn.A02(new DT0(1, c170197iY, obj4, obj6, obj5), new Object[]{new Object()});
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        }
        return C0eB.A00;
    }
}
