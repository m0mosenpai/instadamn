package X;

import android.text.Layout;
import android.util.SparseArray;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3z6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89653z6 extends AbstractC51572Yf {
    public final UserSession A00;
    public final AnonymousClass413 A01;
    public final InterfaceC60442pS A02;

    public C89653z6(UserSession userSession, AnonymousClass413 anonymousClass413, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
        this.A01 = anonymousClass413;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        AnonymousClass413 anonymousClass413 = this.A01;
        if (anonymousClass413 == null) {
            return null;
        }
        AbstractC77063cs.A00(c76223bS, AnonymousClass473.A00);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.post_impression_view_tracking_node, EnumC77673dr.A02);
        C51762Yz A01 = AbstractC77273dD.A01(c76223bS, anonymousClass413.A04, AnonymousClass474.A00, 4, false);
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv c51722Yv = new C51722Yv(new C51722Yv(null, new C9CU(C05F.A0u, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.action_bar_item_spacing_right))), new C9CU(C05F.A1I, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_action_bar_elevation_material)));
        C2Z0 c2z0 = new C2Z0(c76223bS.A05, new ArrayList());
        Layout layout = anonymousClass413.A00;
        C51722Yv c51722Yv2 = new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CV(C05F.A0E, sparseArray, 4)), new C9CU(C05F.A1F, 0, AbstractC77623dm.A0D(c2z0, R.dimen.action_bar_item_spacing_right))), new C77863eE(C05F.A00, new C207189Ex(20, this, c2z0), null));
        C76623c7 c76623c7 = anonymousClass413.A03;
        c2z0.A00(new AnonymousClass416(layout, AbstractC77823e9.A00((EnumC71343Hv) anonymousClass413.A01.A00, c51722Yv2, this.A00, c76623c7, this.A02, (Integer) A01.A03, false, false), null));
        return AbstractC76963ci.A0J(c2z0, c76223bS, c51722Yv, null, null, null, null, null, false);
    }
}
