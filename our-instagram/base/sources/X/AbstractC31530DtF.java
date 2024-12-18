package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DtF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31530DtF {
    public static Map A00(C44Q c44q) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c44q.Ast() != null) {
            C44O Ast = c44q.Ast();
            if (Ast != null) {
                treeUpdaterJNI = Ast.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("creator_broadcast_chat_thread_preview_response", treeUpdaterJNI);
        }
        if (c44q.Asw() != null) {
            A1I.put("creator_igid", c44q.Asw());
        }
        if (c44q.At6() != null) {
            A1I.put("creator_username", c44q.At6());
        }
        if (c44q.BAW() != null) {
            A1I.put("group_image_background_uri", c44q.BAW());
        }
        if (c44q.BAX() != null) {
            A1I.put("group_image_uri", c44q.BAX());
        }
        if (c44q.BJP() != null) {
            A1I.put("invite_link", c44q.BJP());
        }
        if (c44q.CS4() != null) {
            A1I.put("is_creator_verified", c44q.CS4());
        }
        if (c44q.CYK() != null) {
            A1I.put("is_member", c44q.CYK());
        }
        if (c44q.BYF() != null) {
            A1I.put("number_of_members", c44q.BYF());
        }
        if (c44q.Buv() != null) {
            A1I.put("should_badge_channel", c44q.Buv());
        }
        if (c44q.ByH() != null) {
            A1I.put(AbstractC111324zv.A00(526), c44q.ByH());
        }
        if (c44q.ByU() != null) {
            A1I.put(AbstractC111324zv.A00(527), c44q.ByU());
        }
        if (c44q.getSubtitle() != null) {
            A1I.put("subtitle", c44q.getSubtitle());
        }
        if (c44q.C7K() != null) {
            A1I.put("thread_igid", c44q.C7K());
        }
        if (c44q.C7h() != null) {
            A1I.put("thread_subtype", c44q.C7h());
        }
        if (c44q.getTitle() != null) {
            A1I.put(DialogModule.KEY_TITLE, c44q.getTitle());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
