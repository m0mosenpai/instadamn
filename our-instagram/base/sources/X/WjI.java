package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WjI implements InterfaceC37230Gaf {
    public C66627UPp A00;
    public boolean A01;
    public C69556VrL A02;
    public final Context A03;
    public final ViewGroup A04;
    public final WKU A05;
    public final InterfaceC60152ox A06;
    public final C3I9 A07;
    public final C7EL A08;
    public final C68970Vf8 A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;

    @Override // X.InterfaceC37230Gaf
    public final void ADn(C7IK c7ik) {
        float f;
        C68970Vf8 c68970Vf8 = this.A09;
        InterfaceC09390do interfaceC09390do = this.A0E;
        int height = AbstractC167007dF.A0L(interfaceC09390do).getHeight();
        int i = c7ik.A04;
        Drawable drawable = c7ik.A0F;
        C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setColor(i);
        int i2 = c7ik.A03;
        if (i2 != 0) {
            if (c7ik.A0J) {
                f = c68970Vf8.A00.getResources().getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            } else {
                f = 0.0f;
            }
            gradientDrawable.setStroke(AbstractC43594JPz.A04(c68970Vf8.A00), i2, f, f);
        } else {
            gradientDrawable.setStroke(0, 0);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int[] iArr = c7ik.A0K;
        int length = iArr.length;
        if (length == 0) {
            AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, AbstractC53242c7.A0F(c68970Vf8.A00, R.attr.cyanBubbleBackground));
        } else if (length == 1) {
            AbstractC148406mA.A02(Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), 0.0f, iArr[0]);
        } else {
            C7F8 c7f8 = c68970Vf8.A01;
            float A00 = c7f8.A00();
            AbstractC148406mA.A01(null, Paint.Cap.BUTT, Paint.Style.FILL, shapeDrawable, shapeDrawable.getShape(), iArr, A00, 0.0f).Eg1(c7f8.A00() - height);
        }
        ColorFilter A002 = C3DY.A00(c7ik.A05);
        int i3 = c7ik.A0C;
        C3DY.A00(i3);
        ColorFilter A003 = C3DY.A00(i3);
        ColorFilter A004 = C3DY.A00(i3);
        int i4 = c7ik.A0B;
        AbstractC167007dF.A0L(interfaceC09390do).setBackground(gradientDrawable);
        Ajv().setBackground(shapeDrawable);
        Ajv().getDrawable().setColorFilter(A002);
        ((ImageView) AbstractC166987dD.A17(this.A0D)).setColorFilter(A002);
        ((ImageView) AbstractC166987dD.A17(this.A0G)).setColorFilter(A003);
        ((ImageView) AbstractC166987dD.A17(this.A0A)).setColorFilter(A004);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.A03, c7ik.A0E);
        InterfaceC09390do interfaceC09390do2 = this.A0C;
        AbstractC37302Gc3.A06(interfaceC09390do2).setTextAppearance(contextThemeWrapper, R.style.InThreadComposerTextAreaRedesign);
        if (i4 != 0) {
            AbstractC37302Gc3.A06(interfaceC09390do2).setHintTextColor(i4);
        }
    }

    @Override // X.InterfaceC37230Gaf
    public final void EgT(C7TH c7th, boolean z) {
        C14360o3.A0B(c7th, 1);
        if (z && this.A02 == null) {
            this.A02 = new C69556VrL(this.A04, c7th);
        }
        C69556VrL c69556VrL = this.A02;
        if (c69556VrL != null) {
            c69556VrL.A00();
        }
    }

    @Override // X.InterfaceC37230Gaf
    public final void AAV() {
        AbstractC37302Gc3.A06(this.A0C).addTextChangedListener(this.A05);
    }

    @Override // X.InterfaceC37230Gaf
    public final ImageView Ajv() {
        return (ImageView) AbstractC166987dD.A17(this.A0B);
    }

    @Override // X.InterfaceC37230Gaf
    public final boolean CXB() {
        return this.A01;
    }

    @Override // X.InterfaceC37230Gaf
    public final void EGP() {
        AbstractC37302Gc3.A06(this.A0C).removeTextChangedListener(this.A05);
    }

    @Override // X.InterfaceC37230Gaf
    public final void EJe() {
        AbstractC37302Gc3.A06(this.A0C).setText("");
    }

    @Override // X.InterfaceC37230Gaf
    public final void EYr(C66627UPp c66627UPp) {
        this.A00 = c66627UPp;
        Ajv().setVisibility(AbstractC167007dF.A05(c66627UPp.A01 ? 1 : 0));
        AbstractC167007dF.A0L(this.A0G).setVisibility(AbstractC167007dF.A05(c66627UPp.A04 ? 1 : 0));
        AbstractC167007dF.A0L(this.A0D).setVisibility(AbstractC167007dF.A05(c66627UPp.A02 ? 1 : 0));
        AbstractC167007dF.A0L(this.A0A).setVisibility(AbstractC167007dF.A05(c66627UPp.A00 ? 1 : 0));
        AbstractC43593JPy.A1Q(AbstractC166987dD.A17(this.A0F));
    }

    @Override // X.InterfaceC37230Gaf
    public final void Ech(boolean z) {
        AbstractC13880nE.A0v(this.A04, z);
    }

    @Override // X.InterfaceC37230Gaf
    public final void Eci(int i) {
        this.A04.setVisibility(i);
    }

    public /* synthetic */ WjI(ViewGroup viewGroup, C3I9 c3i9, C7EL c7el) {
        Context context = viewGroup.getContext();
        C14360o3.A0B(context, 0);
        C68970Vf8 c68970Vf8 = new C68970Vf8(context, new C7F8(context));
        C14360o3.A0B(c7el, 2);
        C14360o3.A0B(c3i9, 3);
        this.A04 = viewGroup;
        this.A08 = c7el;
        this.A07 = c3i9;
        this.A03 = context;
        this.A09 = c68970Vf8;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C37014GSt(this, 45));
        this.A0E = AbstractC09440dt.A00(enumC09460dv, new C37014GSt(this, 48));
        this.A0C = AbstractC09440dt.A00(enumC09460dv, new C37014GSt(this, 46));
        this.A0G = AbstractC09440dt.A00(enumC09460dv, new C50153MDg(this, 0));
        this.A0D = AbstractC09440dt.A00(enumC09460dv, new C37014GSt(this, 47));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C37014GSt(this, 44));
        this.A0F = AbstractC09440dt.A00(enumC09460dv, new C37014GSt(this, 49));
        this.A06 = new U31(this, 3);
        this.A05 = new WKU(this, 11);
        this.A00 = new C66627UPp(false, false, false, false, false);
        WNO.A00(Ajv(), 58, this);
        WNO.A00(AbstractC167007dF.A0L(this.A0F), 59, this);
    }

    @Override // X.InterfaceC37230Gaf
    public final void A9G() {
        AAV();
        this.A07.A9e(this.A06);
    }

    @Override // X.InterfaceC37230Gaf
    public final void EFg() {
        EGP();
        this.A07.EFx(this.A06);
    }
}
