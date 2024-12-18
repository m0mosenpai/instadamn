package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.7Hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160657Hz {
    public Integer A00;
    public Number A01;
    public Number A02;
    public Number A03;
    public final Context A04;
    public final ViewStub A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    public C160657Hz(Context context, ViewStub viewStub) {
        C14360o3.A0B(viewStub, 2);
        this.A04 = context;
        this.A05 = viewStub;
        this.A07 = C1XM.A00(new MHI(this, 5));
        this.A0C = C1XM.A00(new MHI(this, 10));
        this.A09 = C1XM.A00(new MHI(this, 7));
        this.A0B = C1XM.A00(new MHI(this, 9));
        this.A06 = C1XM.A00(new MHI(this, 4));
        this.A08 = C1XM.A00(new MHI(this, 6));
        this.A0A = C1XM.A00(new MHI(this, 8));
    }

    public final void A01(View view, C7IK c7ik) {
        C14360o3.A0B(c7ik, 0);
        this.A00 = Integer.valueOf(c7ik.A0C);
        this.A01 = Integer.valueOf(c7ik.A02);
        this.A03 = Integer.valueOf(c7ik.A04);
        this.A02 = Integer.valueOf(c7ik.A08);
        InterfaceC09390do interfaceC09390do = this.A07;
        if (((View) interfaceC09390do.getValue()).getVisibility() == 0) {
            if (view != null) {
                Number number = this.A01;
                if (number == null) {
                    C14360o3.A0F("backgroundColor");
                    throw C00O.createAndThrow();
                }
                view.setBackgroundColor(number.intValue());
            }
            A00();
            ((View) interfaceC09390do.getValue()).setVisibility(8);
            ((View) interfaceC09390do.getValue()).setVisibility(0);
        }
    }

    public final void A02(String str, String str2, byte[] bArr) {
        InterfaceC09390do interfaceC09390do;
        InterfaceC09390do interfaceC09390do2;
        Bitmap decodeByteArray;
        C14360o3.A0B(bArr, 0);
        if (str == null && str2 == null) {
            ((View) this.A07.getValue()).setVisibility(8);
            return;
        }
        A00();
        if (bArr != C47954LGp.A06 && (decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
            InterfaceC09390do interfaceC09390do3 = this.A0B;
            Object value = interfaceC09390do3.getValue();
            C14360o3.A07(value);
            ((ImageView) value).setImageBitmap(decodeByteArray);
            Object value2 = interfaceC09390do3.getValue();
            C14360o3.A07(value2);
            ((View) value2).setVisibility(0);
            interfaceC09390do = this.A0C;
            Object value3 = interfaceC09390do.getValue();
            C14360o3.A07(value3);
            View view = (View) value3;
            view.setPadding(0, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            interfaceC09390do2 = this.A09;
            Object value4 = interfaceC09390do2.getValue();
            C14360o3.A07(value4);
            View view2 = (View) value4;
            view2.setPadding(0, view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
        } else {
            interfaceC09390do = this.A0C;
            Object value5 = interfaceC09390do.getValue();
            C14360o3.A07(value5);
            View view3 = (View) value5;
            InterfaceC09390do interfaceC09390do4 = this.A0A;
            view3.setPadding(((Number) interfaceC09390do4.getValue()).intValue(), view3.getPaddingTop(), view3.getPaddingRight(), view3.getPaddingBottom());
            interfaceC09390do2 = this.A09;
            Object value6 = interfaceC09390do2.getValue();
            C14360o3.A07(value6);
            View view4 = (View) value6;
            view4.setPadding(((Number) interfaceC09390do4.getValue()).intValue(), view4.getPaddingTop(), view4.getPaddingRight(), view4.getPaddingBottom());
            Object value7 = this.A0B.getValue();
            C14360o3.A07(value7);
            ((View) value7).setVisibility(8);
        }
        Object value8 = interfaceC09390do.getValue();
        C14360o3.A07(value8);
        ((TextView) value8).setText(str);
        Object value9 = interfaceC09390do2.getValue();
        C14360o3.A07(value9);
        ((TextView) value9).setText(str2);
        ((View) this.A07.getValue()).setVisibility(0);
    }

    private final void A00() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            Object value = this.A0C.getValue();
            C14360o3.A07(value);
            ((TextView) value).setTextColor(intValue);
            Object value2 = this.A09.getValue();
            C14360o3.A07(value2);
            ((TextView) value2).setTextColor(intValue);
        }
        if (this.A01 != null) {
            Drawable background = ((View) this.A07.getValue()).getBackground();
            Number number = this.A01;
            if (number == null) {
                str = "backgroundColor";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            background.setColorFilter(new PorterDuffColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN));
        }
        if (this.A03 != null) {
            Drawable background2 = ((View) this.A07.getValue()).getBackground();
            Number number2 = this.A03;
            if (number2 == null) {
                str = "drawableColor";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            background2.setColorFilter(new PorterDuffColorFilter(number2.intValue(), PorterDuff.Mode.SRC_IN));
        }
        if (this.A02 != null) {
            Object value3 = this.A08.getValue();
            C14360o3.A07(value3);
            View view = (View) value3;
            Number number3 = this.A02;
            if (number3 == null) {
                str = "dividerColor";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            view.setBackgroundColor(number3.intValue());
        }
    }
}
