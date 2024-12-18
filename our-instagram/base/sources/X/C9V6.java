package X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9V6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V6 extends C3OO implements InterfaceC58290Psi {
    public final View A00;
    public final IgImageView A01;
    public final C12W A02;

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.A00);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        this.A00.setVisibility(8);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A00.setVisibility(0);
    }

    public C9V6(View view) {
        super(view);
        this.A00 = view;
        this.A02 = new AnonymousClass197(null);
        this.A01 = AbstractC167007dF.A0T(view, R.id.memory_item_thumbnail);
    }
}
