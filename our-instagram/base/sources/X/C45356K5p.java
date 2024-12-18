package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Rect;

/* renamed from: X.K5p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45356K5p extends AbstractC44367Jj6 {
    public float A00;
    public int A01;
    public int A02;
    public AnonymousClass693 A03;
    public AnonymousClass693 A04;
    public AnonymousClass693 A05;
    public AnonymousClass693 A06;
    public AnonymousClass693 A07;
    public AnonymousClass693 A08;
    public AnonymousClass693 A09;
    public AnonymousClass693 A0A;
    public boolean A0B = true;
    public float A0C;
    public final int A0D;
    public final float A0E;

    public C45356K5p(Context context, C161227Kh c161227Kh, float f) {
        this.A0E = f;
        this.A0D = AbstractC69815Vw1.A00(context, 125.0f);
        c161227Kh.A02(new C50358MLk(this, 33), new EnumC46207Kcj[]{EnumC46207Kcj.A0D, EnumC46207Kcj.A0B, EnumC46207Kcj.A0C, EnumC46207Kcj.A0A, EnumC46207Kcj.A08, EnumC46207Kcj.A09});
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012e, code lost:
    
        throw r0;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45356K5p.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A0B = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final void A02(AnonymousClass693 anonymousClass693) {
        if (anonymousClass693 != null) {
            this.A0C = 150.0f;
            anonymousClass693.setBounds(0, 0, 150, (int) ((150.0f * anonymousClass693.getIntrinsicHeight()) / anonymousClass693.getIntrinsicWidth()));
            anonymousClass693.E4S();
        }
    }
}
