package X;

/* loaded from: classes4.dex */
public abstract class A2I {
    public static final Integer A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -971609053:
                    if (str.equals("video_call_incoming")) {
                        return C05F.A00;
                    }
                    break;
                case -581010951:
                    if (str.equals("rtc_generic")) {
                        return C05F.A0C;
                    }
                    break;
                case -386351794:
                    if (str.equals("rtc_ring")) {
                        return C05F.A01;
                    }
                    break;
                case 835198941:
                    if (str.equals("video_call_ended")) {
                        return C05F.A0N;
                    }
                    break;
            }
        }
        return C05F.A0Y;
    }
}
