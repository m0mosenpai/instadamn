package X;

import android.os.SystemClock;

/* renamed from: X.5Q5, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5Q5 extends C3DS implements C3DT {
    public final Object A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("markerAnnotate /");
        sb.append(this.A02);
        sb.append('/');
        sb.append(this.A01);
        sb.append(" = ");
        sb.append(this.A00);
        return sb.toString();
    }

    public C5Q5(String str, Object obj, String str2) {
        super("", SystemClock.uptimeMillis());
        this.A02 = str;
        this.A01 = str2;
        this.A00 = obj;
    }
}
