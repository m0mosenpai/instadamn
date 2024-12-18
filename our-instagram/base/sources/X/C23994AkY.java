package X;

/* renamed from: X.AkY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23994AkY implements InterfaceC19620xp {
    public final /* synthetic */ C7Uo A00;
    public final /* synthetic */ InterfaceC71543Iw A01;

    public C23994AkY(C7Uo c7Uo, InterfaceC71543Iw interfaceC71543Iw) {
        this.A01 = interfaceC71543Iw;
        this.A00 = c7Uo;
    }

    @Override // X.InterfaceC19620xp
    public final void onChanged(InterfaceC19630xq interfaceC19630xq, String str) {
        String A00 = MSV.A00(426);
        if (C14360o3.A0K(str, A00)) {
            InterfaceC71543Iw interfaceC71543Iw = this.A01;
            C7Uo c7Uo = this.A00;
            interfaceC71543Iw.F8s(Boolean.valueOf(c7Uo.A01.getBoolean(A00, C18U.A06(C06090Tz.A05, c7Uo.A00, 36329457614733653L))));
        }
    }
}
