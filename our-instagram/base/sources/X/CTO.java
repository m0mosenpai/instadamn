package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.appcompat.widget.ViewStubCompat;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class CTO {
    public final void A00(AbstractC28368CfU abstractC28368CfU) {
        AbstractC28368CfU be7;
        ViewGroup viewGroup = (ViewGroup) abstractC28368CfU.A02;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            AbstractC167007dF.A1C(childAt);
            int id = childAt.getId();
            if (id != 16908336 && id != 16908335 && !(childAt instanceof ViewStub) && !(childAt instanceof ViewStubCompat)) {
                C28165CbC c28165CbC = abstractC28368CfU.A00;
                Integer num = abstractC28368CfU.A01;
                if (!AbstractC166997dE.A1Z(childAt.getTag(R.id.flipper_skip_view_traversal), true)) {
                    if (childAt instanceof ViewGroup) {
                        if (num == null) {
                            num = C05F.A00;
                        }
                        be7 = new AbstractC28368CfU(viewGroup, abstractC28368CfU, c28165CbC, num, childAt);
                        Be8.A00.A00(be7);
                    } else {
                        be7 = new Be7(childAt, viewGroup, abstractC28368CfU, c28165CbC, num);
                    }
                    abstractC28368CfU.A03.add(be7);
                }
            }
        }
    }
}
