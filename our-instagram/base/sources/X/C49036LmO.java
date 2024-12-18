package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.LmO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49036LmO implements C7S5 {
    public final /* synthetic */ C7XW A00;

    public C49036LmO(C7XW c7xw) {
        this.A00 = c7xw;
    }

    @Override // X.C7S5
    public final void CET(Rect rect) {
        C14360o3.A0B(rect, 0);
        RecyclerView recyclerView = this.A00.A00;
        if (recyclerView == null) {
            C14360o3.A0F("messageRecyclerView");
            throw C00O.createAndThrow();
        }
        rect.set(0, 0, recyclerView.getWidth(), 0);
    }
}
