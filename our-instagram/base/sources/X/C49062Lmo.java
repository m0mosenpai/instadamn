package X;

import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.Lmo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49062Lmo implements InterfaceC50432MOm {
    public final /* synthetic */ ConstrainedImageView A00;
    public final /* synthetic */ C49130Lo9 A01;

    public C49062Lmo(ConstrainedImageView constrainedImageView, C49130Lo9 c49130Lo9) {
        this.A00 = constrainedImageView;
        this.A01 = c49130Lo9;
    }

    @Override // X.InterfaceC50432MOm
    public final void D6U(Object obj) {
        C14360o3.A0B(obj, 0);
        this.A00.setImageDrawable(C49130Lo9.A00(this.A01, (String) obj));
    }
}
