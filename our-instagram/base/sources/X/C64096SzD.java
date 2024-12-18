package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.SzD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64096SzD implements InterfaceC65343TiQ {
    public final Context A00;
    public final C1Rm A01;
    public final HashMap A02 = AbstractC166987dD.A1G();
    public final C1Rm A03;

    @Override // X.InterfaceC65343TiQ
    public final void Dkt(long j) {
        Rg6 rg6;
        EnumC61164RgQ enumC61164RgQ;
        HashMap hashMap;
        C58427Pv6 c58427Pv6;
        Integer num;
        try {
            C1Rm c1Rm = this.A01;
            Bundle A0b = AbstractC166987dD.A0b();
            String A00 = AbstractC58354Ptu.A00();
            A0b.putLong(A00, j);
            Bundle A002 = C1Rm.A00(A0b, c1Rm, "get_module_session_state");
            C1Rm.A01(A002, c1Rm);
            Bundle bundle = A002.getBundle(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
            if (bundle != null) {
                AbstractC61803Rtx.A00(bundle, Integer.class, "protocol_version");
                AbstractC61803Rtx.A00(bundle, Long.class, A00);
                AbstractC61803Rtx.A00(bundle, String.class, "package_name");
                int A07 = AbstractC58318PtA.A07(AbstractC61803Rtx.A00(bundle, Integer.class, "flow"));
                String[] strArr = (String[]) AbstractC61803Rtx.A00(bundle, String[].class, "modules");
                Bundle bundle2 = (Bundle) AbstractC61803Rtx.A00(bundle, Bundle.class, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                if (strArr.length != 0) {
                    new HashSet(Arrays.asList(strArr));
                    Rg6[] values = Rg6.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            rg6 = values[i];
                            if (rg6.A00 == A07) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            C0K8.A09(Rg6.class, "Invalid Flow: %d", AbstractC25228BEl.A1Y(A07));
                            rg6 = Rg6.UNKNOWN;
                            break;
                        }
                    }
                    if (rg6 == Rg6.INSTALL) {
                        int A003 = AbstractC62786SRe.A00(bundle2, "protocol_version");
                        Long l = (Long) AbstractC62786SRe.A01(bundle2, Long.class, A00);
                        AbstractC62786SRe.A01(bundle2, String.class, "package_name");
                        String[] strArr2 = (String[]) AbstractC62786SRe.A01(bundle2, String[].class, "modules");
                        int A004 = AbstractC62786SRe.A00(bundle2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
                        EnumC61164RgQ[] values2 = EnumC61164RgQ.values();
                        int length2 = values2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                enumC61164RgQ = values2[i2];
                                if (enumC61164RgQ.A00 == A004) {
                                    break;
                                } else {
                                    i2++;
                                }
                            } else {
                                C0K8.A09(EnumC61164RgQ.class, "Invalid State: %d", AbstractC25228BEl.A1Y(A004));
                                enumC61164RgQ = EnumC61164RgQ.UNKNOWN;
                                break;
                            }
                        }
                        RhV.A00(AbstractC62786SRe.A00(bundle2, TraceFieldType.ErrorCode));
                        if (strArr2.length != 0) {
                            HashSet A13 = AbstractC58319PtB.A13(strArr2);
                            if (A003 > 1 && enumC61164RgQ == EnumC61164RgQ.PENDING_USER_ACTION) {
                                AbstractC62786SRe.A01(bundle2, String.class, "installer_pending_user_action_intent_uri");
                                AbstractC61804Rty.A00(AbstractC62786SRe.A00(bundle2, "pending_user_action_handling_type"));
                            }
                            if (enumC61164RgQ == EnumC61164RgQ.DOWNLOADING || enumC61164RgQ == EnumC61164RgQ.DOWNLOADED) {
                                AbstractC62786SRe.A01(bundle2, Long.class, "bytes_downloaded");
                                AbstractC62786SRe.A01(bundle2, Long.class, "total_bytes_to_download");
                            }
                            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("module_file_infos");
                            if (enumC61164RgQ == EnumC61164RgQ.DOWNLOADED) {
                                if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                                    ArrayList A11 = AbstractC58319PtB.A11(parcelableArrayList);
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        A11.add(C63207SfB.A00((Bundle) it.next()));
                                    }
                                } else {
                                    throw AbstractC166987dD.A14("Module files not provided.");
                                }
                            } else if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                                throw AbstractC166987dD.A14("Module files provided on wrong state.");
                            }
                            synchronized (this) {
                                try {
                                    hashMap = this.A02;
                                    c58427Pv6 = (C58427Pv6) hashMap.get(l);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (c58427Pv6 != null) {
                                int ordinal = enumC61164RgQ.ordinal();
                                if (ordinal != 3 && ordinal != 2) {
                                    if (ordinal != 7 && ordinal == 1) {
                                        num = C05F.A0C;
                                        c58427Pv6.A01(true);
                                    } else {
                                        return;
                                    }
                                } else {
                                    num = C05F.A0N;
                                    c58427Pv6.A01(true);
                                }
                                synchronized (this) {
                                    hashMap.remove(l);
                                }
                                Iterator it2 = AbstractC31171DnF.A0k(A13).iterator();
                                while (it2.hasNext()) {
                                    C0g3.A00().A05(AbstractC166987dD.A1B(it2), num);
                                }
                                return;
                            }
                            return;
                        }
                        throw AbstractC166987dD.A14("Module names not found.");
                    }
                    if (rg6 == Rg6.DELETE) {
                        AbstractC61802Rtw.A00(bundle2, Integer.class, "protocol_version");
                        AbstractC61802Rtw.A00(bundle2, Long.class, A00);
                        AbstractC61802Rtw.A00(bundle2, String.class, "package_name");
                        String[] strArr3 = (String[]) AbstractC61802Rtw.A00(bundle2, String[].class, "modules");
                        Integer num2 = (Integer) AbstractC61802Rtw.A00(bundle2, Integer.class, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
                        int intValue = num2.intValue();
                        EnumC61154RgF[] values3 = EnumC61154RgF.values();
                        int length3 = values3.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length3) {
                                if (values3[i3].A00 == intValue) {
                                    break;
                                } else {
                                    i3++;
                                }
                            } else {
                                C0K8.A09(EnumC61154RgF.class, "Invalid State: %d", num2);
                                break;
                            }
                        }
                        Integer num3 = (Integer) AbstractC61802Rtw.A00(bundle2, Integer.class, TraceFieldType.ErrorCode);
                        int intValue2 = num3.intValue();
                        EnumC61144Rfz[] values4 = EnumC61144Rfz.values();
                        int length4 = values4.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length4) {
                                if (values4[i4].A00 == intValue2) {
                                    break;
                                } else {
                                    i4++;
                                }
                            } else {
                                C0K8.A09(EnumC61144Rfz.class, "Invalid Reason: %d", num3);
                                break;
                            }
                        }
                        if (strArr3.length != 0) {
                            new HashSet(Arrays.asList(strArr3));
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public C64096SzD(Context context, C1Rm c1Rm) {
        this.A01 = c1Rm;
        this.A00 = context;
        this.A03 = c1Rm;
    }
}
