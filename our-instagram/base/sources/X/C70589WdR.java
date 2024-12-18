package X;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.WdR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70589WdR implements C53S {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70589WdR(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C53S
    public final void A8Y(C19280xC c19280xC) {
        String str;
        String str2;
        Tx0 tx0;
        String str3;
        switch (this.A00) {
            case 0:
                Bundle bundle = (Bundle) ((Bundle) this.A01).getParcelable(AbstractC58317Pt9.A00(785));
                AbstractC62816SSn.A01(bundle, (ReadableMap) this.A02);
                for (String str4 : bundle.keySet()) {
                    c19280xC.A0C(str4, bundle.getString(str4));
                }
                return;
            case 1:
                C14360o3.A0B(c19280xC, 0);
                V1F v1f = (V1F) this.A02;
                C65960TxC c65960TxC = v1f.A03;
                if (c65960TxC == null) {
                    str3 = "dataSource";
                } else {
                    String A03 = c65960TxC.A03(v1f.A07);
                    String E6U = v1f.A0K.E6U();
                    String str5 = v1f.A09;
                    if (str5 == null) {
                        str3 = "searchSessionId";
                    } else {
                        c19280xC.A07(AbstractC129015sM.A01, A03);
                        c19280xC.A07(AbstractC129015sM.A00, E6U);
                        c19280xC.A0C("search_session_id", str5);
                        str = "BLENDED";
                        str2 = "USER";
                        tx0 = (Tx0) this.A01;
                        int i = tx0.A00;
                        c19280xC.A0C("search_tab", str);
                        c19280xC.A0C("selected_type", str2);
                        c19280xC.A08(Integer.valueOf(i), "position");
                        return;
                    }
                }
                C14360o3.A0F(str3);
                throw C00O.createAndThrow();
            default:
                C14360o3.A0B(c19280xC, 0);
                tx0 = (Tx0) this.A01;
                String str6 = tx0.A06;
                C65921TwS c65921TwS = (C65921TwS) this.A02;
                String E6U2 = c65921TwS.A05.E6U();
                String str7 = c65921TwS.A07;
                c19280xC.A07(AbstractC129015sM.A01, str6);
                c19280xC.A07(AbstractC129015sM.A00, E6U2);
                c19280xC.A0C("search_session_id", str7);
                str = AbstractC66135U1c.A00(c65921TwS.A06.E6f());
                str2 = "USER";
                int i2 = tx0.A00;
                c19280xC.A0C("search_tab", str);
                c19280xC.A0C("selected_type", str2);
                c19280xC.A08(Integer.valueOf(i2), "position");
                return;
        }
    }
}
