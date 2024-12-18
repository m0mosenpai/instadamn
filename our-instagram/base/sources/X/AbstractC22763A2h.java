package X;

import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.LinkedHashSet;

/* renamed from: X.A2h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22763A2h {
    public static final CameraConfiguration A00(EnumC223209sz enumC223209sz) {
        C81W c81w;
        C55U c55u = C208509Kk.A00;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        switch (enumC223209sz.ordinal()) {
            case 0:
                break;
            case 1:
                c81w = C81W.A0C;
                linkedHashSet.add(c81w);
                break;
            case 2:
                c55u = C81S.A00;
                break;
            case 3:
                c55u = C128535rM.A00;
                break;
            case 4:
                c81w = C81W.A0B;
                linkedHashSet.add(c81w);
                break;
            case 5:
                c81w = C81W.A0M;
                linkedHashSet.add(c81w);
                break;
            case 6:
                c55u = C1811281o.A00;
                break;
            case 7:
            case 8:
            case 9:
            default:
                C0w9.A03("CameraTarget", AbstractC167017dG.A0n(enumC223209sz, "no available CameraConfiguration for CameraTarget: ", AbstractC166987dD.A1C()));
                break;
            case 10:
                c81w = C81W.A0w;
                linkedHashSet.add(c81w);
                break;
            case 11:
                c55u = C81U.A00;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c81w = C81W.A0T;
                linkedHashSet.add(c81w);
                break;
        }
        return new CameraConfiguration(c55u, AbstractC001800i.A0k(linkedHashSet));
    }
}
