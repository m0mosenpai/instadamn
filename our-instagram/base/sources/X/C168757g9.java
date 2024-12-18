package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.7g9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168757g9 {
    public C168817gG A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final Matrix A04;
    public final ViewGroup A05;
    public final C3PF A06;
    public final ConstrainedImageView A07;
    public final ConstrainedImageView A08;

    public C168757g9(ViewGroup viewGroup, int i) {
        ConstrainedImageView constrainedImageView = (ConstrainedImageView) viewGroup.requireViewById(R.id.item_emoji);
        ConstrainedImageView constrainedImageView2 = (ConstrainedImageView) viewGroup.requireViewById(R.id.item_emoji_overlay);
        this.A04 = new Matrix();
        this.A05 = viewGroup;
        this.A08 = constrainedImageView;
        this.A07 = constrainedImageView2;
        this.A02 = AbstractC13880nE.A0I(constrainedImageView.getContext()).densityDpi;
        this.A03 = i;
        constrainedImageView2.setImageResource(R.drawable.right_bottom_triangle);
        C3P9 c3p9 = new C3P9(constrainedImageView);
        c3p9.A0D = true;
        c3p9.A07 = true;
        c3p9.A04 = new C3PD() { // from class: X.7gA
            @Override // X.C3PD, X.C3PE
            public final void DQY(View view) {
                C168817gG c168817gG = C168757g9.this.A00;
                if (c168817gG != null && c168817gG.A07) {
                    C148336m3 c148336m3 = c168817gG.A04;
                    if (AbstractC170297ii.A00(c148336m3)) {
                        UserSession userSession = c168817gG.A03;
                        InterfaceC11380iw interfaceC11380iw = c168817gG.A02;
                        ConstrainedImageView constrainedImageView3 = c168817gG.A06.A08;
                        new ViewOnTouchListenerC48079LQe(interfaceC11380iw, userSession, constrainedImageView3, c148336m3, c168817gG.A05, constrainedImageView3.getWidth(), false);
                    }
                }
            }

            @Override // X.C3PD, X.C3PE
            public final boolean DsE(View view) {
                C168817gG c168817gG = C168757g9.this.A00;
                if (c168817gG != null) {
                    ConstrainedImageView constrainedImageView3 = c168817gG.A06.A08;
                    if (constrainedImageView3.A0N) {
                        int dimensionPixelSize = c168817gG.A01.getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
                        Context context = c168817gG.A00;
                        C6RB c6rb = new C6RB(context, AbstractC188878Yd.A01(context));
                        C148336m3 c148336m3 = c168817gG.A04;
                        c6rb.A0M(c148336m3.A02);
                        c6rb.A0A(dimensionPixelSize);
                        c6rb.A09();
                        c168817gG.A05.DDL(c6rb, constrainedImageView3, c148336m3);
                        return true;
                    }
                    return true;
                }
                return false;
            }
        };
        this.A06 = c3p9.A00();
        ViewGroup.LayoutParams layoutParams = constrainedImageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        constrainedImageView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = constrainedImageView2.getLayoutParams();
        layoutParams2.width = i;
        layoutParams2.height = i;
        constrainedImageView2.setLayoutParams(layoutParams2);
        this.A01 = i / r3.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
    }
}
