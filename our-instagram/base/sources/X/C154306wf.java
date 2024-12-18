package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154306wf {
    public Drawable A02;
    public View A03;
    public C154316wg A04;
    public TabLayout A05;
    public CharSequence A06;
    public CharSequence A07;
    public int A01 = -1;
    public int A00 = -1;

    public final View A00() {
        return this.A03;
    }

    public final void A01() {
        TabLayout tabLayout = this.A05;
        if (tabLayout != null) {
            tabLayout.A0F(this, true);
            return;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public final void A02(Drawable drawable) {
        this.A02 = drawable;
        TabLayout tabLayout = this.A05;
        if (tabLayout.A03 == 1 || tabLayout.A02 == 2) {
            tabLayout.A0G(true);
        }
        C154316wg c154316wg = this.A04;
        if (c154316wg != null) {
            c154316wg.A04();
        }
    }

    public final void A03(View view) {
        this.A03 = view;
        C154316wg c154316wg = this.A04;
        if (c154316wg != null) {
            c154316wg.A04();
        }
    }

    public final void A04(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.A06) && !TextUtils.isEmpty(charSequence)) {
            this.A04.setContentDescription(charSequence);
        }
        this.A07 = charSequence;
        C154316wg c154316wg = this.A04;
        if (c154316wg != null) {
            c154316wg.A04();
        }
    }
}
