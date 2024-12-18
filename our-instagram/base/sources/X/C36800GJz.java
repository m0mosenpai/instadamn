package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GJz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36800GJz implements InterfaceC42241xE {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C6FG A01;
    public final /* synthetic */ C41761wQ A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C2EC A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public C36800GJz(InterfaceC11380iw interfaceC11380iw, C6FG c6fg, C41761wQ c41761wQ, UserSession userSession, C2EC c2ec, String str, List list) {
        this.A04 = c2ec;
        this.A03 = userSession;
        this.A01 = c6fg;
        this.A05 = str;
        this.A06 = list;
        this.A00 = interfaceC11380iw;
        this.A02 = c41761wQ;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C2EC c2ec = this.A04;
        if (c2ec.BKb().A00 != null) {
            UserSession userSession = this.A03;
            FT0.A01(this.A01.A00, this.A00, userSession, c2ec, this.A05, this.A06);
            this.A02.A01();
        }
    }
}
