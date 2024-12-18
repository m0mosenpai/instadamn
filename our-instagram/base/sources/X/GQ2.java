package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

/* loaded from: classes6.dex */
public final class GQ2 implements Runnable {
    public final /* synthetic */ C5F2 A00;
    public final /* synthetic */ C455127l A01;
    public final /* synthetic */ String A02;

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Object[] objArr;
        int i2;
        String A0u;
        Activity activity = null;
        try {
            activity = C2OG.A01().A06();
        } catch (ClassCastException | IndexOutOfBoundsException unused) {
        }
        if (activity == null) {
            Object A00 = AbstractC54852fj.A00();
            if (!(A00 instanceof FragmentActivity) || (activity = (Activity) A00) == null) {
                return;
            }
        }
        C5F2 c5f2 = this.A00;
        if (c5f2.BAI() != null && c5f2.Avz() != null) {
            int intValue = c5f2.BAI().intValue();
            String Avz = c5f2.Avz();
            UserSession userSession = this.A01.A02;
            AbstractC25233BEq.A0v(0, activity, Avz, userSession);
            C193328hC A0H = AbstractC31171DnF.A0H(activity);
            AbstractC31173DnH.A15(activity, A0H, R.drawable.ig_illustrations_illo_clock_refresh);
            long j = intValue;
            if (j == SandboxRepository.CACHE_TTL) {
                i = 2131963405;
                if (C461529z.A0A(userSession)) {
                    i = 2131963406;
                }
                objArr = new Object[]{Avz};
            } else {
                i = 2131963398;
                objArr = new Object[]{Avz, AbstractC35189Ffh.A03(AbstractC166997dE.A0M(activity), j)};
            }
            String string = activity.getString(i, objArr);
            C14360o3.A0A(string);
            A0H.A05 = string;
            boolean A1N = AbstractC167007dF.A1N((j > SandboxRepository.CACHE_TTL ? 1 : (j == SandboxRepository.CACHE_TTL ? 0 : -1)));
            if (C461529z.A0A(userSession)) {
                if (A1N) {
                    i2 = 2131963404;
                } else {
                    boolean A09 = AbstractC14490oL.A09(activity);
                    int i3 = R.string.res_0x7f130072_name_removed;
                    if (A09) {
                        i3 = R.string.res_0x7f130009_name_removed;
                    }
                    A0u = AbstractC31174DnI.A0t(activity, AbstractC25227BEk.A0u(activity, i3), AbstractC35189Ffh.A03(AbstractC166997dE.A0M(activity), j), 2131963397);
                    C14360o3.A07(A0u);
                    A0H.A0r(A0u);
                    A0H.A0t(false);
                    AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35444Fk1.A00, A0H);
                    AbstractC31177DnL.A1M(AbstractC31174DnI.A0e(userSession, AnonymousClass280.A01), "TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", this.A02, true);
                }
            } else {
                i2 = 2131963396;
                if (A1N) {
                    A0u = AbstractC25227BEk.A0u(activity, 2131963403);
                    A0H.A0r(A0u);
                    A0H.A0t(false);
                    AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35444Fk1.A00, A0H);
                    AbstractC31177DnL.A1M(AbstractC31174DnI.A0e(userSession, AnonymousClass280.A01), "TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", this.A02, true);
                }
            }
            A0u = activity.getString(i2);
            C14360o3.A07(A0u);
            A0H.A0r(A0u);
            A0H.A0t(false);
            AbstractC31176DnK.A15(DialogInterfaceOnClickListenerC35444Fk1.A00, A0H);
            AbstractC31177DnL.A1M(AbstractC31174DnI.A0e(userSession, AnonymousClass280.A01), "TIME_LIMIT_EXTENSION_RESULT_REQUEST_ID_PREFIX", this.A02, true);
        }
    }

    public GQ2(C5F2 c5f2, C455127l c455127l, String str) {
        this.A01 = c455127l;
        this.A00 = c5f2;
        this.A02 = str;
    }
}
