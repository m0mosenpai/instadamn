package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.5Y8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Y8 extends C2DC implements C2DD {
    public final Drawable A00;
    public final InterfaceC74953Yl A01;
    public final InterfaceC74953Yl A02;
    public final InterfaceC09390do A03;

    @Override // X.C2DC
    public final boolean A02(AnonymousClass583 anonymousClass583) {
        C14360o3.A0B(anonymousClass583, 0);
        int i = 0;
        Drawable drawable = this.A00;
        int ordinal = anonymousClass583.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        }
        return drawable.setLayoutDirection(i);
    }

    @Override // X.C2DC
    public final void A04(InterfaceC1128857w interfaceC1128857w) {
        C14360o3.A0B(interfaceC1128857w, 0);
        AnonymousClass585 anonymousClass585 = ((AnonymousClass587) interfaceC1128857w.AzL()).A02.A02.A01;
        ((Number) this.A01.getValue()).intValue();
        Drawable drawable = this.A00;
        long Bxc = interfaceC1128857w.Bxc();
        drawable.setBounds(0, 0, C1H4.A01(C5YC.A02(Bxc)), C1H4.A01(C5YC.A00(Bxc)));
        try {
            anonymousClass585.ELZ();
            drawable.draw(AnonymousClass597.A00(anonymousClass585));
        } finally {
            anonymousClass585.EKS();
        }
    }

    @Override // X.C2DC
    public final long A03() {
        return ((C5YC) this.A02.getValue()).A00;
    }

    @Override // X.C2DC
    public final boolean A05(float f) {
        Drawable drawable = this.A00;
        int A01 = C1H4.A01(f * 255.0f);
        if (A01 < 0) {
            A01 = 0;
        } else if (A01 > 255) {
            A01 = 255;
        }
        drawable.setAlpha(A01);
        return true;
    }

    @Override // X.C2DC
    public final boolean A06(C5YV c5yv) {
        ColorFilter colorFilter;
        Drawable drawable = this.A00;
        if (c5yv != null) {
            colorFilter = c5yv.A00;
        } else {
            colorFilter = null;
        }
        drawable.setColorFilter(colorFilter);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2DD
    public final void DI8() {
        Drawable drawable = this.A00;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2DD
    public final void Deh() {
        Drawable drawable = this.A00;
        drawable.setCallback((Drawable.Callback) this.A03.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public C5Y8(Drawable drawable) {
        long j;
        this.A00 = drawable;
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A01 = new ParcelableSnapshotMutableState(A00, 0);
        InterfaceC09390do interfaceC09390do2 = C5Y9.A00;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            j = C5YB.A00(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            j = 9205357640488583168L;
        }
        this.A02 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), new C5YC(j));
        this.A03 = AbstractC09440dt.A01(new C206979Ec(this, 41));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // X.C2DD
    public final void CuG() {
        DI8();
    }
}
