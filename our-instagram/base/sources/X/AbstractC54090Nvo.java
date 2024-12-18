package X;

/* renamed from: X.Nvo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54090Nvo {
    public static final void A00(InterfaceC40821up interfaceC40821up, OXD oxd) {
        C14360o3.A0B(oxd, 1);
        if (!interfaceC40821up.isOk() && interfaceC40821up.isLoginRequired()) {
            C47Z c47z = oxd.A0C;
            boolean A1W = AbstractC167007dF.A1W(c47z.A3O);
            boolean A0t = c47z.A0t();
            boolean A11 = c47z.A11();
            if (A1W || A0t) {
                C0w9.A03("MediaUploader_sidecarUpload", AbstractC13670mt.A06("Sidecar upload causing forced logout. is parent upload: %s, is child upload: %s ,is video: %s", Boolean.valueOf(A0t), Boolean.valueOf(A1W), Boolean.valueOf(A11)));
            }
        }
        AbstractC72533Na.A00(interfaceC40821up, oxd.A0B, null);
    }
}
