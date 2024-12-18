package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* loaded from: classes6.dex */
public final class GWE extends C0YY implements InterfaceC16660sJ {
    public static final GWE A00 = new GWE();

    public GWE() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        DirectShareTarget directShareTarget = (DirectShareTarget) obj;
        C14360o3.A0B(directShareTarget, 0);
        String str = directShareTarget.A0I;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            List A0f = AbstractC31175DnJ.A0f(directShareTarget);
            String username = ((C17E) A0f.get(0)).getUsername();
            int size = A0f.size();
            if (size != 1) {
                return AnonymousClass001.A0b(username, " +", size - 1);
            }
            return username;
        }
        if (str != null) {
            return str;
        }
        return "";
    }
}
