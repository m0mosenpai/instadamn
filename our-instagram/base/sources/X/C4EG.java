package X;

import android.view.View;
import com.facebook.analytics.dsp.point.IgPointContextProvider;
import com.meta.analytics.gnv.vista.core.CoreVistaManager;

/* renamed from: X.4EG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EG implements C4EH, InterfaceC13050lr {
    public final AbstractC12990ll A00;
    public final CoreVistaManager A01;
    public final C4EO A02;
    public final C19L A03;
    public final IgPointContextProvider A04;
    public final C4EK A05;

    @Override // X.C4EH
    public final /* bridge */ /* synthetic */ void AAU(InterfaceC58009Pnt interfaceC58009Pnt, Object obj, Object obj2, String str, boolean z) {
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        this.A01.A02(view, interfaceC58009Pnt, obj2, str);
    }

    @Override // X.C4EH
    public final /* bridge */ /* synthetic */ void EGO(Object obj) {
        View view = (View) obj;
        C14360o3.A0B(view, 0);
        CoreVistaManager coreVistaManager = this.A01;
        synchronized (coreVistaManager.A04) {
            CoreVistaManager.A00(view, coreVistaManager);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.4EO] */
    public C4EG(AbstractC12990ll abstractC12990ll) {
        this.A00 = abstractC12990ll;
        IgPointContextProvider igPointContextProvider = new IgPointContextProvider(C3K9.A01);
        this.A04 = igPointContextProvider;
        C06090Tz c06090Tz = C06090Tz.A05;
        C4EK c4ek = new C4EK((int) C18U.A01(c06090Tz, abstractC12990ll, 36593108480689101L), (int) C18U.A01(c06090Tz, abstractC12990ll, 36593108480754638L), C18U.A01(c06090Tz, abstractC12990ll, 36593108480820175L), C18U.A06(c06090Tz, abstractC12990ll, 2342154642717868722L), C18U.A06(c06090Tz, abstractC12990ll, 36311633504633525L));
        this.A05 = c4ek;
        this.A01 = new CoreVistaManager(igPointContextProvider, c4ek);
        this.A03 = AnonymousClass194.A03(C12L.A00.CPG(607866630, 3), AnonymousClass194.A02(new AnonymousClass197(null)));
        this.A02 = new InterfaceC13060ls() { // from class: X.4EO
            @Override // X.InterfaceC13060ls
            public final void Cww(AbstractC12990ll abstractC12990ll2) {
                C4EG.this.A01.A06 = false;
            }

            @Override // X.InterfaceC13060ls
            public final void Cwy(AbstractC12990ll abstractC12990ll2) {
                C4EG.this.A01.A06 = true;
            }
        };
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C24231Gs.A00().A02(this.A02);
        AnonymousClass194.A05(null, this.A03);
    }
}
