package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Aby, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23544Aby implements C6VA {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C200908uX A01;
    public final /* synthetic */ C23130AMj A02;
    public final /* synthetic */ AbstractC48762Lu A03;
    public final /* synthetic */ A6O A04;

    public C23544Aby(Context context, C200908uX c200908uX, C23130AMj c23130AMj, AbstractC48762Lu abstractC48762Lu, A6O a6o) {
        this.A04 = a6o;
        this.A00 = context;
        this.A01 = c200908uX;
        this.A02 = c23130AMj;
        this.A03 = abstractC48762Lu;
    }

    @Override // X.C6VA
    public final ListenableFuture AFL() {
        ArrayList A01;
        String A1A;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A04.A00.iterator();
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
                    A01 = C23130AMj.A02(this.A00, "fx_android_access_library_internal_settings", a9d, C23130AMj.A04(this.A01, this.A03));
                }
                A1E.addAll(A01);
            }
            A01 = C23130AMj.A01(this.A00, "fx_android_access_library_internal_settings", a9d, C23130AMj.A04(this.A01, this.A03));
            A1E.addAll(A01);
        }
        return C2OD.A02(AbstractC001800i.A0a(A1E));
    }
}
