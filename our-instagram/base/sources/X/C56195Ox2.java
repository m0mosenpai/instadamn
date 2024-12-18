package X;

import android.net.NetworkInfo;
import java.util.Map;

/* renamed from: X.Ox2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56195Ox2 implements InterfaceC15680qO {
    public final /* synthetic */ C51484MoV A00;

    public C56195Ox2(C51484MoV c51484MoV) {
        this.A00 = c51484MoV;
    }

    @Override // X.InterfaceC15680qO
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        String typeName;
        EnumC53100NeD enumC53100NeD;
        if (networkInfo != null) {
            networkInfo.getTypeName();
            networkInfo.getSubtypeName();
            String typeName2 = networkInfo.getTypeName();
            if (typeName2 != null && typeName2.length() != 0) {
                String subtypeName = networkInfo.getSubtypeName();
                if (subtypeName != null && subtypeName.length() != 0) {
                    String typeName3 = networkInfo.getTypeName();
                    String subtypeName2 = networkInfo.getSubtypeName();
                    C14360o3.A07(subtypeName2);
                    String replace = subtypeName2.replace('.', '_');
                    C14360o3.A07(replace);
                    String replace2 = replace.replace(' ', '_');
                    C14360o3.A07(replace2);
                    typeName = AnonymousClass001.A0T(typeName3, replace2, '.');
                } else {
                    typeName = networkInfo.getTypeName();
                }
                if (typeName != null) {
                    C51484MoV c51484MoV = this.A00;
                    if (C18U.A06(C06090Tz.A05, ((OL0) c51484MoV).A02.A00, 36317646454986176L) && !typeName.equals(((OL0) c51484MoV).A00)) {
                        C51687MsI c51687MsI = ((OL0) c51484MoV).A04.A04;
                        Object obj = S8Z.A00.get(typeName);
                        if (obj == null) {
                            obj = EnumC61158RgJ.A06;
                        }
                        String str = ((EnumC61158RgJ) obj).A00;
                        C14360o3.A0B(str, 0);
                        Map map = c51687MsI.A00;
                        if (map == null || !map.containsKey(str)) {
                            ((OL0) c51484MoV).A00 = typeName;
                            if (((OL0) c51484MoV).A01) {
                                enumC53100NeD = EnumC53100NeD.A04;
                            } else {
                                enumC53100NeD = EnumC53100NeD.A06;
                            }
                            ((OL0) c51484MoV).A03.A00();
                            c51484MoV.A01(enumC53100NeD, null);
                        }
                    }
                    ((OL0) c51484MoV).A01 = false;
                    ((OL0) c51484MoV).A00 = typeName;
                }
            }
        }
    }
}
