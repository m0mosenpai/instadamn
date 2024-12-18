package X;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.2MJ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2MJ {
    public Object A00;
    public final Context A01;
    public final Object A02;
    public final LinkedHashSet A03;
    public final C2LC A04;

    public abstract Object A00();

    public abstract void A01();

    public abstract void A02();

    public final void A03(Object obj) {
        synchronized (this.A02) {
            Object obj2 = this.A00;
            if (obj2 == null || !obj2.equals(obj)) {
                this.A00 = obj;
                final List A0a = AbstractC001800i.A0a(this.A03);
                ((C2LB) this.A04).A02.execute(new Runnable(this) { // from class: X.Atk
                    public final /* synthetic */ C2MJ A00;

                    {
                        this.A00 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        List list = A0a;
                        C2MJ c2mj = this.A00;
                        C14360o3.A0B(list, 0);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((C50W) it.next()).D7J(c2mj.A00);
                        }
                    }
                });
            }
        }
    }

    public C2MJ(Context context, C2LC c2lc) {
        this.A04 = c2lc;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A07(applicationContext);
        this.A01 = applicationContext;
        this.A02 = new Object();
        this.A03 = new LinkedHashSet();
    }
}
