package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.UJw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66492UJw extends C3FK {
    public final /* synthetic */ AbstractC70663Fe A00;
    public final /* synthetic */ C2Z5 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66492UJw(AbstractC70663Fe abstractC70663Fe, RecyclerView recyclerView, C2Z5 c2z5) {
        super(recyclerView);
        this.A01 = c2z5;
        this.A00 = abstractC70663Fe;
    }

    @Override // X.C3FK, X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        List list;
        super.A0Y(view, accessibilityNodeInfoCompat);
        C2Z5 c2z5 = this.A01;
        synchronized (c2z5) {
            list = c2z5.A0i;
        }
        int size = list.size();
        AbstractC70663Fe abstractC70663Fe = this.A00;
        int i = 1;
        if (abstractC70663Fe.A1Y()) {
            i = size;
        }
        if (!abstractC70663Fe.A1X()) {
            size = 1;
        }
        accessibilityNodeInfoCompat.mInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, size, false, 0));
    }
}
