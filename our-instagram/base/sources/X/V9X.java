package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public final class V9X extends AbstractC130945vi implements View.OnTouchListener, C5RR, InterfaceC133125ze, BCB {
    public int A00;
    public C38826H7x A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Wm2 A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A02) {
            AbstractC167007dF.A0v(canvas, this.A0E);
        }
        AbstractC167007dF.A0v(canvas, this.A0C);
        AbstractC167007dF.A0v(canvas, this.A0F);
        if (this.A0B.A02().length() != 0) {
            AbstractC167007dF.A0v(canvas, this.A0D);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0061, code lost:
    
        if (r9 == (-16777216)) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.V9X r11) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9X.A00(X.V9X):void");
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q((Drawable) this.A0C.getValue(), (Drawable) this.A0D.getValue(), (Drawable) this.A0F.getValue());
    }

    @Override // X.AbstractC130945vi
    public final Integer A08() {
        return C05F.A0Y;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A0B;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        String str = this.A0B.A00.A06;
        if (str == null) {
            str = "😍";
        }
        return AnonymousClass001.A0R("emoji_slider_", str);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i;
        int i2;
        int i3 = this.A00;
        if (i3 <= 0) {
            int A02 = AbstractC167027dH.A02(this.A0F);
            if (this.A0B.A02().length() == 0) {
                i = this.A07 + A02;
                i2 = this.A04;
            } else {
                i = this.A06 + ((C9SE) this.A0D.getValue()).A00.A06 + this.A08 + A02;
                i2 = this.A03;
            }
            return i + i2;
        }
        return i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    public /* synthetic */ V9X(Context context, UserSession userSession, Wm2 wm2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        C14360o3.A0B(wm2, 2);
        this.A0B = wm2;
        this.A0A = dimensionPixelSize;
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_left_right_margin);
        boolean A1T = AbstractC167007dF.A1T(wm2.A00.A00);
        this.A07 = context.getResources().getDimensionPixelSize(A1T ? R.dimen.abc_edit_text_inset_top_material : R.dimen.asset_picker_static_sticker_last_row_padding);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
        this.A04 = context.getResources().getDimensionPixelSize(A1T ? R.dimen.abc_edit_text_inset_top_material : R.dimen.audio_bar_margin_bottom);
        this.A05 = context.getResources().getDimensionPixelSize(A1T ? R.dimen.account_discovery_bottom_gap : R.dimen.album_preview_add_item_margin);
        this.A08 = AbstractC167017dG.A0E(context);
        this.A09 = AbstractC167017dG.A04(context);
        this.A0C = AbstractC09440dt.A01(new C57527Pg1(context, 2));
        this.A0E = AbstractC09440dt.A01(new C57536PgA(5, context, this));
        this.A0D = AbstractC09440dt.A01(new C57536PgA(4, context, this));
        this.A0F = AbstractC09440dt.A01(new C29900DGo(46, context, this, userSession));
        A00(this);
    }

    @Override // X.BCB
    public final Rect BIv() {
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        return bounds;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC167017dG.A1N(view, motionEvent);
        return ((ViewOnTouchListenerC66316U8p) this.A0F.getValue()).onTouch(view, motionEvent);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = (i + i3) / 2;
        int i7 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight();
        int i8 = intrinsicHeight / 2;
        int i9 = i7 - i8;
        int i10 = i7 + i8;
        ((Drawable) this.A0C.getValue()).setBounds(i, i9, i3, i10);
        Drawable drawable = (Drawable) this.A0E.getValue();
        int i11 = this.A09;
        drawable.setBounds(i - i11, i9 - i11, i3 + i11, i11 + i10);
        InterfaceC09390do interfaceC09390do = this.A0F;
        Drawable drawable2 = (Drawable) interfaceC09390do.getValue();
        int i12 = this.A05;
        int i13 = i + i12;
        int A02 = i10 - AbstractC167027dH.A02(interfaceC09390do);
        Wm2 wm2 = this.A0B;
        if (wm2.A02().length() == 0) {
            i5 = this.A04;
        } else {
            i5 = this.A03;
        }
        drawable2.setBounds(i13, A02 - i5, i3 - i12, i10 - i5);
        if (wm2.A02().length() != 0) {
            int i14 = this.A03;
            int A022 = (((intrinsicHeight - i14) - this.A08) - AbstractC167027dH.A02(interfaceC09390do)) - i14;
            InterfaceC09390do interfaceC09390do2 = this.A0D;
            Drawable drawable3 = (Drawable) interfaceC09390do2.getValue();
            int i15 = i6 - (((C9SE) interfaceC09390do2.getValue()).A00.A0A / 2);
            int i16 = this.A06 + i9;
            drawable3.setBounds(i15, i16, i6 + (((C9SE) interfaceC09390do2.getValue()).A00.A0A / 2), i16 + A022);
        }
    }
}
