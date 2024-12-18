package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;

/* renamed from: X.Jrl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44764Jrl extends C3OO {
    public C44201Jg4 A00;
    public final float A01;
    public final Drawable A02;
    public final ConstraintLayout A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgSimpleImageView A06;
    public final NoteBubbleView A07;
    public final /* synthetic */ C45677KJo A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44764Jrl(View view, C45677KJo c45677KJo) {
        super(view);
        this.A08 = c45677KJo;
        this.A03 = (ConstraintLayout) AbstractC166987dD.A0c(view, R.id.floaty_cluster_item_container);
        this.A06 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.floaty_cluster_pog_view);
        this.A07 = (NoteBubbleView) AbstractC166987dD.A0c(view, R.id.floaty_cluster_item_note_bubble_view);
        this.A05 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.floaty_cluster_item_name_plate);
        Context A0L = AbstractC166997dE.A0L(view);
        this.A01 = AbstractC166997dE.A04(A0L, R.dimen.accent_edge_thickness);
        this.A04 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.floaty_cluster_like_view);
        this.A02 = AbstractC44198Jg1.A04(A0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r1 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.L5X A00(X.C45128JyU r6) {
        /*
            X.4F5 r1 = r6.A05
            r4 = 0
            if (r1 == 0) goto L2a
            java.util.List r0 = r1.A0J
            if (r0 == 0) goto L2a
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
            X.MOe r0 = (X.InterfaceC50424MOe) r0
            if (r0 == 0) goto L2a
            X.6C9 r5 = r0.BXJ()
        L15:
            com.instagram.api.schemas.NotePogVideoDict r4 = r1.A08
        L17:
            com.facebook.android.maps.model.LatLng r3 = r6.A04
            double r0 = r3.A00
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            double r0 = r3.A01
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            X.L5X r0 = X.LKX.A02(r4, r5, r2, r0)
            return r0
        L2a:
            r5 = r4
            if (r1 == 0) goto L17
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44764Jrl.A00(X.JyU):X.L5X");
    }
}
