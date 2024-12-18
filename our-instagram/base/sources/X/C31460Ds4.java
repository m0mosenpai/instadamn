package X;

import android.content.Context;
import android.content.pm.ResolveInfo;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit$$ExternalSyntheticBackport0;
import com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.meta.foa.accountswitcher.UserAccountInfo;
import java.text.Collator;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Ds4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31460Ds4 implements Comparator {
    public final int A00;
    public final Object A01;

    public C31460Ds4(InterfaceC16620sF interfaceC16620sF, int i) {
        this.A00 = i;
        this.A01 = interfaceC16620sF;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        long j;
        long j2;
        C81663kb c81663kb;
        switch (this.A00) {
            case 4:
                UserSession userSession = ((DirectShareSheetFragmentViewModel) this.A01).A0M;
                return C2BS.A00((Comparable) C23031Ai.A02(AbstractC23021Ah.A00(userSession), "contacts_in_sharesheet_access_map").get(String.valueOf(obj2.hashCode())), (Comparable) C23031Ai.A02(AbstractC23021Ah.A00(userSession), "contacts_in_sharesheet_access_map").get(String.valueOf(obj.hashCode())));
            case 5:
                int compare = ((Comparator) this.A01).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return C2BS.A00(((C26055Bfi) obj).A03, ((C26055Bfi) obj2).A03);
            case 6:
            case 7:
            case 11:
            case 16:
            case 18:
            case Process.SIGSTOP /* 19 */:
            default:
                return ((Number) ((InterfaceC16620sF) this.A01).invoke(obj, obj2)).intValue();
            case 8:
                InterfaceC83713oG interfaceC83713oG = ((DirectShareTarget) obj).A09;
                interfaceC83713oG.getClass();
                DirectThreadKey A01 = JRE.A01(AbstractC140946Yw.A06(interfaceC83713oG));
                InterfaceC83713oG interfaceC83713oG2 = ((DirectShareTarget) obj2).A09;
                interfaceC83713oG2.getClass();
                DirectThreadKey A012 = JRE.A01(AbstractC140946Yw.A06(interfaceC83713oG2));
                C81663kb c81663kb2 = null;
                if (A01 != null) {
                    c81663kb = C2DU.A03((C2DU) ((C2DS) ((C31675Dvg) this.A01).A06.get()), A01);
                } else {
                    c81663kb = null;
                }
                if (A012 != null) {
                    c81663kb2 = C2DU.A03((C2DU) ((C2DS) ((C31675Dvg) this.A01).A06.get()), A012);
                }
                if (c81663kb != null) {
                    if (c81663kb2 == null) {
                        return -1;
                    }
                    Comparator comparator = C2EC.A00;
                    C14360o3.A0A(comparator);
                    return comparator.compare(c81663kb, c81663kb2);
                }
                if (c81663kb == c81663kb2) {
                    return 0;
                }
                return 1;
            case 9:
                DirectShareTarget directShareTarget = (DirectShareTarget) obj;
                DirectShareTarget directShareTarget2 = (DirectShareTarget) obj2;
                int compare2 = ((C31675Dvg) this.A01).A03.compare(directShareTarget, directShareTarget2);
                if (compare2 != 0) {
                    return compare2;
                }
                String str = directShareTarget.A0I;
                if (str == null) {
                    str = "";
                }
                String str2 = directShareTarget2.A0I;
                if (str2 == null) {
                    str2 = "";
                }
                return str.compareTo(str2);
            case 10:
                C2EH c2eh = (C2EH) obj;
                C2EH c2eh2 = (C2EH) obj2;
                if (c2eh2.BLF() <= c2eh.BLF()) {
                    if (c2eh2.BLF() < c2eh.BLF()) {
                        return -1;
                    }
                    return 0;
                }
                return 1;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                ResolveInfo resolveInfo2 = (ResolveInfo) obj2;
                boolean z = resolveInfo.isDefault;
                boolean z2 = resolveInfo2.isDefault;
                if (z == z2) {
                    List list = (List) this.A01;
                    return list.indexOf(resolveInfo2.resolvePackageName) - list.indexOf(resolveInfo.resolvePackageName);
                }
                return LocalInjectionUnit$$ExternalSyntheticBackport0.m(z2, z);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                Context context = (Context) this.A01;
                C32110E9i c32110E9i = (C32110E9i) obj;
                C32110E9i c32110E9i2 = (C32110E9i) obj2;
                if (!c32110E9i.equals(c32110E9i2)) {
                    Locale locale = c32110E9i.A03;
                    Locale locale2 = Locale.US;
                    if (!locale.equals(locale2)) {
                        if (!c32110E9i2.A03.equals(locale2)) {
                            return context.getString(c32110E9i.A01).compareTo(context.getString(c32110E9i2.A01));
                        }
                        return 1;
                    }
                    return -1;
                }
                return 0;
            case 14:
                C31690Dvv c31690Dvv = (C31690Dvv) this.A01;
                HashMap hashMap = c31690Dvv.A01;
                String str3 = ((C31691Dvw) obj2).A02;
                Number number = (Number) hashMap.get(str3);
                InterfaceC09390do interfaceC09390do = c31690Dvv.A02;
                Iterator it = ((List) ((C05A) interfaceC09390do.getValue()).getValue()).iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (it.hasNext()) {
                        if (!C14360o3.A0K(((C31691Dvw) it.next()).A02, str3)) {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                long j3 = i3;
                if (number != null) {
                    j = number.longValue();
                } else {
                    j = -j3;
                }
                Long valueOf = Long.valueOf(j);
                String str4 = ((C31691Dvw) obj).A02;
                Number number2 = (Number) hashMap.get(str4);
                Iterator it2 = ((List) ((C05A) interfaceC09390do.getValue()).getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (C14360o3.A0K(((C31691Dvw) it2.next()).A02, str4)) {
                            i = i2;
                        } else {
                            i2++;
                        }
                    }
                }
                long j4 = i;
                if (number2 != null) {
                    j2 = number2.longValue();
                } else {
                    j2 = -j4;
                }
                return C2BS.A00(valueOf, Long.valueOf(j2));
            case Process.SIGTERM /* 15 */:
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                return C2BS.A00((Integer) interfaceC16660sJ.invoke(obj), (Integer) interfaceC16660sJ.invoke(obj2));
            case 17:
                C83803oP c83803oP = (C83803oP) obj;
                C83803oP c83803oP2 = (C83803oP) obj2;
                C14360o3.A0B(c83803oP, 0);
                C14360o3.A0B(c83803oP2, 1);
                String str5 = c83803oP.A07;
                String str6 = c83803oP2.A07;
                if (str5 == null) {
                    if (str6 != null) {
                        return 1;
                    }
                    return 0;
                }
                if (str6 != null) {
                    return ((Collator) this.A01).compare(str5, str6);
                }
                return -1;
            case 20:
                return ((Collator) this.A01).compare(((User) obj).B8y(), ((User) obj2).B8y());
            case 21:
                List list2 = (List) this.A01;
                String str7 = ((UserAccountInfo) obj).A00;
                C14360o3.A0B(list2, 0);
                return C2BS.A00(Integer.valueOf(list2.indexOf(str7)), Integer.valueOf(list2.indexOf(((UserAccountInfo) obj2).A00)));
        }
    }

    public C31460Ds4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C31460Ds4() {
        this.A00 = 17;
        this.A01 = Collator.getInstance(C1Q2.A02());
    }
}
