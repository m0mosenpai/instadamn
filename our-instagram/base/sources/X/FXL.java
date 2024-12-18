package X;

import android.os.Bundle;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes6.dex */
public abstract class FXL {
    public static EM6 A00(EnumC39551HdN enumC39551HdN, SavedCollection savedCollection, EnumC39557HdT enumC39557HdT, String str, String str2) {
        AbstractC167007dF.A1E(str, 0, str2);
        EM6 em6 = new EM6();
        Bundle A09 = AbstractC31176DnK.A09(str);
        A09.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", enumC39551HdN);
        A09.putParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
        A09.putString("prior_module", str2);
        if (enumC39557HdT != null) {
            A09.putSerializable("SaveFragment.ARGUMENT_SAVED_COLLECTION_STARTING_TAB_TYPE", enumC39557HdT);
        }
        em6.setArguments(A09);
        return em6;
    }

    public static EM6 A01(EnumC39551HdN enumC39551HdN, EnumC33416Epn enumC33416Epn, String str, String str2, String str3) {
        AbstractC167007dF.A1F(str, 0, str3);
        EM6 em6 = new EM6();
        Bundle A09 = AbstractC31176DnK.A09(str);
        A09.putSerializable("SaveFragment.SAVE_HOME_TAB_MODE", enumC39551HdN);
        A09.putString("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_ID", str2);
        A09.putSerializable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_TYPE", enumC33416Epn);
        A09.putString("prior_module", str3);
        em6.setArguments(A09);
        return em6;
    }
}
