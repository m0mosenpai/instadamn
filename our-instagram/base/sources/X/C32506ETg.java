package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;

/* renamed from: X.ETg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32506ETg extends C1P1 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ChannelChallengeShareInfo A04;
    public final /* synthetic */ EnumC33425Epw A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public C32506ETg(Activity activity, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ChannelChallengeShareInfo channelChallengeShareInfo, EnumC33425Epw enumC33425Epw, String str, String str2, String str3) {
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = enumC33425Epw;
        this.A00 = activity;
        this.A04 = channelChallengeShareInfo;
        this.A08 = str3;
        this.A01 = view;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(2018822019);
        UserSession userSession = this.A03;
        String str = this.A06;
        String str2 = this.A07;
        EnumC33425Epw enumC33425Epw = this.A05;
        AbstractC73317Y7a.A0H(this.A02, userSession, str, str2, enumC33425Epw.A05, abstractC115105If.A01());
        C0f9.A0A(-2067679185, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        String optionalStringField;
        int A03 = C0f9.A03(-2070572189);
        int A032 = C0f9.A03(959406120);
        Object obj2 = ((AnonymousClass435) obj).A01;
        if (obj2 != null && (optionalStringField = ((C2JS) obj2).getRequiredTreeField(0, AbstractC58317Pt9.A00(1055), QjG.class, -2100137207).getOptionalStringField(0, AbstractC58317Pt9.A00(999))) != null) {
            UserSession userSession = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            String str = this.A06;
            String str2 = this.A07;
            EnumC33425Epw enumC33425Epw = this.A05;
            AbstractC73317Y7a.A0J(interfaceC11380iw, userSession, str, str2, enumC33425Epw.A05, optionalStringField);
            Activity activity = this.A00;
            String str3 = this.A08;
            View view = this.A01;
            if (enumC33425Epw == EnumC33425Epw.A0C) {
                AbstractC13900nG.A00(activity, optionalStringField);
                AbstractC34301FAv.A00(activity, view, null, true);
            } else if (enumC33425Epw == EnumC33425Epw.A0K) {
                AbstractC35101FdC.A01(activity, optionalStringField, str3);
            } else {
                AbstractC31510Dsu.A0M(activity, interfaceC11380iw, userSession, enumC33425Epw, optionalStringField);
            }
            i = -1980403369;
        } else {
            AbstractC73317Y7a.A0H(this.A02, this.A03, this.A06, this.A07, this.A05.A05, null);
            i = 1372645614;
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(-825219717, A03);
    }
}
