package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CommentPrompt;
import com.instagram.api.schemas.CommentPromptImpl;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.532, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AnonymousClass532 {
    public static Map A01(AnonymousClass520 anonymousClass520) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        if (anonymousClass520.Ape() != null) {
            CommentPrompt Ape = anonymousClass520.Ape();
            if (Ape != null) {
                treeUpdaterJNI = Ape.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            linkedHashMap.put("comment_prompt", treeUpdaterJNI);
        }
        if (anonymousClass520.BeJ() != null) {
            InterfaceC101404gy BeJ = anonymousClass520.BeJ();
            if (BeJ != null) {
                treeUpdaterJNI2 = BeJ.F7o();
            }
            linkedHashMap.put("poll", treeUpdaterJNI2);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnonymousClass520 A00(AnonymousClass520 anonymousClass520, AnonymousClass520 anonymousClass5202) {
        Object obj;
        TreeUpdaterJNI treeUpdaterJNI;
        CommentPrompt Ape = anonymousClass520.Ape();
        InterfaceC101404gy BeJ = anonymousClass520.BeJ();
        if (anonymousClass5202.Ape() != null) {
            Ape = anonymousClass5202.Ape();
        }
        if (anonymousClass5202.BeJ() != null) {
            BeJ = anonymousClass5202.BeJ();
        }
        CommentPromptImpl commentPromptImpl = null;
        TreeUpdaterJNI treeUpdaterJNI2 = null;
        new C1DY((C1DV) new C37761pD(null), 6, false);
        if (anonymousClass520 instanceof AnonymousClass533) {
            TreeUpdaterJNI treeUpdaterJNI3 = TreeUpdaterJNI.$redex_init_class;
            if (Ape != null) {
                treeUpdaterJNI = Ape.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            C09530e4 c09530e4 = new C09530e4("comment_prompt", treeUpdaterJNI);
            if (BeJ != null) {
                treeUpdaterJNI2 = BeJ.F7o();
            }
            TreeJNI treeJNI = (TreeJNI) anonymousClass520;
            Object applyToTree = new TreeUpdaterJNI(AbstractC06930Yk.A06(c09530e4, new C09530e4("poll", treeUpdaterJNI2)), treeJNI).applyToTree(treeJNI);
            C14360o3.A07(applyToTree);
            obj = applyToTree;
        } else {
            C101394gx c101394gx = null;
            C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
            if (Ape != null) {
                commentPromptImpl = Ape.EsS();
            }
            if (BeJ != null) {
                c101394gx = BeJ.F6u(c1dy);
            }
            obj = new C1117351z(commentPromptImpl, c101394gx);
        }
        return (AnonymousClass520) obj;
    }
}
