package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.NJs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52474NJs extends OX6 {
    public final UserSession A00;
    public final C52457NJb A01;
    public final InterfaceC09390do A02;
    public final InterfaceC19390xP A03;
    public final C05A A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52474NJs(UserSession userSession, C52457NJb c52457NJb) {
        super(c52457NJb);
        C14360o3.A0B(userSession, 2);
        this.A01 = c52457NJb;
        this.A00 = userSession;
        this.A02 = C1XM.A00(C57359PdJ.A00);
        C008002u A1H = AbstractC25225BEi.A1H(new MWT((NewFundraiserInfo) null, (ExistingStandaloneFundraiserForFeedModel) null, (String) null, (List) null, (List) null, (DefaultConstructorMarker) null, 31, 3));
        this.A04 = A1H;
        this.A03 = A1H;
    }
}
