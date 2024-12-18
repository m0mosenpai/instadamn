package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.MmU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51369MmU extends C3OO {
    public static C8RA A0B;
    public static C8RA A0C;
    public C51683MsE A00;
    public C51683MsE A01;
    public final float A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final O27 A07;
    public final C8Ba A08;
    public final FilmstripTimelineView A09;
    public final boolean A0A;

    public C51369MmU(View view, O26 o26, O27 o27, C8Ba c8Ba, boolean z) {
        super(view);
        ViewGroup viewGroup;
        this.A08 = c8Ba;
        this.A0A = z;
        this.A07 = o27;
        View findViewById = view.findViewById(R.id.filmstrip_timeline_view);
        FilmstripTimelineView filmstripTimelineView = (FilmstripTimelineView) findViewById;
        C8RB c8rb = filmstripTimelineView.A0B;
        Resources resources = filmstripTimelineView.getResources();
        c8rb.setForeground(resources.getDrawable(R.drawable.filmstrip_forground, null));
        filmstripTimelineView.setSeekerWidth(resources.getDimensionPixelSize(R.dimen.abc_control_corner_material));
        filmstripTimelineView.setCornerRadius(resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
        filmstripTimelineView.setClipChildren(false);
        filmstripTimelineView.setInnerContainerClipChildren(false);
        filmstripTimelineView.A01 = z;
        filmstripTimelineView.A02 = z;
        Drawable drawable = null;
        int i = 0;
        Drawable drawable2 = null;
        int i2 = 0;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        int i3 = filmstripTimelineView.A06;
        int i4 = filmstripTimelineView.A04;
        if (filmstripTimelineView.A01) {
            i = filmstripTimelineView.A05;
            drawable = filmstripTimelineView.A07;
        }
        if (filmstripTimelineView.A02) {
            i2 = filmstripTimelineView.A05;
            drawable2 = filmstripTimelineView.A07;
        }
        C8RH c8rh = filmstripTimelineView.A0A;
        C8RI c8ri = new C8RI(-1, dimensionPixelSize, i3, 0);
        if (i > 0) {
            C8RL c8rl = new C8RL(i, -1);
            c8rl.A00(drawable, 0);
            c8ri.A08(c8rl);
        }
        if (i2 > 0) {
            C8RL c8rl2 = new C8RL(i2, -1);
            c8rl2.A00(drawable2, i3);
            c8ri.A09(c8rl2);
        }
        AbstractC50522MSa.A1Q(c8ri, c8rh, i4);
        c8rh.invalidate();
        C14360o3.A07(findViewById);
        this.A09 = filmstripTimelineView;
        this.A06 = AbstractC25230BEn.A0Q(view, R.id.video_time);
        View A0c = AbstractC166987dD.A0c(view, R.id.clips_editor_item_delete_button);
        this.A04 = A0c;
        this.A03 = AbstractC166987dD.A0c(view, R.id.empty_thumbnail_background);
        Integer num = o27.A00;
        this.A05 = num != null ? view.findViewById(num.intValue()) : null;
        this.A02 = AbstractC13880nE.A04(AbstractC166997dE.A0L(view), 8);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setOnDragListener(new ViewOnDragListenerC55469OkO(o26));
        }
        AbstractC56952jT.A01(A0c);
        A02(false);
    }

    public static final void A00(C51683MsE c51683MsE, C51369MmU c51369MmU) {
        if (c51683MsE != null) {
            c51369MmU.A09.setGeneratedVideoTimelineBitmaps(c51683MsE);
            return;
        }
        FilmstripTimelineView filmstripTimelineView = c51369MmU.A09;
        C8Ba c8Ba = c51369MmU.A08;
        filmstripTimelineView.setGeneratedVideoTimelineBitmaps(new C51683MsE(null, 0, c8Ba.A02, c8Ba.A01, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if ((r4 instanceof X.C187538Sv) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.AbstractC187378Sf r4, int r5) {
        /*
            r3 = this;
            android.widget.TextView r2 = r3.A06
            r0 = -2
            if (r5 != r0) goto L15
            boolean r0 = r4 instanceof X.C187368Se
            if (r0 == 0) goto L10
            r0 = r4
            X.8Se r0 = (X.C187368Se) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L15
        L10:
            boolean r1 = r4 instanceof X.C187538Sv
            r0 = 0
            if (r1 == 0) goto L17
        L15:
            r0 = 8
        L17:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51369MmU.A01(X.8Sf, int):void");
    }

    public final void A02(boolean z) {
        FilmstripTimelineView filmstripTimelineView = this.A09;
        filmstripTimelineView.setActivated(z);
        filmstripTimelineView.setAlpha(1.0f);
        Context A0L = AbstractC166997dE.A0L(filmstripTimelineView);
        C14360o3.A0B(this.A07, 1);
        C8RA c8ra = A0B;
        if (c8ra == null) {
            c8ra = new C24145AnU(A0L, 0);
            A0B = c8ra;
        }
        filmstripTimelineView.setMeasureSpecBuilder(c8ra);
        filmstripTimelineView.setShowTrimmer(false);
        filmstripTimelineView.setShowSeekbar(false);
        filmstripTimelineView.A03(false, false, false);
        filmstripTimelineView.setScaleX(1.0f);
        filmstripTimelineView.setScaleY(1.0f);
        filmstripTimelineView.A00();
        filmstripTimelineView.setOnlyScrollXMargin(0);
        filmstripTimelineView.setFilmstripTimelineWidth(-1);
    }
}
