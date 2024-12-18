package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.8bi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190248bi {
    public final Activity A00;
    public final Dialog A01;
    public final AbstractC59962oe A02;
    public final InterfaceC09390do A03;

    public C190248bi(Activity activity, AbstractC59962oe abstractC59962oe, UserSession userSession, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 3);
        this.A00 = activity;
        this.A02 = abstractC59962oe;
        this.A03 = AbstractC09440dt.A01(new C9FP(18, c23031Ai, this, userSession));
        C193328hC c193328hC = new C193328hC(activity);
        c193328hC.A05 = activity.getString(2131965802);
        c193328hC.A0r(activity.getString(2131965801));
        String string = activity.getString(2131975120);
        C14360o3.A07(string);
        c193328hC.A0d(new DialogInterface.OnClickListener() { // from class: X.8bj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) C190248bi.this.A03.getValue();
                C141796aw A00 = AbstractC141776au.A00(abstractC52922bZ);
                AbstractC23641Du.A05(AnonymousClass191.A00, new C25024B5f(abstractC52922bZ, null, 30), A00);
            }
        }, string);
        String string2 = activity.getString(2131956237);
        C14360o3.A07(string2);
        c193328hC.A0b(new DialogInterface.OnClickListener() { // from class: X.8bk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) C190248bi.this.A03.getValue();
                C141796aw A00 = AbstractC141776au.A00(abstractC52922bZ);
                C206639Cu c206639Cu = new C206639Cu(abstractC52922bZ, null, 43);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A00);
            }
        }, string2);
        this.A01 = c193328hC.A02();
        if (!abstractC59962oe.mDetached) {
            C57312k6 A00 = C07Y.A00(this.A02.getViewLifecycleOwner());
            C206639Cu c206639Cu = new C206639Cu(this, null, 42);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A00);
            AbstractC18560vj.A03(C07Y.A00(this.A02.getViewLifecycleOwner()), new C15340po(new C9D0(this, null, 31), ((C190288bm) this.A03.getValue()).A03));
        }
    }
}
