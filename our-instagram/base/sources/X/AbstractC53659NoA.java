package X;

/* renamed from: X.NoA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53659NoA {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C4RP c4rp;
        float f;
        C4RP c4rp2;
        C4RP c4rp3;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A03 = c6fw.A03(1);
            C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
            String A0E = ((C102884kP) A03).A0E();
            if (A0E != null) {
                WYB A00 = AnonymousClass634.A00(c6fg, A0E);
                if (A00 != null) {
                    String A0d = AbstractC31177DnL.A0d(c6fw);
                    switch (A0d.hashCode()) {
                        case -840405966:
                            if (A0d.equals("unmute") && (c4rp = A00.A03) != null) {
                                f = 1.0f;
                                break;
                            }
                            break;
                        case 3363353:
                            if (A0d.equals("mute") && (c4rp = A00.A03) != null) {
                                f = 0.0f;
                                break;
                            }
                            break;
                        case 3443508:
                            if (A0d.equals("play") && (c4rp2 = A00.A03) != null) {
                                c4rp2.A07();
                                return null;
                            }
                            break;
                        case 106440182:
                            if (A0d.equals("pause") && (c4rp3 = A00.A03) != null) {
                                C4RP.A01(c4rp3, "player_initiated", true);
                                return null;
                            }
                            break;
                    }
                    c4rp.A0F("player_initiated", f);
                    return null;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return null;
    }
}
