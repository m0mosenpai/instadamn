package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.PickupInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UFa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66389UFa extends AbstractC52922bZ implements InterfaceC71988XEb {
    public ECPPaymentRequest A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public SparseArray A00 = new SparseArray();
    public final C2GS A08 = new C2GT(EnumC68138VCz.A03);
    public final C2GS A06 = new C2GT(C63406Sjd.A03(null));
    public final C58252li A05 = new C58252li();
    public final InterfaceC58362lv A07 = new C70303WQi(this, 14);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r5 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C09530e4 A00(com.facebookpay.expresscheckout.models.PickupInfo r5) {
        /*
            r4 = 0
            r1 = 0
            if (r5 == 0) goto L48
            java.lang.String r2 = r5.A01
            if (r2 == 0) goto L48
            java.lang.String r0 = "\\s+"
            java.util.List r5 = X.AbstractC31175DnJ.A0h(r2, r0)
        Le:
            r3 = 1
            if (r5 == 0) goto L44
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L44
            java.lang.Object r4 = r5.get(r4)
        L1d:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L3e
            int r2 = r5.size()
            r0 = 2
            if (r2 < r0) goto L3e
            int r0 = r5.size()
            java.util.List r3 = r5.subList(r3, r0)
            if (r3 == 0) goto L3e
            java.lang.String r2 = " "
            java.lang.String r0 = ""
            java.lang.String r1 = X.AbstractC001800i.A0P(r2, r0, r0, r3, r1)
        L3e:
            X.0e4 r0 = new X.0e4
            r0.<init>(r4, r1)
            return r0
        L44:
            r4 = r1
            if (r5 == 0) goto L3e
            goto L1d
        L48:
            r5 = r1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66389UFa.A00(com.facebookpay.expresscheckout.models.PickupInfo):X.0e4");
    }

    public final C63406Sjd A01() {
        C69074VhP c69074VhP;
        String str;
        String str2;
        VG3 vg3 = VG3.A0c;
        C63406Sjd A03 = C63406Sjd.A03(new PuxContactItem(vg3, null, null, null, null, null, null, false));
        C63406Sjd c63406Sjd = (C63406Sjd) this.A06.A02();
        if (c63406Sjd != null && (c69074VhP = (C69074VhP) c63406Sjd.A01) != null) {
            if (this.A03) {
                str = ((PickupInfo) c69074VhP.A01).A01;
            } else {
                str = null;
            }
            if (this.A02) {
                str2 = ((PickupInfo) c69074VhP.A01).A00;
            } else {
                str2 = null;
            }
            List A1Q = AbstractC16960so.A1Q(str, str2, this.A04 ? ((PickupInfo) c69074VhP.A01).A03 : null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : A1Q) {
                String str3 = (String) obj;
                if (str3 != null && !AbstractC001900j.A0T(str3)) {
                    arrayList.add(obj);
                }
            }
            PuxContactItem puxContactItem = new PuxContactItem(vg3, null, null, (String) AbstractC001800i.A0O(arrayList, 0), (String) AbstractC001800i.A0O(arrayList, 1), (String) AbstractC001800i.A0O(arrayList, 2), null, false);
            if (A03()) {
                return C63406Sjd.A05(puxContactItem, new X1p(VEP.A1F, 2131961382));
            }
            return C63406Sjd.A04(puxContactItem);
        }
        return A03;
    }

    public final void A02(PickupInfo pickupInfo) {
        if (this.A03) {
            C09530e4 A00 = A00(pickupInfo);
            SparseArray sparseArray = this.A00;
            sparseArray.put(41, A00.A00);
            sparseArray.put(42, A00.A01);
        }
        if (this.A04) {
            this.A00.put(0, pickupInfo.A03);
        }
        if (this.A02) {
            this.A00.put(1, pickupInfo.A00);
        }
        C63406Sjd.A0C(this.A06, new C69074VhP(C05F.A00, pickupInfo, null));
    }

    @Override // X.InterfaceC71988XEb
    public final void AGw(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
    }

    @Override // X.InterfaceC71988XEb
    public final void ARF(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
    }

    @Override // X.InterfaceC71988XEb
    public final void D6l(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, C63406Sjd c63406Sjd) {
    }

    @Override // X.InterfaceC71988XEb
    public final void EJu() {
    }

    @Override // X.InterfaceC71988XEb
    public final void Epg() {
    }

    public final boolean A03() {
        C69074VhP c69074VhP;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        C63406Sjd c63406Sjd = (C63406Sjd) this.A06.A02();
        if (c63406Sjd == null || (c69074VhP = (C69074VhP) c63406Sjd.A01) == null) {
            return true;
        }
        PickupInfo pickupInfo = (PickupInfo) c69074VhP.A01;
        String str2 = pickupInfo.A01;
        String str3 = pickupInfo.A00;
        String str4 = pickupInfo.A03;
        if (this.A03 && (str2 == null || AbstractC001900j.A0T(str2) || (str = (String) this.A00.get(42)) == null || AbstractC001900j.A0T(str))) {
            z = true;
        } else {
            z = false;
        }
        if (this.A02 && (str3 == null || AbstractC001900j.A0T(str3))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.A04 && (str4 == null || AbstractC001900j.A0T(str4))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2 || z3) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71988XEb
    public final C2GS Aup() {
        return this.A08;
    }

    @Override // X.InterfaceC71988XEb
    public final C2GT EMy() {
        return this.A05;
    }

    @Override // X.InterfaceC71988XEb
    public final /* synthetic */ boolean EiA() {
        return true;
    }

    @Override // X.InterfaceC71988XEb
    public final void FBD(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }
}
