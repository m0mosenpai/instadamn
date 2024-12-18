package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* loaded from: classes11.dex */
public final class WjH implements InterfaceC37230Gaf {
    public boolean A00;
    public C69556VrL A01;
    public final Context A02;
    public final View A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final ImageView A06;
    public final C7EL A07;
    public final C7F8 A08;
    public final ComposerAutoCompleteTextView A09;
    public final WKU A0A;
    public final UserSession A0B;
    public final InterfaceC60152ox A0C;
    public final C3I9 A0D;

    public WjH(ViewGroup viewGroup, UserSession userSession, C3I9 c3i9, C7EL c7el) {
        AbstractC167027dH.A0a(1, viewGroup, userSession, c7el, c3i9);
        this.A05 = viewGroup;
        this.A0B = userSession;
        this.A07 = c7el;
        this.A0D = c3i9;
        this.A06 = AbstractC31176DnK.A0D(viewGroup, R.id.row_thread_composer_button_camera);
        Context context = viewGroup.getContext();
        this.A02 = context;
        this.A04 = AbstractC31176DnK.A0C(viewGroup, R.id.row_thread_composer_textarea_container);
        this.A09 = (ComposerAutoCompleteTextView) AbstractC166997dE.A0R(viewGroup, R.id.row_thread_composer_edittext);
        View A0S = AbstractC166997dE.A0S(viewGroup, R.id.row_thread_composer_button_send);
        this.A03 = A0S;
        C14360o3.A07(context);
        this.A08 = new C7F8(context);
        this.A0C = new U31(this, 2);
        this.A0A = new WKU(this, 10);
        WNO.A00(this.A06, 56, this);
        WNO.A00(A0S, 57, this);
    }

    @Override // X.InterfaceC37230Gaf
    public final void ADn(C7IK c7ik) {
        float f;
        Context context = this.A02;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, c7ik.A0E);
        int i = c7ik.A04;
        Drawable drawable = c7ik.A0F;
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setColor(i);
        int i2 = c7ik.A03;
        if (i2 != 0) {
            if (c7ik.A0J) {
                f = context.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            } else {
                f = 0.0f;
            }
            gradientDrawable.setStroke(AbstractC43594JPz.A04(context), i2, f, f);
        } else {
            gradientDrawable.setStroke(0, 0);
        }
        ViewGroup viewGroup = this.A04;
        viewGroup.setBackground(gradientDrawable);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A09;
        composerAutoCompleteTextView.setTextAppearance(contextThemeWrapper, R.style.InThreadComposerTextAreaRedesign);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int[] iArr = c7ik.A0K;
        int length = iArr.length;
        if (length == 0) {
            AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, AbstractC53242c7.A0F(context, R.attr.cyanBubbleBackground));
        } else if (length == 1) {
            AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, iArr[0]);
        } else {
            C7F8 c7f8 = this.A08;
            float A00 = c7f8.A00();
            AbstractC148406mA.A01(null, Paint.Cap.BUTT, Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), iArr, A00, 0.0f).Eg1(c7f8.A00() - viewGroup.getHeight());
        }
        ImageView imageView = this.A06;
        imageView.setBackground(shapeDrawable);
        AbstractC166997dE.A1F(imageView.getDrawable(), c7ik.A05);
        int i3 = c7ik.A0B;
        if (i3 != 0) {
            composerAutoCompleteTextView.setHintTextColor(i3);
        }
    }

    @Override // X.InterfaceC37230Gaf
    public final void EgT(C7TH c7th, boolean z) {
        C14360o3.A0B(c7th, 1);
        if (z && this.A01 == null) {
            this.A01 = new C69556VrL(this.A05, c7th);
        }
        C69556VrL c69556VrL = this.A01;
        if (c69556VrL != null) {
            c69556VrL.A00();
        }
    }

    @Override // X.InterfaceC37230Gaf
    public final void AAV() {
        this.A09.addTextChangedListener(this.A0A);
    }

    @Override // X.InterfaceC37230Gaf
    public final ImageView Ajv() {
        return this.A06;
    }

    @Override // X.InterfaceC37230Gaf
    public final boolean CXB() {
        return this.A00;
    }

    @Override // X.InterfaceC37230Gaf
    public final void EGP() {
        this.A09.removeTextChangedListener(this.A0A);
    }

    @Override // X.InterfaceC37230Gaf
    public final void EJe() {
        this.A09.setText("");
    }

    @Override // X.InterfaceC37230Gaf
    public final void EYr(C66627UPp c66627UPp) {
        this.A06.setVisibility(AbstractC167007dF.A05(c66627UPp.A01 ? 1 : 0));
    }

    @Override // X.InterfaceC37230Gaf
    public final void Ech(boolean z) {
        AbstractC13880nE.A0v(this.A05, z);
    }

    @Override // X.InterfaceC37230Gaf
    public final void Eci(int i) {
        this.A05.setVisibility(i);
    }

    @Override // X.InterfaceC37230Gaf
    public final void A9G() {
        AAV();
        this.A0D.A9e(this.A0C);
    }

    @Override // X.InterfaceC37230Gaf
    public final void EFg() {
        EGP();
        this.A0D.EFx(this.A0C);
    }
}
