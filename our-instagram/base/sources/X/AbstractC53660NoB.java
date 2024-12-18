package X;

/* renamed from: X.NoB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53660NoB {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0E;
        String A0G;
        C4RP c4rp;
        float f;
        C4RP c4rp2;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A01 = c6fw.A01();
            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
            C102884kP c102884kP = (C102884kP) A01;
            Object A03 = c6fw.A03(1);
            C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
            String A0E2 = ((C102884kP) A03).A0E();
            if (A0E2 != null) {
                WYB A00 = AnonymousClass634.A00(c6fg, A0E2);
                if (A00 != null && (A0E = c102884kP.A0E()) != null) {
                    switch (A0E.hashCode()) {
                        case -840405966:
                            if (A0E.equals("unmute")) {
                                A0G = c102884kP.A0G();
                                c4rp = A00.A03;
                                if (c4rp != null) {
                                    f = 1.0f;
                                    break;
                                }
                            }
                            break;
                        case 3363353:
                            if (A0E.equals("mute")) {
                                A0G = c102884kP.A0G();
                                c4rp = A00.A03;
                                if (c4rp != null) {
                                    f = 0.0f;
                                    break;
                                }
                            }
                            break;
                        case 3443508:
                            if (A0E.equals("play") && (c4rp2 = A00.A03) != null) {
                                c4rp2.A07();
                                return null;
                            }
                            break;
                        case 106440182:
                            if (A0E.equals("pause")) {
                                String A0G2 = c102884kP.A0G();
                                C4RP c4rp3 = A00.A03;
                                if (c4rp3 != null) {
                                    if (A0G2 == null) {
                                        A0G2 = "player_initiated";
                                    }
                                    C4RP.A01(c4rp3, A0G2, true);
                                    return null;
                                }
                            }
                            break;
                    }
                    if (A0G == null) {
                        A0G = "player_initiated";
                    }
                    c4rp.A0F(A0G, f);
                    return null;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return null;
    }
}
