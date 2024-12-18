package X;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.PfL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57485PfL extends C0YY implements InterfaceC16820sZ {
    public static final C57485PfL A00 = new C57485PfL();

    public C57485PfL() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        int i;
        String A1I;
        Integer A0i;
        File A11 = AbstractC166987dD.A11("/proc/meminfo");
        Charset charset = C15W.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC57194Pae.A08(A11, charset, new DHH(A1E, 2));
        Iterator it = A1E.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC002300n.A0h(AbstractC167007dF.A0h((String) obj), "memtotal", false)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str = (String) obj;
        if (str != null && (A1I = AbstractC25226BEj.A1I(AbstractC31175DnJ.A0h(str, "\\s+"), 1)) != null && (A0i = AbstractC003100w.A0i(A1I)) != null) {
            i = A0i.intValue();
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
