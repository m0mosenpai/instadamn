package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.5sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC129255sn {
    public static final C129265so A00(InterfaceC11380iw interfaceC11380iw) {
        String moduleName;
        String mediaId;
        String url;
        C14360o3.A0B(interfaceC11380iw, 0);
        boolean z = interfaceC11380iw instanceof ReelViewerFragment;
        if (z) {
            ReelViewerFragment reelViewerFragment = (ReelViewerFragment) interfaceC11380iw;
            C41181vS AuU = reelViewerFragment.AuU();
            if (reelViewerFragment.isResumed() && ReelViewerFragment.A0Q(reelViewerFragment) && reelViewerFragment.A2Y && AuU != null && AuU.CdW()) {
                moduleName = "instagram_clicktodirect";
            } else {
                moduleName = reelViewerFragment.getModuleName();
            }
        } else {
            moduleName = interfaceC11380iw.getModuleName();
        }
        if (moduleName == null) {
            moduleName = "";
        }
        C14360o3.A0A(moduleName);
        if (!z) {
            mediaId = null;
        } else {
            mediaId = ((ReelViewerFragment) interfaceC11380iw).getMediaId();
        }
        String A00 = AbstractC03870Jc.A00(interfaceC11380iw.getClass());
        C14360o3.A07(A00);
        if (!(interfaceC11380iw instanceof C0j7)) {
            url = null;
        } else {
            url = ((C0j7) interfaceC11380iw).getUrl();
        }
        C14360o3.A0B(moduleName, 0);
        return new C129265so(moduleName, A00, url, mediaId);
    }
}
