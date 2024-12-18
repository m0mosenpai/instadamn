package X;

import android.graphics.drawable.Drawable;
import android.text.Spannable;

/* renamed from: X.OzQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56305OzQ implements C5RO {
    public C9C2 A00;
    public final int A01;
    public final int A02;
    public final Drawable A03;
    public final Spannable A04;
    public final EnumC53185Nfh A05;
    public final Integer A06;
    public final String A07;

    public C56305OzQ(C5RO c5ro) {
        C14360o3.A0B(c5ro, 1);
        this.A07 = c5ro.getId();
        this.A03 = c5ro.Afg();
        this.A02 = c5ro.Bzk();
        this.A01 = c5ro.B25();
        this.A04 = c5ro.C5r();
        this.A00 = c5ro.CBG();
        this.A05 = c5ro.CBd();
        this.A06 = c5ro.B0L();
    }

    @Override // X.C5RO
    public final void Efo(int i, int i2) {
    }

    @Override // X.C5RO
    public final Drawable Afg() {
        return this.A03;
    }

    @Override // X.C5RO
    public final Integer B0L() {
        return this.A06;
    }

    @Override // X.C5RO
    public final int B25() {
        return this.A01;
    }

    @Override // X.C5RO
    public final int Bzk() {
        return this.A02;
    }

    @Override // X.C5RO
    public final Spannable C5r() {
        return this.A04;
    }

    @Override // X.C5RO
    public final C9C2 CBG() {
        return this.A00;
    }

    @Override // X.C5RO
    public final EnumC53185Nfh CBd() {
        return this.A05;
    }

    @Override // X.C5RO
    public final String getId() {
        return this.A07;
    }

    @Override // X.C5RO
    public final void EgI(C9C2 c9c2) {
        this.A00 = c9c2;
    }
}
