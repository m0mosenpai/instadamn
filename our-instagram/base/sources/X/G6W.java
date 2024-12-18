package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

/* loaded from: classes6.dex */
public final class G6W implements GZ2 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public G6W(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.GZ2
    public final void D9X() {
        switch (this.A00) {
            case 0:
                C31645DvB c31645DvB = (C31645DvB) this.A02;
                C7YG A00 = C7YF.A00(c31645DvB.A00);
                C3o9 c3o9 = (C3o9) this.A01;
                A00.A03((MsysThreadId) c3o9, new C50363MLp(24, c3o9, c31645DvB));
                return;
            case 1:
                C31645DvB c31645DvB2 = (C31645DvB) this.A02;
                C31603DuV c31603DuV = c31645DvB2.A01;
                DirectMsysMixedThreadKey directMsysMixedThreadKey = (DirectMsysMixedThreadKey) ((C3o9) this.A01);
                c31603DuV.AOm(directMsysMixedThreadKey.A00);
                c31645DvB2.A02.AOm(directMsysMixedThreadKey.A01);
                return;
            case 2:
                DirectThreadKey directThreadKey = (DirectThreadKey) this.A01;
                if (directThreadKey.A00 == null) {
                    return;
                }
                C31603DuV c31603DuV2 = (C31603DuV) this.A02;
                C31603DuV.A00(c31603DuV2, directThreadKey, true);
                c31603DuV2.A03.A02(directThreadKey, C05F.A0Y);
                return;
            case 3:
                ((C31644DvA) this.A02).AOm((C3o9) this.A01);
                return;
            default:
                ((KWi) this.A02).A04((C3o9) this.A01, false);
                return;
        }
    }

    @Override // X.GZ2
    public final void onDismiss() {
        if (2 - this.A00 == 0) {
            C31603DuV.A00((C31603DuV) this.A02, (DirectThreadKey) this.A01, false);
        }
    }
}
