package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes8.dex */
public final class L92 {
    public final AnonymousClass841 A00;
    public final C49519LuY A01;
    public final InterfaceC58167PqX A02;
    public final C47Z A03;
    public final String A04;
    public final InterfaceC09390do A05;

    public L92(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, AnonymousClass841 anonymousClass841, InterfaceC58167PqX interfaceC58167PqX, C47Z c47z, String str) {
        InterfaceC189598ae interfaceC189598ae;
        AbstractC43594JPz.A1P(userSession, str);
        C14360o3.A0B(c47z, 6);
        this.A04 = str;
        this.A02 = interfaceC58167PqX;
        this.A03 = c47z;
        this.A00 = anonymousClass841;
        String str2 = AbstractC50666MYj.A00(userSession).A02;
        str2 = str2 == null ? "" : str2;
        C57744PjX c57744PjX = new C57744PjX(this, 34);
        C1UC requireActivity = abstractC59962oe.requireActivity();
        if (requireActivity instanceof InterfaceC189598ae) {
            interfaceC189598ae = (InterfaceC189598ae) requireActivity;
        } else {
            interfaceC189598ae = null;
        }
        this.A01 = new C49519LuY(context, null, abstractC59962oe, userSession, anonymousClass841, c47z, interfaceC189598ae, str2, c57744PjX, R.drawable.instagram_music_pano_outline_24);
        this.A05 = AbstractC09440dt.A01(new ME7(39, context, this, abstractC59962oe, userSession));
    }

    public final void A00(JIN jin) {
        C49519LuY c49519LuY = this.A01;
        EnumC203578zI enumC203578zI = EnumC203578zI.POST_CAPTURE_AUDIO_BAR;
        c49519LuY.A01 = enumC203578zI;
        c49519LuY.A07.A0H = enumC203578zI;
        InterfaceC58167PqX interfaceC58167PqX = this.A02;
        interfaceC58167PqX.Dly(c49519LuY);
        c49519LuY.A03(jin);
        c49519LuY.onResume();
        interfaceC58167PqX.CqL();
    }

    public final void A01(Map map) {
        ((C48640LfI) this.A05.getValue()).Eo2(null, EnumC203578zI.POST_CAPTURE_AUDIO_BAR, null, C05F.A1I, null, map);
    }
}
