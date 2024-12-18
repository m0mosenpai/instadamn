package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9G9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9G9 extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        UserSession userSession;
        C57332k8 c57332k8;
        int i = this.A00;
        View view = (View) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C14360o3.A0B(view, 0);
        Object obj3 = this.A06;
        if (i != 0) {
            C105214ob c105214ob = (C105214ob) obj3;
            userSession = c105214ob.A00;
            c57332k8 = c105214ob.A02;
        } else {
            C101024gI c101024gI = (C101024gI) obj3;
            userSession = c101024gI.A00;
            c57332k8 = c101024gI.A02;
        }
        AbstractC79753hQ.A06(view, userSession, (C38321qM) this.A03, (C38321qM) this.A04, c57332k8, this.A07, ((InterfaceC11380iw) this.A05).getModuleName(), this.A02 + 1, this.A01, booleanValue);
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9G9(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A06 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A07 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = obj4;
    }
}
