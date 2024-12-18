package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.SzC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64095SzC implements InterfaceC65343TiQ {
    public final /* synthetic */ C1RU A00;

    public C64095SzC(C1RU c1ru) {
        this.A00 = c1ru;
    }

    @Override // X.InterfaceC65343TiQ
    public final void Dkt(long j) {
        Rg6 rg6;
        EnumC61164RgQ enumC61164RgQ;
        try {
            C1RU c1ru = this.A00;
            C1Rm c1Rm = c1ru.A00;
            if (c1Rm == null) {
                C0K8.A0D("FacebookVoltronDownloader", "modules api is null when on session changed callback is hit");
                return;
            }
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
                        AbstractC62786SRe.A01(bundle2, Long.class, A00);
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
                            new HashSet(Arrays.asList(strArr2));
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
                            if (enumC61164RgQ == EnumC61164RgQ.INSTALLED) {
                                C19490xZ c19490xZ = c1ru.A02;
                                Context context = c1ru.A01;
                                Context createPackageContext = context.createPackageContext(context.getPackageName(), 0);
                                if (!c19490xZ.A00.getApplicationInfo().sourceDir.equals(createPackageContext.getApplicationInfo().sourceDir)) {
                                    c19490xZ.A00 = createPackageContext;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C0K8.A0F("FacebookVoltronDownloader", "Oxygen request failed", th);
        }
    }
}
