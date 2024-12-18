package X;

import com.instagram.mediakit.model.MediaKitSectionType;

/* renamed from: X.Ova, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC56115Ova implements InterfaceC66482zP {
    public int A00 = -1;
    public C51850Mvs A01;
    public MediaKitSectionType A02;
    public C56389P2a A03;
    public String A04;
    public String A05;
    public String A06;
    public final C51850Mvs A07;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    @Override // X.InterfaceC66492zQ
    public final boolean isContentSame(Object obj) {
        C51850Mvs c51850Mvs = this.A07;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.mediakit.ui.model.MediaKitSectionModel<*>");
        return C14360o3.A0K(c51850Mvs, ((AbstractC56115Ova) obj).A07);
    }

    public AbstractC56115Ova(C51850Mvs c51850Mvs, C56389P2a c56389P2a) {
        this.A07 = c51850Mvs;
        this.A03 = c56389P2a;
        this.A01 = c51850Mvs;
        this.A05 = c51850Mvs.A03;
        this.A06 = c51850Mvs.A04;
        this.A04 = c51850Mvs.A02;
        this.A02 = c51850Mvs.A01;
    }
}
