package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tv1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65840Tv1 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 A00;

    @Override // X.AbstractC70663Fe
    public final boolean A16(Rect rect, View view, RecyclerView recyclerView, boolean z, boolean z2) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65840Tv1(Context context, ViewPager2 viewPager2) {
        super(context);
        this.A00 = viewPager2;
    }

    @Override // X.AbstractC70663Fe
    public final void A0t(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C70593Ew c70593Ew, C3F5 c3f5) {
        int i;
        int i2;
        ViewPager2 viewPager2 = this.A00.A09.A04;
        if (viewPager2.getOrientation() == 1) {
            i = AbstractC70663Fe.A0C(view);
        } else {
            i = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            i2 = AbstractC70663Fe.A0C(view);
        } else {
            i2 = 0;
        }
        accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false, false));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void A1s(C3F5 c3f5, int[] iArr) {
        ViewPager2 viewPager2 = this.A00;
        int i = viewPager2.A01;
        if (i == -1) {
            super.A1s(c3f5, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * i;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // X.AbstractC70663Fe
    public final boolean A17(Bundle bundle, C70593Ew c70593Ew, C3F5 c3f5, int i) {
        return super.A17(bundle, c70593Ew, c3f5, i);
    }

    @Override // X.AbstractC70663Fe
    public final void A1H(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, C70593Ew c70593Ew, C3F5 c3f5) {
        super.A1H(accessibilityNodeInfoCompat, c70593Ew, c3f5);
    }
}
