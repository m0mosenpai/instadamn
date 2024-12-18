package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.GPp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC36946GPp implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ RegFlowExtras A02;

    public /* synthetic */ RunnableC36946GPp(Fragment fragment, AbstractC12990ll abstractC12990ll, RegFlowExtras regFlowExtras) {
        this.A02 = regFlowExtras;
        this.A01 = abstractC12990ll;
        this.A00 = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RegFlowExtras regFlowExtras = this.A02;
        AbstractC12990ll abstractC12990ll = this.A01;
        Fragment fragment = this.A00;
        AbstractC31172DnG.A1A();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras);
        AbstractC31175DnJ.A0r(A0b, abstractC12990ll);
        EKC ekc = new EKC();
        AbstractC31181DnP.A0b(ekc, AbstractC31173DnH.A0J(A0b, ekc, fragment), abstractC12990ll);
    }
}
