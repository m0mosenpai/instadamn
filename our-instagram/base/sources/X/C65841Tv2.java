package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tv2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65841Tv2 implements InterfaceC69563Aq {
    public final /* synthetic */ ViewPager2 A00;

    @Override // X.InterfaceC69563Aq
    public final void D37(View view) {
    }

    public C65841Tv2(ViewPager2 viewPager2) {
        this.A00 = viewPager2;
    }

    @Override // X.InterfaceC69563Aq
    public final void D36(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.width == -1 && layoutParams.height == -1) {
        } else {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
