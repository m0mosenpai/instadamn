package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public final class INO {
    public int A00;
    public J24 A02;
    public final UserSession A03;
    public final LinkedList A04 = new LinkedList();
    public int A01 = -1;

    public final void A00() {
        Iterator A13 = AbstractC166997dE.A13(this.A04);
        while (A13.hasNext()) {
            J24 j24 = (J24) AbstractC166997dE.A0l(A13);
            C5TA c5ta = j24.A01;
            if (c5ta != null) {
                c5ta.A0C("preview_end", false);
            }
            J24.A01(j24, true);
            C5TA c5ta2 = j24.A01;
            if (c5ta2 != null) {
                c5ta2.A0A("out_of_playback_range");
            }
            j24.A01 = null;
        }
    }

    public final void A01() {
        C5TA c5ta;
        J24 j24 = this.A02;
        if (j24 == null) {
            A02();
            return;
        }
        if (AbstractC40922IAu.A00(j24.A00).booleanValue()) {
            View view = j24.A02.A00;
            view.setScaleX(1.05f);
            view.setScaleY(1.05f);
        }
        J24 j242 = this.A02;
        if (j242 == null || (c5ta = j242.A01) == null) {
            return;
        }
        C3Q0 c3q0 = ((C4QT) c5ta.A06).A0M;
        C14360o3.A07(c3q0);
        if (c3q0 == C3Q0.PREPARED) {
            c5ta.A0B("resume", false);
            J24.A00(j242);
            J24.A01(j242, false);
            return;
        }
        j242.A04(true);
    }

    public final void A02() {
        J24 j24 = this.A02;
        if (j24 != null) {
            j24.A03(1.0f);
        }
        LinkedList linkedList = this.A04;
        J24 j242 = (J24) linkedList.removeFirst();
        this.A02 = j242;
        if (j242 != null) {
            j242.A02();
            linkedList.add(j242);
            j242.A03(1.05f);
            int i = this.A01 + 1;
            this.A01 = i;
            if (i > 3) {
                this.A01 = 0;
            }
        }
    }

    public INO(UserSession userSession) {
        this.A03 = userSession;
        this.A00 = C41711wL.A01(userSession).A09();
        C41711wL.A01(userSession).A0C(4);
    }
}
