package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.FDa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34358FDa {
    public static final boolean A00(long j, long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        return simpleDateFormat.format(new Date(j)).equals(simpleDateFormat.format(new Date(j2)));
    }
}
