package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Abz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23545Abz implements C6VA {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C200908uX A01;
    public final /* synthetic */ C23130AMj A02;
    public final /* synthetic */ AbstractC48762Lu A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ A6O A05;

    public C23545Abz(Context context, C200908uX c200908uX, C23130AMj c23130AMj, AbstractC48762Lu abstractC48762Lu, String str, A6O a6o) {
        this.A05 = a6o;
        this.A00 = context;
        this.A01 = c200908uX;
        this.A02 = c23130AMj;
        this.A03 = abstractC48762Lu;
        this.A04 = str;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.8yV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.8yU, java.lang.Object] */
    @Override // X.C6VA
    public final ListenableFuture AFL() {
        ArrayList A01;
        String A1A;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A05.A00.iterator();
        while (it.hasNext()) {
            A9D a9d = (A9D) AbstractC166997dE.A0l(it);
            Map map = a9d.A01;
            if (map != null && (A1A = AbstractC166987dD.A1A("resolver_type", map)) != null) {
                int hashCode = A1A.hashCode();
                if (hashCode != -786997656) {
                    if (hashCode != -782042377 && hashCode == -385236069 && A1A.equals("account_manager")) {
                        A01 = C23130AMj.A03(this.A00, a9d);
                    }
                } else if (A1A.equals(AbstractC111324zv.A00(231))) {
                    A01 = C23130AMj.A02(this.A00, this.A04, a9d, C23130AMj.A04(this.A01, this.A03));
                }
                A1E.addAll(A01);
            }
            A01 = C23130AMj.A01(this.A00, this.A04, a9d, C23130AMj.A04(this.A01, this.A03));
            A1E.addAll(A01);
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            ACJ acj = (ACJ) it2.next();
            EnumC200798uM A012 = AbstractC200928uZ.A01(acj.A04);
            if (A012 != null) {
                Map map2 = acj.A03;
                C203118yT c203118yT = new C203118yT(acj.A02, AbstractC166987dD.A1A("user_name", map2), AbstractC166987dD.A1A("profile_pic_url", map2));
                map2.get("upsell_holdout_status");
                String str = acj.A01;
                ?? obj = new Object();
                obj.A01 = c203118yT;
                obj.A00 = str;
                ?? obj2 = new Object();
                obj2.A01 = "2";
                obj2.A00 = "2";
                obj.A02 = obj2;
                A1E2.add(new C203148yW(new AbstractC200848uR(A012), obj));
            }
        }
        return C2OD.A02(AbstractC001800i.A0a(A1E2));
    }
}
