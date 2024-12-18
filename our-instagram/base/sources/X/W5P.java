package X;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public class W5P {
    public static final Pattern A02 = Pattern.compile("^(.*\\/)(live-dash.*)");
    public String A00;
    public final android.net.Uri A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof W5P)) {
            return false;
        }
        W5P w5p = (W5P) obj;
        String str = this.A00;
        if (str != null) {
            return str.equals(w5p.A00);
        }
        return this.A01.equals(w5p.A01);
    }

    public final int hashCode() {
        String str = this.A00;
        if (str != null) {
            return str.hashCode();
        }
        return this.A01.hashCode();
    }

    public String toString() {
        return this.A01.toString();
    }

    public W5P(android.net.Uri uri) {
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.clearQuery();
        android.net.Uri build = buildUpon.build();
        this.A01 = build;
        String path = build.getPath();
        if (path != null) {
            Matcher matcher = A02.matcher(path);
            if (matcher.find() && matcher.groupCount() == 2) {
                this.A00 = matcher.group(2);
            }
        }
    }
}
