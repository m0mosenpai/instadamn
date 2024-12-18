package X;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Js7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44786Js7 extends C3OO implements C7QD, C7QE, InterfaceC1581778c, C7GU {
    public C7QH A00;
    public final ViewGroup A01;
    public final ViewGroup A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final InterfaceC09390do A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44786Js7(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC31176DnK.A0C(view, R.id.music_sticker_container);
        this.A02 = AbstractC31176DnK.A0C(view, R.id.music_sticker_card);
        this.A05 = AbstractC167007dF.A0T(view, R.id.music_sticker_card_background);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.music_sticker_title);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.music_sticker_subtitle);
        this.A07 = AbstractC167007dF.A0T(view, R.id.vinyl_image);
        this.A06 = AbstractC167007dF.A0T(view, R.id.music_sticker_play_state);
        this.A08 = C37059GUt.A01(view, 35);
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return (ImageView) this.A08.getValue();
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7GU
    public final void Cy3() {
        IgImageView igImageView = this.A07;
        C14360o3.A0B(igImageView, 0);
        Drawable drawable = igImageView.getDrawable();
        if (drawable instanceof C9SH) {
            C9SH c9sh = (C9SH) drawable;
            if (c9sh.A04) {
                c9sh.A04 = false;
                c9sh.A01 = SystemClock.elapsedRealtime();
                c9sh.invalidateSelf();
            }
        }
        IgImageView igImageView2 = this.A06;
        C8G5 c8g5 = C8G5.A04;
        C14360o3.A0B(igImageView2, 0);
        Drawable drawable2 = igImageView2.getDrawable();
        if (drawable2 instanceof C8G6) {
            ((C8G6) drawable2).A01(c8g5);
        }
    }

    @Override // X.C7GU
    public final void Cy4(int i, int i2, boolean z) {
        IgImageView igImageView;
        C8G5 c8g5;
        if (z) {
            igImageView = this.A06;
            c8g5 = C8G5.A03;
        } else {
            if (i <= 0) {
                return;
            }
            IgImageView igImageView2 = this.A07;
            C14360o3.A0B(igImageView2, 0);
            Drawable drawable = igImageView2.getDrawable();
            if (drawable instanceof C9SH) {
                C9SH c9sh = (C9SH) drawable;
                if (!c9sh.A04) {
                    c9sh.A04 = true;
                    c9sh.A01 = SystemClock.elapsedRealtime();
                    c9sh.invalidateSelf();
                }
            }
            igImageView = this.A06;
            c8g5 = C8G5.A05;
        }
        C14360o3.A0B(igImageView, 0);
        Drawable drawable2 = igImageView.getDrawable();
        if (drawable2 instanceof C8G6) {
            ((C8G6) drawable2).A01(c8g5);
        }
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    @Override // X.C7QD
    public final View BKF() {
        return AbstractC31171DnF.A06(this);
    }
}
