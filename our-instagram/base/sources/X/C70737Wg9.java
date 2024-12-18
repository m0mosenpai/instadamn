package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Wg9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70737Wg9 implements C1EH {
    public static final C70737Wg9 A00 = new C70737Wg9();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        C26087BgG c26087BgG = new C26087BgG((Boolean) null, (Boolean) null, (String) null, (List) null, (DefaultConstructorMarker) null, 15, 11);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for ElectionAddYoursInfo should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -2098301001:
                        if (A0s.equals("title_options")) {
                            ArrayList arrayList = new ArrayList();
                            if (c16l.A11() == C16R.A0C) {
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC65702TsY.A1K(c16l, arrayList);
                                }
                            }
                            c26087BgG.A02 = arrayList;
                            break;
                        }
                        break;
                    case -1114294257:
                        if (A0s.equals("tray_title")) {
                            c26087BgG.A03 = AbstractC65702TsY.A0b(c16l);
                            break;
                        }
                        break;
                    case 642336006:
                        if (A0s.equals("disable_add_yours_button")) {
                            c26087BgG.A00 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                    case 809963074:
                        if (A0s.equals("disable_bottom_sheet")) {
                            c26087BgG.A01 = AbstractC166997dE.A0d(c16l);
                            break;
                        }
                        break;
                }
                C0K8.A0C("ElectionAddYoursInfoJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c26087BgG;
    }
}
