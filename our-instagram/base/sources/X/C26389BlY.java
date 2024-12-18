package X;

import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.BlY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26389BlY extends AbstractC51572Yf {
    public final UserSession A00;
    public final C41F A01;
    public final C75113Zb A02;
    public final C51722Yv A03;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv c51722Yv;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, new J7K(this, 41));
        C75113Zb c75113Zb = this.A02;
        AbstractC77313dH.A00(c76223bS, new C50171MDy(49, A00, this), new Object[]{c75113Zb});
        Object A002 = AbstractC77183d4.A00(c76223bS, new J7K(c76223bS, 40), AbstractC25225BEi.A1b());
        Object obj = A00.A03;
        AbstractC89903zW.A01(c76223bS, new DRQ(A00, 22), new Object[]{obj});
        C77123cy A003 = AbstractC77063cs.A00(c76223bS, DCC.A00);
        C51722Yv c51722Yv2 = this.A03;
        C2WF c2wf = null;
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        C51753Mtc c51753Mtc = (C51753Mtc) obj;
        int A0H = AbstractC166987dD.A0H(c51753Mtc.A02);
        if (A0H != 0) {
            if (A0H != 1) {
                throw B4Z.A00();
            }
        } else {
            C51722Yv c51722Yv3 = C51722Yv.A02;
            if (c75113Zb.A22) {
                c51722Yv = AbstractC25230BEn.A0e(AbstractC25225BEi.A0h(null, new C77863eE(C05F.A00, new C50268MHx(21, A00, A003), null)), C05F.A01, new DRQ(A003, 23), null);
            } else {
                c51722Yv = c51722Yv3;
            }
            C51722Yv A004 = c51722Yv3.A00(c51722Yv);
            C2XE c2xe = A0P.A00;
            C76933cf c76933cf = new C76933cf(c2xe, EnumC76913cd.LOCAL, "carousel_page_indicator");
            if (A004 == c51722Yv3) {
                A004 = null;
            }
            C51722Yv A0R = AbstractC25233BEq.A0R(C9CV.A00(C9CV.A00(AbstractC25225BEi.A0h(A004, c76933cf), C05F.A00, A002, 4), C05F.A0j, 4, 0), AbstractC25227BEk.A0Y(0, AbstractC77623dm.A0D(A0P, R.dimen.album_music_sticker_text_vertical_padding)), 0, AbstractC77623dm.A0D(A0P, R.dimen.media_tag_indicator_padding));
            C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe);
            int i = c51753Mtc.A01;
            C41F c41f = this.A01;
            boolean z = c41f.A06;
            boolean z2 = c41f.A05;
            int i2 = c41f.A00;
            int i3 = c41f.A03;
            if (!AbstractC85053qt.A01(this.A00, i2, i3, z, z2)) {
                i3 = c41f.A01;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) StringFormatUtil.formatStrLocaleSafe("%d/%d", Integer.valueOf(i + 1), Integer.valueOf(i3)));
            spannableStringBuilder.setSpan(new CharacterStyle(), 0, spannableStringBuilder.length(), 33);
            c2wf = AbstractC25227BEk.A0V(new C78003eS(null, null, AbstractC25233BEq.A0N(EnumC77673dr.A08, C9CV.A00(null, C05F.A0B, Integer.valueOf(R.id.carousel_index_indicator_text_view), 4)), AbstractC25225BEi.A0p(AbstractC77623dm.A09(A0P2)), C78003eS.A0C, null, spannableStringBuilder, null, Integer.valueOf(AbstractC77623dm.A02(A0P2, R.attr.igds_color_primary_text_on_media)), 1, null, null), A0P2, A0P, A0R);
        }
        return AbstractC25227BEk.A0W(c2wf, A0P, c76223bS, c51722Yv2);
    }

    public C26389BlY(C51722Yv c51722Yv, UserSession userSession, C41F c41f, C75113Zb c75113Zb) {
        AbstractC167027dH.A13(userSession, c75113Zb, c41f);
        this.A00 = userSession;
        this.A02 = c75113Zb;
        this.A01 = c41f;
        this.A03 = c51722Yv;
    }
}
