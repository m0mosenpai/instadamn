package X;

/* loaded from: classes11.dex */
public final class WSN implements InterfaceC72027XFp {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    @Override // X.InterfaceC72027XFp
    public final InterfaceC71939XBo AL4(C70130W5r c70130W5r) {
        String str = c70130W5r.A0Y;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        return new WSW(c70130W5r.A0Z);
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        return new WSR();
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        return new WSP();
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        return new WSQ();
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        return new WSS(c70130W5r.A0Z);
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        return new WSV(c70130W5r.A0Z);
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        return new WST();
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        return new WSU();
                    }
                    break;
            }
        }
        throw AbstractC167007dF.A0c("Unsupported MIME type: ", str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028 A[RETURN] */
    @Override // X.InterfaceC72027XFp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Au3(X.C70130W5r r5) {
        /*
            r4 = this;
            java.lang.String r3 = r5.A0Y
            if (r3 == 0) goto Ld
            int r0 = r3.hashCode()
            r2 = 2
            r1 = 1
            switch(r0) {
                case -1351681404: goto L14;
                case -1248334819: goto L17;
                case -1026075066: goto L1a;
                case -1004728940: goto L1d;
                case 691401887: goto L20;
                case 822864842: goto L29;
                case 1668750253: goto L2c;
                case 1693976202: goto L2f;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = "Unsupported MIME type: "
            java.lang.IllegalArgumentException r0 = X.AbstractC167007dF.A0c(r0, r3)
            throw r0
        L14:
            java.lang.String r0 = "application/dvbsubs"
            goto L22
        L17:
            java.lang.String r0 = "application/pgs"
            goto L22
        L1a:
            java.lang.String r0 = "application/x-mp4-vtt"
            goto L22
        L1d:
            java.lang.String r0 = "text/vtt"
            goto L31
        L20:
            java.lang.String r0 = "application/x-quicktime-tx3g"
        L22:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld
            return r2
        L29:
            java.lang.String r0 = "text/x-ssa"
            goto L31
        L2c:
            java.lang.String r0 = "application/x-subrip"
            goto L31
        L2f:
            java.lang.String r0 = "application/ttml+xml"
        L31:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Ld
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WSN.Au3(X.W5r):int");
    }

    @Override // X.InterfaceC72027XFp
    public final boolean EpS(C70130W5r c70130W5r) {
        String str = c70130W5r.A0Y;
        if (!C2I7.A00(str, "text/x-ssa") && !C2I7.A00(str, "text/vtt") && !C2I7.A00(str, "application/x-mp4-vtt") && !C2I7.A00(str, "application/x-subrip") && !C2I7.A00(str, "application/x-quicktime-tx3g") && !C2I7.A00(str, "application/pgs") && !C2I7.A00(str, "application/dvbsubs") && !C2I7.A00(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }
}
