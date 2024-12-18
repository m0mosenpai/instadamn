package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9p5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220819p5 extends AbstractC130945vi implements C5RP, InterfaceC25211BDj, C5RR, BCB {
    public C202728xq A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final Resources A0B;
    public final Paint A0C;
    public final RectF A0D;
    public final Medium A0E;
    public final List A0F;

    @Override // X.AbstractC130945vi
    public final String A09() {
        return "polaroid_sticker_bundle_id";
    }

    @Override // X.AbstractC130945vi
    public final boolean A0A() {
        return false;
    }

    @Override // X.C5RP
    public final void A9I(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A00.A9I(interfaceC25177BCa);
    }

    @Override // X.C5RP
    public final void EFh(InterfaceC25177BCa interfaceC25177BCa) {
        C14360o3.A0B(interfaceC25177BCa, 0);
        this.A00.EFh(interfaceC25177BCa);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        C202728xq c202728xq = this.A00;
        if (c202728xq.A01 != null) {
            canvas.drawRoundRect(this.A0D, 0.0f, 0.0f, this.A0C);
            c202728xq.draw(canvas);
        }
    }

    public C220819p5(Context context, Medium medium, double d, double d2, double d3, double d4, double d5, int i, int i2) {
        boolean A1V = AbstractC167007dF.A1V(medium);
        this.A0A = context;
        this.A0E = medium;
        this.A07 = i;
        this.A06 = i2;
        this.A04 = d;
        this.A05 = d2;
        this.A03 = d3;
        this.A01 = d4;
        this.A02 = d5;
        Resources resources = context.getResources();
        this.A0B = resources;
        int A05 = AbstractC166997dE.A05(resources);
        this.A09 = A05;
        this.A08 = A05 * 4;
        this.A0D = AbstractC166987dD.A0X();
        Paint A0R = AbstractC166987dD.A0R();
        AbstractC166987dD.A1N(context, A0R, R.color.design_dark_default_color_on_background);
        this.A0C = A0R;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0F = A1E;
        C202728xq c202728xq = new C202728xq(context, null, medium, null, C8OK.A0A, null, i, i2, false, false, false, A1V);
        this.A00 = c202728xq;
        Collections.addAll(A1E, c202728xq);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A0F;
    }

    @Override // X.C5RP
    public final void AHq() {
        this.A00.AHq();
    }

    @Override // X.BCB
    public final Rect BIv() {
        return AbstractC166987dD.A0W(this.A00);
    }

    @Override // X.InterfaceC25211BDj
    public final double Btc() {
        return this.A01;
    }

    @Override // X.InterfaceC25211BDj
    public final double Btd() {
        return this.A02;
    }

    @Override // X.InterfaceC25211BDj
    public final double Bte() {
        return this.A03;
    }

    @Override // X.InterfaceC25211BDj
    public final double Btf() {
        return this.A04;
    }

    @Override // X.InterfaceC25211BDj
    public final double Btg() {
        return this.A05;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.5NL, X.Aky, java.lang.Object] */
    @Override // X.C5RR
    public final C5NL C0T() {
        Medium medium = this.A0E;
        int i = this.A07;
        int i2 = this.A06;
        C14360o3.A0B(medium, 1);
        ?? obj = new Object();
        obj.A02 = medium;
        obj.A01 = i;
        obj.A00 = i2;
        return obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A06 + this.A09 + this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A07 + (this.A09 * 2);
    }

    @Override // X.C5RP
    public final boolean isLoading() {
        if (this.A00.A01 != null) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int intrinsicHeight = ((i2 + i4) / 2) - (getIntrinsicHeight() / 2);
        RectF rectF = this.A0D;
        rectF.left = i;
        rectF.top = intrinsicHeight;
        rectF.right = i3;
        rectF.bottom = r3 + r0;
        int i5 = this.A09;
        int i6 = intrinsicHeight + i5;
        this.A00.setBounds(AbstractC166987dD.A0V(i + i5, i6, i3 - i5, this.A06 + i6));
    }
}
