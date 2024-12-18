package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ajx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23963Ajx implements InterfaceC58042lK {
    public final /* synthetic */ C191478dz A00;

    @Override // X.InterfaceC58042lK
    public final void Dnn(Integer num, float f) {
        C14360o3.A0B(num, 1);
        if (num == C05F.A0N) {
            C191478dz c191478dz = this.A00;
            UserSession userSession = c191478dz.A0b;
            if (AbstractC166987dD.A0x(userSession).getInt("edit_clips_button_badge_nux", 0) == 0) {
                AbstractC167007dF.A18(AbstractC166987dD.A0x(userSession), "edit_clips_button_badge_nux", 1);
                View view = c191478dz.A02;
                if (view != null) {
                    C191478dz.A03(view, c191478dz);
                }
            }
        }
    }

    public C23963Ajx(C191478dz c191478dz) {
        this.A00 = c191478dz;
    }
}
