package X;

import android.view.View;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.LqL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49265LqL implements MR4 {
    public final /* synthetic */ LIi A00;

    @Override // X.MR4
    public final void Du5(View view) {
    }

    @Override // X.MR4
    public final void DuH(String str, View view) {
    }

    @Override // X.MR4
    public final void onDismiss() {
    }

    public C49265LqL(LIi lIi) {
        this.A00 = lIi;
    }

    @Override // X.MR4
    public final void D8z() {
        LIi lIi = this.A00;
        lIi.A02(true);
        DirectThreadKey A02 = JRE.A02(lIi.A0B);
        if (lIi.A05 == 29 && A02 != null) {
            AbstractC147806l5.A00(lIi.A09).A0B(lIi.A04, A02.A00, A02.A01);
        }
    }

    @Override // X.MR4
    public final void DDI(String str, int i) {
        AbstractC43757JWv abstractC43757JWv = this.A00.A0C.A00.A04;
        if (abstractC43757JWv != null) {
            abstractC43757JWv.A0G(str, "emoji_tray");
        }
    }
}
