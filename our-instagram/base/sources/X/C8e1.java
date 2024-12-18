package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$filter$1$2;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$map$1$2;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$map$2$2;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$map$3$2;
import com.instagram.creation.capture.quickcapture.autocreatedclips.AutoCreatedClipsViewModel$special$$inlined$map$4$2;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;
import java.util.List;

/* renamed from: X.8e1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8e1 extends C193578hc {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GT A05;
    public final UserSession A06;
    public final InspirationHubRepository A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8e1(Application application, UserSession userSession, InspirationHubRepository inspirationHubRepository) {
        super(application);
        C14360o3.A0B(inspirationHubRepository, 2);
        this.A07 = inspirationHubRepository;
        this.A06 = userSession;
        final InterfaceC19390xP A00 = AbstractC011604e.A00(C05F.A00, inspirationHubRepository.A07, 0);
        final C15430py c15430py = new C15430py(new InterfaceC19390xP(this) { // from class: X.8e6
            public final /* synthetic */ C8e1 A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = A00.collect(new AutoCreatedClipsViewModel$special$$inlined$map$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
        InterfaceC19390xP interfaceC19390xP = new InterfaceC19390xP() { // from class: X.8e7
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new AutoCreatedClipsViewModel$special$$inlined$map$2$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A05 = AbstractC58232lf.A00(anonymousClass191, interfaceC19390xP);
        final C15430py c15430py2 = new C15430py(inspirationHubRepository.A06);
        this.A04 = AbstractC58232lf.A00(anonymousClass191, new C16240rS(new InterfaceC19390xP() { // from class: X.8e8
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new AutoCreatedClipsViewModel$special$$inlined$map$3$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }));
        final InterfaceC15070pN interfaceC15070pN = inspirationHubRepository.A05;
        final InterfaceC19390xP interfaceC19390xP2 = new InterfaceC19390xP(this) { // from class: X.8e9
            public final /* synthetic */ C8e1 A00;

            {
                this.A00 = this;
            }

            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = interfaceC15070pN.collect(new AutoCreatedClipsViewModel$special$$inlined$filter$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        };
        this.A03 = AbstractC58232lf.A00(anonymousClass191, new C16240rS(new InterfaceC19390xP() { // from class: X.8eA
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new AutoCreatedClipsViewModel$special$$inlined$map$4$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        }));
        this.A01 = true;
        this.A02 = true;
        this.A00 = "";
    }

    public final void A0E(InterfaceC25172BBs interfaceC25172BBs, List list) {
        if (this.A02 && list != null && !list.isEmpty()) {
            this.A02 = false;
            C141796aw A00 = AbstractC141776au.A00(this);
            C9DH c9dh = new C9DH(this, list, interfaceC25172BBs, null, 17);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dh, A00);
        }
    }
}
