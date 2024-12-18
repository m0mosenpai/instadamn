package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes9.dex */
public final class N8d extends EPU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8d(C012804r c012804r, Integer num, Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(c012804r, num, str, i);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        if (this.A00 != 0) {
            C14360o3.A0B(view, 0);
            C130135uJ c130135uJ = (C130135uJ) this.A01;
            String A19 = AbstractC166987dD.A19(c130135uJ.A02);
            C50808McV c50808McV = (C50808McV) this.A03;
            if (c130135uJ.A00) {
                str = c130135uJ.A04;
            } else {
                MSX.A11(view);
                C131975xX c131975xX = C131965xW.A05;
                C131975xX.A00(c50808McV.A0J);
                str = null;
            }
            UserSession userSession = c50808McV.A0J;
            String str2 = c50808McV.A0N;
            AbstractC130145uK.A02(userSession, "default_privacy_instruction_view_click", A19, str, str2, c130135uJ.A01.toString(), false, C196218mC.A00(userSession), c130135uJ.A05);
            c50808McV.A05(c130135uJ, (IgdsSwitch) this.A02, str, str2, false);
            return;
        }
        UserSession userSession2 = (UserSession) this.A02;
        C130135uJ c130135uJ2 = (C130135uJ) this.A01;
        boolean z = c130135uJ2.A00;
        String valueOf = String.valueOf(c130135uJ2.A02);
        NMX nmx = (NMX) this.A03;
        nmx.requireContext();
        C131975xX c131975xX2 = C131965xW.A05;
        C131975xX.A00(userSession2);
        AbstractC130145uK.A02(userSession2, "default_privacy_instruction_view_click", valueOf, null, "video_feed", String.valueOf(c130135uJ2.A01), z, C196218mC.A00(userSession2), c130135uJ2.A05);
        NMX.A05(c130135uJ2, nmx, false);
    }
}
