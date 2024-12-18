package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8xV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202518xV extends C5RN implements InterfaceC133125ze {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final C45116Jxl A06;
    public final String A07;
    public final List A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final boolean A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;

    public C202518xV(Context context, C45116Jxl c45116Jxl, String str, List list, int i, boolean z) {
        C14360o3.A0B(list, 2);
        this.A05 = context;
        this.A08 = list;
        this.A04 = i;
        this.A07 = str;
        this.A0C = z;
        this.A06 = c45116Jxl;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0D = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0F = context.getResources().getDimensionPixelSize(z ? R.dimen.abc_button_inset_vertical_material : R.dimen.abc_action_bar_elevation_material);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_width);
        this.A03 = context.getResources().getDimensionPixelSize(z ? R.dimen.challenge_sticker_v2_facepile_text_size : R.dimen.challenge_sticker_subtitle_text_size);
        this.A0E = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A0A = AbstractC09440dt.A01(new C25027B5z(this, 39));
        this.A09 = AbstractC09440dt.A01(new C25027B5z(this, 38));
        this.A0B = AbstractC09440dt.A01(new C25027B5z(this, 40));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        C14360o3.A0B(canvas, 0);
        Drawable drawable = (Drawable) this.A0A.getValue();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Bitmap createBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas2 = new Canvas(createBitmap);
        Iterator it = ((List) this.A09.getValue()).iterator();
        while (it.hasNext()) {
            ((Drawable) it.next()).draw(canvas2);
        }
        boolean z = this.A0C;
        float f2 = getBounds().left;
        if (z) {
            float f3 = this.A0E;
            f2 += f3;
            f = getBounds().top + f3;
        } else {
            f = getBounds().top;
        }
        canvas.drawBitmap(createBitmap, f2, f, (Paint) null);
        ((Drawable) this.A0B.getValue()).draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        ArrayList arrayList = new ArrayList();
        Object value = this.A0A.getValue();
        if (value != null) {
            arrayList.add(value);
        }
        arrayList.addAll((Collection) this.A09.getValue());
        arrayList.add(this.A0B.getValue());
        return arrayList;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "channel_challenge_sticker_id";
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        boolean z = this.A0C;
        int i = this.A00;
        if (z) {
            return i + (this.A0E * 2);
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int intrinsicWidth = ((Drawable) this.A0B.getValue()).getIntrinsicWidth();
        InterfaceC09390do interfaceC09390do = this.A09;
        int size = intrinsicWidth + (((List) interfaceC09390do.getValue()).size() * this.A00);
        int size2 = ((List) interfaceC09390do.getValue()).size() - 1;
        if (size2 < 0) {
            size2 = 0;
        }
        int i = (size - (size2 * this.A0D)) + (this.A0F * 2);
        if (this.A0C) {
            return i + (this.A0E * 2);
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i2 + i4) / 2.0f;
        Drawable drawable = (Drawable) this.A0A.getValue();
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
        int i5 = 0;
        for (Drawable drawable2 : (List) this.A09.getValue()) {
            int i6 = this.A00;
            drawable2.setBounds(i5, 0, i6 + i5, 0);
            i5 += i6 - this.A0D;
        }
        if (!((List) r7.getValue()).isEmpty()) {
            i5 += this.A0D;
        }
        int i7 = i5 + i;
        if (this.A0C) {
            i7 += this.A0E;
        }
        InterfaceC09390do interfaceC09390do = this.A0B;
        int A01 = C1H4.A01(f - (((Drawable) interfaceC09390do.getValue()).getIntrinsicHeight() / 2.0f));
        Drawable drawable3 = (Drawable) interfaceC09390do.getValue();
        int i8 = i7 + this.A0F;
        drawable3.setBounds(i8, A01, i8 + ((Drawable) interfaceC09390do.getValue()).getIntrinsicWidth(), ((Drawable) interfaceC09390do.getValue()).getIntrinsicHeight() + A01);
    }
}
