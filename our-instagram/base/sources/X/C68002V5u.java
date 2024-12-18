package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.V5u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68002V5u extends C5RN implements InterfaceC55932he {
    public float A00;
    public Integer A01;
    public Integer A02;
    public final C55982hj A03;
    public final U8Q A04;
    public final C66313U8m A05;
    public final C6RB A06;
    public final List A07;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A07;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = (float) this.A03.A09.A00;
        Integer num = this.A02;
        if (num != null && f < 1.0f) {
            A00(canvas, num, 1.0f - f);
        }
        Integer num2 = this.A01;
        if (num2 != null && f > 0.0f) {
            A00(canvas, num2, f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) this.A00;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.U8m, android.graphics.drawable.Drawable] */
    public C68002V5u(Context context) {
        ArrayList arrayList = new ArrayList();
        this.A07 = arrayList;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A0A(this);
        A0R.A02();
        A0R.A09(C55942hf.A01());
        this.A03 = A0R;
        Spannable spannable = C6RB.A0d;
        C6RB c6rb = new C6RB(context, AbstractC13880nE.A0A(context));
        this.A06 = c6rb;
        c6rb.setCallback(this);
        U8Q u8q = new U8Q(context);
        this.A04 = u8q;
        u8q.setCallback(this);
        ?? drawable = new Drawable();
        this.A05 = drawable;
        drawable.setCallback(this);
        Collections.addAll(arrayList, c6rb, u8q, drawable);
    }

    private void A00(Canvas canvas, Integer num, float f) {
        Drawable drawable;
        String str;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    drawable = this.A05;
                } else {
                    Integer num2 = this.A01;
                    if (num2 != null) {
                        switch (num2.intValue()) {
                            case 1:
                                str = "RING";
                                break;
                            case 2:
                                str = "USER";
                                break;
                            default:
                                str = "EMOJI";
                                break;
                        }
                    } else {
                        str = "null";
                    }
                    throw AbstractC31175DnJ.A0V("Unsupported handle type: ", str);
                }
            } else {
                drawable = this.A04;
            }
        } else {
            drawable = this.A06;
        }
        float intrinsicWidth = (this.A00 - drawable.getIntrinsicWidth()) / 2.0f;
        float intrinsicHeight = (this.A00 - drawable.getIntrinsicHeight()) / 2.0f;
        canvas.save();
        canvas.translate(intrinsicWidth, intrinsicHeight);
        canvas.scale(f, f, getBounds().exactCenterX(), getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A06.setBounds(i, i2, i3, i4);
        this.A04.setBounds(i, i2, i3, i4);
        this.A05.setBounds(i, i2, i3, i4);
    }
}
