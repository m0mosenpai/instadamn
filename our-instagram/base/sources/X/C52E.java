package X;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.52E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52E extends C0YY implements InterfaceC16820sZ {
    public static final C52E A00 = new C52E();

    public C52E() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        TimeZone timeZone = TimeZone.getDefault();
        return Integer.valueOf(timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000);
    }
}
