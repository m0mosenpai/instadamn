package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelHeaderAttributionType;

/* renamed from: X.6aD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141346aD extends C6ZL {
    public final ReelHeaderAttributionType A00;
    public final C41181vS A01;
    public final C6eI A02;
    public final InterfaceC144596ff A03;
    public final String A04;
    public final String A05;
    public final Context A06;
    public final InterfaceC11380iw A07;

    public C141346aD(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C6eI c6eI, InterfaceC144596ff interfaceC144596ff) {
        super(interfaceC11380iw, userSession, c41181vS);
        String str;
        Al9 al9;
        this.A06 = context;
        this.A02 = c6eI;
        this.A01 = c41181vS;
        this.A03 = interfaceC144596ff;
        this.A07 = interfaceC11380iw;
        C84823qW A00 = AbstractC120715dH.A00(EnumC75383a5.A0F, c41181vS.A0c());
        if (A00 != null && (al9 = A00.A0x) != null) {
            str = al9.A00.A08;
        } else {
            str = null;
        }
        this.A04 = str;
        String string = context.getString(2131971939);
        C14360o3.A07(string);
        this.A05 = string;
        this.A00 = ReelHeaderAttributionType.A0C;
    }
}
