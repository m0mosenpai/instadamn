package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GreetingAttachmentIntf;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import com.instagram.api.schemas.OnFeedMessagesIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hqm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40119Hqm {
    public static Map A00(OnFeedMessagesIntf onFeedMessagesIntf) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (onFeedMessagesIntf.Ax8() != null) {
            A1I.put("destinationType", onFeedMessagesIntf.Ax8());
        }
        if (onFeedMessagesIntf.B9e() != null) {
            A1I.put("genericUrl", onFeedMessagesIntf.B9e());
        }
        if (onFeedMessagesIntf.BAJ() != null) {
            A1I.put("greetingText", onFeedMessagesIntf.BAJ());
        }
        if (onFeedMessagesIntf.BDG() != null) {
            A1I.put("headerText", onFeedMessagesIntf.BDG());
        }
        if (onFeedMessagesIntf.BEd() != null) {
            A1I.put(AbstractC111324zv.A00(2471), onFeedMessagesIntf.BEd());
        }
        if (onFeedMessagesIntf.BEe() != null) {
            A1I.put("icebreakerDisclaimerTextFAQsSticker", onFeedMessagesIntf.BEe());
        }
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (onFeedMessagesIntf.BEf() != null) {
            List<IceBreakerMessageIntf> BEf = onFeedMessagesIntf.BEf();
            if (BEf != null) {
                arrayList = AbstractC166987dD.A1E();
                for (IceBreakerMessageIntf iceBreakerMessageIntf : BEf) {
                    if (iceBreakerMessageIntf != null) {
                        arrayList.add(iceBreakerMessageIntf.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("icebreakerMessages", arrayList);
        }
        if (onFeedMessagesIntf.BGY() != null) {
            GreetingAttachmentIntf BGY = onFeedMessagesIntf.BGY();
            if (BGY != null) {
                treeUpdaterJNI = BGY.F7o();
            }
            A1I.put("imageAttachment", treeUpdaterJNI);
        }
        if (onFeedMessagesIntf.BvT() != null) {
            A1I.put("shouldSendAttachment", onFeedMessagesIntf.BvT());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
