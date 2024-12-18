package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonIntf;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveIntf;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I3c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40722I3c {
    public static Map A00(IgFundedIncentiveIntf igFundedIncentiveIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (igFundedIncentiveIntf.AfO() != null) {
            IgFundedIncentiveBannerIconType AfO = igFundedIncentiveIntf.AfO();
            if (AfO != null) {
                str = AfO.A00;
            } else {
                str = null;
            }
            A1I.put("banner_icon", str);
        }
        if (igFundedIncentiveIntf.As1() != null) {
            A1I.put("countdown_expiration_time", igFundedIncentiveIntf.As1());
        }
        if (igFundedIncentiveIntf.As2() != null) {
            A1I.put("countdown_grace_period", igFundedIncentiveIntf.As2());
        }
        if (igFundedIncentiveIntf.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, igFundedIncentiveIntf.getDescription());
        }
        if (igFundedIncentiveIntf.AxB() != null) {
            List<IgFundedIncentiveDetail> AxB = igFundedIncentiveIntf.AxB();
            if (AxB != null) {
                arrayList = AbstractC166987dD.A1E();
                for (IgFundedIncentiveDetail igFundedIncentiveDetail : AxB) {
                    if (igFundedIncentiveDetail != null) {
                        arrayList.add(igFundedIncentiveDetail.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("details", arrayList);
        }
        if (igFundedIncentiveIntf.B6Z() != null) {
            IgFundedIncentiveBannerButtonIntf B6Z = igFundedIncentiveIntf.B6Z();
            if (B6Z != null) {
                treeUpdaterJNI = B6Z.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("first_button", treeUpdaterJNI);
        }
        igFundedIncentiveIntf.BC3();
        A1I.put("has_line_break", Boolean.valueOf(igFundedIncentiveIntf.BC3()));
        if (igFundedIncentiveIntf.BHK() != null) {
            A1I.put("incentive_id", igFundedIncentiveIntf.BHK());
        }
        igFundedIncentiveIntf.CZJ();
        A1I.put("is_navigated_from_bottom_sheet", Boolean.valueOf(igFundedIncentiveIntf.CZJ()));
        if (igFundedIncentiveIntf.BYL() != null) {
            A1I.put("nux_dialog_subtitle", igFundedIncentiveIntf.BYL());
        }
        if (igFundedIncentiveIntf.BYM() != null) {
            A1I.put("nux_dialog_title", igFundedIncentiveIntf.BYM());
        }
        if (igFundedIncentiveIntf.BYN() != null) {
            IgFundedIncentiveNuxDisplayStyle BYN = igFundedIncentiveIntf.BYN();
            C14360o3.A0B(BYN, 0);
            A1I.put("nux_display_style", BYN.A00);
        }
        if (igFundedIncentiveIntf.BrK() != null) {
            IgFundedIncentiveBannerButtonIntf BrK = igFundedIncentiveIntf.BrK();
            if (BrK != null) {
                treeUpdaterJNI2 = BrK.F7o();
            }
            A1I.put("second_button", treeUpdaterJNI2);
        }
        igFundedIncentiveIntf.Bvi();
        A1I.put("should_show_shop_eligible_items_button", Boolean.valueOf(igFundedIncentiveIntf.Bvi()));
        if (igFundedIncentiveIntf.getTitle() != null) {
            AbstractC37300Gc1.A17(igFundedIncentiveIntf.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
