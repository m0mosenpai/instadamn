package X;

import android.text.format.DateFormat;
import java.text.SimpleDateFormat;

/* renamed from: X.7Q0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Q0 extends C0YY implements InterfaceC16820sZ {
    public static final C7Q0 A00 = new C7Q0();

    public C7Q0() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(C1Q2.A02(), "MMM dd, yyyy"), C1Q2.A02());
    }
}
