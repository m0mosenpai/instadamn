package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.LVp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48215LVp implements InterfaceC55932he {
    public static final C55942hf A08 = C55942hf.A04(70.0d, 5.0d);
    public MSD A00;
    public MSD A01;
    public final MSD A02;
    public final Stack A03;
    public final C55982hj A04;
    public final UserSession A05;
    public final MON A06;
    public final List A07;

    public C48215LVp(UserSession userSession, MON mon, MSD msd, List list) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A02 = msd;
        this.A06 = mon;
        this.A03 = new Stack();
        this.A07 = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractCollection) this.A07).add(it.next());
        }
        AbstractCollection abstractCollection = (AbstractCollection) this.A07;
        MSD msd2 = this.A02;
        abstractCollection.add(msd2);
        this.A00 = msd2;
        this.A01 = msd2;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A09(A08);
        A0R.A0A(this);
        A0R.A06 = true;
        this.A04 = A0R;
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A01;
        float f2 = 1.0f;
        if (f == 1.0f) {
            f2 = 0.0f;
        }
        float A02 = AbstractC13600mm.A02((float) c55982hj.A09.A00, f2, f, 0.0f, 1.0f);
        A00(A02);
        this.A06.DTh(this.A00, this.A01, A02);
    }

    private final void A00(float f) {
        for (MSD msd : this.A07) {
            if (msd == this.A01) {
                Iterator it = msd.Acr().iterator();
                while (it.hasNext()) {
                    View A09 = AbstractC43592JPx.A09(it);
                    int i = 4;
                    if (f < 1.0f) {
                        i = 0;
                    }
                    A09.setVisibility(i);
                    A09.setAlpha(1.0f - f);
                }
            } else if (msd == this.A00) {
                Iterator it2 = msd.Acr().iterator();
                while (it2.hasNext()) {
                    View A092 = AbstractC43592JPx.A09(it2);
                    A092.setVisibility(0);
                    A092.setAlpha(f);
                }
            }
        }
    }

    private final void A01(boolean z) {
        C55782hJ A00 = C55772hI.A00(this.A05);
        A00.A0C(this.A01, null, 0);
        this.A00.E2K();
        A00.A0D("not_activity_or_fragment", this.A00);
        float f = 0.0f;
        A00(0.0f);
        C55982hj c55982hj = this.A04;
        if (((float) c55982hj.A01) != 1.0f) {
            f = 1.0f;
        }
        double d = f;
        if (z) {
            c55982hj.A06(d);
        } else {
            c55982hj.A08(d, true);
            Dnk(c55982hj);
        }
    }

    public final void A02(MSD msd, boolean z) {
        MSD msd2 = this.A00;
        if (msd != msd2) {
            this.A01 = msd2;
            Stack stack = this.A03;
            stack.add(msd2);
            this.A00 = msd;
            ((MSD) stack.peek()).close();
            A01(z);
        }
    }

    public final boolean A03() {
        boolean CJQ = this.A00.CJQ();
        if (!CJQ && this.A00 != this.A02) {
            Stack stack = this.A03;
            if (!stack.isEmpty()) {
                this.A00.close();
                this.A01 = this.A00;
                this.A00 = (MSD) stack.pop();
                A01(true);
            }
            return true;
        }
        return CJQ;
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        for (MSD msd : this.A07) {
            if (msd == this.A01 || msd == this.A00) {
                Iterator it = msd.Acr().iterator();
                while (it.hasNext()) {
                    AbstractC43592JPx.A09(it).setLayerType(2, null);
                }
            }
        }
        A00(0.0f);
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        Iterator it = this.A07.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((MSD) it.next()).Acr().iterator();
            while (it2.hasNext()) {
                AbstractC43592JPx.A09(it2).setLayerType(0, null);
            }
        }
        A00(1.0f);
        this.A00.DhN();
        this.A01.CxN();
    }
}
