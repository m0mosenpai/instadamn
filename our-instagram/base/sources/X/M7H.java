package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class M7H implements Runnable {
    public final /* synthetic */ C3OO A00;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C7L9 A03;
    public final /* synthetic */ InterfaceC163837Ux A04;
    public final /* synthetic */ C83693oE A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ C09530e4 A08;

    public M7H(C3OO c3oo, RecyclerView recyclerView, UserSession userSession, C7L9 c7l9, InterfaceC163837Ux interfaceC163837Ux, C83693oE c83693oE, Integer num, List list, C09530e4 c09530e4) {
        this.A03 = c7l9;
        this.A00 = c3oo;
        this.A02 = userSession;
        this.A05 = c83693oE;
        this.A04 = interfaceC163837Ux;
        this.A08 = c09530e4;
        this.A01 = recyclerView;
        this.A07 = list;
        this.A06 = num;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0oO, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ?? obj = new Object();
        C7L9 c7l9 = this.A03;
        InterfaceC161697Me interfaceC161697Me = (InterfaceC161697Me) this.A00;
        C14360o3.A0B(interfaceC161697Me, 0);
        if (interfaceC161697Me.AG9()) {
            c7l9.A05 = interfaceC161697Me;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, interfaceC161697Me.C4c() - 1.0f);
        RecyclerView recyclerView = this.A01;
        UserSession userSession = this.A02;
        C83693oE c83693oE = this.A05;
        List list = this.A07;
        Integer num = this.A06;
        ofFloat.setDuration(750L);
        ofFloat.setRepeatCount(1);
        ofFloat.setRepeatMode(2);
        ofFloat.addListener(new C47999LLr(ofFloat, recyclerView, userSession, c7l9, c83693oE, obj));
        ofFloat.addUpdateListener(new LM6(0, c7l9, num, list, recyclerView));
        ofFloat.start();
        if (c83693oE != null) {
            str = c83693oE.A00;
        } else {
            str = null;
        }
        InterfaceC163837Ux interfaceC163837Ux = this.A04;
        AbstractC147806l5.A00(userSession).A0W("comments_swipe_nudge_rendered", "impression", "comments_swipe_nudge", "thread_view", str, interfaceC163837Ux.C7q(), AbstractC167007dF.A0n("message_id", ((C83403nh) this.A08.A01).A0i()), interfaceC163837Ux.AdZ());
    }
}
