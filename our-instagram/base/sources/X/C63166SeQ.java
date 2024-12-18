package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.SeQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63166SeQ {
    public final C1Tc A00;
    public final ContentResolver A01;

    public static Bundle A00(Bundle bundle, C63166SeQ c63166SeQ, String str) {
        Bundle call = c63166SeQ.A01.call(AbstractC62311S6g.A00, str, (String) null, bundle);
        if (call != null) {
            Bundle bundle2 = call.getBundle("exception");
            if (bundle2 == null) {
                return call;
            }
            Throwable A01 = c63166SeQ.A00.A00(bundle2).A01();
            if (A01 instanceof RkF) {
                throw A01;
            }
            throw new RkF(EnumC61155RgG.UNKNOWN, A01);
        }
        throw new RkF(EnumC61155RgG.UNKNOWN, "api response is null");
    }

    public final SIF A02(String str) {
        Integer num;
        EnumC61155RgG enumC61155RgG;
        SJA sja;
        int i;
        try {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("package_name", str);
            Bundle A00 = A00(A0b, this, "get_install_state");
            int intValue = ((Long) AbstractC61805Rtz.A00(A00, Long.class, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE)).intValue();
            Integer[] A002 = C05F.A00(9);
            int length = A002.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    num = A002[i2];
                    switch (num.intValue()) {
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            i = 6;
                            break;
                        case 7:
                            i = 7;
                            break;
                        case 8:
                            i = 8;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (intValue != i) {
                        i2++;
                    }
                } else {
                    num = C05F.A00;
                }
            }
            int intValue2 = ((Long) AbstractC61805Rtz.A00(A00, Long.class, "error_type")).intValue();
            EnumC61155RgG[] values = EnumC61155RgG.values();
            int length2 = values.length;
            int i3 = 0;
            while (true) {
                if (i3 < length2) {
                    enumC61155RgG = values[i3];
                    if (intValue2 != enumC61155RgG.A00) {
                        i3++;
                    }
                } else {
                    enumC61155RgG = EnumC61155RgG.UNKNOWN;
                }
            }
            Bundle bundle = A00.getBundle("referrer_details");
            if (bundle == null) {
                sja = new SJA(new SZC("appmanager_unknown", "appmanager_unknown", "appmanager_missing_referrer_details_bundle", "appmanager_unknown", "appmanager_unknown", "appmanager_unknown", "", ""), "", "", "", 0, 0L, 0L, 0L);
            } else {
                long j = bundle.getLong("referrer_click_timestamp_seconds");
                long j2 = bundle.getLong("install_begin_timestamp_seconds");
                long j3 = bundle.getLong("first_install_time");
                int i4 = bundle.getInt("installed_version_code");
                sja = new SJA(SZC.A00(bundle.getBundle("utm")), bundle.getString("installed_version_name", ""), bundle.getString("installation_method_type", ""), bundle.getString("installation_uuid", ""), i4, j, j2, j3);
            }
            SIF sif = new SIF(enumC61155RgG, sja, num);
            sif.A00 = A00.getLong("downloaded_size_bytes", 0L);
            sif.A01 = A00.getLong("total_download_size_bytes", 0L);
            return sif;
        } catch (RkF e) {
            throw e;
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new RkF(EnumC61155RgG.INTERNAL_UNRECOVERABLE, e2);
        } catch (IllegalStateException e3) {
            throw new RkF(EnumC61155RgG.UNKNOWN, e3);
        } catch (Exception e4) {
            throw new RkF(EnumC61155RgG.UNKNOWN, e4);
        }
    }

    public C63166SeQ(ContentResolver contentResolver, C1Tc c1Tc) {
        this.A00 = c1Tc;
        this.A01 = contentResolver;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1Tc, java.lang.Object] */
    public static C63166SeQ A01(Context context, Object obj) {
        ContentResolver contentResolver = context.getContentResolver();
        LVZ lvz = new LVZ(obj, 0);
        ?? obj2 = new Object();
        obj2.A00 = lvz;
        return new C63166SeQ(contentResolver, obj2);
    }
}
