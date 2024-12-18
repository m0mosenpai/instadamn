package X;

import android.text.format.DateFormat;
import java.text.SimpleDateFormat;

/* renamed from: X.7Py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162617Py extends C0YY implements InterfaceC16820sZ {
    public static final C162617Py A00 = new C162617Py();

    public C162617Py() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(C1Q2.A02(), "MMM d, h:mm a"), C1Q2.A02());
    }
}
