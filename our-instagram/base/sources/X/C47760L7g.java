package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.L7g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47760L7g {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C48641LfJ A02;
    public final C51129MiY A03;
    public final C47Z A04;

    public final void A00(RecyclerView recyclerView, AudioOverlayTrack audioOverlayTrack) {
        C51129MiY c51129MiY = this.A03;
        C14360o3.A0B(c51129MiY, 2);
        int i = 8;
        if (audioOverlayTrack != null) {
            if (recyclerView == null) {
                return;
            }
        } else {
            if (recyclerView == null) {
                return;
            }
            recyclerView.setAdapter(c51129MiY);
            if (c51129MiY.getItemCount() != 0) {
                i = 0;
            }
        }
        recyclerView.setVisibility(i);
    }

    public C47760L7g(AbstractC59962oe abstractC59962oe, UserSession userSession, C48641LfJ c48641LfJ, C47Z c47z) {
        AbstractC43594JPz.A1P(abstractC59962oe, c48641LfJ);
        this.A01 = userSession;
        this.A00 = abstractC59962oe;
        this.A04 = c47z;
        this.A02 = c48641LfJ;
        this.A03 = new C51129MiY(AbstractC43592JPx.A18(this, 13), userSession);
    }
}
