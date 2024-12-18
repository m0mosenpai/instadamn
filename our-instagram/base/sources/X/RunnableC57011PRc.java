package X;

import com.instagram.tagging.widget.TagsLayout;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.PRc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57011PRc implements Runnable {
    public final /* synthetic */ TagsLayout A00;
    public final /* synthetic */ List A01;

    public RunnableC57011PRc(TagsLayout tagsLayout, List list) {
        this.A00 = tagsLayout;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            this.A00.A05((AbstractC50789Mc6) it.next());
        }
        this.A00.requestLayout();
    }
}
