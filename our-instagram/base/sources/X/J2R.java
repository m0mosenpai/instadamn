package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class J2R implements InterfaceC58009Pnt {
    public final /* synthetic */ JI7 A00;
    public final /* synthetic */ C4ES A01;

    public J2R(JI7 ji7, C4ES c4es) {
        this.A00 = ji7;
        this.A01 = c4es;
    }

    @Override // X.InterfaceC58009Pnt
    public final /* bridge */ /* synthetic */ void E1G(Object obj, Object obj2, String str, List list) {
        float f;
        C4EF c4ef;
        String BSb;
        String Aq2;
        String str2;
        String str3;
        InterfaceC82443m8 interfaceC82443m8 = (InterfaceC82443m8) obj2;
        C14360o3.A0B(list, 3);
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C50526MSf c50526MSf = (C50526MSf) it.next();
            if (c50526MSf.A01) {
                i++;
            }
            if (c50526MSf.A00) {
                i2++;
            }
        }
        int size = list.size();
        float f2 = 0.0f;
        if (size != 0) {
            float f3 = size;
            f = i / f3;
            f2 = i2 / f3;
        } else {
            f = 0.0f;
        }
        JI7 ji7 = this.A00;
        Integer num = ji7.Aq8().A03;
        Integer num2 = C05F.A01;
        if (num == num2) {
            if (f != f2) {
                if (f2 != 0.0f) {
                    num2 = C05F.A00;
                }
                c4ef = this.A01.A00;
                BSb = ji7.BSb();
                Aq2 = ji7.Aq2();
                str2 = "Vista";
                str3 = null;
            } else {
                return;
            }
        } else {
            num2 = C05F.A00;
            if (num != num2 || i != 0 || i2 == 0) {
                return;
            }
            c4ef = this.A01.A00;
            BSb = ji7.BSb();
            Aq2 = ji7.Aq2();
            str2 = "Vista";
            str3 = null;
            f2 = 0.0f;
        }
        c4ef.A01(new C38638Gyf(interfaceC82443m8, num2, BSb, Aq2, str2, str3, f2, now));
    }
}
