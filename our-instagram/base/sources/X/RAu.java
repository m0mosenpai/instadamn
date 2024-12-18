package X;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public final class RAu extends R9U {
    public TIG A00;
    public final RBK A01;
    public final TIG A02;
    public final Enum A03;

    public RAu(RBK rbk, TIG tig) {
        super(null, tig.A00, -1);
        this.A02 = tig;
        this.A01 = rbk;
        this.A03 = tig.A01;
    }
}
