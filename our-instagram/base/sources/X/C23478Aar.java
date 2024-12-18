package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.Choreographer;
import com.facebook.R;

/* renamed from: X.Aar, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23478Aar implements InterfaceC55932he {
    public int A00;
    public boolean A01;
    public final Matrix A02;
    public final Paint A03;
    public final Drawable A04;
    public final C7LH A05;
    public final C55982hj A06;
    public final C55982hj A07;
    public final A88 A08;
    public final C6RB A09;
    public static final C55942hf A0A = C55942hf.A01();
    public static final C55942hf A0C = C55942hf.A04(20.0d, 9.0d);
    public static final C55942hf A0B = C55942hf.A04(50.0d, 7.0d);

    public C23478Aar(Context context, Drawable.Callback callback, Drawable drawable, A88 a88) {
        Resources resources = context.getResources();
        this.A08 = a88;
        this.A02 = AbstractC166987dD.A0Q();
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        A0R.A0A(this);
        this.A06 = A0R;
        C55982hj A0R2 = AbstractC167007dF.A0R();
        A0R2.A06 = true;
        A0R2.A0A(this);
        this.A07 = A0R2;
        this.A04 = drawable;
        Paint A0R3 = AbstractC166987dD.A0R();
        this.A03 = A0R3;
        A0R3.setColor(-16777216);
        C6RB A0z = AbstractC166987dD.A0z(context, a88.A00);
        A0z.setCallback(callback);
        A0z.A0M(a88.A01);
        A0z.A0K(Layout.Alignment.ALIGN_CENTER);
        A0z.A0F(-1);
        AbstractC166997dE.A1B(resources, A0z, R.dimen.achievements_only_you_bottom_margin);
        AbstractC166987dD.A1U(EnumC15950qp.A13, AbstractC15960qq.A00(context), A0z);
        this.A09 = A0z;
        this.A05 = new C7LH() { // from class: X.9dy
            @Override // X.C7LH
            public final void A00(long j) {
                C23478Aar.this.A07.A03();
            }
        };
        this.A00 = context.getResources().getDimensionPixelOffset(R.dimen.achievements_only_you_bottom_margin);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (c55982hj == this.A06) {
            if (c55982hj.A09.A00 == 1.0d) {
                C9IR c9ir = C9IR.A01;
                C7LH c7lh = this.A05;
                Choreographer.FrameCallback frameCallback = c7lh.A00;
                if (frameCallback == null) {
                    frameCallback = new WKp(c7lh, 2);
                    c7lh.A00 = frameCallback;
                }
                c9ir.A00.postFrameCallbackDelayed(frameCallback, 300L);
                return;
            }
            return;
        }
        if (c55982hj != this.A07 || !this.A01 || c55982hj.A09.A00 != 0.0d) {
            return;
        }
        this.A01 = false;
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        this.A04.invalidateSelf();
    }
}
