package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.model.reels.Reel;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;
import java.util.Collections;

/* renamed from: X.IiD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41920IiD implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final String A02;

    public ViewOnClickListenerC41920IiD(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.6Xn, X.V9Z] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-454719160);
                if (((Fragment) this.A01).getContext() != null) {
                    String str = this.A02;
                    EnumC141996bI enumC141996bI = EnumC141996bI.A05;
                    C146106i8 A0X = AbstractC31173DnH.A0X(str);
                    A0X.A0C = enumC141996bI;
                    AbstractC31178DnM.A1S(A0X);
                }
                i = 669565220;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-1945869955);
                HMP hmp = (HMP) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                hmp.A01.DjH(this.A02);
                i = -43838517;
                C0f9.A0C(i, A05);
                return;
            case 2:
                EffectsPageFragment effectsPageFragment = (EffectsPageFragment) this.A01;
                String str2 = this.A02;
                AbstractC34910FZw.A00(effectsPageFragment.requireActivity(), effectsPageFragment.A07, str2);
                return;
            case 3:
                EffectsPageFragment effectsPageFragment2 = (EffectsPageFragment) this.A01;
                String str3 = this.A02;
                Reel reel = effectsPageFragment2.A09;
                if (reel == null) {
                    return;
                }
                C42792IwU c42792IwU = new C42792IwU(effectsPageFragment2.mEffectThumbnail, effectsPageFragment2.A0D);
                C38E c38e = effectsPageFragment2.A0C;
                c38e.A0C = effectsPageFragment2.A0B.A04;
                ?? abstractC140596Xn = new AbstractC140596Xn();
                abstractC140596Xn.A00 = c42792IwU;
                c38e.A05 = abstractC140596Xn;
                c38e.A06(reel, C3G2.A1e, c42792IwU, Collections.singletonList(reel), Collections.singletonList(reel), Collections.singletonList(reel));
                C4T4.A00(effectsPageFragment2.A07).Cm4(C22P.A13, str3);
                return;
            default:
                A05 = C0f9.A05(-306907502);
                C38929HCc c38929HCc = (C38929HCc) this.A01;
                AbstractC34910FZw.A00(c38929HCc.requireActivity(), AbstractC166987dD.A0r(c38929HCc.A0o), this.A02);
                i = 1539467614;
                C0f9.A0C(i, A05);
                return;
        }
    }
}
