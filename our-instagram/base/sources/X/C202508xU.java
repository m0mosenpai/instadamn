package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8xU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202508xU extends C5RN implements InterfaceC133125ze {
    public final Context A00;
    public final C45116Jxl A01;
    public final ImageUrl A02;
    public final String A03;
    public final InterfaceC09390do A04;
    public final int A05;
    public final int A06;

    public C202508xU(Context context, C45116Jxl c45116Jxl, ImageUrl imageUrl, String str, int i, int i2) {
        C14360o3.A0B(imageUrl, 2);
        this.A00 = context;
        this.A02 = imageUrl;
        this.A06 = i;
        this.A05 = i2;
        this.A03 = str;
        this.A01 = c45116Jxl;
        this.A04 = AbstractC09440dt.A01(new C25027B5z(this, 37));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Object value = this.A04.getValue();
        C14360o3.A07(value);
        ((Drawable) value).draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        Object value = this.A04.getValue();
        C14360o3.A07(value);
        List singletonList = Collections.singletonList(value);
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "channel_challenge_sticker_id";
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A05;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Object value = this.A04.getValue();
        C14360o3.A07(value);
        ((Drawable) value).setBounds(i, i2, i3, i4);
    }
}
