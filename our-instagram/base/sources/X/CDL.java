package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteEmojiReactionInfoIntf;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDL {
    public static Map A00(InterfaceC103524lS interfaceC103524lS) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC103524lS.AdU() != null) {
            A1I.put("audience", interfaceC103524lS.AdU());
        }
        if (interfaceC103524lS.Asa() != null) {
            A1I.put("created_at", interfaceC103524lS.Asa());
        }
        ArrayList arrayList = null;
        if (interfaceC103524lS.AvO() != null) {
            NoteCustomTheme AvO = interfaceC103524lS.AvO();
            if (AvO != null) {
                treeUpdaterJNI = AvO.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put(AbstractC111324zv.A00(4234), treeUpdaterJNI);
        }
        List B07 = interfaceC103524lS.B07();
        if (B07 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(B07);
            Iterator it = B07.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC25226BEj.A15(it).A07());
            }
            A1I.put(AbstractC111324zv.A00(208), A0q);
        }
        if (interfaceC103524lS.B3C() != null) {
            A1I.put("expires_at", interfaceC103524lS.B3C());
        }
        if (interfaceC103524lS.BCr() != null) {
            A1I.put(AbstractC111324zv.A00(4557), interfaceC103524lS.BCr());
        }
        if (interfaceC103524lS.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC103524lS.getId());
        }
        if (interfaceC103524lS.getMediaId() != null) {
            A1I.put("media_id", interfaceC103524lS.getMediaId());
        }
        if (interfaceC103524lS.Bkk() != null) {
            List<NoteEmojiReactionInfoIntf> Bkk = interfaceC103524lS.Bkk();
            if (Bkk != null) {
                arrayList = AbstractC166987dD.A1E();
                for (NoteEmojiReactionInfoIntf noteEmojiReactionInfoIntf : Bkk) {
                    if (noteEmojiReactionInfoIntf != null) {
                        arrayList.add(noteEmojiReactionInfoIntf.F7o());
                    }
                }
            }
            A1I.put("reactions", arrayList);
        }
        if (interfaceC103524lS.getText() != null) {
            A1I.put("text", interfaceC103524lS.getText());
        }
        User CDj = interfaceC103524lS.CDj();
        if (CDj != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CDj.A07());
        }
        if (interfaceC103524lS.getUserId() != null) {
            A1I.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, interfaceC103524lS.getUserId());
        }
        if (interfaceC103524lS.CG8() != null) {
            A1I.put(AbstractC58317Pt9.A00(1040), interfaceC103524lS.CG8());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
