package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.msc.logging.LoggingData;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.Uwy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC67731Uwy extends SNK {
    public final Context A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    @Override // X.SNK
    public Fragment A01(Bundle bundle, String str) {
        Bundle bundle2;
        int i;
        int i2;
        Fragment uf1;
        String A02;
        C14360o3.A0B(str, 0);
        switch (str.hashCode()) {
            case -1868875270:
                if (str.equals("transactions_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 8;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case -1532810832:
                if (str.equals("home_fragment")) {
                    uf1 = new UF0();
                    uf1.setArguments(bundle);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case -1260171540:
                if (str.equals("settings_fragment")) {
                    Bundle bundle3 = new Bundle(bundle);
                    Context context = this.A00;
                    IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(C023409i.A0A.A08(C2FP.A00()));
                    LoggingData loggingData = (LoggingData) bundle3.getParcelable("logging_data");
                    if (loggingData != null) {
                        A02 = loggingData.A00;
                    } else {
                        A02 = AbstractC58442PvL.A02();
                    }
                    String string = bundle3.getString("page_id");
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    HashMap hashMap3 = new HashMap();
                    BitSet bitSet = new BitSet(2);
                    hashMap.put("upl_session_id", A02);
                    bitSet.set(1);
                    hashMap.put("referrer", "bpa_home");
                    bitSet.set(0);
                    hashMap.put(MSV.A00(246), string);
                    if (bitSet.nextClearBit(0) >= 2) {
                        C66277U6x c66277U6x = new C66277U6x(AbstractC191768eY.A01(hashMap), hashMap2, "com.bloks.www.bsc.settings");
                        AbstractC31178DnM.A1M(c66277U6x, 667749724);
                        c66277U6x.A03 = null;
                        c66277U6x.A02 = null;
                        c66277U6x.A04 = null;
                        c66277U6x.A08(hashMap3);
                        return c66277U6x.A03(context, igBloksScreenConfig);
                    }
                    throw new IllegalStateException("Missing Required Props");
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case -1222594761:
                if (str.equals("filter_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i2 = 9;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i2));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case -992545463:
                if (str.equals("app_dialog_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 13;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case -966253274:
                if (str.equals("earnings_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 2;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case -895051645:
                if (str.equals("earnings_details_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 7;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case 48250454:
                if (str.equals("overview_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 5;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case 1148185282:
                if (str.equals("payouts_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 1;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case 1392861541:
                if (str.equals("info_tip_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 12;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case 1423175472:
                if (str.equals("fe_selector_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i2 = 6;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i2));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case 1536698909:
                if (str.equals("payout_details_v2_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 11;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case 1572489632:
                if (str.equals("earnings_details_v2_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 10;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            case 1927794982:
                if (str.equals("payout_details_fragment")) {
                    bundle2 = new Bundle(bundle);
                    i = 4;
                    bundle2.putSerializable("viewmodel_class", Integer.valueOf(i));
                    uf1 = new UF1();
                    uf1.setArguments(bundle2);
                    return uf1;
                }
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
            default:
                throw AbstractC167007dF.A0c("BSCFragmentFactory does not support ", str);
        }
    }

    public AbstractC67731Uwy(Context context, InterfaceC08830cm interfaceC08830cm) {
        super(interfaceC08830cm);
        this.A00 = context;
    }
}
