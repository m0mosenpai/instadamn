package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.SMj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62695SMj {
    public InterfaceC02550Ad A00;
    public final Intent A01;
    public final Bundle A02;
    public final C00X A03;
    public final FragmentActivity A04;
    public final C00V A05;

    public final void A00(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        Bundle A0A = AbstractC31173DnH.A0A(this.A04);
        if (A0A != null) {
            C40701ud A01 = AbstractC40691uc.A01(AbstractC31171DnF.A0G(A0A));
            InterfaceC02550Ad interfaceC02550Ad = this.A00;
            C00V c00v = this.A05;
            C14360o3.A0B(interfaceC02550Ad, 0);
            T8M t8m = new T8M(1, bundle, c00v, interfaceC02550Ad);
            try {
                Object A0l = AbstractC58323PtF.A0l(null, C62780SQy.class, "create");
                C14360o3.A0C(A0l, "null cannot be cast to non-null type com.facebook.bwpclientauthmanager.shared.AmazonBwpRefreshAccessTokenMutation.Builder");
                C64033Sy5 c64033Sy5 = (C64033Sy5) A0l;
                c64033Sy5.A00.A00(C63295Sgw.A00(bundle), "extra_data");
                PandoGraphQLRequest build = c64033Sy5.build();
                C14360o3.A07(build);
                C64006Sxd.A00(new C58510Pwe(t8m, 6), build, A01, t8m, 6);
                return;
            } catch (Exception e) {
                if ((e instanceof ClassNotFoundException) || (e instanceof IllegalAccessException) || (e instanceof InstantiationException) || (e instanceof InvocationTargetException) || (e instanceof NoSuchMethodException)) {
                    throw AbstractC58318PtA.A0f(e);
                }
                throw e;
            }
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.00g] */
    public C62695SMj(Intent intent, Bundle bundle, C00V c00v, FragmentActivity fragmentActivity) {
        this.A04 = fragmentActivity;
        this.A02 = bundle;
        this.A01 = intent;
        this.A05 = c00v;
        this.A03 = new C05100Oz(fragmentActivity.registerForActivityResult(new C0P1(new Object(), AbstractC58322PtE.A0Z()), c00v));
        Bundle A0A = AbstractC31173DnH.A0A(fragmentActivity);
        if (A0A != null) {
            this.A00 = AbstractC12220kQ.A02(AbstractC31171DnF.A0G(A0A));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
