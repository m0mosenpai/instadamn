package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y89 implements Handler.Callback {
    public final int A00;
    public final Object A01;

    public Y89(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        switch (this.A00) {
            case 0:
                C73311Y1r c73311Y1r = (C73311Y1r) this.A01;
                Iterator it = c73311Y1r.A04.iterator();
                while (it.hasNext()) {
                    C72847Xp3 c72847Xp3 = (C72847Xp3) it.next();
                    YNG yng = c73311Y1r.A03;
                    if (c72847Xp3.A01) {
                        C72861XpN A00 = c72847Xp3.A00.A00();
                        c72847Xp3.A00 = new C72845Xow();
                        c72847Xp3.A01 = false;
                        yng.CP7(A00, c72847Xp3.A02);
                    }
                    if (((Y8Y) c73311Y1r.A02).A00.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 1:
                Y6y y6y = (Y6y) this.A01;
                Y6y.A05(y6y);
                Object obj = message.obj;
                obj.getClass();
                GRF grf = (GRF) obj;
                int i = message.what;
                Object obj2 = y6y.A04.get();
                obj2.getClass();
                PackageManager packageManager = y6y.A01;
                SharedPreferences sharedPreferences = y6y.A00;
                sharedPreferences.getClass();
                grf.A00 = Y6y.A04((Context) obj2, sharedPreferences, packageManager, i);
                y6y.A02.post(grf);
                return true;
            default:
                if (message.what == 1) {
                    C209039Ml c209039Ml = (C209039Ml) this.A01;
                    if (c209039Ml.A0B) {
                        List list = c209039Ml.A0A;
                        int i2 = message.arg1;
                        if (list != null && i2 < list.size()) {
                            Object obj3 = list.get(i2);
                            list.get(0);
                            list.get(list.size() - 1);
                            List list2 = c209039Ml.A06.A00;
                            int size = list2.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                if (C184848Hz.A00((C184848Hz) list2.get(i3), AbstractC111324zv.A00(2817)) != null) {
                                    AbstractC13670mt.A06(AbstractC111324zv.A00(2818), obj3, Integer.valueOf(i2));
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                }
                if (message.what == 2) {
                    Throwable th = (Throwable) message.obj;
                    List list3 = ((C209039Ml) this.A01).A06.A00;
                    int size2 = list3.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        list3.get(i4);
                        if (th != null) {
                            str = th.getLocalizedMessage();
                        } else {
                            str = "";
                        }
                        C0K8.A0C("CameraZoomController", AbstractC13670mt.A06("onZoomError(): %s", str));
                    }
                    return true;
                }
                return false;
        }
    }
}
