package X;

import android.content.Context;
import java.util.List;

/* loaded from: classes6.dex */
public final class EZE extends C2AG {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ AbstractC12990ll A02;
    public final /* synthetic */ C1GL A03;
    public final /* synthetic */ InterfaceC37298Gbz A04;
    public final /* synthetic */ FRE A05;

    @Override // X.C11R
    public final int getRunnableId() {
        return 261;
    }

    public EZE(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, C1GL c1gl, InterfaceC37298Gbz interfaceC37298Gbz, FRE fre) {
        this.A05 = fre;
        this.A00 = context;
        this.A02 = abstractC12990ll;
        this.A01 = interfaceC11380iw;
        this.A04 = interfaceC37298Gbz;
        this.A03 = c1gl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Context context = this.A00;
        if (context != null) {
            return C35269Fh4.A01(context, this.A01, this.A02, this.A04, "login");
        }
        throw new Exception("the context should not bu null.");
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list = (List) obj;
        if (!list.isEmpty()) {
            FRE fre = this.A05;
            AbstractC12990ll abstractC12990ll = this.A02;
            C1GL c1gl = this.A03;
            InterfaceC37298Gbz interfaceC37298Gbz = this.A04;
            C1ON A0F = AbstractC35276FhB.A0F(abstractC12990ll, list);
            A0F.A00 = new C32540EUq(abstractC12990ll, interfaceC37298Gbz, fre, 11);
            c1gl.schedule(A0F);
        }
    }
}
