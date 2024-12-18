package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vl5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69297Vl5 {
    public C80113i0 A00;
    public final Context A01;
    public final InterfaceC65702y7 A02 = new Object();
    public final C75563aN A03;
    public final C85793s8 A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2y7, java.lang.Object] */
    public C69297Vl5(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC75453aC interfaceC75453aC, C57332k8 c57332k8) {
        this.A01 = context;
        this.A03 = new C75563aN(userSession, interfaceC75453aC, c57332k8, true);
        this.A04 = new C85793s8(context, fragmentActivity, userSession, interfaceC75453aC, null, null, true, false);
    }
}
