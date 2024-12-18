package X;

import java.io.IOException;

/* renamed from: X.Wgr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70778Wgr implements C1EH {
    public static final C70778Wgr A00 = new C70778Wgr();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        C51697MsS c51697MsS = new C51697MsS(1);
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for WordOffset should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1532887371:
                        if (A0s.equals("start_index")) {
                            c51697MsS.A02 = c16l.A1D();
                            break;
                        }
                        break;
                    case -1010839954:
                        if (A0s.equals("end_offset_ms")) {
                            c51697MsS.A01 = c16l.A1D();
                            break;
                        }
                        break;
                    case -32837853:
                        if (A0s.equals("trailing_space")) {
                            c51697MsS.A04 = c16l.A0d();
                            break;
                        }
                        break;
                    case 752192821:
                        if (A0s.equals("start_offset_ms")) {
                            c51697MsS.A03 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1942471790:
                        if (A0s.equals("end_index")) {
                            c51697MsS.A00 = c16l.A1D();
                            break;
                        }
                        break;
                }
                C0K8.A0C("WordOffsetJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c51697MsS;
    }
}
