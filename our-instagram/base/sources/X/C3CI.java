package X;

import android.view.View;

/* renamed from: X.3CI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3CI implements C36Z {
    @Override // X.C36Z
    public void CtG(Object obj) {
        if (this instanceof C3CH) {
            C3CM c3cm = (C3CM) obj;
            C14360o3.A0B(c3cm, 0);
            C36Y c36y = ((C3CH) this).A00;
            c36y.A04.DNd(c3cm.BQN());
        }
    }

    @Override // X.C36Z
    public void CtH(Object obj) {
        if (this instanceof C3CH) {
            C3CM c3cm = (C3CM) obj;
            C14360o3.A0B(c3cm, 0);
            C36Y c36y = ((C3CH) this).A00;
            c36y.A04.Dwc(c3cm.BQN());
        }
    }

    @Override // X.C36Z
    public void CtI(Object obj, int i) {
        if (this instanceof C3CH) {
            C3CM c3cm = (C3CM) obj;
            C14360o3.A0B(c3cm, 0);
            C36Y c36y = ((C3CH) this).A00;
            c36y.A04.DNv(c3cm.BQN(), i);
        }
    }

    @Override // X.C36Z
    public void CtJ(Object obj, int i) {
        if (this instanceof C3CH) {
            C3CM c3cm = (C3CM) obj;
            C14360o3.A0B(c3cm, 0);
            ((C3CH) this).A00.CtJ(c3cm.BQN(), i);
        }
    }

    @Override // X.C36Z
    public final void CtL(View view, Object obj, double d) {
        if (this instanceof C3CH) {
            C3CM c3cm = (C3CM) obj;
            C14360o3.A0B(c3cm, 0);
            C36Y c36y = ((C3CH) this).A00;
            c36y.A04.DNy(view, c3cm.BQN(), d);
        }
    }
}
