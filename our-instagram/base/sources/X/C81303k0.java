package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.3k0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81303k0 extends C3OO implements C3Y7, C33R {
    public long A00;
    public C3W4 A01;
    public C86043sb A02;
    public C86033sa A03;
    public C75113Zb A04;
    public boolean A05;
    public final View A06;
    public final C3W9 A07;
    public final IgFrameLayout A08;
    public final IgView A09;
    public final C86013sY A0A;
    public final C86183sp A0B;
    public final InterfaceC56392iX A0C;
    public final C3WA A0D;
    public final C86163sn A0E;
    public final C3W8 A0F;
    public final C3YC A0G;
    public final C86093sg A0H;
    public final C86173so A0I;
    public final C3Y8 A0J;
    public final C3Y1 A0K;
    public final C120445cn A0L;
    public final C86073se A0M;
    public final IgProgressImageView A0N;
    public final C86003sX A0O;
    public final C3YD A0P;
    public final C3YJ A0Q;
    public final LikeActionView A0R;
    public final MediaActionsView A0S;
    public final MediaFrameLayout A0T;
    public final C86083sf A0U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81303k0(View view, View view2, C3W9 c3w9, C3W4 c3w4, IgFrameLayout igFrameLayout, IgView igView, C86013sY c86013sY, InterfaceC56392iX interfaceC56392iX, C3WA c3wa, C86163sn c86163sn, C3W8 c3w8, C3YC c3yc, C86093sg c86093sg, C86043sb c86043sb, C86173so c86173so, C86083sf c86083sf, C3Y8 c3y8, C86033sa c86033sa, C3Y1 c3y1, C120445cn c120445cn, C86073se c86073se, IgProgressImageView igProgressImageView, C86003sX c86003sX, C3YG c3yg, C3YD c3yd, C3YD c3yd2, C3YD c3yd3, C3YD c3yd4, C3YH c3yh, C3YI c3yi, LikeActionView likeActionView, MediaActionsView mediaActionsView, MediaFrameLayout mediaFrameLayout) {
        super(view);
        C14360o3.A0B(mediaFrameLayout, 3);
        C14360o3.A0B(igProgressImageView, 4);
        C14360o3.A0B(likeActionView, 5);
        C14360o3.A0B(mediaActionsView, 6);
        this.A08 = igFrameLayout;
        this.A0T = mediaFrameLayout;
        this.A0N = igProgressImageView;
        this.A0R = likeActionView;
        this.A0S = mediaActionsView;
        this.A06 = view2;
        this.A0O = c86003sX;
        this.A0P = c3yd4;
        this.A01 = c3w4;
        this.A0A = c86013sY;
        this.A03 = c86033sa;
        this.A02 = c86043sb;
        this.A0M = c86073se;
        this.A0L = c120445cn;
        this.A0U = c86083sf;
        this.A0G = c3yc;
        this.A0F = c3w8;
        this.A07 = c3w9;
        this.A0J = c3y8;
        this.A0H = c86093sg;
        this.A0K = c3y1;
        this.A0D = c3wa;
        this.A0E = c86163sn;
        this.A0I = c86173so;
        this.A0C = interfaceC56392iX;
        this.A09 = igView;
        this.A0B = new C86183sp(c86013sY);
        this.A0Q = new C3YJ(c3yg, c3yd, c3yd2, c3yd3, c3yh, c3yi);
        if (igFrameLayout != null) {
            Context context = igFrameLayout.getContext();
            C14360o3.A07(context);
            if (C86193sq.A00(context)) {
                igFrameLayout.setTag(R.id.feed_cta_extra_tappable_target, "media_view");
                return;
            }
        }
        mediaFrameLayout.setTag(R.id.feed_cta_extra_tappable_target, "media_view");
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        C3Y1 c3y1 = this.A0K;
        if (c3y1 != null) {
            c3y1.DSJ(c75113Zb, i);
        }
        C86003sX c86003sX = this.A0O;
        if (c86003sX != null) {
            c86003sX.DSJ(c75113Zb, i);
        }
    }

    @Override // X.C3Y7
    public final void EgX(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, boolean z) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A0N.A09(interfaceC11380iw, imageUrl, z);
    }

    @Override // X.C3Y7
    public final C3W4 Adr() {
        return this.A01;
    }

    @Override // X.C3Y7
    public final C86083sf B61() {
        return this.A0U;
    }

    @Override // X.C3Y7
    public final InterfaceC74323Vo B62() {
        return this.A0S;
    }

    @Override // X.C3Y7
    public final View BGa() {
        return this.A0N;
    }

    @Override // X.C3Y7
    public final View BQt() {
        return this.A0T;
    }

    @Override // X.C3Y7
    public final C75113Zb BRY() {
        return this.A04;
    }

    @Override // X.C3Y7
    public final InterfaceC80343iO BRd() {
        return this.A0B;
    }

    @Override // X.C3Y7
    public final C86033sa BS3() {
        return this.A03;
    }

    @Override // X.C3Y7
    public final InterfaceC74623Ww C6y() {
        return this.A0T;
    }

    @Override // X.C3Y7
    public final /* synthetic */ int C6z() {
        return -1;
    }

    @Override // X.C3Y7
    public final int CFi() {
        return this.A0S.getWidth();
    }

    @Override // X.C3Y7
    public final void EFy(int i) {
        this.A0N.A06(i);
    }
}
