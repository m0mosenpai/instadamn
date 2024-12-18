package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl;

/* renamed from: X.7Y9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Y9 implements C7YA {
    public final AbstractC59962oe A00;
    public final C7Y7 A01;
    public final UserSession A02;

    public C7Y9(AbstractC59962oe abstractC59962oe, UserSession userSession, C7Y7 c7y7) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(c7y7, 3);
        this.A00 = abstractC59962oe;
        this.A02 = userSession;
        this.A01 = c7y7;
    }

    @Override // X.C7YA
    public final void ElC(Integer num, String str, String str2, String str3) {
        C193328hC c193328hC;
        Resources resources;
        int i;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 1) {
                    if (intValue == 3) {
                        FragmentActivity activity = this.A00.getActivity();
                        if (activity != null) {
                            c193328hC = new C193328hC((Activity) activity);
                            c193328hC.A05 = activity.getResources().getString(2131961090);
                            resources = activity.getResources();
                            i = 2131961089;
                        } else {
                            return;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    FragmentActivity activity2 = this.A00.getActivity();
                    if (activity2 == null) {
                        return;
                    }
                    c193328hC = new C193328hC((Activity) activity2);
                    c193328hC.A05 = activity2.getResources().getString(2131961074);
                    resources = activity2.getResources();
                    i = 2131961072;
                }
                c193328hC.A0r(resources.getString(i));
                c193328hC.A0T(null, EnumC193348hE.A04, 2131961073, 2131961081);
            } else {
                C28531Zo c28531Zo = C28531Zo.A04;
                UserSession userSession = this.A02;
                FragmentActivity requireActivity = this.A00.requireActivity();
                B1R b1r = new B1R(this, str, str2, str3);
                KDF kdf = new KDF();
                Bundle bundle = new Bundle();
                bundle.putString("link_url", str);
                AbstractC03240Dh.A00(bundle, userSession);
                kdf.setArguments(bundle);
                C189448aO c189448aO = new C189448aO(userSession);
                c189448aO.A0a = false;
                Context context = c28531Zo.A00;
                c189448aO.A0g = context.getString(2131960806);
                c189448aO.A1J = true;
                c189448aO.A0K = new ARZ(requireActivity, b1r);
                c189448aO.A0v = true;
                c189448aO.A0h = context.getString(2131963260);
                c189448aO.A1N = true;
                c189448aO.A0w = true;
                c189448aO.A03 = 0.5f;
                c189448aO.A1E = true;
                AbstractC140396Wt.A03(requireActivity, kdf, c189448aO.A00(), null);
                return;
            }
        } else {
            Context context2 = this.A00.getContext();
            if (context2 == null || DisappearingModePluginImpl.A01 == null) {
                return;
            }
            c193328hC = new C193328hC(context2);
            c193328hC.A0A(2131961083);
            c193328hC.A09(2131961082);
            c193328hC.A0R(null, EnumC193348hE.A04, 2131968948);
        }
        c193328hC.A0s(true);
        c193328hC.A0t(true);
        C0fJ.A00(c193328hC.A02());
    }
}
