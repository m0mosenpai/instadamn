package X;

import android.graphics.Bitmap;

/* renamed from: X.CVl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27988CVl {
    public final int A00;
    public final Bitmap A01;
    public final CWM A02;

    public C27988CVl(Bitmap bitmap, CWM cwm, int i) {
        C14360o3.A0B(cwm, 1);
        this.A02 = cwm;
        this.A01 = bitmap;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27988CVl) {
                C27988CVl c27988CVl = (C27988CVl) obj;
                if (!C14360o3.A0K(this.A02, c27988CVl.A02) || !C14360o3.A0K(this.A01, c27988CVl.A01) || this.A00 != c27988CVl.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)) + this.A00;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("EmuFlashGeneratedImage(generatedMedia=");
        A1C.append(this.A02);
        A1C.append(", bitmap=");
        A1C.append(this.A01);
        A1C.append(", instanceKey=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
