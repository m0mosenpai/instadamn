package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.ClipsMidCardType;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardLayoutType;

/* renamed from: X.C0y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27255C0y extends C17T implements JJS {
    public InterfaceC31116Dly A00;

    @Override // X.JJS
    public final JJS E9K(C1DY c1dy) {
        InterfaceC31116Dly interfaceC31116Dly = this.A00;
        if (interfaceC31116Dly == null) {
            interfaceC31116Dly = (InterfaceC31116Dly) A04(3076010, C0v.class);
        }
        interfaceC31116Dly.E9I(c1dy);
        this.A00 = interfaceC31116Dly;
        return this;
    }

    @Override // X.JJS
    public final C26136BhN Ewo(C1DY c1dy) {
        C26137BhO c26137BhO;
        String A0j = A0j(150595944);
        int intValueByHashCode = getIntValueByHashCode(-468163310);
        InterfaceC31116Dly interfaceC31116Dly = this.A00;
        if (interfaceC31116Dly == null) {
            interfaceC31116Dly = (InterfaceC31116Dly) A04(3076010, C0v.class);
        }
        C26133BhK Ewk = interfaceC31116Dly.Ewk(c1dy);
        String A0h = A0h(-1245297597);
        MidCardLayoutType midCardLayoutType = (MidCardLayoutType) A0M(2011608879, JAJ.A00);
        InterfaceC31108Dlq interfaceC31108Dlq = (InterfaceC31108Dlq) A05(-450004177, C27256C0z.class);
        if (interfaceC31108Dlq != null) {
            c26137BhO = interfaceC31108Dlq.Ewp();
        } else {
            c26137BhO = null;
        }
        return new C26136BhN((ClipsMidCardSubtype) A0N(-664438814, C30002DKo.A00), (ClipsMidCardType) A0N(2007145938, JAK.A00), (InstagramMidcardType) A0M(-853089887, C30003DKp.A00), Ewk, midCardLayoutType, c26137BhO, A0j, A0h, A0i(295607137), intValueByHashCode, getIntValueByHashCode(1709232679), getIntValueByHashCode(1496409374));
    }
}
