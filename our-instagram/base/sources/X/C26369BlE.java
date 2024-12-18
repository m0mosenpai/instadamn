package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BlE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26369BlE extends AbstractC51572Yf {
    public final AudioFilterType A00;
    public final C40996IDr A01;
    public final UserSession A02;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C80393iU A0O;
        C14360o3.A0B(c76223bS, 0);
        C51762Yz A00 = AbstractC77073ct.A00(c76223bS, new J8Z(this, 37));
        AudioFilterType[] values = AudioFilterType.values();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (AudioFilterType audioFilterType : values) {
            if ((audioFilterType != AudioFilterType.A0B && audioFilterType != AudioFilterType.A09) || AbstractC185298Jv.A03(this.A02)) {
                A1E.add(audioFilterType);
            }
        }
        ArrayList A0U = AbstractC001800i.A0U(A1E);
        AudioFilterType audioFilterType2 = this.A00;
        AudioFilterType audioFilterType3 = AudioFilterType.A0A;
        List A1Q = AbstractC16960so.A1Q(audioFilterType3, AudioFilterType.A08, AudioFilterType.A07);
        A0U.removeAll(A1Q);
        A0U.addAll(0, A1Q);
        if (audioFilterType2 != null) {
            A0U.remove(audioFilterType2);
            A0U.add(0, audioFilterType2);
            A0U.remove(audioFilterType3);
            A0U.add(0, audioFilterType3);
        }
        C2XE c2xe = c76223bS.A05;
        C26278Bjl c26278Bjl = new C26278Bjl(c2xe, new C26659Bpu());
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A002 = C9CU.A00(AbstractC25233BEq.A0R(null, AbstractC25225BEi.A0n(C05F.A04, 0, AbstractC77623dm.A04(c76223bS)), 0, AbstractC77623dm.A0B(c76223bS)), C05F.A0G, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_edit_text_inset_top_material));
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            AudioFilterType audioFilterType4 = (AudioFilterType) it.next();
            C51722Yv A003 = C9CU.A00(null, C05F.A0D, 0, AbstractC77623dm.A0B(A0P));
            long A0D = AbstractC77623dm.A0D(A0P, R.dimen.abc_edit_text_inset_top_material);
            Integer num = C05F.A06;
            C51722Yv A004 = C9CU.A00(A003, num, 0, A0D);
            Drawable A0E = AbstractC77623dm.A0E(A0P, R.drawable.audio_page_audio_filters_pill_selector);
            Integer num2 = C05F.A00;
            C51722Yv A005 = C9CV.A00(A004, num2, A0E, 4);
            Object obj = A00.A03;
            C51722Yv A0Y = AbstractC25231BEo.A0Y(AbstractC25233BEq.A0c(A005, num, AbstractC167007dF.A1X(obj, audioFilterType4)), new C30184DRp(42, A00, audioFilterType4, this));
            C2Z0 A13 = AbstractC25232BEp.A13(A0P);
            int i = R.drawable.instagram_music_effects_pano_filled_24;
            if (audioFilterType4 == audioFilterType3) {
                i = R.drawable.instagram_circle_x_pano_filled_24;
            }
            C2XE c2xe2 = A13.A00;
            Context A0E2 = AbstractC25225BEi.A0E(c2xe2);
            int i2 = R.attr.igds_color_primary_icon;
            if (obj == audioFilterType4) {
                i2 = R.attr.igds_color_icon_on_white;
            }
            Drawable A01 = AbstractC85953sP.A01(A0E2, i, AbstractC53242c7.A0H(A0E2, i2));
            if (A01 == null) {
                A0O = null;
            } else {
                A0O = AbstractC25234BEr.A0O(A01, c2xe2, AbstractC25234BEr.A0I(C9CU.A00(C9CU.A00(null, num2, 0, AbstractC77623dm.A07(A13)), C05F.A01, 0, AbstractC77623dm.A07(A13)), AbstractC25227BEk.A0Z(0, AbstractC77623dm.A06(A13)), num2, 3));
            }
            A13.A00(A0O);
            String A0F = AbstractC77623dm.A0F(A13, AbstractC92574Cr.A00(audioFilterType4));
            long A05 = AbstractC77623dm.A05(A13);
            int i3 = R.attr.igds_color_primary_text;
            if (obj == audioFilterType4) {
                i3 = R.attr.igds_color_text_on_white;
            }
            int A06 = AbstractC25228BEl.A06(A0E2, A13, i3);
            Typeface typeface = Typeface.DEFAULT;
            long A0D2 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, A0F, 0);
            AbstractC25233BEq.A1B(A13, A0a, A06, A05);
            A0a.A0S(1);
            AbstractC25234BEr.A0o(typeface, A13, A0a, A0D2);
            A0a.A0B();
            AbstractC25234BEr.A1J(A0a, num2, false, true);
            AbstractC25231BEo.A1A(A0a.A0A(), A13, A0P, A0Y);
        }
        C2WH A0I = AbstractC76963ci.A0I(A0P, c76223bS, A002);
        C26659Bpu c26659Bpu = c26278Bjl.A01;
        c26659Bpu.A01 = A0I.A0P();
        BitSet bitSet = c26278Bjl.A02;
        bitSet.set(0);
        c26659Bpu.A04 = false;
        c26659Bpu.A02 = false;
        c26659Bpu.A03 = false;
        c26659Bpu.A00 = 0;
        AbstractC77733dx.A00(bitSet, c26278Bjl.A03, 1);
        c26278Bjl.A03();
        return c26659Bpu;
    }

    public C26369BlE(AudioFilterType audioFilterType, UserSession userSession, C40996IDr c40996IDr) {
        this.A01 = c40996IDr;
        this.A00 = audioFilterType;
        this.A02 = userSession;
    }
}
