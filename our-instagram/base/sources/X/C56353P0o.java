package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56353P0o implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public C5SW A01;
    public final EnumC53368NjJ A02;
    public final C81X A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final C50699MZu A06;
    public final NKB A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        boolean z;
        InterfaceC19630xq interfaceC19630xq;
        int i;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i2;
        String str;
        AbstractC59962oe abstractC59962oe = this.A04;
        Context requireContext = abstractC59962oe.requireContext();
        ViewOnClickListenerC55466OkL A01 = ViewOnClickListenerC55466OkL.A01(this, 21);
        Integer valueOf = Integer.valueOf(R.drawable.instagram_product_details_add_pano_outline_24);
        C50821Mcw c50821Mcw = new C50821Mcw(requireContext);
        c50821Mcw.setTitle(requireContext.getResources().getString(2131973274));
        c50821Mcw.setInlineSubtitle("");
        C0fQ.A00(A01, c50821Mcw);
        c50821Mcw.setIcon(MSX.A07(requireContext, valueOf));
        AbstractC50522MSa.A0z(c50821Mcw);
        this.A00 = c50821Mcw;
        int A03 = AbstractC167017dG.A03(abstractC59962oe.requireContext());
        C5SU A0f = AbstractC167017dG.A0f(abstractC59962oe.requireActivity(), AbstractC166997dE.A0N(abstractC59962oe).getString(2131973276));
        C50821Mcw c50821Mcw2 = this.A00;
        if (c50821Mcw2 != null) {
            A0f.A03(c50821Mcw2);
            C50821Mcw c50821Mcw3 = this.A00;
            if (c50821Mcw3 != null) {
                int width = c50821Mcw3.getWidth() / 2;
                C50821Mcw c50821Mcw4 = this.A00;
                if (c50821Mcw4 != null) {
                    int height = c50821Mcw4.getHeight() - A03;
                    C50821Mcw c50821Mcw5 = this.A00;
                    if (c50821Mcw5 != null) {
                        A0f.A04(c50821Mcw5, width, height, true);
                        A0f.A02();
                        A0f.A0A = true;
                        this.A01 = A0f.A00();
                        NKB nkb = this.A07;
                        EnumC53368NjJ enumC53368NjJ = this.A02;
                        C14360o3.A0B(enumC53368NjJ, 0);
                        C23031Ai A00 = AbstractC23021Ah.A00(nkb.A02);
                        if (enumC53368NjJ == EnumC53368NjJ.BIO_IG_REELS) {
                            z = true;
                            interfaceC19630xq = A00.A01;
                            i = interfaceC19630xq.getInt("reel_sell_product_row_new_badge_seen_count", 0);
                            interfaceC16530ry = A00.A7A;
                            c0yrArr = C23031Ai.A8c;
                            i2 = 412;
                        } else {
                            z = false;
                            interfaceC19630xq = A00.A01;
                            i = interfaceC19630xq.getInt("sell_product_row_new_badge_seen_count", 0);
                            interfaceC16530ry = A00.A7h;
                            c0yrArr = C23031Ai.A8c;
                            i2 = 411;
                        }
                        if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, i2) && i < 3) {
                            if (z) {
                                str = "reel_sell_product_row_new_badge_seen_count";
                            } else {
                                str = "sell_product_row_new_badge_seen_count";
                            }
                            AbstractC50522MSa.A1T(interfaceC19630xq, str, 0);
                            PZT.A03(nkb, nkb.A04, 39);
                        }
                        InterfaceC02590Ai A012 = C50699MZu.A01(enumC53368NjJ, this.A06);
                        AbstractC31171DnF.A1B(A012, "seller_view_add_purchase_button");
                        A012.Cht();
                        C50821Mcw c50821Mcw6 = this.A00;
                        if (c50821Mcw6 != null) {
                            return c50821Mcw6;
                        }
                    }
                }
            }
        }
        C14360o3.A0F("bioRow");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A03;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A04;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 26), C07Y.A00(viewLifecycleOwner));
        AbstractC50522MSa.A14(abstractC59962oe, PZV.A02(this, null, 32), this.A07.A07);
    }

    public C56353P0o(EnumC53368NjJ enumC53368NjJ, AbstractC59962oe abstractC59962oe, UserSession userSession, NKB nkb) {
        AbstractC167027dH.A13(abstractC59962oe, userSession, nkb);
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
        this.A07 = nkb;
        this.A02 = enumC53368NjJ;
        this.A06 = AbstractC50666MYj.A00(userSession);
        this.A03 = C81X.A0T;
    }
}
