package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IIo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41123IIo {
    public final C57112jm A00;
    public final C42374Ipb A01;
    public final List A02;
    public final InterfaceC64122vX A03;
    public final C64092vU A04;

    public C41123IIo(Context context, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS) {
        this.A00 = c57112jm;
        C64092vU A0R = AbstractC37302Gc3.A0R(userSession);
        this.A04 = A0R;
        J2C j2c = new J2C(context, userSession, interfaceC60442pS);
        this.A03 = j2c;
        this.A01 = new C42374Ipb(j2c, A0R);
        this.A02 = AbstractC166987dD.A1E();
    }
}
