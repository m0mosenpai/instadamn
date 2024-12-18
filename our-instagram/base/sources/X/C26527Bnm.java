package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Bnm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26527Bnm extends AbstractC51572Yf {
    public final C26266BjZ A00;
    public final InterfaceC31152Dmw A01;
    public final String A02;
    public final boolean A03;
    public final float A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC31055Dkv A07;
    public final HashMap A08;
    public final HashMap A09;
    public final List A0A;
    public final List A0B;

    public C26527Bnm(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31055Dkv interfaceC31055Dkv, C26266BjZ c26266BjZ, InterfaceC31152Dmw interfaceC31152Dmw, String str, HashMap hashMap, HashMap hashMap2, List list, List list2, float f, boolean z) {
        C14360o3.A0B(interfaceC11380iw, 1);
        AbstractC25234BEr.A0k(2, userSession, interfaceC31055Dkv, hashMap, hashMap2);
        C14360o3.A0B(str, 12);
        this.A05 = interfaceC11380iw;
        this.A06 = userSession;
        this.A03 = z;
        this.A00 = c26266BjZ;
        this.A07 = interfaceC31055Dkv;
        this.A08 = hashMap;
        this.A09 = hashMap2;
        this.A0A = list;
        this.A0B = list2;
        this.A04 = f;
        this.A01 = interfaceC31152Dmw;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC31152Dmw interfaceC31152Dmw;
        ImageUrl imageUrl;
        C38321qM c38321qM;
        InterfaceC31152Dmw interfaceC31152Dmw2;
        int i = 0;
        Object[] objArr = 0;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, C29891DGf.A00(this, 24));
        CR1 cr1 = (CR1) AbstractC77183d4.A00(c76223bS, DGO.A00, new Object[0]);
        Number number = (Number) A00.A03;
        int intValue = number.intValue();
        boolean z = this.A03;
        C26266BjZ c26266BjZ = this.A00;
        if (!z) {
            List list = c26266BjZ.A06;
            if (intValue < list.size() && (c38321qM = (C38321qM) AbstractC001800i.A0O(list, intValue)) != null && (interfaceC31152Dmw2 = this.A01) != null) {
                interfaceC31152Dmw2.FAB(c38321qM, this.A02, intValue);
            }
        } else if (intValue < c26266BjZ.A00 && (interfaceC31152Dmw = this.A01) != null) {
            interfaceC31152Dmw.FAC(intValue);
        }
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0m(num, 100.0f, 0));
        Integer num2 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num2, 100.0f, 0);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        int intValue2 = number.intValue();
        List list2 = c26266BjZ.A05;
        if ((list2 != null && (imageUrl = (ImageUrl) AbstractC001800i.A0O(list2, intValue2)) != null) || (imageUrl = c26266BjZ.A02) != null) {
            InterfaceC11380iw interfaceC11380iw = this.A05;
            TransitionDrawable transitionDrawable = new TransitionDrawable(new ColorDrawable[]{AbstractC25225BEi.A0G(AbstractC77623dm.A03(A12, R.color.cds_white_a20)), AbstractC25225BEi.A0G(AbstractC77623dm.A03(A12, R.color.fds_transparent))});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(200);
            A12.A00(new BVE(AbstractC25232BEp.A16(null, num, transitionDrawable), interfaceC11380iw, imageUrl));
        }
        C51722Yv A002 = C9CU.A00(AbstractC25234BEr.A0N(null, num, num2, 100.0f, 0), C05F.A08, 0, AbstractC25229BEm.A0K((int) (AbstractC25231BEo.A0F(A12, R.dimen.audio_bar_margin_bottom) + this.A04)));
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        float f = 1.0f;
        A13.A00(new BWR(AbstractC25234BEr.A0B(null, AbstractC25225BEi.A0m(num2, 1.0f, 1), 0.0f), c26266BjZ.A04, c26266BjZ.A03, f, f, R.attr.igds_color_primary_text_on_media, R.attr.igds_color_secondary_text_on_media, i, R.dimen.abc_button_padding_horizontal_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, 58940, 0L, objArr == true ? 1 : 0));
        C51722Yv A0T = AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0m(num, 100.0f, 0), num2, 1.0f, 1);
        C2Z0 A132 = AbstractC25232BEp.A13(A13);
        UserSession userSession = this.A06;
        AbstractC25231BEo.A19(new C26649Bpk(c26266BjZ.A01, C9CU.A00(AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(null, num, 100.0f, 0), num2, 90.0f, 0), C05F.A0j, 0, AbstractC77623dm.A0D(A132, R.dimen.clips_mega_card_center_video_height)), this.A05, userSession, this.A07, cr1, this.A02, this.A08, this.A09, this.A0A, this.A0B, DRY.A00(cr1, A00, 41), number.intValue(), AbstractC77623dm.A0D(A132, R.dimen.clips_mega_card_center_video_width), AbstractC77623dm.A0D(A132, R.dimen.clips_mega_card_center_video_height), z), A132, A13, A0T);
        A12.A00(AbstractC76963ci.A01(A13, A12, A002));
        return AbstractC76963ci.A01(A12, c76223bS, A0d);
    }
}
