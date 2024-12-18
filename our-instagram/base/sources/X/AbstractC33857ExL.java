package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FanClubInfoDictImpl;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;
import com.instagram.user.model.User;

/* renamed from: X.ExL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33857ExL {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 1);
        UserSession A0S = AbstractC31177DnL.A0S(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C14360o3.A0C(A04, AbstractC58317Pt9.A00(7));
        if (A0F != null) {
            str = A0F.A0E();
        } else {
            str = null;
        }
        User A10 = AbstractC166987dD.A10(A0S);
        C34689FQa c34689FQa = new C34689FQa(new FanClubInfoDictImpl(null, null, null, null, null, null, null, null, null, null));
        c34689FQa.A07 = str;
        c34689FQa.A02 = true;
        A10.A03.EU8(c34689FQa.A00());
        AbstractC31172DnG.A1R(A0S, A10);
        ChannelCreationSource channelCreationSource = ChannelCreationSource.A05;
        EnumC33330EoP enumC33330EoP = EnumC33330EoP.A03;
        ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = new ChannelCreationFlowExtraArgs(null, null, null);
        C14360o3.A0B(A0S, 0);
        AbstractC35055FcS.A01(A0S, channelCreationFlowExtraArgs, channelCreationSource, enumC33330EoP, false).Cgf(A04);
        C4LM.A02.A02(A0S, new GIJ(A0S, 0), A0S.userId);
        return null;
    }
}
