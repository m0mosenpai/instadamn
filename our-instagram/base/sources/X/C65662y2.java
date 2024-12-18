package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.2y2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65662y2 extends AbstractC65632xz {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
        if (this.A04) {
            anonymousClass306.A7a(1);
        }
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "Gap";
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        if (i == 0) {
            return this.A03;
        }
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1763085996);
        if (i == 0) {
            if (this.A03 != view.getLayoutParams().height) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = this.A03;
                view.setLayoutParams(layoutParams);
            }
            int i2 = this.A00;
            if (i2 != 0) {
                view.setBackgroundColor(view.getContext().getColor(i2));
            }
        }
        C0f9.A0A(-496761143, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        int i2;
        int A03 = C0f9.A03(1214308490);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 0) {
            if (i == 1) {
                inflate = from.inflate(R.layout.divider_layout, viewGroup, false);
                View requireViewById = inflate.requireViewById(R.id.divider);
                int i3 = this.A01;
                if (i3 != 0) {
                    requireViewById.setBackgroundColor(requireViewById.getContext().getColor(i3));
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) requireViewById.getLayoutParams();
                int i4 = this.A02;
                marginLayoutParams.leftMargin = i4;
                marginLayoutParams.rightMargin = i4;
                i2 = 803393162;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(AnonymousClass001.A0O(AbstractC111324zv.A00(645), i));
                C0f9.A0A(1173193140, A03);
                throw illegalArgumentException;
            }
        } else {
            inflate = from.inflate(R.layout.gap_binder_layout, viewGroup, false);
            i2 = -2024317049;
        }
        C0f9.A0A(i2, A03);
        return inflate;
    }
}
