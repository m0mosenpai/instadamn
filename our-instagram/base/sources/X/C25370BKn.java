package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.BKn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C25370BKn {
    public C120985dq A00;
    public IgImageView A01;
    public IgImageView A02;
    public C75113Zb A03;
    public JIL A04;
    public SimpleVideoLayout A05;
    public boolean A06;
    public boolean A07;
    public final View A08;
    public final LithoView A09;
    public final ClipsViewerConfig A0A;
    public final UserSession A0B;
    public final C86013sY A0C;
    public final InterfaceC56392iX A0D;
    public final InterfaceC56392iX A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0040, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7, 36326004461155892L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25370BKn(com.facebook.litho.LithoView r5, com.instagram.clips.intf.ClipsViewerConfig r6, com.instagram.common.session.UserSession r7, boolean r8) {
        /*
            r4 = this;
            r0 = 1
            X.AbstractC167007dF.A1F(r6, r0, r7)
            r4.<init>()
            r4.A0A = r6
            r4.A09 = r5
            r4.A0B = r7
            r4.A0F = r8
            r4.A08 = r5
            android.content.Context r2 = X.AbstractC166997dE.A0L(r5)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = new com.instagram.common.ui.widget.imageview.IgImageView
            r1.<init>(r2)
            r3 = 0
            X.6PC r0 = new X.6PC
            r0.<init>(r1)
            r4.A0D = r0
            com.instagram.feed.widget.IgProgressImageView r1 = new com.instagram.feed.widget.IgProgressImageView
            r1.<init>(r2)
            X.6PC r0 = new X.6PC
            r0.<init>(r1)
            r4.A0E = r0
            boolean r0 = X.C1LE.A07(r7)
            if (r0 == 0) goto L42
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326004461155892(0x810e4f00043634, double:3.0360497220897015E-306)
            boolean r1 = X.C18U.A06(r2, r7, r0)
            r0 = 1
            if (r1 != 0) goto L43
        L42:
            r0 = 0
        L43:
            r4.A0G = r0
            r1 = 0
            X.3sY r0 = new X.3sY
            r0.<init>(r3, r1)
            r4.A0C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25370BKn.<init>(com.facebook.litho.LithoView, com.instagram.clips.intf.ClipsViewerConfig, com.instagram.common.session.UserSession, boolean):void");
    }

    public static final void A00(Drawable drawable, C25370BKn c25370BKn) {
        IgImageView igImageView = c25370BKn.A02;
        if (igImageView != null) {
            igImageView.setImageDrawable(drawable);
        }
        IgImageView igImageView2 = c25370BKn.A02;
        if (igImageView2 != null) {
            AbstractC125325le.A04(new PHM(c25370BKn, 9), new View[]{igImageView2}, true);
        }
    }

    public static final void A01(C25370BKn c25370BKn, boolean z, boolean z2) {
        IgImageView igImageView;
        if (z2 && !c25370BKn.A0G && (igImageView = c25370BKn.A02) != null) {
            AbstractC166997dE.A19(c25370BKn.A08.getContext(), igImageView, R.drawable.instagram_play_pano_filled_24);
        }
        boolean z3 = true;
        if (c25370BKn.A0G) {
            C75113Zb c75113Zb = c25370BKn.A03;
            if (z) {
                if (c75113Zb == null) {
                    return;
                }
            } else if (c75113Zb == null) {
                return;
            } else {
                z3 = false;
            }
            c75113Zb.A3W.A00(c75113Zb, Boolean.valueOf(z3));
            return;
        }
        IgImageView igImageView2 = c25370BKn.A02;
        if (z) {
            if (igImageView2 == null) {
                return;
            }
            AbstractC125325le.A04(null, new View[]{igImageView2}, false);
        } else {
            if (igImageView2 == null) {
                return;
            }
            AbstractC125325le.A05(new View[]{igImageView2}, false);
        }
    }

    public final IgImageView A02() {
        IgImageView igImageView = this.A01;
        if (igImageView == null) {
            return new IgImageView(AbstractC166997dE.A0L(this.A09));
        }
        return igImageView;
    }

    public final SimpleVideoLayout A03() {
        SimpleVideoLayout simpleVideoLayout = this.A05;
        if (simpleVideoLayout == null) {
            return new SimpleVideoLayout(AbstractC166997dE.A0L(this.A09), null, 0);
        }
        return simpleVideoLayout;
    }

    public final void A04(IgImageView igImageView, boolean z) {
        if (this.A0F) {
            if (C1LE.A07(this.A0B)) {
                if (this.A02 == null) {
                    if (igImageView != null) {
                        this.A02 = igImageView;
                    }
                    if (z) {
                        A01(this, true, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (igImageView == null) {
                return;
            }
            this.A02 = igImageView;
        }
    }
}
