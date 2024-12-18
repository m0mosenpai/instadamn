package X;

import android.widget.FrameLayout;
import com.instagram.archive.fragment.ArchiveReelFragment;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes9.dex */
public final class MUU implements InterfaceC54962fv {
    public final int A00;
    public final Object A01;

    public MUU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC54962fv
    public final void AHP() {
        String str;
        switch (this.A00) {
            case 0:
                C52196N8l c52196N8l = ((ArchiveReelFragment) this.A01).A00;
                N93 n93 = c52196N8l.A07;
                if (n93 != null) {
                    n93.A01 = null;
                }
                c52196N8l.A0C();
                return;
            case 1:
                InterfaceC56392iX interfaceC56392iX = ((N6N) this.A01).A03;
                if (interfaceC56392iX != null) {
                    interfaceC56392iX.setVisibility(8);
                    return;
                }
                str = "qpView";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                C52200N8p c52200N8p = ((C52171N7a) this.A01).A00;
                if (c52200N8p == null) {
                    str = "listAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (null == c52200N8p.A00) {
                    return;
                }
                c52200N8p.A00 = null;
                C52200N8p.A00(c52200N8p);
                return;
            case 3:
                C7YB c7yb = (C7YB) this.A01;
                C162307Os c162307Os = (C162307Os) c7yb.A0D.invoke();
                if (c162307Os != null) {
                    c162307Os.A03(null);
                }
                c7yb.A06.A00();
                C1571173q.A00((C1571173q) c7yb.A0A.getValue());
                return;
            case 4:
                FrameLayout frameLayout = ((HCG) this.A01).A01;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                    return;
                }
                str = "qpView";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                C05A c05a = C26777Bry.A00((C26777Bry) this.A01).A08;
                do {
                } while (!c05a.AIi(c05a.getValue(), null));
                return;
            case 6:
                C05A c05a2 = ((N86) ((C26872BtZ) this.A01).A0H.getValue()).A08;
                do {
                } while (!c05a2.AIi(c05a2.getValue(), null));
                return;
            case 7:
                ((MUI) this.A01).A04.Egh(null);
                return;
            default:
                C38262Gs5 c38262Gs5 = ((ReelDashboardFragment) this.A01).mListAdapter;
                c38262Gs5.A02 = null;
                c38262Gs5.A03 = null;
                C0fA.A00(c38262Gs5, 170833880);
                return;
        }
    }
}
