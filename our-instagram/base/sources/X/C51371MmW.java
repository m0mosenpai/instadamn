package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;

/* renamed from: X.MmW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51371MmW extends C3OO {
    public float A00;
    public float A01;
    public IgImageView A02;
    public C51631MrO A03;
    public Integer A04;
    public final View A05;
    public final ConstraintLayout A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final IgTextView A09;
    public final IgImageView A0A;
    public final OKE A0B;
    public final IgEditSeekBar A0C;
    public final /* synthetic */ C51141Mik A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51371MmW(View view, C51141Mik c51141Mik, OKE oke) {
        super(view);
        C14360o3.A0B(oke, 3);
        this.A0D = c51141Mik;
        this.A05 = view;
        this.A0B = oke;
        this.A06 = (ConstraintLayout) view.findViewById(R.id.stacked_timeline_volume_controls_item);
        this.A08 = AbstractC31175DnJ.A0L(view, R.id.volume_control_card_title);
        this.A07 = AbstractC31175DnJ.A0L(view, R.id.volume_control_card_subtitle);
        View findViewById = view.findViewById(R.id.volume_control_card_cover_art);
        IgImageView igImageView = (IgImageView) findViewById;
        Context A0L = AbstractC166997dE.A0L(igImageView);
        Resources resources = igImageView.getResources();
        igImageView.setImageDrawable(new BOM(A0L, null, resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width), AbstractC166997dE.A08(resources), 0, A0L.getColor(R.color.design_dark_default_color_on_background), 0, -1, false));
        C14360o3.A07(findViewById);
        this.A02 = igImageView;
        IgImageView A0a = AbstractC31172DnG.A0a(view, R.id.volume_control_card_slider_icon);
        A0a.setContentDescription(AbstractC31172DnG.A05(this).getText(2131955923));
        this.A0A = A0a;
        this.A04 = A01(this);
        Context A0L2 = AbstractC166997dE.A0L(view);
        float A00 = AbstractC13880nE.A00(A0L2, A0L2.getResources().getDimension(R.dimen.abc_control_corner_material));
        IgEditSeekBar igEditSeekBar = (IgEditSeekBar) view.findViewById(R.id.volume_control_card_slider);
        igEditSeekBar.setSeekBarHeight(A00);
        Context context = igEditSeekBar.getContext();
        igEditSeekBar.setActiveColor(context.getColor(AbstractC53242c7.A0A(context)));
        igEditSeekBar.setInactiveColor(AbstractC167007dF.A09(context, R.attr.igds_color_creation_tools_grey_08));
        igEditSeekBar.A04 = false;
        this.A0C = igEditSeekBar;
        this.A09 = AbstractC31172DnG.A0Y(view, R.id.volume_control_card_slider_value);
    }

    public static final Integer A00(C51371MmW c51371MmW) {
        O2A o2a;
        C51631MrO c51631MrO = c51371MmW.A03;
        if (c51631MrO != null) {
            o2a = c51631MrO.A03;
        } else {
            o2a = null;
        }
        if (o2a instanceof NIK) {
            return C05F.A0C;
        }
        return C05F.A00;
    }

    public static final Integer A01(C51371MmW c51371MmW) {
        O2A o2a;
        C51631MrO c51631MrO = c51371MmW.A03;
        if (c51631MrO != null) {
            o2a = c51631MrO.A03;
        } else {
            o2a = null;
        }
        if (o2a instanceof NIK) {
            return C05F.A0N;
        }
        return C05F.A01;
    }

    public static final void A02(C51371MmW c51371MmW, int i) {
        Integer A01;
        Integer num = c51371MmW.A04;
        if (i == 0) {
            if (num == A01(c51371MmW)) {
                A01 = A00(c51371MmW);
            } else {
                return;
            }
        } else if (num != A00(c51371MmW)) {
            return;
        } else {
            A01 = A01(c51371MmW);
        }
        A04(c51371MmW, A01);
    }

    public static final void A03(C51371MmW c51371MmW, O2A o2a, float f) {
        String valueOf;
        IgEditSeekBar igEditSeekBar = c51371MmW.A0C;
        igEditSeekBar.setVisibility(0);
        float f2 = f * 100.0f;
        igEditSeekBar.setCurrentValue(C1H4.A01(f2));
        MSX.A15(c51371MmW.A09, C1H4.A01(f2));
        int i = (int) f2;
        String valueOf2 = String.valueOf(i);
        boolean z = o2a instanceof NIG;
        View view = c51371MmW.itemView;
        if (z) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            Context context = c51371MmW.A0D.A03;
            A1C.append((Object) context.getText(2131955924));
            A1C.append(' ');
            A1C.append((Object) c51371MmW.A08.getText());
            A1C.append(" \n ");
            A1C.append((Object) context.getText(2131955921));
            A1C.append(' ');
            valueOf = AbstractC166997dE.A0v(c51371MmW.A07.getText(), A1C);
        } else {
            valueOf = String.valueOf(c51371MmW.A08.getText());
        }
        view.setContentDescription(valueOf);
        View view2 = c51371MmW.itemView;
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        CharSequence contentDescription = view2.getContentDescription();
        AbstractC25225BEi.A1S(contentDescription);
        A1C2.append((String) contentDescription);
        A1C2.append("\n ");
        A1C2.append((Object) c51371MmW.A0D.A03.getText(2131955922));
        A1C2.append(' ');
        view2.setContentDescription(AbstractC166997dE.A0x(valueOf2, A1C2));
        A02(c51371MmW, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r5 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C51371MmW r6, java.lang.Integer r7) {
        /*
            r6.A04 = r7
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r6.A0A
            int r5 = r7.intValue()
            r0 = 3
            if (r5 == r0) goto L50
            r0 = 2
            if (r5 == r0) goto L50
            r1 = 1
            r0 = 2131239069(0x7f08209d, float:1.8094435E38)
            if (r5 == r1) goto L17
            r0 = 2131239065(0x7f082099, float:1.8094426E38)
        L17:
            r4.setImageResource(r0)
            android.view.View r0 = r6.A05
            android.content.Context r3 = X.AbstractC166997dE.A0L(r0)
            r2 = 1
            r1 = 3
            if (r5 == r1) goto L29
            r0 = 2130970187(0x7f04064b, float:1.7549077E38)
            if (r5 != r2) goto L2c
        L29:
            r0 = 2130970282(0x7f0406aa, float:1.754927E38)
        L2c:
            int r0 = X.AbstractC53242c7.A0H(r3, r0)
            X.AbstractC31173DnH.A11(r3, r4, r0)
            if (r5 == r1) goto L4c
            r0 = 2
            if (r5 == r0) goto L48
            r0 = 2131955923(0x7f1310d3, float:1.9548387E38)
            if (r5 == r2) goto L40
            r0 = 2131955925(0x7f1310d5, float:1.9548391E38)
        L40:
            java.lang.CharSequence r0 = r3.getText(r0)
            r4.setContentDescription(r0)
            return
        L48:
            r0 = 2131955917(0x7f1310cd, float:1.9548375E38)
            goto L40
        L4c:
            r0 = 2131955916(0x7f1310cc, float:1.9548373E38)
            goto L40
        L50:
            r0 = 2131239057(0x7f082091, float:1.809441E38)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51371MmW.A04(X.MmW, java.lang.Integer):void");
    }
}
