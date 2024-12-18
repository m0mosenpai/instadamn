package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.BPg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25492BPg extends C03E implements InterfaceC16820sZ {
    public C25492BPg(Object obj) {
        super(0, obj, BKA.class, "launchSeeMorePromptsPage", "launchSeeMorePromptsPage()V", 0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        BKA bka = (BKA) this.receiver;
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(814), AbstractC166987dD.A1G());
        FragmentActivity fragmentActivity = bka.A01;
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(bka.A04);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131956194);
        igBloksScreenConfig.A0P = C05F.A01;
        A01.A04(fragmentActivity, igBloksScreenConfig);
        return C0eB.A00;
    }
}
