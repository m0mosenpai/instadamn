package X;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.PdV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57371PdV extends C0YY implements InterfaceC16820sZ {
    public static final C57371PdV A00 = new C57371PdV();

    public C57371PdV() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Calendar.getInstance(TimeZone.getTimeZone("UTC"));
    }
}
