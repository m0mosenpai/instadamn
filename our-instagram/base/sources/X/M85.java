package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M85 implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public M85(Context context, UserSession userSession, List list, boolean z) {
        this.A02 = list;
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = z;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            A1E.add(new CallableC209459Oe(this.A00, AbstractC166987dD.A0l(it), this.A01, this.A03).call());
        }
        return A1E;
    }
}
