package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.User;

/* renamed from: X.6Zs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141146Zs extends C6ZL {
    public final Context A00;
    public final View A01;
    public final CreativeConfigIntf A02;
    public final C41181vS A03;
    public final ReelViewerConfig A04;
    public final InterfaceC144606fg A05;
    public final C143786eM A06;
    public final String A07;
    public final C38321qM A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141146Zs(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C41181vS c41181vS, ReelViewerConfig reelViewerConfig, InterfaceC144606fg interfaceC144606fg, C143786eM c143786eM) {
        super(interfaceC11380iw, userSession, c41181vS);
        CreativeConfigIntf creativeConfigIntf;
        User A2E;
        C14360o3.A0B(c143786eM, 7);
        this.A00 = context;
        this.A03 = c41181vS;
        this.A08 = c38321qM;
        String str = null;
        if (c38321qM != null) {
            creativeConfigIntf = c38321qM.A0C.Asm();
        } else {
            creativeConfigIntf = null;
        }
        this.A02 = creativeConfigIntf;
        if (c38321qM != null && (A2E = c38321qM.A2E(userSession)) != null) {
            str = A2E.getId();
        }
        this.A07 = str;
        this.A04 = reelViewerConfig;
        this.A05 = interfaceC144606fg;
        this.A06 = c143786eM;
        this.A01 = view;
    }

    public C141146Zs(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, CreativeConfigIntf creativeConfigIntf, InterfaceC144606fg interfaceC144606fg, C143786eM c143786eM, String str) {
        super(interfaceC11380iw, userSession, null);
        this.A00 = context;
        this.A03 = null;
        this.A08 = null;
        this.A02 = creativeConfigIntf;
        this.A07 = str;
        this.A04 = null;
        this.A05 = interfaceC144606fg;
        this.A06 = c143786eM;
        this.A01 = view;
    }
}
