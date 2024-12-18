package X;

/* renamed from: X.SzF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64098SzF implements InterfaceC65489TlA {
    public final /* synthetic */ TF8 A00;
    public final /* synthetic */ String A01;

    public C64098SzF(TF8 tf8, String str) {
        this.A00 = tf8;
        this.A01 = str;
    }

    @Override // X.InterfaceC65489TlA
    public final void EmQ(String str, Throwable th) {
        String str2;
        if (C1AD.A06(C06090Tz.A05, 2324153257955504456L)) {
            AbstractC12990ll abstractC12990ll = this.A00.A01;
            String A0R = AnonymousClass001.A0R("InstallReferrerRegistrar_OXYGEN_SDK_INTERNAL_SOFT_ERROR_", str);
            String str3 = this.A01;
            C14360o3.A0B(A0R, 0);
            if (th == null || (str2 = th.getMessage()) == null) {
                str2 = "";
            }
            String A11 = AnonymousClass001.A11(A0R, " : ", "internal soft-error without message", " : ", str2);
            String A10 = AbstractC58320PtC.A10(abstractC12990ll);
            C25531Mh A0J = AbstractC58320PtC.A0J(abstractC12990ll, A11);
            if (A10 != null) {
                A0J.A0R("pigeon_session_id", A10);
            }
            AbstractC58321PtD.A1G(A0J, str3, null);
        }
    }

    @Override // X.InterfaceC65489TlA
    public final void EmN(String str, String str2) {
        throw C00O.createAndThrow();
    }
}
