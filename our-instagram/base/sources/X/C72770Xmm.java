package X;

import android.content.Context;
import android.os.Looper;
import java.util.Map;

/* renamed from: X.Xmm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72770Xmm {
    public final C72496Xf9 A00;
    public final C47930LEz A01;
    public final Map A02;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.Xf9] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.YMB, java.lang.Object] */
    public C72770Xmm(Context context) {
        ?? obj = new Object();
        C72052XLt c72052XLt = new C72052XLt(context, 1);
        C72052XLt c72052XLt2 = new C72052XLt(context, 3);
        C72052XLt c72052XLt3 = new C72052XLt(context, 0);
        C73442YDl c73442YDl = new C73442YDl(0);
        C72052XLt c72052XLt4 = new C72052XLt(context, 2);
        C58605PyY c58605PyY = new C58605PyY(0);
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        Y8T y8t = new Y8T(context, myLooper, Y1h.A01, YQ7.A00, new Object(), Y1R.A02, c58605PyY, c72052XLt4, c73442YDl, c72052XLt2, c72052XLt, c72052XLt3);
        obj.A00 = y8t;
        y8t.A0T.A03(new Y8S(obj));
        this.A00 = obj;
        this.A02 = AbstractC166987dD.A1I();
        C47930LEz c47930LEz = C47930LEz.A08;
        if (c47930LEz == null) {
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            c47930LEz = new C47930LEz(applicationContext);
            C47930LEz.A08 = c47930LEz;
        }
        this.A01 = c47930LEz;
        obj.A01 = this;
    }
}
