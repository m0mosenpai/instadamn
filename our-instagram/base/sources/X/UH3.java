package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class UH3 extends AbstractC70653Fc {
    public final C6FG A00;
    public final C102884kP A01;

    public UH3(C6FG c6fg, C102884kP c102884kP) {
        this.A01 = c102884kP;
        this.A00 = c6fg;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        List unmodifiableList;
        Rect rect2;
        AbstractC167027dH.A12(rect, view, recyclerView);
        int A02 = RecyclerView.A02(view);
        Object A06 = AnonymousClass634.A06(this.A00, this.A01);
        A06.getClass();
        List list = ((U4G) A06).A08;
        if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (rect2 = (Rect) AbstractC001800i.A0O(unmodifiableList, A02)) != null) {
            rect.set(rect2);
        }
    }
}
