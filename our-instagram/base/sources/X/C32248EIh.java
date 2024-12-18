package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.EIh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32248EIh extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "OpenCarouselNuxSheetFragment";
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    public static void A00(Context context, C35228FgL c35228FgL, int i) {
        c35228FgL.A04(null, context.getText(i), R.drawable.instagram_eye_pano_outline_24);
        c35228FgL.A04(null, context.getText(2131969117), R.drawable.instagram_user_circle_pano_outline_24);
        c35228FgL.A04(null, context.getText(2131969118), R.drawable.instagram_delete_pano_outline_24);
        c35228FgL.A04(null, context.getText(2131969116), R.drawable.instagram_carousel_pano_outline_24);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "OPEN_CAROUSEL_NUX_SHEET";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        boolean z2;
        Context context;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        boolean z3 = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean(AbstractC111324zv.A00(734));
        } else {
            z = false;
        }
        this.A01 = z;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z2 = bundle3.getBoolean(AbstractC111324zv.A00(733));
        } else {
            z2 = false;
        }
        this.A00 = z2;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            z3 = bundle4.getBoolean(AbstractC111324zv.A00(735));
        }
        this.A02 = z3;
        AbstractC31176DnK.A0D(view, R.id.open_carousel_nux_sheet_image).setImageResource(R.drawable.ig_illustrations_illo_add_photos_videos_refresh);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.open_carousel_nux_sheet_headerline);
        boolean z4 = false;
        igdsHeadline.A0E(0, 0, 0, 0);
        Context A0L = AbstractC166997dE.A0L(igdsHeadline);
        int i2 = 2131969192;
        if (this.A01) {
            i2 = 2131969131;
        }
        igdsHeadline.setHeadline(i2);
        C35228FgL c35228FgL = new C35228FgL(A0L, AbstractC166997dE.A0b(), 4);
        if (AbstractC31176DnK.A0g(C17060sy.A01, this.A03).A0M() == C05F.A0C) {
            z4 = true;
        }
        if (this.A00) {
            if (!z4) {
                A00(A0L, c35228FgL, 2131969115);
            } else {
                A00(A0L, c35228FgL, 2131969114);
            }
        } else if (this.A01) {
            if (!z4) {
                c35228FgL.A04(null, A0L.getText(2131969138), R.drawable.instagram_circle_check_pano_outline_24);
                c35228FgL.A04(null, A0L.getText(2131969140), R.drawable.instagram_eye_pano_outline_24);
                c35228FgL.A04(null, A0L.getText(2131969141), R.drawable.instagram_user_circle_pano_outline_24);
                c35228FgL.A04(null, A0L.getText(2131969139), R.drawable.instagram_delete_pano_outline_24);
                c35228FgL.A04(null, A0L.getText(2131969137), R.drawable.instagram_carousel_pano_outline_24);
            } else {
                c35228FgL.A04(null, A0L.getText(2131969133), R.drawable.instagram_circle_check_pano_outline_24);
                c35228FgL.A04(null, A0L.getText(2131969135), R.drawable.instagram_eye_pano_outline_24);
                c35228FgL.A04(null, A0L.getText(2131969136), R.drawable.instagram_user_circle_pano_outline_24);
                c35228FgL.A04(null, A0L.getText(2131969134), R.drawable.instagram_delete_pano_outline_24);
                c35228FgL.A04(null, A0L.getText(2131969132), R.drawable.instagram_carousel_pano_outline_24);
            }
        } else if (!z4) {
            c35228FgL.A04(null, A0L.getText(2131969200), R.drawable.instagram_circle_check_pano_outline_24);
            c35228FgL.A04(null, A0L.getText(2131969202), R.drawable.instagram_eye_pano_outline_24);
            c35228FgL.A04(null, A0L.getText(2131969203), R.drawable.instagram_user_circle_pano_outline_24);
            c35228FgL.A04(null, A0L.getText(2131969201), R.drawable.instagram_delete_pano_outline_24);
            c35228FgL.A04(null, A0L.getText(2131969199), R.drawable.instagram_carousel_pano_outline_24);
        } else {
            c35228FgL.A04(null, A0L.getText(2131969194), R.drawable.instagram_circle_check_pano_outline_24);
            c35228FgL.A04(null, A0L.getText(2131969196), R.drawable.instagram_eye_pano_outline_24);
            c35228FgL.A04(null, A0L.getText(2131969198), R.drawable.instagram_globe_pano_outline_24);
            c35228FgL.A04(null, A0L.getText(2131969195), R.drawable.instagram_user_circle_pano_outline_24);
            c35228FgL.A04(null, A0L.getText(2131969193), R.drawable.instagram_delete_pano_outline_24);
            c35228FgL.A04(null, A0L.getText(2131969197), R.drawable.instagram_carousel_pano_outline_24);
        }
        igdsHeadline.setBulletList(c35228FgL.A03());
        if (this.A00) {
            C64P c64p = (C64P) view.findViewById(R.id.open_carousel_nux_sheet_button);
            c64p.setVisibility(0);
            Context context2 = c64p.getContext();
            c64p.setPrimaryActionText(context2.getString(2131969113));
            c64p.setPrimaryActionOnClickListener(ViewOnClickListenerC35685FpK.A00(this, 19));
            c64p.setSecondaryActionText(context2.getString(2131969119));
            c64p.setSecondaryActionOnClickListener(ViewOnClickListenerC35685FpK.A00(this, 20));
        } else {
            boolean z5 = this.A02;
            C64P c64p2 = (C64P) view.findViewById(R.id.open_carousel_nux_sheet_button);
            c64p2.setVisibility(0);
            C0fQ.A00(new ViewOnClickListenerC35669Fp4(4, this, z5), c64p2);
            if (z5) {
                context = c64p2.getContext();
                i = 2131968948;
            } else if (this.A01) {
                context = c64p2.getContext();
                i = 2131969165;
            }
            c64p2.setPrimaryActionText(context.getString(i));
        }
        TextView A0e = AbstractC166987dD.A0e(view, R.id.learn_more_link_button);
        if (!this.A00) {
            ViewOnClickListenerC35685FpK.A01(A0e, 21, this);
            if (!this.A01) {
                AbstractC166987dD.A1P(A0e.getContext(), A0e, 2131974795);
                return;
            }
            return;
        }
        A0e.setVisibility(8);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1741320127);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.open_carousel_nux_sheet, viewGroup, false);
        C0f9.A09(1108812179, A02);
        return inflate;
    }
}
