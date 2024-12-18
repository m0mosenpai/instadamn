package X;

import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC29011ae extends C1OW implements InterfaceC29021af, InterfaceC29031ag {
    public long A00;
    public EnumC46200Kcc A01;
    public Long A02;

    @Deprecated
    public String A03;
    public List A04;

    public AnonymousClass442 A03() {
        return null;
    }

    public abstract Object A05();

    @Override // X.C1OW
    public final DirectThreadKey A01() {
        return (DirectThreadKey) this.A04.get(0);
    }

    public EnumC46200Kcc A04() {
        EnumC46200Kcc enumC46200Kcc = this.A01;
        if (enumC46200Kcc == null) {
            return EnumC46200Kcc.A04;
        }
        return enumC46200Kcc;
    }

    public final String A06() {
        String str = this.A03;
        if (str == null) {
            return this.A05;
        }
        return str;
    }

    @Override // X.InterfaceC29021af
    public List C7R() {
        return this.A04;
    }

    public AbstractC29011ae(JTa jTa, DirectThreadKey directThreadKey, Long l, long j) {
        super(jTa);
        this.A04 = Collections.singletonList(directThreadKey);
        this.A02 = l;
        this.A00 = j;
    }

    public AbstractC29011ae() {
    }
}
