package X;

import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Afa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23763Afa implements MOV {
    public final /* synthetic */ C23852Ah4 A00;

    @Override // X.MOV
    public final void DDN(View view, String str, String str2) {
        IgSimpleImageView igSimpleImageView;
        C14360o3.A0B(str, 0);
        C23852Ah4 c23852Ah4 = this.A00;
        C24015Akt c24015Akt = new C24015Akt(new C106074qN(str, false));
        c23852Ah4.A01 = c24015Akt;
        AAH aah = c23852Ah4.A00;
        if (aah != null && (igSimpleImageView = aah.A02) != null) {
            igSimpleImageView.setImageDrawable(new C220899pD(c23852Ah4.A03, c24015Akt, true, false));
        }
    }

    public C23763Afa(C23852Ah4 c23852Ah4) {
        this.A00 = c23852Ah4;
    }
}
