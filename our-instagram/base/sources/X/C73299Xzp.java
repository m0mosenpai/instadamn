package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayDeque;

/* renamed from: X.Xzp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73299Xzp {
    public static C73299Xzp A02;
    public C02780Bc A00 = new C02780Bc(new Y9O(this), new Y9P(this));
    public String A01;

    public static synchronized void A00(String str, String str2) {
        synchronized (C73299Xzp.class) {
            C73299Xzp c73299Xzp = A02;
            if (c73299Xzp != null) {
                c73299Xzp.A01 = str2;
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s [productName: %s]", str, str2);
                C02780Bc c02780Bc = c73299Xzp.A00;
                synchronized (c02780Bc) {
                    ArrayDeque arrayDeque = c02780Bc.A05;
                    arrayDeque.add(formatStrLocaleSafe);
                    if (arrayDeque.size() > 3) {
                        arrayDeque.removeFirst();
                    }
                }
            }
        }
    }

    public C73299Xzp() {
        C218914p.A08.A0A(new YEY(this, 0));
        C0BU.A00(new Y9N(this));
    }
}
