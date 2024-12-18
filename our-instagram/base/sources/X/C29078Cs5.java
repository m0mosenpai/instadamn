package X;

import android.util.SparseArray;
import com.facebook.R;
import com.facebook.litho.LithoView;

/* renamed from: X.Cs5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29078Cs5 implements C2JL {
    public final /* synthetic */ C138746Qe A00;
    public final /* synthetic */ InterfaceC139386St A01;
    public final /* synthetic */ C6V5 A02;
    public final /* synthetic */ C139416Sw A03;
    public final /* synthetic */ InterfaceC62872tQ A04;
    public final /* synthetic */ C29370Cx3 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        C14360o3.A0B(th, 0);
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C6V5 c6v5 = this.A02;
        c6v5.A01.remove(this.A06);
        C138746Qe c138746Qe = this.A00;
        c138746Qe.A0C(message);
        c138746Qe.A0E(message);
        c138746Qe.A0B(message);
        C29370Cx3.A01(this.A05, th);
        this.A01.onFailure(th);
    }

    public C29078Cs5(C138746Qe c138746Qe, InterfaceC139386St interfaceC139386St, C6V5 c6v5, C139416Sw c139416Sw, InterfaceC62872tQ interfaceC62872tQ, C29370Cx3 c29370Cx3, String str, boolean z, boolean z2) {
        this.A00 = c138746Qe;
        this.A07 = z;
        this.A08 = z2;
        this.A02 = c6v5;
        this.A06 = str;
        this.A03 = c139416Sw;
        this.A05 = c29370Cx3;
        this.A04 = interfaceC62872tQ;
        this.A01 = interfaceC139386St;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C2XE c2xe;
        String str;
        C1338462s c1338462s = (C1338462s) obj;
        if (c1338462s == null) {
            C138746Qe c138746Qe = this.A00;
            c138746Qe.A0B("result is null");
            c138746Qe.A0C("result is null");
            return;
        }
        C138746Qe c138746Qe2 = this.A00;
        boolean z = this.A07;
        c138746Qe2.A0J(z);
        if (!this.A08) {
            C6V5 c6v5 = this.A02;
            c6v5.A01.remove(this.A06);
        }
        c138746Qe2.A04();
        try {
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(R.id.showreel_config_provider, this.A03);
            sparseArray.put(R.id.showreel_logger, c138746Qe2);
            C29370Cx3 c29370Cx3 = this.A05;
            LithoView lithoView = c29370Cx3.A00;
            if (lithoView != null) {
                c2xe = lithoView.A08;
            } else {
                c2xe = null;
            }
            C26281Bjo A03 = BUG.A03(c2xe);
            A03.A0B(c1338462s);
            A03.A0C(this.A04);
            String A0n = AbstractC166997dE.A0n();
            if (A0n == null) {
                AbstractC50812Vc abstractC50812Vc = ((AbstractC77733dx) A03).A01.A01;
                if (abstractC50812Vc != null) {
                    str = abstractC50812Vc.A0H();
                } else {
                    str = "unknown component";
                }
                C2YE.A00("Component:NullKeySet", C05F.A01, AnonymousClass001.A0g("Setting a null key from ", str, " which is usually a mistake! If it is not, explicitly set the String 'null'"));
                A0n = "null";
            }
            AbstractC50792Va abstractC50792Va = ((AbstractC77733dx) A03).A00;
            abstractC50792Va.A04 = true;
            abstractC50792Va.A03 = A0n;
            BUG bug = A03.A01;
            bug.A00 = sparseArray;
            bug.A03 = new C29141Ct8(c29370Cx3, 2);
            BUG A0A = A03.A0A();
            LithoView lithoView2 = c29370Cx3.A00;
            if (lithoView2 != null) {
                lithoView2.setComponent(A0A);
            }
            LithoView lithoView3 = c29370Cx3.A00;
            if (lithoView3 != null) {
                lithoView3.post(new RunnableC29592D1t(lithoView3, c138746Qe2));
            }
            c138746Qe2.A0I(z);
            c138746Qe2.A05();
            c138746Qe2.A06();
            c29370Cx3.A09.DQ8(2);
            this.A01.onSuccess();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            AbstractC12120kG.A07("IgShowreelCompositionLithoController#onBloksLayoutBinding", message, e);
            c138746Qe2.A0D(message);
            c138746Qe2.A0E(message);
            c138746Qe2.A0B(message);
            C29370Cx3.A01(this.A05, e);
            this.A01.onFailure(e);
        }
    }
}
