package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.1eO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C31191eO extends AbstractC29011ae implements InterfaceC29031ag {
    public static final C1OZ A09 = new C1OZ() { // from class: X.1eP
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            LCZ.A00(anonymousClass182, (C31191eO) obj);
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return LCZ.parseFromJson(c16l);
        }
    };
    public C9CK A00;
    public AnonymousClass442 A01;
    public C47588Kzy A02;
    public EnumC46200Kcc A03;
    public C7Q4 A04;
    public MessageIdentifier A05;
    public Boolean A06;
    public String A07;
    public boolean A08;

    public C31191eO(C9CK c9ck, AnonymousClass442 anonymousClass442, JTa jTa, C47588Kzy c47588Kzy, EnumC46200Kcc enumC46200Kcc, C7Q4 c7q4, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, Boolean bool, Long l, String str, long j, boolean z) {
        super(jTa, directThreadKey, l, j);
        C18C.A07(c7q4.A06, "Invalid DirectPendingMedia object with null PendingMedia");
        this.A04 = c7q4;
        this.A02 = c47588Kzy;
        this.A03 = enumC46200Kcc;
        this.A06 = bool;
        this.A05 = messageIdentifier;
        this.A01 = anonymousClass442;
        this.A08 = z;
        this.A00 = c9ck;
        this.A07 = str;
    }

    @Override // X.C1OW
    public final String A02() {
        return "configure_media_message";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A01;
    }

    @Override // X.AbstractC29011ae
    public final EnumC46200Kcc A04() {
        EnumC46200Kcc enumC46200Kcc = this.A03;
        if (enumC46200Kcc == null) {
            return EnumC46200Kcc.A04;
        }
        return enumC46200Kcc;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A04;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        if (this.A04.A01 == EnumC40111tc.A09) {
            return C2EY.A0z;
        }
        return C2EY.A1C;
    }

    public C31191eO() {
    }
}
