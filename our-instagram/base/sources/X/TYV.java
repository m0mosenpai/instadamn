package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class TYV extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(AbstractC63404SjZ.A02);
        return simpleDateFormat;
    }
}
