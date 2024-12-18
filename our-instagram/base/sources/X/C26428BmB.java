package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BmB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26428BmB extends AbstractC51572Yf {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC16820sZ A02;
    public final C51722Yv A03;
    public final EnumC79303gb A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        UserSession userSession = this.A01;
        C86763to c86763to = (C86763to) AbstractC77183d4.A00(c76223bS, new C50158MDl(this, 10), new Object[]{userSession});
        Object A00 = AbstractC77183d4.A00(c76223bS, new C50158MDl(this, 9), new Object[]{userSession, this.A00});
        if (c86763to.A00(AbstractC77363dM.A00(c76223bS), this.A04, false).A01 == null) {
            return null;
        }
        Drawable A0E = AbstractC77623dm.A0E(c76223bS, R.drawable.play_button);
        C51722Yv c51722Yv = this.A03;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        C75933ay c75933ay = C51722Yv.A02;
        AbstractC25228BEl.A1I(A0E, scaleType, A12, AbstractC25233BEq.A0d(null, new C50364MLq(44, A00, A12, this)));
        return AbstractC76963ci.A0I(A12, c76223bS, c51722Yv);
    }

    public C26428BmB(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC79303gb enumC79303gb, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC167027dH.A13(userSession, interfaceC11380iw, enumC79303gb);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A04 = enumC79303gb;
        this.A02 = interfaceC16820sZ;
        this.A03 = c51722Yv;
    }
}
