package X;

import android.content.Context;

/* renamed from: X.MiH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51112MiH extends C110814yt {
    public final int A00;
    public final int A01;

    @Override // X.C110814yt
    public final int A07() {
        return this.A01;
    }

    @Override // X.C110814yt
    public final int A08() {
        return this.A01;
    }

    public C51112MiH(Context context, int i, int i2) {
        super(context);
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.C110814yt
    public final int A0B(int i, int i2, int i3, int i4, int i5) {
        return super.A0B(i, i2, i3, i4, i5) + this.A00;
    }
}
