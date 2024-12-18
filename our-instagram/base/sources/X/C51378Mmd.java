package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.Mmd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51378Mmd extends C3OO implements InterfaceC58290Psi {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public ImageUrl A03;
    public C3PE A04;
    public Reel A05;
    public final C170797jW A06;
    public final C3PF A07;

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
        this.A00.setVisibility(4);
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        this.A00.setVisibility(0);
    }

    public C51378Mmd(View view, int i, int i2) {
        super(view);
        this.A02 = AbstractC166997dE.A0T(view, R.id.text_view);
        this.A00 = AbstractC31173DnH.A0I(view, R.id.image_view);
        this.A01 = AbstractC31173DnH.A0I(view, R.id.loading_spinner);
        Context context = view.getContext();
        C170797jW c170797jW = new C170797jW(context);
        this.A06 = c170797jW;
        c170797jW.A00(AbstractC13880nE.A00(context, 2.0f));
        c170797jW.A05(AbstractC166997dE.A01(context));
        c170797jW.A02(Paint.Cap.ROUND);
        this.A01.setImageDrawable(c170797jW);
        AbstractC43592JPx.A1G(view, i);
        AbstractC43592JPx.A1F(view, i);
        AbstractC43592JPx.A1F(this.A00, i2);
        AbstractC43592JPx.A1G(this.A00, i2);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A02 = 0.85f;
        A0s.A07 = true;
        A0s.A0D = true;
        A0s.A04 = new C56157OwP(this, 0);
        this.A07 = A0s.A00();
    }
}
