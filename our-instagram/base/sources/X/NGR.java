package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NGR extends AbstractRunnableC14200nk {
    public final /* synthetic */ C55006OVn A00;
    public final /* synthetic */ List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGR(C55006OVn c55006OVn, List list) {
        super(104, 3, false, false);
        this.A00 = c55006OVn;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap A1G = AbstractC166987dD.A1G();
        C55006OVn c55006OVn = this.A00;
        Iterator A13 = AbstractC166997dE.A13(c55006OVn.A04);
        while (A13.hasNext()) {
            OWX owx = (OWX) AbstractC166997dE.A0l(A13);
            if (Build.VERSION.SDK_INT >= 29) {
                UserSession userSession = c55006OVn.A01;
                Context context = c55006OVn.A00;
                String A03 = AbstractC15860qg.A03(context);
                C14360o3.A07(A03);
                ContentResolver contentResolver = context.getContentResolver();
                C14360o3.A07(contentResolver);
                owx.A01(contentResolver, userSession, A03);
            } else {
                C55006OVn.A00(c55006OVn, owx);
            }
            List list = this.A01;
            OEN oen = owx.A02;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (C14360o3.A0K(((C54791OJj) next).A03, oen)) {
                        if (next != null) {
                            A1G.put(oen, next);
                        }
                    }
                }
            }
        }
        c55006OVn.A02.DiC(A1G);
    }
}
