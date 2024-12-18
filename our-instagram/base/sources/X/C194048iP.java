package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8iP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194048iP {
    public final Context A00;
    public final C66362zD A01;
    public final UserSession A02;
    public final C194008iL A03;
    public final C194018iM A04;
    public final C194028iN A05;
    public final C194038iO A06;
    public final List A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4F4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.4F4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.4F4, java.lang.Object] */
    public C194048iP(Context context, UserSession userSession, C194008iL c194008iL, C194018iM c194018iM, C194028iN c194028iN, C194038iO c194038iO) {
        this.A00 = context;
        this.A03 = c194008iL;
        this.A04 = c194018iM;
        this.A05 = c194028iN;
        this.A06 = c194038iO;
        this.A02 = userSession;
        List A1Q = AbstractC16960so.A1Q(new Object(), new C194068iR(null), new Object(), new Object());
        this.A07 = A1Q;
        C66392zG A00 = C66362zD.A00(this.A00);
        A00.A01(new C194098iU(this.A03));
        A00.A01(new C194108iV(this.A04));
        A00.A01(new C194118iW(this.A05));
        A00.A01(new C194128iX(this.A02, this.A06));
        C66362zD A002 = A00.A00();
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(A1Q);
        A002.A05(viewModelListUpdate);
        this.A01 = A002;
    }
}
