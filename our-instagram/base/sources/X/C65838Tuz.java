package X;

import android.R;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tuz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65838Tuz {
    public AbstractC65392xb A00;
    public final /* synthetic */ ViewPager2 A03;
    public final /* synthetic */ ViewPager2 A04;
    public final AnonymousClass054 A02 = new C65834Tur(this, 0);
    public final AnonymousClass054 A01 = new C65834Tur(this, 1);

    public C65838Tuz(ViewPager2 viewPager2) {
        this.A04 = viewPager2;
        this.A03 = viewPager2;
    }

    public final void A00() {
        int itemCount;
        C012804r c012804r;
        ViewPager2 viewPager2 = this.A04;
        int i = R.id.accessibilityActionPageLeft;
        AbstractC010103p.A09(viewPager2, R.id.accessibilityActionPageLeft);
        AbstractC010103p.A09(viewPager2, R.id.accessibilityActionPageRight);
        AbstractC010103p.A09(viewPager2, R.id.accessibilityActionPageUp);
        AbstractC010103p.A09(viewPager2, R.id.accessibilityActionPageDown);
        C2UU c2uu = viewPager2.A04.A0A;
        if (c2uu != null && (itemCount = c2uu.getItemCount()) != 0 && viewPager2.A0B) {
            if (viewPager2.getOrientation() == 0) {
                int layoutDirection = ((AbstractC70663Fe) viewPager2.A02).A07.getLayoutDirection();
                int i2 = R.id.accessibilityActionPageRight;
                if (layoutDirection == 1) {
                    i2 = R.id.accessibilityActionPageLeft;
                    i = R.id.accessibilityActionPageRight;
                }
                if (viewPager2.A00 < itemCount - 1) {
                    AbstractC010103p.A0E(viewPager2, new C012804r(i2, (CharSequence) null), this.A02);
                }
                if (viewPager2.A00 > 0) {
                    c012804r = new C012804r(i, (CharSequence) null);
                } else {
                    return;
                }
            } else {
                if (viewPager2.A00 < itemCount - 1) {
                    AbstractC010103p.A0E(viewPager2, new C012804r(R.id.accessibilityActionPageDown, (CharSequence) null), this.A02);
                }
                if (viewPager2.A00 <= 0) {
                    return;
                } else {
                    c012804r = new C012804r(R.id.accessibilityActionPageUp, (CharSequence) null);
                }
            }
            AbstractC010103p.A0E(viewPager2, c012804r, this.A01);
        }
    }
}
