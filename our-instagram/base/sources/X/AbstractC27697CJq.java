package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.PollType;
import com.instagram.api.schemas.StoryPollColorType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CJq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC27697CJq {
    public static Map A00(InterfaceC101404gy interfaceC101404gy) {
        TreeUpdaterJNI treeUpdaterJNI;
        ArrayList arrayList;
        String str;
        String str2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList2 = null;
        if (interfaceC101404gy.ApJ() != null) {
            StoryPollColorType ApJ = interfaceC101404gy.ApJ();
            if (ApJ != null) {
                str2 = ApJ.A00;
            } else {
                str2 = null;
            }
            A1I.put("color", str2);
        }
        if (interfaceC101404gy.B3B() != null) {
            A1I.put("expires_at", interfaceC101404gy.B3B());
        }
        if (interfaceC101404gy.B6X() != null) {
            A1I.put("finished", interfaceC101404gy.B6X());
        }
        if (interfaceC101404gy.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC101404gy.getId());
        }
        if (interfaceC101404gy.CYz() != null) {
            A1I.put(AbstractC111324zv.A00(4759), interfaceC101404gy.CYz());
        }
        if (interfaceC101404gy.Ccy() != null) {
            A1I.put(AbstractC111324zv.A00(4783), interfaceC101404gy.Ccy());
        }
        if (interfaceC101404gy.getPollId() != null) {
            A1I.put("poll_id", interfaceC101404gy.getPollId());
        }
        if (interfaceC101404gy.BeO() != null) {
            PollType BeO = interfaceC101404gy.BeO();
            if (BeO != null) {
                str = BeO.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(2881), str);
        }
        if (interfaceC101404gy.Bic() != null) {
            List<InterfaceC101384gv> Bic = interfaceC101404gy.Bic();
            if (Bic != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC101384gv interfaceC101384gv : Bic) {
                    if (interfaceC101384gv != null) {
                        arrayList.add(interfaceC101384gv.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(5130), arrayList);
        }
        if (interfaceC101404gy.getQuestion() != null) {
            A1I.put("question", interfaceC101404gy.getQuestion());
        }
        if (interfaceC101404gy.ByI() != null) {
            InterfaceC87503vI ByI = interfaceC101404gy.ByI();
            if (ByI != null) {
                treeUpdaterJNI = ByI.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(5385), treeUpdaterJNI);
        }
        if (interfaceC101404gy.C5D() != null) {
            List<InterfaceC101384gv> C5D = interfaceC101404gy.C5D();
            if (C5D != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (InterfaceC101384gv interfaceC101384gv2 : C5D) {
                    if (interfaceC101384gv2 != null) {
                        arrayList2.add(interfaceC101384gv2.F7o());
                    }
                }
            }
            A1I.put("tallies", arrayList2);
        }
        if (interfaceC101404gy.CA0() != null) {
            A1I.put(AbstractC111324zv.A00(3250), interfaceC101404gy.CA0());
        }
        if (interfaceC101404gy.CG3() != null) {
            A1I.put(AbstractC111324zv.A00(5572), interfaceC101404gy.CG3());
        }
        if (interfaceC101404gy.CGC() != null) {
            A1I.put(AbstractC111324zv.A00(5575), interfaceC101404gy.CGC());
        }
        if (interfaceC101404gy.CGO() != null) {
            A1I.put(AbstractC111324zv.A00(3306), interfaceC101404gy.CGO());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
