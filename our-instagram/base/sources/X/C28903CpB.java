package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.CpB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28903CpB implements C5GG {
    public final InterfaceC16660sJ A00;

    @Override // X.C5GG
    public final void DGB(Drawable drawable, Throwable th, long j) {
    }

    @Override // X.C5GG
    public final void DMs(long j, Throwable th) {
    }

    @Override // X.C5GG
    public final void DMu(C3QB c3qb, long j) {
    }

    @Override // X.C5GG
    public final void DYq(Drawable drawable, long j) {
    }

    @Override // X.C5GG
    public final void DeX(long j) {
    }

    @Override // X.C5GG
    public final void DpW(long j, Object obj) {
    }

    @Override // X.C5GG
    public final void DH1(Drawable drawable, C3QB c3qb, int i, long j) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap = null;
        if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        this.A00.invoke(bitmap);
    }

    public C28903CpB(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
