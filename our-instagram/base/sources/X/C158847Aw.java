package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.7Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158847Aw {
    public final Context A00;
    public final View A01;
    public final UserSession A02;
    public final IgImageView A03;
    public final InterfaceC65702y7 A04;
    public final InterfaceC56392iX A05;
    public final C158857Ax A06;
    public final InterfaceC09390do A07;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C158847Aw(Context context, View view, UserSession userSession, IgImageView igImageView, InterfaceC65702y7 interfaceC65702y7, InterfaceC56392iX interfaceC56392iX, InterfaceC09390do interfaceC09390do, int i) {
        interfaceC09390do = (i & 32) != 0 ? AbstractC09440dt.A01(C50224MGf.A00) : interfaceC09390do;
        interfaceC65702y7 = (i & 64) != 0 ? AbstractC1580577p.A04((C74843Xy) interfaceC09390do.getValue(), igImageView) : interfaceC65702y7;
        C158857Ax obj = (i & 128) != 0 ? new Object() : null;
        C14360o3.A0B(interfaceC56392iX, 3);
        C14360o3.A0B(igImageView, 4);
        C14360o3.A0B(view, 5);
        C14360o3.A0B(interfaceC09390do, 6);
        C14360o3.A0B(interfaceC65702y7, 7);
        C14360o3.A0B(obj, 8);
        this.A02 = userSession;
        this.A00 = context;
        this.A05 = interfaceC56392iX;
        this.A03 = igImageView;
        this.A01 = view;
        this.A07 = interfaceC09390do;
        this.A04 = interfaceC65702y7;
        this.A06 = obj;
    }

    public static final ShapeDrawable A00(C158847Aw c158847Aw) {
        C162817Qs c162817Qs = new C162817Qs(null, StringTreeSet.MAX_SYMBOL_COUNT);
        c162817Qs.A02((C74843Xy) c158847Aw.A07.getValue(), C05F.A00);
        return new ShapeDrawable(c162817Qs);
    }

    public final void A03(int i, boolean z) {
        ShapeDrawable shapeDrawable;
        Context context;
        int color;
        String string;
        int i2;
        if (!C18U.A06(C06090Tz.A05, this.A02, 36328714585521904L)) {
            shapeDrawable = A00(this);
            this.A07.getValue();
        } else {
            shapeDrawable = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    A01(null, null, this, null, null, null, null, null, 0, 0, false);
                    return;
                }
                throw new IllegalStateException("Not a valid ImageRevealStatus");
            }
            context = this.A00;
            color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_button_on_media_panavision));
            int i3 = 2131966366;
            if (z) {
                i3 = 2131966367;
            }
            string = context.getString(i3);
            i2 = 2131960565;
            if (z) {
                i2 = 2131960566;
            }
        } else {
            context = this.A00;
            color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_grey_08));
            int i4 = 2131966366;
            if (z) {
                i4 = 2131966367;
            }
            string = context.getString(i4);
            i2 = 2131960567;
            if (z) {
                i2 = 2131960568;
            }
        }
        String string2 = context.getString(i2);
        if (shapeDrawable == null) {
            shapeDrawable = A00(this);
        }
        A01(null, shapeDrawable, this, null, null, string, string2, null, 1, color, false);
    }

    public final void A04(PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel, InterfaceC16820sZ interfaceC16820sZ, int i) {
        ShapeDrawable shapeDrawable;
        Drawable drawable;
        Integer num;
        Float f = null;
        if (!C18U.A06(C06090Tz.A05, this.A02, 36328714585521904L)) {
            shapeDrawable = A00(this);
            Integer num2 = privacyMediaOverlayViewModel.A01;
            if (num2 != null) {
                int intValue = num2.intValue();
                Context context = this.A00;
                drawable = AbstractC85953sP.A01(context, intValue, AbstractC53242c7.A0H(context, R.attr.igds_color_icon_on_color));
            } else {
                drawable = null;
            }
            this.A07.getValue();
        } else {
            shapeDrawable = null;
            drawable = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    A01(null, null, this, null, null, null, null, null, 0, 0, false);
                    return;
                }
                throw new IllegalStateException("Not a valid ImageRevealStatus");
            }
            Context context2 = this.A00;
            int color = context2.getColor(AbstractC53242c7.A0H(context2, R.attr.igds_color_secondary_button_on_media_panavision));
            boolean z = privacyMediaOverlayViewModel.A07;
            if (z) {
                num = Integer.valueOf(context2.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
            } else {
                num = null;
            }
            String str = privacyMediaOverlayViewModel.A05;
            if (z) {
                f = Float.valueOf(context2.getResources().getDimension(R.dimen.music_attribution_trending_icon_size));
            }
            String str2 = privacyMediaOverlayViewModel.A03;
            if (shapeDrawable == null) {
                shapeDrawable = A00(this);
            }
            if (drawable == null) {
                Integer num3 = privacyMediaOverlayViewModel.A01;
                if (num3 != null) {
                    drawable = AbstractC85953sP.A01(context2, num3.intValue(), AbstractC53242c7.A05(context2));
                } else {
                    drawable = null;
                }
            }
            boolean z2 = true;
            if (privacyMediaOverlayViewModel.A00 != 1) {
                z2 = false;
            }
            A01(drawable, shapeDrawable, this, f, num, str, str2, interfaceC16820sZ, 2, color, z2);
            return;
        }
        Context context3 = this.A00;
        int color2 = context3.getColor(AbstractC53242c7.A0H(context3, R.attr.igds_color_creation_tools_grey_08));
        String str3 = privacyMediaOverlayViewModel.A06;
        String str4 = privacyMediaOverlayViewModel.A04;
        if (shapeDrawable == null) {
            shapeDrawable = A00(this);
        }
        A01(null, shapeDrawable, this, null, null, str3, str4, null, 2, color2, false);
    }

    public static final void A01(Drawable drawable, ShapeDrawable shapeDrawable, C158847Aw c158847Aw, Float f, Integer num, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (C18U.A06(C06090Tz.A05, c158847Aw.A02, 36328714585521904L) && i == 0) {
            InterfaceC56392iX interfaceC56392iX = c158847Aw.A05;
            if (!interfaceC56392iX.CWW() || interfaceC56392iX.getView().getVisibility() != 0) {
                return;
            }
        }
        IgImageView igImageView = c158847Aw.A03;
        AbstractC158867Ay.A00(igImageView, i);
        if (i == 0) {
            c158847Aw.A01.setForeground(null);
            c158847Aw.A05.setVisibility(8);
            igImageView.setImageRendererAndReset(c158847Aw.A04);
            return;
        }
        InterfaceC56392iX interfaceC56392iX2 = c158847Aw.A05;
        TextView textView = (TextView) interfaceC56392iX2.getView().findViewById(R.id.privacy_overlay_title);
        TextView textView2 = (TextView) interfaceC56392iX2.getView().findViewById(R.id.privacy_overlay_subtitle);
        ImageView imageView = (ImageView) interfaceC56392iX2.getView().findViewById(R.id.privacy_overlay_icon);
        SpinnerImageView spinnerImageView = (SpinnerImageView) interfaceC56392iX2.getView().findViewById(R.id.spinner);
        View findViewById = interfaceC56392iX2.getView().findViewById(R.id.reveal_content_container);
        if (num != null) {
            int intValue = num.intValue();
            interfaceC56392iX2.getView().setPadding(intValue, intValue, intValue, intValue);
        }
        if (spinnerImageView != null) {
            if (z) {
                spinnerImageView.setLoadingStatus(C3T1.LOADING);
                i4 = 0;
            } else {
                i4 = 8;
            }
            spinnerImageView.setVisibility(i4);
        }
        if (findViewById != null) {
            int i5 = 0;
            if (z) {
                i5 = 8;
            }
            findViewById.setVisibility(i5);
        }
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
        if (textView != null) {
            int i6 = 0;
            if (str != null && str.length() != 0) {
                textView.setText(str);
                if (f != null) {
                    textView.setTextSize(0, f.floatValue());
                }
            } else {
                i6 = 8;
            }
            textView.setVisibility(i6);
        }
        if (textView2 != null) {
            int i7 = 0;
            if (str2 != null && str2.length() != 0) {
                textView2.setText(str2);
            } else {
                i7 = 8;
            }
            textView2.setVisibility(i7);
        }
        interfaceC56392iX2.setVisibility(0);
        if (shapeDrawable != null) {
            AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, i2);
            c158847Aw.A01.setForeground(shapeDrawable);
        } else {
            c158847Aw.A01.setForeground(null);
        }
        igImageView.setImageRendererAndReset(c158847Aw.A04);
        if (interfaceC16820sZ == null) {
            return;
        }
        interfaceC16820sZ.invoke();
    }

    public final void A02() {
        if (C18U.A06(C06090Tz.A05, this.A02, 36328714585521904L)) {
            InterfaceC56392iX interfaceC56392iX = this.A05;
            if (!interfaceC56392iX.CWW() || interfaceC56392iX.getView().getVisibility() != 0) {
                return;
            }
        }
        this.A05.setVisibility(8);
        IgImageView igImageView = this.A03;
        AbstractC158867Ay.A00(igImageView, 0);
        this.A01.setForeground(null);
        igImageView.setImageRendererAndReset(this.A04);
    }
}
