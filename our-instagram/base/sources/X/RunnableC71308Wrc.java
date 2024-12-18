package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.Wrc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71308Wrc implements Runnable {
    public final /* synthetic */ C72743Nv A00;

    public RunnableC71308Wrc(C72743Nv c72743Nv) {
        this.A00 = c72743Nv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        C72743Nv c72743Nv = this.A00;
        ImmutableMap immutableMap = C72743Nv.A0U;
        c72743Nv.A04.getClass();
        Throwable A05 = c72743Nv.A04.A05();
        if (A05 == null) {
            A05 = new Throwable("Bloks Request Error");
        }
        C115095Ie c115095Ie = new C115095Ie(A05);
        String str = c72743Nv.A0G;
        if (c72743Nv.A08 != null && str != null) {
            F0B.A00(c115095Ie, "AsyncScreen", str);
        }
        View view = c72743Nv.A00;
        if (view != null && (viewGroup = (ViewGroup) c72743Nv.mView) != null) {
            viewGroup.removeView(view);
        }
        C57012jc c57012jc = c72743Nv.A0F;
        if (c57012jc == null) {
            InterfaceC72008XEw interfaceC72008XEw = c72743Nv.A06;
            if (interfaceC72008XEw != null) {
                interfaceC72008XEw.Cna("component_missing");
            }
        } else {
            c57012jc.A01().setVisibility(0);
        }
        AbstractC69784VvL abstractC69784VvL = c72743Nv.A0A;
        if (abstractC69784VvL != null) {
            abstractC69784VvL.A03(c115095Ie);
        }
    }
}
