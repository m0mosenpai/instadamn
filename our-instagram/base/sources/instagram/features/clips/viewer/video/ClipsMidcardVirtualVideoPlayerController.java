package instagram.features.clips.viewer.video;

import X.AbstractC018607g;
import X.AbstractC167017dG;
import X.AbstractC37302Gc3;
import X.C07T;
import X.C41114IIf;
import X.C41594Iah;
import X.ViewOnKeyListenerC55334Ogx;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class ClipsMidcardVirtualVideoPlayerController {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final C07T A03;
    public final AbstractC018607g A04;
    public final UserSession A05;
    public C41114IIf midcardPlayerManager;
    public C41594Iah sequentialPlayerManager;

    public final void A00() {
        this.A00 = false;
        C41114IIf c41114IIf = this.midcardPlayerManager;
        if (c41114IIf != null) {
            ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx = c41114IIf.A00;
            if (viewOnKeyListenerC55334Ogx != null) {
                viewOnKeyListenerC55334Ogx.A00();
            }
            AbstractC37302Gc3.A1P(this.A05);
        }
        C41594Iah c41594Iah = this.sequentialPlayerManager;
        if (c41594Iah != null) {
            ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx2 = c41594Iah.A01;
            if (viewOnKeyListenerC55334Ogx2 != null) {
                viewOnKeyListenerC55334Ogx2.A00 = false;
                viewOnKeyListenerC55334Ogx2.A02.A05();
            }
            ViewOnKeyListenerC55334Ogx viewOnKeyListenerC55334Ogx3 = c41594Iah.A01;
            if (viewOnKeyListenerC55334Ogx3 != null) {
                viewOnKeyListenerC55334Ogx3.A00();
            }
            c41594Iah.A01 = null;
            c41594Iah.A04.clear();
            c41594Iah.A00 = -1;
            AbstractC37302Gc3.A1P(this.A05);
        }
    }

    public ClipsMidcardVirtualVideoPlayerController(Context context, C07T c07t, AbstractC018607g abstractC018607g, UserSession userSession) {
        AbstractC167017dG.A1R(userSession, c07t);
        this.A02 = context;
        this.A05 = userSession;
        this.A03 = c07t;
        this.A04 = abstractC018607g;
    }
}
