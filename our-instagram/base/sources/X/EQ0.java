package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EQ0 extends C2US {
    public final C32431EQj A00;
    public final C34531FJr A01;
    public final C168737g7 A02;
    public final C32436EQo A03;
    public final C31544DtU A04;
    public final C32441EQt A05;
    public final ArrayList A06;
    public final UserSession A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.FJr, java.lang.Object] */
    public EQ0(Context context, UserSession userSession) {
        super(false);
        C14360o3.A0B(userSession, 2);
        this.A07 = userSession;
        C32431EQj c32431EQj = new C32431EQj(context);
        this.A00 = c32431EQj;
        C168737g7 c168737g7 = new C168737g7(context);
        this.A02 = c168737g7;
        this.A01 = new Object();
        C32436EQo c32436EQo = new C32436EQo(context);
        this.A03 = c32436EQo;
        C31544DtU c31544DtU = new C31544DtU(context);
        this.A04 = c31544DtU;
        C32441EQt c32441EQt = new C32441EQt(context);
        this.A05 = c32441EQt;
        this.A06 = AbstractC166987dD.A1E();
        init(c32431EQj, c168737g7, c32436EQo, c31544DtU, c32441EQt);
    }
}
