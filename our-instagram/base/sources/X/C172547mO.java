package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7mO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172547mO {
    public final AbstractC59962oe A00;
    public final C172567mQ A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    public C172547mO(Context context, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C1810981l c1810981l, C172427mB c172427mB) {
        C14360o3.A0B(view, 5);
        this.A00 = abstractC59962oe;
        C172557mP c172557mP = C172557mP.A00;
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E4(new C9E4(abstractC59962oe, 48), 49));
        this.A05 = new C60842q8(new C9ES(A00, 0), c172557mP, new C9F5(13, null, A00), new C0YZ(C8EX.class));
        this.A06 = C1XM.A00(new C9ES(view, 4));
        this.A04 = C1XM.A00(new C9ES(this, 3));
        this.A03 = C1XM.A00(new C9ES(this, 2));
        this.A02 = C1XM.A00(new C9ES(this, 1));
        C172567mQ c172567mQ = new C172567mQ(context, userSession, c1810981l, c172427mB);
        this.A01 = c172567mQ;
        Object value = this.A02.getValue();
        C14360o3.A07(value);
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(context));
        Object value2 = this.A02.getValue();
        C14360o3.A07(value2);
        ((RecyclerView) value2).setAdapter(c172567mQ);
        Object value3 = this.A03.getValue();
        C14360o3.A07(value3);
        ((View) value3).setOnClickListener(null);
        AbstractC59962oe abstractC59962oe2 = this.A00;
        if (!abstractC59962oe2.mDetached && abstractC59962oe2.isAdded()) {
            AbstractC57302k5.A00(abstractC59962oe2.getLifecycle()).A00(new C9D0(this, null, 30));
            AbstractC57302k5.A00(abstractC59962oe2.getLifecycle()).A00(new C206639Cu(this, null, 39));
        }
    }

    public final void A00() {
        AbstractC59962oe abstractC59962oe = this.A00;
        if (!abstractC59962oe.mDetached && abstractC59962oe.isAdded()) {
            ((C8EX) this.A05.getValue()).A03.Egh(false);
        }
    }
}
