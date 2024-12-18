package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.8Eg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183998Eg {
    public final ConstraintLayout A00;
    public final AbstractC59962oe A01;
    public final ReboundHorizontalScrollView A02;
    public final C183968Ec A03;
    public final C184008Eh A04;
    public final C184008Eh A05;
    public final C184038Er A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.652, X.8Er] */
    public C183998Eg(View view, AbstractC59962oe abstractC59962oe, C183968Ec c183968Ec) {
        this.A01 = abstractC59962oe;
        this.A03 = c183968Ec;
        View requireViewById = view.requireViewById(R.id.immersive_photo_controls_stub);
        requireViewById = requireViewById instanceof ViewStub ? ((ViewStub) requireViewById).inflate() : requireViewById;
        C14360o3.A0C(requireViewById, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) requireViewById;
        this.A00 = constraintLayout;
        View requireViewById2 = constraintLayout.requireViewById(R.id.immersive_photo_toggle);
        C14360o3.A07(requireViewById2);
        ReboundHorizontalScrollView reboundHorizontalScrollView = (ReboundHorizontalScrollView) requireViewById2;
        this.A02 = reboundHorizontalScrollView;
        Context context = view.getContext();
        C14360o3.A07(context);
        C184008Eh c184008Eh = new C184008Eh(context, R.drawable.instagram_circle_block_pano_outline_16);
        this.A04 = c184008Eh;
        C184008Eh c184008Eh2 = new C184008Eh(context, R.drawable.instagram_cube_pano_outline_16);
        this.A05 = c184008Eh2;
        ?? r0 = new AnonymousClass651() { // from class: X.8Er
            @Override // X.AnonymousClass651, X.AnonymousClass652
            public final void DLs(ReboundHorizontalScrollView reboundHorizontalScrollView2, int i, int i2) {
                C183968Ec c183968Ec2 = C183998Eg.this.A03;
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                c183968Ec2.A09.Egh(Boolean.valueOf(z));
            }
        };
        this.A06 = r0;
        reboundHorizontalScrollView.addView(c184008Eh);
        reboundHorizontalScrollView.addView(c184008Eh2);
        reboundHorizontalScrollView.A0A(r0);
        reboundHorizontalScrollView.A08(((Boolean) c183968Ec.A0C.getValue()).booleanValue() ? 1 : 0);
        reboundHorizontalScrollView.onRestoreInstanceState(reboundHorizontalScrollView.onSaveInstanceState());
        C57312k6 A00 = C07Y.A00(abstractC59962oe.getViewLifecycleOwner());
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206639Cu(this, null, 35), A00);
    }
}
