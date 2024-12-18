package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7Ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160597Ht {
    public C35164Ff6 A00;
    public boolean A01;
    public final FrameLayout A02;
    public final G1W A03 = new Object();
    public final C159797Er A04;
    public final List A05;
    public final Context A06;
    public final ViewStub A07;
    public final InterfaceC11380iw A08;
    public final UserSession A09;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.G1W, java.lang.Object] */
    public C160597Ht(Context context, ViewStub viewStub, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C159797Er c159797Er, List list) {
        this.A09 = userSession;
        this.A06 = context;
        this.A07 = viewStub;
        this.A08 = interfaceC11380iw;
        this.A04 = c159797Er;
        this.A05 = list;
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.A02 = (FrameLayout) inflate;
    }
}
