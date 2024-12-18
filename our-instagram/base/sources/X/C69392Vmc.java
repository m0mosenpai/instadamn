package X;

import android.content.Context;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Vmc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69392Vmc {
    public final Handler A00;
    public final UserSession A01;
    public final C3A9 A02;
    public final List A03;
    public final Context A04;
    public final RecyclerView A05;
    public final C64312vq A06;

    public C69392Vmc(Context context, RecyclerView recyclerView, UserSession userSession, C64312vq c64312vq, List list) {
        C14360o3.A0B(recyclerView, 3);
        this.A01 = userSession;
        this.A04 = context;
        this.A05 = recyclerView;
        this.A06 = c64312vq;
        this.A03 = list;
        this.A00 = new Handler(context.getMainLooper());
        this.A02 = new C3A9(new C65927TwY(this, 4), new C65926TwX(recyclerView), Arrays.asList(new V86(recyclerView, c64312vq, list)));
    }
}
