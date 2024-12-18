package X;

import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hvf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40392Hvf {
    public static Map A00(InterfaceC43542JLc interfaceC43542JLc) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str = null;
        if (interfaceC43542JLc.BSO() != null) {
            TextAppMentionType BSO = interfaceC43542JLc.BSO();
            if (BSO != null) {
                str = BSO.A00;
            }
            A1I.put(AbstractC111324zv.A00(234), str);
        }
        User BSR = interfaceC43542JLc.BSR();
        if (BSR != null) {
            A1I.put(AbstractC43591JPw.A00(173), BSR.A07());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
