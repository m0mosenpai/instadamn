package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.6l7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC147826l7 {
    public static final C147836l8 A0K = new Object();
    public IgLiveCobroadcastRepository A00;
    public final UserSession A01;
    public final EnumC142806cg A02;
    public final C147856lA A03;
    public final IgLiveHeartbeatManager A04;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C9EK(this, 28));
    public final InterfaceC09390do A0H = AbstractC09440dt.A01(new C9EK(this, 29));

    public final IgLiveCobroadcastRepository A00(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        IgLiveCobroadcastRepository igLiveCobroadcastRepository = this.A00;
        if (igLiveCobroadcastRepository == null) {
            IgLiveCobroadcastRepository igLiveCobroadcastRepository2 = new IgLiveCobroadcastRepository(userSession, new C54572O8y(userSession), new OB5(userSession, context));
            this.A00 = igLiveCobroadcastRepository2;
            return igLiveCobroadcastRepository2;
        }
        return igLiveCobroadcastRepository;
    }

    public final IgLiveBroadcastInfoManager A01() {
        return (IgLiveBroadcastInfoManager) this.A0H.getValue();
    }

    public final OLC A02() {
        return (OLC) this.A0I.getValue();
    }

    public final MTU A03() {
        return (MTU) this.A0J.getValue();
    }

    public AbstractC147826l7(UserSession userSession, EnumC142806cg enumC142806cg) {
        this.A01 = userSession;
        this.A02 = enumC142806cg;
        this.A03 = new C147856lA(enumC142806cg);
        C17050sx A01 = AbstractC09440dt.A01(new C9EK(this, 31));
        this.A08 = A01;
        this.A04 = (IgLiveHeartbeatManager) A01.getValue();
        this.A0I = AbstractC09440dt.A01(new C9EK(this, 33));
        this.A07 = AbstractC09440dt.A01(C143126dC.A00);
        this.A0J = AbstractC09440dt.A01(C147876lG.A00);
        this.A06 = AbstractC09440dt.A01(new C9EK(this, 30));
        this.A09 = AbstractC09440dt.A01(new C9EK(this, 32));
        this.A0E = AbstractC09440dt.A01(new C9EK(this, 38));
        this.A0G = AbstractC09440dt.A01(new C9EK(this, 40));
        this.A0A = AbstractC09440dt.A01(new C9EK(this, 34));
        this.A0D = AbstractC09440dt.A01(new C9EK(this, 37));
        this.A0C = AbstractC09440dt.A01(new C9EK(this, 36));
        this.A0B = AbstractC09440dt.A01(new C9EK(this, 35));
        this.A0F = AbstractC09440dt.A01(new C9EK(this, 39));
    }
}
