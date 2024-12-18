package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.BNt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25454BNt extends AbstractC51572Yf {
    public final float A00;
    public final UserSession A01;
    public final C75113Zb A02;
    public final InterfaceC31159Dn3 A03;
    public final BL9 A04;
    public final InterfaceC31046Dkk A05;
    public final InterfaceC16660sJ A06;
    public final long A07;
    public final long A08;
    public final InterfaceC60442pS A09;

    public C25454BNt(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC31159Dn3 interfaceC31159Dn3, BL9 bl9, InterfaceC31046Dkk interfaceC31046Dkk, InterfaceC16660sJ interfaceC16660sJ, float f, long j, long j2) {
        AbstractC167027dH.A0a(1, bl9, interfaceC31046Dkk, userSession, interfaceC60442pS);
        AbstractC25229BEm.A1J(interfaceC31159Dn3, 6, interfaceC16660sJ);
        this.A04 = bl9;
        this.A05 = interfaceC31046Dkk;
        this.A01 = userSession;
        this.A09 = interfaceC60442pS;
        this.A02 = c75113Zb;
        this.A03 = interfaceC31159Dn3;
        this.A07 = j;
        this.A08 = j2;
        this.A00 = f;
        this.A06 = interfaceC16660sJ;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        float f = this.A00;
        Float valueOf = Float.valueOf((f + 1.0f) * 1.0f);
        C2XI A00 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A002 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A0j = AbstractC25228BEl.A0j(c76223bS, 1.0f);
        long j = this.A07;
        long A01 = C2Z3.A01(1.0f / 2.0f, C2Z3.A01(f, j));
        Object A003 = AbstractC77183d4.A00(c76223bS, new C29709D8c(1, A00, A0j, A002, this), new Object[0]);
        Object A004 = AbstractC77183d4.A00(c76223bS, new C29709D8c(2, A00, A0j, A002, this), new Object[0]);
        AbstractC77313dH.A00(c76223bS, new D8P(1, A004, this, A003), AbstractC25230BEn.A1a());
        Drawable A0N = AbstractC25228BEl.A0N(c76223bS, R.drawable.instagram_heart_filled_44);
        AbstractC25233BEq.A10(A0N, c76223bS, AbstractC53242c7.A0H(c76223bS.A05.A0C, R.attr.igds_color_icon_badge));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, A0N);
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, A0N);
        stateListDrawable.addState(new int[0], AbstractC77623dm.A0E(c76223bS, R.drawable.instagram_heart_outline_44));
        C75933ay c75933ay = C51722Yv.A02;
        long A012 = C2Z3.A01(1.0f - f, j);
        Integer num = C05F.A00;
        C51722Yv A0L = AbstractC25234BEr.A0L(null, num, 0, A012);
        long j2 = this.A08;
        C51722Yv A14 = AbstractC25232BEp.A14(A0L, 0, A01);
        Integer num2 = C05F.A08;
        C51722Yv A0E = AbstractC25234BEr.A0E(C9CU.A00(A14, num2, 0, A01), AbstractC25227BEk.A0Z(0, A01), 0, j2);
        Integer num3 = C05F.A1F;
        C51722Yv A0A = AbstractC25234BEr.A0A(A002, A0E, new C9CV(A00, num3));
        BL9 bl9 = this.A04;
        C51722Yv A005 = C9CV.A00(C9CV.A00(AbstractC25233BEq.A0W(AbstractC25234BEr.A0H(C9CV.A00(A0A, C05F.A06, Boolean.valueOf(bl9.A04), 4), new C9CV(A0j, num), num), c76223bS, 2131965099), num2, "like_button", 4), C05F.A0B, Integer.valueOf(R.id.like_button), 4);
        C120985dq c120985dq = bl9.A00;
        InterfaceC60442pS interfaceC60442pS = this.A09;
        return new BNU(stateListDrawable, ImageView.ScaleType.FIT_CENTER, C9CV.A00(AbstractC25396BLn.A00(EnumC71343Hv.A0L, A005, null, c120985dq, this.A01, interfaceC60442pS, null, true, false), num3, DRP.A00(this, 39), 4), false);
    }
}
