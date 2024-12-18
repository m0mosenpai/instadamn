package X;

import com.instagram.api.schemas.CreatorSegmentation;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.MutedWordsFilterManager;
import com.instagram.user.model.User;

/* renamed from: X.Jfj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44180Jfj extends AbstractC44190Jft {
    public Integer A00;
    public boolean A01;
    public final UserSession A02;

    public C44180Jfj(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        super.A01 = C1QS.A00(userSession);
        this.A02 = userSession;
        this.A00 = C05F.A00;
    }

    public final void A06(EnumC31648DvE enumC31648DvE, Integer num) {
        String str;
        CreatorSegmentation At2;
        C14360o3.A0B(enumC31648DvE, 1);
        if (super.A00 == 0) {
            UserSession userSession = this.A02;
            if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36314154646178276L)) {
                this.A00 = num;
                boolean z = false;
                this.A01 = false;
                C1QT c1qt = super.A01;
                switch (num.intValue()) {
                    case 1:
                        str = "FIRST_FETCH";
                        break;
                    case 2:
                        str = "LOAD_MORE";
                        break;
                    default:
                        str = "MANUAL_RETRY";
                        break;
                }
                super.A00 = c1qt.flowStartForMarker(70781771, AbstractC167007dF.A0h(str), true);
                User A0Y = AbstractC166997dE.A0Y(userSession);
                EnumC222416a A0I = A0Y.A0I();
                if (A0I == null) {
                    A0I = EnumC222416a.A08;
                }
                A03("account_type", A0I.A01);
                A03("folder_type", enumC31648DvE.A00);
                InterfaceC224116z Asx = A0Y.A03.Asx();
                if (Asx != null && (At2 = Asx.At2()) != null) {
                    A03("creator_segmentation", At2.toString());
                }
                AbstractC44190Jft.A00(this, new D8R(this, "is_creator", 4, C2E7.A01(A0Y)));
                AbstractC44190Jft.A00(this, new D8R(this, "is_enhanced_filtering_enabled", 4, AbstractC1337462f.A0A(userSession, true)));
                MutedWordsFilterManager A00 = AbstractC2042992d.A00(userSession);
                if (A00 != null) {
                    z = A00.A08();
                }
                AbstractC44190Jft.A00(this, new D8R(this, "hidden_words_enabled", 4, z));
            }
        }
    }

    public final void A05() {
        AbstractC44190Jft.A00(this, new ME3("render_event_interrupted", this, 49));
    }
}
