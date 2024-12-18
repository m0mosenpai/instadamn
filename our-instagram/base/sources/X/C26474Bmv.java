package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import java.util.BitSet;
import java.util.List;

/* renamed from: X.Bmv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26474Bmv extends AbstractC51572Yf {
    public final Drawable A02;
    public final C51722Yv A03;
    public final List A05;
    public final boolean A06;
    public final String A04 = "SpotlightMediaItemComponent";
    public final int A00 = 1750;
    public final int A01 = 2500;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C27811Wj A00 = C1X4.A00(C27771Wf.A0b);
        Drawable drawable = this.A02;
        if (drawable == null) {
            drawable = null;
        }
        A00.A0C = drawable;
        A00.A0R = null;
        A00.A03 = 0;
        A00.A0H = InterfaceC27851Wn.A01;
        C27771Wf c27771Wf = new C27771Wf(A00);
        C26276Bjj c26276Bjj = new C26276Bjj(new C26655Bpq(), c76223bS.A05);
        int i = this.A00;
        C26655Bpq c26655Bpq = c26276Bjj.A00;
        c26655Bpq.A00 = i;
        BitSet bitSet = c26276Bjj.A02;
        bitSet.set(0);
        c26655Bpq.A01 = this.A01;
        bitSet.set(1);
        c26655Bpq.A05 = this.A06;
        List list = this.A05;
        if (list != null) {
            if (c26655Bpq.A04.isEmpty()) {
                c26655Bpq.A04 = list;
            } else {
                c26655Bpq.A04.addAll(list);
            }
        }
        c26655Bpq.A03 = CallerContext.A01(this.A04);
        c26655Bpq.A02 = c27771Wf;
        AbstractC77743dy.A00(c26276Bjj, this.A03);
        AbstractC77733dx.A00(bitSet, c26276Bjj.A03, 2);
        c26276Bjj.A03();
        return c26655Bpq;
    }

    public C26474Bmv(Drawable drawable, C51722Yv c51722Yv, List list, boolean z) {
        this.A05 = list;
        this.A02 = drawable;
        this.A06 = z;
        this.A03 = c51722Yv;
    }
}
