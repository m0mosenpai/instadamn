package X;

import android.graphics.drawable.shapes.RectShape;
import android.widget.ImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.LxY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49703LxY implements InterfaceC42241xE {
    public final /* synthetic */ MRJ A00;
    public final /* synthetic */ IgProgressImageView A01;

    public C49703LxY(MRJ mrj, IgProgressImageView igProgressImageView) {
        this.A01 = igProgressImageView;
        this.A00 = mrj;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        L1J l1j = (L1J) obj;
        AnonymousClass791 anonymousClass791 = new AnonymousClass791(new RectShape(), AnonymousClass790.A00);
        anonymousClass791.A00 = l1j.A01;
        anonymousClass791.A02 = false;
        AnonymousClass791.A00(anonymousClass791);
        IgProgressImageView igProgressImageView = this.A01;
        igProgressImageView.setBitmapAndImageRenderer(l1j.A02, anonymousClass791);
        MRJ mrj = this.A00;
        mrj.DSH(LnR.A00);
        mrj.DfQ();
        igProgressImageView.setAspectRatio(l1j.A00);
        igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
