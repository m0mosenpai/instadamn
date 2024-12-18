package X;

import android.app.Activity;
import android.widget.TextView;
import java.util.LinkedList;

/* loaded from: classes10.dex */
public final class SM7 {
    public static SM7 A03;
    public static boolean A04;
    public TextView A00;
    public LinkedList A02 = AbstractC58318PtA.A11();
    public StringBuilder A01 = AbstractC166987dD.A1C();

    public final void A00(String str) {
        if (A04 && this.A00 != null) {
            int i = 0;
            for (String str2 : AnonymousClass001.A0R(str, "\n").split("\n")) {
                this.A02.add(str2);
            }
            StringBuilder sb = this.A01;
            sb.setLength(0);
            while (true) {
                LinkedList linkedList = this.A02;
                if (i < linkedList.size()) {
                    sb.append((String) linkedList.get(i));
                    sb.append("\n");
                    i++;
                } else {
                    ((Activity) this.A00.getContext()).runOnUiThread(new TNO(this, sb.toString()));
                    return;
                }
            }
        }
    }
}
