package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.6TT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TT {
    public float A00;
    public float A01;
    public float A02;
    public ImageView A03;
    public TextView A04;
    public C6TV A05;
    public final int A06;
    public final InterfaceC56392iX A07;
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new C9EH(this, 31));
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(new C9EH(this, 32));

    public final ImageView A00() {
        ImageView imageView = this.A03;
        if (imageView != null) {
            return imageView;
        }
        C14360o3.A0F("swipeUpGuidanceChevron");
        throw C00O.createAndThrow();
    }

    public final TextView A01() {
        TextView textView = this.A04;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("swipeUpGuidanceText");
        throw C00O.createAndThrow();
    }

    public final void A02() {
        A03(1.0f);
        if (this.A03 != null) {
            A00().setAlpha(0.0f);
        }
        float f = this.A00;
        if (this.A03 != null) {
            A00().setTranslationY(f);
        }
        if (this.A04 != null) {
            A01().setAlpha(0.0f);
        }
        float f2 = this.A02;
        if (this.A04 != null) {
            A01().setTranslationY(f2);
        }
    }

    public final void A03(float f) {
        InterfaceC56392iX interfaceC56392iX = this.A07;
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setAlpha(f);
        }
    }

    public C6TT(UserSession userSession, InterfaceC56392iX interfaceC56392iX) {
        this.A07 = interfaceC56392iX;
        this.A05 = C6TU.A00(null, userSession, null);
        this.A06 = (int) (((float) C18U.A00(C06090Tz.A05, userSession, 37162453636743402L)) * 1000.0f);
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6TW
            @Override // X.InterfaceC69513Al
            public final /* bridge */ /* synthetic */ void DLu(View view) {
                int i;
                int i2;
                C14360o3.A0B(view, 0);
                C6TT c6tt = C6TT.this;
                int ordinal = c6tt.A05.ordinal();
                Context context = view.getContext();
                Resources resources = context.getResources();
                if (ordinal != 2) {
                    i = R.dimen.abc_button_padding_horizontal_material;
                } else {
                    i = R.dimen.account_discovery_bottom_gap;
                }
                c6tt.A00 = resources.getDimension(i);
                int ordinal2 = c6tt.A05.ordinal();
                Resources resources2 = context.getResources();
                if (ordinal2 != 2) {
                    i2 = R.dimen.abc_action_bar_elevation_material;
                    if (ordinal2 != 3) {
                        i2 = R.dimen.abc_dialog_padding_material;
                    }
                } else {
                    i2 = R.dimen.abc_select_dialog_padding_start_material;
                }
                c6tt.A01 = -resources2.getDimension(i2);
                ImageView imageView = (ImageView) view.requireViewById(R.id.swipe_up_guidance_chevron);
                C14360o3.A0B(imageView, 0);
                c6tt.A03 = imageView;
                int ordinal3 = c6tt.A05.ordinal();
                ImageView A00 = c6tt.A00();
                int i3 = R.drawable.swipe_up_guidance_chevron_with_shadow;
                if (ordinal3 == 3) {
                    i3 = R.drawable.swipe_up_guidance_chevron_for_sug_above_cta;
                }
                A00.setImageResource(i3);
                int ordinal4 = c6tt.A05.ordinal();
                if (ordinal4 != 1 && ordinal4 != 4) {
                    return;
                }
                c6tt.A02 = context.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                TextView textView = (TextView) view.requireViewById(R.id.swipe_up_guidance_text);
                C14360o3.A0B(textView, 0);
                c6tt.A04 = textView;
            }
        });
    }
}
