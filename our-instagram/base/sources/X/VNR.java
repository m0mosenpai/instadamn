package X;

import android.util.SparseArray;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class VNR {
    public static final SparseArray A00() {
        SparseArray sparseArray = new SparseArray();
        WFY.A02();
        WFY.A03(sparseArray, new WbA(sparseArray, R.style.BSCIGTheme), 33);
        WFY.A02();
        WFY.A03(sparseArray, new WbD(WFY.A00(R.style.BSCIGTheme_NotificationIconTheme), WFY.A01(R.style.BSCIGTheme_NotificationTextTheme), new Wb4(R.style.BSCIGTheme_BSCRoundedIconXSTheme), R.style.BSCIGTheme_ListCellTopAlignmentTheme_NotificationInfoListCellTheme), 34);
        WFY.A02();
        sparseArray.put(35, new WbD(null, new Wb3(R.style.BSCIGTheme), null, R.style.BSCIGTheme_ListCellTopAlignmentTheme_NotificationInfoListCellTheme));
        return sparseArray;
    }
}
