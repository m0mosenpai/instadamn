package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gjh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37766Gjh implements InterfaceC60602pj {
    public final int A00;
    public final Object A01;

    public C37766Gjh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.A00) {
            case 0:
                if (i == 9) {
                    C42277Io1 c42277Io1 = (C42277Io1) this.A01;
                    C102884kP c102884kP = c42277Io1.A08;
                    if (c102884kP.A0B(48) != null) {
                        InterfaceC103384lE A0B = c102884kP.A0B(48);
                        C6FP.A03(c42277Io1.A07, c102884kP, C6FW.A01, A0B);
                    }
                }
                C6BQ.A0J(((C42277Io1) this.A01).A07, this);
                return;
            case 1:
            case 4:
            case 5:
            default:
                ((Fragment) this.A01).onActivityResult(i, i2, intent);
                return;
            case 2:
            case 6:
                return;
            case 3:
                List list = ((C63179See) this.A01).A04;
                synchronized (list) {
                    AbstractC62658SKs abstractC62658SKs = null;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            AbstractC62658SKs abstractC62658SKs2 = (AbstractC62658SKs) it.next();
                            if (i == abstractC62658SKs2.A00) {
                                abstractC62658SKs2.A00(i2, intent);
                                abstractC62658SKs = abstractC62658SKs2;
                            }
                        }
                    }
                    list.remove(abstractC62658SKs);
                }
                return;
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
        switch (this.A00) {
            case 2:
                C42090Ikx c42090Ikx = (C42090Ikx) this.A01;
                C41773Iep c41773Iep = c42090Ikx.A0C;
                InterfaceC50122Sb interfaceC50122Sb = c41773Iep.A00;
                if (interfaceC50122Sb != null) {
                    interfaceC50122Sb.AGH(null);
                    c41773Iep.A00 = null;
                }
                if (c42090Ikx.A00 != null) {
                    AbstractC25651Mw.A00(c42090Ikx.A0A).A02(c42090Ikx.A00, C211849aB.class);
                }
                ((InterfaceC59992oh) c42090Ikx.A04).unregisterLifecycleListener(this);
                return;
            case 3:
            case 4:
            case 5:
            default:
                return;
            case 6:
                C37608Gh3 c37608Gh3 = (C37608Gh3) this.A01;
                AbstractC25651Mw.A00(c37608Gh3.A0B).A02(c37608Gh3.A0A, C211849aB.class);
                c37608Gh3.A05.unregisterLifecycleListener(this);
                return;
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }
}
