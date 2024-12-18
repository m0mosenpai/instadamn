package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.creation.base.CropInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes8.dex */
public final class KLM extends AbstractRunnableC14200nk {
    public final /* synthetic */ KCP A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLM(KCP kcp) {
        super(107, 3, false, false);
        this.A00 = kcp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KCP kcp = this.A00;
        Context context = kcp.getContext();
        if (context != null) {
            File file = new File(context.getCacheDir(), MSV.A00(1250));
            int A01 = LBN.A01(context, false);
            C55201OeB.A02(kcp.A06(context), file, A01, A01, 50);
            if (file.length() > 0) {
                InterfaceC09390do interfaceC09390do = kcp.A0O;
                C50713MaC.A00(AbstractC166987dD.A0r(interfaceC09390do)).A05(context, file.getAbsolutePath());
                C50713MaC.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(context, new CropInfo(new Rect(0, 0, A01, A01), A01, A01), 0, false);
                C55105ObK A00 = C50713MaC.A00(AbstractC166987dD.A0r(interfaceC09390do));
                LinkedList A002 = AbstractC53888NsK.A00(AbstractC166987dD.A0r(interfaceC09390do));
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    AbstractC166997dE.A1W(A1E, ((C54629OBe) it.next()).A00);
                }
                synchronized (A00) {
                    A00.A04(context, null, A1E);
                }
            }
        }
    }
}
