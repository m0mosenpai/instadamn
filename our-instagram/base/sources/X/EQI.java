package X;

import android.content.Context;
import android.widget.ListAdapter;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQI extends C2US implements InterfaceC65242xM, InterfaceC65252xN, ListAdapter {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final C32949Eeg A04;
    public final boolean A05;
    public final C65662y2 A06;
    public final InterfaceC65952yX A07;
    public final ESD A08;
    public final V3C A09;
    public final C152996uT A0A;
    public final InterfaceC62602sz A0B;
    public final C65842yM A0C;
    public final boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2xV, X.Eeg] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.ESD] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.2y2, java.lang.Object] */
    public EQI(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69247VkG c69247VkG, ENX enx, InterfaceC62602sz interfaceC62602sz, String str, boolean z, boolean z2) {
        super(false);
        InterfaceC65642y0[] interfaceC65642y0Arr;
        boolean z3;
        C14360o3.A0B(userSession, 2);
        this.A0D = z;
        this.A0B = interfaceC62602sz;
        this.A05 = z2;
        ?? obj = new Object();
        this.A06 = obj;
        C65842yM c65842yM = new C65842yM(context);
        this.A0C = c65842yM;
        V3C v3c = new V3C(context, interfaceC11380iw, userSession, c69247VkG, enx, z, z2);
        this.A09 = v3c;
        ?? obj2 = new Object();
        this.A08 = obj2;
        this.A04 = new AbstractC65332xV();
        this.A07 = new G7Q(userSession, this);
        C152996uT c152996uT = new C152996uT(context);
        this.A0A = c152996uT;
        if (str != null) {
            if ((AbstractC35085Fcw.A01(userSession) && AbstractC31172DnG.A1Z(userSession, str)) || (AbstractC35085Fcw.A00(userSession) && !AbstractC31172DnG.A1Z(userSession, str))) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.A03 = z3;
        }
        if (z && !this.A03) {
            InterfaceC65642y0[] interfaceC65642y0Arr2 = new InterfaceC65642y0[4];
            interfaceC65642y0Arr2[0] = v3c;
            interfaceC65642y0Arr2[1] = obj2;
            interfaceC65642y0Arr = interfaceC65642y0Arr2;
        } else {
            InterfaceC65642y0[] interfaceC65642y0Arr3 = new InterfaceC65642y0[4];
            interfaceC65642y0Arr3[0] = obj;
            interfaceC65642y0Arr3[1] = v3c;
            interfaceC65642y0Arr = interfaceC65642y0Arr3;
        }
        interfaceC65642y0Arr[2] = c152996uT;
        interfaceC65642y0Arr[3] = c65842yM;
        init(interfaceC65642y0Arr);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public static final void A00(EQI eqi) {
        Integer num;
        C32949Eeg c32949Eeg = eqi.A04;
        c32949Eeg.A08(eqi.A07);
        if (eqi.A02 && c32949Eeg.A02() == 0) {
            C1571273r c1571273r = new C1571273r();
            c1571273r.A0M = true;
            boolean z = eqi.A0D;
            c1571273r.A0L = !z;
            c1571273r.A0P = z;
            eqi.addModel(c1571273r, EnumC153216up.A06, eqi.A0A);
        } else {
            eqi.A01 = 0;
            eqi.A00 = 0;
            eqi.clear();
            if (eqi.A0D && !eqi.A03) {
                eqi.addModel(c32949Eeg, null, eqi.A08);
            } else {
                eqi.addModel(null, eqi.A06);
            }
            for (int i = 0; i < c32949Eeg.A01.size(); i += 2) {
                C153126ug c153126ug = new C153126ug(c32949Eeg.A01, i, 2);
                if (i == 0) {
                    num = C05F.A01;
                } else if (i + 2 >= c32949Eeg.A01.size()) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
                eqi.addModel(c153126ug, new C69031VgB(i, num), eqi.A09);
                int A01 = c153126ug.A01();
                for (int i2 = 0; i2 < A01; i2++) {
                    if (((SavedCollection) c153126ug.A02(i2)).A07 == EnumC33416Epn.A0A) {
                        eqi.A01++;
                    }
                    eqi.A00++;
                }
            }
            eqi.addModel(eqi.A0B, eqi.A0C);
        }
        eqi.notifyDataSetChanged();
    }

    public final void A01(C38321qM c38321qM) {
        C32949Eeg c32949Eeg = this.A04;
        C14360o3.A0B(c32949Eeg, 0);
        int size = c32949Eeg.A01.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            SavedCollection savedCollection = (SavedCollection) c32949Eeg.A01.get(i);
            if (savedCollection.A07 == EnumC33416Epn.A05) {
                List unmodifiableList = Collections.unmodifiableList(savedCollection.A0L);
                ArrayList A10 = AbstractC31174DnI.A10(unmodifiableList);
                A10.add(c38321qM);
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    C38321qM A0i = AbstractC31172DnG.A0i(it);
                    if (!AbstractC35236FgV.A05(c38321qM, A0i)) {
                        A10.add(A0i);
                    }
                }
                savedCollection.A0L = A10;
            } else {
                i++;
            }
        }
        A00(this);
    }

    public final boolean A02(C38321qM c38321qM) {
        C32949Eeg c32949Eeg = this.A04;
        C14360o3.A0B(c32949Eeg, 0);
        int size = c32949Eeg.A01.size();
        for (int i = 0; i < size; i++) {
            C38321qM c38321qM2 = ((SavedCollection) c32949Eeg.A01.get(i)).A04;
            if (c38321qM2 != null && AbstractC35236FgV.A05(c38321qM2, c38321qM)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        if (!this.A0D || this.A03) {
            this.A06.A03 = i;
        }
        A00(this);
    }

    @Override // X.C2UT, android.widget.Adapter
    public final boolean isEmpty() {
        if (this.A04.A02() != 0) {
            return false;
        }
        return true;
    }
}
