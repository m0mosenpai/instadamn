package X;

import com.instagram.business.fragment.ConnectFBPageFragment;

/* renamed from: X.GGc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36707GGc implements GYL {
    public final int A00;
    public final Object A01;

    public C36707GGc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GYL
    public final void onCancel() {
        switch (this.A00) {
            case 0:
                ConnectFBPageFragment.class.toString();
                return;
            case 1:
                return;
            default:
                C32287EJz c32287EJz = (C32287EJz) this.A01;
                EQ2 eq2 = c32287EJz.A03;
                if (eq2 == null) {
                    C14360o3.A0F("accountAdapter");
                    throw C00O.createAndThrow();
                }
                eq2.A00(C32287EJz.A01(c32287EJz));
                return;
        }
    }
}
