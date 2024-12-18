package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.3rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85643rt {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public C85643rt() {
        String format = new SimpleDateFormat(MSV.A00(1797), Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        C14360o3.A0B(format, 1);
        this.A06 = format;
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        this.A00 = null;
        this.A04 = null;
        this.A03 = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("time: ");
        sb.append(this.A06);
        sb.append(" container_module: ");
        sb.append(this.A01);
        sb.append("  sessionId: ");
        sb.append(this.A05);
        sb.append("  action: ");
        sb.append(this.A02);
        sb.append(" ad_id: ");
        sb.append(this.A00);
        sb.append(" media_id: ");
        sb.append(this.A04);
        sb.append(" extraData: ");
        sb.append(this.A03);
        return sb.toString();
    }
}
