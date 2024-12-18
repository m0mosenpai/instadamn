package X;

/* renamed from: X.26x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C454026x implements InterfaceC453226p {
    @Override // X.InterfaceC453226p
    public final String ALT(AnonymousClass270 anonymousClass270) {
        StringBuilder sb = new StringBuilder();
        Long l = anonymousClass270.A06;
        if (l != null) {
            long longValue = l.longValue();
            sb.append("delayMillis=");
            sb.append(String.valueOf(longValue));
        }
        String str = anonymousClass270.A09;
        if (str != null) {
            sb.append(" reason=");
            sb.append(str);
        }
        Boolean bool = anonymousClass270.A04;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            sb.append(" isValid=");
            sb.append(String.valueOf(booleanValue));
        }
        String str2 = anonymousClass270.A08;
        if (str2 != null) {
            sb.append(" queueKey=");
            sb.append(str2);
        }
        Boolean bool2 = anonymousClass270.A03;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            sb.append(" isRetry=");
            sb.append(String.valueOf(booleanValue2));
        }
        Boolean bool3 = anonymousClass270.A05;
        if (bool3 != null) {
            boolean booleanValue3 = bool3.booleanValue();
            sb.append(" shouldRetry=");
            sb.append(String.valueOf(booleanValue3));
        }
        C114675Fx c114675Fx = anonymousClass270.A02;
        if (c114675Fx != null) {
            sb.append(" sendError=");
            sb.append(c114675Fx.toString());
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
