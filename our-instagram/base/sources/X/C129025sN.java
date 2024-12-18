package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.5sN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129025sN {
    public float A00;
    public C81343k4 A01;
    public final UserSession A02;
    public final C75113Zb A03;
    public final C33P A04;
    public final C54766OIb A05;
    public final C124085jN A06;
    public final C64032vO A07;
    public final C147316kH A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final C19L A0C;

    public C129025sN(UserSession userSession, C75113Zb c75113Zb, C33P c33p, C54766OIb c54766OIb, C124085jN c124085jN, C64032vO c64032vO) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c64032vO, 4);
        C14360o3.A0B(c124085jN, 5);
        this.A02 = userSession;
        this.A03 = c75113Zb;
        this.A04 = c33p;
        this.A07 = c64032vO;
        this.A06 = c124085jN;
        this.A05 = c54766OIb;
        this.A09 = new LinkedHashMap();
        this.A0A = new LinkedHashMap();
        this.A0B = new LinkedHashMap();
        this.A08 = new C147316kH(userSession, C3G2.A1G, new C29403Cxa(this));
        this.A0C = AnonymousClass194.A02(C12L.A00.A04);
    }

    public static final Object A00(InterfaceC11380iw interfaceC11380iw, C75113Zb c75113Zb, Reel reel, C41181vS c41181vS, C3G4 c3g4, C81343k4 c81343k4, C129025sN c129025sN, C4QP c4qp, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        C24891Jo c24891Jo;
        long j;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            c129025sN.A00 = 0.0f;
            boolean A6d = c38321qM.A6d(c129025sN.A02);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
            if (A6d) {
                c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
                c24891Jo.A0I();
                String id = c38321qM.getId();
                if (id == null) {
                    c24891Jo.AGJ(null);
                } else {
                    IgImageView igImageView = c81343k4.A01;
                    ExtendedImageUrl A1o = c38321qM.A1o(igImageView.getWidth());
                    if (A1o != null) {
                        igImageView.setVisibility(0);
                        igImageView.setUrl(A1o, interfaceC11380iw);
                    }
                    C33P c33p = c129025sN.A04;
                    c33p.A0B(c38321qM, new C29299Cvu(reel, c41181vS, c129025sN));
                    c33p.A0K.put(id, new C5RV(c81343k4, c129025sN));
                    c33p.A0J.put(id, new C27893CRe(c129025sN, id, c24891Jo));
                    c33p.A0A(c38321qM, c81343k4, c75113Zb, c4qp, z, true);
                }
            } else {
                c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
                c24891Jo.A0I();
                C147316kH c147316kH = c129025sN.A08;
                c147316kH.A02();
                IgImageView igImageView2 = c81343k4.A01;
                ExtendedImageUrl A1o2 = c38321qM.A1o(igImageView2.getWidth());
                if (A1o2 != null) {
                    igImageView2.setVisibility(0);
                    igImageView2.setUrl(A1o2, interfaceC11380iw);
                }
                if (c3g4.A03.A0g != null) {
                    j = TimeUnit.SECONDS.toMillis(r0.intValue());
                } else {
                    j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                }
                c129025sN.A0A.put(c41181vS, new C57750Pjd(11, c129025sN, c81343k4));
                c129025sN.A0B.put(c41181vS, new C29900DGo(48, c41181vS, c129025sN, c3g4));
                c129025sN.A09.put(c41181vS, new C29900DGo(49, c24891Jo, c129025sN, c41181vS));
                c147316kH.A04(c41181vS, j);
            }
            Object A0E = c24891Jo.A0E();
            C1JX c1jx = C1JX.A02;
            if (A0E != c1jx) {
                A0E = C0eB.A00;
            }
            if (A0E == c1jx) {
                return A0E;
            }
        }
        return C0eB.A00;
    }
}
