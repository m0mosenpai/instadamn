package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public final class M3D implements Runnable {
    public final /* synthetic */ LIj A00;
    public final /* synthetic */ C23031Ai A01;

    public M3D(LIj lIj, C23031Ai c23031Ai) {
        this.A00 = lIj;
        this.A01 = c23031Ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LIj lIj = this.A00;
        C23031Ai c23031Ai = this.A01;
        IgImageView igImageView = lIj.A0C;
        if (igImageView.isActivated() && igImageView.isSelected()) {
            InterfaceC16530ry interfaceC16530ry = c23031Ai.A31;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 328)) {
                FragmentActivity requireActivity = lIj.A0A.requireActivity();
                Context context = igImageView.getContext();
                C5SU A0f = AbstractC167017dG.A0f(requireActivity, context.getResources().getString(2131976741));
                A0f.A04(igImageView, 0, -AbstractC167017dG.A0B(context), true);
                A0f.A02();
                A0f.A00().A07(lIj.A0B);
                AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 328, true);
            }
        }
    }
}
