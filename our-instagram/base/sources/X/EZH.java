package X;

import android.content.Context;
import java.util.List;

/* loaded from: classes6.dex */
public final class EZH extends C2AG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ AbstractC12990ll A02;
    public final /* synthetic */ C35206Ffy A03;

    @Override // X.C11R
    public final int getRunnableId() {
        return 530;
    }

    public EZH(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, C35206Ffy c35206Ffy) {
        this.A03 = c35206Ffy;
        this.A00 = context;
        this.A02 = abstractC12990ll;
        this.A01 = interfaceC11380iw;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00;
        AbstractC12990ll abstractC12990ll = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        AbstractC167017dG.A1N(context, abstractC12990ll);
        return C35269Fh4.A01(context, interfaceC11380iw, abstractC12990ll, null, "login");
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C35206Ffy.A02(this.A03);
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            C35206Ffy c35206Ffy = this.A03;
            C1ON A0F = AbstractC35276FhB.A0F(this.A02, list);
            A0F.A00 = new C32539EUp(c35206Ffy, 20);
            C1GJ.A03(A0F);
            return;
        }
        C35206Ffy.A02(this.A03);
    }
}
