package X;

/* loaded from: classes11.dex */
public abstract class VM5 {
    public static final String A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return "unprepared";
        }
        String A0E = AbstractC65702TsY.A0O(c6fw).A0E();
        if (A0E != null) {
            WYB A00 = AnonymousClass634.A00(c6fg, A0E);
            return A00 != null ? AbstractC68318VMe.A00(A00.A04) : "unprepared";
        }
        throw AbstractC166997dE.A0g();
    }
}
