package X;

import android.os.Bundle;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class W6d {
    public static final Bundle A00(IgBloksScreenConfig igBloksScreenConfig, C66277U6x c66277U6x) {
        C14360o3.A0B(igBloksScreenConfig, 1);
        boolean booleanValue = AbstractC66275U6v.A00(igBloksScreenConfig.A0B).booleanValue();
        Bundle bundle = new Bundle();
        Map map = c66277U6x.A07;
        new ArrayList();
        Map map2 = c66277U6x.A0B;
        int i = c66277U6x.A00;
        List list = c66277U6x.A09;
        String str = c66277U6x.A05;
        String str2 = c66277U6x.A06;
        C102884kP c102884kP = c66277U6x.A03;
        C66273U6s.A02(bundle, new C66273U6s(c66277U6x.A02, c102884kP, c66277U6x.A08, str, str2, (HashMap) map, list, c66277U6x.A0A, map2, map2, i, false), booleanValue);
        IgBloksScreenConfig.A03(bundle, igBloksScreenConfig, false);
        AbstractC31175DnJ.A0r(bundle, igBloksScreenConfig.A0B);
        return bundle;
    }

    public static final U60 A01(IgBloksScreenConfig igBloksScreenConfig, C66277U6x c66277U6x) {
        C14360o3.A0B(igBloksScreenConfig, 1);
        Bundle A00 = A00(igBloksScreenConfig, c66277U6x);
        U60 u60 = new U60();
        u60.setArguments(A00);
        return u60;
    }

    public static final C72743Nv A02(IgBloksScreenConfig igBloksScreenConfig, C66277U6x c66277U6x) {
        C14360o3.A0B(igBloksScreenConfig, 1);
        C72743Nv c72743Nv = new C72743Nv();
        c72743Nv.setArguments(A00(igBloksScreenConfig, c66277U6x));
        return c72743Nv;
    }
}
