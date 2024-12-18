package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.Jaa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43870Jaa {
    public View A00;
    public View A01;
    public View A02;
    public Integer A03;
    public float A04;
    public final ViewStub A05;

    public C43870Jaa(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A05 = viewStub;
        this.A03 = C05F.A0C;
    }

    public final float A00() {
        if (this.A03 == C05F.A0C) {
            return 1.0f;
        }
        return this.A04;
    }

    public final void A01(int i, int i2, float f) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        Object obj;
        int A00;
        int i3;
        int i4;
        View view;
        if (this.A01 == null) {
            View inflate = this.A05.inflate();
            this.A01 = inflate;
            View view2 = null;
            if (inflate != null) {
                view = inflate.findViewById(R.id.dynamic_overlay_start_bar);
            } else {
                view = null;
            }
            this.A02 = view;
            View view3 = this.A01;
            if (view3 != null) {
                view2 = view3.findViewById(R.id.dynamic_overlay_end_bar);
            }
            this.A00 = view2;
        }
        AbstractC167007dF.A0w(this.A01);
        this.A04 = f;
        View view4 = this.A02;
        FrameLayout.LayoutParams layoutParams3 = null;
        if (view4 != null) {
            layoutParams = view4.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        View view5 = this.A00;
        if (view5 != null) {
            obj = view5.getLayoutParams();
        } else {
            obj = null;
        }
        if (obj instanceof FrameLayout.LayoutParams) {
            layoutParams3 = (FrameLayout.LayoutParams) obj;
        }
        if (f < 1.0f) {
            this.A03 = C05F.A00;
            i4 = ((int) (i - (i2 * A00()))) / 2;
            if (layoutParams2 != null) {
                layoutParams2.gravity = 3;
                ((ViewGroup.LayoutParams) layoutParams2).width = i4;
                ((ViewGroup.LayoutParams) layoutParams2).height = -1;
            }
            if (layoutParams3 != null) {
                i3 = 5;
                A00 = -1;
                layoutParams3.gravity = i3;
                ((ViewGroup.LayoutParams) layoutParams3).width = i4;
                ((ViewGroup.LayoutParams) layoutParams3).height = A00;
            }
        } else {
            this.A03 = C05F.A01;
            A00 = ((int) (i2 - (i / A00()))) / 2;
            if (layoutParams2 != null) {
                layoutParams2.gravity = 48;
                ((ViewGroup.LayoutParams) layoutParams2).width = -1;
                ((ViewGroup.LayoutParams) layoutParams2).height = A00;
            }
            if (layoutParams3 != null) {
                i3 = 80;
                i4 = -1;
                layoutParams3.gravity = i3;
                ((ViewGroup.LayoutParams) layoutParams3).width = i4;
                ((ViewGroup.LayoutParams) layoutParams3).height = A00;
            }
        }
        View view6 = this.A02;
        if (view6 != null) {
            view6.setLayoutParams(layoutParams2);
        }
        View view7 = this.A00;
        if (view7 != null) {
            view7.setLayoutParams(layoutParams3);
        }
    }
}
