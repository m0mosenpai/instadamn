package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.archive.fragment.ArchiveReelPeopleFragment;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Mmc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51377Mmc extends C3OO implements InterfaceC58290Psi {
    public C56078Ouv A00;
    public final ImageView A01;
    public final C170797jW A02;
    public final ArchiveReelPeopleFragment A03;
    public final IgTextView A04;
    public final CircularImageView A05;
    public final CircularImageView A06;

    @Override // X.InterfaceC58290Psi
    public final /* synthetic */ void El5(boolean z) {
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(this.itemView);
    }

    @Override // X.InterfaceC58290Psi
    /* renamed from: Bfj */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(this.itemView);
    }

    @Override // X.InterfaceC58290Psi
    public final void CMt() {
        AbstractC43594JPz.A0G(this.itemView).start();
    }

    @Override // X.InterfaceC58290Psi
    public final void ElQ() {
        AbstractC43594JPz.A0H(this.itemView).start();
    }

    public C51377Mmc(View view, ArchiveReelPeopleFragment archiveReelPeopleFragment) {
        super(view);
        this.A06 = AbstractC31173DnH.A0T(view, R.id.user_avatar);
        this.A04 = AbstractC31172DnG.A0X(view, R.id.username);
        CircularImageView A0T = AbstractC31173DnH.A0T(view, R.id.darkening_overlay);
        this.A05 = A0T;
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.user_loading_spinner);
        this.A01 = A0I;
        Context context = view.getContext();
        A0T.setImageDrawable(new ColorDrawable(Color.argb(100, 0, 0, 0)));
        C170797jW c170797jW = new C170797jW(context);
        this.A02 = c170797jW;
        c170797jW.A00(AbstractC13880nE.A00(context, 2.0f));
        c170797jW.A05(AbstractC166997dE.A01(context));
        c170797jW.A02(Paint.Cap.ROUND);
        A0I.setImageDrawable(c170797jW);
        c170797jW.start();
        this.A03 = archiveReelPeopleFragment;
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A01(view);
        A0s.A0D = true;
        A0s.A07 = true;
        A0s.A06 = false;
        A0s.A04 = new EZQ(this, 0);
        A0s.A00();
    }
}
