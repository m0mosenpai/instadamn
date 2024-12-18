package X;

import android.view.ViewGroup;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.J4a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43111J4a implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C38214GrJ A01;

    public RunnableC43111J4a(ViewGroup viewGroup, C38214GrJ c38214GrJ) {
        this.A01 = c38214GrJ;
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C38214GrJ c38214GrJ = this.A01;
        IgFrameLayout igFrameLayout = c38214GrJ.A01;
        if (igFrameLayout != null) {
            igFrameLayout.removeView(c38214GrJ.A06);
        }
        ViewGroup viewGroup = c38214GrJ.A07;
        if (viewGroup != null) {
            viewGroup.addView(c38214GrJ.A06, c38214GrJ.A00);
        }
        this.A00.setVisibility(0);
        AbstractC167007dF.A0x(c38214GrJ.A01);
    }
}
