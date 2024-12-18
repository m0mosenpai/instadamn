package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Jrm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44765Jrm extends C3OO {
    public MQO A00;
    public C46520KiJ A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgImageView A04;
    public final UserSession A05;
    public final IgSimpleImageView A06;
    public final C44376JjF A07;
    public final Integer A08;
    public final AtomicBoolean A09;
    public final AtomicBoolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44765Jrm(View view, UserSession userSession, Integer num) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A08 = num;
        this.A05 = userSession;
        this.A09 = new AtomicBoolean(false);
        this.A0A = new AtomicBoolean(false);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.image_view);
        this.A06 = igSimpleImageView;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                break;
            default:
                this.A04 = AbstractC31172DnG.A0Z(view, R.id.effect_icon);
                switch (intValue) {
                    case 0:
                    case 1:
                    case 3:
                        break;
                    case 2:
                    case 4:
                    case 5:
                        this.A02 = AbstractC31172DnG.A0X(view, R.id.effect_title);
                    default:
                        if (5 - intValue == 0) {
                            this.A03 = AbstractC31172DnG.A0X(view, R.id.effect_reels_count);
                            break;
                        }
                        break;
                }
                break;
        }
        Context A05 = AbstractC31172DnG.A05(this);
        C44376JjF c44376JjF = new C44376JjF(A05, 0.5f, 0.6f, AbstractC13880nE.A04(A05, 6), 0.2f, 0.2f, AbstractC167007dF.A09(A05, R.attr.igds_color_loading_shimmer_dark), AbstractC167007dF.A09(A05, R.attr.igds_color_primary_button), AbstractC167007dF.A09(A05, R.attr.igds_color_photo_overlay), true, true);
        this.A07 = c44376JjF;
        C48537Lda c48537Lda = new C48537Lda(this);
        c44376JjF.A02 = c48537Lda;
        Bitmap bitmap = c44376JjF.A01;
        if (bitmap != null) {
            c48537Lda.Cze(bitmap, c44376JjF);
        }
        igSimpleImageView.setImageDrawable(c44376JjF);
        ViewOnTouchListenerC48084LQj.A01(view, 3, this);
        LQ0.A02(view, 45, this);
        IgImageView igImageView = this.A04;
        if (igImageView != null) {
            igImageView.A0I = new C48547Ldk(this, 0);
        }
    }

    public static final void A00(C44765Jrm c44765Jrm) {
        C46520KiJ c46520KiJ;
        if (c44765Jrm.A0A.get() && c44765Jrm.A09.get() && (c46520KiJ = c44765Jrm.A01) != null) {
            c46520KiJ.A09 = true;
            MQO mqo = c44765Jrm.A00;
            if (mqo != null) {
                mqo.CwN(c46520KiJ);
            }
        }
    }
}
