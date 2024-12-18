package X;

import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.mobileboost.framework.os.jni.lite.MobileBoostNativeLite;

/* renamed from: X.V6n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68021V6n extends AbstractC18280vF {
    public final /* synthetic */ C70779Wgs A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68021V6n(C70779Wgs c70779Wgs, boolean z) {
        super("BundledLayoutLoaderMlock", 952254433, 1, false, false);
        this.A00 = c70779Wgs;
        this.A01 = z;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        C70779Wgs c70779Wgs = this.A00;
        boolean z = c70779Wgs.A00;
        boolean z2 = this.A01;
        if (z != z2) {
            c70779Wgs.A00 = z2;
            if (c70779Wgs.A04) {
                InterfaceC09390do interfaceC09390do = c70779Wgs.A03;
                MobileBoostNativeLite.mlockPages(((C212211z) interfaceC09390do.getValue()).A01, ((C212211z) interfaceC09390do.getValue()).A00 & 255, 0, (((C212211z) interfaceC09390do.getValue()).A00 >> 30) & 3, z2);
                return;
            }
            String str = c70779Wgs.A02;
            int i = c70779Wgs.A01;
            if (z2) {
                DalvikInternals.mLockMappedFile(str, i, false);
            } else {
                DalvikInternals.mUnlockMappedFile(str, i, false);
            }
        }
    }
}
