package X;

import com.instagram.clips.intf.ClipsViewerSource;

/* renamed from: X.5Qp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC116865Qp {
    public static final ClipsViewerSource A01(InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 0);
        for (ClipsViewerSource clipsViewerSource : ClipsViewerSource.values()) {
            if (C14360o3.A0K(AbstractC002300n.A0d(interfaceC11380iw.getModuleName(), "clips_viewer_", "", true), clipsViewerSource.A00)) {
                return clipsViewerSource;
            }
        }
        return ClipsViewerSource.A2Z;
    }

    public static final ClipsViewerSource A00(InterfaceC11380iw interfaceC11380iw) {
        for (ClipsViewerSource clipsViewerSource : ClipsViewerSource.values()) {
            if (C14360o3.A0K(interfaceC11380iw.getModuleName(), clipsViewerSource.A00)) {
                return clipsViewerSource;
            }
        }
        return ClipsViewerSource.A2Z;
    }

    public static final ClipsViewerSource A02(String str) {
        for (ClipsViewerSource clipsViewerSource : ClipsViewerSource.values()) {
            if (C14360o3.A0K(AbstractC002300n.A0d(str, "clips_viewer_", "", true), clipsViewerSource.A00)) {
                return clipsViewerSource;
            }
        }
        return ClipsViewerSource.A2Z;
    }
}
