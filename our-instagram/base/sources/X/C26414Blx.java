package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.Map;

/* renamed from: X.Blx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26414Blx extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final InterfaceC31137Dmc A02;
    public final Map A03;

    public C26414Blx(C120985dq c120985dq, C37644Ghd c37644Ghd, InterfaceC31137Dmc interfaceC31137Dmc, Map map) {
        C14360o3.A0B(interfaceC31137Dmc, 3);
        this.A00 = c120985dq;
        this.A01 = c37644Ghd;
        this.A02 = interfaceC31137Dmc;
        this.A03 = map;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        String A39;
        C14360o3.A0B(c76223bS, 0);
        C38321qM c38321qM = this.A00.A02;
        if (c38321qM == null || (A39 = c38321qM.A39()) == null) {
            return null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        long A0L = AbstractC25230BEn.A0L();
        Integer num = C05F.A00;
        C51722Yv A00 = C9CU.A00(null, num, 0, A0L);
        Integer num2 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(C9CU.A00(A00, num2, 0, A0L), C05F.A0C, 0.0f, 1);
        Drawable A0N = AbstractC25228BEl.A0N(c76223bS, R.drawable.instagram_reply_pano_outline_24);
        AbstractC25233BEq.A10(A0N, c76223bS, R.color.audio_bar_action_color_enabled);
        C2XE c2xe = c76223bS.A05;
        C80393iU A0O = AbstractC25234BEr.A0O(A0N, c2xe, A0d);
        C51722Yv A0U = AbstractC25233BEq.A0U(null, AbstractC25227BEk.A0a(0, AbstractC25229BEm.A0J()), num2, 0);
        long A05 = AbstractC77623dm.A05(c76223bS);
        Typeface create = Typeface.create("sans-serif", 0);
        int A04 = AbstractC25236BEt.A04(c76223bS);
        String A0G = AbstractC77623dm.A0G(c76223bS, A39, 2131956220);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0G, 0);
        AbstractC25233BEq.A19(c76223bS, A0a, A04, A05);
        A0a.A0S(0);
        AbstractC25234BEr.A0n(create, c76223bS, A0a, A0D);
        AbstractC25234BEr.A1I(A0a, num, false);
        A0a.A0M(1);
        A0a.A0c(false);
        AbstractC25232BEp.A1N(A0a, false);
        return AbstractC76963ci.A0H(AbstractC25233BEq.A0I(A0O, AbstractC25227BEk.A0X(A0U, A0a), c2xe), c76223bS, AbstractC25230BEn.A0e(AbstractC25233BEq.A0d(C9CU.A00(null, C05F.A1I, 0, A0L), C30170DRa.A00(this, c38321qM, 48)), C05F.A0Y, DRV.A00(this, 36), null));
    }
}
