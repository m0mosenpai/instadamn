package X;

import android.view.View;
import androidx.core.view.ViewKt$allViews$1;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.4oM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105064oM {
    public static final void A01(View view) {
        C14360o3.A0B(view, 0);
        C105094oP A0D = AbstractC224917l.A0D(new ViewKt$allViews$1(view, null));
        while (A0D.hasNext()) {
            ArrayList arrayList = A00((View) A0D.next()).A00;
            C14360o3.A0B(arrayList, 0);
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((InterfaceC1128257o) arrayList.get(size)).DeW();
            }
        }
    }

    public static final boolean A02(View view) {
        Boolean bool;
        for (Object obj : AbstractC224717j.A0C(view.getParent(), C007202m.A00)) {
            if (obj instanceof View) {
                View view2 = (View) obj;
                C14360o3.A0B(view2, 0);
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final C105104oQ A00(View view) {
        C105104oQ c105104oQ = (C105104oQ) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c105104oQ == null) {
            C105104oQ c105104oQ2 = new C105104oQ();
            view.setTag(R.id.pooling_container_listener_holder_tag, c105104oQ2);
            return c105104oQ2;
        }
        return c105104oQ;
    }
}
