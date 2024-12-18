package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.7L4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7L4 {
    public final WeakReference A00;
    public final UserSession A01;

    public C7L4(RecyclerView recyclerView, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new WeakReference(recyclerView);
    }
}
