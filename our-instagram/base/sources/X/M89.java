package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M89 implements Callable {
    public final /* synthetic */ EnumC159397Cz A00;
    public final /* synthetic */ AnonymousClass442 A01;
    public final /* synthetic */ JTa A02;
    public final /* synthetic */ C7X3 A03;
    public final /* synthetic */ C7TG A04;
    public final /* synthetic */ DirectThreadKey A05;
    public final /* synthetic */ C3o9 A06;
    public final /* synthetic */ L33 A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public M89(EnumC159397Cz enumC159397Cz, AnonymousClass442 anonymousClass442, JTa jTa, C7X3 c7x3, C7TG c7tg, DirectThreadKey directThreadKey, C3o9 c3o9, L33 l33, String str, String str2, boolean z, boolean z2) {
        this.A02 = jTa;
        this.A05 = directThreadKey;
        this.A04 = c7tg;
        this.A00 = enumC159397Cz;
        this.A07 = l33;
        this.A09 = str;
        this.A06 = c3o9;
        this.A0B = z;
        this.A01 = anonymousClass442;
        this.A08 = str2;
        this.A03 = c7x3;
        this.A0A = z2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.1ae, X.1ee, X.1OW] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        JTa jTa = this.A02;
        DirectThreadKey directThreadKey = this.A05;
        C7TG c7tg = this.A04;
        Context context = c7tg.A02;
        UserSession userSession = c7tg.A03;
        EnumC159397Cz enumC159397Cz = this.A00;
        L33 l33 = this.A07;
        String str = this.A09;
        C4G2 A00 = LLY.A00(context, userSession, enumC159397Cz, directThreadKey, l33, AbstractC43593JPy.A0r(jTa.A03), str);
        C3o9 c3o9 = this.A06;
        boolean z = this.A0B;
        Long A01 = LCT.A01(userSession, c3o9);
        long A05 = AbstractC31177DnL.A05();
        AnonymousClass442 anonymousClass442 = this.A01;
        ?? abstractC29011ae = new AbstractC29011ae(jTa, directThreadKey, A01, A05);
        abstractC29011ae.A01 = A00;
        abstractC29011ae.A00 = anonymousClass442;
        String str2 = this.A08;
        if (str2 != null) {
            this.A03.A05(str2, true);
            IGFOAMessagingLocalSendSpeedLogger A002 = C7R5.A00(userSession, AbstractC43593JPy.A0r(str2));
            if (A002 != null) {
                A002.onLogDispatchSendMutationStart();
            }
        }
        C7TG.A09(c7tg, null, str, abstractC29011ae.A06(), directThreadKey.A00, 5, 1, 0L, 0L, AbstractC166987dD.A11(l33.A01).length(), z, this.A0A);
        AbstractC31173DnH.A1U(userSession, abstractC29011ae);
        C162337Ov.A0g(userSession, directThreadKey, C2EY.A1m, abstractC29011ae.A06(), abstractC29011ae.A02.A09);
        return C0eB.A00;
    }
}
