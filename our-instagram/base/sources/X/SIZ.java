package X;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes10.dex */
public final class SIZ {
    public static final byte[] A05;
    public static final byte[] A06;
    public static final byte[] A07;
    public static final byte[] A08;
    public static final byte[] A09;
    public static final byte[] A0A;
    public byte[] A00;
    public byte[] A01;
    public byte[] A02;
    public byte[] A03;
    public byte[] A04;

    static {
        Charset charset = StandardCharsets.UTF_8;
        A08 = "psk_id_hash".getBytes(charset);
        A06 = "info_hash".getBytes(charset);
        A09 = "secret".getBytes(charset);
        A07 = "key".getBytes(charset);
        A05 = "base_nonce".getBytes(charset);
        A0A = "exp".getBytes(charset);
    }
}
