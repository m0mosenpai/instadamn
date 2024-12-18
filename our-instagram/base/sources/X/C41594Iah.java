package X;

import android.content.Context;
import android.view.TextureView;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iah, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41594Iah {
    public ViewOnKeyListenerC55334Ogx A01;
    public final Context A05;
    public final UserSession A06;
    public int A00 = -1;
    public Map A04 = AbstractC166987dD.A1I();
    public Map A03 = AbstractC166987dD.A1I();
    public List A02 = AbstractC166987dD.A1E();

    public static final void A00(C41594Iah c41594Iah) {
        TextureView textureView;
        ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx;
        ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx2 = c41594Iah.A01;
        if (viewOnKeyListenerC55334Ogx2 != null) {
            viewOnKeyListenerC55334Ogx2.A00();
        }
        c41594Iah.A01 = null;
        CR6 cr6 = (CR6) AbstractC001800i.A0O(c41594Iah.A02, c41594Iah.A00);
        if (cr6 != null && (textureView = cr6.A00) != null) {
            c41594Iah.A01 = new ViewOnKeyListenerC55334Ogx(c41594Iah.A05, textureView, c41594Iah.A06, new IE1(c41594Iah), "reels_draft_midcard");
            MediaComposition mediaComposition = (MediaComposition) AbstractC166997dE.A0m(c41594Iah.A04, c41594Iah.A00);
            Number number = (Number) AbstractC166997dE.A0m(c41594Iah.A03, c41594Iah.A00);
            if (mediaComposition != null && number != null && (viewOnKeyListenerC55334Ogx = c41594Iah.A01) != null) {
                viewOnKeyListenerC55334Ogx.A02.A06 = new C42226InC(viewOnKeyListenerC55334Ogx, number.longValue());
                viewOnKeyListenerC55334Ogx.A01(mediaComposition);
            }
        }
    }

    public C41594Iah(Context context, UserSession userSession) {
        this.A05 = context;
        this.A06 = userSession;
    }
}
