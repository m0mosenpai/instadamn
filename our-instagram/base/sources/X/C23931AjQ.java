package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AjQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23931AjQ implements BDS {
    public final long A00;
    public final Context A01;
    public final C193118gr A02;

    @Override // X.BDS
    public final boolean EM1(Bitmap bitmap, Medium medium, C189328a9 c189328a9) {
        Context context = this.A01;
        C15900qk.A01();
        if (C15900qk.A00(context, false) >= 314572800) {
            if (!medium.A05() && medium.A0C * 1000 >= this.A00 && medium.A03 <= 60000) {
                C193118gr c193118gr = this.A02;
                InterfaceC193168gw interfaceC193168gw = c193118gr.A00;
                if (!interfaceC193168gw.CbZ()) {
                    c193118gr.A01.await(10L, TimeUnit.SECONDS);
                    if (!interfaceC193168gw.CbZ()) {
                        ((C47945LFz) C47945LFz.A03.getValue()).A00(AnonymousClass001.A0R("VideoSceneUnderstandingScanner ", "Model not ready yet"));
                        C0K8.A0C("VideoSceneUnderstandingScanner", "Model not ready yet");
                    }
                }
                AbstractC223599u2 A03 = c193118gr.A03(new ACP(AbstractC166987dD.A1J("CONCEPT_SCORES")), AbstractC16960so.A1Q(new C9VE(medium.A0X), new C9VD(TimeUnit.MILLISECONDS.toMicros(medium.A03))), C25091B8n.A00);
                if (A03 instanceof C9VJ) {
                    List list = ((C9VJ) A03).A00;
                    ArrayList<C9VH> A1E = AbstractC166987dD.A1E();
                    for (Object obj : list) {
                        if (obj instanceof C9VH) {
                            A1E.add(obj);
                        }
                    }
                    ArrayList A0q = AbstractC167017dG.A0q(A1E);
                    for (C9VH c9vh : A1E) {
                        A0q.add(new AKS(C8KX.A03, c9vh.A00, c9vh.A01, null));
                    }
                    AbstractC23112AHb.A02(c189328a9, A0q);
                    AbstractC23112AHb.A01(c189328a9, A0q);
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.BDS
    public final String getName() {
        return "VideoSceneUnderstandingScanner";
    }

    @Override // X.BDS
    public final List AE2() {
        return C16930sl.A00;
    }

    public C23931AjQ(UserSession userSession, Context context, boolean z) {
        C8E4 c8e4;
        this.A01 = context;
        this.A00 = System.currentTimeMillis() - (C60322pF.A00(userSession) * 86400000);
        if (z) {
            c8e4 = C8E4.A0G;
        } else {
            c8e4 = C8E4.A0H;
        }
        this.A02 = new C193118gr(new C8ED(userSession, AbstractC166987dD.A1J(c8e4.A00())), z);
    }
}
