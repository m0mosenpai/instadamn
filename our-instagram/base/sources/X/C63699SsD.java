package X;

import android.graphics.PointF;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.SsD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63699SsD implements InterfaceC65311Thn {
    public static final C63699SsD A00 = new Object();
    public static final C63136Sdh A01 = C63136Sdh.A01("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    /* JADX WARN: Type inference failed for: r0v1, types: [X.SN0, java.lang.Object] */
    @Override // X.InterfaceC65311Thn
    public final /* bridge */ /* synthetic */ Object E3O(THX thx, float f) {
        Integer num = C05F.A0C;
        thx.A0J();
        String str = null;
        Integer num2 = num;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (thx.A0Q()) {
            switch (thx.A0D(A01)) {
                case 0:
                    str = thx.A0G();
                    continue;
                case 1:
                    str2 = thx.A0G();
                    continue;
                case 2:
                    f2 = AbstractC58321PtD.A03(thx);
                    continue;
                case 3:
                    int A0C = thx.A0C();
                    if (A0C <= 2 && A0C >= 0) {
                        num2 = C05F.A00(3)[A0C];
                        break;
                    } else {
                        num2 = num;
                        continue;
                    }
                    break;
                case 4:
                    i = thx.A0C();
                    continue;
                case 5:
                    f3 = AbstractC58321PtD.A03(thx);
                    continue;
                case 6:
                    f4 = AbstractC58321PtD.A03(thx);
                    continue;
                case 7:
                    i2 = AbstractC63319ShS.A01(thx);
                    continue;
                case 8:
                    i3 = AbstractC63319ShS.A01(thx);
                    continue;
                case 9:
                    f5 = AbstractC58321PtD.A03(thx);
                    continue;
                case 10:
                    z = thx.A0R();
                    continue;
                case 11:
                    thx.A0I();
                    pointF = new PointF(AbstractC58321PtD.A03(thx) * f, AbstractC58321PtD.A03(thx) * f);
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    thx.A0I();
                    pointF2 = new PointF(AbstractC58321PtD.A03(thx) * f, AbstractC58321PtD.A03(thx) * f);
                    break;
                default:
                    thx.A0M();
                    thx.A0N();
                    continue;
            }
            thx.A0K();
        }
        thx.A0L();
        ?? obj = new Object();
        obj.A0B = str;
        obj.A0A = str2;
        obj.A02 = f2;
        obj.A09 = num2;
        obj.A06 = i;
        obj.A01 = f3;
        obj.A00 = f4;
        obj.A04 = i2;
        obj.A05 = i3;
        obj.A03 = f5;
        obj.A0C = z;
        obj.A07 = pointF;
        obj.A08 = pointF2;
        return obj;
    }
}
