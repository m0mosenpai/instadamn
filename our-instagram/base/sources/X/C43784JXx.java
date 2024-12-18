package X;

import android.os.MessageQueue;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JXx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43784JXx implements MessageQueue.IdleHandler {
    public final /* synthetic */ JR2 A00;

    public C43784JXx(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        AbstractC70663Fe abstractC70663Fe;
        RecyclerView recyclerView;
        ViewTreeObserver viewTreeObserver;
        C13080lu A00 = AbstractC13090lv.A00("DirectInboxController.globalLayoutListenerIdleTask");
        JR2 jr2 = this.A00;
        try {
            RecyclerView recyclerView2 = jr2.A0F;
            if (recyclerView2 != null && (abstractC70663Fe = recyclerView2.A0D) != null && (abstractC70663Fe instanceof LinearLayoutManager) && !((AbstractC69603Au) jr2.A0v()).A01) {
                InterfaceC09390do interfaceC09390do = jr2.A2M;
                if (((AbstractC69603Au) AbstractC43592JPx.A0f(interfaceC09390do)).A01) {
                    AbstractC43592JPx.A0f(interfaceC09390do).A0E("dispatch_global_layout_listener_on_idle");
                    if (((LinearLayoutManager) abstractC70663Fe).A1a() >= 0 && (recyclerView = jr2.A0F) != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
                        viewTreeObserver.dispatchOnGlobalLayout();
                    }
                }
            }
            A00.close();
            return false;
        } finally {
        }
    }
}
