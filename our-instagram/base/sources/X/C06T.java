package X;

import android.os.Bundle;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.06T, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C06T {
    public static final void A00(Bundle bundle, ClassLoader classLoader, List list) {
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        C14360o3.A0B(classLoader, 2);
        if (list != null && !list.isEmpty() && (bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key")) != null && (bundle3 = bundle2.getBundle("android:support:fragments")) != null) {
            bundle3.setClassLoader(classLoader);
            FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            if (fragmentManagerState != null) {
                C0K8.A0D("FragmentManagerSavedStateHacks", "Updating fragmentManagerState");
                C16930sl c16930sl = C16930sl.A00;
                Iterator<String> it = bundle3.keySet().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    C14360o3.A0A(next);
                    if (AbstractC002300n.A0h(next, "fragment_", false) && (bundle4 = bundle3.getBundle(next)) != null) {
                        bundle4.setClassLoader(classLoader);
                        FragmentState fragmentState = (FragmentState) bundle4.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                        if (fragmentState != null) {
                            if (!list.contains(fragmentState.A05)) {
                                Integer.valueOf(fragmentState.A01);
                            } else {
                                ArrayList arrayList = fragmentManagerState.A02;
                                String str = fragmentState.A07;
                                arrayList.remove(str);
                                fragmentManagerState.A03.remove(str);
                                it.remove();
                            }
                        }
                    }
                }
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.A07;
                if (backStackRecordStateArr != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (BackStackRecordState backStackRecordState : backStackRecordStateArr) {
                        if (!list.contains(backStackRecordState.A06)) {
                            arrayList2.add(backStackRecordState);
                        }
                    }
                    fragmentManagerState.A07 = (BackStackRecordState[]) arrayList2.toArray(new BackStackRecordState[0]);
                }
                bundle3.putParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, fragmentManagerState);
            }
        }
    }
}
