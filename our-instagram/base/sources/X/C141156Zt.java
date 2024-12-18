package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6Zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141156Zt extends C6ZL {
    public final Context A00;
    public final C38321qM A01;
    public final ReelHeaderAttributionType A02;
    public final C41181vS A03;
    public final InterfaceC144596ff A04;
    public final C143796eN A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141156Zt(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C41181vS c41181vS, InterfaceC144596ff interfaceC144596ff, C143796eN c143796eN) {
        super(interfaceC11380iw, userSession, c41181vS);
        C14360o3.A0B(c143796eN, 6);
        this.A00 = context;
        this.A03 = c41181vS;
        this.A01 = c38321qM;
        this.A04 = interfaceC144596ff;
        this.A05 = c143796eN;
        String string = context.getString(2131971860);
        C14360o3.A07(string);
        this.A06 = string;
        this.A02 = ReelHeaderAttributionType.A08;
    }
}
