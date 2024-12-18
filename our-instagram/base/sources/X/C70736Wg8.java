package X;

import java.io.IOException;

/* renamed from: X.Wg8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70736Wg8 implements C1EH {
    public static final C70736Wg8 A00 = new C70736Wg8();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        C51699MsU c51699MsU = new C51699MsU();
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for AudioMutingInfo should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                Object obj = null;
                switch (A0s.hashCode()) {
                    case -1619042518:
                        if (A0s.equals("mute_reason")) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                obj = EnumC39578Hdo.A01.get(A1P);
                            }
                            c51699MsU.A00 = obj;
                            break;
                        }
                        break;
                    case -330398791:
                        if (A0s.equals("allow_audio_editing")) {
                            c51699MsU.A02 = c16l.A0d();
                            break;
                        }
                        break;
                    case 9716456:
                        if (A0s.equals("show_muted_audio_toast")) {
                            c51699MsU.A04 = c16l.A0d();
                            break;
                        }
                        break;
                    case 87336860:
                        if (A0s.equals("mute_reason_str")) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                c51699MsU.A01 = A1P2;
                                break;
                            }
                        }
                        break;
                    case 1595120176:
                        if (A0s.equals("mute_audio")) {
                            c51699MsU.A03 = c16l.A0d();
                            break;
                        }
                        break;
                }
                C0K8.A0C("AudioMutingInfoJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c51699MsU;
    }
}
