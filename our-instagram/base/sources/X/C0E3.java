package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.0E3, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0E3 {
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.0QI] */
    public static C0QI A00() {
        ?? obj = new Object();
        obj.A0r = false;
        obj.A0A = 10000L;
        obj.A13 = false;
        obj.A0y = false;
        obj.A0I = "";
        obj.A0Q = false;
        obj.A0R = false;
        obj.A02 = 0;
        obj.A01 = 0;
        obj.A09 = 0L;
        obj.A10 = false;
        obj.A1h = true;
        obj.A1Y = true;
        obj.A0H = 0L;
        obj.A0B = 0L;
        obj.A0Y = false;
        obj.A18 = false;
        obj.A19 = false;
        obj.A1E = false;
        obj.A07 = 0;
        obj.A06 = 0;
        obj.A1D = false;
        obj.A0C = 0L;
        obj.A0E = 0L;
        obj.A0F = 0L;
        obj.A1Q = false;
        obj.A0q = false;
        obj.A11 = false;
        obj.A0x = false;
        obj.A0z = false;
        obj.A1g = false;
        obj.A0M = false;
        obj.A08 = 1800000;
        obj.A0D = 900000L;
        obj.A1B = false;
        obj.A0O = false;
        obj.A0d = false;
        obj.A0s = false;
        obj.A0t = false;
        obj.A15 = false;
        obj.A0S = false;
        obj.A1U = false;
        obj.A0T = false;
        obj.A0U = false;
        obj.A1H = false;
        obj.A1Z = false;
        obj.A17 = false;
        obj.A1b = false;
        obj.A0K = false;
        obj.A14 = false;
        obj.A1i = false;
        obj.A1O = false;
        obj.A1A = false;
        obj.A0G = 50L;
        obj.A0j = false;
        obj.A1I = false;
        obj.A1J = false;
        obj.A0J = "https://lookaside.facebook.com/ras/v2/?id=";
        obj.A1F = false;
        obj.A0N = false;
        obj.A0P = false;
        obj.A12 = false;
        obj.A1W = false;
        obj.A1C = true;
        obj.A1S = false;
        obj.A1R = false;
        obj.A1T = false;
        obj.A0p = false;
        obj.A1e = false;
        obj.A0l = false;
        obj.A05 = 0;
        obj.A1M = false;
        obj.A1L = false;
        obj.A1N = false;
        obj.A1j = false;
        obj.A00 = 0;
        obj.A1G = false;
        obj.A0m = false;
        obj.A0n = false;
        obj.A0o = false;
        obj.A0v = false;
        obj.A0X = false;
        obj.A1c = false;
        obj.A1d = false;
        obj.A1P = false;
        obj.A1a = false;
        obj.A0W = false;
        obj.A1V = false;
        obj.A1X = false;
        obj.A0a = false;
        obj.A0c = false;
        obj.A0u = false;
        obj.A1f = false;
        obj.A1K = false;
        obj.A03 = 0;
        obj.A0Z = false;
        obj.A0w = false;
        obj.A16 = false;
        obj.A0i = false;
        obj.A0g = false;
        obj.A0h = false;
        obj.A0k = false;
        obj.A0f = false;
        obj.A0e = false;
        obj.A0b = false;
        obj.A0L = false;
        obj.A0V = false;
        obj.A04 = 3;
        return obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 942
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public static X.C0QI A01(java.nio.ByteBuffer r33) {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E3.A01(java.nio.ByteBuffer):X.0QI");
    }

    public static String A02(ByteBuffer byteBuffer, Charset charset) {
        int i = byteBuffer.getInt();
        if (byteBuffer.hasArray()) {
            String str = new String(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i, charset);
            byteBuffer.position(byteBuffer.position() + i);
            return str;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new String(bArr, charset);
    }

    public static void A03(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.getInt());
    }
}
