package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.DzI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31850DzI extends C53432cR {
    public final Application A00;
    public final UserSession A01;
    public final ChannelCreationFlowExtraArgs A02;
    public final C142846ck A03;
    public final ChannelCreationSource A04;
    public final C36299Fzu A05;
    public final EnumC33330EoP A06;
    public final Integer A07;

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        EnumC33330EoP enumC33330EoP = this.A06;
        int ordinal = enumC33330EoP.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                UserSession userSession = this.A01;
                C142846ck c142846ck = this.A03;
                C36299Fzu c36299Fzu = this.A05;
                return new C32725Eaq(this.A00, userSession, this.A02, c142846ck, this.A04, c36299Fzu, enumC33330EoP, this.A07);
            }
            throw B4Z.A00();
        }
        return new C32724Eap(this.A00, this.A01, this.A03, this.A04, enumC33330EoP, this.A07);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31850DzI(Application application, UserSession userSession, ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs, C142846ck c142846ck, ChannelCreationSource channelCreationSource, C36299Fzu c36299Fzu, EnumC33330EoP enumC33330EoP, Integer num) {
        super(application);
        AbstractC25234BEr.A1R(userSession, c142846ck, c36299Fzu, enumC33330EoP, channelCreationSource);
        C14360o3.A0B(channelCreationFlowExtraArgs, 7);
        this.A00 = application;
        this.A01 = userSession;
        this.A03 = c142846ck;
        this.A05 = c36299Fzu;
        this.A06 = enumC33330EoP;
        this.A04 = channelCreationSource;
        this.A02 = channelCreationFlowExtraArgs;
        this.A07 = num;
    }
}
