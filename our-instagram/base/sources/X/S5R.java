package X;

/* loaded from: classes10.dex */
public abstract class S5R {
    public static final EnumC61180Rgg A00(String str) {
        switch (str.hashCode()) {
            case -1298290464:
                if (!str.equals("Litho.Resolve.ComponentRendered")) {
                    return null;
                }
                return EnumC61180Rgg.A05;
            case 238438621:
                if (!str.equals("RenderCore.RenderUnit.Mounted")) {
                    return null;
                }
                return EnumC61180Rgg.A04;
            case 542663853:
                if (!str.equals("Litho.ComponentTree.Layout")) {
                    return null;
                }
                return EnumC61180Rgg.A06;
            case 781732041:
                if (!str.equals("Litho.ComponentTree.Resolve")) {
                    return null;
                }
                return EnumC61180Rgg.A07;
            default:
                return null;
        }
    }
}
