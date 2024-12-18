package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.GgX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37576GgX extends AbstractC60592pi implements InterfaceC55932he {
    public C37658Ghr A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public final C55982hj A05;
    public final Activity A06;
    public final C55982hj A07;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj.A09.A00 == 1.0d) {
            this.A00 = null;
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        C37658Ghr c37658Ghr = this.A00;
        if (c37658Ghr != null) {
            AbstractC25227BEk.A1D(c37658Ghr.A04, f);
        }
        if (this.A00 != null) {
            View view = this.A01;
            if (view != null) {
                view.setAlpha(f);
            }
            View view2 = this.A04;
            if (view2 != null) {
                view2.setAlpha(f);
            }
            View view3 = this.A03;
            if (view3 != null) {
                view3.setAlpha(f);
            }
            View view4 = this.A02;
            if (view4 != null) {
                view4.setAlpha(f);
            }
            View view5 = this.A01;
            if (f == 0.0f) {
                AbstractC167007dF.A0x(view5);
            } else {
                if (view5 == null) {
                    return;
                }
                view5.setVisibility(0);
            }
        }
    }

    public final void A00() {
        this.A07.A03();
    }

    public final void A01(View view, View view2, View view3, C37658Ghr c37658Ghr) {
        if (c37658Ghr != null) {
            this.A00 = c37658Ghr;
            this.A07.A04();
            this.A04 = view;
            this.A03 = view2;
            this.A02 = view3;
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A05.A0B(this);
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C55982hj c55982hj = this.A07;
        c55982hj.A01();
        c55982hj.A0B(this);
        View view = this.A01;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        View view2 = this.A04;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        View view3 = this.A03;
        if (view3 != null) {
            view3.setAlpha(1.0f);
        }
        View view4 = this.A02;
        if (view4 != null) {
            view4.setAlpha(1.0f);
        }
        C37658Ghr c37658Ghr = this.A00;
        if (c37658Ghr != null) {
            AbstractC25227BEk.A1D(c37658Ghr.A04, 1.0f);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        C55982hj c55982hj = this.A07;
        c55982hj.A0A(this);
        if (c55982hj.A09.A00 != 1.0d) {
            c55982hj.A06(1.0d);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        C56352iT A00 = C56342iS.A00(this.A06);
        if (A00 != null) {
            viewGroup = A00.A0P;
        } else {
            viewGroup = null;
        }
        this.A01 = viewGroup;
        this.A05.A0A(this);
    }

    public C37576GgX(Activity activity) {
        this.A06 = activity;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        this.A07 = A0R;
        A0R.A02();
        C55982hj A0R2 = AbstractC167007dF.A0R();
        A0R2.A06 = true;
        this.A05 = A0R2;
        A0R2.A02();
    }
}
