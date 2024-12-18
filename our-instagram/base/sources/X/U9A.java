package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class U9A extends Handler {
    public final /* synthetic */ C70517Wba A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9A(Looper looper, C70517Wba c70517Wba) {
        super(looper);
        this.A00 = c70517Wba;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                C70517Wba c70517Wba = this.A00;
                if (obj == c70517Wba.A01) {
                    int i2 = c70517Wba.A00;
                    if (i2 == 3 || i2 == 4) {
                        c70517Wba.A01 = null;
                        if (obj2 instanceof Exception) {
                            C70517Wba.A02(c70517Wba, (Exception) obj2, false);
                            return;
                        }
                        try {
                            byte[] E6a = c70517Wba.A0C.E6a(c70517Wba.A04, (byte[]) obj2);
                            if (c70517Wba.A03 != null && E6a != null && E6a.length != 0) {
                                c70517Wba.A03 = E6a;
                            }
                            c70517Wba.A00 = 4;
                            Iterator it = c70517Wba.A0F.A01().iterator();
                            while (it.hasNext()) {
                                ((C4XY) it.next()).A00();
                            }
                            return;
                        } catch (Exception e) {
                            C70517Wba.A02(c70517Wba, e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        C70517Wba c70517Wba2 = this.A00;
        if (obj != c70517Wba2.A02) {
            return;
        }
        int i3 = c70517Wba2.A00;
        if (i3 != 2 && i3 != 3 && i3 != 4) {
            return;
        }
        c70517Wba2.A02 = null;
        if (obj2 instanceof Exception) {
            Exception exc = (Exception) obj2;
            WbX wbX = (WbX) c70517Wba2.A0A;
            wbX.A00 = null;
            java.util.Set set = wbX.A01;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) set);
            set.clear();
            C1LC it2 = copyOf.iterator();
            while (it2.hasNext()) {
                C70517Wba.A01((C70517Wba) it2.next(), exc, 3);
            }
            return;
        }
        try {
            c70517Wba2.A0C.E6c((byte[]) obj2);
            WbX wbX2 = (WbX) c70517Wba2.A0A;
            wbX2.A00 = null;
            java.util.Set set2 = wbX2.A01;
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) set2);
            set2.clear();
            C1LC it3 = copyOf2.iterator();
            while (it3.hasNext()) {
                C70517Wba c70517Wba3 = (C70517Wba) it3.next();
                if (C70517Wba.A05(c70517Wba3)) {
                    C70517Wba.A03(c70517Wba3, true);
                }
            }
        } catch (Exception e2) {
            WbX wbX3 = (WbX) c70517Wba2.A0A;
            wbX3.A00 = null;
            java.util.Set set3 = wbX3.A01;
            ImmutableList copyOf3 = ImmutableList.copyOf((Collection) set3);
            set3.clear();
            C1LC it4 = copyOf3.iterator();
            while (it4.hasNext()) {
                C70517Wba.A01((C70517Wba) it4.next(), e2, 1);
            }
        }
    }
}
