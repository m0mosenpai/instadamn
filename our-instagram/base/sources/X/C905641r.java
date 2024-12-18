package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.41r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C905641r {
    public final InterfaceC56392iX A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;

    public C905641r(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A00 = AbstractC56372iV.A01(viewStub, false, false);
        EnumC09460dv enumC09460dv = EnumC09460dv.A04;
        this.A0F = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 34));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 21));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 23));
        this.A06 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 25));
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 24));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 22));
        this.A0E = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 33));
        this.A0D = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 32));
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 30));
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 26));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 29));
        this.A0C = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 31));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 27));
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 28));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C206889Dt(this, 20));
    }

    public static final C89533yt A00(ImageUrl imageUrl, C905641r c905641r, int i) {
        int intValue = ((Number) c905641r.A08.getValue()).intValue();
        InterfaceC09390do interfaceC09390do = c905641r.A0F;
        return new C89533yt(imageUrl, "OpenCarouselPromptRedesignViewBinder", i, intValue, ((View) interfaceC09390do.getValue()).getContext().getColor(AbstractC53242c7.A0H(((View) interfaceC09390do.getValue()).getContext(), R.attr.igds_color_separator_or_stroke_on_media)), ((View) interfaceC09390do.getValue()).getContext().getColor(AbstractC53242c7.A0H(((View) interfaceC09390do.getValue()).getContext(), R.attr.igds_color_secondary_icon)));
    }

    public static final C89553yv A01(C905641r c905641r, User user, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(A00(user.Bhu(), c905641r, i));
        InterfaceC09390do interfaceC09390do = c905641r.A0F;
        Drawable drawable = ((View) interfaceC09390do.getValue()).getContext().getDrawable(R.drawable.carousel_open_carousel_add_icon);
        if (drawable != null) {
            arrayList.add(drawable);
        }
        return new C89553yv(((View) interfaceC09390do.getValue()).getContext(), null, C05F.A00, arrayList, 0.3f, i, i, 1);
    }

    public final void A03(User user, String str, boolean z) {
        if (z) {
            Object value = this.A0E.getValue();
            C14360o3.A07(value);
            ViewGroup.LayoutParams layoutParams = ((View) value).getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((View) this.A0F.getValue()).getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        }
        if (str != null && str.length() != 0) {
            Object value2 = this.A0E.getValue();
            C14360o3.A07(value2);
            ((TextView) value2).setText(str);
            return;
        }
        InterfaceC09390do interfaceC09390do = this.A0E;
        if (user != null) {
            Object value3 = interfaceC09390do.getValue();
            C14360o3.A07(value3);
            ((TextView) value3).setText(((View) this.A0F.getValue()).getResources().getString(2131969179, user.getUsername()));
        } else {
            Object value4 = interfaceC09390do.getValue();
            C14360o3.A07(value4);
            ((View) value4).setVisibility(4);
        }
    }

    public static final void A02(UserSession userSession, C905641r c905641r, boolean z) {
        if (!C41754IeU.A02(userSession) && C18U.A06(C06090Tz.A05, userSession, 2342163254126059714L)) {
            InterfaceC09390do interfaceC09390do = c905641r.A02;
            Object value = interfaceC09390do.getValue();
            C14360o3.A07(value);
            ((View) value).setElevation(((Number) c905641r.A01.getValue()).floatValue());
            if (!z) {
                Object value2 = interfaceC09390do.getValue();
                C14360o3.A07(value2);
                ViewGroup.LayoutParams layoutParams = ((View) value2).getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((C56302iJ) layoutParams).A06 = 0.9f;
                Object value3 = interfaceC09390do.getValue();
                C14360o3.A07(value3);
                ViewGroup.LayoutParams layoutParams2 = ((View) value3).getLayoutParams();
                C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((C56302iJ) layoutParams2).A05 = 0.85f;
            }
        }
    }
}
