package X;

import com.instagram.model.mapquery.MapQuery;

/* loaded from: classes9.dex */
public final class NUN extends AbstractC65924TwV {
    public MapQuery A00;

    public NUN() {
        super(6);
        this.A00 = new MapQuery("", "", AbstractC167007dF.A0h("CATEGORY"));
    }

    @Override // X.AbstractC65924TwV
    public final boolean equals(Object obj) {
        if ((obj instanceof NUN) && C14360o3.A0K(this.A00, ((NUN) obj).A00)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC65924TwV
    public final int hashCode() {
        return this.A00.hashCode();
    }
}
