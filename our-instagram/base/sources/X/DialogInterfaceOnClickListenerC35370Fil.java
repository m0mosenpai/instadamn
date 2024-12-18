package X;

import android.content.Context;
import android.content.DialogInterface;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.Fil, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35370Fil implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public DialogInterfaceOnClickListenerC35370Fil(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        this.A00 = i;
        this.A04 = obj3;
        this.A05 = str;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A01 = obj;
        this.A06 = z;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A04;
            boolean z = this.A06;
            C38321qM c38321qM = (C38321qM) this.A03;
            AbstractC018607g abstractC018607g = (AbstractC018607g) this.A02;
            String str = this.A05;
            C14360o3.A0B(abstractC018607g, 4);
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                C25621Ms A0c = AbstractC167017dG.A0c(abstractC12990ll);
                A0c.A0B("clips/item/set_mashups_allowed/");
                A0c.A9s(AbstractC43591JPw.A00(139), A2u);
                A0c.A9s("media_id", A2u);
                A0c.A0I(AbstractC111324zv.A00(4867), !z);
                C1ON A0K = AbstractC31178DnM.A0K(A0c, "container_module", str);
                A0K.A00 = new ETR(context, abstractC12990ll, c38321qM, str, 2, z);
                C1GJ.A00(context, abstractC018607g, A0K);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A04;
        C83743oJ.A01(abstractC12990ll2).A09((Context) this.A01, (InterfaceC11380iw) this.A02, abstractC12990ll2, (Integer) this.A03, this.A05, true);
        if (this.A06) {
            return;
        }
        ImmutableList copyOf = ImmutableList.copyOf(C84613qA.A00(abstractC12990ll2).A02.values());
        if (AbstractC83893oY.A00(copyOf)) {
            return;
        }
        Iterator<E> it = copyOf.iterator();
        while (it.hasNext()) {
            ((C34561FKv) it.next()).A02 = true;
        }
        C84613qA.A00(abstractC12990ll2).A05(copyOf);
    }
}
