package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.6Uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC139766Uf implements C5GG {
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
    public final void DGB(Drawable drawable, Throwable th, long j) {
        if (this instanceof C139756Ue) {
            C139756Ue c139756Ue = (C139756Ue) this;
            C6BR.A03(c139756Ue.A01, c139756Ue.A02, c139756Ue.A03, "ImageFailed", c139756Ue.A00.now());
        }
    }

    @Override // X.C5GG
    public final void DpW(long j, Object obj) {
        if (this instanceof C139756Ue) {
            C139756Ue c139756Ue = (C139756Ue) this;
            C6BR.A03(c139756Ue.A01, c139756Ue.A02, c139756Ue.A03, "ImageRequested", c139756Ue.A00.now());
        }
    }
}
