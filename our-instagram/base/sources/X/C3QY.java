package X;

import android.graphics.Rect;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.3QY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QY extends C1KR implements C3QZ, InterfaceC73073Pi {
    public final Rect A00;
    public final ImageUrl A01;
    public final WeakReference A02;

    @Override // X.C1KP
    public final String A00() {
        return "image on screen";
    }

    @Override // X.C3QZ
    public final Rect BA5() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Image View ");
        sb.append(((C1KR) this).A01.hashCode());
        sb.append(" on ");
        sb.append(((C1KP) this).A01);
        sb.append(" at ");
        sb.append(((C1KP) this).A00);
        sb.append(", global rect: ");
        sb.append(this.A00);
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3QY(android.graphics.Rect r7, com.instagram.common.typedurl.ImageUrl r8, X.C1KO r9, java.lang.String r10, java.lang.ref.WeakReference r11, long r12) {
        /*
            r6 = this;
            java.lang.String r2 = r8.getUrl()
            X.C14360o3.A07(r2)
            r0 = r6
            r1 = r9
            r3 = r10
            r4 = r12
            r0.<init>(r1, r2, r3, r4)
            r6.A01 = r8
            r6.A00 = r7
            r6.A02 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3QY.<init>(android.graphics.Rect, com.instagram.common.typedurl.ImageUrl, X.1KO, java.lang.String, java.lang.ref.WeakReference, long):void");
    }
}
