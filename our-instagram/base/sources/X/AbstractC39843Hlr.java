package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CommentGiphyMediaImagesIntf;
import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hlr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39843Hlr {
    public static Map A00(CommentGiphyMediaInfoIntf commentGiphyMediaInfoIntf) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (commentGiphyMediaInfoIntf.B6d() != null) {
            CommentGiphyMediaImagesIntf B6d = commentGiphyMediaInfoIntf.B6d();
            if (B6d != null) {
                treeUpdaterJNI = B6d.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC58317Pt9.A00(102), treeUpdaterJNI);
        }
        if (commentGiphyMediaInfoIntf.B9n() != null) {
            A1I.put("gif_media_id", commentGiphyMediaInfoIntf.B9n());
        }
        if (commentGiphyMediaInfoIntf.BH0() != null) {
            CommentGiphyMediaImagesIntf BH0 = commentGiphyMediaInfoIntf.BH0();
            if (BH0 != null) {
                treeUpdaterJNI2 = BH0.F7o();
            }
            A1I.put("images", treeUpdaterJNI2);
        }
        if (commentGiphyMediaInfoIntf.Cdg() != null) {
            A1I.put("is_sticker", commentGiphyMediaInfoIntf.Cdg());
        }
        if (commentGiphyMediaInfoIntf.getTitle() != null) {
            AbstractC37300Gc1.A17(commentGiphyMediaInfoIntf.getTitle(), A1I);
        }
        if (commentGiphyMediaInfoIntf.getUsername() != null) {
            A1I.put(AbstractC37309GcB.A01(), commentGiphyMediaInfoIntf.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
