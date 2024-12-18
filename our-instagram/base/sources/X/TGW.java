package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.login.smartlock.impl.SmartLockPluginImpl;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TGW implements InterfaceC65457TkT {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public TGW(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC65457TkT
    public final void D6e(Object obj) {
        IgFragmentActivity igFragmentActivity;
        C6FW A0f;
        switch (this.A00) {
            case 0:
                ((InterfaceC65457TkT) this.A01).D6e(this.A02);
                return;
            case 1:
                SmartLockPluginImpl smartLockPluginImpl = (SmartLockPluginImpl) this.A01;
                Map map = smartLockPluginImpl.A02;
                Object obj2 = this.A02;
                map.put(obj2, obj);
                java.util.Set set = (java.util.Set) smartLockPluginImpl.A01.remove(obj2);
                if (set == null) {
                    return;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((InterfaceC65457TkT) it.next()).D6e(obj);
                }
                return;
            case 2:
                C64493TGf c64493TGf = (C64493TGf) this.A02;
                Fragment fragment = c64493TGf.A00;
                InterfaceC60602pj interfaceC60602pj = c64493TGf.A01;
                FragmentActivity activity = fragment.getActivity();
                if ((activity instanceof BaseFragmentActivity) && (igFragmentActivity = (IgFragmentActivity) activity) != null) {
                    igFragmentActivity.unregisterOnActivityResultListener(interfaceC60602pj);
                }
                ((InterfaceC65457TkT) this.A01).D6e(obj);
                return;
            default:
                C62703SMr c62703SMr = (C62703SMr) obj;
                C62513SEp c62513SEp = (C62513SEp) this.A02;
                if (c62703SMr != null) {
                    String str = c62703SMr.A01;
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = c62703SMr.A00;
                        String str3 = c62703SMr.A02;
                        C6FX A0s = AbstractC25225BEi.A0s();
                        A0s.A01("success");
                        A0s.A02(str2);
                        A0s.A03(str3, 2);
                        A0f = AbstractC25227BEk.A0f(A0s, str, 3);
                    } else {
                        return;
                    }
                } else {
                    C6FX A0s2 = AbstractC25225BEi.A0s();
                    A0s2.A01(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
                    A0s2.A02(null);
                    A0s2.A03(null, 2);
                    A0f = AbstractC25227BEk.A0f(A0s2, null, 3);
                }
                C131845xK.A00(c62513SEp.A00, A0f, c62513SEp.A01);
                return;
        }
    }
}
