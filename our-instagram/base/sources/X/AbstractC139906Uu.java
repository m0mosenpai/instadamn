package X;

import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Map;

/* renamed from: X.6Uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC139906Uu {
    public final String A00;
    public final Map A01;
    public static final java.util.Set A09 = AbstractC16830sb.A07("start", "begin");
    public static final java.util.Set A08 = AbstractC16830sb.A07("finish", "end", "success", RealtimeConstants.SEND_FAIL);
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C206979Ec(this, 32));
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C206979Ec(this, 30));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C206979Ec(this, 31));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C206979Ec(this, 28));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C206979Ec(this, 29));
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C206979Ec(this, 33));

    public AbstractC139906Uu(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }
}
