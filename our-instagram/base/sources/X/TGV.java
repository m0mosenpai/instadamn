package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;

/* loaded from: classes10.dex */
public final class TGV implements InterfaceC65457TkT {
    public final int A00;
    public final Object A01;

    public TGV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65457TkT
    public final /* bridge */ /* synthetic */ void D6e(Object obj) {
        FragmentActivity activity;
        InterfaceC37129GXq interfaceC37129GXq;
        InterfaceC37174GZl BFY;
        final T51 t51;
        InterfaceC65457TkT tgx;
        IgFragmentActivity igFragmentActivity;
        final C63179See c63179See = (C63179See) obj;
        if (this.A00 != 0) {
            if (c63179See != null) {
                C60936Rbq c60936Rbq = (C60936Rbq) this.A01;
                final Activity activity2 = (Activity) c60936Rbq.A01;
                Fragment fragment = (Fragment) c60936Rbq.A02;
                final EnumC31713DwI enumC31713DwI = (EnumC31713DwI) c60936Rbq.A05;
                C62513SEp c62513SEp = (C62513SEp) c60936Rbq.A04;
                if (activity2 == null) {
                    C6FX A0s = AbstractC25225BEi.A0s();
                    A0s.A01(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
                    A0s.A02(null);
                    A0s.A03(null, 2);
                    C131845xK.A00(c62513SEp.A00, AbstractC25227BEk.A0f(A0s, null, 3), c62513SEp.A01);
                    return;
                }
                C37766Gjh c37766Gjh = new C37766Gjh(c63179See, 3);
                C14360o3.A0B(fragment, 0);
                FragmentActivity activity3 = fragment.getActivity();
                if ((activity3 instanceof BaseFragmentActivity) && (igFragmentActivity = (IgFragmentActivity) activity3) != null) {
                    igFragmentActivity.registerOnActivityResultListener(c37766Gjh);
                }
                final TGW tgw = new TGW(3, activity2, c62513SEp);
                final HintRequest hintRequest = new HintRequest(new CredentialPickerConfig(2, 1, false, true, false), null, null, new String[]{"https://accounts.google.com"}, 2, false, false, false);
                t51 = c63179See.A00;
                if (t51 == null) {
                    return;
                } else {
                    tgx = new InterfaceC65457TkT() { // from class: X.TGa
                        @Override // X.InterfaceC65457TkT
                        public final void D6e(Object obj2) {
                            AbstractC1335861e abstractC1335861e = (AbstractC1335861e) obj2;
                            c63179See.A01(activity2, hintRequest, abstractC1335861e, t51, tgw, enumC31713DwI);
                        }
                    };
                }
            } else {
                return;
            }
        } else {
            if (c63179See == null || (activity = ((Fragment) this.A01).getActivity()) == null || (interfaceC37129GXq = AbstractC31710DwF.A00) == null || (BFY = interfaceC37129GXq.BFY()) == null) {
                return;
            }
            C64492TGe c64492TGe = C64492TGe.A00;
            t51 = c63179See.A00;
            if (t51 == null) {
                return;
            } else {
                tgx = new TGX(activity, BFY, c63179See, c64492TGe);
            }
        }
        t51.A00(tgx);
    }
}
