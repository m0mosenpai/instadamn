package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.R;
import java.util.NoSuchElementException;

/* loaded from: classes11.dex */
public final class W3Q {
    public static final U6L A00(Context context, WTT wtt, InterfaceC72039XGh interfaceC72039XGh, InterfaceC62872tQ interfaceC62872tQ, Integer num) {
        SparseArray sparseArray;
        Integer num2;
        if (context instanceof Activity) {
            AbstractC43592JPx.A08((Activity) context).setTag(R.id.testing_id_view_tag_key, "app_root_window");
        }
        SparseArray sparseArray2 = wtt.A00;
        if (sparseArray2 == null || (sparseArray = sparseArray2.clone()) == null) {
            sparseArray = new SparseArray(3);
        }
        sparseArray.put(R.id.bk_context_key_app_id, wtt.A05);
        sparseArray.put(R.id.bk_screen_container, interfaceC72039XGh);
        InterfaceC65469Tkm interfaceC65469Tkm = wtt.A01;
        if (interfaceC65469Tkm != null) {
            num2 = Integer.valueOf(interfaceC65469Tkm.Bql());
        } else {
            num2 = null;
        }
        sparseArray.put(R.id.bk_screen_container_type, num2);
        U6L u6l = new U6L(context, sparseArray, wtt, interfaceC62872tQ, num);
        interfaceC72039XGh.getLifecycle().A09(u6l);
        return u6l;
    }

    public final U6L A01(Context context, Bundle bundle, InterfaceC72039XGh interfaceC72039XGh, InterfaceC62872tQ interfaceC62872tQ) {
        String str;
        int i;
        try {
            int i2 = bundle.getInt("bloks_screen_navigation_state", 0);
            for (Integer num : C05F.A00(3)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == i2) {
                    return A00(context, WTT.A0A.A01(bundle), interfaceC72039XGh, interfaceC62872tQ, num);
                }
            }
            throw new NoSuchElementException(MSV.A00(6));
        } catch (VHp e) {
            Bundle bundle2 = bundle.getBundle("key_screen_container_props_bundle");
            if (bundle2 != null) {
                str = bundle2.getString("key_app_id");
            } else {
                str = null;
            }
            AbstractC25241Le.A00(null, "ScreenContainerDelegate", AnonymousClass001.A0R("Failed to properly initialize screen props for screen with appId: ", str), e);
            throw e;
        }
    }
}
