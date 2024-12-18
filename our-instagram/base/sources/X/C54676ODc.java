package X;

import android.view.View;
import android.widget.CheckBox;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.ODc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54676ODc {
    public O71 A00;
    public final View A01;
    public final CheckBox A02;
    public final C3PF A03;
    public final IgImageView A04;
    public final MediaFrameLayout A05;

    public C54676ODc(View view, CheckBox checkBox, IgImageView igImageView, MediaFrameLayout mediaFrameLayout) {
        AbstractC167017dG.A1R(igImageView, checkBox);
        this.A05 = mediaFrameLayout;
        this.A04 = igImageView;
        this.A02 = checkBox;
        this.A01 = view;
        C3P9 A0s = AbstractC166987dD.A0s(mediaFrameLayout);
        A0s.A07 = true;
        A0s.A02 = 0.98f;
        A0s.A04 = new C52374NFq(this, 2);
        this.A03 = A0s.A00();
    }
}
