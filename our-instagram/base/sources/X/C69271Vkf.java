package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vkf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69271Vkf {
    public final C70394WTw A01;
    public final C68678VaE A04;
    public final Map A03 = new HashMap();
    public ArrayList A00 = new ArrayList();
    public final ArrayList A02 = new ArrayList();

    public C69271Vkf(C70394WTw c70394WTw) {
        this.A01 = c70394WTw;
        this.A04 = new C68678VaE(c70394WTw.A0K);
        c70394WTw.A0D = this;
        if (c70394WTw.A0I.A0T) {
            c70394WTw.A06();
        }
        c70394WTw.A06 = new C70380WTi(this);
    }
}
