package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hsy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40235Hsy {
    public static Map A00(InterfaceC38601qq interfaceC38601qq) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (interfaceC38601qq.Api() != null) {
            InterfaceC43555JLp Api = interfaceC38601qq.Api();
            if (Api != null) {
                treeUpdaterJNI = Api.F7o();
            }
            A1I.put("comment_sticker_data", treeUpdaterJNI);
        }
        if (interfaceC38601qq.getCtaText() != null) {
            A1I.put("cta_text", interfaceC38601qq.getCtaText());
        }
        if (interfaceC38601qq.BF7() != null) {
            AbstractC37300Gc1.A12(interfaceC38601qq.BF7(), A1I);
        }
        C38321qM BQN = interfaceC38601qq.BQN();
        if (BQN != null) {
            A1I.put("media", BQN.A1D());
        }
        if (interfaceC38601qq.BWb() != null) {
            A1I.put("netego_title", interfaceC38601qq.BWb());
        }
        if (interfaceC38601qq.getSubtitle() != null) {
            A1I.put("subtitle", interfaceC38601qq.getSubtitle());
        }
        if (interfaceC38601qq.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC38601qq.getTitle(), A1I);
        }
        if (interfaceC38601qq.CAR() != null) {
            A1I.put("tracking_token", interfaceC38601qq.CAR());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
