package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* renamed from: X.Bds, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25948Bds extends C62961SZe {
    public final /* synthetic */ C58725Q5c A00;
    public final /* synthetic */ C27837CPa A01;

    public C25948Bds(C58725Q5c c58725Q5c, C27837CPa c27837CPa) {
        this.A00 = c58725Q5c;
        this.A01 = c27837CPa;
    }

    @Override // X.C62961SZe
    public final Object A00(C62611SIt c62611SIt) {
        return new PorterDuffColorFilter(this.A01.A00, PorterDuff.Mode.SRC_ATOP);
    }
}
