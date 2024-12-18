package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class S8Z {
    public static final Map A00;
    public static final Map A01;

    static {
        C09530e4 A1L = AbstractC166987dD.A1L("WIFI", EnumC61158RgJ.A07);
        C09530e4 A1L2 = AbstractC166987dD.A1L("MOBILE.NRNSA", EnumC61158RgJ.A04);
        EnumC61158RgJ enumC61158RgJ = EnumC61158RgJ.A03;
        C09530e4 A1L3 = AbstractC166987dD.A1L("MOBILE.LTE", enumC61158RgJ);
        C09530e4 A1L4 = AbstractC166987dD.A1L("MOBILE.HSPA", enumC61158RgJ);
        EnumC61158RgJ enumC61158RgJ2 = EnumC61158RgJ.A06;
        A00 = AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, AbstractC166987dD.A1L(NetInfoModule.EFFECTIVE_CONNECTION_TYPE_3G, enumC61158RgJ2), AbstractC166987dD.A1L(NetInfoModule.EFFECTIVE_CONNECTION_TYPE_2G, enumC61158RgJ2), AbstractC166987dD.A1L("None", EnumC61158RgJ.A05));
        A01 = AbstractC06930Yk.A06(AbstractC167007dF.A0o(NetInfoModule.CONNECTION_TYPE_NONE, 0), AbstractC167007dF.A0o("others", 1), AbstractC167007dF.A0o(NetInfoModule.EFFECTIVE_CONNECTION_TYPE_4G, 2), AbstractC167007dF.A0o("5g", 3), AbstractC167007dF.A0o(NetInfoModule.CONNECTION_TYPE_WIFI, 4));
    }
}
