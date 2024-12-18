package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.JqF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44670JqF extends C3OO {
    public final C44560Jnh A00;
    public final RecyclerView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44670JqF(View view, UserSession userSession, C43996Jcj c43996Jcj) {
        super(view);
        AbstractC167017dG.A1R(userSession, c43996Jcj);
        RecyclerView recyclerView = (RecyclerView) view;
        this.A01 = recyclerView;
        C44560Jnh c44560Jnh = new C44560Jnh(userSession, c43996Jcj);
        this.A00 = c44560Jnh;
        recyclerView.setAdapter(c44560Jnh);
    }
}
