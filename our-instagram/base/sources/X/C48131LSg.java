package X;

import com.facebook.videolite.instagram.MemFbUploader$startAsyncUploadJob$job$1;
import com.instagram.common.session.UserSession;
import java.util.Collections;

/* renamed from: X.LSg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48131LSg implements InterfaceC58100PpP {
    public final UserSession A00;
    public final C47Z A01;
    public final C12N A02;

    public C48131LSg(C12N c12n, UserSession userSession, C47Z c47z) {
        C14360o3.A0B(c12n, 3);
        this.A00 = userSession;
        this.A01 = c47z;
        this.A02 = c12n;
    }

    @Override // X.InterfaceC58100PpP
    public final void AGL(InterfaceC57793PkK interfaceC57793PkK) {
        C14360o3.A0B(interfaceC57793PkK, 0);
        if (interfaceC57793PkK instanceof C48130LSf) {
            AnonymousClass195 anonymousClass195 = ((C48130LSf) interfaceC57793PkK).A01;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
                return;
            } else {
                C14360o3.A0F("job");
                throw C00O.createAndThrow();
            }
        }
        throw AbstractC166987dD.A12("handle is not a MemFbUploadJobHandle");
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.PkK, X.LSf, java.lang.Object] */
    @Override // X.InterfaceC58100PpP
    public final InterfaceC57793PkK En2(C54993OUc c54993OUc, C55191Odx c55191Odx, XE6 xe6) {
        C14360o3.A0B(c55191Odx, 0);
        ?? obj = new Object();
        obj.A01 = AbstractC25226BEj.A1L(new MemFbUploader$startAsyncUploadJob$job$1(c55191Odx, xe6, obj, this, null), AbstractC43593JPy.A17(this.A02, 319, 2));
        return obj;
    }

    @Override // X.InterfaceC58100PpP
    public final W63 FDr(InterfaceC57793PkK interfaceC57793PkK) {
        C14360o3.A0B(interfaceC57793PkK, 0);
        if (interfaceC57793PkK instanceof C48130LSf) {
            C2ST.A00(AnonymousClass191.A00, new PZA(interfaceC57793PkK, (InterfaceC23621Ds) null, 36));
            W63 w63 = ((C48130LSf) interfaceC57793PkK).A00;
            if (w63 != null) {
                return w63;
            }
            throw new VIA(null, "Upload result is null", Collections.emptyMap(), 0, 0L, false);
        }
        throw AbstractC166987dD.A12("handle is not a MemFbUploadJobHandle");
    }
}
