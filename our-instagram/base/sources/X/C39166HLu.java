package X;

import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.HLu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39166HLu extends AbstractC51370MmV {
    public final LayoutInflater A00;
    public final IgLinearLayout A01;
    public final boolean A02;

    @Override // X.AbstractC51370MmV
    public final boolean A02() {
        return false;
    }

    @Override // X.AbstractC51370MmV
    public final boolean A03() {
        return this.A02;
    }

    @Override // X.AbstractC51370MmV
    public final boolean A04() {
        return !this.A02;
    }

    public C39166HLu(View view, boolean z) {
        super(view);
        this.A02 = z;
        this.A01 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.mk_insights_container);
        LayoutInflater A0P = AbstractC25228BEl.A0P(view);
        C14360o3.A07(A0P);
        this.A00 = A0P;
    }
}
