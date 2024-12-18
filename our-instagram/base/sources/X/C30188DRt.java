package X;

import com.facebook.R;

/* renamed from: X.DRt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30188DRt extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30188DRt(boolean z, int i) {
        super(2);
        this.A00 = i;
        this.A01 = z;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        String A00;
        int i2;
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                if (AbstractC25227BEk.A1U(A0S, -1938222626)) {
                    C0fH.A01(1846689659, "com.instagram.creation.drafts.ui.DraftItemOverflowMenu.<anonymous> (DraftList.kt:223)");
                }
                C26004Bes c26004Bes = new C26004Bes(null, C5Y7.A00(A0S, R.drawable.instagram_edit_pano_outline_24, 0), C5YD.A00(A0S, 2131972342), 0, false, false, false);
                if (this.A01) {
                    A0S.Eno(-2030250608);
                    i = 2;
                    A00 = C5YD.A00(A0S, 2131960768);
                    i2 = R.drawable.instagram_unpin_pano_outline_24;
                } else {
                    A0S.Eno(-2029893674);
                    i = 1;
                    A00 = C5YD.A00(A0S, 2131960135);
                    i2 = R.drawable.instagram_pin_pano_outline_24;
                }
                C26004Bes c26004Bes2 = new C26004Bes(null, C5Y7.A00(A0S, i2, 0), A00, i, false, false, false);
                C117505Tk A0K = AbstractC25225BEi.A0K(A0S, false);
                C5Hb A04 = AbstractC133095zb.A04(c26004Bes, c26004Bes2, new C26004Bes(null, C5Y7.A00(A0S, R.drawable.instagram_delete_pano_outline_24, 0), C5YD.A00(A0S, 2131957640), 3, false, false, true));
                if (C0fH.A02()) {
                    C0fH.A00(-324722945);
                }
                C117505Tk.A0L(A0K, false);
                return A04;
            case 1:
                C5Tl c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(980244416, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.MagicModBackdropEditingBar.<anonymous> (MagicModBackdropEditingBar.kt:31)");
                    }
                    int i3 = 2131965954;
                    if (this.A01) {
                        i3 = 2131965953;
                    }
                    CHE.A00(c5Tl, i3, 0);
                    if (C0fH.A02()) {
                        C0fH.A00(1920896737);
                    }
                }
                return C0eB.A00;
            default:
                return Boolean.valueOf(this.A01);
        }
    }
}
