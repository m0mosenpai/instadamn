package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69723Bg implements InterfaceC41501vz {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final InterfaceC55362gb A02;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C206839Do(this, 1));
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C206839Do(this, 0));

    public C69723Bg(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC55362gb interfaceC55362gb) {
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
        this.A02 = interfaceC55362gb;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        List A3w;
        int A03 = C0f9.A03(-741566676);
        C70083Cs c70083Cs = (C70083Cs) obj;
        int A032 = C0f9.A03(613594210);
        C14360o3.A0B(c70083Cs, 0);
        C38321qM c38321qM = c70083Cs.A00.A1C;
        if (c38321qM != null && (A3w = c38321qM.A3w(EnumC75383a5.A0y)) != null && !A3w.isEmpty()) {
            List A3w2 = c38321qM.A3w(EnumC75383a5.A0k);
            List A3w3 = c38321qM.A3w(EnumC75383a5.A0o);
            if ((A3w2 == null || A3w2.isEmpty()) && (A3w3 == null || A3w3.isEmpty())) {
                InterfaceC09390do interfaceC09390do = this.A04;
                if (((C2GT) ((C41220IMj) interfaceC09390do.getValue()).A01.getValue()).A02() != null) {
                    String A38 = c38321qM.A38();
                    if (A38 != null) {
                        C41220IMj c41220IMj = (C41220IMj) interfaceC09390do.getValue();
                        AbstractC59962oe abstractC59962oe = this.A00;
                        Context requireContext = abstractC59962oe.requireContext();
                        C08790ch A00 = AbstractC018607g.A00(abstractC59962oe);
                        C57252Pba c57252Pba = new C57252Pba(47, c38321qM, this);
                        B88 b88 = B88.A00;
                        C14360o3.A0B(A00, 2);
                        C14360o3.A0B(b88, 5);
                        c41220IMj.A01(requireContext, A00, b88, new C50275MIe(requireContext, c41220IMj, A00, b88, c57252Pba, abstractC59962oe, A38, 1));
                    }
                } else {
                    String A2u = c38321qM.A2u();
                    if (A2u != null) {
                        InterfaceC19610xo ARD = C41768Iek.A02(this.A01, C41768Iek.A00).ARD();
                        ARD.E7K(AbstractC111324zv.A00(2654), A2u);
                        ARD.apply();
                        InterfaceC55362gb interfaceC55362gb = this.A02;
                        java.util.Set singleton = Collections.singleton(Trigger.A21);
                        C14360o3.A07(singleton);
                        ((AbstractC55352ga) interfaceC55362gb).AVs(null, singleton);
                    }
                }
                i = -746433644;
            } else {
                i = 1719782301;
            }
        } else {
            i = -259614604;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(471483441, A03);
    }
}
