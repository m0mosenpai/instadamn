package X;

import android.text.format.DateFormat;
import java.text.SimpleDateFormat;

/* renamed from: X.7Pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162627Pz extends C0YY implements InterfaceC16820sZ {
    public static final C162627Pz A00 = new C162627Pz();

    public C162627Pz() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(C1Q2.A02(), "MMM d, HH:mm"), C1Q2.A02());
    }
}
