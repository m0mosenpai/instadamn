package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.IwX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42795IwX implements InterfaceC58290Psi {
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public TextView A03;
    public TextView A04;
    public C3W4 A05;
    public CircularImageView A06;
    public IgProgressImageView A07;
    public MediaFrameLayout A08;

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A07);
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A07);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.A07.setVisibility(8);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A07.setVisibility(0);
    }
}
