package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.7tD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC176557tD implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C176347sr A01;

    public RunnableC176557tD(View view, C176347sr c176347sr) {
        this.A01 = c176347sr;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            it.next();
            View view = this.A00;
            if ((view.getContext() instanceof Activity) && view.getId() != -1) {
                try {
                    view.getResources().getResourceName(view.getId());
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
    }
}
