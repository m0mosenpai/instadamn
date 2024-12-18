package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;

/* renamed from: X.801, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass801 extends C3OO {
    public final View A00;
    public final ConstraintLayout A01;
    public final C3PF A02;
    public final InterfaceC16820sZ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass801(ConstraintLayout constraintLayout, InterfaceC16820sZ interfaceC16820sZ) {
        super(constraintLayout);
        C14360o3.A0B(constraintLayout, 1);
        this.A01 = constraintLayout;
        this.A03 = interfaceC16820sZ;
        View requireViewById = constraintLayout.requireViewById(R.id.gallery_grid_camera_item_overlay);
        C14360o3.A07(requireViewById);
        this.A00 = requireViewById;
        C3P9 c3p9 = new C3P9(constraintLayout);
        c3p9.A0D = true;
        c3p9.A07 = true;
        c3p9.A02 = 0.92f;
        c3p9.A04 = new AnonymousClass803() { // from class: X.802
            @Override // X.C3PE
            public final boolean DsE(View view) {
                InterfaceC16820sZ interfaceC16820sZ2 = AnonymousClass801.this.A03;
                if (interfaceC16820sZ2 != null) {
                    interfaceC16820sZ2.invoke();
                    return true;
                }
                return true;
            }
        };
        this.A02 = c3p9.A00();
        constraintLayout.setAccessibilityDelegate(null);
        constraintLayout.setContentDescription(constraintLayout.getContext().getString(2131952043));
        AbstractC56952jT.A04(constraintLayout, C05F.A01);
    }
}
