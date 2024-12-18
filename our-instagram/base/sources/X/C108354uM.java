package X;

/* renamed from: X.4uM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108354uM implements C0IK {
    public static final void A00(int i, String str) {
        C006802i.A0p.markerStart(17631596, i, "function_name", str);
    }

    @Override // X.C0IK
    public final void DRO(C0IG c0ig) {
        Exception exc;
        String str;
        String str2;
        String str3;
        int i = c0ig.A00;
        if (c0ig instanceof C0LF) {
            A00(i, "ConfigureWithMediaCrypto");
            C006802i.A0p.markerAnnotate(17631596, i, "flags", ((C0LF) c0ig).A00);
            return;
        }
        if (!(c0ig instanceof C0L7)) {
            if (c0ig instanceof C0LQ) {
                exc = ((C0LQ) c0ig).A00;
            } else {
                if (c0ig instanceof C04210Kn) {
                    A00(i, "CreateByCodecName");
                    str2 = ((C04210Kn) c0ig).A00;
                    str3 = "codec_name";
                } else if (!(c0ig instanceof C04170Kj)) {
                    if (c0ig instanceof C04220Ko) {
                        exc = ((C04220Ko) c0ig).A00;
                    } else if (c0ig instanceof C0KT) {
                        A00(i, "CreateDecoder");
                        str2 = ((C0KT) c0ig).A00;
                        str3 = "codec_type";
                    } else if (!(c0ig instanceof C0KQ)) {
                        if (c0ig instanceof C0KY) {
                            exc = ((C0KY) c0ig).A00;
                        } else {
                            if (c0ig instanceof C0KO) {
                                A00(i, "CreateEncoder");
                                C006802i.A0p.markerAnnotate(17631596, i, "flags", ((C0KO) c0ig).A00);
                                return;
                            }
                            if (!(c0ig instanceof C0KN)) {
                                if (c0ig instanceof C0KP) {
                                    exc = ((C0KP) c0ig).A00;
                                } else {
                                    if (c0ig instanceof C0KA) {
                                        str = "MediaCodecRelease";
                                    } else if (!(c0ig instanceof C03920Jh)) {
                                        if (c0ig instanceof C0KM) {
                                            exc = ((C0KM) c0ig).A00;
                                        } else if (c0ig instanceof C0JD) {
                                            str = "MediaCodecStart";
                                        } else if (!(c0ig instanceof C0J5)) {
                                            if (c0ig instanceof C0JH) {
                                                exc = ((C0JH) c0ig).A00;
                                            } else if (c0ig instanceof C0IM) {
                                                str = "MediaCodecStop";
                                            } else if (!(c0ig instanceof C0IJ)) {
                                                if (!(c0ig instanceof C03750Iq)) {
                                                    return;
                                                } else {
                                                    exc = ((C03750Iq) c0ig).A00;
                                                }
                                            }
                                        }
                                    }
                                    A00(i, str);
                                    return;
                                }
                            }
                        }
                    }
                }
                C006802i.A0p.markerAnnotate(17631596, i, str3, str2);
                return;
            }
            C006802i c006802i = C006802i.A0p;
            String message = exc.getMessage();
            if (message == null) {
                message = "unknown";
            }
            c006802i.markerAnnotate(17631596, i, "codec_exception", message);
            C006802i.A0p.markerEnd(17631596, i, (short) 3);
            return;
        }
        C006802i.A0p.markerEnd(17631596, i, (short) 2);
    }
}
