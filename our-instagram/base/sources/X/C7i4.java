package X;

import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.ComponentsSystrace;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7i4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7i4 implements InterfaceC169907i5, C2Z7 {
    public final C2Z5 A00;

    @Override // X.InterfaceC169907i5
    public final void EJ6(int i, int i2) {
        C2Z5 c2z5 = this.A00;
        if (c2z5.A08 == null) {
            c2z5.A01 = i;
            c2z5.A03 = 0;
        } else {
            c2z5.A0T.EMQ(i, 0);
        }
    }

    @Override // X.InterfaceC169907i5
    public final void EJM(Integer num, Object obj, int i) {
        int i2;
        C2Z5 c2z5 = this.A00;
        synchronized (c2z5) {
            i2 = 0;
            while (true) {
                List list = c2z5.A0i;
                if (i2 < list.size()) {
                    InterfaceC170717jO A02 = ((C124005jE) list.get(i2)).A02();
                    if (A02 != null && obj.equals(A02.AvD(PublicKeyCredentialControllerUtility.JSON_KEY_ID))) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
        }
        c2z5.A0j(num, i2, 0);
    }

    @Override // X.C2Z7
    public final boolean AFm() {
        return this.A00.A0E;
    }

    @Override // X.InterfaceC169907i5
    public final void AOY(int i) {
        this.A00.A0W(i);
    }

    @Override // X.InterfaceC169907i5
    public final void AOj(int i, int i2) {
        this.A00.A0Z(i, i2);
    }

    @Override // X.C2Z7
    public final int And(int i) {
        return this.A00.And(i);
    }

    @Override // X.InterfaceC169907i5
    public final void COb(InterfaceC170717jO interfaceC170717jO, int i) {
        C2Z5 c2z5 = this.A00;
        C2XV.A00();
        C2Z5.A0H(c2z5);
        if (AbstractC170667jJ.A00) {
            c2z5.hashCode();
            interfaceC170717jO.getName();
        }
        C2Z5.A0R(interfaceC170717jO);
        C124005jE A04 = C2Z5.A04(c2z5, interfaceC170717jO);
        synchronized (c2z5) {
            if (!c2z5.A17) {
                c2z5.A0i.add(i, A04);
                c2z5.A0X.A00(interfaceC170717jO);
            } else {
                throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
            }
        }
        c2z5.A0Q.notifyItemInserted(i);
        C170647jH c170647jH = c2z5.A0Y;
        boolean A03 = c170647jH.A03(i, c2z5.A04);
        C2Z5.A0O(c2z5, i, A03);
        c170647jH.A01(A03);
    }

    @Override // X.InterfaceC169907i5
    public final void COg(List list, int i, int i2) {
        C2Z5 c2z5 = this.A00;
        C2XV.A00();
        C2Z5.A0H(c2z5);
        if (AbstractC170667jJ.A00) {
            String[] strArr = new String[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                strArr[i3] = ((InterfaceC170717jO) list.get(i3)).getName();
            }
            c2z5.hashCode();
            list.size();
            Arrays.toString(strArr);
        }
        synchronized (c2z5) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                InterfaceC170717jO interfaceC170717jO = (InterfaceC170717jO) list.get(i4);
                C2Z5.A0R(interfaceC170717jO);
                C124005jE A04 = C2Z5.A04(c2z5, interfaceC170717jO);
                if (!c2z5.A17) {
                    c2z5.A0i.add(i + i4, A04);
                    c2z5.A0X.A00(interfaceC170717jO);
                } else {
                    throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                }
            }
        }
        c2z5.A0Q.notifyItemRangeInserted(i, list.size());
        C170647jH c170647jH = c2z5.A0Y;
        list.size();
        boolean A03 = c170647jH.A03(i, c2z5.A04);
        C2Z5.A0O(c2z5, i, A03);
        c170647jH.A01(A03);
    }

    @Override // X.C2Z7
    public final boolean CgB() {
        return this.A00.A0r;
    }

    @Override // X.C2Z7
    public final void CpB(C2V9 c2v9, C2Vj c2Vj, int i, int i2) {
        this.A00.CpB(c2v9, c2Vj, i, i2);
    }

    @Override // X.C2Z7
    public final /* bridge */ /* synthetic */ void Cpr(ViewGroup viewGroup) {
        this.A00.Cpr((RecyclerView) viewGroup);
    }

    @Override // X.InterfaceC169907i5
    public final void Cps(int i, int i2) {
        this.A00.A0X(i, i2);
    }

    @Override // X.InterfaceC169907i5
    public final void Ct3(InterfaceC170847jb interfaceC170847jb, boolean z) {
        C2Z5 c2z5 = this.A00;
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02("notifyChangeSetComplete");
        }
        try {
            if (AbstractC170667jJ.A00) {
                c2z5.hashCode();
            }
            C2XV.A00();
            if (!c2z5.A17) {
                interfaceC170847jb.D9D();
                c2z5.A0f.addLast(interfaceC170847jb);
                C2Z5.A0J(c2z5);
                if (z) {
                    C2Z5.A0L(c2z5);
                }
                if (isTracing) {
                    return;
                } else {
                    return;
                }
            }
            throw new RuntimeException("Trying to do a sync notifyChangeSetComplete when using asynchronous mutations!");
        } finally {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
        }
    }

    @Override // X.InterfaceC169907i5
    public final void EJL(Integer num, int i, int i2) {
        this.A00.A0j(num, i, i2);
    }

    @Override // X.InterfaceC169907i5
    public final boolean EpQ() {
        return false;
    }

    @Override // X.C2Z7
    public final /* bridge */ /* synthetic */ void F9H(ViewGroup viewGroup) {
        this.A00.F9H((RecyclerView) viewGroup);
    }

    @Override // X.InterfaceC169907i5
    public final void FA8(InterfaceC170717jO interfaceC170717jO, int i) {
        this.A00.A0i(interfaceC170717jO, i);
    }

    @Override // X.InterfaceC169907i5
    public final void FBw(List list, int i, int i2) {
        this.A00.A0c(i, list);
    }

    @Override // X.C2Z7
    public final void detach() {
        this.A00.detach();
    }

    public C7i4(C2Z5 c2z5) {
        this.A00 = c2z5;
    }
}
