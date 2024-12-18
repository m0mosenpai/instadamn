package X;

import android.graphics.Rect;
import java.lang.ref.WeakReference;

/* renamed from: X.4JY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JY extends C1KR implements C3QZ, C4JZ {
    public final Rect A00;
    public final WeakReference A01;

    public C4JY(Rect rect, C1KO c1ko, String str, String str2, WeakReference weakReference, long j) {
        super(c1ko, str, str2, j);
        this.A00 = rect;
        this.A01 = weakReference;
    }

    @Override // X.C1KP
    public final String A00() {
        return "video on screen";
    }

    @Override // X.C3QZ
    public final Rect BA5() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("video view ");
        sb.append(((C1KR) this).A01);
        sb.append(" on ");
        sb.append(((C1KP) this).A01);
        sb.append(" at ");
        sb.append(((C1KP) this).A00);
        sb.append(", global Rect: ");
        sb.append(this.A00);
        return sb.toString();
    }
}
