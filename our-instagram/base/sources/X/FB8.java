package X;

import android.os.Bundle;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes6.dex */
public abstract class FB8 {
    public static final EM6 A00(Bundle bundle) {
        FB6.A00();
        String string = bundle.getString("IgSessionManager.SESSION_TOKEN_KEY");
        if (string == null) {
            string = "";
        }
        EnumC39551HdN enumC39551HdN = (EnumC39551HdN) bundle.getSerializable("SaveFragment.SAVE_HOME_TAB_MODE", EnumC39551HdN.class);
        if (enumC39551HdN != null) {
            SavedCollection savedCollection = (SavedCollection) bundle.getParcelable("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION");
            if (savedCollection != null) {
                String string2 = bundle.getString("prior_module");
                if (string2 == null) {
                    string2 = "";
                }
                return FXL.A00(enumC39551HdN, savedCollection, (EnumC39557HdT) bundle.getSerializable("SaveFragment.ARGUMENT_SAVED_COLLECTION_STARTING_TAB_TYPE", EnumC39557HdT.class), string, string2);
            }
            throw AbstractC166987dD.A14("Saved Feed Collection can't be null");
        }
        throw AbstractC166987dD.A14("SavedFeedMode can't be null");
    }
}
