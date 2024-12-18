package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66362zD extends C2UU {
    public static final C66372zE A0D = new Object();
    public View.OnLongClickListener A01;
    public C5GW A02;
    public final C66462zN A03;
    public final InterfaceC66442zL A04;
    public final Object A05;
    public final boolean A06;
    public final LayoutInflater A07;
    public final InterfaceC65452xh A08;
    public final C5GX A0A;
    public final C5GZ A0B;
    public final C5GY A0C;
    public boolean A00 = true;
    public final C66502zR A09 = new C66502zR();

    public final int A01(Class cls) {
        Object obj = this.A03.A02.get(cls);
        C18C.A08(obj, cls.getName(), "No definition corresponding to model class %s was found");
        return ((Number) obj).intValue();
    }

    public final int A02(Object obj) {
        List AuX = this.A04.AuX();
        for (int i = 0; i < AuX.size(); i++) {
            if (((InterfaceC66482zP) AuX.get(i)).getKey().equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Deprecated
    public final Object A04(int i) {
        return this.A04.AuX().get(i);
    }

    public final void A05(ViewModelListUpdate viewModelListUpdate) {
        A06(viewModelListUpdate, A0D);
    }

    public final void A06(ViewModelListUpdate viewModelListUpdate, InterfaceC66382zF interfaceC66382zF) {
        if (this.A06) {
            List<InterfaceC66482zP> A0a = AbstractC001800i.A0a(viewModelListUpdate.A00);
            HashMap hashMap = new HashMap(A0a.size());
            int i = 0;
            for (InterfaceC66482zP interfaceC66482zP : A0a) {
                Class<?> cls = interfaceC66482zP.getClass();
                Long valueOf = Long.valueOf(A03(cls, interfaceC66482zP.getKey()));
                if (!hashMap.containsKey(valueOf)) {
                    hashMap.put(valueOf, Integer.valueOf(i));
                    i++;
                } else {
                    int intValue = ((Number) hashMap.get(valueOf)).intValue();
                    String simpleName = cls.getSimpleName();
                    StringBuilder sb = new StringBuilder();
                    sb.append(AbstractC43591JPw.A00(700));
                    sb.append(simpleName);
                    sb.append(AbstractC111324zv.A00(1383));
                    sb.append(hashMap.get(valueOf));
                    sb.append(" and ");
                    sb.append(i);
                    throw new C50099M9n(this, simpleName, sb.toString(), intValue);
                }
            }
        }
        this.A04.EpB(viewModelListUpdate, interfaceC66382zF);
    }

    public final void A07(InterfaceC66382zF interfaceC66382zF, InterfaceC66482zP interfaceC66482zP, int i) {
        int i2;
        InterfaceC66482zP interfaceC66482zP2;
        ArrayList arrayList = new ArrayList(this.A04.AuX());
        if (i < arrayList.size() && (interfaceC66482zP2 = (InterfaceC66482zP) arrayList.get(i)) != null && interfaceC66482zP2.getKey().equals(interfaceC66482zP.getKey())) {
            i2 = i;
        } else {
            i2 = 0;
            while (i2 < arrayList.size()) {
                if (!((InterfaceC66482zP) arrayList.get(i2)).getKey().equals(interfaceC66482zP.getKey())) {
                    i2++;
                }
            }
            C0K8.A0Q("IgRecyclerViewAdapter", "setModel with invalid index %d, size: %d", Integer.valueOf(i), Integer.valueOf(arrayList.size()));
        }
        if (i2 >= 0 && i2 < arrayList.size()) {
            arrayList.set(i2, interfaceC66482zP);
            ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
            viewModelListUpdate.A01(arrayList);
            A06(viewModelListUpdate, interfaceC66382zF);
            return;
        }
        C0K8.A0Q("IgRecyclerViewAdapter", "setModel with invalid index %d, size: %d", Integer.valueOf(i), Integer.valueOf(arrayList.size()));
    }

    public final void A08(List list) {
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        viewModelListUpdate.A01(list);
        A05(viewModelListUpdate);
    }

    public final boolean A09(int i, Class... clsArr) {
        Object obj = this.A04.AuX().get(i);
        for (Class cls : clsArr) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        int En5 = C2UL.A00.En5(c3oo.mItemViewType);
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) this.A04.AuX().get(i);
        C66462zN c66462zN = this.A03;
        Class<?> cls = interfaceC66482zP.getClass();
        AbstractC66422zJ abstractC66422zJ = (AbstractC66422zJ) c66462zN.A01.get(cls);
        C18C.A08(abstractC66422zJ, cls.getName(), "No definition corresponding to model %s was found");
        try {
            abstractC66422zJ.bind(interfaceC66482zP, c3oo);
            C5GX c5gx = this.A0A;
            if (c5gx != null) {
                c5gx.DZi(i, getItemCount());
            }
            C5GY c5gy = this.A0C;
            if (c5gy != null) {
                View view = c3oo.itemView;
                C14360o3.A0B(view, 0);
                if (interfaceC66482zP instanceof InterfaceC127975qQ) {
                    C41125IIq c41125IIq = c5gy.A00;
                    C38321qM BQN = ((InterfaceC127975qQ) interfaceC66482zP).BQN();
                    C14360o3.A0B(BQN, 1);
                    String id = BQN.getId();
                    if (id != null) {
                        UserSession userSession = c41125IIq.A00;
                        String A33 = BQN.A33();
                        if (A33 == null) {
                            A33 = BQN.CAR();
                        }
                        c41125IIq.A02.A00(null, new J2M(c41125IIq, BQN, AbstractC41071vF.A07(userSession, BQN), A33, i), new BFT(view, c41125IIq.A03, "explore", c41125IIq.A01.getModuleName(), id));
                        c41125IIq.A04.put(Integer.valueOf(view.hashCode()), id);
                    }
                }
            }
            View.OnLongClickListener onLongClickListener = this.A01;
            if (onLongClickListener != null) {
                c3oo.itemView.setOnLongClickListener(onLongClickListener);
            }
            c3oo.itemView.setHapticFeedbackEnabled(this.A00);
            C13490mb.A00.A01(c3oo.itemView, getItemCount(), i);
            String name = abstractC66422zJ.getClass().getName();
            C14360o3.A0B(name, 0);
            C2UL.A00.ASR(AbstractC154506x0.A00(abstractC66422zJ, interfaceC66482zP, name, false, false), En5);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // X.C2UU
    public final void onViewAttachedToWindow(C3OO c3oo) {
        C5GZ c5gz = this.A0B;
        if (c5gz != null) {
            c5gz.E0N(c3oo);
        }
    }

    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        this.A03.A02(c3oo.mItemViewType).unbind(c3oo);
        C5GY c5gy = this.A0C;
        if (c5gy != null) {
            View view = c3oo.itemView;
            C14360o3.A0B(view, 0);
            C41125IIq c41125IIq = c5gy.A00;
            String str = (String) c41125IIq.A04.remove(Integer.valueOf(view.hashCode()));
            if (str != null) {
                c41125IIq.A02.A01(str, view);
            }
        }
    }

    public C66362zD(LayoutInflater layoutInflater, View.OnLongClickListener onLongClickListener, C4FC c4fc, C5GX c5gx, C5GZ c5gz, C66462zN c66462zN, C5GW c5gw, InterfaceC66442zL interfaceC66442zL, C5GY c5gy, Object obj, boolean z) {
        InterfaceC65452xh AMU;
        this.A07 = layoutInflater;
        this.A03 = c66462zN;
        this.A06 = z;
        this.A04 = interfaceC66442zL;
        if (c4fc == null) {
            AMU = new InterfaceC65452xh(this) { // from class: X.2zT
                public final C2UU A00;

                @Override // X.InterfaceC65452xh
                public final void D2j(int i, int i2, Object obj2) {
                    this.A00.notifyItemRangeChanged(i, i2, obj2);
                }

                @Override // X.InterfaceC65452xh
                public final void DMJ(int i, int i2) {
                    this.A00.notifyItemRangeInserted(i, i2);
                }

                @Override // X.InterfaceC65452xh
                public final void DTy(int i, int i2) {
                    this.A00.notifyItemMoved(i, i2);
                }

                @Override // X.InterfaceC65452xh
                public final void DfC(int i, int i2) {
                    this.A00.notifyItemRangeRemoved(i, i2);
                }

                {
                    this.A00 = this;
                }
            };
        } else {
            AMU = c4fc.AMU(this);
        }
        this.A08 = AMU;
        interfaceC66442zL.EYF(AMU);
        this.A0A = c5gx;
        this.A0C = c5gy;
        this.A0B = c5gz;
        this.A01 = onLongClickListener;
        this.A02 = c5gw;
        this.A05 = obj;
        setHasStableIds(true);
    }

    public static C66392zG A00(Context context) {
        return new C66392zG(LayoutInflater.from(context));
    }

    public final long A03(Class cls, Object obj) {
        int A03 = C0f9.A03(-1201403047);
        long A00 = this.A09.A00(cls, obj);
        C0f9.A0A(1656659835, A03);
        return A00;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1766437426);
        int size = this.A04.AuX().size();
        C0f9.A0A(24323517, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(708819069);
        InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) this.A04.AuX().get(i);
        long A00 = this.A09.A00(interfaceC66482zP.getClass(), interfaceC66482zP.getKey());
        C0f9.A0A(458917737, A03);
        return A00;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1931069282);
        Object obj = this.A04.AuX().get(i);
        C66462zN c66462zN = this.A03;
        Class<?> cls = obj.getClass();
        Object obj2 = c66462zN.A02.get(cls);
        C18C.A08(obj2, cls.getName(), "No definition corresponding to model class %s was found");
        int intValue = ((Number) obj2).intValue();
        C0f9.A0A(1500808839, A03);
        return intValue;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3OO createViewHolder;
        C154516x1 A00;
        C13490mb.A00(viewGroup);
        int EnB = C2UL.A00.EnB(i);
        C5GW c5gw = this.A02;
        if (c5gw != null && (createViewHolder = c5gw.AXD(i)) != null) {
            String name = createViewHolder.getClass().getName();
            C14360o3.A0B(name, 0);
            A00 = AbstractC154506x0.A00(createViewHolder, null, name, false, false);
        } else {
            AbstractC66422zJ A02 = this.A03.A02(i);
            createViewHolder = A02.createViewHolder(viewGroup, this.A07);
            String name2 = A02.getClass().getName();
            C14360o3.A0B(name2, 0);
            A00 = AbstractC154506x0.A00(A02, null, name2, false, false);
        }
        C2UL.A00.ASU(A00, EnB);
        return createViewHolder;
    }
}
