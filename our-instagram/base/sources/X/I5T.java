package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpritesheetInfo;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I5T {
    public static Map A00(QuestionMediaResponseModelIntf questionMediaResponseModelIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (questionMediaResponseModelIntf.BB7() != null) {
            A1I.put("has_audio", questionMediaResponseModelIntf.BB7());
        }
        if (questionMediaResponseModelIntf.getId() != null) {
            AbstractC37300Gc1.A12(questionMediaResponseModelIntf.getId(), A1I);
        }
        ArrayList arrayList = null;
        if (questionMediaResponseModelIntf.BGx() != null) {
            ImageInfo BGx = questionMediaResponseModelIntf.BGx();
            if (BGx != null) {
                treeUpdaterJNI2 = BGx.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            A1I.put("image_versions2", treeUpdaterJNI2);
        }
        if (questionMediaResponseModelIntf.CSN() != null) {
            A1I.put("is_dash_eligible", questionMediaResponseModelIntf.CSN());
        }
        if (questionMediaResponseModelIntf.BRq() != null) {
            AbstractC37300Gc1.A19(questionMediaResponseModelIntf.BRq(), A1I);
        }
        if (questionMediaResponseModelIntf.BZo() != null) {
            A1I.put("original_height", questionMediaResponseModelIntf.BZo());
        }
        if (questionMediaResponseModelIntf.Ba2() != null) {
            A1I.put("original_width", questionMediaResponseModelIntf.Ba2());
        }
        if (questionMediaResponseModelIntf.C8E() != null) {
            SpritesheetInfo C8E = questionMediaResponseModelIntf.C8E();
            if (C8E != null) {
                treeUpdaterJNI = C8E.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("thumbnails", treeUpdaterJNI);
        }
        if (questionMediaResponseModelIntf.getVideoCodec() != null) {
            A1I.put("video_codec", questionMediaResponseModelIntf.getVideoCodec());
        }
        if (questionMediaResponseModelIntf.getVideoDashManifest() != null) {
            A1I.put("video_dash_manifest", questionMediaResponseModelIntf.getVideoDashManifest());
        }
        if (questionMediaResponseModelIntf.CFK() != null) {
            A1I.put("video_path", questionMediaResponseModelIntf.CFK());
        }
        if (questionMediaResponseModelIntf.CFe() != null) {
            List CFe = questionMediaResponseModelIntf.CFe();
            if (CFe != null) {
                arrayList = AbstractC166987dD.A1E();
                Iterator it = CFe.iterator();
                while (it.hasNext()) {
                    AbstractC37303Gc4.A1W(arrayList, it);
                }
            }
            A1I.put("video_versions", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
