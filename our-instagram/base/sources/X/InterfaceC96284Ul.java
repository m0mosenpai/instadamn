package X;

/* renamed from: X.4Ul, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC96284Ul {
    public static final InterfaceC96284Ul A00 = new InterfaceC96284Ul() { // from class: X.4Um
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
        /* JADX WARN: Type inference failed for: r0v11, types: [X.4YT, java.lang.Object] */
        @Override // X.InterfaceC96284Ul
        public final C4YT AM1(C4B6 c4b6) {
            String str = c4b6.A0W;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1348231605:
                        if (str.equals("application/x-icy")) {
                            return new RF9();
                        }
                        break;
                    case -1248341703:
                        if (str.equals("application/id3")) {
                            return new RFA();
                        }
                        break;
                    case 1154383568:
                        if (str.equals("application/x-emsg")) {
                            return new Object();
                        }
                        break;
                    case 1652648887:
                        if (str.equals("application/x-scte35")) {
                            return new RF8();
                        }
                        break;
                }
            }
            throw new IllegalArgumentException(AnonymousClass001.A0R("Attempted to create decoder for unsupported MIME type: ", str));
        }

        @Override // X.InterfaceC96284Ul
        public final boolean EpT(C4B6 c4b6) {
            String str = c4b6.A0W;
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str)) {
                return false;
            }
            return true;
        }
    };

    C4YT AM1(C4B6 c4b6);

    boolean EpT(C4B6 c4b6);
}
