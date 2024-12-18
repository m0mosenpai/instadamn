package X;

import androidx.fragment.app.Fragment;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;

/* renamed from: X.Afc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23765Afc implements InterfaceC25214BDm {
    public final int A00;
    public final Object A01;

    public C23765Afc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void AIF() {
        if (15 - this.A00 == 0) {
            AbstractC25231BEo.A16((Fragment) this.A01);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r6.contains(com.instagram.pendingmedia.model.UserStoryTarget.A09) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ef, code lost:
    
        if (r6.contains(com.instagram.pendingmedia.model.UserStoryTarget.A09) != false) goto L57;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC25214BDm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AIG(java.lang.String r5, java.util.List r6, java.util.List r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23765Afc.AIG(java.lang.String, java.util.List, java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void Cqz(String str) {
        switch (this.A00) {
            case 1:
                C81Y c81y = ((C214869fO) this.A01).A01;
                if (c81y == null) {
                    C14360o3.A0F("quickCaptureController");
                    throw C00O.createAndThrow();
                }
                c81y.A05("button", true);
                return;
            case 8:
            case 9:
            case 14:
                AbstractC67881V0m abstractC67881V0m = (AbstractC67881V0m) this.A01;
                C81Y c81y2 = abstractC67881V0m.A01;
                if (c81y2 != null) {
                    c81y2.A05("button", true);
                }
                UserSession userSession = abstractC67881V0m.A00;
                C14360o3.A07(userSession);
                AbstractC25651Mw.A00(userSession).E4s(new Object());
                return;
            case Process.SIGTERM /* 15 */:
                C222419ri.A00((C222419ri) this.A01);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void E2e() {
    }

    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void Cqw(String str) {
    }

    @Override // X.InterfaceC25214BDm
    public final /* synthetic */ void Crg(String str) {
    }
}
