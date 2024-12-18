package X;

/* loaded from: classes11.dex */
public abstract class VQJ {
    public static final String A00(C6FQ c6fq, C6FW c6fw) {
        C68106VBk c68106VBk;
        C4QW c4qw;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            C102884kP A0P = AbstractC65702TsY.A0P(c6fw, 1);
            C147466kW A00 = AbstractC147456kV.A00((C62862tP) c6fg.A02);
            String A0E = A0P.A0E();
            if (A0E != null) {
                C138276Oi A002 = A00.A00(A0E);
                if (A002 == null || (c68106VBk = (C68106VBk) A00.A03.get(A002)) == null || (c4qw = c68106VBk.A02) == null) {
                    return "unprepared";
                }
                int ordinal = ((C4QT) c4qw).A0M.ordinal();
                if (ordinal != 4) {
                    if (ordinal != 3) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                return "unprepared";
                            }
                            return "prepared";
                        }
                        return "attempt_to_play";
                    }
                    L56 l56 = c68106VBk.A01;
                    if ((l56 != null && l56.A02) || c4qw.getCurrentPositionMs() < c4qw.Azm()) {
                        return "playing";
                    }
                    return "playback_complete";
                }
                return "paused";
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
