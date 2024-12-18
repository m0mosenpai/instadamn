package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GhG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37621GhG {
    public static final C37621GhG A00 = new Object();

    public static final C120985dq A00(ClipsViewerConfig clipsViewerConfig, UserSession userSession, String str) {
        InterfaceC38371qR A002;
        C38321qM c38321qM;
        C14360o3.A0B(userSession, 0);
        String str2 = clipsViewerConfig.A1E;
        int i = clipsViewerConfig.A09;
        boolean z = clipsViewerConfig.A1k;
        if (str != null && (A002 = AbstractC151266rU.A00(userSession, str2, str)) != null) {
            C128085qc c128085qc = C120985dq.A0d;
            if (A002 instanceof C40971v4) {
                c38321qM = ((C40971v4) A002).A0K;
            } else if (A002 instanceof C38321qM) {
                c38321qM = (C38321qM) A002;
            } else {
                EnumC12410kj enumC12410kj = EnumC12410kj.A07;
                String A0q = AbstractC31173DnH.A0q(A00);
                C14360o3.A07(A0q);
                C0w9.A01(enumC12410kj, A0q, AbstractC111324zv.A00(1850));
                C120985dq A04 = c128085qc.A04(A002);
                A04.A0E(C05F.A00);
                A04.A0A = z;
                return A04;
            }
            c38321qM.A03 = i;
            C120985dq A042 = c128085qc.A04(A002);
            A042.A0E(C05F.A00);
            A042.A0A = z;
            return A042;
        }
        return null;
    }
}
