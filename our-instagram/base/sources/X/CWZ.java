package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class CWZ {
    public InterfaceC72040XGi A00;
    public final Context A01;
    public final FoaUserSession A02;
    public final boolean A03;
    public final C27944CTd A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.CQr, java.lang.Object] */
    public final void A02(C27987CVk c27987CVk, Object obj, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c27987CVk, 0);
        ?? obj2 = new Object();
        obj2.A01 = null;
        obj2.A00 = null;
        interfaceC16660sJ.invoke(obj2);
        InterfaceC72040XGi interfaceC72040XGi = this.A00;
        if (interfaceC72040XGi != null) {
            C27944CTd c27944CTd = this.A04;
            Context context = this.A01;
            InterfaceC30961DjI A00 = c27944CTd.A00(context, c27987CVk, obj);
            A00.E5P();
            C28885Cot c28885Cot = new C28885Cot(context, this, A00, c27987CVk, this.A02, obj);
            interfaceC72040XGi.E6r(c28885Cot, new VBp(obj2.A00, c28885Cot, obj2.A01, 0, false));
            return;
        }
        throw AbstractC166987dD.A14("Must be attached to a fragment to push!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.CPV] */
    public final void A04(InterfaceC16660sJ interfaceC16660sJ) {
        CPV cpv;
        if (interfaceC16660sJ != 0) {
            ?? obj = new Object();
            obj.A00 = null;
            interfaceC16660sJ.invoke(obj);
            cpv = obj;
        } else {
            cpv = null;
        }
        InterfaceC72040XGi interfaceC72040XGi = this.A00;
        if (interfaceC72040XGi != null) {
            interfaceC72040XGi.E4d(new C68108VBr(cpv != null ? cpv.A00 : null));
            return;
        }
        throw AbstractC166987dD.A14("Must be attached to a fragment to pop!");
    }

    public final Fragment A00() {
        InterfaceC018407e interfaceC018407e = this.A00;
        if (interfaceC018407e != null) {
            return (Fragment) interfaceC018407e;
        }
        throw AbstractC166987dD.A14("Not attached to a fragment!");
    }

    public final void A01(CW5 cw5) {
        C27987CVk c27987CVk = cw5.A02;
        C14360o3.A0C(c27987CVk, "null cannot be cast to non-null type com.meta.foa.screens.ScreenDefinition<kotlin.Any, com.meta.foa.screens.DataSource, com.meta.foa.cds.bottomsheet.CdsBottomSheetContainer>");
        Object obj = cw5.A04;
        InterfaceC30961DjI interfaceC30961DjI = cw5.A01;
        int i = cw5.A00;
        InterfaceC72040XGi interfaceC72040XGi = this.A00;
        if (interfaceC72040XGi != null) {
            C28885Cot c28885Cot = new C28885Cot(this.A01, this, interfaceC30961DjI, c27987CVk, this.A02, obj);
            interfaceC72040XGi.E2M(c28885Cot, new U5A(c28885Cot, i, false));
            return;
        }
        throw AbstractC166987dD.A14("Must be attached to a fragment to open!");
    }

    public final void A03(final InterfaceC16820sZ interfaceC16820sZ) {
        Runnable runnable;
        InterfaceC72040XGi interfaceC72040XGi = this.A00;
        if (interfaceC72040XGi != null) {
            if (interfaceC16820sZ != null) {
                runnable = new Runnable() { // from class: X.D1F
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        InterfaceC16820sZ.this.invoke();
                    }
                };
            } else {
                runnable = null;
            }
            interfaceC72040XGi.APk(new VBq(null), runnable);
            return;
        }
        throw AbstractC166987dD.A14("Must be attached to a fragment to dismiss!");
    }

    public CWZ(Context context, FoaUserSession foaUserSession, boolean z) {
        this.A01 = context;
        this.A02 = foaUserSession;
        this.A03 = z;
        C27944CTd c27944CTd = (C27944CTd) ((IgMetaSessionImpl) foaUserSession).A00.A01(C27944CTd.class, C29790DCi.A00);
        C14360o3.A07(c27944CTd);
        this.A04 = c27944CTd;
    }
}
