package X;

import android.content.Context;
import android.os.Bundle;
import android.util.ArrayMap;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W2o {
    public C0eR A00;
    public XBU A01;
    public EnumC68125VCj A02;
    public final Fragment A03;
    public final Map A04 = new ArrayMap(EnumC68125VCj.A00.size());
    public final C65968TxL A05;

    /* JADX WARN: Multi-variable type inference failed */
    public static final C09530e4 A00(Bundle bundle, W2o w2o, EnumC68125VCj enumC68125VCj) {
        Object wqz;
        String str;
        C70300WQf c70300WQf = new C70300WQf();
        String name = enumC68125VCj.name();
        boolean equals = name.equals("Native");
        if (!equals && !name.equals("Bloks")) {
            EnumC68125VCj enumC68125VCj2 = EnumC68125VCj.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("There is no corresponding behavior factory for type: ");
            sb.append(enumC68125VCj);
            sb.append('.');
            if (enumC68125VCj == enumC68125VCj2) {
                str = "The fallback bloks behavior was not used, because the fragment does not implement CDSBloksBottomSheet";
            } else {
                str = "";
            }
            throw AbstractC58320PtC.A0m(str, sb);
        }
        Fragment fragment = w2o.A03;
        InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) fragment;
        Context requireContext = fragment.requireContext();
        C0eR c0eR = c70300WQf.A00;
        if (!equals) {
            if (name.equals("Bloks")) {
                AbstractC167017dG.A1O(interfaceC72040XGi, c0eR);
                wqz = new C66209U4f(requireContext, bundle, c0eR, interfaceC72040XGi);
            } else {
                throw AbstractC65702TsY.A0S(name);
            }
        } else {
            AbstractC167017dG.A1O(interfaceC72040XGi, c0eR);
            wqz = new WQZ(requireContext, bundle, c0eR, interfaceC72040XGi);
        }
        C14360o3.A0A(wqz);
        C09530e4 c09530e4 = new C09530e4(wqz, c70300WQf);
        w2o.A04.put(enumC68125VCj, c09530e4);
        return c09530e4;
    }

    public W2o(Fragment fragment) {
        this.A03 = fragment;
        C65968TxL c65968TxL = new C65968TxL(this, 0);
        this.A05 = c65968TxL;
        fragment.mLifecycleRegistry.A09(c65968TxL);
    }
}
