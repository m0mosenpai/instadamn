package X;

import android.content.Context;
import com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$fetchScript$1;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class NAT extends U7H {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ O1I A01;
    public final /* synthetic */ C55026OXd A02;
    public final /* synthetic */ Map A03;

    public NAT(Context context, O1I o1i, C55026OXd c55026OXd, Map map) {
        this.A03 = map;
        this.A02 = c55026OXd;
        this.A00 = context;
        this.A01 = o1i;
    }

    @Override // X.U7H
    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        Iterator A15 = AbstractC166997dE.A15(this.A03);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String str = (String) A1K.getKey();
            Map map = (Map) A1K.getValue();
            C55026OXd c55026OXd = this.A02;
            String str2 = (String) map.get("url");
            String str3 = (String) map.get("file_name");
            String str4 = (String) map.get("version");
            Context context = this.A00;
            O1I o1i = this.A01;
            C14360o3.A0B(o1i, 5);
            if (str2 != null && str3 != null && str != null && str4 != null) {
                C54957OSh c54957OSh = C54957OSh.A00;
                C006802i A0N = AbstractC43592JPx.A0N();
                int hashCode = C0HM.A00().hashCode();
                C26371Ps c26371Ps = new C26371Ps((C1JP) null);
                c26371Ps.A02 = str2;
                c26371Ps.A01(C05F.A0N);
                c26371Ps.A05 = true;
                C1QW A00 = c26371Ps.A00();
                C1QX A0J = MSY.A0J();
                A0J.A03 = C1Ef.OffScreen;
                A0J.A0A = str3;
                C1QY A002 = A0J.A00();
                AbstractC166987dD.A1Z(new IgIABJSScriptFetcher$fetchScript$1(context, o1i, c55026OXd, A0N, A00, A002, str2, str, str4, str3, null, hashCode), AbstractC24771Iv.A02(1990359309, 3));
            }
        }
        return null;
    }
}
