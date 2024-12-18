package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextWithEntitiesBlockDictIntf;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Hw3 {
    public static Map A00(TextWithEntitiesBlockDictIntf textWithEntitiesBlockDictIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (textWithEntitiesBlockDictIntf.getBlockType() != null) {
            A1I.put("block_type", textWithEntitiesBlockDictIntf.getBlockType());
        }
        if (textWithEntitiesBlockDictIntf.Awn() != null) {
            A1I.put("depth", textWithEntitiesBlockDictIntf.Awn());
        }
        if (textWithEntitiesBlockDictIntf.C6r() != null) {
            TextWithEntitiesIntf C6r = textWithEntitiesBlockDictIntf.C6r();
            if (C6r != null) {
                treeUpdaterJNI = C6r.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("text_with_entities", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
