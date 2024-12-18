package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.LinkWithTextIntf;
import com.instagram.api.schemas.UntaggableReasonIntf;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Evr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33765Evr {
    public static Map A00(UntaggableReasonIntf untaggableReasonIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (untaggableReasonIntf.AYM() != null) {
            LinkWithTextIntf AYM = untaggableReasonIntf.AYM();
            if (AYM != null) {
                treeUpdaterJNI2 = AYM.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("action", treeUpdaterJNI2);
        }
        if (untaggableReasonIntf.getDescription() != null) {
            A1I.put(DevServerEntity.COLUMN_DESCRIPTION, untaggableReasonIntf.getDescription());
        }
        if (untaggableReasonIntf.BDX() != null) {
            LinkWithTextIntf BDX = untaggableReasonIntf.BDX();
            if (BDX != null) {
                treeUpdaterJNI = BDX.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("help_link", treeUpdaterJNI);
        }
        if (untaggableReasonIntf.C51() != null) {
            InstagramProductTaggabilityState C51 = untaggableReasonIntf.C51();
            if (C51 != null) {
                str = C51.A00;
            }
            A1I.put(AbstractC111324zv.A00(538), str);
        }
        if (untaggableReasonIntf.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, untaggableReasonIntf.getTitle());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
