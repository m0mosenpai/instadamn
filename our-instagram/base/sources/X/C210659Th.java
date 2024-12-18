package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.9Th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210659Th extends FrameLayout implements InterfaceC25212BDk {
    public C22995ABu A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final RectF A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210659Th(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        Resources resources = getResources();
        this.A02 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A03 = AbstractC166997dE.A07(resources);
        this.A04 = AbstractC166987dD.A0X();
    }

    @Override // X.InterfaceC25212BDk
    public final boolean AFq() {
        return AbstractC167007dF.A1W(this.A00);
    }

    @Override // X.InterfaceC25212BDk
    public final void DWs(float f) {
        float f2;
        C22995ABu c22995ABu = this.A00;
        if (c22995ABu != null) {
            int size = c22995ABu.A09.size();
            for (int i = 0; i < size; i++) {
                C22942A9m A00 = c22995ABu.A00(i);
                if (A00 != null) {
                    C210649Te c210649Te = A00.A04;
                    float A02 = AbstractC13600mm.A02(f, 0.0f, 1.0f, 0.0f, A00.A00);
                    float A022 = AbstractC13600mm.A02(f, 0.0f, 1.0f, 0.0f, A00.A01);
                    float f3 = this.A03;
                    c210649Te.setY(A022 + f3);
                    if (this.A01) {
                        f2 = ((AbstractC166987dD.A07(this) - A02) - this.A02) - f3;
                    } else {
                        f2 = f3 + A02;
                    }
                    c210649Te.setX(f2);
                    if (this.A04.contains(A00.A00, A00.A01)) {
                        c210649Te.setAlpha(f);
                    }
                }
            }
            return;
        }
        AbstractC12120kG.A07("SecondaryPickerView", "Needs to bind Adapter to use this view in onOpenProgressUpdated", null);
    }

    @Override // X.InterfaceC25212BDk
    public int getMenuHeight() {
        C22995ABu c22995ABu = this.A00;
        if (c22995ABu != null) {
            int ceil = ((int) Math.ceil(c22995ABu.A09.size() / c22995ABu.A01)) * c22995ABu.A02;
            int i = c22995ABu.A03;
            int i2 = ceil + (i * 2);
            if (!c22995ABu.A0A) {
                i = 0;
            }
            return i2 + i;
        }
        return 0;
    }

    @Override // X.InterfaceC25212BDk
    public int getMenuWidth() {
        C22995ABu c22995ABu = this.A00;
        if (c22995ABu != null) {
            int i = c22995ABu.A02 * c22995ABu.A01;
            int i2 = c22995ABu.A03 * 2;
            int i3 = i + i2;
            if (!c22995ABu.A0A) {
                i2 = 0;
            }
            return i3 + i2;
        }
        return 0;
    }

    public View getView() {
        return this;
    }

    public final void setSelectedItem(int i) {
        C22942A9m A00;
        C22995ABu c22995ABu = this.A00;
        if (c22995ABu == null) {
            AbstractC12120kG.A07("SecondaryPickerView", "Needs to bind Adapter to use this view in setSelectedItem", null);
            return;
        }
        if (i < 0 || i >= c22995ABu.A08.size()) {
            return;
        }
        C22942A9m A002 = c22995ABu.A00(c22995ABu.A00);
        if (A002 != null) {
            A002.A04.setItemViewState(false);
        }
        c22995ABu.A00 = i;
        if (!C8GX.A06(c22995ABu.A06) || (A00 = c22995ABu.A00(c22995ABu.A00)) == null) {
            return;
        }
        A00.A04.setItemViewState(true);
    }

    @Override // X.InterfaceC25212BDk
    public void setIsOnRightSide(boolean z) {
        this.A01 = z;
    }
}
