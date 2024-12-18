package X;

import com.instagram.api.schemas.OriginalSoundDataIntf;

/* renamed from: X.MUe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50573MUe {
    public static final AbstractC53534Nm0 A00(C38321qM c38321qM) {
        EnumC53249Ngn enumC53249Ngn;
        OriginalSoundDataIntf BZw;
        InterfaceC84163p3 A1P = c38321qM.A1P();
        if (A1P != null && A1P.BZr() != null) {
            enumC53249Ngn = EnumC53249Ngn.A0S;
        } else {
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null && (BZw = A0u.BZw()) != null && !C14360o3.A0K(BZw.getOriginalMediaId(), c38321qM.A2u()) && AbstractC166997dE.A1Z(BZw.Akf(), false)) {
                enumC53249Ngn = EnumC53249Ngn.A0L;
            } else if (!c38321qM.A5t() && !c38321qM.A58()) {
                if (c38321qM.A1x() == EnumC76383bi.A04) {
                    enumC53249Ngn = EnumC53249Ngn.A06;
                } else if (c38321qM.A1x() == EnumC76383bi.A08) {
                    enumC53249Ngn = EnumC53249Ngn.A0F;
                } else {
                    String xpostDenyReason = c38321qM.A0C.getXpostDenyReason();
                    if (xpostDenyReason != null && xpostDenyReason.length() > 0) {
                        return new NVh(AbstractC166987dD.A1J(EnumC53249Ngn.A0U), c38321qM.A0C.getXpostDenyReason());
                    }
                    return C52740NVi.A00;
                }
            } else {
                enumC53249Ngn = EnumC53249Ngn.A04;
            }
        }
        return new NVh(AbstractC166987dD.A1J(enumC53249Ngn), null);
    }
}
