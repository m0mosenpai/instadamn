package X;

import android.os.Bundle;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* loaded from: classes11.dex */
public abstract class VQU {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        C1338462s c1338462s = (C1338462s) c6fw.A03(0);
        int intValue = ((Number) c6fw.A00()).intValue();
        C62862tP A06 = C6BQ.A06(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(A0B);
        igBloksScreenConfig.A07 = c1338462s;
        igBloksScreenConfig.A0c = A06.A00;
        Bundle bundle = new Bundle();
        IgBloksScreenConfig.A03(bundle, igBloksScreenConfig, false);
        AbstractC31175DnJ.A0r(bundle, A0B);
        C67861Uzs c67861Uzs = new C67861Uzs();
        c67861Uzs.A00 = intValue;
        c67861Uzs.setArguments(bundle);
        c67861Uzs.A0D(false);
        C14360o3.A0B(A0B, 0);
        ((C70812WhV) A0B.A01(C70812WhV.class, C71788X4p.A00)).igBloksIdfaDialogList.add(c67861Uzs);
        c67861Uzs.A0B(C6BQ.A05(c6fq), null);
        return null;
    }
}
