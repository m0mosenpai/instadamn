package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* renamed from: X.8Ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183988Ef {
    public C183978Ee A00;
    public final Context A01;
    public final View A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final C1816783z A05;
    public final C183998Eg A06;
    public final C183968Ec A07;
    public final InterfaceC09390do A08;
    public final C1810981l A09;

    public C183988Ef(Context context, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C1810981l c1810981l, C1816783z c1816783z, C183968Ec c183968Ec) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(view, 4);
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = abstractC59962oe;
        this.A02 = view;
        this.A07 = c183968Ec;
        this.A05 = c1816783z;
        this.A09 = c1810981l;
        this.A08 = C1XM.A00(new C9E4(this, 11));
        this.A06 = new C183998Eg(view, abstractC59962oe, c183968Ec);
        C57312k6 A00 = C07Y.A00(abstractC59962oe.getViewLifecycleOwner());
        C206639Cu c206639Cu = new C206639Cu(this, null, 33);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        Integer num = C05F.A00;
        AbstractC23641Du.A03(num, anonymousClass191, c206639Cu, A00);
        AbstractC23641Du.A03(num, anonymousClass191, new C206639Cu(this, null, 34), C07Y.A00(abstractC59962oe.getViewLifecycleOwner()));
    }

    public static final IgGltfSceneLayoutView A00(C183988Ef c183988Ef) {
        if (A34.A00(c183988Ef.A04, (C55U) c183988Ef.A09.A08.A00, c183988Ef.A05.A0C())) {
            return (IgGltfSceneLayoutView) c183988Ef.A08.getValue();
        }
        return null;
    }
}
