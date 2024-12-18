package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54382es implements InterfaceC54362eq, InterfaceC13000lm {
    public final Map A00 = new LinkedHashMap();

    @Override // X.InterfaceC54362eq
    public final boolean Eix(EnumC58122lU enumC58122lU, EnumC58162lY enumC58162lY, C54432ex c54432ex, Integer num, Integer num2) {
        String str;
        C14360o3.A0B(num, 0);
        C14360o3.A0B(enumC58162lY, 2);
        C14360o3.A0B(enumC58122lU, 3);
        if (c54432ex.A01 + c54432ex.A00 != 0) {
            StringBuilder sb = new StringBuilder();
            if (num.intValue() != 0) {
                str = "logger_v2";
            } else {
                str = "logger_v1";
            }
            sb.append(str);
            sb.append('|');
            sb.append(c54432ex.A03);
            sb.append('|');
            sb.append(enumC58162lY);
            sb.append('|');
            sb.append(enumC58122lU);
            sb.append('|');
            if (num2 == null) {
                num2 = C05F.A0u;
            }
            sb.append(AbstractC84693qI.A00(num2));
            String obj = sb.toString();
            Map map = this.A00;
            Object obj2 = map.get(obj);
            InterfaceC09390do interfaceC09390do = c54432ex.A05;
            Object value = interfaceC09390do.getValue();
            C14360o3.A07(value);
            if (!C14360o3.A0K(obj2, value)) {
                Object value2 = interfaceC09390do.getValue();
                C14360o3.A07(value2);
                map.put(obj, value2);
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC54362eq
    public final void AHj() {
        this.A00.clear();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
