package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.EPj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32408EPj extends C7E1 {
    public final List A00;
    public final UserSession A01;
    public final ERH A02;
    public final ERI A03;

    public C32408EPj(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        int A1a = AbstractC31175DnJ.A1a(userSession);
        ERI eri = new ERI(context, interfaceC11380iw);
        this.A03 = eri;
        ERH erh = new ERH(context, interfaceC11380iw);
        this.A02 = erh;
        this.A00 = AbstractC166987dD.A1E();
        this.A01 = userSession;
        InterfaceC65642y0[] interfaceC65642y0Arr = new InterfaceC65642y0[A1a];
        if (C18U.A06(C06090Tz.A05, userSession, 2342163889778729952L)) {
            interfaceC65642y0Arr[0] = erh;
        } else {
            interfaceC65642y0Arr[0] = eri;
        }
        A0B(interfaceC65642y0Arr);
    }

    public static final void A00(C32408EPj c32408EPj) {
        InterfaceC65642y0 interfaceC65642y0;
        c32408EPj.A06();
        for (Object obj : c32408EPj.A00) {
            if (C18U.A06(C06090Tz.A05, c32408EPj.A01, 2342163889778729952L)) {
                interfaceC65642y0 = c32408EPj.A02;
            } else {
                interfaceC65642y0 = c32408EPj.A03;
            }
            c32408EPj.A08(interfaceC65642y0, obj);
        }
        c32408EPj.A07();
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        A00(this);
    }
}
