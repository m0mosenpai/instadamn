package X;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: X.S9y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62399S9y {
    public static final byte[] A00;
    public static final byte[] A01;
    public static final byte[] A02;
    public static final byte[] A03;
    public static final byte[] A04;
    public static final byte[] A05;

    static {
        Charset charset = StandardCharsets.UTF_8;
        A03 = "psk_id_hash".getBytes(charset);
        A01 = "info_hash".getBytes(charset);
        A04 = "secret".getBytes(charset);
        A02 = "key".getBytes(charset);
        A00 = "base_nonce".getBytes(charset);
        A05 = "exp".getBytes(charset);
    }
}
