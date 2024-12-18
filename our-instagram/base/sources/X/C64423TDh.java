package X;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.TDh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64423TDh implements InterfaceC65669Tqz {
    public static final DateFormat A00;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        A00 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // X.InterfaceC65435Tk7
    public final /* bridge */ /* synthetic */ void ARz(Object obj, Object obj2) {
        ((InterfaceC65524Tlt) obj2).A7X(A00.format((Date) obj));
    }
}
