package X;

import java.nio.charset.Charset;

/* renamed from: X.2Tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50462Tq {
    public abstract C50502Tv A02();

    public final C50532Ty A01(CharSequence input, Charset charset) {
        C50502Tv A02 = A02();
        byte[] bytes = input.toString().getBytes(charset);
        bytes.getClass();
        A02.A01(bytes);
        return A02.A03();
    }
}
