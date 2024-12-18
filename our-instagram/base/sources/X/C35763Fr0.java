package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35763Fr0 implements InterfaceC58362lv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C35763Fr0(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj4;
        this.A04 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Bundle bundle;
        if (this.A00 != 0) {
            List list = (List) obj;
            EI0 ei0 = (EI0) this.A01;
            if (ei0.A01 != null && (bundle = (Bundle) this.A04) != null) {
                bundle.putStringArrayList("ig_sso_accounts_array", C35020Fbt.A00(list));
                ((C64P) this.A03).setPrimaryActionOnClickListener(new ViewOnClickListenerC35684FpJ(53, ei0, bundle, this.A02));
                return;
            }
            return;
        }
        FJY fjy = (FJY) obj;
        if (fjy == null) {
            return;
        }
        if (!fjy.A01 && !((Fragment) this.A04).isResumed()) {
            return;
        }
        C32363ENk c32363ENk = (C32363ENk) this.A04;
        ImmutableList immutableList = C32363ENk.A02;
        InterfaceC151446rm interfaceC151446rm = c32363ENk.A00;
        if (interfaceC151446rm == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) this.A02;
        C32421EPw c32421EPw = new C32421EPw(c32363ENk.getSession(), interfaceC151446rm, fjy.A00, (List) this.A01, (List) this.A03);
        recyclerView.setAdapter(c32421EPw);
        Iterator it = c32421EPw.A01.iterator();
        while (it.hasNext()) {
            c32421EPw.addModel(it.next(), c32421EPw.A00);
        }
        Iterator it2 = c32421EPw.A02.iterator();
        while (it2.hasNext()) {
            c32421EPw.addModel(it2.next(), c32421EPw.A00);
        }
        c32421EPw.notifyDataSetChanged();
    }
}
