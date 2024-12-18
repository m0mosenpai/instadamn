package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10300gw {
    public Integer A00;
    public Integer A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Fragment A07;
    public final C016206f A08;
    public final List A09;
    public final List A0A;
    public final List A0B;

    public final void A00() {
        this.A06 = false;
        if (!this.A04) {
            AbstractC10360h2.A0H(2);
            this.A04 = true;
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.A07.mTransitioning = false;
        this.A08.A03();
    }

    public final void A01(ViewGroup viewGroup) {
        this.A06 = false;
        if (!this.A03) {
            this.A03 = true;
            if (this.A09.isEmpty()) {
                A00();
                return;
            }
            for (AnonymousClass073 anonymousClass073 : AbstractC001800i.A0a(this.A0B)) {
                if (!anonymousClass073.A00) {
                    anonymousClass073.A04(viewGroup);
                }
                anonymousClass073.A00 = true;
            }
        }
    }

    public final void A03(Integer num, Integer num2) {
        Integer num3;
        C14360o3.A0B(num, 0);
        int intValue = num2.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 0 && this.A00 != C05F.A00) {
                    AbstractC10360h2.A0H(2);
                    this.A00 = num;
                    return;
                }
                return;
            }
            AbstractC10360h2.A0H(2);
            this.A00 = C05F.A00;
            num3 = C05F.A0C;
        } else {
            if (this.A00 != C05F.A00) {
                return;
            }
            AbstractC10360h2.A0H(2);
            num3 = C05F.A01;
            this.A00 = num3;
        }
        this.A01 = num3;
        this.A02 = true;
    }

    public C10300gw(C016206f c016206f, Integer num, Integer num2) {
        Fragment fragment = c016206f.A02;
        this.A00 = num;
        this.A01 = num2;
        this.A07 = fragment;
        this.A0A = new ArrayList();
        this.A02 = true;
        ArrayList arrayList = new ArrayList();
        this.A09 = arrayList;
        this.A0B = arrayList;
        this.A08 = c016206f;
    }

    public final void A02(AnonymousClass073 anonymousClass073) {
        List list = this.A09;
        if (list.remove(anonymousClass073) && list.isEmpty()) {
            A00();
        }
    }

    public final String toString() {
        String str;
        String str2;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        StringBuilder sb = new StringBuilder();
        sb.append("Operation {");
        sb.append(hexString);
        sb.append("} {finalState = ");
        switch (this.A00.intValue()) {
            case 0:
                str = "REMOVED";
                break;
            case 1:
                str = "VISIBLE";
                break;
            case 2:
                str = "GONE";
                break;
            default:
                str = "INVISIBLE";
                break;
        }
        sb.append(str);
        sb.append(" lifecycleImpact = ");
        switch (this.A01.intValue()) {
            case 0:
                str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            case 1:
                str2 = "ADDING";
                break;
            default:
                str2 = "REMOVING";
                break;
        }
        sb.append(str2);
        sb.append(" fragment = ");
        sb.append(this.A07);
        sb.append('}');
        return sb.toString();
    }
}
