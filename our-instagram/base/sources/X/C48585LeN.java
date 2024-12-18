package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;

/* renamed from: X.LeN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48585LeN implements InterfaceC186068Na {
    public final /* synthetic */ KCA A00;

    @Override // X.InterfaceC186068Na
    public final void Chi(Medium medium, long j, long j2, boolean z) {
        C14360o3.A0B(medium, 0);
        KCA kca = this.A00;
        C48591LeT c48591LeT = kca.A01;
        String str = "photoStickerCreationController";
        if (c48591LeT != null) {
            c48591LeT.A04 = new KN8(medium, j, j2, z);
            C48215LVp c48215LVp = kca.A00;
            if (c48215LVp == null) {
                str = "assetPickerModeController";
            } else {
                c48215LVp.A02(c48591LeT, true);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D5Y() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D94(Bitmap bitmap, String str) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D97() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D98(C9ZM c9zm) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DEz() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DWm() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DY4(Bitmap bitmap, String str) {
    }

    public C48585LeN(KCA kca) {
        this.A00 = kca;
    }

    @Override // X.InterfaceC186068Na
    public final void D95() {
        KCA kca = this.A00;
        if (kca.A04) {
            AbstractC43594JPz.A19(kca, kca.getParentFragmentManager());
        } else {
            AbstractC25226BEj.A1Q(kca);
        }
    }
}
