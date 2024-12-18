package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43111ye extends C0YY implements InterfaceC16660sJ {
    public static final C43111ye A00 = new C43111ye();

    public C43111ye() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        ImageUrl BGt;
        C43121yf c43121yf = (C43121yf) obj;
        C14360o3.A0B(c43121yf, 0);
        C3ZM c3zm = c43121yf.A01;
        C75363a3 c75363a3 = c3zm.A01;
        Object obj3 = null;
        if (c75363a3 != null) {
            obj2 = C43121yf.A04.invoke(c75363a3);
        } else {
            obj2 = null;
        }
        String str = (String) obj2;
        InterfaceC59502nt interfaceC59502nt = c3zm.A00;
        if (interfaceC59502nt != null && (BGt = interfaceC59502nt.BGt()) != null) {
            obj3 = C43121yf.A03.invoke(BGt);
        }
        return AbstractC009903n.A0I(new String[]{str, (String) obj3});
    }
}
