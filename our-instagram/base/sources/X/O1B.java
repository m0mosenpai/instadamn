package X;

/* loaded from: classes9.dex */
public abstract class O1B {
    public static String A00 = "";
    public static InterfaceC02550Ad A01;
    public static C0JM A02;
    public static OT4 A03;
    public static O1P A04;
    public static O1P A05;
    public static boolean A06;

    public static final void A00(Integer num, Integer num2) {
        String str;
        String str2;
        C14360o3.A0B(num2, 1);
        if (A06) {
            InterfaceC02550Ad interfaceC02550Ad = A01;
            if (interfaceC02550Ad == null) {
                str2 = "analyticsLogger";
            } else {
                InterfaceC02590Ai A0H = MSY.A0H(interfaceC02550Ad, "avatars_core_experience_immersive_avatar_impression");
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("effect_id", A00);
                switch (num.intValue()) {
                    case 0:
                        str = "view";
                        break;
                    case 1:
                        str = "effect";
                        break;
                    default:
                        str = "glb";
                        break;
                }
                c0Zx.A06("avatar_component", str);
                if (A0H.isSampled()) {
                    A0H.AAQ(c0Zx, "event_data");
                    OT4 ot4 = A03;
                    if (ot4 == null) {
                        str2 = "avatarScubaLoggerSessionId";
                    } else {
                        A0H.AAP(AbstractC111324zv.A00(3982), ot4.A00);
                        if (A02 == null) {
                            str2 = "clock";
                        } else {
                            A0H.A8I(AbstractC43591JPw.A00(137), Double.valueOf(r0.now()));
                            A0H.AAP("product", "editor");
                            A0H.Cht();
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
    }
}
