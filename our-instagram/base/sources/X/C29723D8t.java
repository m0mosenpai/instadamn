package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.D8t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29723D8t extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29723D8t(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69 c69, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        super(0);
        this.A00 = i;
        this.A04 = c69;
        this.A03 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
        this.A06 = str;
        this.A05 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        String A00;
        Object obj2;
        int i = this.A00;
        int ordinal = ((C69) this.A04).ordinal();
        if (i != 0) {
            if (ordinal != 0) {
                if (ordinal == 1) {
                    obj2 = this.A02;
                } else {
                    throw B4Z.A00();
                }
            } else {
                obj2 = this.A03;
            }
            AbstractC166987dD.A1Y(obj2);
            if (ordinal != 0) {
                A00 = "reel_add_draft_button";
            } else {
                A00 = "post_add_draft_button";
            }
        } else {
            if (ordinal != 0) {
                if (ordinal == 1) {
                    obj = this.A02;
                } else {
                    throw B4Z.A00();
                }
            } else {
                obj = this.A03;
            }
            AbstractC166987dD.A1Y(obj);
            if (ordinal != 0) {
                A00 = AbstractC43591JPw.A00(883);
            } else {
                A00 = AbstractC43591JPw.A00(882);
            }
        }
        String str = this.A06;
        AbstractC34277F9x.A00((InterfaceC11380iw) this.A01, (AbstractC12990ll) this.A05, "tap", A00, "opal_self_profile", str, null);
        return C0eB.A00;
    }
}
