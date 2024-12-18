package X;

import android.view.View;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.Ik0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42031Ik0 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public ViewOnClickListenerC42031Ik0(C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, C64042vP c64042vP, C60662pp c60662pp, List list, int i, int i2) {
        this.A00 = i2;
        if (1 - i2 != 0) {
            this.A04 = c60662pp;
            this.A07 = list;
            this.A02 = c38321qM;
            this.A03 = hbc;
            this.A06 = intentAwareAdPivotState;
        } else {
            this.A06 = intentAwareAdPivotState;
            this.A02 = c38321qM;
            this.A04 = c60662pp;
            this.A07 = list;
            this.A03 = hbc;
        }
        this.A05 = c64042vP;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1354801925);
                C23031Ai c23031Ai = (C23031Ai) this.A06;
                int i2 = this.A01 + 1;
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(c23031Ai);
                A0w.E7D(AbstractC43591JPw.A00(1450), i2);
                A0w.apply();
                C47732L5t c47732L5t = (C47732L5t) this.A03;
                View view2 = (View) this.A07;
                Object obj = this.A02;
                C127915qK c127915qK = (C127915qK) this.A05;
                C5qT c5qT = (C5qT) this.A04;
                if (obj instanceof C38321qM) {
                    c47732L5t.A00(view2, c5qT, c127915qK, (C38321qM) obj);
                }
                i = 1203375089;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(2131798951);
                IntentAwareAdPivotState intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
                C38321qM c38321qM = (C38321qM) this.A02;
                String id = c38321qM.getId();
                if (id != null) {
                    intentAwareAdPivotState.A05 = id;
                    C60662pp c60662pp = (C60662pp) this.A04;
                    List list = (List) this.A07;
                    HBC hbc = (HBC) this.A03;
                    c60662pp.A0I(c38321qM, intentAwareAdPivotState, hbc, list);
                    ((C64042vP) this.A05).A0F(intentAwareAdPivotState, hbc, C05F.A0Y, this.A01);
                    i = 45481591;
                    C0f9.A0C(i, A05);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0C(1186988658, A05);
                throw A0g;
            default:
                A05 = C0f9.A05(-1509563439);
                C60662pp c60662pp2 = (C60662pp) this.A04;
                List list2 = (List) this.A07;
                C38321qM c38321qM2 = (C38321qM) this.A02;
                HBC hbc2 = (HBC) this.A03;
                IntentAwareAdPivotState intentAwareAdPivotState2 = (IntentAwareAdPivotState) this.A06;
                c60662pp2.A0I(c38321qM2, intentAwareAdPivotState2, hbc2, list2);
                ((C64042vP) this.A05).A0F(intentAwareAdPivotState2, hbc2, C05F.A00, this.A01);
                i = 1462815590;
                C0f9.A0C(i, A05);
                return;
        }
    }

    public ViewOnClickListenerC42031Ik0(View view, C5qT c5qT, C127915qK c127915qK, C47732L5t c47732L5t, C23031Ai c23031Ai, Object obj, int i) {
        this.A00 = 0;
        this.A06 = c23031Ai;
        this.A01 = i;
        this.A03 = c47732L5t;
        this.A07 = view;
        this.A02 = obj;
        this.A05 = c127915qK;
        this.A04 = c5qT;
    }
}
