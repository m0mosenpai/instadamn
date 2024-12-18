package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W5L {
    public int A00;
    public final Map A01;

    public W5L(Map map) {
        this.A01 = map;
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof W5L) {
                W5L w5l = (W5L) obj;
                if (!C14360o3.A0K(this.A01, w5l.A01) || this.A00 != w5l.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccordionGroup(indexMap=");
        sb.append(this.A01);
        sb.append(", visibleSize=");
        return AbstractC25236BEt.A0Z(sb, this.A00);
    }

    public W5L() {
        this(new LinkedHashMap());
    }
}
