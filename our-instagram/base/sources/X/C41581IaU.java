package X;

import android.content.Context;
import android.text.format.DateFormat;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;

/* renamed from: X.IaU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41581IaU {
    public static final SimpleDateFormat A03 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(C1Q2.A02(), "MMM dd"), C1Q2.A02());
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC43412JGc A02;

    public C41581IaU(Context context, UserSession userSession, InterfaceC43412JGc interfaceC43412JGc) {
        C14360o3.A0B(interfaceC43412JGc, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = interfaceC43412JGc;
    }
}
