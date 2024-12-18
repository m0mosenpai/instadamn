package X;

import android.graphics.Bitmap;

/* renamed from: X.Mru, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51663Mru extends C0T6 {
    public final double A00;
    public final Bitmap A01;
    public final EnumC53101NeE A02;
    public final boolean A03;

    public C51663Mru(Bitmap bitmap, EnumC53101NeE enumC53101NeE, double d, boolean z) {
        C14360o3.A0B(enumC53101NeE, 1);
        this.A02 = enumC53101NeE;
        this.A01 = bitmap;
        this.A00 = d;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51663Mru) {
                C51663Mru c51663Mru = (C51663Mru) obj;
                if (this.A02 != c51663Mru.A02 || !C14360o3.A0K(this.A01, c51663Mru.A01) || Double.compare(this.A00, c51663Mru.A00) != 0 || this.A03 != c51663Mru.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, (((AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC28006CWd.A00(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewState(loadingState=");
        A1C.append(this.A02);
        A1C.append(", previewImage=");
        A1C.append(this.A01);
        A1C.append(", transcodeProgress=");
        A1C.append(this.A00);
        A1C.append(", forcePlaybackPause=");
        return AbstractC25236BEt.A0a(A1C, this.A03);
    }
}
