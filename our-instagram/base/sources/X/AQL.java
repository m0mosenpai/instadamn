package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AQL implements View.OnClickListener {
    public final /* synthetic */ C193768hw A00;

    public AQL(C193768hw c193768hw) {
        this.A00 = c193768hw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-1130136733);
        C193768hw c193768hw = this.A00;
        C193838i4 c193838i4 = c193768hw.A05;
        if (c193838i4 == null) {
            str = "delegate";
        } else if (c193838i4.A07 == C05F.A01) {
            C194148iZ c194148iZ = c193768hw.A06;
            if (c194148iZ == null) {
                str = "storyDraftsAdapter";
            } else {
                AbstractC53899NsV.A00(c193768hw.A09, new C23864AhG(new B8T(c193768hw, 25)), c194148iZ.A0A.size());
                C0f9.A0C(-819731732, A05);
                return;
            }
        } else {
            UnsupportedOperationException A1D = AbstractC166987dD.A1D("Unhandled tab mode.");
            C0f9.A0C(1003217074, A05);
            throw A1D;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
