package X;

import com.facebook.common.locale.Country;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Uut, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67661Uut extends AbstractC69334Vlg {
    public int A00;
    public String A01;
    public boolean A02;
    public final Country A03;
    public final ImmutableList A04;

    public C67661Uut(Country country, ImmutableList immutableList) {
        super(10);
        if (!immutableList.isEmpty()) {
            this.A03 = country;
            this.A04 = immutableList;
            return;
        }
        throw new IllegalStateException("Must enter at least one option");
    }
}
