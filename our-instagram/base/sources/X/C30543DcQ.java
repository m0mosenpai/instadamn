package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DcQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30543DcQ extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ EnumC27380C6j A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C0s9 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30543DcQ(UserSession userSession, EnumC27380C6j enumC27380C6j, String str, String str2, C0s9 c0s9) {
        super(3);
        this.A04 = c0s9;
        this.A00 = userSession;
        this.A01 = enumC27380C6j;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AbstractC167017dG.A1N(obj, obj2);
        this.A04.invoke(this.A00, this.A01, obj, obj2, obj3, this.A02, this.A03);
        return C0eB.A00;
    }
}
