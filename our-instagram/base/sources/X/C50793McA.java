package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.McA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50793McA extends ViewOutlineProvider {
    public final /* synthetic */ IgImageView A00;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        AbstractC167007dF.A1K(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AbstractC13880nE.A04(AbstractC166997dE.A0L(this.A00), 12));
    }

    public C50793McA(IgImageView igImageView) {
        this.A00 = igImageView;
    }
}
