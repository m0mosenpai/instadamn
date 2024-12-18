package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: X.UAt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66347UAt extends ViewOutlineProvider {
    public final int A00;
    public final Object A01;

    public C66347UAt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i;
        int width;
        int height;
        float A04;
        switch (this.A00) {
            case 0:
                C67771Uxm c67771Uxm = ((Chip) this.A01).A04;
                if (c67771Uxm != null) {
                    c67771Uxm.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(0.0f);
                    return;
                }
            case 1:
                i = 0;
                AbstractC167007dF.A1K(view, outline);
                width = view.getWidth();
                height = view.getHeight();
                A04 = AbstractC13880nE.A04(AbstractC166997dE.A0L((View) this.A01), 12);
                outline.setRoundRect(i, i, width, height, A04);
                return;
            case 2:
                width = view.getWidth();
                height = view.getHeight();
                A04 = ((C55043OZp) this.A01).A00.A00;
                i = 0;
                outline.setRoundRect(i, i, width, height, A04);
                return;
            case 3:
                width = view.getWidth();
                C70569Wd3 c70569Wd3 = (C70569Wd3) this.A01;
                float f = c70569Wd3.A09;
                if (f <= 0.0f) {
                    height = view.getHeight();
                } else {
                    height = (int) (view.getWidth() * f);
                }
                A04 = c70569Wd3.A03;
                i = 0;
                outline.setRoundRect(i, i, width, height, A04);
                return;
            case 4:
                i = 0;
                AbstractC167007dF.A1K(view, outline);
                width = view.getWidth();
                height = view.getHeight();
                A04 = AbstractC167017dG.A05(((C23689AeO) this.A01).A08);
                outline.setRoundRect(i, i, width, height, A04);
                return;
            default:
                super.getOutline(view, outline);
                return;
        }
    }
}
