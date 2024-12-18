package X;

import android.content.Context;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IKR {
    public final Context A00;
    public final ClipsViewerConfig A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC43589JPu A04;
    public final C41725Idw A05;
    public final ILX A06;
    public final String A07;
    public final InterfaceC16820sZ A08;

    public IKR(Context context, ClipsViewerConfig clipsViewerConfig, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC43589JPu interfaceC43589JPu, ILX ilx, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC43589JPu, 4);
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = interfaceC43589JPu;
        this.A07 = str;
        this.A08 = interfaceC16820sZ;
        this.A06 = ilx;
        this.A01 = clipsViewerConfig;
        this.A05 = new C41725Idw(context, interfaceC11380iw, userSession);
    }
}
