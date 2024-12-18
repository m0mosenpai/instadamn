package X;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70863Fy extends C0YY implements InterfaceC16820sZ {
    public static final C70863Fy A00 = new C70863Fy();

    public C70863Fy() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(new Date().getTime()));
    }
}
