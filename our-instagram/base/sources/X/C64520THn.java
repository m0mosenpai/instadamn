package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* renamed from: X.THn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64520THn implements Serializable {
    public final TI2 A00;
    public final InterfaceC65236TgS A01;
    public final AbstractC910944l A02;
    public final JsonDeserializer A03;
    public final C913945y A04;
    public final RBV A05;

    public C64520THn(TI2 ti2, InterfaceC65236TgS interfaceC65236TgS, AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, C913945y c913945y, RBV rbv) {
        this.A02 = abstractC910944l;
        this.A04 = c913945y;
        this.A00 = ti2;
        this.A01 = interfaceC65236TgS;
        this.A03 = jsonDeserializer;
        this.A05 = rbv;
    }
}
