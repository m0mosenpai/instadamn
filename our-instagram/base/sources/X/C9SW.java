package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.9SW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SW extends Drawable implements InterfaceC133125ze, InterfaceC202578xb {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final UserSession A05;
    public final C6RB A06;
    public final C6RB A07;
    public final C6RB A08;
    public final C1816383s A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Drawable A0E;
    public final C45693KKf A0F;
    public final List A0G;

    public C9SW(Context context, UserSession userSession, C1816383s c1816383s) {
        String str;
        SimpleImageUrl A00;
        this.A04 = context;
        this.A05 = userSession;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0G = A1E;
        this.A09 = c1816383s;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        this.A0B = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.achievements_only_you_bottom_margin);
        this.A0C = dimensionPixelSize2;
        this.A02 = AbstractC166997dE.A0D(resources);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0D = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A01 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        this.A0A = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        this.A00 = resources.getDimensionPixelSize(R.dimen.challenge_sticker_v2_facepile_text_size);
        int i = dimensionPixelSize - (dimensionPixelSize2 * 2);
        C124385ju c124385ju = new C124385ju(context, AbstractC166997dE.A0B(resources), R.color.chat_sticker_button_divider_color, 80);
        this.A0E = c124385ju;
        C1816383s c1816383s2 = this.A09;
        AHE ahe = c1816383s2.A03;
        C14360o3.A07(ahe);
        AHE ahe2 = c1816383s2.A02;
        ArrayList A1E2 = AbstractC166987dD.A1E();
        SimpleImageUrl A002 = ahe.A00();
        if (A002 != null) {
            A1E2.add(A002);
        }
        if (ahe2 != null && !ahe.equals(ahe2) && (A00 = ahe2.A00()) != null) {
            A1E2.add(A00);
        }
        C45693KKf c45693KKf = new C45693KKf(this.A04, A1E2);
        this.A0F = c45693KKf;
        C6RB A0z = AbstractC166987dD.A0z(context, i);
        this.A08 = A0z;
        C6RB A0z2 = AbstractC166987dD.A0z(context, i);
        this.A07 = A0z2;
        C6RB A0z3 = AbstractC166987dD.A0z(context, i);
        this.A06 = A0z3;
        Collections.addAll(C15500q5.A02(A1E), c45693KKf, A0z, A0z2, A0z3, c124385ju);
        Context context2 = this.A04;
        C6RB c6rb = this.A08;
        float f = this.A03;
        float f2 = this.A02;
        AbstractC167017dG.A1N(context2, c6rb);
        AbstractC167017dG.A0z(context2, c6rb);
        AbstractC167007dF.A1A(c6rb, f, 0.0f, f2);
        AbstractC167017dG.A10(c6rb.A0Z, c6rb, R.attr.igds_color_text_on_white);
        c6rb.A0M(this.A09.A09);
        C6RB c6rb2 = this.A07;
        c6rb2.A0C(0.0f, this.A02);
        c6rb2.A0A(this.A01);
        c6rb2.A0F(-6710887);
        str = "";
        if (C18U.A06(C06090Tz.A06, this.A05, 36318423843608713L)) {
            String str2 = this.A09.A06;
            if (str2 != null) {
                Locale locale = Locale.getDefault();
                C14360o3.A07(locale);
                String lowerCase = str2.toLowerCase(locale);
                C14360o3.A07(lowerCase);
                str = AbstractC126965oa.A00(lowerCase);
            }
            c6rb2.A0M(str);
        } else {
            C1816383s c1816383s3 = this.A09;
            String A01 = c1816383s3.A03.A01();
            AHE ahe3 = c1816383s3.A02;
            c6rb2.A0M(AbstractC07900bA.A01(this.A04.getResources(), new String[]{A01, ahe3 != null ? ahe3.A01() : ""}, 2131962991));
        }
        C6RB c6rb3 = this.A06;
        c6rb3.A0J(Typeface.SANS_SERIF, 1);
        Context context3 = c6rb3.A0Z;
        AbstractC166987dD.A1Q(context3, c6rb3, C18U.A06(C06090Tz.A05, this.A05, 36316607072571936L) ? 2131962987 : 2131962986);
        c6rb3.A0A(this.A00);
        AbstractC166997dE.A1A(context3, c6rb3, AbstractC53242c7.A0C(context3));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            AbstractC166987dD.A0Z(it).draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.InterfaceC202578xb
    public final String Asj() {
        return this.A09.A05;
    }

    @Override // X.InterfaceC202578xb
    public final NewFundraiserInfo BWh() {
        return this.A09.A01;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return AnonymousClass001.A0R("standalone_fundraiser_without_cover_photo_variant_", this.A09.A07);
    }

    @Override // X.InterfaceC202578xb
    public final String getFundraiserId() {
        return this.A09.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.A0D;
        C6RB c6rb = this.A08;
        int i2 = (i + c6rb.A06) - c6rb.A08;
        int i3 = this.A02;
        int i4 = i2 - i3;
        return this.A0F.A01 + i4 + (this.A07.A06 - i3) + this.A0C + this.A0A;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Iterator it = this.A0G.iterator();
        while (it.hasNext()) {
            AbstractC166987dD.A0Z(it).setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float A03 = AbstractC166987dD.A03(i2, i4, 2.0f);
        float f2 = this.A0B / 2.0f;
        float A06 = AbstractC166987dD.A06(this) / 2.0f;
        float f3 = A03 - A06;
        float f4 = A03 + A06;
        float f5 = this.A0A;
        float f6 = f4 - f5;
        float f7 = (f5 / 2.0f) + f6;
        C45693KKf c45693KKf = this.A0F;
        int i5 = c45693KKf.A01;
        C6RB c6rb = this.A08;
        int i6 = c6rb.A0A;
        int i7 = c6rb.A06;
        int i8 = c6rb.A08;
        int i9 = this.A0D;
        int i10 = ((i9 + i7) - i8) - this.A02;
        C6RB c6rb2 = this.A07;
        int i11 = c6rb2.A0A;
        int i12 = c6rb2.A06;
        C6RB c6rb3 = this.A06;
        int i13 = c6rb3.A0A;
        int i14 = c6rb3.A06;
        int i15 = (int) (f - f2);
        int i16 = (int) (f2 + f);
        c45693KKf.setBounds(i15, (int) f3, i16, (int) f4);
        float f8 = i6 / 2.0f;
        float f9 = f3 + i5;
        float f10 = i8;
        float f11 = f9 + i10;
        c6rb.setBounds((int) (f - f8), (int) ((i9 + f9) - f10), (int) (f8 + f), (int) (f10 + f11));
        float f12 = i11 / 2.0f;
        c6rb2.setBounds((int) (f - f12), (int) f11, (int) (f12 + f), (int) (f11 + i12));
        int i17 = (int) f6;
        this.A0E.setBounds(i15, i17, i16, i17);
        float f13 = i13 / 2.0f;
        float f14 = i14 / 2.0f;
        c6rb3.setBounds((int) (f - f13), (int) (f7 - f14), (int) (f + f13), (int) (f7 + f14));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        invalidateSelf();
    }
}
