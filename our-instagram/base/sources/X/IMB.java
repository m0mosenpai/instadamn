package X;

import android.content.Context;
import android.view.TextureView;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class IMB {
    public ViewOnKeyListenerC55334Ogx A00;
    public final Context A03;
    public final UserSession A04;
    public Map A02 = AbstractC166987dD.A1I();
    public List A01 = AbstractC166987dD.A1E();

    public final void A00(int i) {
        TextureView textureView;
        ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx;
        ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx2 = this.A00;
        if (viewOnKeyListenerC55334Ogx2 != null) {
            viewOnKeyListenerC55334Ogx2.A00 = false;
            viewOnKeyListenerC55334Ogx2.A02.A05();
        }
        ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx3 = this.A00;
        if (viewOnKeyListenerC55334Ogx3 != null) {
            viewOnKeyListenerC55334Ogx3.A00();
        }
        this.A00 = null;
        CR6 cr6 = (CR6) AbstractC001800i.A0O(this.A01, i);
        if (cr6 != null && (textureView = cr6.A00) != null) {
            this.A00 = new ViewOnKeyListenerC55334Ogx(this.A03, textureView, this.A04, null, "reels_draft_midcard");
            MediaComposition mediaComposition = (MediaComposition) AbstractC166997dE.A0m(this.A02, i);
            if (mediaComposition != null && (viewOnKeyListenerC55334Ogx = this.A00) != null) {
                viewOnKeyListenerC55334Ogx.A01(mediaComposition);
            }
        }
    }

    public IMB(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = userSession;
    }
}
