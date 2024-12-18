package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Locale;

/* renamed from: X.XMw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72078XMw implements InterfaceC25971Oe {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC25971Oe
    public final String AXT(C1OW c1ow) {
        DirectThreadKey C7Q = ((InterfaceC29171au) c1ow).C7Q();
        C14360o3.A0B(C7Q, 0);
        String str = C7Q.A00;
        if (str != null) {
            return AbstractC65702TsY.A0h("thread-%s", Locale.US, new Object[]{str}, 1);
        }
        return "global";
    }
}
