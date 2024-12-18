package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Gp7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38078Gp7 implements InterfaceC25281Li {
    public final int A00;

    public C38078Gp7(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC25281Li
    public final /* bridge */ /* synthetic */ Object E3T(String str) {
        if (this.A00 != 0) {
            return AbstractC40884I9i.parseFromJson(C16V.A00(str));
        }
        C14360o3.A0B(str, 0);
        C40945IBs parseFromJson = AbstractC40578Hyy.parseFromJson(C16V.A00(str));
        C14360o3.A07(parseFromJson);
        return parseFromJson;
    }

    @Override // X.InterfaceC25281Li
    public final /* bridge */ /* synthetic */ String EOt(Object obj) {
        if (this.A00 != 0) {
            IDZ idz = (IDZ) obj;
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0S = AbstractC167007dF.A0S(A0O);
            if (idz.A00 != null) {
                A0S.A0r("pending_felix_seen_states");
                A0S.A0d();
                Iterator A14 = AbstractC166997dE.A14(idz.A00);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    if (!C16V.A04(A0S, A1K)) {
                        IHP ihp = (IHP) A1K.getValue();
                        A0S.A0d();
                        String str = ihp.A02;
                        if (str != null) {
                            A0S.A0S(TraceFieldType.RequestID, str);
                        }
                        if (ihp.A01 != null) {
                            A0S.A0r("seen_state");
                            AbstractC41369ISw.A00(A0S, ihp.A01);
                        }
                        A0S.A0a();
                    }
                }
                A0S.A0a();
            }
            return AbstractC167017dG.A0l(A0S, A0O);
        }
        C40945IBs c40945IBs = (C40945IBs) obj;
        C14360o3.A0B(c40945IBs, 0);
        StringWriter A0O2 = AbstractC37300Gc1.A0O();
        C17z A0S2 = AbstractC167007dF.A0S(A0O2);
        if (c40945IBs.A00 != null) {
            C16V.A03(A0S2, "gif_tray_saved_gif");
            for (C45026JwH c45026JwH : c40945IBs.A00) {
                if (c45026JwH != null) {
                    AbstractC47868LCo.A00(A0S2, c45026JwH);
                }
            }
            A0S2.A0Z();
        }
        String A0l = AbstractC167017dG.A0l(A0S2, A0O2);
        C14360o3.A07(A0l);
        return A0l;
    }
}
