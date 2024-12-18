package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public final class SO1 {
    public final long A00;
    public final android.net.Uri A01;
    public final ImmutableList A02;
    public final List A03;

    @Deprecated
    public final List A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SO1)) {
            return false;
        }
        SO1 so1 = (SO1) obj;
        return this.A01.equals(so1.A01) && this.A03.equals(so1.A03) && this.A02.equals(so1.A02) && Util.A0F(Long.valueOf(this.A00), Long.valueOf(so1.A00));
    }

    public final int hashCode() {
        return (int) ((AbstractC166997dE.A0J(this.A02, AbstractC25225BEi.A05(AbstractC166987dD.A0G(this.A01) * 31 * 31 * 31, this.A03.hashCode())) * 31) + this.A00);
    }

    public SO1(android.net.Uri uri, ImmutableList immutableList, List list) {
        this.A01 = uri;
        this.A03 = list;
        this.A02 = immutableList;
        ImmutableList.Builder builder = ImmutableList.builder();
        if (0 < immutableList.size()) {
            immutableList.get(0);
            throw AbstractC166987dD.A15("buildUpon");
        }
        this.A04 = builder.build();
        this.A00 = -9223372036854775807L;
    }
}
